package com.example.applesvsoranges.util;

public class Resource<T> {

    private final Status mStatus;
    private final T mData;
    private final String mMessage;


    public Resource(Status status, T data, String message) {
        mStatus = status;
        mData = data;
        mMessage = message;

    }

    public Status getStatus() {
        return mStatus;
    }

    public T getData() {
        return mData;
    }

    public String getMessage() {
        return mMessage;
    }


    public Resource<T> success(T data) {
        return new Resource<T>(Status.SUCCESS, data, null);
    }

    public Resource<T> loading(T data) {
        return new Resource<>(Status.LOADING, data, null);
    }

    public Resource<T> error(String msg) {
        return new Resource<>(Status.ERROR, null, msg);
    }

}


