package com.devmasterteam.tasks.repository.api;

import com.devmasterteam.tasks.constants.TaskConstants;
import com.devmasterteam.tasks.entities.APIResponse;
import com.devmasterteam.tasks.entities.FullParameters;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

public class ExternalRepository {

    public APIResponse execute(FullParameters parameters) {
        APIResponse response;
        InputStream inputStream;
        HttpURLConnection conn;

        try {
            URL url;
            if (parameters.method.equals(TaskConstants.OPERATION_METHOD.GET)) {
                url = new URL(parameters.url + getQuery(parameters.parameters, parameters.method));
            } else {
                url = new URL(parameters.url);
            }
            conn = (HttpURLConnection) url.openConnection();
            conn.setReadTimeout(100000);
            conn.setConnectTimeout(150000);
            conn.setRequestMethod(parameters.method);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("charset", "utf-8");
            conn.setUseCaches(false);

            if (parameters.headerParameters != null) {
                Iterator it = parameters.headerParameters.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry) it.next();
                    conn.setRequestProperty(pair.getKey().toString(), pair.getValue().toString());
                    it.remove();
                }
            }

            conn.connect();
            if (conn.getResponseCode() == TaskConstants.STATUS_CODE.SUCCESS) {
                inputStream = conn.getInputStream();
                response = new APIResponse(getStringFromInputStream(inputStream), conn.getResponseCode());
            } else {
                inputStream = conn.getErrorStream();
                response = new APIResponse(getStringFromInputStream(inputStream), conn.getResponseCode());
            }

            inputStream.close();
            conn.disconnect();

        } catch (Exception e) {
            response = new APIResponse("", TaskConstants.STATUS_CODE.NOT_FOUND);
        }
        return response;
    }

    private String getStringFromInputStream(InputStream inputStream) {
        if (inputStream == null) {
            return "";
        }

        BufferedReader br;
        StringBuilder builder = new StringBuilder();

        String line;
        try {
            br = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = br.readLine()) != null)
                builder.append(line);

            br.close();

        } catch (Exception e) {
            return "";
        }

        return builder.toString();
    }

    private String getQuery(AbstractMap<String, String> params, String method)
            throws UnsupportedEncodingException {
        if (params == null)
            return "";

        StringBuilder builder = new StringBuilder();
        boolean first = true;

        for (Map.Entry<String, String> e : params.entrySet()) {
            if (first) {
                if (method.equals(TaskConstants.OPERATION_METHOD.GET)) {
                    builder.append("?");
                }
                first = false;
            } else {
                builder.append("&");
            }
            builder.append(URLEncoder.encode(e.getKey(), "UTF-8"));
            builder.append("=");
            builder.append(URLEncoder.encode(e.getValue(), "UTF-8"));
        }
        return builder.toString();
    }

}