package com.eekhout.reporteer.libs.base;

/**
 * Created by Alexander on 27-06-2016.
 */
public interface ImageStorageFinishedListener {
    void onSuccess();
    void onError(String error);
}
