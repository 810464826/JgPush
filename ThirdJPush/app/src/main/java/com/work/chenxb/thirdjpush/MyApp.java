package com.work.chenxb.thirdjpush;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * 作者：ChenXb on 2016/9/15.23:51
 * 邮箱：810464826@qq.com
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
