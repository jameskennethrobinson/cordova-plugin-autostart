package com.tonikorin.cordova.plugin.autostart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;


import com.zendrive.sdk.receiver.WakeupReceiver;
 
public class BootCompletedReceiver extends BroadcastReceiver {
    
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Truckerline", "Wakeup Occured!!! yba");
        
        WakeupReceiver wr = new WakeupReceiver();

        wr.onReceive(context, intent);
    }
}
