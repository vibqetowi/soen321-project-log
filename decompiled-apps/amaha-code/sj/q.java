package sj;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.moengage.richnotification.internal.MoERichPushReceiver;
import g0.a;
import hh.g;
import java.util.LinkedHashMap;
/* compiled from: RichPushTimerUtils.kt */
/* loaded from: classes.dex */
public final class q {

    /* compiled from: RichPushTimerUtils.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f31627u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "RichPush_4.3.2_RichPushTimerUtils cancelAlarmIfAny(): ";
        }
    }

    public static final void a(Context context, Bundle bundle, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(bundle, "bundle");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        hh.g gVar = sdkInstance.f20105d;
        hh.g.b(gVar, 0, a.f31627u, 3);
        if (Build.VERSION.SDK_INT >= 24) {
            Object obj = bundle.get("MOE_NOTIFICATION_ID");
            int i6 = bundle.getInt("timerAlarmId");
            hh.g.b(gVar, 0, new s(i6, obj), 3);
            Intent intent = new Intent(context, MoERichPushReceiver.class);
            intent.setFlags(268435456);
            intent.putExtra("MOE_NOTIFICATION_ID", bundle.getInt("MOE_NOTIFICATION_ID"));
            intent.putExtra("timerAlarmId", bundle.getInt("timerAlarmId"));
            intent.putExtra("displayName", bundle.getString("displayName"));
            intent.putExtra("gcm_campaign_id", bundle.getString("gcm_campaign_id"));
            intent.putExtra("moe_app_id", bundle.getString("moe_app_id"));
            intent.setAction("action_timer_on_expiry");
            Object systemService = context.getSystemService("alarm");
            if (systemService != null) {
                ((AlarmManager) systemService).cancel(di.b.k(context, i6, intent));
                int i10 = bundle.getInt("MOE_NOTIFICATION_ID");
                int i11 = bundle.getInt("progressAlarmId");
                hh.g.b(gVar, 0, new r(i10, i11), 3);
                Intent intent2 = new Intent(context, MoERichPushReceiver.class);
                intent2.setFlags(268435456);
                intent2.putExtra("MOE_NOTIFICATION_ID", bundle.getInt("MOE_NOTIFICATION_ID"));
                intent2.putExtra("gcm_campaign_id", bundle.getString("gcm_campaign_id"));
                intent2.putExtra("displayName", bundle.getString("displayName"));
                intent2.putExtra("progressAlarmId", i11);
                intent2.putExtra("moe_app_id", bundle.getString("moe_app_id"));
                intent2.setAction("action_progress_update");
                Object systemService2 = context.getSystemService("alarm");
                if (systemService2 != null) {
                    ((AlarmManager) systemService2).cancel(di.b.k(context, i11, intent2));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
        }
    }

    public static final boolean b(Context context) {
        String str;
        Object obj;
        boolean canScheduleExactAlarms;
        kotlin.jvm.internal.i.g(context, "context");
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            Object obj2 = g0.a.f16164a;
            if (i6 >= 23) {
                obj = a.d.b(context, AlarmManager.class);
            } else {
                if (i6 >= 23) {
                    str = a.d.c(context, AlarmManager.class);
                } else {
                    str = a.h.f16166a.get(AlarmManager.class);
                }
                if (str != null) {
                    obj = context.getSystemService(str);
                } else {
                    obj = null;
                }
            }
            AlarmManager alarmManager = (AlarmManager) obj;
            if (alarmManager != null) {
                canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                return canScheduleExactAlarms;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Context context, ih.p pVar, jj.b metaData, uj.k kVar, uj.o oVar) {
        long j10;
        vj.f fVar;
        vj.f fVar2;
        String str;
        String str2;
        boolean z10;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 24) {
            return;
        }
        f0.t notificationBuilder = metaData.f22067b;
        kotlin.jvm.internal.i.g(notificationBuilder, "notificationBuilder");
        notificationBuilder.j(new f0.u());
        notificationBuilder.h(null);
        notificationBuilder.k(null);
        long j11 = kVar.f34201a;
        notificationBuilder.B = j11;
        if (j11 == -1) {
            hh.g.b(pVar.f20105d, 0, w.f31635u, 3);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() + kVar.f34201a;
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new x(metaData, kVar), 3);
        if (!metaData.f22066a.f28533i.getBoolean("moe_re_notify")) {
            uj.q qVar = (uj.q) oVar;
            if (b(context)) {
                Intent intent = new Intent(context, MoERichPushReceiver.class);
                pj.b bVar = metaData.f22066a;
                Bundle bundle = bVar.f28533i;
                int i10 = metaData.f22068c;
                bundle.putInt("MOE_NOTIFICATION_ID", i10);
                String str3 = qVar.f34212a;
                bundle.putString("displayName", str3);
                intent.setFlags(268435456);
                intent.putExtra("MOE_NOTIFICATION_ID", i10);
                intent.putExtra("timerAlarmId", kVar.f34207h);
                intent.putExtra("displayName", str3);
                intent.putExtra("gcm_campaign_id", bVar.f28527b);
                intent.putExtra("moe_app_id", bVar.f28533i.getString("moe_app_id"));
                intent.setAction("action_timer_on_expiry");
                PendingIntent k10 = di.b.k(context, kVar.f34207h, intent);
                Object systemService = context.getSystemService("alarm");
                if (systemService != null) {
                    ((AlarmManager) systemService).setExactAndAllowWhileIdle(0, currentTimeMillis, k10);
                    g.a.b(0, new v(kVar), 3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
                }
            }
        }
        try {
            if (i6 >= 24) {
                hh.g logger = pVar.f20105d;
                kotlin.jvm.internal.i.g(logger, "logger");
                uj.f fVar3 = oVar.f34215d;
                if (fVar3 == null) {
                    str = null;
                } else {
                    str = fVar3.f34192a;
                }
                uj.h hVar = oVar.f34216e;
                if (hVar == null) {
                    str2 = null;
                } else {
                    str2 = hVar.f34195a;
                }
                if (str != null && str2 != null && (kotlin.jvm.internal.i.b(str, "timerWithProgressbar") || kotlin.jvm.internal.i.b(str2, "timerWithProgressbar"))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (kVar.f34206g == kVar.f - 1) {
                        kVar.f34203c = kVar.f34201a;
                    }
                    g.a.b(0, new y(metaData, kVar), 3);
                    uj.q qVar2 = (uj.q) oVar;
                    if (b(context)) {
                        Intent intent2 = new Intent(context, MoERichPushReceiver.class);
                        pj.b bVar2 = metaData.f22066a;
                        Bundle bundle2 = bVar2.f28533i;
                        int i11 = metaData.f22068c;
                        bundle2.putInt("MOE_NOTIFICATION_ID", i11);
                        String str4 = qVar2.f34212a;
                        bundle2.putString("displayName", str4);
                        bundle2.putInt("current_progress_value", kVar.f34205e + kVar.f34204d);
                        bundle2.putInt("progress_increment_value", kVar.f34204d);
                        j10 = currentTimeMillis;
                        bundle2.putLong("progress_update_interval", kVar.f34203c);
                        bundle2.putInt("max_progress_updates_count", kVar.f);
                        bundle2.putInt("current_progress_updates_count", kVar.f34206g + 1);
                        intent2.setFlags(268435456);
                        intent2.putExtra("MOE_NOTIFICATION_ID", i11);
                        intent2.putExtra("gcm_campaign_id", bVar2.f28527b);
                        intent2.putExtra("displayName", str4);
                        intent2.putExtra("progressAlarmId", kVar.f34208i);
                        intent2.putExtra("moe_app_id", bVar2.f28533i.getString("moe_app_id"));
                        intent2.setAction("action_progress_update");
                        PendingIntent k11 = di.b.k(context, kVar.f34208i, intent2);
                        Object systemService2 = context.getSystemService("alarm");
                        if (systemService2 != null) {
                            ((AlarmManager) systemService2).setExactAndAllowWhileIdle(0, System.currentTimeMillis() + kVar.f34203c, k11);
                            o.f31622a.getClass();
                            LinkedHashMap linkedHashMap = o.f31624c;
                            fVar = (vj.f) linkedHashMap.get((String) pVar.f20102a.f5133c);
                            if (fVar == null) {
                                synchronized (o.class) {
                                    fVar2 = (vj.f) linkedHashMap.get((String) pVar.f20102a.f5133c);
                                    if (fVar2 == null) {
                                        fVar2 = new vj.f(pVar, new wj.b(context, pVar));
                                    }
                                    linkedHashMap.put((String) pVar.f20102a.f5133c, fVar2);
                                }
                                fVar = fVar2;
                            }
                            pj.b campaignPayload = metaData.f22066a;
                            kotlin.jvm.internal.i.g(campaignPayload, "campaignPayload");
                            wj.a aVar2 = fVar.f35238b;
                            fVar.f35240d.getClass();
                            aVar2.a(new mh.e(campaignPayload.f28527b, j10, fj.y.c(campaignPayload.f28533i)));
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
                    }
                }
            }
            wj.a aVar22 = fVar.f35238b;
            fVar.f35240d.getClass();
            aVar22.a(new mh.e(campaignPayload.f28527b, j10, fj.y.c(campaignPayload.f28533i)));
            return;
        } catch (Throwable th2) {
            fVar.f35237a.f20105d.a(1, th2, new vj.e(fVar));
            return;
        }
        j10 = currentTimeMillis;
        o.f31622a.getClass();
        LinkedHashMap linkedHashMap2 = o.f31624c;
        fVar = (vj.f) linkedHashMap2.get((String) pVar.f20102a.f5133c);
        if (fVar == null) {
        }
        pj.b campaignPayload2 = metaData.f22066a;
        kotlin.jvm.internal.i.g(campaignPayload2, "campaignPayload");
    }
}
