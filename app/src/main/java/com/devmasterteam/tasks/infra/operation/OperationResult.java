package com.devmasterteam.tasks.infra.operation;

public class OperationResult<T> {

    public static final int NO_ERROR = -1;
    private int mError = NO_ERROR;
    private String mErrorMessage = "";
    private T anonymousType;

    public int getError() {
        return mError;
    }

    public String getmErrorMessage() {
        return mErrorMessage;
    }

    public void setError(int error, String message) {
        this.mError = error;
        this.mErrorMessage = message;

    }

    public T getResult() {
        return anonymousType;
    }

    public void setResult(T anonymousType) {
        this.anonymousType = anonymousType;
    }
}
