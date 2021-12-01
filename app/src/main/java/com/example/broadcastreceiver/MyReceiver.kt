package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.telephony.TelephonyManager
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val extras = intent.extras;
        extras?.let {
            val state = it.getString(TelephonyManager.EXTRA_STATE)

                Toast.makeText(context, state, Toast.LENGTH_SHORT).show()

        }
    }
}
