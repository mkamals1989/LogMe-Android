package com.msk.logmelib;

import android.util.Log;

/**
 * Created by KAMAL on 6/24/2018.
 */

public class LogMe {

    private static  String TAG = "Log_Me";

    public static void setTAG(String TAG) {
        LogMe.TAG = TAG;
    }

    public static void d(String log_message) {
        Log.d(TAG,log_message);
    }

    public static void w(String log_message) {
        Log.w(TAG,log_message);
    }

    public static void v(String log_message) {
        Log.v(TAG,log_message);
    }

    public static void e(String log_message) {
        Log.e(TAG,log_message);
    }

    public static void i(String log_message) {
        Log.i(TAG,log_message);
    }
}
