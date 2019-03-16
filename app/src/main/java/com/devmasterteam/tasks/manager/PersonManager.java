package com.devmasterteam.tasks.manager;

import android.content.Context;
import android.os.AsyncTask;

import com.devmasterteam.tasks.business.PersonBusiness;
import com.devmasterteam.tasks.infra.operation.OperationListener;
import com.devmasterteam.tasks.infra.operation.OperationResult;

public class PersonManager {

    private PersonBusiness mPersonBusiness;

    public PersonManager(Context context) {
        this.mPersonBusiness = new PersonBusiness(context);
    }

    public void create(String name, String email, String password, final OperationListener listener) {
        AsyncTask<Void, Void, OperationResult<Boolean>> task = new AsyncTask<Void, Void, OperationResult<Boolean>>() {
            @Override
            protected OperationResult<Boolean> doInBackground(Void... voids) {
                return mPersonBusiness.create();
            }

            @Override
            protected void onPostExecute(OperationResult<Boolean> result) {
                int error = result.getError();
                if(error != OperationResult.NO_ERROR){
                    listener.onError(error, result.getmErrorMessage());
                }else {
                    listener.onSuccess(result.getResult());
                }
            }
        };

        //Execute the THREAD
        task.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }
}
