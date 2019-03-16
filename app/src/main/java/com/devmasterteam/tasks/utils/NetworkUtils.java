package com.devmasterteam.tasks.utils;

import android.content.Context;
import android.net.ConnectivityManager;

public class NetworkUtils {

    public static Boolean isConnectionAvailable(Context context){
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return manager.getActiveNetworkInfo() != null && manager.getActiveNetworkInfo().isConnectedOrConnecting();
    }

}
