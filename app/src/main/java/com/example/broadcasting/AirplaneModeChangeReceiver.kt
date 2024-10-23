package com.example.broadcasting

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModelEnabled = intent?.getBooleanExtra("state",false)?:
        return

        if(isAirplaneModelEnabled) {
            Toast.makeText(context,"Airplane Mode is Enabled..",Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context,"Airplane is Disabled",Toast.LENGTH_LONG).show()
        }
    }


}
