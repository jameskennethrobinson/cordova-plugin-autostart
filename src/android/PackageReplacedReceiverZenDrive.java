
package com.tonikorin.cordova.plugin.autostart;

import com.transistorsoft.cordova.bggeo.BootReceiver;

import android.os.Bundle;
import android.util.Log;
import org.json.JSONArray;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.zendrive.sdk.receiver.WakeupReceiver

 
public class PackageReplacedReceiver extends BroadcastReceiver {
    
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Truckerline", "ZenDrive Package Replaced!!! yba");

        WakeupReceiver wr = new WakeupReceiver();

        wr.onReceive(context, intent)

    }
}
