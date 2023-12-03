package xa;

import aa.i;
import aa.k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import c4.u;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.b0;
import v9.o;
/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: n  reason: collision with root package name */
    public static final long f37694n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o  reason: collision with root package name */
    public static volatile ScheduledExecutorService f37695o = null;

    /* renamed from: p  reason: collision with root package name */
    public static final Object f37696p = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f37697a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f37698b;

    /* renamed from: c  reason: collision with root package name */
    public int f37699c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f37700d;

    /* renamed from: e  reason: collision with root package name */
    public long f37701e;
    public final HashSet f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f37702g;

    /* renamed from: h  reason: collision with root package name */
    public pa.a f37703h;

    /* renamed from: i  reason: collision with root package name */
    public final b0 f37704i;

    /* renamed from: j  reason: collision with root package name */
    public final String f37705j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f37706k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f37707l;

    /* renamed from: m  reason: collision with root package name */
    public final ScheduledExecutorService f37708m;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context) {
        boolean z10;
        ScheduledExecutorService scheduledExecutorService;
        String str;
        String packageName = context.getPackageName();
        this.f37697a = new Object();
        this.f37699c = 0;
        this.f = new HashSet();
        this.f37702g = true;
        this.f37704i = b0.f23449u;
        this.f37706k = new HashMap();
        this.f37707l = new AtomicInteger(0);
        o.f("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f37703h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f37705j = str;
        } else {
            this.f37705j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f37698b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            Method method = k.f447a;
            if (context.getPackageManager() != null) {
                if (ca.c.a(context).f5222a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
                    z10 = true;
                    if (z10) {
                        packageName = i.b(packageName) ? context.getPackageName() : packageName;
                        if (context.getPackageManager() != null && packageName != null) {
                            try {
                                ApplicationInfo a10 = ca.c.a(context).a(0, packageName);
                                if (a10 == null) {
                                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                                } else {
                                    int i6 = a10.uid;
                                    workSource = new WorkSource();
                                    Method method2 = k.f448b;
                                    if (method2 != null) {
                                        try {
                                            method2.invoke(workSource, Integer.valueOf(i6), packageName);
                                        } catch (Exception e10) {
                                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                        }
                                    } else {
                                        Method method3 = k.f447a;
                                        if (method3 != null) {
                                            try {
                                                method3.invoke(workSource, Integer.valueOf(i6));
                                            } catch (Exception e11) {
                                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                                            }
                                        }
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                                Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                            }
                        }
                        if (workSource != null) {
                            try {
                                this.f37698b.setWorkSource(workSource);
                            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e12) {
                                Log.wtf("WakeLock", e12.toString());
                            }
                        }
                    }
                    scheduledExecutorService = f37695o;
                    if (scheduledExecutorService == null) {
                        synchronized (f37696p) {
                            scheduledExecutorService = f37695o;
                            if (scheduledExecutorService == null) {
                                scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                                f37695o = scheduledExecutorService;
                            }
                        }
                    }
                    this.f37708m = scheduledExecutorService;
                    return;
                }
            }
            z10 = false;
            if (z10) {
            }
            scheduledExecutorService = f37695o;
            if (scheduledExecutorService == null) {
            }
            this.f37708m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb2.toString());
    }

    public final void a(long j10) {
        this.f37707l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f37694n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f37697a) {
            try {
                if (!b()) {
                    this.f37703h = pa.a.f28081u;
                    this.f37698b.acquire();
                    this.f37704i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f37699c++;
                if (this.f37702g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f37706k.get(null);
                if (bVar == null) {
                    bVar = new b(0);
                    this.f37706k.put(null, bVar);
                }
                bVar.f37709a++;
                this.f37704i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.f37701e) {
                    this.f37701e = j11;
                    ScheduledFuture scheduledFuture = this.f37700d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f37700d = this.f37708m.schedule(new u(15, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f37697a) {
            if (this.f37699c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f37707l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f37705j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f37697a) {
            try {
                if (this.f37702g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f37706k.containsKey(null)) {
                    b bVar = (b) this.f37706k.get(null);
                    if (bVar != null) {
                        int i6 = bVar.f37709a - 1;
                        bVar.f37709a = i6;
                        if (i6 == 0) {
                            this.f37706k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f37705j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        c cVar = (c) arrayList.get(0);
        throw null;
    }

    public final void e() {
        synchronized (this.f37697a) {
            if (!b()) {
                return;
            }
            if (this.f37702g) {
                int i6 = this.f37699c - 1;
                this.f37699c = i6;
                if (i6 > 0) {
                    return;
                }
            } else {
                this.f37699c = 0;
            }
            d();
            for (b bVar : this.f37706k.values()) {
                bVar.f37709a = 0;
            }
            this.f37706k.clear();
            ScheduledFuture scheduledFuture = this.f37700d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f37700d = null;
                this.f37701e = 0L;
            }
            if (this.f37698b.isHeld()) {
                try {
                    this.f37698b.release();
                    if (this.f37703h != null) {
                        this.f37703h = null;
                    }
                } catch (RuntimeException e10) {
                    if (e10.getClass().equals(RuntimeException.class)) {
                        Log.e("WakeLock", String.valueOf(this.f37705j).concat(" failed to release!"), e10);
                        if (this.f37703h != null) {
                            this.f37703h = null;
                        }
                    } else {
                        throw e10;
                    }
                }
            } else {
                Log.e("WakeLock", String.valueOf(this.f37705j).concat(" should be held!"));
            }
        }
    }
}
