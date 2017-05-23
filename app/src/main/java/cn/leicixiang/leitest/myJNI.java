package cn.leicixiang.leitest;

/**
 * Created by leicixiang on 2017/5/23.
 */

public class myJNI {
    static {
        System.loadLibrary("native_lib");
    }

    public static native String sayHello();
}
