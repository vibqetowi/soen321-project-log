package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.Download;
import java.util.List;
/* loaded from: classes2.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final NotificationCompat.Builder notificationBuilder;

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    @Deprecated
    public Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list) {
        return buildProgressNotification(context, i, pendingIntent, str, list, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Notification buildProgressNotification(Context context, int i, PendingIntent pendingIntent, String str, List<Download> list, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        boolean z2;
        float f = 0.0f;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = true;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Download download = list.get(i9);
            int i10 = download.state;
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 5) {
                        z7 = true;
                    } else if (i10 != 7) {
                    }
                }
                float percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z8 = false;
                }
                z6 |= download.getBytesDownloaded() > 0;
                i8++;
                z4 = true;
            } else {
                z5 = true;
            }
        }
        if (z4) {
            i4 = com.google.android.exoplayer2.core.R.string.exo_download_downloading;
        } else if (z5 && i2 != 0) {
            if ((i2 & 2) != 0) {
                i5 = com.google.android.exoplayer2.core.R.string.exo_download_paused_for_wifi;
            } else if ((i2 & 1) != 0) {
                i5 = com.google.android.exoplayer2.core.R.string.exo_download_paused_for_network;
            } else {
                i5 = com.google.android.exoplayer2.core.R.string.exo_download_paused;
            }
            i3 = i5;
            z = false;
            if (z) {
            }
            return buildNotification(context, i, pendingIntent, str, i3, i6, i7, z2, true, false);
        } else if (z7) {
            i4 = com.google.android.exoplayer2.core.R.string.exo_download_removing;
        } else {
            i3 = 0;
            z = true;
            if (z) {
                if (z4) {
                    int i11 = (int) (f / i8);
                    if (z8 && z6) {
                        z3 = true;
                    }
                    i7 = i11;
                    z2 = z3;
                } else {
                    i7 = 0;
                    z2 = true;
                }
                i6 = 100;
            } else {
                i6 = 0;
                i7 = 0;
                z2 = false;
            }
            return buildNotification(context, i, pendingIntent, str, i3, i6, i7, z2, true, false);
        }
        i3 = i4;
        z = true;
        if (z) {
        }
        return buildNotification(context, i, pendingIntent, str, i3, i6, i7, z2, true, false);
    }

    public Notification buildDownloadCompletedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_failed);
    }

    private Notification buildEndStateNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.setSmallIcon(i);
        this.notificationBuilder.setContentTitle(i2 == 0 ? null : context.getResources().getString(i2));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i3, i4, z);
        this.notificationBuilder.setOngoing(z2);
        this.notificationBuilder.setShowWhen(z3);
        return this.notificationBuilder.build();
    }
}
