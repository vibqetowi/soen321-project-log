package com.theinnerhour.b2b.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
/* loaded from: classes2.dex */
public class AudioNotificationDismissService extends Service {
    private String TAG = LogHelper.INSTANCE.makeLogTag(getClass());
    private NotificationManager notificationManager;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            startForeground(1, new Notification());
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i6, int i10) {
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        try {
            NotificationManager notificationManager = this.notificationManager;
            if (notificationManager != null) {
                notificationManager.cancel(Constants.AUDIO_NOTIFICATION_ID);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception in task removed", e10);
        }
    }
}
