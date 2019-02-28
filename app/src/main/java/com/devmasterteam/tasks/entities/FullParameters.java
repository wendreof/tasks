package com.devmasterteam.tasks.entities;

import java.util.AbstractMap;
import java.util.HashMap;

public class FullParameters {

    public String method;
    public String url;
    public AbstractMap<String, String> headerParameters;
    public AbstractMap<String, String> parameters;

    public FullParameters(String method, String url, HashMap params, HashMap headerParameters){
        this.method = method;
        this.url = url;
        this.parameters = params;
        this.headerParameters = headerParameters;
    }

}
