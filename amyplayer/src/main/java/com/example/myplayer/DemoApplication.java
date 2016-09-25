/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.myplayer;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;

import com.apkfuns.logutils.LogUtils;
import com.lzy.okhttputils.OkHttpUtils;

import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Placeholder application to facilitate overriding Application methods for debugging and testing.
 */
public class DemoApplication extends Application {
    private static OkHttpClient client;

    public static OkHttpClient getClient() {
        return client;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        client = new OkHttpClient.Builder()
                .addInterceptor(new AddHeaderInterceptor(this))
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .build();
    }
    private final class AddHeaderInterceptor implements Interceptor {
        private Context context;

        public AddHeaderInterceptor(Context mContext) {
            this.context = mContext;
        }

        @Override
        public Response intercept(Chain chain) throws IOException {

//            JPushInterface.getRegistrationID(mContext);
//            LogUtils.i("UserAgent"+getUserAgent());
            Locale locale = context.getResources().getConfiguration().locale;
            String language = locale.toString();
            Request request = chain.request();
            request = request.newBuilder()
                    .addHeader("User-Agent", getUserAgent())
//                    .addHeader("User-Agent", "Android")
                    .addHeader("Accept-Language", language)
                    .build();

            Response originalResponse = chain.proceed(request);//原始接口结果
            if (originalResponse.code() == 401) {//如果是401，说明Session过期

            }
            return originalResponse;
        }
    }
    @NonNull
    private static String getUserAgent(){
        StringBuilder result = new StringBuilder(64);
        result.append("Dalvik/");
        result.append(System.getProperty("java.vm.version")); // such as 1.1.0
        result.append(" (Linux; U; Android ");

        String version = Build.VERSION.RELEASE; // "1.0" or "3.4b5"
        result.append(version.length() > 0 ? version : "1.0");
        LogUtils.d("build",Build.BRAND);
        // add the model for the release build
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String brand =Build.BRAND;
            if (brand.length() > 0) {
                result.append("; ");
                result.append(brand);
            }
            String model = Build.MODEL;
            if (model.length() > 0) {
                result.append("; ");
                result.append(model);
            }

        }
        String id = Build.ID; // "MASTER" or "M4-rc20"
        if (id.length() > 0) {
            result.append(" Build/");
            result.append(id);
        }
        result.append(") ShowMuse/"+BuildConfig.VERSION_NAME);
        return result.toString();
    }

//    OkHttpUtils.init(this);
//    try{
//        OkHttpUtils.getInstance()
////                    .addNetworkInterceptor(new StethoInterceptor())
////                    .addInterceptor(new AddHeaderInterceptor(mContext))
//                .setConnectTimeout(OkHttpUtils.DEFAULT_MILLISECONDS)
//                .setReadTimeOut(OkHttpUtils.DEFAULT_MILLISECONDS)
//                .setWriteTimeOut(OkHttpUtils.DEFAULT_MILLISECONDS);
//    }catch (Exception e) {
//        e.printStackTrace();
//    }
}
