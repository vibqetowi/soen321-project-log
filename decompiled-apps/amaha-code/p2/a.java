package p2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.q;
import g.x;
import v2.i;
import v2.j;
import v2.l;
import w2.f;
/* compiled from: Alarms.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f27868a = q.f("Alarms");

    /* compiled from: Alarms.java */
    /* renamed from: p2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0464a {
        public static void a(AlarmManager alarmManager, int i6, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i6, j10, pendingIntent);
        }
    }

    public static void a(Context context, l lVar, int i6) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = androidx.work.impl.background.systemalarm.a.f3265y;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        androidx.work.impl.background.systemalarm.a.e(intent, lVar);
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 603979776;
        } else {
            i10 = 536870912;
        }
        PendingIntent service = PendingIntent.getService(context, i6, intent, i10);
        if (service != null && alarmManager != null) {
            q d10 = q.d();
            d10.a(f27868a, "Cancelling existing alarm with (workSpecId, systemId) (" + lVar + ", " + i6 + ")");
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, WorkDatabase workDatabase, l lVar, long j10) {
        j r = workDatabase.r();
        i c10 = r.c(lVar);
        if (c10 != null) {
            int i6 = c10.f34717c;
            a(context, lVar, i6);
            c(context, lVar, i6, j10);
            return;
        }
        x xVar = new x(workDatabase);
        Object m10 = ((WorkDatabase) xVar.f16143v).m(new f(0, xVar));
        kotlin.jvm.internal.i.f(m10, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int intValue = ((Number) m10).intValue();
        r.e(new i(lVar.f34722a, lVar.f34723b, intValue));
        c(context, lVar, intValue, j10);
    }

    public static void c(Context context, l lVar, int i6, long j10) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 201326592;
        } else {
            i10 = 134217728;
        }
        String str = androidx.work.impl.background.systemalarm.a.f3265y;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        androidx.work.impl.background.systemalarm.a.e(intent, lVar);
        PendingIntent service = PendingIntent.getService(context, i6, intent, i10);
        if (alarmManager != null) {
            C0464a.a(alarmManager, 0, j10, service);
        }
    }
}
