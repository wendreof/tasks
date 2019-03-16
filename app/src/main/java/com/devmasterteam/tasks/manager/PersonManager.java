package com.devmasterteam.tasks.manager;

import android.content.Context;
import android.os.AsyncTask;

import com.devmasterteam.tasks.infra.OperationListener;

public class PersonManager {

    public PersonManager(Context context) {

    }

    public void create(String name, String email, String password, final OperationListener listener) {
        AsyncTask<Void, Void, Boolean> task = new AsyncTask<Void, Void, Boolean>() {
            @Override
            protected Boolean doInBackground(Void... voids) {

                return null;
            }


            @Override
            protected void onPostExecute(Boolean execute) {
                listener.onSuccess();
            }
        };
    }
}
