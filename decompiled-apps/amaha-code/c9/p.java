package c9;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
/* compiled from: NotificationUtil.java */
/* loaded from: classes.dex */
public final class p {
    public static void a(Context context, String str, int i6, int i10, int i11) {
        if (w.f5205a >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            notificationManager.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i6), i11);
            if (i10 != 0) {
                notificationChannel.setDescription(context.getString(i10));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
