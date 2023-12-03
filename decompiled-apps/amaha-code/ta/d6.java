package ta;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.app.AlarmManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.h9;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.v9;
import com.google.firebase.database.core.ServerValues;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import t.g;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class d6 implements f4 {
    public static volatile d6 Z;
    public final f6 A;
    public b3 B;
    public n5 C;
    public l3 E;
    public final y3 F;
    public boolean H;
    public long I;
    public ArrayList J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public FileLock P;
    public FileChannel Q;
    public ArrayList R;
    public ArrayList S;
    public final HashMap U;
    public final HashMap V;
    public z4 W;
    public String X;

    /* renamed from: u  reason: collision with root package name */
    public final r3 f32530u;

    /* renamed from: v  reason: collision with root package name */
    public final b3 f32531v;

    /* renamed from: w  reason: collision with root package name */
    public k f32532w;

    /* renamed from: x  reason: collision with root package name */
    public d3 f32533x;

    /* renamed from: y  reason: collision with root package name */
    public w5 f32534y;

    /* renamed from: z  reason: collision with root package name */
    public b f32535z;
    public boolean G = false;
    public final a6 Y = new a6(this);
    public long T = -1;
    public final z5 D = new z5(this);

    public d6(e6 e6Var) {
        this.F = y3.s(e6Var.f32549a, null, null);
        f6 f6Var = new f6(this);
        f6Var.j();
        this.A = f6Var;
        b3 b3Var = new b3(this, 0);
        b3Var.j();
        this.f32531v = b3Var;
        r3 r3Var = new r3(this);
        r3Var.j();
        this.f32530u = r3Var;
        this.U = new HashMap();
        this.V = new HashMap();
        a().p(new androidx.work.n(this, e6Var, 21));
    }

    public static final boolean G(m6 m6Var) {
        if (TextUtils.isEmpty(m6Var.f32749v) && TextUtils.isEmpty(m6Var.K)) {
            return false;
        }
        return true;
    }

    public static final void H(y5 y5Var) {
        if (y5Var != null) {
            if (y5Var.f32959w) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(y5Var.getClass())));
        }
        throw new IllegalStateException("Upload Component not created");
    }

    public static d6 N(Context context) {
        v9.o.h(context);
        v9.o.h(context.getApplicationContext());
        if (Z == null) {
            synchronized (d6.class) {
                if (Z == null) {
                    Z = new d6(new e6(context));
                }
            }
        }
        return Z;
    }

    public static final void w(com.google.android.gms.internal.measurement.l2 l2Var, int i6, String str) {
        List q10 = l2Var.q();
        for (int i10 = 0; i10 < q10.size(); i10++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.q2) q10.get(i10)).A())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.p2 y10 = com.google.android.gms.internal.measurement.q2.y();
        y10.l("_err");
        y10.k(Long.valueOf(i6).longValue());
        com.google.android.gms.internal.measurement.p2 y11 = com.google.android.gms.internal.measurement.q2.y();
        y11.l("_ev");
        y11.i();
        com.google.android.gms.internal.measurement.q2.E((com.google.android.gms.internal.measurement.q2) y11.f8613v, str);
        l2Var.i();
        com.google.android.gms.internal.measurement.m2.E((com.google.android.gms.internal.measurement.m2) l2Var.f8613v, (com.google.android.gms.internal.measurement.q2) y10.f());
        l2Var.i();
        com.google.android.gms.internal.measurement.m2.E((com.google.android.gms.internal.measurement.m2) l2Var.f8613v, (com.google.android.gms.internal.measurement.q2) y11.f());
    }

    public static final void x(com.google.android.gms.internal.measurement.l2 l2Var, String str) {
        List q10 = l2Var.q();
        for (int i6 = 0; i6 < q10.size(); i6++) {
            if (str.equals(((com.google.android.gms.internal.measurement.q2) q10.get(i6)).A())) {
                l2Var.i();
                com.google.android.gms.internal.measurement.m2.H((com.google.android.gms.internal.measurement.m2) l2Var.f8613v, i6);
                return;
            }
        }
    }

    public final void A() {
        a().h();
        if (!this.M && !this.N && !this.O) {
            b().H.b("Stopping uploading service(s)");
            ArrayList arrayList = this.J;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ArrayList arrayList2 = this.J;
            v9.o.h(arrayList2);
            arrayList2.clear();
            return;
        }
        w2 b10 = b();
        b10.H.e("Not stopping services. fetch, network, upload", Boolean.valueOf(this.M), Boolean.valueOf(this.N), Boolean.valueOf(this.O));
    }

    public final void B(com.google.android.gms.internal.measurement.u2 u2Var, long j10, boolean z10) {
        String str;
        i6 i6Var;
        String str2;
        Object obj;
        if (true != z10) {
            str = "_lte";
        } else {
            str = "_se";
        }
        k kVar = this.f32532w;
        H(kVar);
        i6 G = kVar.G(u2Var.q(), str);
        if (G != null && (obj = G.f32635e) != null) {
            String q10 = u2Var.q();
            ((kotlin.jvm.internal.b0) c()).getClass();
            i6Var = new i6(q10, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j10));
        } else {
            String q11 = u2Var.q();
            ((kotlin.jvm.internal.b0) c()).getClass();
            i6Var = new i6(q11, "auto", str, System.currentTimeMillis(), Long.valueOf(j10));
        }
        com.google.android.gms.internal.measurement.d3 x10 = com.google.android.gms.internal.measurement.e3.x();
        x10.i();
        com.google.android.gms.internal.measurement.e3.C((com.google.android.gms.internal.measurement.e3) x10.f8613v, str);
        ((kotlin.jvm.internal.b0) c()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        x10.i();
        com.google.android.gms.internal.measurement.e3.B((com.google.android.gms.internal.measurement.e3) x10.f8613v, currentTimeMillis);
        Object obj2 = i6Var.f32635e;
        long longValue = ((Long) obj2).longValue();
        x10.i();
        com.google.android.gms.internal.measurement.e3.F((com.google.android.gms.internal.measurement.e3) x10.f8613v, longValue);
        com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) x10.f();
        int u10 = f6.u(u2Var, str);
        if (u10 >= 0) {
            u2Var.i();
            com.google.android.gms.internal.measurement.v2.A0((com.google.android.gms.internal.measurement.v2) u2Var.f8613v, u10, e3Var);
        } else {
            u2Var.i();
            com.google.android.gms.internal.measurement.v2.B0((com.google.android.gms.internal.measurement.v2) u2Var.f8613v, e3Var);
        }
        if (j10 > 0) {
            k kVar2 = this.f32532w;
            H(kVar2);
            kVar2.s(i6Var);
            if (true != z10) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            b().H.d("Updated engagement user property. scope, value", str2, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0352 A[Catch: IllegalAccessException | InvocationTargetException -> 0x0356, IllegalAccessException -> 0x0358, TRY_LEAVE, TryCatch #3 {IllegalAccessException | InvocationTargetException -> 0x0356, blocks: (B:103:0x0338, B:105:0x0352), top: B:128:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        boolean z10;
        boolean z11;
        long max;
        long max2;
        long j10;
        int checkSelfPermission;
        Integer num;
        int intValue;
        Integer num2;
        boolean z12;
        boolean z13;
        a().h();
        g();
        if (this.I > 0) {
            ((kotlin.jvm.internal.b0) c()).getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.I);
            if (abs > 0) {
                b().H.c(Long.valueOf(abs), "Upload has been suspended. Will update scheduling later in approximately ms");
                M().a();
                w5 w5Var = this.f32534y;
                H(w5Var);
                w5Var.l();
                return;
            }
            this.I = 0L;
        }
        if (this.F.h() && E()) {
            ((kotlin.jvm.internal.b0) c()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            J();
            long max3 = Math.max(0L, ((Long) j2.A.a(null)).longValue());
            k kVar = this.f32532w;
            H(kVar);
            if (kVar.v("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                k kVar2 = this.f32532w;
                H(kVar2);
                if (kVar2.v("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    z11 = false;
                    if (!z11) {
                        String i6 = J().i("debug.firebase.analytics.app");
                        if (!TextUtils.isEmpty(i6) && !".none.".equals(i6)) {
                            J();
                            max = Math.max(0L, ((Long) j2.f32672v.a(null)).longValue());
                        } else {
                            J();
                            max = Math.max(0L, ((Long) j2.f32671u.a(null)).longValue());
                        }
                    } else {
                        J();
                        max = Math.max(0L, ((Long) j2.f32670t.a(null)).longValue());
                    }
                    long a102 = this.C.A.a();
                    long a112 = this.C.B.a();
                    k kVar32 = this.f32532w;
                    H(kVar32);
                    long x102 = kVar32.x("select max(bundle_end_timestamp) from queue", null, 0L);
                    k kVar42 = this.f32532w;
                    H(kVar42);
                    long j112 = max;
                    max2 = Math.max(x102, kVar42.x("select max(timestamp) from raw_events", null, 0L));
                    f6 f6Var2 = this.A;
                    if (max2 != 0) {
                        long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                        long abs3 = Math.abs(a102 - currentTimeMillis);
                        long abs4 = currentTimeMillis - Math.abs(a112 - currentTimeMillis);
                        long max4 = Math.max(currentTimeMillis - abs3, abs4);
                        long j12 = max3 + abs2;
                        if (z11 && max4 > 0) {
                            j12 = Math.min(abs2, max4) + j112;
                        }
                        H(f6Var2);
                        if (!f6Var2.H(max4, j112)) {
                            j10 = max4 + j112;
                        } else {
                            j10 = j12;
                        }
                        if (abs4 != 0 && abs4 >= abs2) {
                            int i10 = 0;
                            while (true) {
                                J();
                                if (i10 >= Math.min(20, Math.max(0, ((Integer) j2.C.a(null)).intValue()))) {
                                    break;
                                }
                                J();
                                j10 += Math.max(0L, ((Long) j2.B.a(null)).longValue()) * (1 << i10);
                                if (j10 > abs4) {
                                    break;
                                }
                                i10++;
                            }
                        }
                        if (j10 != 0) {
                            b3 b3Var = this.f32531v;
                            H(b3Var);
                            if (b3Var.g()) {
                                long a12 = this.C.f32772z.a();
                                J();
                                long max5 = Math.max(0L, ((Long) j2.r.a(null)).longValue());
                                H(f6Var2);
                                if (!f6Var2.H(a12, max5)) {
                                    j10 = Math.max(j10, a12 + max5);
                                }
                                M().a();
                                ((kotlin.jvm.internal.b0) c()).getClass();
                                long currentTimeMillis2 = j10 - System.currentTimeMillis();
                                if (currentTimeMillis2 <= 0) {
                                    J();
                                    currentTimeMillis2 = Math.max(0L, ((Long) j2.f32673w.a(null)).longValue());
                                    g3 g3Var = this.C.A;
                                    ((kotlin.jvm.internal.b0) c()).getClass();
                                    g3Var.b(System.currentTimeMillis());
                                }
                                b().H.c(Long.valueOf(currentTimeMillis2), "Upload scheduled in approximately ms");
                                w5 w5Var2 = this.f32534y;
                                H(w5Var2);
                                w5Var2.i();
                                y3 y3Var = w5Var2.f32943u;
                                y3Var.getClass();
                                Context context = y3Var.f32953u;
                                boolean U = k6.U(context);
                                w2 w2Var = y3Var.C;
                                if (!U) {
                                    y3.k(w2Var);
                                    w2Var.G.b("Receiver not registered/enabled");
                                }
                                if (!k6.V(context)) {
                                    y3.k(w2Var);
                                    w2Var.G.b("Service not registered/enabled");
                                }
                                w5Var2.l();
                                y3.k(w2Var);
                                w2Var.H.c(Long.valueOf(currentTimeMillis2), "Scheduling upload, millis");
                                y3Var.H.getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime() + currentTimeMillis2;
                                if (currentTimeMillis2 < Math.max(0L, ((Long) j2.f32674x.a(null)).longValue())) {
                                    if (w5Var2.o().f32738c != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        w5Var2.o().c(currentTimeMillis2);
                                    }
                                }
                                if (Build.VERSION.SDK_INT >= 24) {
                                    ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                                    int m10 = w5Var2.m();
                                    PersistableBundle persistableBundle = new PersistableBundle();
                                    persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                                    JobInfo build = new JobInfo.Builder(m10, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build();
                                    Method method = com.google.android.gms.internal.measurement.e0.f8347a;
                                    JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                                    jobScheduler.getClass();
                                    Method method2 = com.google.android.gms.internal.measurement.e0.f8347a;
                                    if (method2 != null) {
                                        checkSelfPermission = context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS");
                                        if (checkSelfPermission == 0) {
                                            Method method3 = com.google.android.gms.internal.measurement.e0.f8348b;
                                            try {
                                                if (method3 != null) {
                                                    try {
                                                        num = (Integer) method3.invoke(UserHandle.class, new Object[0]);
                                                    } catch (IllegalAccessException | InvocationTargetException e10) {
                                                        if (Log.isLoggable("JobSchedulerCompat", 6)) {
                                                            Log.e("JobSchedulerCompat", "myUserId invocation illegal", e10);
                                                        }
                                                    }
                                                    if (num != null) {
                                                        intValue = num.intValue();
                                                        num2 = (Integer) method2.invoke(jobScheduler, build, "com.google.android.gms", Integer.valueOf(intValue), "UploadAlarm");
                                                        if (num2 == null) {
                                                            num2.intValue();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                num2 = (Integer) method2.invoke(jobScheduler, build, "com.google.android.gms", Integer.valueOf(intValue), "UploadAlarm");
                                                if (num2 == null) {
                                                }
                                            } catch (IllegalAccessException | InvocationTargetException e11) {
                                                Log.e("UploadAlarm", "error calling scheduleAsPackage", e11);
                                                jobScheduler.schedule(build);
                                                return;
                                            }
                                            intValue = 0;
                                        }
                                    }
                                    jobScheduler.schedule(build);
                                    return;
                                }
                                AlarmManager alarmManager = w5Var2.f32933x;
                                if (alarmManager != null) {
                                    alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) j2.f32669s.a(null)).longValue(), currentTimeMillis2), w5Var2.n());
                                    return;
                                }
                                return;
                            }
                            b().H.b("No network");
                            d3 M = M();
                            d6 d6Var = M.f32518a;
                            d6Var.g();
                            d6Var.a().h();
                            if (!M.f32519b) {
                                d6Var.F.f32953u.registerReceiver(M, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                b3 b3Var2 = d6Var.f32531v;
                                H(b3Var2);
                                M.f32520c = b3Var2.g();
                                d6Var.b().H.c(Boolean.valueOf(M.f32520c), "Registering connectivity change receiver. Network connected");
                                M.f32519b = true;
                            }
                            w5 w5Var3 = this.f32534y;
                            H(w5Var3);
                            w5Var3.l();
                            return;
                        }
                        b().H.b("Next upload time is 0");
                        M().a();
                        w5 w5Var4 = this.f32534y;
                        H(w5Var4);
                        w5Var4.l();
                        return;
                    }
                    j10 = 0;
                    if (j10 != 0) {
                    }
                }
            }
            z11 = true;
            if (!z11) {
            }
            long a1022 = this.C.A.a();
            long a1122 = this.C.B.a();
            k kVar322 = this.f32532w;
            H(kVar322);
            long x1022 = kVar322.x("select max(bundle_end_timestamp) from queue", null, 0L);
            k kVar422 = this.f32532w;
            H(kVar422);
            long j1122 = max;
            max2 = Math.max(x1022, kVar422.x("select max(timestamp) from raw_events", null, 0L));
            f6 f6Var22 = this.A;
            if (max2 != 0) {
            }
            j10 = 0;
            if (j10 != 0) {
            }
        } else {
            b().H.b("Nothing to upload or uploading impossible");
            M().a();
            w5 w5Var5 = this.f32534y;
            H(w5Var5);
            w5Var5.l();
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:664)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:522)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:365)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:313)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Can't wrap try/catch for region: R(34:(2:321|(54:325|326|327|(1:329)|330|(3:332|(1:334)(9:1263|(1:1265)|1266|1267|1268|1269|1270|(3:1276|(1:1280)|1281)(1:1274)|1275)|335)(1:1290)|(11:337|338|339|340|341|342|343|344|345|346|(3:347|348|(4:350|351|352|(1:355)(1:354))(1:361)))(0)|373|(14:376|377|378|380|381|382|(3:384|385|386)|389|390|391|392|(4:394|395|396|398)(1:401)|399|374)|408|409|(2:410|(2:412|(2:414|415))(2:1261|1262))|416|(10:1238|1239|1240|1241|1242|1243|1244|1245|1246|1247)(1:418)|419|420|(1:1237)(10:423|424|425|426|427|428|430|431|432|(38:(9:434|435|436|437|438|439|(1:441)(3:1201|(2:1203|1204)(1:1206)|1205)|442|(1:445)(1:444))|446|447|448|449|450|451|(3:453|454|455)(4:1153|(9:1154|1155|1156|1157|1158|1159|1160|1161|(1:1164)(1:1163))|1165|1166)|456|457|(1:459)(5:961|(11:963|964|965|966|967|968|(3:(3:970|(1:972)|973)|975|976)(1:1136)|977|978|(3:1074|(6:1077|(3:1082|(4:1084|(7:1086|(4:1089|(2:1091|1092)(1:1094)|1093|1087)|1095|1096|(4:1099|(3:1101|1102|1103)(1:1105)|1104|1097)|1106|1107)(6:1111|(4:1114|(2:1116|1117)(1:1119)|1118|1112)|1120|1121|(4:1124|(2:1126|1127)(1:1129)|1128|1122)|1130)|1108|1109)(2:1131|1132)|1110)|1133|1134|1110|1075)|1135)|980)(1:1151)|981|(13:984|(3:989|(4:992|(6:994|995|(1:997)(1:1002)|998|999|1000)(1:1003)|1001|990)|1004)|1005|1006|(3:1011|(4:1014|(2:1019|1020)(3:1022|1023|1024)|1021|1012)|1026)|1027|(3:1029|(6:1032|(2:1034|(3:1036|1037|1038))(1:1041)|1039|1040|1038|1030)|1042)|1043|1044|(3:1054|(8:1057|(1:1059)|1060|(1:1062)|1063|(3:1065|1066|1067)(1:1069)|1068|1055)|1070)|1071|1072|982)|1073)|460|461|(3:843|(4:846|(9:848|(1:850)(1:957)|851|(10:853|854|855|856|857|858|(2:(12:860|861|862|864|865|866|867|(3:869|870|871)(1:924)|872|873|874|(1:877)(1:876))|878)(2:941|942)|879|880|881)(1:956)|882|(4:885|(3:907|908|909)(6:887|888|(2:889|(4:891|(1:893)(1:904)|894|(1:896)(2:897|898))(2:905|906))|(1:900)|901|902)|903|883)|910|911|912)(2:958|959)|913|844)|960)|463|464|(3:735|(6:738|(7:740|741|742|743|744|745|(4:(9:747|748|749|750|751|(3:753|754|755)(1:822)|756|757|(1:760)(1:759))|761|762|763)(5:826|827|820|821|763))(1:841)|764|(2:765|(2:767|(3:808|809|810)(6:769|(2:770|(4:772|(3:774|(1:776)(1:804)|777)(1:805)|778|(4:782|(1:784)(1:795)|785|(1:787)(2:788|789))(1:803))(2:806|807))|(2:794|793)|791|792|793))(3:812|813|814))|811|736)|842)|466|467|(3:468|469|(8:471|472|473|474|475|476|(2:478|479)(1:481)|480)(1:490))|491|(11:493|(8:496|497|498|499|500|(8:585|586|(4:588|589|590|(1:592))(1:610)|(5:596|(1:600)|601|(1:605)|606)|607|608|535|536)(8:502|503|(7:576|577|578|507|(4:560|561|(2:562|(2:564|(3:567|568|(1:570)(0))(1:566))(1:571))|(3:511|512|513)(6:515|(2:517|(1:519))(1:559)|520|(1:522)(1:558)|523|(5:525|(1:533)|534|535|536)(4:537|(3:539|(1:541)|542)(4:545|(1:547)(1:557)|548|(3:550|(1:552)|553)(2:554|(1:556)))|543|544)))(0)|509|(0)(0))(1:505)|506|507|(0)(0)|509|(0)(0))|514|494)|621|622|623|624|(3:725|726|727)|626|(4:629|630|631|627)|632|633)(1:734)|634|(1:636)(3:700|701|(11:703|(1:705)(1:723)|706|(1:708)(1:722)|709|(1:711)(1:721)|712|(1:714)(1:720)|715|(1:717)(1:719)|718))|637|(8:639|(5:644|645|646|647|(10:649|(1:670)|653|654|655|656|(1:658)|659|660|(1:662))(2:671|672))|673|(1:675)(1:676)|645|646|647|(0)(0))|677|(3:(2:681|682)(1:684)|683|678)|685|686|(1:688)|689|690|691|692|693|694|695)(4:1219|1220|1216|1217))|1218|447|448|449|450|451|(0)(0)|456|457|(0)(0)|460|461|(0)|463|464|(0)|466|467|(4:468|469|(0)(0)|480)|491|(0)(0)|634|(0)(0)|637|(0)|677|(1:678)|685|686|(0)|689|690|691|692|693|694|695))|450|451|(0)(0)|456|457|(0)(0)|460|461|(0)|463|464|(0)|466|467|(4:468|469|(0)(0)|480)|491|(0)(0)|634|(0)(0)|637|(0)|677|(1:678)|685|686|(0)|689|690|691|692|693|694|695) */
    /* JADX WARN: Can't wrap try/catch for region: R(64:9|(8:10|11|(5:13|14|15|(6:17|18|19|(4:21|22|23|(1:27))|36|37)(28:42|43|44|45|46|(4:242|243|244|(3:246|(5:250|(2:256|257)|258|247|248)|262))|48|49|(3:51|52|(2:54|(4:56|(2:60|(11:66|(5:68|(5:72|(2:74|75)(2:77|(2:79|80)(1:81))|76|70|69)|82|83|(2:86|(6:97|(1:99)(2:107|(3:109|(3:112|(1:114)(1:115)|110)|116))|100|101|102|103)(4:90|91|92|93))(1:85))(0)|117|(2:119|(7:(1:137)(3:124|(1:126)(1:136)|127)|128|129|130|131|132|134)(1:138))(2:140|(2:142|(6:(1:152)(3:147|(1:149)(1:151)|150)|129|130|131|132|134)))|139|128|129|130|131|132|134))|234|(13:62|64|66|(0)(0)|117|(0)(0)|139|128|129|130|131|132|134))(4:235|(2:237|(0))|234|(0)))(4:238|(2:240|(0))|234|(0)))(1:241)|153|(9:154|155|156|157|(3:159|(5:161|162|163|164|165)(3:169|170|(5:172|173|174|175|176)(2:179|180))|166)(1:181)|31|32|33|34)|182|(1:231)(1:185)|(1:187)|188|(1:190)(1:230)|191|(1:229)(2:194|(6:196|197|(5:201|(2:203|204)(2:206|(2:208|209)(1:210))|205|198|199)|211|(1:(2:215|216)(1:214))|(3:220|221|222)(1:225)))|(0)(0)|117|(0)(0)|139|128|129|130|131|132|134)|38)(1:272)|271|31|32|33|34)|273|(7:275|276|277|(2:279|(3:281|282|283))|284|(1:298)(3:286|(1:288)(1:297)|(3:292|293|294))|283)|301|302|303|(3:304|305|(1:1301)(2:307|(2:309|310)))|311|(2:313|314)(2:1294|(3:1296|1297|1298))|315|316|317|(1:319)(1:1293)|(2:321|(54:325|326|327|(1:329)|330|(3:332|(1:334)(9:1263|(1:1265)|1266|1267|1268|1269|1270|(3:1276|(1:1280)|1281)(1:1274)|1275)|335)(1:1290)|(11:337|338|339|340|341|342|343|344|345|346|(3:347|348|(4:350|351|352|(1:355)(1:354))(1:361)))(0)|373|(14:376|377|378|380|381|382|(3:384|385|386)|389|390|391|392|(4:394|395|396|398)(1:401)|399|374)|408|409|(2:410|(2:412|(2:414|415))(2:1261|1262))|416|(10:1238|1239|1240|1241|1242|1243|1244|1245|1246|1247)(1:418)|419|420|(1:1237)(10:423|424|425|426|427|428|430|431|432|(38:(9:434|435|436|437|438|439|(1:441)(3:1201|(2:1203|1204)(1:1206)|1205)|442|(1:445)(1:444))|446|447|448|449|450|451|(3:453|454|455)(4:1153|(9:1154|1155|1156|1157|1158|1159|1160|1161|(1:1164)(1:1163))|1165|1166)|456|457|(1:459)(5:961|(11:963|964|965|966|967|968|(3:(3:970|(1:972)|973)|975|976)(1:1136)|977|978|(3:1074|(6:1077|(3:1082|(4:1084|(7:1086|(4:1089|(2:1091|1092)(1:1094)|1093|1087)|1095|1096|(4:1099|(3:1101|1102|1103)(1:1105)|1104|1097)|1106|1107)(6:1111|(4:1114|(2:1116|1117)(1:1119)|1118|1112)|1120|1121|(4:1124|(2:1126|1127)(1:1129)|1128|1122)|1130)|1108|1109)(2:1131|1132)|1110)|1133|1134|1110|1075)|1135)|980)(1:1151)|981|(13:984|(3:989|(4:992|(6:994|995|(1:997)(1:1002)|998|999|1000)(1:1003)|1001|990)|1004)|1005|1006|(3:1011|(4:1014|(2:1019|1020)(3:1022|1023|1024)|1021|1012)|1026)|1027|(3:1029|(6:1032|(2:1034|(3:1036|1037|1038))(1:1041)|1039|1040|1038|1030)|1042)|1043|1044|(3:1054|(8:1057|(1:1059)|1060|(1:1062)|1063|(3:1065|1066|1067)(1:1069)|1068|1055)|1070)|1071|1072|982)|1073)|460|461|(3:843|(4:846|(9:848|(1:850)(1:957)|851|(10:853|854|855|856|857|858|(2:(12:860|861|862|864|865|866|867|(3:869|870|871)(1:924)|872|873|874|(1:877)(1:876))|878)(2:941|942)|879|880|881)(1:956)|882|(4:885|(3:907|908|909)(6:887|888|(2:889|(4:891|(1:893)(1:904)|894|(1:896)(2:897|898))(2:905|906))|(1:900)|901|902)|903|883)|910|911|912)(2:958|959)|913|844)|960)|463|464|(3:735|(6:738|(7:740|741|742|743|744|745|(4:(9:747|748|749|750|751|(3:753|754|755)(1:822)|756|757|(1:760)(1:759))|761|762|763)(5:826|827|820|821|763))(1:841)|764|(2:765|(2:767|(3:808|809|810)(6:769|(2:770|(4:772|(3:774|(1:776)(1:804)|777)(1:805)|778|(4:782|(1:784)(1:795)|785|(1:787)(2:788|789))(1:803))(2:806|807))|(2:794|793)|791|792|793))(3:812|813|814))|811|736)|842)|466|467|(3:468|469|(8:471|472|473|474|475|476|(2:478|479)(1:481)|480)(1:490))|491|(11:493|(8:496|497|498|499|500|(8:585|586|(4:588|589|590|(1:592))(1:610)|(5:596|(1:600)|601|(1:605)|606)|607|608|535|536)(8:502|503|(7:576|577|578|507|(4:560|561|(2:562|(2:564|(3:567|568|(1:570)(0))(1:566))(1:571))|(3:511|512|513)(6:515|(2:517|(1:519))(1:559)|520|(1:522)(1:558)|523|(5:525|(1:533)|534|535|536)(4:537|(3:539|(1:541)|542)(4:545|(1:547)(1:557)|548|(3:550|(1:552)|553)(2:554|(1:556)))|543|544)))(0)|509|(0)(0))(1:505)|506|507|(0)(0)|509|(0)(0))|514|494)|621|622|623|624|(3:725|726|727)|626|(4:629|630|631|627)|632|633)(1:734)|634|(1:636)(3:700|701|(11:703|(1:705)(1:723)|706|(1:708)(1:722)|709|(1:711)(1:721)|712|(1:714)(1:720)|715|(1:717)(1:719)|718))|637|(8:639|(5:644|645|646|647|(10:649|(1:670)|653|654|655|656|(1:658)|659|660|(1:662))(2:671|672))|673|(1:675)(1:676)|645|646|647|(0)(0))|677|(3:(2:681|682)(1:684)|683|678)|685|686|(1:688)|689|690|691|692|693|694|695)(4:1219|1220|1216|1217))|1218|447|448|449|450|451|(0)(0)|456|457|(0)(0)|460|461|(0)|463|464|(0)|466|467|(4:468|469|(0)(0)|480)|491|(0)(0)|634|(0)(0)|637|(0)|677|(1:678)|685|686|(0)|689|690|691|692|693|694|695))|1292|373|(1:374)|408|409|(3:410|(0)(0)|413)|416|(0)(0)|419|420|(0)|1237|1218|447|448|449|450|451|(0)(0)|456|457|(0)(0)|460|461|(0)|463|464|(0)|466|467|(4:468|469|(0)(0)|480)|491|(0)(0)|634|(0)(0)|637|(0)|677|(1:678)|685|686|(0)|689|690|691|692|693|694|695) */
    /* JADX WARN: Code restructure failed: missing block: B:1078:0x1bef, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1080:0x1bf1, code lost:
        r2.f32943u.b().m().d("Failed to remove unused event metadata. appId", ta.w2.q(r1), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x07f0, code lost:
        r4.i();
        com.google.android.gms.internal.measurement.v2.A0((com.google.android.gms.internal.measurement.v2) r4.f8613v, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0804, code lost:
        r4.i();
        com.google.android.gms.internal.measurement.v2.B0((com.google.android.gms.internal.measurement.v2) r4.f8613v, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a8b, code lost:
        if (r1 == null) goto L1217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0b48, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0b49, code lost:
        r47 = r5;
        r46 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0b4e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0b4f, code lost:
        r1 = r0;
        r9 = null;
        r4 = r88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0b55, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0b56, code lost:
        r47 = "Database error querying filters. appId";
        r46 = "current_results";
        r5 = r0;
        r1 = null;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0c11, code lost:
        if (r12 == null) goto L978;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x133a, code lost:
        if (r5 == null) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x1471, code lost:
        r47 = r6;
        r1 = r51.b().o();
        r2 = ta.w2.q(r10.f32475x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x1485, code lost:
        if (r8.D() == false) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x1487, code lost:
        r5 = java.lang.Integer.valueOf(r8.u());
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x1490, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x1491, code lost:
        r1.d("Invalid property filter ID. appId, id", r2, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1002:0x1901 A[Catch: all -> 0x1c3b, TRY_LEAVE, TryCatch #20 {all -> 0x1c3b, blocks: (B:993:0x18d1, B:1000:0x18f0, B:1002:0x1901, B:1028:0x19d6, B:1030:0x19e0, B:1032:0x19f4, B:1035:0x19fb, B:1040:0x1a3a, B:1042:0x1a41, B:1044:0x1a5a, B:1046:0x1a7e, B:1049:0x1ab3, B:1050:0x1ab7, B:1051:0x1ac2, B:1053:0x1b03, B:1054:0x1b10, B:1056:0x1b21, B:1060:0x1b39, B:1062:0x1b50, B:1048:0x1a92, B:1063:0x1b67, B:1064:0x1b6c, B:1036:0x1a0a, B:1038:0x1a16, B:1039:0x1a23, B:1065:0x1b6d, B:1066:0x1b85, B:1069:0x1b8d, B:1070:0x1b92, B:1071:0x1ba2, B:1073:0x1bbc, B:1074:0x1bd7, B:1076:0x1be1, B:1081:0x1c04, B:1080:0x1bf1, B:1005:0x191c, B:1007:0x1926, B:1009:0x1936, B:1011:0x1944, B:1017:0x195a, B:1019:0x1968, B:1021:0x197c, B:1023:0x1991, B:1025:0x19c7, B:1027:0x19ce, B:1026:0x19cb, B:1018:0x1965, B:1010:0x1941, B:1094:0x1c29), top: B:1133:0x0024, inners: #17, #61, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:1004:0x191a  */
    /* JADX WARN: Removed duplicated region for block: B:1030:0x19e0 A[Catch: all -> 0x1c3b, TryCatch #20 {all -> 0x1c3b, blocks: (B:993:0x18d1, B:1000:0x18f0, B:1002:0x1901, B:1028:0x19d6, B:1030:0x19e0, B:1032:0x19f4, B:1035:0x19fb, B:1040:0x1a3a, B:1042:0x1a41, B:1044:0x1a5a, B:1046:0x1a7e, B:1049:0x1ab3, B:1050:0x1ab7, B:1051:0x1ac2, B:1053:0x1b03, B:1054:0x1b10, B:1056:0x1b21, B:1060:0x1b39, B:1062:0x1b50, B:1048:0x1a92, B:1063:0x1b67, B:1064:0x1b6c, B:1036:0x1a0a, B:1038:0x1a16, B:1039:0x1a23, B:1065:0x1b6d, B:1066:0x1b85, B:1069:0x1b8d, B:1070:0x1b92, B:1071:0x1ba2, B:1073:0x1bbc, B:1074:0x1bd7, B:1076:0x1be1, B:1081:0x1c04, B:1080:0x1bf1, B:1005:0x191c, B:1007:0x1926, B:1009:0x1936, B:1011:0x1944, B:1017:0x195a, B:1019:0x1968, B:1021:0x197c, B:1023:0x1991, B:1025:0x19c7, B:1027:0x19ce, B:1026:0x19cb, B:1018:0x1965, B:1010:0x1941, B:1094:0x1c29), top: B:1133:0x0024, inners: #17, #61, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:1044:0x1a5a A[Catch: all -> 0x1c3b, TryCatch #20 {all -> 0x1c3b, blocks: (B:993:0x18d1, B:1000:0x18f0, B:1002:0x1901, B:1028:0x19d6, B:1030:0x19e0, B:1032:0x19f4, B:1035:0x19fb, B:1040:0x1a3a, B:1042:0x1a41, B:1044:0x1a5a, B:1046:0x1a7e, B:1049:0x1ab3, B:1050:0x1ab7, B:1051:0x1ac2, B:1053:0x1b03, B:1054:0x1b10, B:1056:0x1b21, B:1060:0x1b39, B:1062:0x1b50, B:1048:0x1a92, B:1063:0x1b67, B:1064:0x1b6c, B:1036:0x1a0a, B:1038:0x1a16, B:1039:0x1a23, B:1065:0x1b6d, B:1066:0x1b85, B:1069:0x1b8d, B:1070:0x1b92, B:1071:0x1ba2, B:1073:0x1bbc, B:1074:0x1bd7, B:1076:0x1be1, B:1081:0x1c04, B:1080:0x1bf1, B:1005:0x191c, B:1007:0x1926, B:1009:0x1936, B:1011:0x1944, B:1017:0x195a, B:1019:0x1968, B:1021:0x197c, B:1023:0x1991, B:1025:0x19c7, B:1027:0x19ce, B:1026:0x19cb, B:1018:0x1965, B:1010:0x1941, B:1094:0x1c29), top: B:1133:0x0024, inners: #17, #61, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:1063:0x1b67 A[Catch: all -> 0x1c3b, TryCatch #20 {all -> 0x1c3b, blocks: (B:993:0x18d1, B:1000:0x18f0, B:1002:0x1901, B:1028:0x19d6, B:1030:0x19e0, B:1032:0x19f4, B:1035:0x19fb, B:1040:0x1a3a, B:1042:0x1a41, B:1044:0x1a5a, B:1046:0x1a7e, B:1049:0x1ab3, B:1050:0x1ab7, B:1051:0x1ac2, B:1053:0x1b03, B:1054:0x1b10, B:1056:0x1b21, B:1060:0x1b39, B:1062:0x1b50, B:1048:0x1a92, B:1063:0x1b67, B:1064:0x1b6c, B:1036:0x1a0a, B:1038:0x1a16, B:1039:0x1a23, B:1065:0x1b6d, B:1066:0x1b85, B:1069:0x1b8d, B:1070:0x1b92, B:1071:0x1ba2, B:1073:0x1bbc, B:1074:0x1bd7, B:1076:0x1be1, B:1081:0x1c04, B:1080:0x1bf1, B:1005:0x191c, B:1007:0x1926, B:1009:0x1936, B:1011:0x1944, B:1017:0x195a, B:1019:0x1968, B:1021:0x197c, B:1023:0x1991, B:1025:0x19c7, B:1027:0x19ce, B:1026:0x19cb, B:1018:0x1965, B:1010:0x1941, B:1094:0x1c29), top: B:1133:0x0024, inners: #17, #61, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:1068:0x1b8b  */
    /* JADX WARN: Removed duplicated region for block: B:1073:0x1bbc A[Catch: all -> 0x1c3b, TryCatch #20 {all -> 0x1c3b, blocks: (B:993:0x18d1, B:1000:0x18f0, B:1002:0x1901, B:1028:0x19d6, B:1030:0x19e0, B:1032:0x19f4, B:1035:0x19fb, B:1040:0x1a3a, B:1042:0x1a41, B:1044:0x1a5a, B:1046:0x1a7e, B:1049:0x1ab3, B:1050:0x1ab7, B:1051:0x1ac2, B:1053:0x1b03, B:1054:0x1b10, B:1056:0x1b21, B:1060:0x1b39, B:1062:0x1b50, B:1048:0x1a92, B:1063:0x1b67, B:1064:0x1b6c, B:1036:0x1a0a, B:1038:0x1a16, B:1039:0x1a23, B:1065:0x1b6d, B:1066:0x1b85, B:1069:0x1b8d, B:1070:0x1b92, B:1071:0x1ba2, B:1073:0x1bbc, B:1074:0x1bd7, B:1076:0x1be1, B:1081:0x1c04, B:1080:0x1bf1, B:1005:0x191c, B:1007:0x1926, B:1009:0x1936, B:1011:0x1944, B:1017:0x195a, B:1019:0x1968, B:1021:0x197c, B:1023:0x1991, B:1025:0x19c7, B:1027:0x19ce, B:1026:0x19cb, B:1018:0x1965, B:1010:0x1941, B:1094:0x1c29), top: B:1133:0x0024, inners: #17, #61, #65 }] */
    /* JADX WARN: Removed duplicated region for block: B:1107:0x1c21 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1179:0x16bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1225:0x0940 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1239:0x0849 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1288:0x091b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1289:0x1572 A[EDGE_INSN: B:1289:0x1572->B:868:0x1572 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0403 A[Catch: all -> 0x05c2, TryCatch #28 {all -> 0x05c2, blocks: (B:12:0x0066, B:15:0x008d, B:18:0x00c5, B:22:0x00db, B:24:0x00e5, B:30:0x0117, B:33:0x0127, B:36:0x0137, B:41:0x015e, B:43:0x016e, B:45:0x017c, B:47:0x018c, B:48:0x0199, B:53:0x01a2, B:56:0x01b7, B:148:0x0403, B:149:0x040f, B:152:0x0419, B:158:0x043c, B:155:0x042b, B:162:0x0444, B:164:0x0450, B:166:0x045c, B:168:0x0473, B:182:0x04ab, B:184:0x04c2, B:174:0x0483, B:177:0x0495, B:179:0x049b, B:181:0x04a5, B:187:0x04ce, B:189:0x04da, B:192:0x04eb, B:194:0x04fc, B:196:0x0508, B:216:0x0592, B:201:0x052e, B:203:0x053e, B:206:0x0551, B:208:0x0562, B:210:0x056e, B:86:0x021f, B:88:0x022d, B:94:0x0256, B:96:0x0264, B:106:0x029c, B:109:0x02c9, B:110:0x02f1, B:112:0x0321, B:114:0x0328, B:117:0x0334, B:119:0x0365, B:123:0x038a, B:125:0x0398, B:126:0x03a0, B:138:0x03c3, B:143:0x03e5, B:231:0x05d9, B:233:0x05e3, B:235:0x05ec, B:236:0x05f4, B:238:0x05fd, B:240:0x0603, B:243:0x060f, B:245:0x0619, B:255:0x0641, B:257:0x0651, B:261:0x0666, B:277:0x06c3, B:279:0x06d2, B:281:0x06d8, B:325:0x0792, B:327:0x07af, B:330:0x07cd, B:335:0x07e6, B:363:0x0851, B:367:0x0861, B:372:0x0873, B:376:0x0883, B:266:0x067a), top: B:1146:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04da A[Catch: all -> 0x05c2, TryCatch #28 {all -> 0x05c2, blocks: (B:12:0x0066, B:15:0x008d, B:18:0x00c5, B:22:0x00db, B:24:0x00e5, B:30:0x0117, B:33:0x0127, B:36:0x0137, B:41:0x015e, B:43:0x016e, B:45:0x017c, B:47:0x018c, B:48:0x0199, B:53:0x01a2, B:56:0x01b7, B:148:0x0403, B:149:0x040f, B:152:0x0419, B:158:0x043c, B:155:0x042b, B:162:0x0444, B:164:0x0450, B:166:0x045c, B:168:0x0473, B:182:0x04ab, B:184:0x04c2, B:174:0x0483, B:177:0x0495, B:179:0x049b, B:181:0x04a5, B:187:0x04ce, B:189:0x04da, B:192:0x04eb, B:194:0x04fc, B:196:0x0508, B:216:0x0592, B:201:0x052e, B:203:0x053e, B:206:0x0551, B:208:0x0562, B:210:0x056e, B:86:0x021f, B:88:0x022d, B:94:0x0256, B:96:0x0264, B:106:0x029c, B:109:0x02c9, B:110:0x02f1, B:112:0x0321, B:114:0x0328, B:117:0x0334, B:119:0x0365, B:123:0x038a, B:125:0x0398, B:126:0x03a0, B:138:0x03c3, B:143:0x03e5, B:231:0x05d9, B:233:0x05e3, B:235:0x05ec, B:236:0x05f4, B:238:0x05fd, B:240:0x0603, B:243:0x060f, B:245:0x0619, B:255:0x0641, B:257:0x0651, B:261:0x0666, B:277:0x06c3, B:279:0x06d2, B:281:0x06d8, B:325:0x0792, B:327:0x07af, B:330:0x07cd, B:335:0x07e6, B:363:0x0851, B:367:0x0861, B:372:0x0873, B:376:0x0883, B:266:0x067a), top: B:1146:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x052e A[Catch: all -> 0x05c2, TryCatch #28 {all -> 0x05c2, blocks: (B:12:0x0066, B:15:0x008d, B:18:0x00c5, B:22:0x00db, B:24:0x00e5, B:30:0x0117, B:33:0x0127, B:36:0x0137, B:41:0x015e, B:43:0x016e, B:45:0x017c, B:47:0x018c, B:48:0x0199, B:53:0x01a2, B:56:0x01b7, B:148:0x0403, B:149:0x040f, B:152:0x0419, B:158:0x043c, B:155:0x042b, B:162:0x0444, B:164:0x0450, B:166:0x045c, B:168:0x0473, B:182:0x04ab, B:184:0x04c2, B:174:0x0483, B:177:0x0495, B:179:0x049b, B:181:0x04a5, B:187:0x04ce, B:189:0x04da, B:192:0x04eb, B:194:0x04fc, B:196:0x0508, B:216:0x0592, B:201:0x052e, B:203:0x053e, B:206:0x0551, B:208:0x0562, B:210:0x056e, B:86:0x021f, B:88:0x022d, B:94:0x0256, B:96:0x0264, B:106:0x029c, B:109:0x02c9, B:110:0x02f1, B:112:0x0321, B:114:0x0328, B:117:0x0334, B:119:0x0365, B:123:0x038a, B:125:0x0398, B:126:0x03a0, B:138:0x03c3, B:143:0x03e5, B:231:0x05d9, B:233:0x05e3, B:235:0x05ec, B:236:0x05f4, B:238:0x05fd, B:240:0x0603, B:243:0x060f, B:245:0x0619, B:255:0x0641, B:257:0x0651, B:261:0x0666, B:277:0x06c3, B:279:0x06d2, B:281:0x06d8, B:325:0x0792, B:327:0x07af, B:330:0x07cd, B:335:0x07e6, B:363:0x0851, B:367:0x0861, B:372:0x0873, B:376:0x0883, B:266:0x067a), top: B:1146:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0792 A[Catch: all -> 0x05c2, TRY_ENTER, TRY_LEAVE, TryCatch #28 {all -> 0x05c2, blocks: (B:12:0x0066, B:15:0x008d, B:18:0x00c5, B:22:0x00db, B:24:0x00e5, B:30:0x0117, B:33:0x0127, B:36:0x0137, B:41:0x015e, B:43:0x016e, B:45:0x017c, B:47:0x018c, B:48:0x0199, B:53:0x01a2, B:56:0x01b7, B:148:0x0403, B:149:0x040f, B:152:0x0419, B:158:0x043c, B:155:0x042b, B:162:0x0444, B:164:0x0450, B:166:0x045c, B:168:0x0473, B:182:0x04ab, B:184:0x04c2, B:174:0x0483, B:177:0x0495, B:179:0x049b, B:181:0x04a5, B:187:0x04ce, B:189:0x04da, B:192:0x04eb, B:194:0x04fc, B:196:0x0508, B:216:0x0592, B:201:0x052e, B:203:0x053e, B:206:0x0551, B:208:0x0562, B:210:0x056e, B:86:0x021f, B:88:0x022d, B:94:0x0256, B:96:0x0264, B:106:0x029c, B:109:0x02c9, B:110:0x02f1, B:112:0x0321, B:114:0x0328, B:117:0x0334, B:119:0x0365, B:123:0x038a, B:125:0x0398, B:126:0x03a0, B:138:0x03c3, B:143:0x03e5, B:231:0x05d9, B:233:0x05e3, B:235:0x05ec, B:236:0x05f4, B:238:0x05fd, B:240:0x0603, B:243:0x060f, B:245:0x0619, B:255:0x0641, B:257:0x0651, B:261:0x0666, B:277:0x06c3, B:279:0x06d2, B:281:0x06d8, B:325:0x0792, B:327:0x07af, B:330:0x07cd, B:335:0x07e6, B:363:0x0851, B:367:0x0861, B:372:0x0873, B:376:0x0883, B:266:0x067a), top: B:1146:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0909 A[Catch: all -> 0x1c3d, TryCatch #23 {all -> 0x1c3d, blocks: (B:3:0x0010, B:5:0x0026, B:8:0x002e, B:9:0x0048, B:251:0x0624, B:252:0x0637, B:258:0x065d, B:270:0x0695, B:272:0x069c, B:359:0x0823, B:360:0x083f, B:388:0x08a1, B:389:0x0903, B:391:0x0909, B:395:0x091c, B:275:0x06bd, B:263:0x066a), top: B:1138:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x09b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0ad9 A[Catch: SQLiteException -> 0x0b48, all -> 0x1c1a, TRY_LEAVE, TryCatch #70 {SQLiteException -> 0x0b48, blocks: (B:475:0x0ad3, B:477:0x0ad9, B:480:0x0ae6, B:481:0x0aeb), top: B:1207:0x0ad3 }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0ae6 A[Catch: SQLiteException -> 0x0b48, all -> 0x1c1a, TRY_ENTER, TryCatch #70 {SQLiteException -> 0x0b48, blocks: (B:475:0x0ad3, B:477:0x0ad9, B:480:0x0ae6, B:481:0x0aeb), top: B:1207:0x0ad3 }] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0b84 A[Catch: all -> 0x1c16, TryCatch #80 {all -> 0x1c16, blocks: (B:397:0x0940, B:398:0x0965, B:400:0x096c, B:402:0x0974, B:414:0x09a2, B:418:0x09b2, B:473:0x0aa4, B:478:0x0add, B:508:0x0b76, B:661:0x0f4d, B:758:0x123c, B:850:0x14c2, B:851:0x14d8, B:868:0x1572, B:870:0x1590, B:871:0x15a3, B:761:0x1248, B:762:0x1251, B:764:0x1257, B:664:0x0f5c, B:665:0x0f6a, B:667:0x0f70, B:669:0x0f7e, B:671:0x0f92, B:672:0x0fd6, B:512:0x0b84, B:514:0x0b8f, B:589:0x0d97, B:590:0x0d9b, B:592:0x0da1, B:594:0x0dc6, B:597:0x0dcd, B:598:0x0dd5, B:609:0x0e09, B:611:0x0e10, B:614:0x0e17, B:637:0x0ebb, B:586:0x0d90, B:587:0x0d93, B:507:0x0b73, B:464:0x0a8d, B:469:0x0a97, B:470:0x0a9a, B:412:0x0984), top: B:1225:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0d90 A[Catch: all -> 0x1c16, TRY_ENTER, TryCatch #80 {all -> 0x1c16, blocks: (B:397:0x0940, B:398:0x0965, B:400:0x096c, B:402:0x0974, B:414:0x09a2, B:418:0x09b2, B:473:0x0aa4, B:478:0x0add, B:508:0x0b76, B:661:0x0f4d, B:758:0x123c, B:850:0x14c2, B:851:0x14d8, B:868:0x1572, B:870:0x1590, B:871:0x15a3, B:761:0x1248, B:762:0x1251, B:764:0x1257, B:664:0x0f5c, B:665:0x0f6a, B:667:0x0f70, B:669:0x0f7e, B:671:0x0f92, B:672:0x0fd6, B:512:0x0b84, B:514:0x0b8f, B:589:0x0d97, B:590:0x0d9b, B:592:0x0da1, B:594:0x0dc6, B:597:0x0dcd, B:598:0x0dd5, B:609:0x0e09, B:611:0x0e10, B:614:0x0e17, B:637:0x0ebb, B:586:0x0d90, B:587:0x0d93, B:507:0x0b73, B:464:0x0a8d, B:469:0x0a97, B:470:0x0a9a, B:412:0x0984), top: B:1225:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0f5c A[Catch: all -> 0x1c16, TryCatch #80 {all -> 0x1c16, blocks: (B:397:0x0940, B:398:0x0965, B:400:0x096c, B:402:0x0974, B:414:0x09a2, B:418:0x09b2, B:473:0x0aa4, B:478:0x0add, B:508:0x0b76, B:661:0x0f4d, B:758:0x123c, B:850:0x14c2, B:851:0x14d8, B:868:0x1572, B:870:0x1590, B:871:0x15a3, B:761:0x1248, B:762:0x1251, B:764:0x1257, B:664:0x0f5c, B:665:0x0f6a, B:667:0x0f70, B:669:0x0f7e, B:671:0x0f92, B:672:0x0fd6, B:512:0x0b84, B:514:0x0b8f, B:589:0x0d97, B:590:0x0d9b, B:592:0x0da1, B:594:0x0dc6, B:597:0x0dcd, B:598:0x0dd5, B:609:0x0e09, B:611:0x0e10, B:614:0x0e17, B:637:0x0ebb, B:586:0x0d90, B:587:0x0d93, B:507:0x0b73, B:464:0x0a8d, B:469:0x0a97, B:470:0x0a9a, B:412:0x0984), top: B:1225:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:725:0x1125 A[Catch: all -> 0x0a4c, TRY_ENTER, TryCatch #34 {all -> 0x0a4c, blocks: (B:440:0x0a47, B:854:0x14e3, B:855:0x152f, B:857:0x1537, B:859:0x1541, B:865:0x1559, B:766:0x1269, B:784:0x1305, B:802:0x1340, B:809:0x1353, B:810:0x135b, B:812:0x1361, B:814:0x1377, B:815:0x138a, B:816:0x1397, B:818:0x139d, B:820:0x13b2, B:822:0x13c4, B:824:0x13da, B:826:0x1409, B:828:0x140f, B:831:0x1418, B:835:0x144c, B:837:0x1452, B:838:0x1467, B:846:0x14a5, B:834:0x1446, B:839:0x1471, B:841:0x1487, B:843:0x1491, B:800:0x133c, B:806:0x1349, B:807:0x134c, B:673:0x1013, B:675:0x1028, B:713:0x10f1, B:727:0x1129, B:734:0x113a, B:735:0x1142, B:737:0x1148, B:739:0x115e, B:740:0x116e, B:741:0x117b, B:743:0x1181, B:747:0x11c8, B:749:0x11da, B:750:0x11f2, B:753:0x1208, B:746:0x11c0, B:725:0x1125, B:731:0x1132, B:732:0x1135, B:535:0x0c13, B:536:0x0c16, B:600:0x0ddb, B:602:0x0de7, B:604:0x0df7, B:606:0x0e01, B:615:0x0e1f, B:617:0x0e25, B:619:0x0e31, B:621:0x0e37, B:626:0x0e65, B:628:0x0e6d, B:630:0x0e79, B:632:0x0ea1, B:634:0x0ea9, B:640:0x0ecb, B:642:0x0ed3, B:644:0x0ed7, B:647:0x0edc, B:648:0x0ee0, B:650:0x0ee6, B:652:0x0efe, B:653:0x0f06, B:655:0x0f10, B:656:0x0f17, B:658:0x0f1d, B:659:0x0f25, B:539:0x0c28, B:540:0x0c30, B:542:0x0c36, B:544:0x0c52, B:547:0x0c5a, B:549:0x0c72, B:551:0x0cb4, B:552:0x0cc1, B:554:0x0cc7, B:556:0x0cdd, B:558:0x0ce3, B:559:0x0cfd, B:561:0x0d03, B:563:0x0d17, B:564:0x0d1b, B:579:0x0d67, B:566:0x0d2a, B:568:0x0d30, B:570:0x0d42, B:571:0x0d45, B:573:0x0d49, B:575:0x0d4f, B:577:0x0d61, B:578:0x0d64, B:581:0x0d7a, B:492:0x0b34), top: B:1158:0x0a47 }] */
    /* JADX WARN: Removed duplicated region for block: B:737:0x1148 A[Catch: all -> 0x0a4c, TryCatch #34 {all -> 0x0a4c, blocks: (B:440:0x0a47, B:854:0x14e3, B:855:0x152f, B:857:0x1537, B:859:0x1541, B:865:0x1559, B:766:0x1269, B:784:0x1305, B:802:0x1340, B:809:0x1353, B:810:0x135b, B:812:0x1361, B:814:0x1377, B:815:0x138a, B:816:0x1397, B:818:0x139d, B:820:0x13b2, B:822:0x13c4, B:824:0x13da, B:826:0x1409, B:828:0x140f, B:831:0x1418, B:835:0x144c, B:837:0x1452, B:838:0x1467, B:846:0x14a5, B:834:0x1446, B:839:0x1471, B:841:0x1487, B:843:0x1491, B:800:0x133c, B:806:0x1349, B:807:0x134c, B:673:0x1013, B:675:0x1028, B:713:0x10f1, B:727:0x1129, B:734:0x113a, B:735:0x1142, B:737:0x1148, B:739:0x115e, B:740:0x116e, B:741:0x117b, B:743:0x1181, B:747:0x11c8, B:749:0x11da, B:750:0x11f2, B:753:0x1208, B:746:0x11c0, B:725:0x1125, B:731:0x1132, B:732:0x1135, B:535:0x0c13, B:536:0x0c16, B:600:0x0ddb, B:602:0x0de7, B:604:0x0df7, B:606:0x0e01, B:615:0x0e1f, B:617:0x0e25, B:619:0x0e31, B:621:0x0e37, B:626:0x0e65, B:628:0x0e6d, B:630:0x0e79, B:632:0x0ea1, B:634:0x0ea9, B:640:0x0ecb, B:642:0x0ed3, B:644:0x0ed7, B:647:0x0edc, B:648:0x0ee0, B:650:0x0ee6, B:652:0x0efe, B:653:0x0f06, B:655:0x0f10, B:656:0x0f17, B:658:0x0f1d, B:659:0x0f25, B:539:0x0c28, B:540:0x0c30, B:542:0x0c36, B:544:0x0c52, B:547:0x0c5a, B:549:0x0c72, B:551:0x0cb4, B:552:0x0cc1, B:554:0x0cc7, B:556:0x0cdd, B:558:0x0ce3, B:559:0x0cfd, B:561:0x0d03, B:563:0x0d17, B:564:0x0d1b, B:579:0x0d67, B:566:0x0d2a, B:568:0x0d30, B:570:0x0d42, B:571:0x0d45, B:573:0x0d49, B:575:0x0d4f, B:577:0x0d61, B:578:0x0d64, B:581:0x0d7a, B:492:0x0b34), top: B:1158:0x0a47 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x1248 A[Catch: all -> 0x1c16, TryCatch #80 {all -> 0x1c16, blocks: (B:397:0x0940, B:398:0x0965, B:400:0x096c, B:402:0x0974, B:414:0x09a2, B:418:0x09b2, B:473:0x0aa4, B:478:0x0add, B:508:0x0b76, B:661:0x0f4d, B:758:0x123c, B:850:0x14c2, B:851:0x14d8, B:868:0x1572, B:870:0x1590, B:871:0x15a3, B:761:0x1248, B:762:0x1251, B:764:0x1257, B:664:0x0f5c, B:665:0x0f6a, B:667:0x0f70, B:669:0x0f7e, B:671:0x0f92, B:672:0x0fd6, B:512:0x0b84, B:514:0x0b8f, B:589:0x0d97, B:590:0x0d9b, B:592:0x0da1, B:594:0x0dc6, B:597:0x0dcd, B:598:0x0dd5, B:609:0x0e09, B:611:0x0e10, B:614:0x0e17, B:637:0x0ebb, B:586:0x0d90, B:587:0x0d93, B:507:0x0b73, B:464:0x0a8d, B:469:0x0a97, B:470:0x0a9a, B:412:0x0984), top: B:1225:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:854:0x14e3 A[Catch: all -> 0x0a4c, TRY_ENTER, TRY_LEAVE, TryCatch #34 {all -> 0x0a4c, blocks: (B:440:0x0a47, B:854:0x14e3, B:855:0x152f, B:857:0x1537, B:859:0x1541, B:865:0x1559, B:766:0x1269, B:784:0x1305, B:802:0x1340, B:809:0x1353, B:810:0x135b, B:812:0x1361, B:814:0x1377, B:815:0x138a, B:816:0x1397, B:818:0x139d, B:820:0x13b2, B:822:0x13c4, B:824:0x13da, B:826:0x1409, B:828:0x140f, B:831:0x1418, B:835:0x144c, B:837:0x1452, B:838:0x1467, B:846:0x14a5, B:834:0x1446, B:839:0x1471, B:841:0x1487, B:843:0x1491, B:800:0x133c, B:806:0x1349, B:807:0x134c, B:673:0x1013, B:675:0x1028, B:713:0x10f1, B:727:0x1129, B:734:0x113a, B:735:0x1142, B:737:0x1148, B:739:0x115e, B:740:0x116e, B:741:0x117b, B:743:0x1181, B:747:0x11c8, B:749:0x11da, B:750:0x11f2, B:753:0x1208, B:746:0x11c0, B:725:0x1125, B:731:0x1132, B:732:0x1135, B:535:0x0c13, B:536:0x0c16, B:600:0x0ddb, B:602:0x0de7, B:604:0x0df7, B:606:0x0e01, B:615:0x0e1f, B:617:0x0e25, B:619:0x0e31, B:621:0x0e37, B:626:0x0e65, B:628:0x0e6d, B:630:0x0e79, B:632:0x0ea1, B:634:0x0ea9, B:640:0x0ecb, B:642:0x0ed3, B:644:0x0ed7, B:647:0x0edc, B:648:0x0ee0, B:650:0x0ee6, B:652:0x0efe, B:653:0x0f06, B:655:0x0f10, B:656:0x0f17, B:658:0x0f1d, B:659:0x0f25, B:539:0x0c28, B:540:0x0c30, B:542:0x0c36, B:544:0x0c52, B:547:0x0c5a, B:549:0x0c72, B:551:0x0cb4, B:552:0x0cc1, B:554:0x0cc7, B:556:0x0cdd, B:558:0x0ce3, B:559:0x0cfd, B:561:0x0d03, B:563:0x0d17, B:564:0x0d1b, B:579:0x0d67, B:566:0x0d2a, B:568:0x0d30, B:570:0x0d42, B:571:0x0d45, B:573:0x0d49, B:575:0x0d4f, B:577:0x0d61, B:578:0x0d64, B:581:0x0d7a, B:492:0x0b34), top: B:1158:0x0a47 }] */
    /* JADX WARN: Removed duplicated region for block: B:870:0x1590 A[Catch: all -> 0x1c16, TryCatch #80 {all -> 0x1c16, blocks: (B:397:0x0940, B:398:0x0965, B:400:0x096c, B:402:0x0974, B:414:0x09a2, B:418:0x09b2, B:473:0x0aa4, B:478:0x0add, B:508:0x0b76, B:661:0x0f4d, B:758:0x123c, B:850:0x14c2, B:851:0x14d8, B:868:0x1572, B:870:0x1590, B:871:0x15a3, B:761:0x1248, B:762:0x1251, B:764:0x1257, B:664:0x0f5c, B:665:0x0f6a, B:667:0x0f70, B:669:0x0f7e, B:671:0x0f92, B:672:0x0fd6, B:512:0x0b84, B:514:0x0b8f, B:589:0x0d97, B:590:0x0d9b, B:592:0x0da1, B:594:0x0dc6, B:597:0x0dcd, B:598:0x0dd5, B:609:0x0e09, B:611:0x0e10, B:614:0x0e17, B:637:0x0ebb, B:586:0x0d90, B:587:0x0d93, B:507:0x0b73, B:464:0x0a8d, B:469:0x0a97, B:470:0x0a9a, B:412:0x0984), top: B:1225:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:933:0x1708 A[Catch: all -> 0x16f0, TRY_ENTER, TRY_LEAVE, TryCatch #51 {all -> 0x16f0, blocks: (B:919:0x16bc, B:920:0x16c4, B:922:0x16ca, B:924:0x16dc, B:933:0x1708), top: B:1179:0x16bc }] */
    /* JADX WARN: Removed duplicated region for block: B:935:0x1731 A[Catch: all -> 0x18e5, TRY_ENTER, TryCatch #46 {all -> 0x18e5, blocks: (B:874:0x15b5, B:978:0x188c, B:904:0x164b, B:917:0x1692, B:935:0x1731, B:937:0x173d, B:939:0x1754, B:941:0x1793, B:945:0x17a9, B:947:0x17b0, B:949:0x17bf, B:951:0x17c3, B:953:0x17c7, B:955:0x17cb, B:956:0x17d7, B:958:0x17e0, B:960:0x17e6, B:962:0x1801, B:963:0x1806, B:977:0x1889, B:964:0x1819, B:966:0x181e, B:970:0x1838, B:972:0x1860, B:973:0x1867, B:974:0x1877, B:976:0x187d, B:967:0x1826, B:931:0x16f5, B:981:0x1899, B:985:0x18b5, B:988:0x18bb, B:989:0x18c3, B:991:0x18c9), top: B:1173:0x15b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:999:0x18ea  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r13v88, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v58, types: [ta.d6] */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r5v184 */
    /* JADX WARN: Type inference failed for: r5v185 */
    /* JADX WARN: Type inference failed for: r9v109 */
    /* JADX WARN: Type inference failed for: r9v152 */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(long r89) {
        /*
            Method dump skipped, instructions count: 7242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.d6.D(long):boolean");
    }

    public final boolean E() {
        boolean z10;
        a().h();
        g();
        k kVar = this.f32532w;
        H(kVar);
        if (kVar.v("select count(1) > 0 from raw_events", null) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            k kVar2 = this.f32532w;
            H(kVar2);
            if (TextUtils.isEmpty(kVar2.I())) {
                return false;
            }
        }
        return true;
    }

    public final boolean F(com.google.android.gms.internal.measurement.l2 l2Var, com.google.android.gms.internal.measurement.l2 l2Var2) {
        String B;
        v9.o.b("_e".equals(l2Var.p()));
        f6 f6Var = this.A;
        H(f6Var);
        com.google.android.gms.internal.measurement.q2 l2 = f6.l((com.google.android.gms.internal.measurement.m2) l2Var.f(), "_sc");
        String str = null;
        if (l2 == null) {
            B = null;
        } else {
            B = l2.B();
        }
        H(f6Var);
        com.google.android.gms.internal.measurement.q2 l10 = f6.l((com.google.android.gms.internal.measurement.m2) l2Var2.f(), "_pc");
        if (l10 != null) {
            str = l10.B();
        }
        if (str != null && str.equals(B)) {
            v9.o.b("_e".equals(l2Var.p()));
            H(f6Var);
            com.google.android.gms.internal.measurement.q2 l11 = f6.l((com.google.android.gms.internal.measurement.m2) l2Var.f(), "_et");
            if (l11 != null && l11.P() && l11.x() > 0) {
                long x10 = l11.x();
                H(f6Var);
                com.google.android.gms.internal.measurement.q2 l12 = f6.l((com.google.android.gms.internal.measurement.m2) l2Var2.f(), "_et");
                if (l12 != null && l12.x() > 0) {
                    x10 += l12.x();
                }
                H(f6Var);
                f6.K(l2Var2, "_et", Long.valueOf(x10));
                H(f6Var);
                f6.K(l2Var, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    public final l4 I(m6 m6Var) {
        String str;
        Pair pair;
        boolean z10;
        a().h();
        g();
        v9.o.h(m6Var);
        String str2 = m6Var.f32748u;
        v9.o.e(str2);
        String str3 = m6Var.Q;
        if (!str3.isEmpty()) {
            this.V.put(str2, new c6(this, str3));
        }
        k kVar = this.f32532w;
        H(kVar);
        l4 B = kVar.B(str2);
        h c10 = K(str2).c(h.b(m6Var.P));
        g gVar = g.AD_STORAGE;
        boolean f = c10.f(gVar);
        boolean z11 = m6Var.I;
        if (!f) {
            str = "";
        } else {
            str = this.C.m(str2, z11);
        }
        g gVar2 = g.ANALYTICS_STORAGE;
        if (B == null) {
            B = new l4(this.F, str2);
            if (c10.f(gVar2)) {
                B.b(Q(c10));
            }
            if (c10.f(gVar)) {
                B.w(str);
            }
        } else {
            if (c10.f(gVar) && str != null) {
                w3 w3Var = B.f32705a.D;
                y3.k(w3Var);
                w3Var.h();
                if (!str.equals(B.f32709e)) {
                    B.w(str);
                    if (z11) {
                        n5 n5Var = this.C;
                        n5Var.getClass();
                        if (c10.f(gVar)) {
                            pair = n5Var.l(str2);
                        } else {
                            pair = new Pair("", Boolean.FALSE);
                        }
                        if (!"00000000-0000-0000-0000-000000000000".equals(pair.first)) {
                            B.b(Q(c10));
                            k kVar2 = this.f32532w;
                            H(kVar2);
                            if (kVar2.G(str2, "_id") != null) {
                                k kVar3 = this.f32532w;
                                H(kVar3);
                                if (kVar3.G(str2, "_lair") == null) {
                                    ((kotlin.jvm.internal.b0) c()).getClass();
                                    i6 i6Var = new i6(m6Var.f32748u, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    k kVar4 = this.f32532w;
                                    H(kVar4);
                                    kVar4.s(i6Var);
                                }
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(B.E()) && c10.f(gVar2)) {
                B.b(Q(c10));
            }
        }
        B.p(m6Var.f32749v);
        B.a(m6Var.K);
        String str4 = m6Var.E;
        if (!TextUtils.isEmpty(str4)) {
            B.o(str4);
        }
        long j10 = m6Var.f32752y;
        if (j10 != 0) {
            B.q(j10);
        }
        String str5 = m6Var.f32750w;
        if (!TextUtils.isEmpty(str5)) {
            B.d(str5);
        }
        B.e(m6Var.D);
        String str6 = m6Var.f32751x;
        if (str6 != null) {
            B.c(str6);
        }
        B.m(m6Var.f32753z);
        B.v(m6Var.B);
        String str7 = m6Var.A;
        if (!TextUtils.isEmpty(str7)) {
            B.r(str7);
        }
        y3 y3Var = B.f32705a;
        w3 w3Var2 = y3Var.D;
        y3.k(w3Var2);
        w3Var2.h();
        boolean z12 = B.C;
        if (B.f32719p != z11) {
            z10 = true;
        } else {
            z10 = false;
        }
        B.C = z12 | z10;
        B.f32719p = z11;
        w3 w3Var3 = y3Var.D;
        y3.k(w3Var3);
        w3Var3.h();
        boolean z13 = B.C;
        Boolean bool = B.r;
        Boolean bool2 = m6Var.L;
        B.C = z13 | (!kotlin.jvm.internal.h.q0(bool, bool2));
        B.r = bool2;
        B.n(m6Var.M);
        ca.c();
        if (J().q(null, j2.f32651h0) && J().q(str2, j2.f32655j0)) {
            w3 w3Var4 = y3Var.D;
            y3.k(w3Var4);
            w3Var4.h();
            boolean z14 = B.C;
            String str8 = B.f32723u;
            String str9 = m6Var.R;
            B.C = z14 | (!kotlin.jvm.internal.h.q0(str8, str9));
            B.f32723u = str9;
        }
        r8 r8Var = r8.f8580v;
        ((s8) r8Var.f8581u.a()).a();
        if (J().q(null, j2.f32649g0)) {
            B.x(m6Var.N);
        } else {
            ((s8) r8Var.f8581u.a()).a();
            if (J().q(null, j2.f32647f0)) {
                B.x(null);
            }
        }
        w3 w3Var5 = y3Var.D;
        y3.k(w3Var5);
        w3Var5.h();
        if (B.C) {
            k kVar5 = this.f32532w;
            H(kVar5);
            kVar5.n(B);
        }
        return B;
    }

    public final f J() {
        y3 y3Var = this.F;
        v9.o.h(y3Var);
        return y3Var.A;
    }

    public final h K(String str) {
        String str2;
        h hVar = h.f32583b;
        a().h();
        g();
        h hVar2 = (h) this.U.get(str);
        if (hVar2 == null) {
            k kVar = this.f32532w;
            H(kVar);
            v9.o.h(str);
            kVar.h();
            kVar.i();
            Cursor cursor = null;
            try {
                try {
                    cursor = kVar.A().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        str2 = "G1";
                    }
                    h b10 = h.b(str2);
                    r(str, b10);
                    return b10;
                } catch (SQLiteException e10) {
                    w2 w2Var = kVar.f32943u.C;
                    y3.k(w2Var);
                    w2Var.f32925z.d("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e10);
                    throw e10;
                }
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
        return hVar2;
    }

    public final k L() {
        k kVar = this.f32532w;
        H(kVar);
        return kVar;
    }

    public final d3 M() {
        d3 d3Var = this.f32533x;
        if (d3Var != null) {
            return d3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final f6 O() {
        f6 f6Var = this.A;
        H(f6Var);
        return f6Var;
    }

    public final k6 P() {
        y3 y3Var = this.F;
        v9.o.h(y3Var);
        k6 k6Var = y3Var.F;
        y3.i(k6Var);
        return k6Var;
    }

    public final String Q(h hVar) {
        if (hVar.f(g.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            P().q().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    @Override // ta.f4
    public final w3 a() {
        y3 y3Var = this.F;
        v9.o.h(y3Var);
        w3 w3Var = y3Var.D;
        y3.k(w3Var);
        return w3Var;
    }

    @Override // ta.f4
    public final w2 b() {
        y3 y3Var = this.F;
        v9.o.h(y3Var);
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        return w2Var;
    }

    @Override // ta.f4
    public final aa.c c() {
        y3 y3Var = this.F;
        v9.o.h(y3Var);
        return y3Var.H;
    }

    @Override // ta.f4
    public final kotlinx.coroutines.e0 d() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        boolean z10;
        FileLock tryLock;
        a().h();
        g();
        if (!this.H) {
            this.H = true;
            a().h();
            FileLock fileLock = this.P;
            int i6 = 0;
            y3 y3Var = this.F;
            if (fileLock != null && fileLock.isValid()) {
                b().H.b("Storage concurrent access okay");
            } else {
                this.f32532w.f32943u.getClass();
                try {
                    FileChannel channel = new RandomAccessFile(new File(y3Var.f32953u.getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                    this.Q = channel;
                    tryLock = channel.tryLock();
                    this.P = tryLock;
                } catch (FileNotFoundException e10) {
                    b().f32925z.c(e10, "Failed to acquire storage lock");
                } catch (IOException e11) {
                    b().f32925z.c(e11, "Failed to access storage lock file");
                } catch (OverlappingFileLockException e12) {
                    b().C.c(e12, "Storage lock already acquired");
                }
                if (tryLock != null) {
                    b().H.b("Storage concurrent access okay");
                } else {
                    b().f32925z.b("Storage concurrent data access panic");
                    z10 = false;
                    if (!z10) {
                        FileChannel fileChannel = this.Q;
                        a().h();
                        if (fileChannel != null && fileChannel.isOpen()) {
                            ByteBuffer allocate = ByteBuffer.allocate(4);
                            try {
                                fileChannel.position(0L);
                                int read = fileChannel.read(allocate);
                                if (read != 4) {
                                    if (read != -1) {
                                        b().C.c(Integer.valueOf(read), "Unexpected data length. Bytes read");
                                    }
                                } else {
                                    allocate.flip();
                                    i6 = allocate.getInt();
                                }
                            } catch (IOException e13) {
                                b().f32925z.c(e13, "Failed to read from channel");
                            }
                        } else {
                            b().f32925z.b("Bad channel to read from");
                        }
                        n2 p10 = y3Var.p();
                        p10.i();
                        int i10 = p10.f32762y;
                        a().h();
                        if (i6 > i10) {
                            w2 b10 = b();
                            b10.f32925z.d("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i6), Integer.valueOf(i10));
                            return;
                        } else if (i6 < i10) {
                            FileChannel fileChannel2 = this.Q;
                            a().h();
                            if (fileChannel2 != null && fileChannel2.isOpen()) {
                                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                                allocate2.putInt(i10);
                                allocate2.flip();
                                try {
                                    fileChannel2.truncate(0L);
                                    fileChannel2.write(allocate2);
                                    fileChannel2.force(true);
                                    if (fileChannel2.size() != 4) {
                                        b().f32925z.c(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                                    }
                                    w2 b11 = b();
                                    b11.H.d("Storage version upgraded. Previous, current version", Integer.valueOf(i6), Integer.valueOf(i10));
                                    return;
                                } catch (IOException e14) {
                                    b().f32925z.c(e14, "Failed to write to channel");
                                }
                            } else {
                                b().f32925z.b("Bad channel to read from");
                            }
                            w2 b12 = b();
                            b12.f32925z.d("Storage version upgrade failed. Previous, current version", Integer.valueOf(i6), Integer.valueOf(i10));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
            }
            z10 = true;
            if (!z10) {
            }
        }
    }

    @Override // ta.f4
    public final Context f() {
        return this.F.f32953u;
    }

    public final void g() {
        if (this.G) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }

    public final void h(l4 l4Var) {
        t.b bVar;
        t.b bVar2;
        r3 r3Var = this.f32530u;
        a().h();
        if (TextUtils.isEmpty(l4Var.H()) && TextUtils.isEmpty(l4Var.B())) {
            String D = l4Var.D();
            v9.o.h(D);
            l(D, 204, null, null, null);
            return;
        }
        Uri.Builder builder = new Uri.Builder();
        String H = l4Var.H();
        if (TextUtils.isEmpty(H)) {
            H = l4Var.B();
        }
        t.b bVar3 = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) j2.f32646e.a(null)).encodedAuthority((String) j2.f.a(null)).path("config/app/".concat(String.valueOf(H))).appendQueryParameter("platform", "android");
        this.D.f32943u.A.m();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String D2 = l4Var.D();
            v9.o.h(D2);
            URL url = new URL(uri);
            b().H.c(D2, "Fetching remote configuration");
            H(r3Var);
            com.google.android.gms.internal.measurement.c2 r = r3Var.r(D2);
            H(r3Var);
            r3Var.h();
            String str = (String) r3Var.G.getOrDefault(D2, null);
            if (r != null) {
                if (!TextUtils.isEmpty(str)) {
                    bVar2 = new t.b();
                    bVar2.put("If-Modified-Since", str);
                } else {
                    bVar2 = null;
                }
                v9.f8634v.a().a();
                if (J().q(null, j2.f32657k0)) {
                    H(r3Var);
                    r3Var.h();
                    String str2 = (String) r3Var.H.getOrDefault(D2, null);
                    if (!TextUtils.isEmpty(str2)) {
                        if (bVar2 == null) {
                            bVar2 = new t.b();
                        }
                        bVar3 = bVar2;
                        bVar3.put("If-None-Match", str2);
                    }
                }
                bVar = bVar2;
                this.M = true;
                b3 b3Var = this.f32531v;
                H(b3Var);
                a6 a6Var = new a6(this);
                b3Var.h();
                b3Var.i();
                w3 w3Var = b3Var.f32943u.D;
                y3.k(w3Var);
                w3Var.o(new a3(b3Var, D2, url, null, bVar, a6Var));
            }
            bVar = bVar3;
            this.M = true;
            b3 b3Var2 = this.f32531v;
            H(b3Var2);
            a6 a6Var2 = new a6(this);
            b3Var2.h();
            b3Var2.i();
            w3 w3Var2 = b3Var2.f32943u.D;
            y3.k(w3Var2);
            w3Var2.o(new a3(b3Var2, D2, url, null, bVar, a6Var2));
        } catch (MalformedURLException unused) {
            b().f32925z.d("Failed to parse config URL. Not fetching. appId", w2.q(l4Var.D()), uri);
        }
    }

    public final void i(s sVar, m6 m6Var) {
        z4 z4Var;
        boolean z10;
        s sVar2;
        List K;
        y3 y3Var;
        List<c> K2;
        List K3;
        String str;
        v9.o.h(m6Var);
        String str2 = m6Var.f32748u;
        v9.o.e(str2);
        a().h();
        g();
        long j10 = sVar.f32861x;
        x2 b10 = x2.b(sVar);
        a().h();
        if (this.W != null && (str = this.X) != null && str.equals(str2)) {
            z4Var = this.W;
        } else {
            z4Var = null;
        }
        k6.u(z4Var, b10.f32942d, false);
        s a10 = b10.a();
        H(this.A);
        if (TextUtils.isEmpty(m6Var.f32749v) && TextUtils.isEmpty(m6Var.K)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        if (!m6Var.B) {
            I(m6Var);
            return;
        }
        List list = m6Var.N;
        if (list != null) {
            String str3 = a10.f32858u;
            if (list.contains(str3)) {
                Bundle f02 = a10.f32859v.f0();
                f02.putLong("ga_safelisted", 1L);
                sVar2 = new s(a10.f32858u, new q(f02), a10.f32860w, a10.f32861x);
            } else {
                b().G.e("Dropping non-safelisted event. appId, event name, origin", str2, str3, a10.f32860w);
                return;
            }
        } else {
            sVar2 = a10;
        }
        k kVar = this.f32532w;
        H(kVar);
        kVar.N();
        try {
            k kVar2 = this.f32532w;
            H(kVar2);
            v9.o.e(str2);
            kVar2.h();
            kVar2.i();
            int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i6 < 0) {
                w2 w2Var = kVar2.f32943u.C;
                y3.k(w2Var);
                w2Var.C.d("Invalid time querying timed out conditional properties", w2.q(str2), Long.valueOf(j10));
                K = Collections.emptyList();
            } else {
                K = kVar2.K("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
            }
            Iterator it = K.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                y3Var = this.F;
                if (!hasNext) {
                    break;
                }
                c cVar = (c) it.next();
                if (cVar != null) {
                    b().H.e("User property timed out", cVar.f32491u, y3Var.G.f(cVar.f32493w.f32578v), cVar.f32493w.f0());
                    s sVar3 = cVar.A;
                    if (sVar3 != null) {
                        u(new s(sVar3, j10), m6Var);
                    }
                    k kVar3 = this.f32532w;
                    H(kVar3);
                    kVar3.w(str2, cVar.f32493w.f32578v);
                }
            }
            k kVar4 = this.f32532w;
            H(kVar4);
            v9.o.e(str2);
            kVar4.h();
            kVar4.i();
            if (i6 < 0) {
                w2 w2Var2 = kVar4.f32943u.C;
                y3.k(w2Var2);
                w2Var2.C.d("Invalid time querying expired conditional properties", w2.q(str2), Long.valueOf(j10));
                K2 = Collections.emptyList();
            } else {
                K2 = kVar4.K("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
            }
            ArrayList arrayList = new ArrayList(K2.size());
            for (c cVar2 : K2) {
                if (cVar2 != null) {
                    b().H.e("User property expired", cVar2.f32491u, y3Var.G.f(cVar2.f32493w.f32578v), cVar2.f32493w.f0());
                    k kVar5 = this.f32532w;
                    H(kVar5);
                    kVar5.l(str2, cVar2.f32493w.f32578v);
                    s sVar4 = cVar2.E;
                    if (sVar4 != null) {
                        arrayList.add(sVar4);
                    }
                    k kVar6 = this.f32532w;
                    H(kVar6);
                    kVar6.w(str2, cVar2.f32493w.f32578v);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                u(new s((s) it2.next(), j10), m6Var);
            }
            k kVar7 = this.f32532w;
            H(kVar7);
            y3 y3Var2 = kVar7.f32943u;
            String str4 = sVar2.f32858u;
            v9.o.e(str2);
            v9.o.e(str4);
            kVar7.h();
            kVar7.i();
            if (i6 < 0) {
                w2 w2Var3 = y3Var2.C;
                y3.k(w2Var3);
                w2Var3.C.e("Invalid time querying triggered conditional properties", w2.q(str2), y3Var2.G.d(str4), Long.valueOf(j10));
                K3 = Collections.emptyList();
            } else {
                K3 = kVar7.K("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
            }
            ArrayList arrayList2 = new ArrayList(K3.size());
            Iterator it3 = K3.iterator();
            while (it3.hasNext()) {
                c cVar3 = (c) it3.next();
                if (cVar3 != null) {
                    g6 g6Var = cVar3.f32493w;
                    String str5 = cVar3.f32491u;
                    v9.o.h(str5);
                    String str6 = cVar3.f32492v;
                    String str7 = g6Var.f32578v;
                    Object f03 = g6Var.f0();
                    v9.o.h(f03);
                    Iterator it4 = it3;
                    i6 i6Var = new i6(str5, str6, str7, j10, f03);
                    Object obj = i6Var.f32635e;
                    String str8 = i6Var.f32633c;
                    k kVar8 = this.f32532w;
                    H(kVar8);
                    if (kVar8.s(i6Var)) {
                        b().H.e("User property triggered", cVar3.f32491u, y3Var.G.f(str8), obj);
                    } else {
                        b().f32925z.e("Too many active user properties, ignoring", w2.q(cVar3.f32491u), y3Var.G.f(str8), obj);
                    }
                    s sVar5 = cVar3.C;
                    if (sVar5 != null) {
                        arrayList2.add(sVar5);
                    }
                    cVar3.f32493w = new g6(i6Var);
                    cVar3.f32495y = true;
                    k kVar9 = this.f32532w;
                    H(kVar9);
                    kVar9.r(cVar3);
                    it3 = it4;
                }
            }
            u(sVar2, m6Var);
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                u(new s((s) it5.next(), j10), m6Var);
            }
            k kVar10 = this.f32532w;
            H(kVar10);
            kVar10.m();
        } finally {
            k kVar11 = this.f32532w;
            H(kVar11);
            kVar11.O();
        }
    }

    public final void j(s sVar, String str) {
        k kVar = this.f32532w;
        H(kVar);
        l4 B = kVar.B(str);
        if (B != null && !TextUtils.isEmpty(B.F())) {
            Boolean z10 = z(B);
            if (z10 == null) {
                if (!"_ui".equals(sVar.f32858u)) {
                    w2 b10 = b();
                    b10.C.c(w2.q(str), "Could not find package. appId");
                }
            } else if (!z10.booleanValue()) {
                w2 b11 = b();
                b11.f32925z.c(w2.q(str), "App version does not match; dropping event. appId");
                return;
            }
            String H = B.H();
            String F = B.F();
            long z11 = B.z();
            y3 y3Var = B.f32705a;
            w3 w3Var = y3Var.D;
            y3.k(w3Var);
            w3Var.h();
            String str2 = B.f32715l;
            w3 w3Var2 = y3Var.D;
            y3.k(w3Var2);
            w3Var2.h();
            long j10 = B.f32716m;
            w3 w3Var3 = y3Var.D;
            y3.k(w3Var3);
            w3Var3.h();
            long j11 = B.f32717n;
            w3 w3Var4 = y3Var.D;
            y3.k(w3Var4);
            w3Var4.h();
            boolean z12 = B.f32718o;
            String G = B.G();
            w3 w3Var5 = y3Var.D;
            y3.k(w3Var5);
            w3Var5.h();
            boolean y10 = B.y();
            String B2 = B.B();
            w3 w3Var6 = y3Var.D;
            y3.k(w3Var6);
            w3Var6.h();
            Boolean bool = B.r;
            long A = B.A();
            w3 w3Var7 = y3Var.D;
            y3.k(w3Var7);
            w3Var7.h();
            k(sVar, new m6(str, H, F, z11, str2, j10, j11, null, z12, false, G, 0L, 0, y10, false, B2, bool, A, B.f32722t, K(str).e(), "", null));
            return;
        }
        b().G.c(str, "No app data available; dropping event");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0146: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:49:0x0146 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(s sVar, m6 m6Var) {
        Cursor cursor;
        Cursor cursor2;
        s a10;
        v9.o.e(m6Var.f32748u);
        x2 b10 = x2.b(sVar);
        k6 P = P();
        k kVar = this.f32532w;
        H(kVar);
        String str = m6Var.f32748u;
        y3 y3Var = kVar.f32943u;
        kVar.h();
        kVar.i();
        Cursor cursor3 = null;
        r4 = null;
        Bundle bundle = null;
        try {
            try {
                cursor = kVar.A().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                } catch (SQLiteException e10) {
                    e = e10;
                    w2 w2Var = y3Var.C;
                    y3.k(w2Var);
                    w2Var.f32925z.c(e, "Error selecting default event parameters");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.H.b("Default event parameters not found");
        } else {
            try {
                com.google.android.gms.internal.measurement.m2 m2Var = (com.google.android.gms.internal.measurement.m2) ((com.google.android.gms.internal.measurement.l2) f6.z(com.google.android.gms.internal.measurement.m2.y(), cursor.getBlob(0))).f();
                kVar.f32947v.O();
                com.google.android.gms.internal.measurement.b6<com.google.android.gms.internal.measurement.q2> C = m2Var.C();
                Bundle bundle2 = new Bundle();
                for (com.google.android.gms.internal.measurement.q2 q2Var : C) {
                    String A = q2Var.A();
                    if (q2Var.N()) {
                        bundle2.putDouble(A, q2Var.u());
                    } else if (q2Var.O()) {
                        bundle2.putFloat(A, q2Var.v());
                    } else if (q2Var.R()) {
                        bundle2.putString(A, q2Var.B());
                    } else if (q2Var.P()) {
                        bundle2.putLong(A, q2Var.x());
                    }
                }
                cursor.close();
                bundle = bundle2;
            } catch (IOException e12) {
                w2 w2Var3 = y3Var.C;
                y3.k(w2Var3);
                w2Var3.f32925z.d("Failed to retrieve default event parameters. appId", w2.q(str), e12);
            }
            P.v(b10.f32942d, bundle);
            k6 P2 = P();
            f J = J();
            J.getClass();
            P2.w(b10, Math.max(Math.min(J.l(str, j2.I), 100), 25));
            a10 = b10.a();
            if ("_cmp".equals(a10.f32858u)) {
                q qVar = a10.f32859v;
                if ("referrer API v2".equals(qVar.f32819u.getString("_cis"))) {
                    String string = qVar.f32819u.getString("gclid");
                    if (!TextUtils.isEmpty(string)) {
                        s(new g6(a10.f32861x, string, "_lgclid", "auto"), m6Var);
                    }
                }
            }
            i(a10, m6Var);
        }
        cursor.close();
        P.v(b10.f32942d, bundle);
        k6 P22 = P();
        f J2 = J();
        J2.getClass();
        P22.w(b10, Math.max(Math.min(J2.l(str, j2.I), 100), 25));
        a10 = b10.a();
        if ("_cmp".equals(a10.f32858u)) {
        }
        i(a10, m6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #1 {all -> 0x01b9, blocks: (B:4:0x0010, B:5:0x0012, B:70:0x01a2, B:6:0x002a, B:16:0x0049, B:69:0x019a, B:22:0x0065, B:26:0x0086, B:31:0x00dd, B:30:0x00c9, B:35:0x00e7, B:38:0x00f3, B:40:0x00f9, B:42:0x0101, B:45:0x0118, B:48:0x0124, B:50:0x012a, B:55:0x0137, B:59:0x014d, B:61:0x0167, B:63:0x0182, B:65:0x018d, B:67:0x0193, B:68:0x0197, B:62:0x0173, B:56:0x013e, B:58:0x0147), top: B:78:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147 A[Catch: all -> 0x00e2, TryCatch #1 {all -> 0x01b9, blocks: (B:4:0x0010, B:5:0x0012, B:70:0x01a2, B:6:0x002a, B:16:0x0049, B:69:0x019a, B:22:0x0065, B:26:0x0086, B:31:0x00dd, B:30:0x00c9, B:35:0x00e7, B:38:0x00f3, B:40:0x00f9, B:42:0x0101, B:45:0x0118, B:48:0x0124, B:50:0x012a, B:55:0x0137, B:59:0x014d, B:61:0x0167, B:63:0x0182, B:65:0x018d, B:67:0x0193, B:68:0x0197, B:62:0x0173, B:56:0x013e, B:58:0x0147), top: B:78:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167 A[Catch: all -> 0x00e2, TryCatch #1 {all -> 0x01b9, blocks: (B:4:0x0010, B:5:0x0012, B:70:0x01a2, B:6:0x002a, B:16:0x0049, B:69:0x019a, B:22:0x0065, B:26:0x0086, B:31:0x00dd, B:30:0x00c9, B:35:0x00e7, B:38:0x00f3, B:40:0x00f9, B:42:0x0101, B:45:0x0118, B:48:0x0124, B:50:0x012a, B:55:0x0137, B:59:0x014d, B:61:0x0167, B:63:0x0182, B:65:0x018d, B:67:0x0193, B:68:0x0197, B:62:0x0173, B:56:0x013e, B:58:0x0147), top: B:78:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0173 A[Catch: all -> 0x00e2, TryCatch #1 {all -> 0x01b9, blocks: (B:4:0x0010, B:5:0x0012, B:70:0x01a2, B:6:0x002a, B:16:0x0049, B:69:0x019a, B:22:0x0065, B:26:0x0086, B:31:0x00dd, B:30:0x00c9, B:35:0x00e7, B:38:0x00f3, B:40:0x00f9, B:42:0x0101, B:45:0x0118, B:48:0x0124, B:50:0x012a, B:55:0x0137, B:59:0x014d, B:61:0x0167, B:63:0x0182, B:65:0x018d, B:67:0x0193, B:68:0x0197, B:62:0x0173, B:56:0x013e, B:58:0x0147), top: B:78:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d A[Catch: all -> 0x00e2, TryCatch #1 {all -> 0x01b9, blocks: (B:4:0x0010, B:5:0x0012, B:70:0x01a2, B:6:0x002a, B:16:0x0049, B:69:0x019a, B:22:0x0065, B:26:0x0086, B:31:0x00dd, B:30:0x00c9, B:35:0x00e7, B:38:0x00f3, B:40:0x00f9, B:42:0x0101, B:45:0x0118, B:48:0x0124, B:50:0x012a, B:55:0x0137, B:59:0x014d, B:61:0x0167, B:63:0x0182, B:65:0x018d, B:67:0x0193, B:68:0x0197, B:62:0x0173, B:56:0x013e, B:58:0x0147), top: B:78:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(String str, int i6, Throwable th2, byte[] bArr, Map map) {
        boolean z10;
        List list;
        String str2;
        String str3;
        b3 b3Var;
        List list2;
        a().h();
        g();
        v9.o.e(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.M = false;
                A();
            }
        }
        u2 u2Var = b().H;
        Integer valueOf = Integer.valueOf(bArr.length);
        u2Var.c(valueOf, "onConfigFetched. Response size");
        k kVar = this.f32532w;
        H(kVar);
        kVar.N();
        k kVar2 = this.f32532w;
        H(kVar2);
        l4 B = kVar2.B(str);
        boolean z11 = true;
        if (i6 != 200 && i6 != 204) {
            if (i6 == 304) {
                i6 = 304;
            }
            z10 = false;
            if (B == null) {
                b().C.c(w2.q(str), "App does not exist in onConfigFetched. appId");
            } else {
                r3 r3Var = this.f32530u;
                if (!z10 && i6 != 404) {
                    ((kotlin.jvm.internal.b0) c()).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    w3 w3Var = B.f32705a.D;
                    y3.k(w3Var);
                    w3Var.h();
                    boolean z12 = B.C;
                    if (B.E == currentTimeMillis) {
                        z11 = false;
                    }
                    B.C = z12 | z11;
                    B.E = currentTimeMillis;
                    k kVar3 = this.f32532w;
                    H(kVar3);
                    kVar3.n(B);
                    b().H.d("Fetching config failed. code, error", Integer.valueOf(i6), th2);
                    H(r3Var);
                    r3Var.h();
                    r3Var.G.put(str, null);
                    g3 g3Var = this.C.B;
                    ((kotlin.jvm.internal.b0) c()).getClass();
                    g3Var.b(System.currentTimeMillis());
                    if (i6 == 503 || i6 == 429) {
                        g3 g3Var2 = this.C.f32772z;
                        ((kotlin.jvm.internal.b0) c()).getClass();
                        g3Var2.b(System.currentTimeMillis());
                    }
                    C();
                } else {
                    if (map != null) {
                        list = (List) map.get("Last-Modified");
                    } else {
                        list = null;
                    }
                    if (list != null && !list.isEmpty()) {
                        str2 = (String) list.get(0);
                    } else {
                        str2 = null;
                    }
                    v9.f8634v.a().a();
                    if (J().q(null, j2.f32657k0)) {
                        if (map != null) {
                            list2 = (List) map.get("ETag");
                        } else {
                            list2 = null;
                        }
                        if (list2 != null && !list2.isEmpty()) {
                            str3 = (String) list2.get(0);
                            if (i6 != 404 && i6 != 304) {
                                H(r3Var);
                                r3Var.w(str, str2, str3, bArr);
                                ((kotlin.jvm.internal.b0) c()).getClass();
                                B.f(System.currentTimeMillis());
                                k kVar4 = this.f32532w;
                                H(kVar4);
                                kVar4.n(B);
                                if (i6 != 404) {
                                    b().E.c(str, "Config not found. Using empty config. appId");
                                } else {
                                    b().H.d("Successfully fetched config. Got network response. code, size", Integer.valueOf(i6), valueOf);
                                }
                                b3Var = this.f32531v;
                                H(b3Var);
                                if (!b3Var.g() && E()) {
                                    t();
                                } else {
                                    C();
                                }
                            }
                            H(r3Var);
                            if (r3Var.r(str) == null) {
                                H(r3Var);
                                r3Var.w(str, null, null, null);
                            }
                            ((kotlin.jvm.internal.b0) c()).getClass();
                            B.f(System.currentTimeMillis());
                            k kVar42 = this.f32532w;
                            H(kVar42);
                            kVar42.n(B);
                            if (i6 != 404) {
                            }
                            b3Var = this.f32531v;
                            H(b3Var);
                            if (!b3Var.g()) {
                            }
                            C();
                        }
                    }
                    str3 = null;
                    if (i6 != 404) {
                        H(r3Var);
                        r3Var.w(str, str2, str3, bArr);
                        ((kotlin.jvm.internal.b0) c()).getClass();
                        B.f(System.currentTimeMillis());
                        k kVar422 = this.f32532w;
                        H(kVar422);
                        kVar422.n(B);
                        if (i6 != 404) {
                        }
                        b3Var = this.f32531v;
                        H(b3Var);
                        if (!b3Var.g()) {
                        }
                        C();
                    }
                    H(r3Var);
                    if (r3Var.r(str) == null) {
                    }
                    ((kotlin.jvm.internal.b0) c()).getClass();
                    B.f(System.currentTimeMillis());
                    k kVar4222 = this.f32532w;
                    H(kVar4222);
                    kVar4222.n(B);
                    if (i6 != 404) {
                    }
                    b3Var = this.f32531v;
                    H(b3Var);
                    if (!b3Var.g()) {
                    }
                    C();
                }
            }
            k kVar5 = this.f32532w;
            H(kVar5);
            kVar5.m();
            k kVar6 = this.f32532w;
            H(kVar6);
            kVar6.O();
        }
        if (th2 == null) {
            z10 = true;
            if (B == null) {
            }
            k kVar52 = this.f32532w;
            H(kVar52);
            kVar52.m();
            k kVar62 = this.f32532w;
            H(kVar62);
            kVar62.O();
        }
        z10 = false;
        if (B == null) {
        }
        k kVar522 = this.f32532w;
        H(kVar522);
        kVar522.m();
        k kVar622 = this.f32532w;
        H(kVar622);
        kVar622.O();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:98|99)|(2:101|(8:103|(3:105|(2:107|(1:109))(1:128)|110)(1:129)|111|(1:113)(1:127)|114|115|116|(4:118|(1:120)|121|(1:123))))|130|115|116|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x046b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x046c, code lost:
        b().f32925z.d("Application info is null, first open report might be inaccurate. appId", ta.w2.q(r8), r0);
        r0 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03c3 A[Catch: all -> 0x0534, TryCatch #2 {all -> 0x0534, blocks: (B:23:0x00af, B:25:0x00bf, B:43:0x0111, B:45:0x011f, B:47:0x0132, B:49:0x014c, B:50:0x0159, B:52:0x016b, B:54:0x01bb, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:75:0x020b, B:77:0x0216, B:81:0x0223, B:84:0x0234, B:88:0x023f, B:90:0x0242, B:91:0x0262, B:93:0x0267, B:96:0x0282, B:99:0x0298, B:102:0x02bf, B:137:0x038f, B:139:0x03c3, B:140:0x03c6, B:142:0x03de, B:181:0x049a, B:182:0x049d, B:190:0x0523, B:144:0x03f1, B:149:0x040e, B:151:0x0416, B:153:0x041c, B:157:0x042f, B:161:0x0440, B:165:0x044c, B:168:0x0461, B:171:0x046c, B:173:0x047e, B:175:0x0484, B:176:0x0489, B:178:0x048f, B:158:0x0437, B:147:0x03fc, B:104:0x02cf, B:106:0x02dd, B:107:0x02ea, B:109:0x02f3, B:112:0x0314, B:113:0x0320, B:115:0x0327, B:117:0x032d, B:119:0x0337, B:121:0x033d, B:123:0x0343, B:125:0x0349, B:126:0x034e, B:131:0x0366, B:134:0x036b, B:135:0x037a, B:136:0x0385, B:183:0x04b5, B:185:0x04e7, B:186:0x04ea, B:187:0x0501, B:189:0x0508, B:94:0x0274, B:71:0x01f1, B:29:0x00cc, B:31:0x00d0, B:35:0x00e0, B:37:0x00ef, B:39:0x00f9, B:42:0x0100), top: B:201:0x00af, inners: #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03de A[Catch: all -> 0x0534, TRY_LEAVE, TryCatch #2 {all -> 0x0534, blocks: (B:23:0x00af, B:25:0x00bf, B:43:0x0111, B:45:0x011f, B:47:0x0132, B:49:0x014c, B:50:0x0159, B:52:0x016b, B:54:0x01bb, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:75:0x020b, B:77:0x0216, B:81:0x0223, B:84:0x0234, B:88:0x023f, B:90:0x0242, B:91:0x0262, B:93:0x0267, B:96:0x0282, B:99:0x0298, B:102:0x02bf, B:137:0x038f, B:139:0x03c3, B:140:0x03c6, B:142:0x03de, B:181:0x049a, B:182:0x049d, B:190:0x0523, B:144:0x03f1, B:149:0x040e, B:151:0x0416, B:153:0x041c, B:157:0x042f, B:161:0x0440, B:165:0x044c, B:168:0x0461, B:171:0x046c, B:173:0x047e, B:175:0x0484, B:176:0x0489, B:178:0x048f, B:158:0x0437, B:147:0x03fc, B:104:0x02cf, B:106:0x02dd, B:107:0x02ea, B:109:0x02f3, B:112:0x0314, B:113:0x0320, B:115:0x0327, B:117:0x032d, B:119:0x0337, B:121:0x033d, B:123:0x0343, B:125:0x0349, B:126:0x034e, B:131:0x0366, B:134:0x036b, B:135:0x037a, B:136:0x0385, B:183:0x04b5, B:185:0x04e7, B:186:0x04ea, B:187:0x0501, B:189:0x0508, B:94:0x0274, B:71:0x01f1, B:29:0x00cc, B:31:0x00d0, B:35:0x00e0, B:37:0x00ef, B:39:0x00f9, B:42:0x0100), top: B:201:0x00af, inners: #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047e A[Catch: all -> 0x0534, TryCatch #2 {all -> 0x0534, blocks: (B:23:0x00af, B:25:0x00bf, B:43:0x0111, B:45:0x011f, B:47:0x0132, B:49:0x014c, B:50:0x0159, B:52:0x016b, B:54:0x01bb, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:75:0x020b, B:77:0x0216, B:81:0x0223, B:84:0x0234, B:88:0x023f, B:90:0x0242, B:91:0x0262, B:93:0x0267, B:96:0x0282, B:99:0x0298, B:102:0x02bf, B:137:0x038f, B:139:0x03c3, B:140:0x03c6, B:142:0x03de, B:181:0x049a, B:182:0x049d, B:190:0x0523, B:144:0x03f1, B:149:0x040e, B:151:0x0416, B:153:0x041c, B:157:0x042f, B:161:0x0440, B:165:0x044c, B:168:0x0461, B:171:0x046c, B:173:0x047e, B:175:0x0484, B:176:0x0489, B:178:0x048f, B:158:0x0437, B:147:0x03fc, B:104:0x02cf, B:106:0x02dd, B:107:0x02ea, B:109:0x02f3, B:112:0x0314, B:113:0x0320, B:115:0x0327, B:117:0x032d, B:119:0x0337, B:121:0x033d, B:123:0x0343, B:125:0x0349, B:126:0x034e, B:131:0x0366, B:134:0x036b, B:135:0x037a, B:136:0x0385, B:183:0x04b5, B:185:0x04e7, B:186:0x04ea, B:187:0x0501, B:189:0x0508, B:94:0x0274, B:71:0x01f1, B:29:0x00cc, B:31:0x00d0, B:35:0x00e0, B:37:0x00ef, B:39:0x00f9, B:42:0x0100), top: B:201:0x00af, inners: #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x049a A[Catch: all -> 0x0534, TryCatch #2 {all -> 0x0534, blocks: (B:23:0x00af, B:25:0x00bf, B:43:0x0111, B:45:0x011f, B:47:0x0132, B:49:0x014c, B:50:0x0159, B:52:0x016b, B:54:0x01bb, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:75:0x020b, B:77:0x0216, B:81:0x0223, B:84:0x0234, B:88:0x023f, B:90:0x0242, B:91:0x0262, B:93:0x0267, B:96:0x0282, B:99:0x0298, B:102:0x02bf, B:137:0x038f, B:139:0x03c3, B:140:0x03c6, B:142:0x03de, B:181:0x049a, B:182:0x049d, B:190:0x0523, B:144:0x03f1, B:149:0x040e, B:151:0x0416, B:153:0x041c, B:157:0x042f, B:161:0x0440, B:165:0x044c, B:168:0x0461, B:171:0x046c, B:173:0x047e, B:175:0x0484, B:176:0x0489, B:178:0x048f, B:158:0x0437, B:147:0x03fc, B:104:0x02cf, B:106:0x02dd, B:107:0x02ea, B:109:0x02f3, B:112:0x0314, B:113:0x0320, B:115:0x0327, B:117:0x032d, B:119:0x0337, B:121:0x033d, B:123:0x0343, B:125:0x0349, B:126:0x034e, B:131:0x0366, B:134:0x036b, B:135:0x037a, B:136:0x0385, B:183:0x04b5, B:185:0x04e7, B:186:0x04ea, B:187:0x0501, B:189:0x0508, B:94:0x0274, B:71:0x01f1, B:29:0x00cc, B:31:0x00d0, B:35:0x00e0, B:37:0x00ef, B:39:0x00f9, B:42:0x0100), top: B:201:0x00af, inners: #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0501 A[Catch: all -> 0x0534, TryCatch #2 {all -> 0x0534, blocks: (B:23:0x00af, B:25:0x00bf, B:43:0x0111, B:45:0x011f, B:47:0x0132, B:49:0x014c, B:50:0x0159, B:52:0x016b, B:54:0x01bb, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:75:0x020b, B:77:0x0216, B:81:0x0223, B:84:0x0234, B:88:0x023f, B:90:0x0242, B:91:0x0262, B:93:0x0267, B:96:0x0282, B:99:0x0298, B:102:0x02bf, B:137:0x038f, B:139:0x03c3, B:140:0x03c6, B:142:0x03de, B:181:0x049a, B:182:0x049d, B:190:0x0523, B:144:0x03f1, B:149:0x040e, B:151:0x0416, B:153:0x041c, B:157:0x042f, B:161:0x0440, B:165:0x044c, B:168:0x0461, B:171:0x046c, B:173:0x047e, B:175:0x0484, B:176:0x0489, B:178:0x048f, B:158:0x0437, B:147:0x03fc, B:104:0x02cf, B:106:0x02dd, B:107:0x02ea, B:109:0x02f3, B:112:0x0314, B:113:0x0320, B:115:0x0327, B:117:0x032d, B:119:0x0337, B:121:0x033d, B:123:0x0343, B:125:0x0349, B:126:0x034e, B:131:0x0366, B:134:0x036b, B:135:0x037a, B:136:0x0385, B:183:0x04b5, B:185:0x04e7, B:186:0x04ea, B:187:0x0501, B:189:0x0508, B:94:0x0274, B:71:0x01f1, B:29:0x00cc, B:31:0x00d0, B:35:0x00e0, B:37:0x00ef, B:39:0x00f9, B:42:0x0100), top: B:201:0x00af, inners: #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f A[Catch: all -> 0x0534, TryCatch #2 {all -> 0x0534, blocks: (B:23:0x00af, B:25:0x00bf, B:43:0x0111, B:45:0x011f, B:47:0x0132, B:49:0x014c, B:50:0x0159, B:52:0x016b, B:54:0x01bb, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:75:0x020b, B:77:0x0216, B:81:0x0223, B:84:0x0234, B:88:0x023f, B:90:0x0242, B:91:0x0262, B:93:0x0267, B:96:0x0282, B:99:0x0298, B:102:0x02bf, B:137:0x038f, B:139:0x03c3, B:140:0x03c6, B:142:0x03de, B:181:0x049a, B:182:0x049d, B:190:0x0523, B:144:0x03f1, B:149:0x040e, B:151:0x0416, B:153:0x041c, B:157:0x042f, B:161:0x0440, B:165:0x044c, B:168:0x0461, B:171:0x046c, B:173:0x047e, B:175:0x0484, B:176:0x0489, B:178:0x048f, B:158:0x0437, B:147:0x03fc, B:104:0x02cf, B:106:0x02dd, B:107:0x02ea, B:109:0x02f3, B:112:0x0314, B:113:0x0320, B:115:0x0327, B:117:0x032d, B:119:0x0337, B:121:0x033d, B:123:0x0343, B:125:0x0349, B:126:0x034e, B:131:0x0366, B:134:0x036b, B:135:0x037a, B:136:0x0385, B:183:0x04b5, B:185:0x04e7, B:186:0x04ea, B:187:0x0501, B:189:0x0508, B:94:0x0274, B:71:0x01f1, B:29:0x00cc, B:31:0x00d0, B:35:0x00e0, B:37:0x00ef, B:39:0x00f9, B:42:0x0100), top: B:201:0x00af, inners: #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020b A[Catch: all -> 0x0534, TryCatch #2 {all -> 0x0534, blocks: (B:23:0x00af, B:25:0x00bf, B:43:0x0111, B:45:0x011f, B:47:0x0132, B:49:0x014c, B:50:0x0159, B:52:0x016b, B:54:0x01bb, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:75:0x020b, B:77:0x0216, B:81:0x0223, B:84:0x0234, B:88:0x023f, B:90:0x0242, B:91:0x0262, B:93:0x0267, B:96:0x0282, B:99:0x0298, B:102:0x02bf, B:137:0x038f, B:139:0x03c3, B:140:0x03c6, B:142:0x03de, B:181:0x049a, B:182:0x049d, B:190:0x0523, B:144:0x03f1, B:149:0x040e, B:151:0x0416, B:153:0x041c, B:157:0x042f, B:161:0x0440, B:165:0x044c, B:168:0x0461, B:171:0x046c, B:173:0x047e, B:175:0x0484, B:176:0x0489, B:178:0x048f, B:158:0x0437, B:147:0x03fc, B:104:0x02cf, B:106:0x02dd, B:107:0x02ea, B:109:0x02f3, B:112:0x0314, B:113:0x0320, B:115:0x0327, B:117:0x032d, B:119:0x0337, B:121:0x033d, B:123:0x0343, B:125:0x0349, B:126:0x034e, B:131:0x0366, B:134:0x036b, B:135:0x037a, B:136:0x0385, B:183:0x04b5, B:185:0x04e7, B:186:0x04ea, B:187:0x0501, B:189:0x0508, B:94:0x0274, B:71:0x01f1, B:29:0x00cc, B:31:0x00d0, B:35:0x00e0, B:37:0x00ef, B:39:0x00f9, B:42:0x0100), top: B:201:0x00af, inners: #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0267 A[Catch: all -> 0x0534, TryCatch #2 {all -> 0x0534, blocks: (B:23:0x00af, B:25:0x00bf, B:43:0x0111, B:45:0x011f, B:47:0x0132, B:49:0x014c, B:50:0x0159, B:52:0x016b, B:54:0x01bb, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:75:0x020b, B:77:0x0216, B:81:0x0223, B:84:0x0234, B:88:0x023f, B:90:0x0242, B:91:0x0262, B:93:0x0267, B:96:0x0282, B:99:0x0298, B:102:0x02bf, B:137:0x038f, B:139:0x03c3, B:140:0x03c6, B:142:0x03de, B:181:0x049a, B:182:0x049d, B:190:0x0523, B:144:0x03f1, B:149:0x040e, B:151:0x0416, B:153:0x041c, B:157:0x042f, B:161:0x0440, B:165:0x044c, B:168:0x0461, B:171:0x046c, B:173:0x047e, B:175:0x0484, B:176:0x0489, B:178:0x048f, B:158:0x0437, B:147:0x03fc, B:104:0x02cf, B:106:0x02dd, B:107:0x02ea, B:109:0x02f3, B:112:0x0314, B:113:0x0320, B:115:0x0327, B:117:0x032d, B:119:0x0337, B:121:0x033d, B:123:0x0343, B:125:0x0349, B:126:0x034e, B:131:0x0366, B:134:0x036b, B:135:0x037a, B:136:0x0385, B:183:0x04b5, B:185:0x04e7, B:186:0x04ea, B:187:0x0501, B:189:0x0508, B:94:0x0274, B:71:0x01f1, B:29:0x00cc, B:31:0x00d0, B:35:0x00e0, B:37:0x00ef, B:39:0x00f9, B:42:0x0100), top: B:201:0x00af, inners: #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0274 A[Catch: all -> 0x0534, TryCatch #2 {all -> 0x0534, blocks: (B:23:0x00af, B:25:0x00bf, B:43:0x0111, B:45:0x011f, B:47:0x0132, B:49:0x014c, B:50:0x0159, B:52:0x016b, B:54:0x01bb, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:75:0x020b, B:77:0x0216, B:81:0x0223, B:84:0x0234, B:88:0x023f, B:90:0x0242, B:91:0x0262, B:93:0x0267, B:96:0x0282, B:99:0x0298, B:102:0x02bf, B:137:0x038f, B:139:0x03c3, B:140:0x03c6, B:142:0x03de, B:181:0x049a, B:182:0x049d, B:190:0x0523, B:144:0x03f1, B:149:0x040e, B:151:0x0416, B:153:0x041c, B:157:0x042f, B:161:0x0440, B:165:0x044c, B:168:0x0461, B:171:0x046c, B:173:0x047e, B:175:0x0484, B:176:0x0489, B:178:0x048f, B:158:0x0437, B:147:0x03fc, B:104:0x02cf, B:106:0x02dd, B:107:0x02ea, B:109:0x02f3, B:112:0x0314, B:113:0x0320, B:115:0x0327, B:117:0x032d, B:119:0x0337, B:121:0x033d, B:123:0x0343, B:125:0x0349, B:126:0x034e, B:131:0x0366, B:134:0x036b, B:135:0x037a, B:136:0x0385, B:183:0x04b5, B:185:0x04e7, B:186:0x04ea, B:187:0x0501, B:189:0x0508, B:94:0x0274, B:71:0x01f1, B:29:0x00cc, B:31:0x00d0, B:35:0x00e0, B:37:0x00ef, B:39:0x00f9, B:42:0x0100), top: B:201:0x00af, inners: #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282 A[Catch: all -> 0x0534, TRY_LEAVE, TryCatch #2 {all -> 0x0534, blocks: (B:23:0x00af, B:25:0x00bf, B:43:0x0111, B:45:0x011f, B:47:0x0132, B:49:0x014c, B:50:0x0159, B:52:0x016b, B:54:0x01bb, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:75:0x020b, B:77:0x0216, B:81:0x0223, B:84:0x0234, B:88:0x023f, B:90:0x0242, B:91:0x0262, B:93:0x0267, B:96:0x0282, B:99:0x0298, B:102:0x02bf, B:137:0x038f, B:139:0x03c3, B:140:0x03c6, B:142:0x03de, B:181:0x049a, B:182:0x049d, B:190:0x0523, B:144:0x03f1, B:149:0x040e, B:151:0x0416, B:153:0x041c, B:157:0x042f, B:161:0x0440, B:165:0x044c, B:168:0x0461, B:171:0x046c, B:173:0x047e, B:175:0x0484, B:176:0x0489, B:178:0x048f, B:158:0x0437, B:147:0x03fc, B:104:0x02cf, B:106:0x02dd, B:107:0x02ea, B:109:0x02f3, B:112:0x0314, B:113:0x0320, B:115:0x0327, B:117:0x032d, B:119:0x0337, B:121:0x033d, B:123:0x0343, B:125:0x0349, B:126:0x034e, B:131:0x0366, B:134:0x036b, B:135:0x037a, B:136:0x0385, B:183:0x04b5, B:185:0x04e7, B:186:0x04ea, B:187:0x0501, B:189:0x0508, B:94:0x0274, B:71:0x01f1, B:29:0x00cc, B:31:0x00d0, B:35:0x00e0, B:37:0x00ef, B:39:0x00f9, B:42:0x0100), top: B:201:0x00af, inners: #5, #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(m6 m6Var) {
        long j10;
        l4 B;
        String str;
        String str2;
        String str3;
        p F;
        boolean z10;
        long j11;
        long y10;
        PackageInfo packageInfo;
        m6 m6Var2;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        boolean z11;
        long j12;
        boolean z12;
        boolean z13;
        SQLiteDatabase A;
        String[] strArr;
        int delete;
        a().h();
        g();
        v9.o.h(m6Var);
        String str4 = m6Var.f32748u;
        v9.o.e(str4);
        if (G(m6Var)) {
            k kVar = this.f32532w;
            H(kVar);
            l4 B2 = kVar.B(str4);
            String str5 = m6Var.f32749v;
            if (B2 != null && TextUtils.isEmpty(B2.H()) && !TextUtils.isEmpty(str5)) {
                B2.f(0L);
                k kVar2 = this.f32532w;
                H(kVar2);
                kVar2.n(B2);
                r3 r3Var = this.f32530u;
                H(r3Var);
                r3Var.h();
                r3Var.B.remove(str4);
            }
            if (!m6Var.B) {
                I(m6Var);
                return;
            }
            long j13 = m6Var.G;
            if (j13 == 0) {
                ((kotlin.jvm.internal.b0) c()).getClass();
                j13 = System.currentTimeMillis();
            }
            y3 y3Var = this.F;
            n o10 = y3Var.o();
            Context context = y3Var.f32953u;
            o10.h();
            o10.f32757z = null;
            o10.A = 0L;
            int i6 = m6Var.H;
            if (i6 != 0 && i6 != 1) {
                b().C.d("Incorrect app type, assuming installed app. appId, appType", w2.q(str4), Integer.valueOf(i6));
                i6 = 0;
            }
            k kVar3 = this.f32532w;
            H(kVar3);
            kVar3.N();
            try {
                k kVar4 = this.f32532w;
                H(kVar4);
                i6 G = kVar4.G(str4, "_npa");
                if (G != null && !"auto".equals(G.f32632b)) {
                    k kVar5 = this.f32532w;
                    H(kVar5);
                    v9.o.h(str4);
                    B = kVar5.B(str4);
                    if (B != null) {
                        P();
                        if (k6.W(str5, B.H(), m6Var.K, B.B())) {
                            b().C.c(w2.q(B.D()), "New GMP App Id passed in. Removing cached database data. appId");
                            k kVar6 = this.f32532w;
                            H(kVar6);
                            y3 y3Var2 = kVar6.f32943u;
                            String D = B.D();
                            kVar6.i();
                            kVar6.h();
                            v9.o.e(D);
                            try {
                                A = kVar6.A();
                                strArr = new String[]{D};
                                str3 = "_sysu";
                                try {
                                    delete = A.delete("events", "app_id=?", strArr) + A.delete("user_attributes", "app_id=?", strArr) + A.delete("conditional_properties", "app_id=?", strArr) + A.delete("apps", "app_id=?", strArr) + A.delete("raw_events", "app_id=?", strArr) + A.delete("raw_events_metadata", "app_id=?", strArr) + A.delete("event_filters", "app_id=?", strArr) + A.delete("property_filters", "app_id=?", strArr) + A.delete("audience_filter_values", "app_id=?", strArr) + A.delete("consent_settings", "app_id=?", strArr);
                                    ((h9) g9.f8395v.f8396u.a()).a();
                                    str = "_pfo";
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    str = "_pfo";
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                str = "_pfo";
                                str2 = "_uwa";
                                str3 = "_sysu";
                            }
                            try {
                                str2 = "_uwa";
                                try {
                                    if (y3Var2.A.q(null, j2.f32665o0)) {
                                        delete += A.delete("default_event_params", "app_id=?", strArr);
                                    }
                                    if (delete > 0) {
                                        w2 w2Var = y3Var2.C;
                                        y3.k(w2Var);
                                        w2Var.H.d("Deleted application data. app, records", D, Integer.valueOf(delete));
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    w2 w2Var2 = y3Var2.C;
                                    y3.k(w2Var2);
                                    w2Var2.f32925z.d("Error deleting application data. appId, error", w2.q(D), e);
                                    B = null;
                                    if (B != null) {
                                    }
                                    I(m6Var);
                                    if (i6 == 0) {
                                    }
                                    if (F == null) {
                                    }
                                    k kVar7 = this.f32532w;
                                    H(kVar7);
                                    kVar7.m();
                                }
                            } catch (SQLiteException e13) {
                                e = e13;
                                str2 = "_uwa";
                                w2 w2Var22 = y3Var2.C;
                                y3.k(w2Var22);
                                w2Var22.f32925z.d("Error deleting application data. appId, error", w2.q(D), e);
                                B = null;
                                if (B != null) {
                                }
                                I(m6Var);
                                if (i6 == 0) {
                                }
                                if (F == null) {
                                }
                                k kVar72 = this.f32532w;
                                H(kVar72);
                                kVar72.m();
                            }
                            B = null;
                            if (B != null) {
                                if (B.z() != -2147483648L && B.z() != m6Var.D) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                String F2 = B.F();
                                if (B.z() == -2147483648L && F2 != null && !F2.equals(m6Var.f32750w)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z12 | z13) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("_pv", F2);
                                    i(new s("_au", new q(bundle), "auto", j13), m6Var);
                                }
                            }
                            I(m6Var);
                            if (i6 == 0) {
                                k kVar8 = this.f32532w;
                                H(kVar8);
                                F = kVar8.F(str4, "_f");
                                z10 = false;
                            } else {
                                k kVar9 = this.f32532w;
                                H(kVar9);
                                F = kVar9.F(str4, "_v");
                                z10 = true;
                            }
                            if (F == null) {
                                long j14 = ((j13 / 3600000) + 1) * 3600000;
                                boolean z14 = m6Var.J;
                                if (!z10) {
                                    s(new g6(j13, Long.valueOf(j14), "_fot", "auto"), m6Var);
                                    a().h();
                                    l3 l3Var = this.E;
                                    v9.o.h(l3Var);
                                    boolean isEmpty = str4.isEmpty();
                                    y3 y3Var3 = l3Var.f32704a;
                                    if (isEmpty) {
                                        w2 w2Var3 = y3Var3.C;
                                        y3.k(w2Var3);
                                        w2Var3.D.b("Install Referrer Reporter was called with invalid app package name");
                                    } else {
                                        w3 w3Var = y3Var3.D;
                                        y3.k(w3Var);
                                        w3Var.h();
                                        if (!l3Var.a()) {
                                            w2 w2Var4 = y3Var3.C;
                                            y3.k(w2Var4);
                                            w2Var4.F.b("Install Referrer Reporter is not available");
                                        } else {
                                            k3 k3Var = new k3(l3Var, str4);
                                            w3 w3Var2 = y3Var3.D;
                                            Context context2 = y3Var3.f32953u;
                                            y3.k(w3Var2);
                                            w3Var2.h();
                                            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            j11 = j13;
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            PackageManager packageManager = context2.getPackageManager();
                                            w2 w2Var5 = y3Var3.C;
                                            if (packageManager == null) {
                                                y3.k(w2Var5);
                                                w2Var5.D.b("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                            } else {
                                                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                                                    ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                    if (serviceInfo != null) {
                                                        String str6 = serviceInfo.packageName;
                                                        if (serviceInfo.name != null && "com.android.vending".equals(str6) && l3Var.a()) {
                                                            try {
                                                                boolean a10 = z9.a.b().a(context2, new Intent(intent), k3Var, 1);
                                                                y3.k(w2Var5);
                                                                u2 u2Var = w2Var5.H;
                                                                String str7 = "available";
                                                                if (true != a10) {
                                                                    str7 = "not available";
                                                                }
                                                                u2Var.c(str7, "Install Referrer Service is");
                                                            } catch (RuntimeException e14) {
                                                                y3.k(w2Var5);
                                                                w2Var5.f32925z.c(e14.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } else {
                                                            y3.k(w2Var5);
                                                            w2Var5.C.b("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        }
                                                    }
                                                } else {
                                                    y3.k(w2Var5);
                                                    w2Var5.F.b("Play Service for fetching Install Referrer is unavailable on device");
                                                }
                                            }
                                            a().h();
                                            g();
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("_c", 1L);
                                            bundle2.putLong("_r", 1L);
                                            String str8 = str2;
                                            bundle2.putLong(str8, 0L);
                                            String str9 = str;
                                            bundle2.putLong(str9, 0L);
                                            bundle2.putLong("_sys", 0L);
                                            String str10 = str3;
                                            bundle2.putLong(str10, 0L);
                                            bundle2.putLong("_et", 1L);
                                            if (z14) {
                                                bundle2.putLong("_dac", 1L);
                                            }
                                            k kVar10 = this.f32532w;
                                            H(kVar10);
                                            v9.o.e(str4);
                                            kVar10.h();
                                            kVar10.i();
                                            y10 = kVar10.y(str4);
                                            if (context.getPackageManager() != null) {
                                                b().f32925z.c(w2.q(str4), "PackageManager is null, first open report might be inaccurate. appId");
                                                m6Var2 = m6Var;
                                            } else {
                                                try {
                                                    packageInfo = ca.c.a(context).b(0, str4);
                                                } catch (PackageManager.NameNotFoundException e15) {
                                                    b().f32925z.d("Package info is null, first open report might be inaccurate. appId", w2.q(str4), e15);
                                                    packageInfo = null;
                                                }
                                                if (packageInfo != null) {
                                                    long j15 = packageInfo.firstInstallTime;
                                                    if (j15 != 0) {
                                                        if (j15 != packageInfo.lastUpdateTime) {
                                                            applicationInfo = null;
                                                            if (J().q(null, j2.f32642b0)) {
                                                                if (y10 == 0) {
                                                                    bundle2.putLong(str8, 1L);
                                                                    y10 = 0;
                                                                }
                                                            } else {
                                                                bundle2.putLong(str8, 1L);
                                                            }
                                                            z11 = false;
                                                        } else {
                                                            applicationInfo = null;
                                                            z11 = true;
                                                        }
                                                        if (true != z11) {
                                                            j12 = 0;
                                                        } else {
                                                            j12 = 1;
                                                        }
                                                        m6Var2 = m6Var;
                                                        s(new g6(j11, Long.valueOf(j12), "_fi", "auto"), m6Var2);
                                                        applicationInfo2 = ca.c.a(context).a(0, str4);
                                                        if (applicationInfo2 != null) {
                                                            if ((applicationInfo2.flags & 1) != 0) {
                                                                bundle2.putLong("_sys", 1L);
                                                            }
                                                            if ((applicationInfo2.flags & 128) != 0) {
                                                                bundle2.putLong(str10, 1L);
                                                            }
                                                        }
                                                    }
                                                }
                                                m6Var2 = m6Var;
                                                applicationInfo = null;
                                                applicationInfo2 = ca.c.a(context).a(0, str4);
                                                if (applicationInfo2 != null) {
                                                }
                                            }
                                            if (y10 >= 0) {
                                                bundle2.putLong(str9, y10);
                                            }
                                            k(new s("_f", new q(bundle2), "auto", j11), m6Var2);
                                        }
                                    }
                                    j11 = j13;
                                    a().h();
                                    g();
                                    Bundle bundle22 = new Bundle();
                                    bundle22.putLong("_c", 1L);
                                    bundle22.putLong("_r", 1L);
                                    String str82 = str2;
                                    bundle22.putLong(str82, 0L);
                                    String str92 = str;
                                    bundle22.putLong(str92, 0L);
                                    bundle22.putLong("_sys", 0L);
                                    String str102 = str3;
                                    bundle22.putLong(str102, 0L);
                                    bundle22.putLong("_et", 1L);
                                    if (z14) {
                                    }
                                    k kVar102 = this.f32532w;
                                    H(kVar102);
                                    v9.o.e(str4);
                                    kVar102.h();
                                    kVar102.i();
                                    y10 = kVar102.y(str4);
                                    if (context.getPackageManager() != null) {
                                    }
                                    if (y10 >= 0) {
                                    }
                                    k(new s("_f", new q(bundle22), "auto", j11), m6Var2);
                                } else {
                                    long j16 = j13;
                                    s(new g6(j16, Long.valueOf(j14), "_fvt", "auto"), m6Var);
                                    a().h();
                                    g();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("_c", 1L);
                                    bundle3.putLong("_r", 1L);
                                    bundle3.putLong("_et", 1L);
                                    if (z14) {
                                        bundle3.putLong("_dac", 1L);
                                    }
                                    k(new s("_v", new q(bundle3), "auto", j16), m6Var);
                                }
                            } else {
                                long j17 = j13;
                                if (m6Var.C) {
                                    k(new s("_cd", new q(new Bundle()), "auto", j17), m6Var);
                                }
                            }
                            k kVar722 = this.f32532w;
                            H(kVar722);
                            kVar722.m();
                        }
                    }
                    str = "_pfo";
                    str2 = "_uwa";
                    str3 = "_sysu";
                    if (B != null) {
                    }
                    I(m6Var);
                    if (i6 == 0) {
                    }
                    if (F == null) {
                    }
                    k kVar7222 = this.f32532w;
                    H(kVar7222);
                    kVar7222.m();
                }
                Boolean bool = m6Var.L;
                if (bool != null) {
                    if (true != bool.booleanValue()) {
                        j10 = 0;
                    } else {
                        j10 = 1;
                    }
                    g6 g6Var = new g6(j13, Long.valueOf(j10), "_npa", "auto");
                    if (G == null || !G.f32635e.equals(g6Var.f32580x)) {
                        s(g6Var, m6Var);
                    }
                } else if (G != null) {
                    o(new g6(j13, null, "_npa", "auto"), m6Var);
                }
                k kVar52 = this.f32532w;
                H(kVar52);
                v9.o.h(str4);
                B = kVar52.B(str4);
                if (B != null) {
                }
                str = "_pfo";
                str2 = "_uwa";
                str3 = "_sysu";
                if (B != null) {
                }
                I(m6Var);
                if (i6 == 0) {
                }
                if (F == null) {
                }
                k kVar72222 = this.f32532w;
                H(kVar72222);
                kVar72222.m();
            } finally {
                k kVar11 = this.f32532w;
                H(kVar11);
                kVar11.O();
            }
        }
    }

    public final void n(c cVar, m6 m6Var) {
        Bundle bundle;
        v9.o.h(cVar);
        v9.o.e(cVar.f32491u);
        v9.o.h(cVar.f32493w);
        v9.o.e(cVar.f32493w.f32578v);
        a().h();
        g();
        if (!G(m6Var)) {
            return;
        }
        if (m6Var.B) {
            k kVar = this.f32532w;
            H(kVar);
            kVar.N();
            try {
                I(m6Var);
                String str = cVar.f32491u;
                v9.o.h(str);
                k kVar2 = this.f32532w;
                H(kVar2);
                c C = kVar2.C(str, cVar.f32493w.f32578v);
                y3 y3Var = this.F;
                if (C != null) {
                    b().G.d("Removing conditional user property", cVar.f32491u, y3Var.G.f(cVar.f32493w.f32578v));
                    k kVar3 = this.f32532w;
                    H(kVar3);
                    kVar3.w(str, cVar.f32493w.f32578v);
                    if (C.f32495y) {
                        k kVar4 = this.f32532w;
                        H(kVar4);
                        kVar4.l(str, cVar.f32493w.f32578v);
                    }
                    s sVar = cVar.E;
                    if (sVar != null) {
                        q qVar = sVar.f32859v;
                        if (qVar != null) {
                            bundle = qVar.f0();
                        } else {
                            bundle = null;
                        }
                        s n02 = P().n0(sVar.f32858u, bundle, C.f32492v, sVar.f32861x, true);
                        v9.o.h(n02);
                        u(n02, m6Var);
                    }
                } else {
                    b().C.d("Conditional user property doesn't exist", w2.q(cVar.f32491u), y3Var.G.f(cVar.f32493w.f32578v));
                }
                k kVar5 = this.f32532w;
                H(kVar5);
                kVar5.m();
                return;
            } finally {
                k kVar6 = this.f32532w;
                H(kVar6);
                kVar6.O();
            }
        }
        I(m6Var);
    }

    public final void o(g6 g6Var, m6 m6Var) {
        Boolean bool;
        long j10;
        a().h();
        g();
        if (!G(m6Var)) {
            return;
        }
        if (!m6Var.B) {
            I(m6Var);
        } else if ("_npa".equals(g6Var.f32578v) && (bool = m6Var.L) != null) {
            b().G.b("Falling back to manifest metadata value for ad personalization");
            ((kotlin.jvm.internal.b0) c()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (true != bool.booleanValue()) {
                j10 = 0;
            } else {
                j10 = 1;
            }
            s(new g6(currentTimeMillis, Long.valueOf(j10), "_npa", "auto"), m6Var);
        } else {
            w2 b10 = b();
            y3 y3Var = this.F;
            r2 r2Var = y3Var.G;
            String str = g6Var.f32578v;
            b10.G.c(r2Var.f(str), "Removing user property");
            k kVar = this.f32532w;
            H(kVar);
            kVar.N();
            try {
                I(m6Var);
                boolean equals = "_id".equals(str);
                String str2 = m6Var.f32748u;
                if (equals) {
                    k kVar2 = this.f32532w;
                    H(kVar2);
                    v9.o.h(str2);
                    kVar2.l(str2, "_lair");
                }
                k kVar3 = this.f32532w;
                H(kVar3);
                v9.o.h(str2);
                kVar3.l(str2, str);
                k kVar4 = this.f32532w;
                H(kVar4);
                kVar4.m();
                b().G.c(y3Var.G.f(str), "User property removed");
            } finally {
                k kVar5 = this.f32532w;
                H(kVar5);
                kVar5.O();
            }
        }
    }

    public final void p(m6 m6Var) {
        if (this.R != null) {
            ArrayList arrayList = new ArrayList();
            this.S = arrayList;
            arrayList.addAll(this.R);
        }
        k kVar = this.f32532w;
        H(kVar);
        y3 y3Var = kVar.f32943u;
        String str = m6Var.f32748u;
        v9.o.h(str);
        v9.o.e(str);
        kVar.h();
        kVar.i();
        try {
            SQLiteDatabase A = kVar.A();
            String[] strArr = {str};
            int delete = A.delete("apps", "app_id=?", strArr) + A.delete("events", "app_id=?", strArr) + A.delete("user_attributes", "app_id=?", strArr) + A.delete("conditional_properties", "app_id=?", strArr) + A.delete("raw_events", "app_id=?", strArr) + A.delete("raw_events_metadata", "app_id=?", strArr) + A.delete("queue", "app_id=?", strArr) + A.delete("audience_filter_values", "app_id=?", strArr) + A.delete("main_event_params", "app_id=?", strArr) + A.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.H.d("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.f32925z.d("Error resetting analytics data. appId, error", w2.q(str), e10);
        }
        if (m6Var.B) {
            m(m6Var);
        }
    }

    public final void q(c cVar, m6 m6Var) {
        s sVar;
        v9.o.h(cVar);
        v9.o.e(cVar.f32491u);
        v9.o.h(cVar.f32492v);
        v9.o.h(cVar.f32493w);
        v9.o.e(cVar.f32493w.f32578v);
        a().h();
        g();
        if (!G(m6Var)) {
            return;
        }
        if (!m6Var.B) {
            I(m6Var);
            return;
        }
        c cVar2 = new c(cVar);
        boolean z10 = false;
        cVar2.f32495y = false;
        k kVar = this.f32532w;
        H(kVar);
        kVar.N();
        try {
            k kVar2 = this.f32532w;
            H(kVar2);
            String str = cVar2.f32491u;
            v9.o.h(str);
            c C = kVar2.C(str, cVar2.f32493w.f32578v);
            y3 y3Var = this.F;
            if (C != null && !C.f32492v.equals(cVar2.f32492v)) {
                b().C.e("Updating a conditional user property with different origin. name, origin, origin (from DB)", y3Var.G.f(cVar2.f32493w.f32578v), cVar2.f32492v, C.f32492v);
            }
            if (C != null && C.f32495y) {
                cVar2.f32492v = C.f32492v;
                cVar2.f32494x = C.f32494x;
                cVar2.B = C.B;
                cVar2.f32496z = C.f32496z;
                cVar2.C = C.C;
                cVar2.f32495y = true;
                g6 g6Var = cVar2.f32493w;
                cVar2.f32493w = new g6(C.f32493w.f32579w, g6Var.f0(), g6Var.f32578v, C.f32493w.f32582z);
            } else if (TextUtils.isEmpty(cVar2.f32496z)) {
                g6 g6Var2 = cVar2.f32493w;
                cVar2.f32493w = new g6(cVar2.f32494x, g6Var2.f0(), g6Var2.f32578v, cVar2.f32493w.f32582z);
                cVar2.f32495y = true;
                z10 = true;
            }
            if (cVar2.f32495y) {
                g6 g6Var3 = cVar2.f32493w;
                String str2 = cVar2.f32491u;
                v9.o.h(str2);
                String str3 = cVar2.f32492v;
                String str4 = g6Var3.f32578v;
                long j10 = g6Var3.f32579w;
                Object f02 = g6Var3.f0();
                v9.o.h(f02);
                i6 i6Var = new i6(str2, str3, str4, j10, f02);
                Object obj = i6Var.f32635e;
                String str5 = i6Var.f32633c;
                k kVar3 = this.f32532w;
                H(kVar3);
                if (kVar3.s(i6Var)) {
                    b().G.e("User property updated immediately", cVar2.f32491u, y3Var.G.f(str5), obj);
                } else {
                    b().f32925z.e("(2)Too many active user properties, ignoring", w2.q(cVar2.f32491u), y3Var.G.f(str5), obj);
                }
                if (z10 && (sVar = cVar2.C) != null) {
                    u(new s(sVar, cVar2.f32494x), m6Var);
                }
            }
            k kVar4 = this.f32532w;
            H(kVar4);
            if (kVar4.r(cVar2)) {
                b().G.e("Conditional property added", cVar2.f32491u, y3Var.G.f(cVar2.f32493w.f32578v), cVar2.f32493w.f0());
            } else {
                b().f32925z.e("Too many conditional properties, ignoring", w2.q(cVar2.f32491u), y3Var.G.f(cVar2.f32493w.f32578v), cVar2.f32493w.f0());
            }
            k kVar5 = this.f32532w;
            H(kVar5);
            kVar5.m();
        } finally {
            k kVar6 = this.f32532w;
            H(kVar6);
            kVar6.O();
        }
    }

    public final void r(String str, h hVar) {
        a().h();
        g();
        this.U.put(str, hVar);
        k kVar = this.f32532w;
        H(kVar);
        y3 y3Var = kVar.f32943u;
        v9.o.h(str);
        kVar.h();
        kVar.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", hVar.e());
        try {
            if (kVar.A().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.f32925z.c(w2.q(str), "Failed to insert/update consent setting (got -1). appId");
            }
        } catch (SQLiteException e10) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.f32925z.d("Error storing consent setting. appId, error", w2.q(str), e10);
        }
    }

    public final void s(g6 g6Var, m6 m6Var) {
        long j10;
        int i6;
        int i10;
        a().h();
        g();
        if (!G(m6Var)) {
            return;
        }
        if (!m6Var.B) {
            I(m6Var);
            return;
        }
        int g02 = P().g0(g6Var.f32578v);
        a6 a6Var = this.Y;
        String str = g6Var.f32578v;
        if (g02 != 0) {
            P();
            J();
            String o10 = k6.o(str, 24, true);
            if (str != null) {
                i10 = str.length();
            } else {
                i10 = 0;
            }
            P();
            k6.x(a6Var, m6Var.f32748u, g02, "_ev", o10, i10);
            return;
        }
        int c0 = P().c0(g6Var.f0(), str);
        if (c0 != 0) {
            P();
            J();
            String o11 = k6.o(str, 24, true);
            Object f02 = g6Var.f0();
            if (f02 != null && ((f02 instanceof String) || (f02 instanceof CharSequence))) {
                i6 = f02.toString().length();
            } else {
                i6 = 0;
            }
            P();
            k6.x(a6Var, m6Var.f32748u, c0, "_ev", o11, i6);
            return;
        }
        Object m10 = P().m(g6Var.f0(), str);
        if (m10 == null) {
            return;
        }
        boolean equals = "_sid".equals(str);
        String str2 = m6Var.f32748u;
        if (equals) {
            long j11 = g6Var.f32579w;
            String str3 = g6Var.f32582z;
            v9.o.h(str2);
            k kVar = this.f32532w;
            H(kVar);
            i6 G = kVar.G(str2, "_sno");
            if (G != null) {
                Object obj = G.f32635e;
                if (obj instanceof Long) {
                    j10 = ((Long) obj).longValue();
                    s(new g6(j11, Long.valueOf(j10 + 1), "_sno", str3), m6Var);
                }
            }
            if (G != null) {
                w2 b10 = b();
                b10.C.c(G.f32635e, "Retrieved last session number from database does not contain a valid (long) value");
            }
            k kVar2 = this.f32532w;
            H(kVar2);
            p F = kVar2.F(str2, "_s");
            if (F != null) {
                w2 b11 = b();
                long j12 = F.f32794c;
                b11.H.c(Long.valueOf(j12), "Backfill the session number. Last used session number");
                j10 = j12;
            } else {
                j10 = 0;
            }
            s(new g6(j11, Long.valueOf(j10 + 1), "_sno", str3), m6Var);
        }
        v9.o.h(str2);
        String str4 = g6Var.f32582z;
        v9.o.h(str4);
        i6 i6Var = new i6(str2, str4, g6Var.f32578v, g6Var.f32579w, m10);
        w2 b12 = b();
        y3 y3Var = this.F;
        r2 r2Var = y3Var.G;
        String str5 = i6Var.f32633c;
        b12.H.d("Setting user property", r2Var.f(str5), m10);
        k kVar3 = this.f32532w;
        H(kVar3);
        kVar3.N();
        try {
            boolean equals2 = "_id".equals(str5);
            Object obj2 = i6Var.f32635e;
            if (equals2) {
                k kVar4 = this.f32532w;
                H(kVar4);
                i6 G2 = kVar4.G(str2, "_id");
                if (G2 != null && !obj2.equals(G2.f32635e)) {
                    k kVar5 = this.f32532w;
                    H(kVar5);
                    kVar5.l(str2, "_lair");
                }
            }
            I(m6Var);
            k kVar6 = this.f32532w;
            H(kVar6);
            boolean s10 = kVar6.s(i6Var);
            k kVar7 = this.f32532w;
            H(kVar7);
            kVar7.m();
            if (!s10) {
                b().f32925z.d("Too many unique user properties are set. Ignoring user property", y3Var.G.f(str5), obj2);
                P();
                k6.x(a6Var, m6Var.f32748u, 9, null, null, 0);
            }
        } finally {
            k kVar8 = this.f32532w;
            H(kVar8);
            kVar8.O();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:342:0x07cb, code lost:
        if (r12 == null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
        if (r12 == null) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c5 A[Catch: all -> 0x07f9, TRY_ENTER, TryCatch #15 {all -> 0x07f9, blocks: (B:3:0x0014, B:5:0x0021, B:7:0x0032, B:9:0x0038, B:11:0x0049, B:13:0x0051, B:15:0x0058, B:17:0x0063, B:19:0x0074, B:21:0x007d, B:23:0x0091, B:27:0x00ba, B:29:0x00c0, B:30:0x00c3, B:32:0x00cf, B:33:0x00e6, B:35:0x00f7, B:37:0x00fd, B:52:0x0132, B:53:0x0135, B:57:0x013d, B:58:0x0140, B:59:0x0141, B:61:0x0160, B:65:0x016b, B:69:0x0173, B:74:0x01a9, B:142:0x02c8, B:144:0x02ce, B:146:0x02d4, B:148:0x02da, B:149:0x02de, B:151:0x02e4, B:153:0x02f8, B:157:0x0301, B:159:0x0307, B:165:0x032c, B:162:0x031c, B:164:0x0326, B:166:0x032f, B:169:0x0354, B:173:0x0361, B:175:0x0383, B:182:0x0399, B:192:0x03f3, B:280:0x05fb, B:282:0x0607, B:296:0x064e, B:298:0x065d, B:300:0x066c, B:302:0x068c, B:305:0x06c9, B:307:0x06db, B:309:0x06f0, B:311:0x06fd, B:312:0x0705, B:308:0x06e9, B:314:0x0741, B:303:0x06bf, B:128:0x0295, B:141:0x02c5, B:320:0x075c, B:321:0x075f, B:322:0x0760, B:324:0x076b, B:327:0x077d, B:343:0x07cd, B:345:0x07d1, B:347:0x07d7, B:349:0x07e2, B:333:0x07b0, B:356:0x07f1, B:357:0x07f4), top: B:383:0x0014, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ce A[Catch: all -> 0x07f9, TRY_LEAVE, TryCatch #15 {all -> 0x07f9, blocks: (B:3:0x0014, B:5:0x0021, B:7:0x0032, B:9:0x0038, B:11:0x0049, B:13:0x0051, B:15:0x0058, B:17:0x0063, B:19:0x0074, B:21:0x007d, B:23:0x0091, B:27:0x00ba, B:29:0x00c0, B:30:0x00c3, B:32:0x00cf, B:33:0x00e6, B:35:0x00f7, B:37:0x00fd, B:52:0x0132, B:53:0x0135, B:57:0x013d, B:58:0x0140, B:59:0x0141, B:61:0x0160, B:65:0x016b, B:69:0x0173, B:74:0x01a9, B:142:0x02c8, B:144:0x02ce, B:146:0x02d4, B:148:0x02da, B:149:0x02de, B:151:0x02e4, B:153:0x02f8, B:157:0x0301, B:159:0x0307, B:165:0x032c, B:162:0x031c, B:164:0x0326, B:166:0x032f, B:169:0x0354, B:173:0x0361, B:175:0x0383, B:182:0x0399, B:192:0x03f3, B:280:0x05fb, B:282:0x0607, B:296:0x064e, B:298:0x065d, B:300:0x066c, B:302:0x068c, B:305:0x06c9, B:307:0x06db, B:309:0x06f0, B:311:0x06fd, B:312:0x0705, B:308:0x06e9, B:314:0x0741, B:303:0x06bf, B:128:0x0295, B:141:0x02c5, B:320:0x075c, B:321:0x075f, B:322:0x0760, B:324:0x076b, B:327:0x077d, B:343:0x07cd, B:345:0x07d1, B:347:0x07d7, B:349:0x07e2, B:333:0x07b0, B:356:0x07f1, B:357:0x07f4), top: B:383:0x0014, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x046e A[Catch: all -> 0x063e, TryCatch #17 {all -> 0x063e, blocks: (B:198:0x0409, B:200:0x0425, B:202:0x0434, B:204:0x0446, B:206:0x0459, B:213:0x046e, B:214:0x0478, B:216:0x0488, B:218:0x0496, B:225:0x04a9, B:227:0x04b5, B:229:0x04c3, B:231:0x04c9, B:232:0x04d9, B:233:0x04e3, B:235:0x04f3, B:240:0x0506, B:242:0x050e, B:243:0x0518, B:245:0x0528, B:250:0x053b, B:251:0x0545, B:253:0x0555, B:258:0x0568, B:260:0x057c, B:264:0x059f, B:265:0x05af, B:267:0x05be, B:269:0x05ce, B:274:0x05e1), top: B:386:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04a9 A[Catch: all -> 0x063e, TryCatch #17 {all -> 0x063e, blocks: (B:198:0x0409, B:200:0x0425, B:202:0x0434, B:204:0x0446, B:206:0x0459, B:213:0x046e, B:214:0x0478, B:216:0x0488, B:218:0x0496, B:225:0x04a9, B:227:0x04b5, B:229:0x04c3, B:231:0x04c9, B:232:0x04d9, B:233:0x04e3, B:235:0x04f3, B:240:0x0506, B:242:0x050e, B:243:0x0518, B:245:0x0528, B:250:0x053b, B:251:0x0545, B:253:0x0555, B:258:0x0568, B:260:0x057c, B:264:0x059f, B:265:0x05af, B:267:0x05be, B:269:0x05ce, B:274:0x05e1), top: B:386:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04f3 A[Catch: all -> 0x063e, TryCatch #17 {all -> 0x063e, blocks: (B:198:0x0409, B:200:0x0425, B:202:0x0434, B:204:0x0446, B:206:0x0459, B:213:0x046e, B:214:0x0478, B:216:0x0488, B:218:0x0496, B:225:0x04a9, B:227:0x04b5, B:229:0x04c3, B:231:0x04c9, B:232:0x04d9, B:233:0x04e3, B:235:0x04f3, B:240:0x0506, B:242:0x050e, B:243:0x0518, B:245:0x0528, B:250:0x053b, B:251:0x0545, B:253:0x0555, B:258:0x0568, B:260:0x057c, B:264:0x059f, B:265:0x05af, B:267:0x05be, B:269:0x05ce, B:274:0x05e1), top: B:386:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0506 A[Catch: all -> 0x063e, TryCatch #17 {all -> 0x063e, blocks: (B:198:0x0409, B:200:0x0425, B:202:0x0434, B:204:0x0446, B:206:0x0459, B:213:0x046e, B:214:0x0478, B:216:0x0488, B:218:0x0496, B:225:0x04a9, B:227:0x04b5, B:229:0x04c3, B:231:0x04c9, B:232:0x04d9, B:233:0x04e3, B:235:0x04f3, B:240:0x0506, B:242:0x050e, B:243:0x0518, B:245:0x0528, B:250:0x053b, B:251:0x0545, B:253:0x0555, B:258:0x0568, B:260:0x057c, B:264:0x059f, B:265:0x05af, B:267:0x05be, B:269:0x05ce, B:274:0x05e1), top: B:386:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0528 A[Catch: all -> 0x063e, TryCatch #17 {all -> 0x063e, blocks: (B:198:0x0409, B:200:0x0425, B:202:0x0434, B:204:0x0446, B:206:0x0459, B:213:0x046e, B:214:0x0478, B:216:0x0488, B:218:0x0496, B:225:0x04a9, B:227:0x04b5, B:229:0x04c3, B:231:0x04c9, B:232:0x04d9, B:233:0x04e3, B:235:0x04f3, B:240:0x0506, B:242:0x050e, B:243:0x0518, B:245:0x0528, B:250:0x053b, B:251:0x0545, B:253:0x0555, B:258:0x0568, B:260:0x057c, B:264:0x059f, B:265:0x05af, B:267:0x05be, B:269:0x05ce, B:274:0x05e1), top: B:386:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x053b A[Catch: all -> 0x063e, TryCatch #17 {all -> 0x063e, blocks: (B:198:0x0409, B:200:0x0425, B:202:0x0434, B:204:0x0446, B:206:0x0459, B:213:0x046e, B:214:0x0478, B:216:0x0488, B:218:0x0496, B:225:0x04a9, B:227:0x04b5, B:229:0x04c3, B:231:0x04c9, B:232:0x04d9, B:233:0x04e3, B:235:0x04f3, B:240:0x0506, B:242:0x050e, B:243:0x0518, B:245:0x0528, B:250:0x053b, B:251:0x0545, B:253:0x0555, B:258:0x0568, B:260:0x057c, B:264:0x059f, B:265:0x05af, B:267:0x05be, B:269:0x05ce, B:274:0x05e1), top: B:386:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0555 A[Catch: all -> 0x063e, TryCatch #17 {all -> 0x063e, blocks: (B:198:0x0409, B:200:0x0425, B:202:0x0434, B:204:0x0446, B:206:0x0459, B:213:0x046e, B:214:0x0478, B:216:0x0488, B:218:0x0496, B:225:0x04a9, B:227:0x04b5, B:229:0x04c3, B:231:0x04c9, B:232:0x04d9, B:233:0x04e3, B:235:0x04f3, B:240:0x0506, B:242:0x050e, B:243:0x0518, B:245:0x0528, B:250:0x053b, B:251:0x0545, B:253:0x0555, B:258:0x0568, B:260:0x057c, B:264:0x059f, B:265:0x05af, B:267:0x05be, B:269:0x05ce, B:274:0x05e1), top: B:386:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0568 A[Catch: all -> 0x063e, TryCatch #17 {all -> 0x063e, blocks: (B:198:0x0409, B:200:0x0425, B:202:0x0434, B:204:0x0446, B:206:0x0459, B:213:0x046e, B:214:0x0478, B:216:0x0488, B:218:0x0496, B:225:0x04a9, B:227:0x04b5, B:229:0x04c3, B:231:0x04c9, B:232:0x04d9, B:233:0x04e3, B:235:0x04f3, B:240:0x0506, B:242:0x050e, B:243:0x0518, B:245:0x0528, B:250:0x053b, B:251:0x0545, B:253:0x0555, B:258:0x0568, B:260:0x057c, B:264:0x059f, B:265:0x05af, B:267:0x05be, B:269:0x05ce, B:274:0x05e1), top: B:386:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05ce A[Catch: all -> 0x063e, TryCatch #17 {all -> 0x063e, blocks: (B:198:0x0409, B:200:0x0425, B:202:0x0434, B:204:0x0446, B:206:0x0459, B:213:0x046e, B:214:0x0478, B:216:0x0488, B:218:0x0496, B:225:0x04a9, B:227:0x04b5, B:229:0x04c3, B:231:0x04c9, B:232:0x04d9, B:233:0x04e3, B:235:0x04f3, B:240:0x0506, B:242:0x050e, B:243:0x0518, B:245:0x0528, B:250:0x053b, B:251:0x0545, B:253:0x0555, B:258:0x0568, B:260:0x057c, B:264:0x059f, B:265:0x05af, B:267:0x05be, B:269:0x05ce, B:274:0x05e1), top: B:386:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05e1 A[Catch: all -> 0x063e, TRY_LEAVE, TryCatch #17 {all -> 0x063e, blocks: (B:198:0x0409, B:200:0x0425, B:202:0x0434, B:204:0x0446, B:206:0x0459, B:213:0x046e, B:214:0x0478, B:216:0x0488, B:218:0x0496, B:225:0x04a9, B:227:0x04b5, B:229:0x04c3, B:231:0x04c9, B:232:0x04d9, B:233:0x04e3, B:235:0x04f3, B:240:0x0506, B:242:0x050e, B:243:0x0518, B:245:0x0528, B:250:0x053b, B:251:0x0545, B:253:0x0555, B:258:0x0568, B:260:0x057c, B:264:0x059f, B:265:0x05af, B:267:0x05be, B:269:0x05ce, B:274:0x05e1), top: B:386:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0607 A[Catch: all -> 0x07f9, TRY_LEAVE, TryCatch #15 {all -> 0x07f9, blocks: (B:3:0x0014, B:5:0x0021, B:7:0x0032, B:9:0x0038, B:11:0x0049, B:13:0x0051, B:15:0x0058, B:17:0x0063, B:19:0x0074, B:21:0x007d, B:23:0x0091, B:27:0x00ba, B:29:0x00c0, B:30:0x00c3, B:32:0x00cf, B:33:0x00e6, B:35:0x00f7, B:37:0x00fd, B:52:0x0132, B:53:0x0135, B:57:0x013d, B:58:0x0140, B:59:0x0141, B:61:0x0160, B:65:0x016b, B:69:0x0173, B:74:0x01a9, B:142:0x02c8, B:144:0x02ce, B:146:0x02d4, B:148:0x02da, B:149:0x02de, B:151:0x02e4, B:153:0x02f8, B:157:0x0301, B:159:0x0307, B:165:0x032c, B:162:0x031c, B:164:0x0326, B:166:0x032f, B:169:0x0354, B:173:0x0361, B:175:0x0383, B:182:0x0399, B:192:0x03f3, B:280:0x05fb, B:282:0x0607, B:296:0x064e, B:298:0x065d, B:300:0x066c, B:302:0x068c, B:305:0x06c9, B:307:0x06db, B:309:0x06f0, B:311:0x06fd, B:312:0x0705, B:308:0x06e9, B:314:0x0741, B:303:0x06bf, B:128:0x0295, B:141:0x02c5, B:320:0x075c, B:321:0x075f, B:322:0x0760, B:324:0x076b, B:327:0x077d, B:343:0x07cd, B:345:0x07d1, B:347:0x07d7, B:349:0x07e2, B:333:0x07b0, B:356:0x07f1, B:357:0x07f4), top: B:383:0x0014, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07d7 A[Catch: all -> 0x07f9, TryCatch #15 {all -> 0x07f9, blocks: (B:3:0x0014, B:5:0x0021, B:7:0x0032, B:9:0x0038, B:11:0x0049, B:13:0x0051, B:15:0x0058, B:17:0x0063, B:19:0x0074, B:21:0x007d, B:23:0x0091, B:27:0x00ba, B:29:0x00c0, B:30:0x00c3, B:32:0x00cf, B:33:0x00e6, B:35:0x00f7, B:37:0x00fd, B:52:0x0132, B:53:0x0135, B:57:0x013d, B:58:0x0140, B:59:0x0141, B:61:0x0160, B:65:0x016b, B:69:0x0173, B:74:0x01a9, B:142:0x02c8, B:144:0x02ce, B:146:0x02d4, B:148:0x02da, B:149:0x02de, B:151:0x02e4, B:153:0x02f8, B:157:0x0301, B:159:0x0307, B:165:0x032c, B:162:0x031c, B:164:0x0326, B:166:0x032f, B:169:0x0354, B:173:0x0361, B:175:0x0383, B:182:0x0399, B:192:0x03f3, B:280:0x05fb, B:282:0x0607, B:296:0x064e, B:298:0x065d, B:300:0x066c, B:302:0x068c, B:305:0x06c9, B:307:0x06db, B:309:0x06f0, B:311:0x06fd, B:312:0x0705, B:308:0x06e9, B:314:0x0741, B:303:0x06bf, B:128:0x0295, B:141:0x02c5, B:320:0x075c, B:321:0x075f, B:322:0x0760, B:324:0x076b, B:327:0x077d, B:343:0x07cd, B:345:0x07d1, B:347:0x07d7, B:349:0x07e2, B:333:0x07b0, B:356:0x07f1, B:357:0x07f4), top: B:383:0x0014, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d A[Catch: all -> 0x07f9, TryCatch #15 {all -> 0x07f9, blocks: (B:3:0x0014, B:5:0x0021, B:7:0x0032, B:9:0x0038, B:11:0x0049, B:13:0x0051, B:15:0x0058, B:17:0x0063, B:19:0x0074, B:21:0x007d, B:23:0x0091, B:27:0x00ba, B:29:0x00c0, B:30:0x00c3, B:32:0x00cf, B:33:0x00e6, B:35:0x00f7, B:37:0x00fd, B:52:0x0132, B:53:0x0135, B:57:0x013d, B:58:0x0140, B:59:0x0141, B:61:0x0160, B:65:0x016b, B:69:0x0173, B:74:0x01a9, B:142:0x02c8, B:144:0x02ce, B:146:0x02d4, B:148:0x02da, B:149:0x02de, B:151:0x02e4, B:153:0x02f8, B:157:0x0301, B:159:0x0307, B:165:0x032c, B:162:0x031c, B:164:0x0326, B:166:0x032f, B:169:0x0354, B:173:0x0361, B:175:0x0383, B:182:0x0399, B:192:0x03f3, B:280:0x05fb, B:282:0x0607, B:296:0x064e, B:298:0x065d, B:300:0x066c, B:302:0x068c, B:305:0x06c9, B:307:0x06db, B:309:0x06f0, B:311:0x06fd, B:312:0x0705, B:308:0x06e9, B:314:0x0741, B:303:0x06bf, B:128:0x0295, B:141:0x02c5, B:320:0x075c, B:321:0x075f, B:322:0x0760, B:324:0x076b, B:327:0x077d, B:343:0x07cd, B:345:0x07d1, B:347:0x07d7, B:349:0x07e2, B:333:0x07b0, B:356:0x07f1, B:357:0x07f4), top: B:383:0x0014, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        Throwable th2;
        Cursor cursor;
        SQLiteException sQLiteException;
        Cursor cursor2;
        String str;
        boolean z10;
        boolean z11;
        Throwable th3;
        Cursor cursor3;
        b3 b3Var;
        long j10;
        SQLiteException sQLiteException2;
        Cursor cursor4;
        List emptyList;
        boolean z12;
        boolean z13;
        f6 f6Var;
        String str2;
        String str3;
        int i6;
        long j11;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i10;
        boolean z19;
        int u10;
        int indexOf;
        String str4;
        k kVar;
        f6 f6Var2;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        Throwable th4;
        SQLiteException sQLiteException3;
        Cursor cursor5;
        b3 b3Var2 = this.f32531v;
        y3 y3Var = this.F;
        a().h();
        g();
        int i11 = 1;
        this.O = true;
        int i12 = 0;
        try {
            y3Var.getClass();
            Boolean u11 = y3Var.t().u();
            if (u11 == null) {
                b().o().b("Upload data called on the client side before use of service was decided");
                this.O = false;
            } else if (u11.booleanValue()) {
                b().m().b("Upload called in the client side when service should be used");
                this.O = false;
            } else if (this.I > 0) {
                C();
                this.O = false;
            } else {
                a().h();
                if (this.R != null) {
                    b().n().b("Uploading requested multiple times");
                    this.O = false;
                } else {
                    H(b3Var2);
                    if (!b3Var2.g()) {
                        b().n().b("Network not connected, ignoring upload request");
                        C();
                        this.O = false;
                    } else {
                        long k10 = ((kotlin.jvm.internal.b0) c()).k();
                        Cursor cursor6 = null;
                        int l2 = J().l(null, j2.Q);
                        J();
                        try {
                            long longValue = k10 - ((Long) j2.f32644d.a(null)).longValue();
                            for (int i13 = 0; i13 < l2 && D(longValue); i13++) {
                            }
                            long a10 = this.C.A.a();
                            int i14 = (a10 > 0L ? 1 : (a10 == 0L ? 0 : -1));
                            ?? r12 = a10;
                            if (i14 != 0) {
                                u2 l10 = b().l();
                                long abs = Math.abs(k10 - a10);
                                l10.c(Long.valueOf(abs), "Uploading events. Elapsed time since last upload attempt (ms)");
                                r12 = abs;
                            }
                            k kVar2 = this.f32532w;
                            H(kVar2);
                            String I = kVar2.I();
                            long j12 = -1;
                            if (!TextUtils.isEmpty(I)) {
                                if (this.T == -1) {
                                    k kVar3 = this.f32532w;
                                    H(kVar3);
                                    try {
                                        cursor5 = kVar3.A().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        try {
                                            try {
                                                if (cursor5.moveToFirst()) {
                                                    j12 = cursor5.getLong(0);
                                                }
                                            } catch (SQLiteException e10) {
                                                sQLiteException3 = e10;
                                                kVar3.f32943u.b().m().c(sQLiteException3, "Error querying raw events");
                                            }
                                        } catch (Throwable th5) {
                                            th4 = th5;
                                            cursor6 = cursor5;
                                            if (cursor6 != null) {
                                                cursor6.close();
                                            }
                                            throw th4;
                                        }
                                    } catch (SQLiteException e11) {
                                        sQLiteException3 = e11;
                                        cursor5 = null;
                                    } catch (Throwable th6) {
                                        th4 = th6;
                                        if (cursor6 != null) {
                                        }
                                        throw th4;
                                    }
                                    cursor5.close();
                                    this.T = j12;
                                }
                                int l11 = J().l(I, j2.f32648g);
                                int max = Math.max(0, J().l(I, j2.f32650h));
                                k kVar4 = this.f32532w;
                                H(kVar4);
                                y3 y3Var2 = kVar4.f32943u;
                                kVar4.h();
                                kVar4.i();
                                if (l11 > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                v9.o.b(z10);
                                if (max > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                v9.o.b(z11);
                                v9.o.e(I);
                                try {
                                    cursor4 = kVar4.A().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{I}, null, null, "rowid", String.valueOf(l11));
                                    try {
                                        try {
                                            if (!cursor4.moveToFirst()) {
                                                emptyList = Collections.emptyList();
                                                cursor4.close();
                                                b3Var = b3Var2;
                                                j10 = k10;
                                            } else {
                                                ArrayList arrayList = new ArrayList();
                                                int i15 = 0;
                                                while (true) {
                                                    long j13 = cursor4.getLong(i12);
                                                    try {
                                                        byte[] blob = cursor4.getBlob(i11);
                                                        f6Var2 = kVar4.f32947v.A;
                                                        H(f6Var2);
                                                        kVar = kVar4;
                                                        try {
                                                            byteArrayInputStream = new ByteArrayInputStream(blob);
                                                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                            b3Var = b3Var2;
                                                        } catch (IOException e12) {
                                                            e = e12;
                                                            b3Var = b3Var2;
                                                        }
                                                    } catch (IOException e13) {
                                                        e = e13;
                                                        b3Var = b3Var2;
                                                        j10 = k10;
                                                        kVar = kVar4;
                                                    }
                                                    try {
                                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                        j10 = k10;
                                                        try {
                                                            try {
                                                                byte[] bArr = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];
                                                                while (true) {
                                                                    int read = gZIPInputStream.read(bArr);
                                                                    if (read <= 0) {
                                                                        break;
                                                                    }
                                                                    ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                                                                    byteArrayOutputStream.write(bArr, 0, read);
                                                                    byteArrayInputStream = byteArrayInputStream2;
                                                                }
                                                                gZIPInputStream.close();
                                                                byteArrayInputStream.close();
                                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                                if (!arrayList.isEmpty() && byteArray.length + i15 > max) {
                                                                    break;
                                                                }
                                                                try {
                                                                    com.google.android.gms.internal.measurement.u2 u2Var = (com.google.android.gms.internal.measurement.u2) f6.z(com.google.android.gms.internal.measurement.v2.D1(), byteArray);
                                                                    if (!cursor4.isNull(2)) {
                                                                        u2Var.p(cursor4.getInt(2));
                                                                    }
                                                                    i15 += byteArray.length;
                                                                    arrayList.add(Pair.create((com.google.android.gms.internal.measurement.v2) u2Var.f(), Long.valueOf(j13)));
                                                                } catch (IOException e14) {
                                                                    y3Var2.b().m().d("Failed to merge queued bundle. appId", w2.q(I), e14);
                                                                }
                                                                if (cursor4.moveToNext() || i15 > max) {
                                                                    break;
                                                                    break;
                                                                }
                                                                kVar4 = kVar;
                                                                b3Var2 = b3Var;
                                                                k10 = j10;
                                                                i11 = 1;
                                                                i12 = 0;
                                                            } catch (SQLiteException e15) {
                                                                e = e15;
                                                                sQLiteException2 = e;
                                                                y3Var2.b().m().d("Error querying bundles. appId", w2.q(I), sQLiteException2);
                                                                emptyList = Collections.emptyList();
                                                                if (cursor4 != null) {
                                                                    cursor4.close();
                                                                }
                                                                if (!emptyList.isEmpty()) {
                                                                }
                                                                this.O = false;
                                                                A();
                                                            }
                                                        } catch (IOException e16) {
                                                            e = e16;
                                                            IOException iOException = e;
                                                            try {
                                                                f6Var2.f32943u.b().m().c(iOException, "Failed to ungzip content");
                                                                throw iOException;
                                                                break;
                                                            } catch (IOException e17) {
                                                                e = e17;
                                                                y3Var2.b().m().d("Failed to unzip queued bundle. appId", w2.q(I), e);
                                                                if (cursor4.moveToNext()) {
                                                                    break;
                                                                }
                                                                kVar4 = kVar;
                                                                b3Var2 = b3Var;
                                                                k10 = j10;
                                                                i11 = 1;
                                                                i12 = 0;
                                                                cursor4.close();
                                                                emptyList = arrayList;
                                                                if (!emptyList.isEmpty()) {
                                                                }
                                                                this.O = false;
                                                                A();
                                                            }
                                                        }
                                                    } catch (SQLiteException e18) {
                                                        e = e18;
                                                        j10 = k10;
                                                        sQLiteException2 = e;
                                                        y3Var2.b().m().d("Error querying bundles. appId", w2.q(I), sQLiteException2);
                                                        emptyList = Collections.emptyList();
                                                        if (cursor4 != null) {
                                                        }
                                                        if (!emptyList.isEmpty()) {
                                                        }
                                                        this.O = false;
                                                        A();
                                                    } catch (IOException e19) {
                                                        e = e19;
                                                        j10 = k10;
                                                        IOException iOException2 = e;
                                                        f6Var2.f32943u.b().m().c(iOException2, "Failed to ungzip content");
                                                        throw iOException2;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                cursor4.close();
                                                emptyList = arrayList;
                                            }
                                        } catch (SQLiteException e20) {
                                            e = e20;
                                            b3Var = b3Var2;
                                        }
                                    } catch (Throwable th7) {
                                        cursor3 = cursor4;
                                        th3 = th7;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        throw th3;
                                    }
                                } catch (SQLiteException e21) {
                                    b3Var = b3Var2;
                                    j10 = k10;
                                    sQLiteException2 = e21;
                                    cursor4 = null;
                                } catch (Throwable th8) {
                                    th3 = th8;
                                    cursor3 = null;
                                }
                                if (!emptyList.isEmpty()) {
                                    h K = K(I);
                                    g gVar = g.AD_STORAGE;
                                    if (K.f(gVar)) {
                                        Iterator it = emptyList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                com.google.android.gms.internal.measurement.v2 v2Var = (com.google.android.gms.internal.measurement.v2) ((Pair) it.next()).first;
                                                if (!v2Var.D().isEmpty()) {
                                                    str4 = v2Var.D();
                                                    break;
                                                }
                                            } else {
                                                str4 = null;
                                                break;
                                            }
                                        }
                                        if (str4 != null) {
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 >= emptyList.size()) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.v2 v2Var2 = (com.google.android.gms.internal.measurement.v2) ((Pair) emptyList.get(i16)).first;
                                                if (!v2Var2.D().isEmpty() && !v2Var2.D().equals(str4)) {
                                                    emptyList = emptyList.subList(0, i16);
                                                    break;
                                                }
                                                i16++;
                                            }
                                        }
                                    }
                                    com.google.android.gms.internal.measurement.s2 u12 = com.google.android.gms.internal.measurement.t2.u();
                                    int size = emptyList.size();
                                    ArrayList arrayList2 = new ArrayList(emptyList.size());
                                    try {
                                        if ("1".equals(J().f32551w.e(I, "gaia_collection_enabled")) && K(I).f(gVar)) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        boolean f = K(I).f(gVar);
                                        boolean f2 = K(I).f(g.ANALYTICS_STORAGE);
                                        ca.c();
                                        if (J().q(null, j2.f32651h0) && J().q(I, j2.f32655j0)) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        int i17 = 0;
                                        while (true) {
                                            f6Var = this.A;
                                            if (i17 >= size) {
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.u2 u2Var2 = (com.google.android.gms.internal.measurement.u2) ((com.google.android.gms.internal.measurement.v2) ((Pair) emptyList.get(i17)).first).r();
                                            arrayList2.add((Long) ((Pair) emptyList.get(i17)).second);
                                            J().m();
                                            try {
                                                u2Var2.i();
                                                com.google.android.gms.internal.measurement.v2.W((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v);
                                                try {
                                                    u2Var2.i();
                                                    List list = emptyList;
                                                    boolean z20 = f2;
                                                    long j14 = j10;
                                                    com.google.android.gms.internal.measurement.v2.D0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v, j14);
                                                    try {
                                                        u2Var2.i();
                                                        com.google.android.gms.internal.measurement.v2.i0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v);
                                                        if (!z12) {
                                                            try {
                                                                u2Var2.i();
                                                                com.google.android.gms.internal.measurement.v2.J((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v);
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                Throwable th10 = th;
                                                                this.O = false;
                                                                A();
                                                                throw th10;
                                                            }
                                                        }
                                                        if (!f) {
                                                            u2Var2.B();
                                                            u2Var2.y();
                                                        }
                                                        if (!z20) {
                                                            try {
                                                                u2Var2.i();
                                                                com.google.android.gms.internal.measurement.v2.c0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v);
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                                Throwable th102 = th;
                                                                this.O = false;
                                                                A();
                                                                throw th102;
                                                            }
                                                        }
                                                        try {
                                                            r3 r3Var = this.f32530u;
                                                            H(r3Var);
                                                            r3Var.h();
                                                            r3Var.n(I);
                                                            boolean z21 = f;
                                                            t.b bVar = r3Var.f32844y;
                                                            boolean z22 = z12;
                                                            Set set = (Set) bVar.getOrDefault(I, null);
                                                            if (set != null) {
                                                                u2Var2.i();
                                                                i6 = size;
                                                                com.google.android.gms.internal.measurement.v2.w0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v, set);
                                                            } else {
                                                                i6 = size;
                                                            }
                                                            H(r3Var);
                                                            r3Var.h();
                                                            r3Var.n(I);
                                                            try {
                                                                if (bVar.getOrDefault(I, null) != null) {
                                                                    j11 = j14;
                                                                    if (((Set) bVar.getOrDefault(I, null)).contains("device_model") || ((Set) bVar.getOrDefault(I, null)).contains("device_info")) {
                                                                        z14 = true;
                                                                        if (z14) {
                                                                            u2Var2.i();
                                                                            com.google.android.gms.internal.measurement.v2.O0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v);
                                                                        }
                                                                        H(r3Var);
                                                                        r3Var.h();
                                                                        r3Var.n(I);
                                                                        if (bVar.getOrDefault(I, null) != null && (((Set) bVar.getOrDefault(I, null)).contains("os_version") || ((Set) bVar.getOrDefault(I, null)).contains("device_info"))) {
                                                                            z15 = true;
                                                                            if (z15) {
                                                                                if (J().q(I, j2.f32661m0)) {
                                                                                    String B = ((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v).B();
                                                                                    if (!TextUtils.isEmpty(B) && (indexOf = B.indexOf(".")) != -1) {
                                                                                        String substring = B.substring(0, indexOf);
                                                                                        u2Var2.i();
                                                                                        com.google.android.gms.internal.measurement.v2.L0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v, substring);
                                                                                    }
                                                                                } else {
                                                                                    u2Var2.i();
                                                                                    com.google.android.gms.internal.measurement.v2.M0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v);
                                                                                }
                                                                            }
                                                                            H(r3Var);
                                                                            r3Var.h();
                                                                            r3Var.n(I);
                                                                            if (bVar.getOrDefault(I, null) == null && ((Set) bVar.getOrDefault(I, null)).contains("user_id")) {
                                                                                z16 = true;
                                                                            } else {
                                                                                z16 = false;
                                                                            }
                                                                            if (z16 && (u10 = f6.u(u2Var2, "_id")) != -1) {
                                                                                u2Var2.i();
                                                                                com.google.android.gms.internal.measurement.v2.C0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v, u10);
                                                                            }
                                                                            H(r3Var);
                                                                            r3Var.h();
                                                                            r3Var.n(I);
                                                                            if (bVar.getOrDefault(I, null) == null && ((Set) bVar.getOrDefault(I, null)).contains("google_signals")) {
                                                                                z17 = true;
                                                                            } else {
                                                                                z17 = false;
                                                                            }
                                                                            if (z17) {
                                                                                u2Var2.i();
                                                                                com.google.android.gms.internal.measurement.v2.J((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v);
                                                                            }
                                                                            H(r3Var);
                                                                            r3Var.h();
                                                                            r3Var.n(I);
                                                                            if (bVar.getOrDefault(I, null) == null && ((Set) bVar.getOrDefault(I, null)).contains("app_instance_id")) {
                                                                                z18 = true;
                                                                            } else {
                                                                                z18 = false;
                                                                            }
                                                                            if (!z18) {
                                                                                u2Var2.i();
                                                                                com.google.android.gms.internal.measurement.v2.c0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v);
                                                                                HashMap hashMap = this.V;
                                                                                c6 c6Var = (c6) hashMap.get(I);
                                                                                if (c6Var != null) {
                                                                                    i10 = i17;
                                                                                    long n10 = J().n(I, j2.S) + c6Var.f32514b;
                                                                                    ((kotlin.jvm.internal.b0) c()).getClass();
                                                                                    if (n10 < SystemClock.elapsedRealtime()) {
                                                                                    }
                                                                                    u2Var2.i();
                                                                                    com.google.android.gms.internal.measurement.v2.y0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v, c6Var.f32513a);
                                                                                } else {
                                                                                    i10 = i17;
                                                                                }
                                                                                c6Var = new c6(this, P().n());
                                                                                hashMap.put(I, c6Var);
                                                                                u2Var2.i();
                                                                                com.google.android.gms.internal.measurement.v2.y0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v, c6Var.f32513a);
                                                                            } else {
                                                                                i10 = i17;
                                                                            }
                                                                            H(r3Var);
                                                                            r3Var.h();
                                                                            r3Var.n(I);
                                                                            if (bVar.getOrDefault(I, null) == null && ((Set) bVar.getOrDefault(I, null)).contains("enhanced_user_id")) {
                                                                                z19 = true;
                                                                            } else {
                                                                                z19 = false;
                                                                            }
                                                                            if (z19) {
                                                                                u2Var2.i();
                                                                                com.google.android.gms.internal.measurement.v2.v0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v);
                                                                            }
                                                                            if (!z13) {
                                                                                try {
                                                                                    u2Var2.i();
                                                                                    com.google.android.gms.internal.measurement.v2.v0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v);
                                                                                } catch (Throwable th12) {
                                                                                    th = th12;
                                                                                    Throwable th1022 = th;
                                                                                    this.O = false;
                                                                                    A();
                                                                                    throw th1022;
                                                                                }
                                                                            }
                                                                            if (J().q(I, j2.T)) {
                                                                                byte[] g5 = ((com.google.android.gms.internal.measurement.v2) u2Var2.f()).g();
                                                                                H(f6Var);
                                                                                u2Var2.l(f6Var.v(g5));
                                                                            }
                                                                            u12.i();
                                                                            com.google.android.gms.internal.measurement.t2.y((com.google.android.gms.internal.measurement.t2) u12.f8613v, (com.google.android.gms.internal.measurement.v2) u2Var2.f());
                                                                            i17 = i10 + 1;
                                                                            emptyList = list;
                                                                            f = z21;
                                                                            z12 = z22;
                                                                            f2 = z20;
                                                                            size = i6;
                                                                            j10 = j11;
                                                                        }
                                                                        z15 = false;
                                                                        if (z15) {
                                                                        }
                                                                        H(r3Var);
                                                                        r3Var.h();
                                                                        r3Var.n(I);
                                                                        if (bVar.getOrDefault(I, null) == null) {
                                                                        }
                                                                        z16 = false;
                                                                        if (z16) {
                                                                            u2Var2.i();
                                                                            com.google.android.gms.internal.measurement.v2.C0((com.google.android.gms.internal.measurement.v2) u2Var2.f8613v, u10);
                                                                        }
                                                                        H(r3Var);
                                                                        r3Var.h();
                                                                        r3Var.n(I);
                                                                        if (bVar.getOrDefault(I, null) == null) {
                                                                        }
                                                                        z17 = false;
                                                                        if (z17) {
                                                                        }
                                                                        H(r3Var);
                                                                        r3Var.h();
                                                                        r3Var.n(I);
                                                                        if (bVar.getOrDefault(I, null) == null) {
                                                                        }
                                                                        z18 = false;
                                                                        if (!z18) {
                                                                        }
                                                                        H(r3Var);
                                                                        r3Var.h();
                                                                        r3Var.n(I);
                                                                        if (bVar.getOrDefault(I, null) == null) {
                                                                        }
                                                                        z19 = false;
                                                                        if (z19) {
                                                                        }
                                                                        if (!z13) {
                                                                        }
                                                                        if (J().q(I, j2.T)) {
                                                                        }
                                                                        u12.i();
                                                                        com.google.android.gms.internal.measurement.t2.y((com.google.android.gms.internal.measurement.t2) u12.f8613v, (com.google.android.gms.internal.measurement.v2) u2Var2.f());
                                                                        i17 = i10 + 1;
                                                                        emptyList = list;
                                                                        f = z21;
                                                                        z12 = z22;
                                                                        f2 = z20;
                                                                        size = i6;
                                                                        j10 = j11;
                                                                    }
                                                                } else {
                                                                    j11 = j14;
                                                                }
                                                                if (bVar.getOrDefault(I, null) != null) {
                                                                    z15 = true;
                                                                    if (z15) {
                                                                    }
                                                                    H(r3Var);
                                                                    r3Var.h();
                                                                    r3Var.n(I);
                                                                    if (bVar.getOrDefault(I, null) == null) {
                                                                    }
                                                                    z16 = false;
                                                                    if (z16) {
                                                                    }
                                                                    H(r3Var);
                                                                    r3Var.h();
                                                                    r3Var.n(I);
                                                                    if (bVar.getOrDefault(I, null) == null) {
                                                                    }
                                                                    z17 = false;
                                                                    if (z17) {
                                                                    }
                                                                    H(r3Var);
                                                                    r3Var.h();
                                                                    r3Var.n(I);
                                                                    if (bVar.getOrDefault(I, null) == null) {
                                                                    }
                                                                    z18 = false;
                                                                    if (!z18) {
                                                                    }
                                                                    H(r3Var);
                                                                    r3Var.h();
                                                                    r3Var.n(I);
                                                                    if (bVar.getOrDefault(I, null) == null) {
                                                                    }
                                                                    z19 = false;
                                                                    if (z19) {
                                                                    }
                                                                    if (!z13) {
                                                                    }
                                                                    if (J().q(I, j2.T)) {
                                                                    }
                                                                    u12.i();
                                                                    com.google.android.gms.internal.measurement.t2.y((com.google.android.gms.internal.measurement.t2) u12.f8613v, (com.google.android.gms.internal.measurement.v2) u2Var2.f());
                                                                    i17 = i10 + 1;
                                                                    emptyList = list;
                                                                    f = z21;
                                                                    z12 = z22;
                                                                    f2 = z20;
                                                                    size = i6;
                                                                    j10 = j11;
                                                                }
                                                                u12.i();
                                                                com.google.android.gms.internal.measurement.t2.y((com.google.android.gms.internal.measurement.t2) u12.f8613v, (com.google.android.gms.internal.measurement.v2) u2Var2.f());
                                                                i17 = i10 + 1;
                                                                emptyList = list;
                                                                f = z21;
                                                                z12 = z22;
                                                                f2 = z20;
                                                                size = i6;
                                                                j10 = j11;
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                Throwable th10222 = th;
                                                                this.O = false;
                                                                A();
                                                                throw th10222;
                                                            }
                                                            z14 = false;
                                                            if (z14) {
                                                            }
                                                            H(r3Var);
                                                            r3Var.h();
                                                            r3Var.n(I);
                                                            z15 = false;
                                                            if (z15) {
                                                            }
                                                            H(r3Var);
                                                            r3Var.h();
                                                            r3Var.n(I);
                                                            if (bVar.getOrDefault(I, null) == null) {
                                                            }
                                                            z16 = false;
                                                            if (z16) {
                                                            }
                                                            H(r3Var);
                                                            r3Var.h();
                                                            r3Var.n(I);
                                                            if (bVar.getOrDefault(I, null) == null) {
                                                            }
                                                            z17 = false;
                                                            if (z17) {
                                                            }
                                                            H(r3Var);
                                                            r3Var.h();
                                                            r3Var.n(I);
                                                            if (bVar.getOrDefault(I, null) == null) {
                                                            }
                                                            z18 = false;
                                                            if (!z18) {
                                                            }
                                                            H(r3Var);
                                                            r3Var.h();
                                                            r3Var.n(I);
                                                            if (bVar.getOrDefault(I, null) == null) {
                                                            }
                                                            z19 = false;
                                                            if (z19) {
                                                            }
                                                            if (!z13) {
                                                            }
                                                            if (J().q(I, j2.T)) {
                                                            }
                                                        } catch (Throwable th14) {
                                                            th = th14;
                                                        }
                                                    } catch (Throwable th15) {
                                                        th = th15;
                                                    }
                                                } catch (Throwable th16) {
                                                    th = th16;
                                                }
                                            } catch (Throwable th17) {
                                                th = th17;
                                            }
                                        }
                                        int i18 = size;
                                        long j15 = j10;
                                        if (Log.isLoggable(b().t(), 2)) {
                                            H(f6Var);
                                            str2 = f6Var.A((com.google.android.gms.internal.measurement.t2) u12.f());
                                        } else {
                                            str2 = null;
                                        }
                                        H(f6Var);
                                        byte[] g10 = ((com.google.android.gms.internal.measurement.t2) u12.f()).g();
                                        r3 r3Var2 = this.D.f32947v.f32530u;
                                        H(r3Var2);
                                        String s10 = r3Var2.s(I);
                                        if (!TextUtils.isEmpty(s10)) {
                                            Uri parse = Uri.parse((String) j2.f32668q.a(null));
                                            Uri.Builder buildUpon = parse.buildUpon();
                                            buildUpon.authority(s10 + "." + parse.getAuthority());
                                            str3 = buildUpon.build().toString();
                                        } else {
                                            str3 = (String) j2.f32668q.a(null);
                                        }
                                        String str5 = str3;
                                        try {
                                            URL url = new URL(str5);
                                            v9.o.b(!arrayList2.isEmpty());
                                            if (this.R != null) {
                                                b().m().b("Set uploading progress before finishing the previous upload");
                                            } else {
                                                this.R = new ArrayList(arrayList2);
                                            }
                                            this.C.B.b(j15);
                                            String str6 = "?";
                                            if (i18 > 0) {
                                                str6 = u12.k().H1();
                                            }
                                            b().n().e("Uploading data. app, uncompressed size, data", str6, Integer.valueOf(g10.length), str2);
                                            this.N = true;
                                            H(b3Var);
                                            androidx.appcompat.widget.l lVar = new androidx.appcompat.widget.l(this, I, 26);
                                            b3Var.h();
                                            b3Var.i();
                                            b3 b3Var3 = b3Var;
                                            b3Var3.f32943u.a().o(new a3(b3Var3, I, url, g10, null, lVar));
                                        } catch (MalformedURLException unused) {
                                            b().m().d("Failed to parse upload URL. Not uploading. appId", w2.q(I), str5);
                                        }
                                    } catch (Throwable th18) {
                                        th = th18;
                                    }
                                }
                                this.O = false;
                            } else {
                                this.T = -1L;
                                k kVar5 = this.f32532w;
                                H(kVar5);
                                y3 y3Var3 = kVar5.f32943u;
                                J();
                                try {
                                    long longValue2 = k10 - ((Long) j2.f32644d.a(null)).longValue();
                                    try {
                                        kVar5.h();
                                        kVar5.i();
                                    } catch (Throwable th19) {
                                        th2 = th19;
                                        cursor = r12;
                                    }
                                    try {
                                        cursor2 = kVar5.A().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue2)});
                                        try {
                                        } catch (SQLiteException e22) {
                                            sQLiteException = e22;
                                            y3Var3.b().m().c(sQLiteException, "Error selecting expired configs");
                                        }
                                    } catch (SQLiteException e23) {
                                        sQLiteException = e23;
                                        cursor2 = null;
                                    } catch (Throwable th20) {
                                        th2 = th20;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th2;
                                    }
                                    if (!cursor2.moveToFirst()) {
                                        y3Var3.b().n().b("No expired configs for apps with pending events");
                                        cursor2.close();
                                        str = null;
                                        if (!TextUtils.isEmpty(str)) {
                                            k kVar6 = this.f32532w;
                                            H(kVar6);
                                            l4 B2 = kVar6.B(str);
                                            if (B2 != null) {
                                                h(B2);
                                            }
                                        }
                                        this.O = false;
                                    } else {
                                        str = cursor2.getString(0);
                                        cursor2.close();
                                        if (!TextUtils.isEmpty(str)) {
                                        }
                                        this.O = false;
                                    }
                                } catch (Throwable th21) {
                                    th = th21;
                                    Throwable th102222 = th;
                                    this.O = false;
                                    A();
                                    throw th102222;
                                }
                            }
                        } catch (Throwable th22) {
                            th = th22;
                        }
                    }
                }
            }
            A();
        } catch (Throwable th23) {
            th = th23;
            Throwable th1022222 = th;
            this.O = false;
            A();
            throw th1022222;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:337|(2:339|(7:341|342|(1:344)|51|(0)(0)|54|(0)(0)))|345|346|347|348|349|350|351|352|353|354|355|342|(0)|51|(0)(0)|54|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(57:(2:63|(5:65|(1:67)|68|69|70))(1:308)|71|(2:73|(5:75|(1:77)|78|79|80))(1:307)|81|(1:83)(1:306)|84|(1:86)|87|(2:89|(1:93))|94|95|96|(9:97|98|99|100|101|102|103|104|105)|106|(1:108)|109|(2:111|(1:117)(3:114|115|116))(4:287|288|289|290)|118|119|120|(1:122)|123|(1:125)(1:286)|126|(1:128)(1:285)|129|(1:284)(2:133|(1:135))|136|(1:138)|139|(1:141)(1:283)|142|(1:146)|147|(1:149)|150|151|(15:(34:156|(2:157|(3:159|(3:161|162|(2:164|(2:166|168)(1:272))(1:274))(1:279)|273)(2:280|281))|169|(2:171|172)|(1:174)|175|176|(1:271)(4:179|(1:181)(1:270)|182|(2:185|(1:187)))|188|(2:190|(1:192)(2:193|194))|195|(3:197|(1:199)|200)|201|(1:205)|206|(1:208)|209|(6:212|(1:214)(2:218|(1:220)(2:221|(1:223)(3:224|216|217)))|215|216|217|210)|225|226|227|228|229|(2:230|(2:232|(2:235|236)(1:234))(3:255|256|(1:261)(1:260)))|237|(2:240|238)|241|242|243|244|(1:246)(2:251|252)|247|248|249)|227|228|229|(3:230|(0)(0)|234)|237|(1:238)|241|242|243|244|(0)(0)|247|248|249)|282|172|(0)|175|176|(0)|271|188|(0)|195|(0)|201|(2:203|205)|206|(0)|209|(1:210)|225|226) */
    /* JADX WARN: Can't wrap try/catch for region: R(62:297|298|299|106|(0)|109|(0)(0)|118|119|120|(0)|123|(0)(0)|126|(0)(0)|129|(1:131)|284|136|(0)|139|(0)(0)|142|(2:144|146)|147|(0)|150|151|(36:153|156|(3:157|(0)(0)|273)|169|(0)|(0)|175|176|(0)|271|188|(0)|195|(0)|201|(0)|206|(0)|209|(1:210)|225|226|227|228|229|(3:230|(0)(0)|234)|237|(1:238)|241|242|243|244|(0)(0)|247|248|249)|282|172|(0)|175|176|(0)|271|188|(0)|195|(0)|201|(0)|206|(0)|209|(1:210)|225|226|227|228|229|(3:230|(0)(0)|234)|237|(1:238)|241|242|243|244|(0)(0)|247|248|249) */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0be8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0be9, code lost:
        r2.f32943u.b().m().d("Error storing raw event. appId", ta.w2.q(r5), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0c18, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0c1a, code lost:
        b().m().d("Data loss. Failed to insert raw event metadata. appId", ta.w2.q(r4.q()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02cc, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02ce, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02cf, code lost:
        r39 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02d4, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d5, code lost:
        r39 = r8;
        r17 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02da, code lost:
        r12.f32943u.b().m().d("Error pruning currencies. appId", ta.w2.q(r11), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x035f A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c7 A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x056d A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05ab A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0640 A[Catch: all -> 0x0c66, TRY_LEAVE, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06be A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06ce A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06e3 A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0730 A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x074d A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x079f A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07f2 A[Catch: all -> 0x0c66, TRY_LEAVE, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x085d A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0878 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x091a A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0939 A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0998 A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x09bd A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x09de A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0aea A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0b64 A[Catch: all -> 0x0c66, LOOP:3: B:317:0x0b5e->B:319:0x0b64, LOOP_END, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0bcf A[Catch: SQLiteException -> 0x0be8, all -> 0x0c66, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x0be8, blocks: (B:321:0x0bbe, B:323:0x0bcf), top: B:347:0x0bbe, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x084f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0afe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b4 A[Catch: all -> 0x0c66, TRY_ENTER, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022f A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0315 A[Catch: all -> 0x0c66, TryCatch #6 {all -> 0x0c66, blocks: (B:34:0x016d, B:37:0x017a, B:39:0x0182, B:44:0x018c, B:100:0x034d, B:109:0x0389, B:111:0x03c7, B:113:0x03ce, B:114:0x03e5, B:118:0x03f8, B:120:0x0412, B:122:0x0419, B:123:0x0430, B:129:0x045a, B:133:0x047b, B:134:0x0492, B:138:0x04a5, B:144:0x04d2, B:145:0x04e6, B:147:0x04f0, B:149:0x04fd, B:151:0x0503, B:152:0x050c, B:154:0x0513, B:155:0x051c, B:157:0x052f, B:159:0x0542, B:171:0x056d, B:172:0x0582, B:174:0x05ab, B:177:0x05d4, B:180:0x061e, B:184:0x0680, B:186:0x0694, B:188:0x06be, B:189:0x06c8, B:191:0x06ce, B:193:0x06dd, B:195:0x06e3, B:197:0x06f2, B:199:0x0702, B:201:0x070e, B:203:0x0718, B:205:0x0727, B:207:0x0730, B:208:0x073b, B:210:0x074d, B:212:0x075c, B:214:0x0785, B:216:0x078b, B:217:0x0797, B:219:0x079f, B:220:0x07a9, B:223:0x07ca, B:226:0x07d2, B:227:0x07ec, B:229:0x07f2, B:231:0x080c, B:233:0x0818, B:235:0x0825, B:242:0x0851, B:248:0x085d, B:249:0x0860, B:253:0x087a, B:255:0x0885, B:257:0x0897, B:260:0x08a3, B:262:0x08b5, B:264:0x08c8, B:266:0x091a, B:269:0x0925, B:270:0x092d, B:271:0x092e, B:273:0x0939, B:275:0x0955, B:276:0x095e, B:277:0x0990, B:279:0x0998, B:281:0x09a2, B:282:0x09b3, B:284:0x09bd, B:285:0x09ce, B:286:0x09d8, B:288:0x09de, B:290:0x0a36, B:299:0x0a7b, B:292:0x0a44, B:294:0x0a48, B:295:0x0a59, B:297:0x0a5d, B:298:0x0a6e, B:301:0x0a83, B:302:0x0ac6, B:303:0x0ad1, B:304:0x0ae4, B:306:0x0aea, B:316:0x0b32, B:317:0x0b5e, B:319:0x0b64, B:320:0x0b81, B:321:0x0bbe, B:323:0x0bcf, B:337:0x0c2f, B:326:0x0be5, B:328:0x0be9, B:310:0x0afe, B:312:0x0b1e, B:332:0x0c00, B:333:0x0c17, B:336:0x0c1a, B:256:0x088c, B:239:0x083d, B:181:0x0640, B:168:0x0554, B:141:0x04c0, B:103:0x035f, B:104:0x036b, B:106:0x0371, B:108:0x0383, B:50:0x01a2, B:53:0x01b4, B:55:0x01c9, B:61:0x01e9, B:69:0x0229, B:71:0x022f, B:73:0x023d, B:75:0x024e, B:78:0x025e, B:96:0x030a, B:98:0x0315, B:79:0x0294, B:80:0x02ae, B:82:0x02b5, B:84:0x02c4, B:95:0x02ed, B:94:0x02da, B:64:0x01f5, B:68:0x021d), top: B:358:0x016d, inners: #0, #4, #11 }] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(s sVar, m6 m6Var) {
        f6 f6Var;
        boolean z10;
        boolean equals;
        q qVar;
        String str;
        String string;
        String str2;
        String str3;
        long longValue;
        String str4;
        String str5;
        f6 f6Var2;
        String str6;
        i6 i6Var;
        r3 r3Var;
        k kVar;
        long j10;
        Object obj;
        long intValue;
        String str7;
        String str8;
        String str9;
        long j11;
        String str10;
        p F;
        String str11;
        String str12;
        p pVar;
        String str13;
        String str14;
        com.google.android.gms.internal.measurement.u2 D1;
        String str15;
        String str16;
        m6 m6Var2;
        long j12;
        String str17;
        long j13;
        Map b10;
        String str18;
        ArrayList arrayList;
        h c10;
        boolean f;
        o oVar;
        l4 B;
        List L;
        int i6;
        k kVar2;
        com.google.android.gms.internal.measurement.v2 v2Var;
        k kVar3;
        Iterator<String> it;
        String str19;
        ContentValues contentValues;
        String str20;
        y3 y3Var;
        Pair pair;
        Iterator it2;
        f J;
        d6 d6Var = this;
        v9.o.h(m6Var);
        String str21 = m6Var.f32750w;
        String str22 = m6Var.f32751x;
        String str23 = m6Var.f32748u;
        v9.o.e(str23);
        long nanoTime = System.nanoTime();
        a().h();
        g();
        String str24 = m6Var.f32748u;
        f6 f6Var3 = d6Var.A;
        H(f6Var3);
        String str25 = m6Var.f32749v;
        boolean isEmpty = TextUtils.isEmpty(str25);
        int i10 = 1;
        String str26 = m6Var.K;
        if (!((isEmpty && TextUtils.isEmpty(str26)) ? false : true)) {
            return;
        }
        boolean z11 = m6Var.B;
        if (z11) {
            r3 r3Var2 = d6Var.f32530u;
            H(r3Var2);
            String str27 = sVar.f32858u;
            boolean v10 = r3Var2.v(str24, str27);
            a6 a6Var = d6Var.Y;
            y3 y3Var2 = d6Var.F;
            if (v10) {
                b().o().d("Dropping blocked event. appId", w2.q(str24), y3Var2.r().d(str27));
                H(r3Var2);
                if (!"1".equals(r3Var2.e(str24, "measurement.upload.blacklist_internal"))) {
                    H(r3Var2);
                    if (!"1".equals(r3Var2.e(str24, "measurement.upload.blacklist_public"))) {
                        if ("_err".equals(str27)) {
                            return;
                        }
                        P();
                        k6.x(a6Var, str24, 11, "_ev", sVar.f32858u, 0);
                        return;
                    }
                }
                k kVar4 = d6Var.f32532w;
                H(kVar4);
                l4 B2 = kVar4.B(str24);
                if (B2 != null) {
                    y3 y3Var3 = B2.f32705a;
                    w3 w3Var = y3Var3.D;
                    y3.k(w3Var);
                    w3Var.h();
                    long j14 = B2.E;
                    w3 w3Var2 = y3Var3.D;
                    y3.k(w3Var2);
                    w3Var2.h();
                    long abs = Math.abs(((kotlin.jvm.internal.b0) c()).k() - Math.max(j14, B2.D));
                    J();
                    if (abs > ((Long) j2.f32676z.a(null)).longValue()) {
                        b().l().b("Fetching config for blocked app");
                        d6Var.h(B2);
                        return;
                    }
                    return;
                }
                return;
            }
            x2 b11 = x2.b(sVar);
            k6 P = P();
            f J2 = J();
            J2.getClass();
            P.w(b11, Math.max(Math.min(J2.l(str24, j2.I), 100), 25));
            s a10 = b11.a();
            String str28 = a10.f32858u;
            if (Log.isLoggable(b().t(), 2)) {
                f6Var = f6Var3;
                b().n().c(y3Var2.r().c(a10), "Logging event");
            } else {
                f6Var = f6Var3;
            }
            k kVar5 = d6Var.f32532w;
            H(kVar5);
            kVar5.N();
            try {
                d6Var.I(m6Var);
                if (!"ecommerce_purchase".equals(str28) && !"purchase".equals(str28) && !"refund".equals(str28)) {
                    z10 = false;
                    equals = "_iap".equals(str28);
                    qVar = a10.f32859v;
                    if (!equals) {
                        if (z10) {
                            z10 = true;
                        } else {
                            str2 = "raw_events";
                            str3 = "_sno";
                            str = str22;
                            str6 = str23;
                            str4 = str28;
                            r3Var = r3Var2;
                            str5 = str25;
                            f6Var2 = f6Var;
                            boolean T = k6.T(str4);
                            String str29 = str4;
                            boolean equals2 = "_err".equals(str29);
                            P();
                            if (qVar == null) {
                                j10 = 0;
                            } else {
                                j10 = 0;
                                for (String str30 : qVar.f32819u.keySet()) {
                                    if (qVar.f32819u.get(str30) instanceof Parcelable[]) {
                                        j10 += ((Parcelable[]) obj).length;
                                    }
                                }
                            }
                            k kVar6 = d6Var.f32532w;
                            H(kVar6);
                            i E = kVar6.E(v(), str24, j10 + 1, true, T, false, equals2, false);
                            long j15 = E.f32608b;
                            J();
                            r3 r3Var3 = r3Var;
                            y3 y3Var4 = y3Var2;
                            intValue = j15 - ((Integer) j2.f32656k.a(null)).intValue();
                            if (intValue > 0) {
                                if (intValue % 1000 == 1) {
                                    b().m().d("Data loss. Too many events logged. appId, count", w2.q(str24), Long.valueOf(E.f32608b));
                                }
                                k kVar7 = d6Var.f32532w;
                                H(kVar7);
                                kVar7.m();
                                k kVar8 = d6Var.f32532w;
                                H(kVar8);
                                kVar8.O();
                                return;
                            }
                            if (T) {
                                long j16 = E.f32607a;
                                J();
                                str7 = str29;
                                long intValue2 = j16 - ((Integer) j2.f32660m.a(null)).intValue();
                                if (intValue2 > 0) {
                                    if (intValue2 % 1000 == 1) {
                                        b().m().d("Data loss. Too many public events logged. appId, count", w2.q(str24), Long.valueOf(E.f32607a));
                                    }
                                    P();
                                    k6.x(a6Var, str24, 16, "_ev", a10.f32858u, 0);
                                    k kVar9 = d6Var.f32532w;
                                    H(kVar9);
                                    kVar9.m();
                                    k kVar10 = d6Var.f32532w;
                                    H(kVar10);
                                    kVar10.O();
                                    return;
                                }
                            } else {
                                str7 = str29;
                            }
                            if (equals2) {
                                str8 = str6;
                                long max = E.f32610d - Math.max(0, Math.min(1000000, J().l(str8, j2.f32658l)));
                                if (max > 0) {
                                    if (max == 1) {
                                        b().m().d("Too many error events logged. appId, count", w2.q(str24), Long.valueOf(E.f32610d));
                                    }
                                    k kVar11 = d6Var.f32532w;
                                    H(kVar11);
                                    kVar11.m();
                                    k kVar12 = d6Var.f32532w;
                                    H(kVar12);
                                    kVar12.O();
                                    return;
                                }
                            } else {
                                str8 = str6;
                            }
                            Bundle f02 = qVar.f0();
                            P().y(f02, "_o", a10.f32860w);
                            if (TextUtils.isEmpty(str24) ? false : P().f32943u.A.i("debug.firebase.analytics.app").equals(str24)) {
                                P().y(f02, "_dbg", 1L);
                                P().y(f02, "_r", 1L);
                            }
                            if ("_s".equals(str7)) {
                                k kVar13 = d6Var.f32532w;
                                H(kVar13);
                                String str31 = str3;
                                i6 G = kVar13.G(str8, str31);
                                if (G != null && (G.f32635e instanceof Long)) {
                                    P().y(f02, str31, G.f32635e);
                                }
                            }
                            k kVar14 = d6Var.f32532w;
                            H(kVar14);
                            y3 y3Var5 = kVar14.f32943u;
                            v9.o.e(str24);
                            kVar14.h();
                            kVar14.i();
                            try {
                                try {
                                    str9 = str2;
                                    try {
                                        j11 = kVar14.A().delete(str9, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str24, String.valueOf(Math.max(0, Math.min(1000000, y3Var5.n().l(str24, j2.f32666p))))});
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        y3Var5.b().m().d("Error deleting over the limit events. appId", w2.q(str24), e);
                                        j11 = 0;
                                        if (j11 > 0) {
                                        }
                                        str10 = str9;
                                        String str32 = str8;
                                        o oVar2 = new o(d6Var.F, a10.f32860w, str24, a10.f32858u, a10.f32861x, f02);
                                        String str33 = oVar2.f32774b;
                                        k kVar15 = d6Var.f32532w;
                                        H(kVar15);
                                        F = kVar15.F(str24, str33);
                                        if (F != null) {
                                        }
                                        k kVar16 = d6Var.f32532w;
                                        H(kVar16);
                                        kVar16.o(pVar);
                                        a().h();
                                        g();
                                        str13 = oVar2.f32773a;
                                        v9.o.e(str13);
                                        str14 = str11;
                                        v9.o.b(str13.equals(str14));
                                        D1 = com.google.android.gms.internal.measurement.v2.D1();
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.n0((com.google.android.gms.internal.measurement.v2) D1.f8613v);
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.K0((com.google.android.gms.internal.measurement.v2) D1.f8613v);
                                        if (!TextUtils.isEmpty(str14)) {
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                        }
                                        if (TextUtils.isEmpty(str21)) {
                                        }
                                        ca.c();
                                        if (J().q(null, j2.f32651h0)) {
                                        }
                                        m6Var2 = m6Var;
                                        j12 = m6Var2.D;
                                        if (j12 != -2147483648L) {
                                        }
                                        long j17 = m6Var2.f32752y;
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.V((com.google.android.gms.internal.measurement.v2) D1.f8613v, j17);
                                        if (TextUtils.isEmpty(str5)) {
                                        }
                                        v9.o.h(str14);
                                        String e11 = d6Var.K(str14).c(h.b(m6Var2.P)).e();
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.R((com.google.android.gms.internal.measurement.v2) D1.f8613v, e11);
                                        if (D1.r().isEmpty()) {
                                            D1.i();
                                            com.google.android.gms.internal.measurement.v2.M((com.google.android.gms.internal.measurement.v2) D1.f8613v, str26);
                                        }
                                        j13 = m6Var2.f32753z;
                                        if (j13 != 0) {
                                        }
                                        long j18 = m6Var2.M;
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.P((com.google.android.gms.internal.measurement.v2) D1.f8613v, j18);
                                        H(f6Var2);
                                        f6 f6Var4 = f6Var2;
                                        b10 = j2.b(f6Var4.f32947v.F.f());
                                        y3 y3Var6 = f6Var4.f32943u;
                                        if (b10 != null) {
                                            arrayList = new ArrayList();
                                            int intValue3 = ((Integer) j2.P.a(null)).intValue();
                                            it2 = b10.entrySet().iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                }
                                                str13 = str18;
                                                it2 = r17;
                                            }
                                            if (arrayList.isEmpty()) {
                                            }
                                            if (arrayList != null) {
                                            }
                                            c10 = d6Var.K(str14).c(h.b(m6Var2.P));
                                            g gVar = g.AD_STORAGE;
                                            f = c10.f(gVar);
                                            boolean z12 = m6Var2.I;
                                            if (f) {
                                            }
                                            oVar = oVar2;
                                            y3Var4.o().j();
                                            String str34 = Build.MODEL;
                                            D1.i();
                                            com.google.android.gms.internal.measurement.v2.N0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str34);
                                            y3Var4.o().j();
                                            String str35 = Build.VERSION.RELEASE;
                                            D1.i();
                                            com.google.android.gms.internal.measurement.v2.L0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str35);
                                            y3 y3Var7 = y3Var6;
                                            int m10 = (int) y3Var4.o().m();
                                            D1.i();
                                            com.google.android.gms.internal.measurement.v2.Q0((com.google.android.gms.internal.measurement.v2) D1.f8613v, m10);
                                            String n10 = y3Var4.o().n();
                                            D1.i();
                                            com.google.android.gms.internal.measurement.v2.P0((com.google.android.gms.internal.measurement.v2) D1.f8613v, n10);
                                            if (y3Var4.g()) {
                                            }
                                            k kVar17 = d6Var.f32532w;
                                            H(kVar17);
                                            B = kVar17.B(str14);
                                            if (B == null) {
                                            }
                                            if (c10.f(g.ANALYTICS_STORAGE)) {
                                            }
                                            if (!TextUtils.isEmpty(B.G())) {
                                            }
                                            k kVar18 = d6Var.f32532w;
                                            H(kVar18);
                                            L = kVar18.L(str14);
                                            i6 = 0;
                                            while (i6 < L.size()) {
                                            }
                                            kVar2 = d6Var.f32532w;
                                            H(kVar2);
                                            v2Var = (com.google.android.gms.internal.measurement.v2) D1.f();
                                            kVar2.h();
                                            kVar2.i();
                                            v9.o.e(v2Var.H1());
                                            byte[] g5 = v2Var.g();
                                            f6 f6Var5 = kVar2.f32947v.A;
                                            H(f6Var5);
                                            long v11 = f6Var5.v(g5);
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("app_id", v2Var.H1());
                                            contentValues2.put("metadata_fingerprint", Long.valueOf(v11));
                                            contentValues2.put("metadata", g5);
                                            kVar2.A().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                            kVar3 = d6Var.f32532w;
                                            H(kVar3);
                                            o oVar3 = oVar;
                                            it = oVar3.f.f32819u.keySet().iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                }
                                                str12 = str20;
                                            }
                                            kVar3.h();
                                            kVar3.i();
                                            v9.o.e(str19);
                                            f6 f6Var6 = kVar3.f32947v.A;
                                            H(f6Var6);
                                            com.google.android.gms.internal.measurement.l2 y10 = com.google.android.gms.internal.measurement.m2.y();
                                            y10.i();
                                            com.google.android.gms.internal.measurement.m2.K(oVar3.f32777e, (com.google.android.gms.internal.measurement.m2) y10.f8613v);
                                            q qVar2 = oVar3.f;
                                            while (r10.hasNext()) {
                                            }
                                            byte[] g10 = ((com.google.android.gms.internal.measurement.m2) y10.f()).g();
                                            contentValues = new ContentValues();
                                            contentValues.put("app_id", str19);
                                            contentValues.put(SessionManager.KEY_NAME, oVar3.f32774b);
                                            contentValues.put(ServerValues.NAME_OP_TIMESTAMP, Long.valueOf(oVar3.f32776d));
                                            contentValues.put("metadata_fingerprint", Long.valueOf(v11));
                                            contentValues.put("data", g10);
                                            contentValues.put("realtime", Integer.valueOf(i10));
                                            if (kVar3.A().insert(str10, null, contentValues) != -1) {
                                            }
                                            k kVar19 = d6Var.f32532w;
                                            H(kVar19);
                                            kVar19.m();
                                            k kVar20 = d6Var.f32532w;
                                            H(kVar20);
                                            kVar20.O();
                                            C();
                                            b().n().c(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                            return;
                                        }
                                        str18 = str13;
                                        if (arrayList != null) {
                                        }
                                        c10 = d6Var.K(str14).c(h.b(m6Var2.P));
                                        g gVar2 = g.AD_STORAGE;
                                        f = c10.f(gVar2);
                                        boolean z122 = m6Var2.I;
                                        if (f) {
                                        }
                                        oVar = oVar2;
                                        y3Var4.o().j();
                                        String str342 = Build.MODEL;
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.N0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str342);
                                        y3Var4.o().j();
                                        String str352 = Build.VERSION.RELEASE;
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.L0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str352);
                                        y3 y3Var72 = y3Var6;
                                        int m102 = (int) y3Var4.o().m();
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.Q0((com.google.android.gms.internal.measurement.v2) D1.f8613v, m102);
                                        String n102 = y3Var4.o().n();
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.P0((com.google.android.gms.internal.measurement.v2) D1.f8613v, n102);
                                        if (y3Var4.g()) {
                                        }
                                        k kVar172 = d6Var.f32532w;
                                        H(kVar172);
                                        B = kVar172.B(str14);
                                        if (B == null) {
                                        }
                                        if (c10.f(g.ANALYTICS_STORAGE)) {
                                        }
                                        if (!TextUtils.isEmpty(B.G())) {
                                        }
                                        k kVar182 = d6Var.f32532w;
                                        H(kVar182);
                                        L = kVar182.L(str14);
                                        i6 = 0;
                                        while (i6 < L.size()) {
                                        }
                                        kVar2 = d6Var.f32532w;
                                        H(kVar2);
                                        v2Var = (com.google.android.gms.internal.measurement.v2) D1.f();
                                        kVar2.h();
                                        kVar2.i();
                                        v9.o.e(v2Var.H1());
                                        byte[] g52 = v2Var.g();
                                        f6 f6Var52 = kVar2.f32947v.A;
                                        H(f6Var52);
                                        long v112 = f6Var52.v(g52);
                                        ContentValues contentValues22 = new ContentValues();
                                        contentValues22.put("app_id", v2Var.H1());
                                        contentValues22.put("metadata_fingerprint", Long.valueOf(v112));
                                        contentValues22.put("metadata", g52);
                                        kVar2.A().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                        kVar3 = d6Var.f32532w;
                                        H(kVar3);
                                        o oVar32 = oVar;
                                        it = oVar32.f.f32819u.keySet().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                            }
                                            str12 = str20;
                                        }
                                        kVar3.h();
                                        kVar3.i();
                                        v9.o.e(str19);
                                        f6 f6Var62 = kVar3.f32947v.A;
                                        H(f6Var62);
                                        com.google.android.gms.internal.measurement.l2 y102 = com.google.android.gms.internal.measurement.m2.y();
                                        y102.i();
                                        com.google.android.gms.internal.measurement.m2.K(oVar32.f32777e, (com.google.android.gms.internal.measurement.m2) y102.f8613v);
                                        q qVar22 = oVar32.f;
                                        while (r10.hasNext()) {
                                        }
                                        byte[] g102 = ((com.google.android.gms.internal.measurement.m2) y102.f()).g();
                                        contentValues = new ContentValues();
                                        contentValues.put("app_id", str19);
                                        contentValues.put(SessionManager.KEY_NAME, oVar32.f32774b);
                                        contentValues.put(ServerValues.NAME_OP_TIMESTAMP, Long.valueOf(oVar32.f32776d));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(v112));
                                        contentValues.put("data", g102);
                                        contentValues.put("realtime", Integer.valueOf(i10));
                                        if (kVar3.A().insert(str10, null, contentValues) != -1) {
                                        }
                                        k kVar192 = d6Var.f32532w;
                                        H(kVar192);
                                        kVar192.m();
                                        k kVar202 = d6Var.f32532w;
                                        H(kVar202);
                                        kVar202.O();
                                        C();
                                        b().n().c(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                        return;
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    str9 = str2;
                                }
                            } catch (SQLiteException e13) {
                                e = e13;
                                str9 = str2;
                            }
                            if (j11 > 0) {
                                b().o().d("Data lost. Too many events stored on disk, deleted. appId", w2.q(str24), Long.valueOf(j11));
                            }
                            str10 = str9;
                            String str322 = str8;
                            o oVar22 = new o(d6Var.F, a10.f32860w, str24, a10.f32858u, a10.f32861x, f02);
                            String str332 = oVar22.f32774b;
                            k kVar152 = d6Var.f32532w;
                            H(kVar152);
                            F = kVar152.F(str24, str332);
                            if (F != null) {
                                k kVar21 = d6Var.f32532w;
                                H(kVar21);
                                long z13 = kVar21.z(str24);
                                J().getClass();
                                i2 i2Var = j2.H;
                                if (z13 >= Math.max(Math.min(J.l(str24, i2Var), 2000), 500) && T) {
                                    u2 m11 = b().m();
                                    v2 q10 = w2.q(str24);
                                    String d10 = y3Var4.r().d(str332);
                                    f J3 = J();
                                    J3.getClass();
                                    m11.e("Too many event names used, ignoring event. appId, name, supported count", q10, d10, Integer.valueOf(Math.max(Math.min(J3.l(str24, i2Var), 2000), 500)));
                                    P();
                                    k6.x(a6Var, str24, 8, null, null, 0);
                                    k kVar22 = d6Var.f32532w;
                                    H(kVar22);
                                    kVar22.O();
                                    return;
                                }
                                pVar = new p(str24, oVar22.f32774b, 0L, 0L, 0L, oVar22.f32776d, 0L, null, null, null, null);
                                str11 = str322;
                                str12 = "_r";
                            } else {
                                o a11 = oVar22.a(y3Var4, F.f);
                                y3Var4 = y3Var4;
                                str11 = str322;
                                str12 = "_r";
                                try {
                                    d6Var = this;
                                    pVar = new p(F.f32792a, F.f32793b, F.f32794c, F.f32795d, F.f32796e, a11.f32776d, F.f32797g, F.f32798h, F.f32799i, F.f32800j, F.f32801k);
                                    oVar22 = a11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    d6Var = this;
                                    Throwable th3 = th;
                                    k kVar23 = d6Var.f32532w;
                                    H(kVar23);
                                    kVar23.O();
                                    throw th3;
                                }
                            }
                            k kVar162 = d6Var.f32532w;
                            H(kVar162);
                            kVar162.o(pVar);
                            a().h();
                            g();
                            str13 = oVar22.f32773a;
                            v9.o.e(str13);
                            str14 = str11;
                            v9.o.b(str13.equals(str14));
                            D1 = com.google.android.gms.internal.measurement.v2.D1();
                            D1.i();
                            com.google.android.gms.internal.measurement.v2.n0((com.google.android.gms.internal.measurement.v2) D1.f8613v);
                            D1.i();
                            com.google.android.gms.internal.measurement.v2.K0((com.google.android.gms.internal.measurement.v2) D1.f8613v);
                            if (!TextUtils.isEmpty(str14)) {
                                D1.i();
                                com.google.android.gms.internal.measurement.v2.S0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str14);
                            }
                            if (TextUtils.isEmpty(str)) {
                                D1.i();
                                str15 = str;
                                com.google.android.gms.internal.measurement.v2.R0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str15);
                            } else {
                                str15 = str;
                            }
                            if (TextUtils.isEmpty(str21)) {
                                D1.i();
                                str16 = str21;
                                com.google.android.gms.internal.measurement.v2.U((com.google.android.gms.internal.measurement.v2) D1.f8613v, str16);
                            } else {
                                str16 = str21;
                            }
                            ca.c();
                            if (J().q(null, j2.f32651h0) || !J().q(str14, j2.f32655j0)) {
                                m6Var2 = m6Var;
                            } else {
                                m6Var2 = m6Var;
                                if (!TextUtils.isEmpty(m6Var2.R)) {
                                    String str36 = m6Var2.R;
                                    D1.i();
                                    com.google.android.gms.internal.measurement.v2.u0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str36);
                                }
                            }
                            j12 = m6Var2.D;
                            if (j12 != -2147483648L) {
                                D1.i();
                                com.google.android.gms.internal.measurement.v2.m0((com.google.android.gms.internal.measurement.v2) D1.f8613v, (int) j12);
                            }
                            long j172 = m6Var2.f32752y;
                            D1.i();
                            com.google.android.gms.internal.measurement.v2.V((com.google.android.gms.internal.measurement.v2) D1.f8613v, j172);
                            if (TextUtils.isEmpty(str5)) {
                                D1.i();
                                str17 = str5;
                                com.google.android.gms.internal.measurement.v2.h0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str17);
                            } else {
                                str17 = str5;
                            }
                            v9.o.h(str14);
                            String e112 = d6Var.K(str14).c(h.b(m6Var2.P)).e();
                            D1.i();
                            com.google.android.gms.internal.measurement.v2.R((com.google.android.gms.internal.measurement.v2) D1.f8613v, e112);
                            if (D1.r().isEmpty() && !TextUtils.isEmpty(str26)) {
                                D1.i();
                                com.google.android.gms.internal.measurement.v2.M((com.google.android.gms.internal.measurement.v2) D1.f8613v, str26);
                            }
                            j13 = m6Var2.f32753z;
                            if (j13 != 0) {
                                D1.i();
                                com.google.android.gms.internal.measurement.v2.d0((com.google.android.gms.internal.measurement.v2) D1.f8613v, j13);
                            }
                            long j182 = m6Var2.M;
                            D1.i();
                            com.google.android.gms.internal.measurement.v2.P((com.google.android.gms.internal.measurement.v2) D1.f8613v, j182);
                            H(f6Var2);
                            f6 f6Var42 = f6Var2;
                            b10 = j2.b(f6Var42.f32947v.F.f());
                            y3 y3Var62 = f6Var42.f32943u;
                            try {
                                if (b10 != null && !b10.isEmpty()) {
                                    arrayList = new ArrayList();
                                    int intValue32 = ((Integer) j2.P.a(null)).intValue();
                                    it2 = b10.entrySet().iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            str18 = str13;
                                            break;
                                        }
                                        Map.Entry entry = (Map.Entry) it2.next();
                                        Iterator it3 = it2;
                                        str18 = str13;
                                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int parseInt = Integer.parseInt((String) entry.getValue());
                                                if (parseInt != 0) {
                                                    arrayList.add(Integer.valueOf(parseInt));
                                                    if (arrayList.size() >= intValue32) {
                                                        y3Var62.b().o().c(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e14) {
                                                y3Var62.b().o().c(e14, "Experiment ID NumberFormatException");
                                            }
                                        }
                                        str13 = str18;
                                        it2 = it3;
                                    }
                                    arrayList = arrayList.isEmpty() ? null : null;
                                    if (arrayList != null) {
                                        D1.u(arrayList);
                                    }
                                    c10 = d6Var.K(str14).c(h.b(m6Var2.P));
                                    g gVar22 = g.AD_STORAGE;
                                    f = c10.f(gVar22);
                                    boolean z1222 = m6Var2.I;
                                    if (f || !z1222) {
                                        oVar = oVar22;
                                    } else {
                                        n5 n5Var = d6Var.C;
                                        n5Var.getClass();
                                        if (c10.f(gVar22)) {
                                            pair = n5Var.l(str14);
                                            oVar = oVar22;
                                        } else {
                                            oVar = oVar22;
                                            pair = new Pair("", Boolean.FALSE);
                                        }
                                        if (!TextUtils.isEmpty((CharSequence) pair.first) && z1222) {
                                            D1.i();
                                            com.google.android.gms.internal.measurement.v2.X((com.google.android.gms.internal.measurement.v2) D1.f8613v, (String) pair.first);
                                            Object obj2 = pair.second;
                                            if (obj2 != null) {
                                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                                D1.i();
                                                com.google.android.gms.internal.measurement.v2.Z((com.google.android.gms.internal.measurement.v2) D1.f8613v, booleanValue);
                                            }
                                        }
                                    }
                                    y3Var4.o().j();
                                    String str3422 = Build.MODEL;
                                    D1.i();
                                    com.google.android.gms.internal.measurement.v2.N0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str3422);
                                    y3Var4.o().j();
                                    String str3522 = Build.VERSION.RELEASE;
                                    D1.i();
                                    com.google.android.gms.internal.measurement.v2.L0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str3522);
                                    y3 y3Var722 = y3Var62;
                                    int m1022 = (int) y3Var4.o().m();
                                    D1.i();
                                    com.google.android.gms.internal.measurement.v2.Q0((com.google.android.gms.internal.measurement.v2) D1.f8613v, m1022);
                                    String n1022 = y3Var4.o().n();
                                    D1.i();
                                    com.google.android.gms.internal.measurement.v2.P0((com.google.android.gms.internal.measurement.v2) D1.f8613v, n1022);
                                    if (y3Var4.g()) {
                                        D1.q();
                                        if (!TextUtils.isEmpty(null)) {
                                            D1.i();
                                            com.google.android.gms.internal.measurement.v2 v2Var2 = (com.google.android.gms.internal.measurement.v2) D1.f8613v;
                                            throw null;
                                        }
                                    }
                                    k kVar1722 = d6Var.f32532w;
                                    H(kVar1722);
                                    B = kVar1722.B(str14);
                                    if (B == null) {
                                        B = new l4(y3Var4, str14);
                                        B.b(d6Var.Q(c10));
                                        B.o(m6Var2.E);
                                        B.p(str17);
                                        if (c10.f(gVar22)) {
                                            B.w(d6Var.C.m(str14, z1222));
                                        }
                                        B.t(0L);
                                        B.u(0L);
                                        B.s(0L);
                                        B.d(str16);
                                        B.e(m6Var2.D);
                                        B.c(str15);
                                        B.q(m6Var2.f32752y);
                                        B.m(m6Var2.f32753z);
                                        B.v(z11);
                                        B.n(m6Var2.M);
                                        k kVar24 = d6Var.f32532w;
                                        H(kVar24);
                                        kVar24.n(B);
                                    }
                                    if (c10.f(g.ANALYTICS_STORAGE) && !TextUtils.isEmpty(B.E())) {
                                        String E2 = B.E();
                                        v9.o.h(E2);
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.b0((com.google.android.gms.internal.measurement.v2) D1.f8613v, E2);
                                    }
                                    if (!TextUtils.isEmpty(B.G())) {
                                        String G2 = B.G();
                                        v9.o.h(G2);
                                        D1.i();
                                        com.google.android.gms.internal.measurement.v2.l0((com.google.android.gms.internal.measurement.v2) D1.f8613v, G2);
                                    }
                                    k kVar1822 = d6Var.f32532w;
                                    H(kVar1822);
                                    L = kVar1822.L(str14);
                                    i6 = 0;
                                    while (i6 < L.size()) {
                                        com.google.android.gms.internal.measurement.d3 x10 = com.google.android.gms.internal.measurement.e3.x();
                                        String str37 = ((i6) L.get(i6)).f32633c;
                                        x10.i();
                                        com.google.android.gms.internal.measurement.e3.C((com.google.android.gms.internal.measurement.e3) x10.f8613v, str37);
                                        long j19 = ((i6) L.get(i6)).f32634d;
                                        x10.i();
                                        com.google.android.gms.internal.measurement.e3.B((com.google.android.gms.internal.measurement.e3) x10.f8613v, j19);
                                        H(f6Var42);
                                        Object obj3 = ((i6) L.get(i6)).f32635e;
                                        v9.o.h(obj3);
                                        x10.i();
                                        com.google.android.gms.internal.measurement.e3.E((com.google.android.gms.internal.measurement.e3) x10.f8613v);
                                        x10.i();
                                        com.google.android.gms.internal.measurement.e3.G((com.google.android.gms.internal.measurement.e3) x10.f8613v);
                                        x10.i();
                                        com.google.android.gms.internal.measurement.e3.I((com.google.android.gms.internal.measurement.e3) x10.f8613v);
                                        if (obj3 instanceof String) {
                                            x10.i();
                                            com.google.android.gms.internal.measurement.e3.D((com.google.android.gms.internal.measurement.e3) x10.f8613v, (String) obj3);
                                        } else if (obj3 instanceof Long) {
                                            long longValue2 = ((Long) obj3).longValue();
                                            x10.i();
                                            com.google.android.gms.internal.measurement.e3.F((com.google.android.gms.internal.measurement.e3) x10.f8613v, longValue2);
                                        } else if (obj3 instanceof Double) {
                                            double doubleValue = ((Double) obj3).doubleValue();
                                            x10.i();
                                            com.google.android.gms.internal.measurement.e3.H((com.google.android.gms.internal.measurement.e3) x10.f8613v, doubleValue);
                                        } else {
                                            y3Var = y3Var722;
                                            w2 w2Var = y3Var.C;
                                            y3.k(w2Var);
                                            w2Var.f32925z.c(obj3, "Ignoring invalid (type) user attribute value");
                                            D1.v(x10);
                                            i6++;
                                            y3Var722 = y3Var;
                                        }
                                        y3Var = y3Var722;
                                        D1.v(x10);
                                        i6++;
                                        y3Var722 = y3Var;
                                    }
                                    kVar2 = d6Var.f32532w;
                                    H(kVar2);
                                    v2Var = (com.google.android.gms.internal.measurement.v2) D1.f();
                                    kVar2.h();
                                    kVar2.i();
                                    v9.o.e(v2Var.H1());
                                    byte[] g522 = v2Var.g();
                                    f6 f6Var522 = kVar2.f32947v.A;
                                    H(f6Var522);
                                    long v1122 = f6Var522.v(g522);
                                    ContentValues contentValues222 = new ContentValues();
                                    contentValues222.put("app_id", v2Var.H1());
                                    contentValues222.put("metadata_fingerprint", Long.valueOf(v1122));
                                    contentValues222.put("metadata", g522);
                                    kVar2.A().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                    kVar3 = d6Var.f32532w;
                                    H(kVar3);
                                    o oVar322 = oVar;
                                    it = oVar322.f.f32819u.keySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            str20 = str12;
                                            if (str20.equals(it.next())) {
                                                str19 = str18;
                                                break;
                                            }
                                            str12 = str20;
                                        } else {
                                            H(r3Var3);
                                            str19 = str18;
                                            boolean u10 = r3Var3.u(str19, oVar322.f32774b);
                                            k kVar25 = d6Var.f32532w;
                                            H(kVar25);
                                            i D = kVar25.D(v(), oVar322.f32773a, false, false);
                                            if (!u10 || D.f32611e >= J().l(str19, j2.f32664o)) {
                                                i10 = 0;
                                            }
                                        }
                                    }
                                    kVar3.h();
                                    kVar3.i();
                                    v9.o.e(str19);
                                    f6 f6Var622 = kVar3.f32947v.A;
                                    H(f6Var622);
                                    com.google.android.gms.internal.measurement.l2 y1022 = com.google.android.gms.internal.measurement.m2.y();
                                    y1022.i();
                                    com.google.android.gms.internal.measurement.m2.K(oVar322.f32777e, (com.google.android.gms.internal.measurement.m2) y1022.f8613v);
                                    q qVar222 = oVar322.f;
                                    for (String str38 : qVar222.f32819u.keySet()) {
                                        com.google.android.gms.internal.measurement.p2 y11 = com.google.android.gms.internal.measurement.q2.y();
                                        y11.l(str38);
                                        Object obj4 = qVar222.f32819u.get(str38);
                                        v9.o.h(obj4);
                                        f6Var622.F(y11, obj4);
                                        y1022.m(y11);
                                    }
                                    byte[] g1022 = ((com.google.android.gms.internal.measurement.m2) y1022.f()).g();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str19);
                                    contentValues.put(SessionManager.KEY_NAME, oVar322.f32774b);
                                    contentValues.put(ServerValues.NAME_OP_TIMESTAMP, Long.valueOf(oVar322.f32776d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(v1122));
                                    contentValues.put("data", g1022);
                                    contentValues.put("realtime", Integer.valueOf(i10));
                                    if (kVar3.A().insert(str10, null, contentValues) != -1) {
                                        kVar3.f32943u.b().m().c(w2.q(str19), "Failed to insert raw event (got -1). appId");
                                    } else {
                                        d6Var.I = 0L;
                                    }
                                    k kVar1922 = d6Var.f32532w;
                                    H(kVar1922);
                                    kVar1922.m();
                                    k kVar2022 = d6Var.f32532w;
                                    H(kVar2022);
                                    kVar2022.O();
                                    C();
                                    b().n().c(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                                kVar2.A().insertWithOnConflict("raw_events_metadata", null, contentValues222, 4);
                                kVar3 = d6Var.f32532w;
                                H(kVar3);
                                o oVar3222 = oVar;
                                it = oVar3222.f.f32819u.keySet().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                    }
                                    str12 = str20;
                                }
                                kVar3.h();
                                kVar3.i();
                                v9.o.e(str19);
                                f6 f6Var6222 = kVar3.f32947v.A;
                                H(f6Var6222);
                                com.google.android.gms.internal.measurement.l2 y10222 = com.google.android.gms.internal.measurement.m2.y();
                                y10222.i();
                                com.google.android.gms.internal.measurement.m2.K(oVar3222.f32777e, (com.google.android.gms.internal.measurement.m2) y10222.f8613v);
                                q qVar2222 = oVar3222.f;
                                while (r10.hasNext()) {
                                }
                                byte[] g10222 = ((com.google.android.gms.internal.measurement.m2) y10222.f()).g();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str19);
                                contentValues.put(SessionManager.KEY_NAME, oVar3222.f32774b);
                                contentValues.put(ServerValues.NAME_OP_TIMESTAMP, Long.valueOf(oVar3222.f32776d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(v1122));
                                contentValues.put("data", g10222);
                                contentValues.put("realtime", Integer.valueOf(i10));
                                if (kVar3.A().insert(str10, null, contentValues) != -1) {
                                }
                                k kVar19222 = d6Var.f32532w;
                                H(kVar19222);
                                kVar19222.m();
                                k kVar20222 = d6Var.f32532w;
                                H(kVar20222);
                                kVar20222.O();
                                C();
                                b().n().c(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                return;
                            } catch (SQLiteException e15) {
                                kVar2.f32943u.b().m().d("Error storing raw event metadata. appId", w2.q(v2Var.H1()), e15);
                                throw e15;
                            }
                            str18 = str13;
                            if (arrayList != null) {
                            }
                            c10 = d6Var.K(str14).c(h.b(m6Var2.P));
                            g gVar222 = g.AD_STORAGE;
                            f = c10.f(gVar222);
                            boolean z12222 = m6Var2.I;
                            if (f) {
                            }
                            oVar = oVar22;
                            y3Var4.o().j();
                            String str34222 = Build.MODEL;
                            D1.i();
                            com.google.android.gms.internal.measurement.v2.N0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str34222);
                            y3Var4.o().j();
                            String str35222 = Build.VERSION.RELEASE;
                            D1.i();
                            com.google.android.gms.internal.measurement.v2.L0((com.google.android.gms.internal.measurement.v2) D1.f8613v, str35222);
                            y3 y3Var7222 = y3Var62;
                            int m10222 = (int) y3Var4.o().m();
                            D1.i();
                            com.google.android.gms.internal.measurement.v2.Q0((com.google.android.gms.internal.measurement.v2) D1.f8613v, m10222);
                            String n10222 = y3Var4.o().n();
                            D1.i();
                            com.google.android.gms.internal.measurement.v2.P0((com.google.android.gms.internal.measurement.v2) D1.f8613v, n10222);
                            if (y3Var4.g()) {
                            }
                            k kVar17222 = d6Var.f32532w;
                            H(kVar17222);
                            B = kVar17222.B(str14);
                            if (B == null) {
                            }
                            if (c10.f(g.ANALYTICS_STORAGE)) {
                                String E22 = B.E();
                                v9.o.h(E22);
                                D1.i();
                                com.google.android.gms.internal.measurement.v2.b0((com.google.android.gms.internal.measurement.v2) D1.f8613v, E22);
                            }
                            if (!TextUtils.isEmpty(B.G())) {
                            }
                            k kVar18222 = d6Var.f32532w;
                            H(kVar18222);
                            L = kVar18222.L(str14);
                            i6 = 0;
                            while (i6 < L.size()) {
                            }
                            kVar2 = d6Var.f32532w;
                            H(kVar2);
                            v2Var = (com.google.android.gms.internal.measurement.v2) D1.f();
                            kVar2.h();
                            kVar2.i();
                            v9.o.e(v2Var.H1());
                            byte[] g5222 = v2Var.g();
                            f6 f6Var5222 = kVar2.f32947v.A;
                            H(f6Var5222);
                            long v11222 = f6Var5222.v(g5222);
                            ContentValues contentValues2222 = new ContentValues();
                            contentValues2222.put("app_id", v2Var.H1());
                            contentValues2222.put("metadata_fingerprint", Long.valueOf(v11222));
                            contentValues2222.put("metadata", g5222);
                        }
                    }
                    str = str22;
                    string = qVar.f32819u.getString("currency");
                    str2 = "raw_events";
                    Bundle bundle = qVar.f32819u;
                    if (!z10) {
                        double doubleValue2 = qVar.g0().doubleValue() * 1000000.0d;
                        if (doubleValue2 == 0.0d) {
                            str3 = "_sno";
                            doubleValue2 = Long.valueOf(bundle.getLong("value")).longValue() * 1000000.0d;
                        } else {
                            str3 = "_sno";
                        }
                        if (doubleValue2 <= 9.223372036854776E18d && doubleValue2 >= -9.223372036854776E18d) {
                            longValue = Math.round(doubleValue2);
                            if ("refund".equals(str28)) {
                                longValue = -longValue;
                            }
                        } else {
                            b().o().d("Data lost. Currency value is too big. appId", w2.q(str24), Double.valueOf(doubleValue2));
                            k kVar26 = d6Var.f32532w;
                            H(kVar26);
                            kVar26.m();
                            k kVar27 = d6Var.f32532w;
                            H(kVar27);
                            kVar27.O();
                            return;
                        }
                    } else {
                        str3 = "_sno";
                        longValue = Long.valueOf(bundle.getLong("value")).longValue();
                    }
                    if (!TextUtils.isEmpty(string)) {
                        String upperCase = string.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            String concat = "_ltv_".concat(upperCase);
                            k kVar28 = d6Var.f32532w;
                            H(kVar28);
                            i6 G3 = kVar28.G(str24, concat);
                            if (G3 != null) {
                                Object obj5 = G3.f32635e;
                                if (obj5 instanceof Long) {
                                    r3Var = r3Var2;
                                    str5 = str25;
                                    str4 = str28;
                                    f6Var2 = f6Var;
                                    str6 = str23;
                                    i6Var = new i6(str24, a10.f32860w, concat, ((kotlin.jvm.internal.b0) c()).k(), Long.valueOf(((Long) obj5).longValue() + longValue));
                                    kVar = d6Var.f32532w;
                                    H(kVar);
                                    if (!kVar.s(i6Var)) {
                                        b().m().e("Too many unique user properties are set. Ignoring user property. appId", w2.q(str24), y3Var2.r().f(i6Var.f32633c), i6Var.f32635e);
                                        P();
                                        k6.x(a6Var, str24, 9, null, null, 0);
                                    }
                                    boolean T2 = k6.T(str4);
                                    String str292 = str4;
                                    boolean equals22 = "_err".equals(str292);
                                    P();
                                    if (qVar == null) {
                                    }
                                    k kVar62 = d6Var.f32532w;
                                    H(kVar62);
                                    i E3 = kVar62.E(v(), str24, j10 + 1, true, T2, false, equals22, false);
                                    long j152 = E3.f32608b;
                                    J();
                                    r3 r3Var32 = r3Var;
                                    y3 y3Var42 = y3Var2;
                                    intValue = j152 - ((Integer) j2.f32656k.a(null)).intValue();
                                    if (intValue > 0) {
                                    }
                                }
                            }
                            str4 = str28;
                            str5 = str25;
                            f6Var2 = f6Var;
                            k kVar29 = d6Var.f32532w;
                            H(kVar29);
                            int l2 = J().l(str24, j2.E) - 1;
                            v9.o.e(str24);
                            kVar29.h();
                            kVar29.i();
                            SQLiteDatabase A = kVar29.A();
                            r3 r3Var4 = r3Var2;
                            String[] strArr = new String[3];
                            strArr[0] = str24;
                            strArr[1] = str24;
                            str6 = str23;
                            strArr[2] = String.valueOf(l2);
                            A.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr);
                            r3Var = r3Var4;
                            i6Var = new i6(str24, a10.f32860w, concat, ((kotlin.jvm.internal.b0) c()).k(), Long.valueOf(longValue));
                            kVar = d6Var.f32532w;
                            H(kVar);
                            if (!kVar.s(i6Var)) {
                            }
                            boolean T22 = k6.T(str4);
                            String str2922 = str4;
                            boolean equals222 = "_err".equals(str2922);
                            P();
                            if (qVar == null) {
                            }
                            k kVar622 = d6Var.f32532w;
                            H(kVar622);
                            i E32 = kVar622.E(v(), str24, j10 + 1, true, T22, false, equals222, false);
                            long j1522 = E32.f32608b;
                            J();
                            r3 r3Var322 = r3Var;
                            y3 y3Var422 = y3Var2;
                            intValue = j1522 - ((Integer) j2.f32656k.a(null)).intValue();
                            if (intValue > 0) {
                            }
                        }
                    }
                    str6 = str23;
                    str4 = str28;
                    r3Var = r3Var2;
                    str5 = str25;
                    f6Var2 = f6Var;
                    boolean T222 = k6.T(str4);
                    String str29222 = str4;
                    boolean equals2222 = "_err".equals(str29222);
                    P();
                    if (qVar == null) {
                    }
                    k kVar6222 = d6Var.f32532w;
                    H(kVar6222);
                    i E322 = kVar6222.E(v(), str24, j10 + 1, true, T222, false, equals2222, false);
                    long j15222 = E322.f32608b;
                    J();
                    r3 r3Var3222 = r3Var;
                    y3 y3Var4222 = y3Var2;
                    intValue = j15222 - ((Integer) j2.f32656k.a(null)).intValue();
                    if (intValue > 0) {
                    }
                }
                z10 = true;
                equals = "_iap".equals(str28);
                qVar = a10.f32859v;
                if (!equals) {
                }
                str = str22;
                string = qVar.f32819u.getString("currency");
                str2 = "raw_events";
                Bundle bundle2 = qVar.f32819u;
                if (!z10) {
                }
                if (!TextUtils.isEmpty(string)) {
                }
                str6 = str23;
                str4 = str28;
                r3Var = r3Var2;
                str5 = str25;
                f6Var2 = f6Var;
                boolean T2222 = k6.T(str4);
                String str292222 = str4;
                boolean equals22222 = "_err".equals(str292222);
                P();
                if (qVar == null) {
                }
                k kVar62222 = d6Var.f32532w;
                H(kVar62222);
                i E3222 = kVar62222.E(v(), str24, j10 + 1, true, T2222, false, equals22222, false);
                long j152222 = E3222.f32608b;
                J();
                r3 r3Var32222 = r3Var;
                y3 y3Var42222 = y3Var2;
                intValue = j152222 - ((Integer) j2.f32656k.a(null)).intValue();
                if (intValue > 0) {
                }
            } catch (Throwable th4) {
                th = th4;
                Throwable th32 = th;
                k kVar232 = d6Var.f32532w;
                H(kVar232);
                kVar232.O();
                throw th32;
            }
        } else {
            d6Var.I(m6Var);
        }
    }

    public final long v() {
        ((kotlin.jvm.internal.b0) c()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        n5 n5Var = this.C;
        n5Var.i();
        n5Var.h();
        g3 g3Var = n5Var.C;
        long a10 = g3Var.a();
        if (a10 == 0) {
            k6 k6Var = n5Var.f32943u.F;
            y3.i(k6Var);
            a10 = k6Var.q().nextInt(86400000) + 1;
            g3Var.b(a10);
        }
        return ((((currentTimeMillis + a10) / 1000) / 60) / 60) / 24;
    }

    public final m6 y(String str) {
        k kVar = this.f32532w;
        H(kVar);
        l4 B = kVar.B(str);
        if (B != null && !TextUtils.isEmpty(B.F())) {
            Boolean z10 = z(B);
            if (z10 != null && !z10.booleanValue()) {
                w2 b10 = b();
                b10.f32925z.c(w2.q(str), "App version does not match; dropping. appId");
                return null;
            }
            String H = B.H();
            String F = B.F();
            long z11 = B.z();
            y3 y3Var = B.f32705a;
            w3 w3Var = y3Var.D;
            y3.k(w3Var);
            w3Var.h();
            String str2 = B.f32715l;
            w3 w3Var2 = y3Var.D;
            y3.k(w3Var2);
            w3Var2.h();
            long j10 = B.f32716m;
            w3 w3Var3 = y3Var.D;
            y3.k(w3Var3);
            w3Var3.h();
            long j11 = B.f32717n;
            w3 w3Var4 = y3Var.D;
            y3.k(w3Var4);
            w3Var4.h();
            boolean z12 = B.f32718o;
            String G = B.G();
            w3 w3Var5 = y3Var.D;
            y3.k(w3Var5);
            w3Var5.h();
            boolean y10 = B.y();
            String B2 = B.B();
            w3 w3Var6 = y3Var.D;
            y3.k(w3Var6);
            w3Var6.h();
            Boolean bool = B.r;
            long A = B.A();
            w3 w3Var7 = y3Var.D;
            y3.k(w3Var7);
            w3Var7.h();
            return new m6(str, H, F, z11, str2, j10, j11, null, z12, false, G, 0L, 0, y10, false, B2, bool, A, B.f32722t, K(str).e(), "", null);
        }
        b().G.c(str, "No app data available; dropping");
        return null;
    }

    public final Boolean z(l4 l4Var) {
        try {
            long z10 = l4Var.z();
            y3 y3Var = this.F;
            if (z10 != -2147483648L) {
                if (l4Var.z() == ca.c.a(y3Var.f32953u).b(0, l4Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = ca.c.a(y3Var.f32953u).b(0, l4Var.D()).versionName;
                String F = l4Var.F();
                if (F != null && F.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
