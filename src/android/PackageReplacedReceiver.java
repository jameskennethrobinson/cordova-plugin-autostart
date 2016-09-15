
package com.tonikorin.cordova.plugin.autostart;

import com.transistorsoft.cordova.bggeo.BootReceiver;

import android.os.Bundle;
import android.util.Log;
import org.json.JSONArray;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

 
public class PackageReplacedReceiver extends BroadcastReceiver {
    
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Truckerline", "Package Replaced!!! yba");

        BootReceiver br = new BootReceiver();

        br.onReceive(context, intent);
    }
}
