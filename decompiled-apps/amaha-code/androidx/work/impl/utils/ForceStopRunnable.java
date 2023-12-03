package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import androidx.work.u;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import n2.a0;
import q2.b;
import v2.d;
import v2.l;
import v2.s;
import v2.t;
import w2.m;
import w2.n;
/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: y  reason: collision with root package name */
    public static final String f3311y = q.f("ForceStopRunnable");

    /* renamed from: z  reason: collision with root package name */
    public static final long f3312z = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: u  reason: collision with root package name */
    public final Context f3313u;

    /* renamed from: v  reason: collision with root package name */
    public final a0 f3314v;

    /* renamed from: w  reason: collision with root package name */
    public final m f3315w;

    /* renamed from: x  reason: collision with root package name */
    public int f3316x = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public static final String f3317a = q.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                if (((q.a) q.d()).f3335c <= 2) {
                    Log.v(f3317a, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.c(context);
            }
        }
    }

    public ForceStopRunnable(Context context, a0 a0Var) {
        this.f3313u = context.getApplicationContext();
        this.f3314v = a0Var;
        this.f3315w = a0Var.f25797g;
    }

    public static void c(Context context) {
        int i6;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i6 = 167772160;
        } else {
            i6 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i6);
        long currentTimeMillis = System.currentTimeMillis() + f3312z;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z10;
        WorkDatabase workDatabase;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i6;
        int i10;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        int i11;
        m mVar = this.f3315w;
        int i12 = Build.VERSION.SDK_INT;
        Context context = this.f3313u;
        a0 a0Var = this.f3314v;
        if (i12 >= 23) {
            String str = b.f29115y;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            ArrayList f = b.f(context, jobScheduler);
            ArrayList<String> b10 = a0Var.f25794c.r().b();
            if (f != null) {
                i11 = f.size();
            } else {
                i11 = 0;
            }
            HashSet hashSet = new HashSet(i11);
            if (f != null && !f.isEmpty()) {
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    l g5 = b.g(jobInfo);
                    if (g5 != null) {
                        hashSet.add(g5.f34722a);
                    } else {
                        b.a(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = b10.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        q.d().a(b.f29115y, "Reconciling jobs");
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                workDatabase = a0Var.f25794c;
                workDatabase.c();
                try {
                    t u10 = workDatabase.u();
                    for (String str2 : b10) {
                        u10.d(-1L, str2);
                    }
                    workDatabase.n();
                } finally {
                }
            }
        } else {
            z10 = false;
        }
        workDatabase = a0Var.f25794c;
        t u11 = workDatabase.u();
        v2.q t3 = workDatabase.t();
        workDatabase.c();
        try {
            ArrayList<s> l2 = u11.l();
            if (l2 != null && !l2.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                for (s sVar : l2) {
                    u11.h(u.a.ENQUEUED, sVar.f34734a);
                    u11.d(-1L, sVar.f34734a);
                }
            }
            t3.c();
            workDatabase.n();
            if (!z11 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            Long b11 = a0Var.f25797g.f36306a.q().b("reschedule_needed");
            if (b11 != null && b11.longValue() == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            long j10 = 0;
            String str3 = f3311y;
            if (z13) {
                q.d().a(str3, "Rescheduling Workers.");
                a0Var.i();
                m mVar2 = a0Var.f25797g;
                mVar2.getClass();
                mVar2.f36306a.q().a(new d("reschedule_needed", 0L));
                return;
            }
            try {
                i6 = Build.VERSION.SDK_INT;
                if (i6 >= 31) {
                    i10 = 570425344;
                } else {
                    i10 = 536870912;
                }
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
            } catch (IllegalArgumentException | SecurityException e10) {
                if (((q.a) q.d()).f3335c <= 5) {
                    Log.w(str3, "Ignoring exception", e10);
                }
            }
            if (i6 >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) context.getSystemService(Constants.SCREEN_ACTIVITY)).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long b12 = mVar.f36306a.q().b("last_force_stop_ms");
                    if (b12 != null) {
                        j10 = b12.longValue();
                    }
                    for (int i13 = 0; i13 < historicalProcessExitReasons.size(); i13++) {
                        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) historicalProcessExitReasons.get(i13);
                        reason = applicationExitInfo.getReason();
                        if (reason == 10) {
                            timestamp = applicationExitInfo.getTimestamp();
                            if (timestamp >= j10) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                }
            } else if (broadcast == null) {
                c(context);
                z14 = true;
                if (!z14) {
                    q.d().a(str3, "Application was force-stopped, rescheduling.");
                    a0Var.i();
                    long currentTimeMillis = System.currentTimeMillis();
                    mVar.getClass();
                    mVar.f36306a.q().a(new d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                    return;
                } else if (z12) {
                    q.d().a(str3, "Found unfinished work, scheduling it.");
                    n2.s.a(a0Var.f25793b, a0Var.f25794c, a0Var.f25796e);
                    return;
                } else {
                    return;
                }
            }
            z14 = false;
            if (!z14) {
            }
        } finally {
        }
    }

    public final boolean b() {
        androidx.work.b bVar = this.f3314v.f25793b;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f3311y;
        if (isEmpty) {
            q.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a10 = n.a(this.f3313u, bVar);
        q d10 = q.d();
        d10.a(str, "Is default app process = " + a10);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f3311y;
        a0 a0Var = this.f3314v;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    h.T(this.f3313u);
                    q.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                        int i6 = this.f3316x + 1;
                        this.f3316x = i6;
                        if (i6 < 3) {
                            String str2 = "Retrying after " + (i6 * 300);
                            if (((q.a) q.d()).f3335c <= 3) {
                                Log.d(str, str2, e10);
                            }
                            try {
                                Thread.sleep(this.f3316x * 300);
                            } catch (InterruptedException unused) {
                            }
                        } else {
                            q.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            a0Var.f25793b.getClass();
                            throw illegalStateException;
                        }
                    }
                } catch (SQLiteException e11) {
                    q.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    a0Var.f25793b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            a0Var.h();
        }
    }
}
