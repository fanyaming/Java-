package com.fym.synchronizeds;

/**
 * Created by lenovo on 2020/3/31.
 */
public class ThreadUtils {
    private ThreadUtils() {
    }
    private static volatile ThreadUtils instance = null;

    public static ThreadUtils getInstance() {
        if (instance == null) {
            synchronized (ThreadUtils.class) {
                if (instance == null) {
                    instance = new ThreadUtils();
                }
            }
        }
        return instance;
    }
}
