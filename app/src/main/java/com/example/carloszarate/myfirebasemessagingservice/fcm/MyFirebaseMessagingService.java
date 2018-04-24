package com.example.carloszarate.myfirebasemessagingservice.fcm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.example.carloszarate.myfirebasemessagingservice.MainActivity;
import com.example.carloszarate.myfirebasemessagingservice.MyNotificationManager;
import com.example.carloszarate.myfirebasemessagingservice.R;
import com.example.carloszarate.myfirebasemessagingservice.model.NotificationData;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class MyFirebaseMessagingService extends FirebaseMessagingService {



    @Override
    public void onMessageReceived(RemoteMessage message) {
        String image = message.getNotification().getIcon();
        String title = message.getNotification().getTitle();
        String body = message.getNotification().getBody();
        String sound = message.getNotification().getSound();

        MyNotificationManager.getmInstance(getApplicationContext())
                .displayNotification(title,body);


    }


}
