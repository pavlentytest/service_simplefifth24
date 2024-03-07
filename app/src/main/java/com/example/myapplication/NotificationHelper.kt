package com.example.myapplication

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import androidx.core.app.NotificationChannelCompat
import androidx.core.app.NotificationCompat

object NotificationHelper {

    private const val CHANNEL_ID = "main"

    fun createNotificationChannel(context: Context) {
        val notificationManager = context.getSystemService(Service.NOTIFICATION_SERVICE) as NotificationManager
        val channel = NotificationChannel(CHANNEL_ID,"Name",NotificationManager.IMPORTANCE_DEFAULT)
        notificationManager.createNotificationChannel(channel)
    }

    fun buildNotification(context: Context) =
        NotificationCompat.Builder(context, CHANNEL_ID)
            .setContentTitle("Header")
            .setContentText("MediaPlayer is running!")
            .setSmallIcon(R.drawable.ic_launcher_background)
            .build()
}