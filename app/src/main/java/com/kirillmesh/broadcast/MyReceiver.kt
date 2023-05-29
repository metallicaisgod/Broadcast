package com.kirillmesh.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(p0: Context?, p1: Intent?) {
        when(p1?.action){

            ACTION_CLICKED -> {
                val count = p1.getIntExtra(CLICK_COUNT, 0)
                Toast.makeText(p0, "Button clicked $count times", Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                Toast.makeText(p0, "Airplane mode changed", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_BATTERY_LOW -> {
                Toast.makeText(p0, "Battery low", Toast.LENGTH_LONG).show()
            }
        }
    }

    companion object{

        const val ACTION_CLICKED = "clicked"
        private const val CLICK_COUNT = "click_count"

        fun createIntent(count: Int): Intent {
            return Intent(ACTION_CLICKED).apply {
                putExtra(CLICK_COUNT, count)
            }
        }

    }

}