package com.kirillmesh.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(p0: Context?, p1: Intent?) {
        when(p1?.action){
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                Toast.makeText(p0, "Airplane mode changed", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_BATTERY_LOW -> {
                Toast.makeText(p0, "Battery low", Toast.LENGTH_LONG).show()
            }
        }
    }
}