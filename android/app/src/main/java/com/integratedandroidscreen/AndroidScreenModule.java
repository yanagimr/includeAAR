package com.integratedandroidscreen;

import java.util.HashMap;
import java.util.Map;

import android.content.Intent;
import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class AndroidScreenModule extends ReactContextBaseJavaModule {

    private static final String REACT_CLASS = "AndroidScreen";
    private final ReactApplicationContext reactApplicationContext;

    public AndroidScreenModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactApplicationContext = reactApplicationContext;
    }

    @Override
    public String getName() {
        return "AndroidScreen";
    }

    @ReactMethod
    public void moveAndroidScreen() throws InterruptedException {
        Intent intent = new Intent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setClassName(reactApplicationContext, "com.example.mylibrary.ModuleActivity");
        reactApplicationContext.startActivity(intent);
    }
}