package com.theinnerhour.b2b.receiver;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.splash.activity.SplashScreenActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.LogHelper;
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
/* compiled from: V3ActivityNotificationReceiver.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/theinnerhour/b2b/receiver/V3ActivityNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "", "title", "desc", "id", "", "notificationId", "Lhs/k;", "displayNotification", "Landroid/content/Intent;", "intent", "onReceive", "TAG", "Ljava/lang/String;", "", "isFirestoreGoalsExperiment", "Z", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class V3ActivityNotificationReceiver extends BroadcastReceiver {
    private final String TAG = LogHelper.INSTANCE.makeLogTag(V3ActivityNotificationReceiver.class);
    private final boolean isFirestoreGoalsExperiment = b.K();

    private final void displayNotification(Context context, String str, String str2, String str3, int i6) {
        int i10;
        Ringtone ringtone;
        try {
            Intent intent = new Intent(context.getApplicationContext(), SplashScreenActivity.class);
            intent.putExtra(Constants.API_COURSE_LINK, Constants.SCREEN_V3_ACTIVITY);
            intent.putExtra(Constants.GOAL_ID, str3);
            intent.putExtra(Constants.NOTIFICATION_INTENT, true);
            intent.putExtra(Constants.NOTIFICATION_TYPE, Constants.SCREEN_ACTIVITY);
            intent.setAction(String.valueOf(Calendar.getInstance().getTimeInMillis()));
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
            if (i11 <= 23 && (ringtone = RingtoneManager.getRingtone(context, RingtoneManager.getDefaultUri(2))) != null) {
                ringtone.play();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "error in setting notification", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[Catch: Exception -> 0x028e, TryCatch #0 {Exception -> 0x028e, blocks: (B:3:0x0016, B:5:0x0054, B:12:0x0062, B:18:0x006e, B:20:0x0079, B:24:0x0083, B:27:0x008d, B:29:0x0093, B:31:0x00a3, B:54:0x01ae, B:56:0x01b4, B:74:0x01f2, B:76:0x0215, B:78:0x0237, B:79:0x0249, B:81:0x0271, B:63:0x01d0, B:66:0x01d7, B:67:0x01dc, B:73:0x01ee, B:70:0x01e5, B:33:0x00cb, B:35:0x00db, B:37:0x00eb, B:38:0x00fb, B:40:0x010b, B:41:0x011b, B:43:0x012b, B:45:0x0146, B:46:0x0155, B:48:0x015b, B:50:0x0176, B:51:0x0185, B:53:0x01a0), top: B:87:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0215 A[Catch: Exception -> 0x028e, TryCatch #0 {Exception -> 0x028e, blocks: (B:3:0x0016, B:5:0x0054, B:12:0x0062, B:18:0x006e, B:20:0x0079, B:24:0x0083, B:27:0x008d, B:29:0x0093, B:31:0x00a3, B:54:0x01ae, B:56:0x01b4, B:74:0x01f2, B:76:0x0215, B:78:0x0237, B:79:0x0249, B:81:0x0271, B:63:0x01d0, B:66:0x01d7, B:67:0x01dc, B:73:0x01ee, B:70:0x01e5, B:33:0x00cb, B:35:0x00db, B:37:0x00eb, B:38:0x00fb, B:40:0x010b, B:41:0x011b, B:43:0x012b, B:45:0x0146, B:46:0x0155, B:48:0x015b, B:50:0x0176, B:51:0x0185, B:53:0x01a0), top: B:87:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        boolean z10;
        boolean z11;
        String str;
        Object obj;
        String str2;
        String str3;
        long j10;
        String str4;
        Object obj2;
        String str5;
        String str6;
        String str7;
        i.g(context, "context");
        i.g(intent, "intent");
        try {
            String stringExtra = intent.getStringExtra(Constants.GOAL_ID);
            i.d(stringExtra);
            String stringExtra2 = intent.getStringExtra(Constants.GOAL_NAME);
            i.d(stringExtra2);
            String stringExtra3 = intent.getStringExtra(Constants.COURSE_NAME);
            i.d(stringExtra3);
            long longExtra = intent.getLongExtra(Constants.GOAL_SCEHDULE_TIME, Calendar.getInstance().getTimeInMillis());
            String stringExtra4 = intent.getStringExtra(Constants.GOAL_TYPE);
            i.d(stringExtra4);
            String stringExtra5 = intent.getStringExtra(Constants.NOTIFICATION_TITLE);
            String stringExtra6 = intent.getStringExtra(Constants.NOTIFICATION_BODY);
            if (stringExtra5 != null && stringExtra5.length() != 0) {
                z10 = false;
                if (z10) {
                    if (stringExtra6 != null && stringExtra6.length() != 0) {
                        z11 = false;
                        if (z11) {
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getCurrentCourse();
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                if (this.isFirestoreGoalsExperiment) {
                                    if (i.b(stringExtra4, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                                        if (MyApplication.V.a().c().getIsWeeklyGoalIncompleteAndScheduled(stringExtra)) {
                                            str2 = Constants.GOAL_NAME;
                                            str3 = Constants.GOAL_ID;
                                            j10 = longExtra;
                                            str4 = stringExtra2;
                                            obj2 = Constants.GOAL_TYPE_ACTIVITY_WEEKLY;
                                            obj = Constants.GOAL_TYPE_ACTIVITY_ONCE;
                                            displayNotification(context, stringExtra5, stringExtra6, stringExtra, 11221);
                                        } else {
                                            obj = Constants.GOAL_TYPE_ACTIVITY_ONCE;
                                            str2 = Constants.GOAL_NAME;
                                            str3 = Constants.GOAL_ID;
                                            j10 = longExtra;
                                            str4 = stringExtra2;
                                            obj2 = Constants.GOAL_TYPE_ACTIVITY_WEEKLY;
                                        }
                                    } else {
                                        obj = Constants.GOAL_TYPE_ACTIVITY_ONCE;
                                        str2 = Constants.GOAL_NAME;
                                        str3 = Constants.GOAL_ID;
                                        j10 = longExtra;
                                        str4 = stringExtra2;
                                        obj2 = Constants.GOAL_TYPE_ACTIVITY_WEEKLY;
                                        if (i.b(stringExtra4, obj)) {
                                            if (MyApplication.V.a().c().getIsOneTimeGoalIncompleteAndScheduled(stringExtra)) {
                                                displayNotification(context, stringExtra5, stringExtra6, stringExtra, 11221);
                                            }
                                        } else if (MyApplication.V.a().c().getIsDailyGoalIncompleteAndScheduled(stringExtra)) {
                                            displayNotification(context, stringExtra5, stringExtra6, stringExtra, 11221);
                                        }
                                    }
                                } else {
                                    obj = Constants.GOAL_TYPE_ACTIVITY_ONCE;
                                    str2 = Constants.GOAL_NAME;
                                    str3 = Constants.GOAL_ID;
                                    j10 = longExtra;
                                    str4 = stringExtra2;
                                    obj2 = Constants.GOAL_TYPE_ACTIVITY_WEEKLY;
                                    if (i.b(stringExtra4, obj2)) {
                                        GoalHelper goalHelper = new GoalHelper();
                                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                                        if (goalHelper.isWeeklyActivityIncompleteAndScheduled(firebasePersistence.getGoalById(stringExtra, firebasePersistence.getUser().getCurrentCourse()))) {
                                            displayNotification(context, stringExtra5, stringExtra6, stringExtra, 11221);
                                        }
                                    } else if (i.b(stringExtra4, obj)) {
                                        GoalHelper goalHelper2 = new GoalHelper();
                                        FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
                                        if (goalHelper2.isOneTimeActivityIncompleteAndScheduled(firebasePersistence2.getGoalById(stringExtra, firebasePersistence2.getUser().getCurrentCourse()))) {
                                            displayNotification(context, stringExtra5, stringExtra6, stringExtra, 11221);
                                        }
                                    } else {
                                        GoalHelper goalHelper3 = new GoalHelper();
                                        FirebasePersistence firebasePersistence3 = FirebasePersistence.getInstance();
                                        if (goalHelper3.isDailyActivityIncompleteAndScheduled(firebasePersistence3.getGoalById(stringExtra, firebasePersistence3.getUser().getCurrentCourse()))) {
                                            displayNotification(context, stringExtra5, stringExtra6, stringExtra, 11221);
                                        }
                                    }
                                }
                                if (!i.b(stringExtra4, obj)) {
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.setTimeInMillis(j10);
                                    int hashCode = stringExtra4.hashCode();
                                    if (hashCode != -2070778647) {
                                        if (hashCode != -1408757131) {
                                            if (hashCode == 777898929 && stringExtra4.equals(obj2)) {
                                                calendar.add(5, 7);
                                            }
                                        } else if (stringExtra4.equals(Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                                            calendar.add(5, 1);
                                        }
                                        if (ApplicationPersistence.getInstance().getLongValue(stringExtra + '-' + stringExtra3 + "-notification-time") != j10) {
                                            ApplicationPersistence.getInstance().setLongValue(stringExtra + '-' + stringExtra3 + "-notification-time", j10);
                                            if (b.K()) {
                                                v.H(h.c(o0.f23640a), null, 0, new V3ActivityNotificationReceiver$onReceive$4(intent, context, null), 3);
                                            } else {
                                                Utils utils = Utils.INSTANCE;
                                                Context applicationContext = context.getApplicationContext();
                                                i.f(applicationContext, "context.applicationContext");
                                                str5 = stringExtra3;
                                                str7 = str4;
                                                str6 = stringExtra;
                                                utils.updateV3ActivityNotification(applicationContext, true, calendar.getTimeInMillis(), stringExtra4, str6, str7, str5, stringExtra5, stringExtra6);
                                                Bundle bundle = new Bundle();
                                                bundle.putString("miniCourse", str5);
                                                bundle.putString(str3, str6);
                                                bundle.putString(str2, str7);
                                                a.b(bundle, "notification_activity_show");
                                                return;
                                            }
                                        }
                                    } else {
                                        if (!stringExtra4.equals(Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                                            if (ApplicationPersistence.getInstance().getLongValue(stringExtra + '-' + stringExtra3 + "-notification-time") != j10) {
                                            }
                                        }
                                        calendar.add(5, 1);
                                        if (ApplicationPersistence.getInstance().getLongValue(stringExtra + '-' + stringExtra3 + "-notification-time") != j10) {
                                        }
                                    }
                                }
                                str5 = stringExtra3;
                                str6 = stringExtra;
                                str7 = str4;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("miniCourse", str5);
                                bundle2.putString(str3, str6);
                                bundle2.putString(str2, str7);
                                a.b(bundle2, "notification_activity_show");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    if (z11) {
                    }
                } else {
                    return;
                }
            }
            z10 = true;
            if (z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception in setting notification", e10);
        }
    }
}
