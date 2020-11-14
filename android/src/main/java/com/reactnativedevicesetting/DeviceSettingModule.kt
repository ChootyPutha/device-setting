package com.reactnativedevicesetting

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class DeviceSettingModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "DeviceSetting"
    }

    // Example method
    // See https://facebook.github.io/react-native/docs/native-modules-android
    @ReactMethod
    fun multiply(a: Int, b: Int, promise: Promise) {
    
      promise.resolve(a * b)
    
    }


    // this methods are use in react class for  access native process

    //this funtion is used for open device general setting.
    @ReactMethod
    fun openGeneralSetting(){

    }

    //this funtion is used for open device data and wifi setting.
    @ReactMethod
    fun openDataSetting(){

    }

    //this funtion is used for open device location setting.
    @ReactMethod
    fun openLocationSetting(){

    }

    //this funtion is used for open app setting.
    @ReactMethod
    fun openAppSetting(){

    }
    
    //this funtion is used for open airplane setting.
    @ReactMethod
    fun openAirPlaneSetting(){

    }

    //this funtion is used for open add account setting.
    @ReactMethod
    fun openAddAccountSetting(){
      
    }
    
}
