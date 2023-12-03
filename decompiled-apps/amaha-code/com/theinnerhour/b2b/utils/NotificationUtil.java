package com.theinnerhour.b2b.utils;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.theinnerhour.b2b.R;
import f0.s;
import f0.t;
import kotlin.Metadata;
/* compiled from: NotificationUtil.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJt\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/theinnerhour/b2b/utils/NotificationUtil;", "", "Landroid/content/Context;", "context", "", "title", "desc", "notificationTag", "", "notificationId", "channelId", "channelDesc", "channelIdImportance", "Landroid/app/PendingIntent;", "pendingIntent", "visibilityFlag", "category", "", "showSummary", "Lhs/k;", "showNotification", "Landroid/app/Activity;", Constants.SCREEN_ACTIVITY, "cancelNotification", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationUtil {
    private final String TAG = LogHelper.INSTANCE.makeLogTag(NotificationUtil.class);

    public final void cancelNotification(Activity activity, int i6) {
        kotlin.jvm.internal.i.g(activity, "activity");
        Object systemService = activity.getSystemService("notification");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(i6);
    }

    public final void showNotification(Context context, String str, String str2, String str3, int i6, String str4, String str5, int i10, PendingIntent pendingIntent, int i11, String str6, boolean z10) {
        kotlin.jvm.internal.i.g(context, "context");
        try {
            kotlin.jvm.internal.i.d(str4);
            t tVar = new t(context, str4);
            tVar.e(str);
            tVar.d(str2);
            tVar.l("New Message Alert!");
            tVar.D.icon = R.drawable.notifi;
            tVar.f14665j = 4;
            tVar.h(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher));
            tVar.f14677w = i11;
            tVar.g(16, true);
            tVar.f14680z = str4;
            tVar.g(8, true);
            tVar.f14674t = str6;
            s sVar = new s();
            sVar.j(str2);
            tVar.j(sVar);
            tVar.f14670o = Constants.NOTIFICATION_GROUP_COMMON;
            tVar.f14662g = pendingIntent;
            Notification b10 = tVar.b();
            kotlin.jvm.internal.i.f(b10, "builder.setContentTitle(…nt(pendingIntent).build()");
            Object systemService = context.getSystemService("notification");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel(str4, str5, i10));
                notificationManager.createNotificationChannel(new NotificationChannel(Constants.SUMMARY_NOTIFICATION_CHANNEL, "Default", 2));
            }
            notificationManager.notify(str3, i6, b10);
            if (i12 >= 24 && z10) {
                t tVar2 = new t(context.getApplicationContext(), Constants.SUMMARY_NOTIFICATION_CHANNEL);
                tVar2.e("Amaha");
                tVar2.d(str2);
                tVar2.l(str2);
                tVar2.D.icon = R.drawable.notifi;
                tVar2.f14665j = 4;
                tVar2.h(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher));
                tVar2.f14677w = 1;
                tVar2.g(16, true);
                tVar2.f14680z = Constants.SUMMARY_NOTIFICATION_CHANNEL;
                tVar2.f14674t = "reminder";
                s sVar2 = new s();
                sVar2.j(str2);
                tVar2.j(sVar2);
                tVar2.f14670o = Constants.NOTIFICATION_GROUP_COMMON;
                tVar2.f14671p = true;
                tVar2.g(8, true);
                tVar2.f14662g = pendingIntent;
                Notification b11 = tVar2.b();
                kotlin.jvm.internal.i.f(b11, "summaryBuilder.setConten…nt(pendingIntent).build()");
                notificationManager.notify(0, b11);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception in showing notification", e10);
        }
    }
}
