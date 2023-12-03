package com.theinnerhour.b2b.receiver;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.splash.activity.SplashScreenActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationUtilKt;
import com.theinnerhour.b2b.utils.Utils;
import f0.s;
import f0.t;
import gk.a;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.o0;
import sp.b;
import ta.v;
/* compiled from: InnerHourBroadCastReceiver.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/theinnerhour/b2b/receiver/InnerHourBroadCastReceiver;", "Landroid/content/BroadcastReceiver;", "Lgk/a$a;", "Landroid/content/Context;", "context", "", "title", "desc", "id", "", "notificationId", "courseName", "Lhs/k;", "displayNotification", "Landroid/content/Intent;", "intent", "onReceive", "dataLogged", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class InnerHourBroadCastReceiver extends BroadcastReceiver implements a.InterfaceC0251a {
    private final void displayNotification(Context context, String str, String str2, String str3, int i6, String str4) {
        String str5;
        int i10;
        try {
            Intent intent = new Intent(context.getApplicationContext(), SplashScreenActivity.class);
            if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                str5 = Constants.SCREEN_V3_ACTIVITY;
            } else {
                str5 = Constants.SCREEN_NOTIFICATION_ACTIVITY;
            }
            intent.putExtra(Constants.API_COURSE_LINK, str5);
            intent.putExtra(Constants.GOAL_ID, str3);
            intent.putExtra(Constants.NOTIFICATION_INTENT, true);
            intent.putExtra(Constants.NOTIFICATION_TYPE, Constants.SCREEN_ACTIVITY);
            intent.putExtra("course", str4);
            intent.setAction(Long.toString(Calendar.getInstance().getTimeInMillis()));
            Context applicationContext = context.getApplicationContext();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23) {
                i10 = 1140850688;
            } else {
                i10 = 134217728;
            }
            PendingIntent activity = PendingIntent.getActivity(applicationContext, i6, intent, i10);
            t tVar = new t(context.getApplicationContext(), "channel_activity");
            tVar.e(str);
            tVar.d(str2);
            tVar.l(str2);
            tVar.D.icon = R.drawable.ic_stat_notification_amaha;
            tVar.f14665j = 1;
            tVar.h(BitmapFactory.decodeResource(context.getResources(), R.mipmap.ic_launcher));
            tVar.f14677w = 1;
            tVar.g(16, true);
            tVar.f14680z = "channel_activity";
            tVar.f14674t = "reminder";
            s sVar = new s();
            sVar.j(str2);
            tVar.j(sVar);
            tVar.f14670o = Constants.NOTIFICATION_GROUP_COMMON;
            tVar.f14662g = activity;
            Notification b10 = tVar.b();
            i.f(b10, "builder.setContentTitle(…nt(pendingIntent).build()");
            Object systemService = context.getApplicationContext().getSystemService("notification");
            i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (i11 >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("channel_activity", "Activities", 3));
                notificationManager.createNotificationChannel(new NotificationChannel(Constants.SUMMARY_NOTIFICATION_CHANNEL, "Default", 2));
            }
            notificationManager.notify(str3, i6, b10);
            if (i11 >= 24) {
                t tVar2 = new t(context.getApplicationContext(), Constants.SUMMARY_NOTIFICATION_CHANNEL);
                tVar2.e(str);
                tVar2.d(str2);
                tVar2.l(str2);
                tVar2.D.icon = R.drawable.ic_stat_notification_amaha;
                tVar2.f14665j = -1;
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
                tVar2.f14662g = activity;
                Notification b11 = tVar2.b();
                i.f(b11, "summaryBuilder.setConten…nt(pendingIntent).build()");
                notificationManager.notify(0, b11);
            }
            if (i11 <= 23) {
                RingtoneManager.getRingtone(context, RingtoneManager.getDefaultUri(2)).play();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("innerhourbroadcast", "error in setting notification", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0156  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        String str;
        Boolean ANALYTICS_SEND;
        i.g(context, "context");
        i.g(intent, "intent");
        try {
            String stringExtra = intent.getStringExtra(Constants.GOAL_DESC);
            String stringExtra2 = intent.getStringExtra(Constants.GOAL_ID);
            String stringExtra3 = intent.getStringExtra(Constants.COURSE_NAME);
            if (stringExtra != null && stringExtra2 != null && stringExtra3 != null) {
                Bundle extras = intent.getExtras();
                i.d(extras);
                String goalName = extras.getString(Constants.GOAL_NAME, "Amaha");
                i.f(goalName, "goalName");
                String replaceName$default = NotificationUtilKt.replaceName$default(goalName, null, 2, null);
                String replaceName$default2 = NotificationUtilKt.replaceName$default(stringExtra, null, 2, null);
                String stringExtra4 = intent.getStringExtra(Constants.COURSE_NAME);
                i.d(stringExtra4);
                displayNotification(context, replaceName$default, replaceName$default2, stringExtra2, 11221, stringExtra4);
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                long longExtra = intent.getLongExtra(Constants.GOAL_SCEHDULE_TIME, timeInMillis);
                long j10 = longExtra + 86400000;
                ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                if (applicationPersistence.getLongValue(stringExtra2 + '-' + stringExtra3) != longExtra) {
                    ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                    applicationPersistence2.setLongValue(stringExtra2 + '-' + stringExtra3, longExtra);
                    if (b.K()) {
                        v.H(h.c(o0.f23640a), null, 0, new InnerHourBroadCastReceiver$onReceive$1(intent, context, null), 3);
                    } else {
                        Utils utils = Utils.INSTANCE;
                        Context applicationContext = context.getApplicationContext();
                        i.f(applicationContext, "context.applicationContext");
                        long longExtra2 = intent.getLongExtra(Constants.GOAL_START_TIME, timeInMillis);
                        String stringExtra5 = intent.getStringExtra(Constants.GOAL_TYPE);
                        i.d(stringExtra5);
                        str = stringExtra2;
                        Utils.updateActivityNotification$default(utils, applicationContext, true, longExtra2, j10, stringExtra5, str, stringExtra3, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                        Bundle bundle = new Bundle();
                        bundle.putString("course", intent.getStringExtra(Constants.COURSE_NAME));
                        bundle.putString(Constants.GOAL_ID, str);
                        bundle.putString(Constants.GOAL_NAME, stringExtra);
                        bundle.putString("experiment_type", Constants.SCREEN_ACTIVITY);
                        bundle.putString("experiment", ApplicationPersistence.getInstance().getStringValue("an-experiment-".concat(str)));
                        bundle.putString("experiment_key", ApplicationPersistence.getInstance().getStringValue("an-experiment-key-".concat(str)));
                        bundle.putString("receiver", "old");
                        ANALYTICS_SEND = Constants.ANALYTICS_SEND;
                        i.f(ANALYTICS_SEND, "ANALYTICS_SEND");
                        if (!ANALYTICS_SEND.booleanValue()) {
                            try {
                                a.d(bundle, this);
                                return;
                            } catch (Exception e10) {
                                e = e10;
                                LogHelper.INSTANCE.e("innerhourbroadcast", "exception in setting notification", e);
                                return;
                            }
                        }
                        return;
                    }
                }
                str = stringExtra2;
                Bundle bundle2 = new Bundle();
                bundle2.putString("course", intent.getStringExtra(Constants.COURSE_NAME));
                bundle2.putString(Constants.GOAL_ID, str);
                bundle2.putString(Constants.GOAL_NAME, stringExtra);
                bundle2.putString("experiment_type", Constants.SCREEN_ACTIVITY);
                bundle2.putString("experiment", ApplicationPersistence.getInstance().getStringValue("an-experiment-".concat(str)));
                bundle2.putString("experiment_key", ApplicationPersistence.getInstance().getStringValue("an-experiment-key-".concat(str)));
                bundle2.putString("receiver", "old");
                ANALYTICS_SEND = Constants.ANALYTICS_SEND;
                i.f(ANALYTICS_SEND, "ANALYTICS_SEND");
                if (!ANALYTICS_SEND.booleanValue()) {
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    @Override // gk.a.InterfaceC0251a
    public void dataLogged() {
    }
}
