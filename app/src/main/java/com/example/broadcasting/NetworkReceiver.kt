package com.example.broadcasting

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class NetworkReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isConnected = intent?.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false)

        if(isConnected==false) {
            Toast.makeText(context,"Connected to internet",Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context,"No Internet",Toast.LENGTH_LONG).show()
        }
    }
}