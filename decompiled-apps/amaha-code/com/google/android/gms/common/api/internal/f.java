package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import t.g;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class f implements Handler.Callback {
    public static final Status I = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status J = new Status(4, "The user must be signed in to make this API call.");
    public static final Object K = new Object();
    public static f L;
    public final v9.b0 A;
    public final AtomicInteger B;
    public final AtomicInteger C;
    public final ConcurrentHashMap D;
    public final t.d E;
    public final t.d F;
    public final ka.d G;
    public volatile boolean H;

    /* renamed from: u  reason: collision with root package name */
    public long f7367u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f7368v;

    /* renamed from: w  reason: collision with root package name */
    public v9.r f7369w;

    /* renamed from: x  reason: collision with root package name */
    public x9.c f7370x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f7371y;

    /* renamed from: z  reason: collision with root package name */
    public final s9.e f7372z;

    public f(Context context, Looper looper) {
        s9.e eVar = s9.e.f31337d;
        this.f7367u = 10000L;
        this.f7368v = false;
        boolean z10 = true;
        this.B = new AtomicInteger(1);
        this.C = new AtomicInteger(0);
        this.D = new ConcurrentHashMap(5, 0.75f, 1);
        this.E = new t.d();
        this.F = new t.d();
        this.H = true;
        this.f7371y = context;
        ka.d dVar = new ka.d(looper, this);
        this.G = dVar;
        this.f7372z = eVar;
        this.A = new v9.b0();
        PackageManager packageManager = context.getPackageManager();
        if (aa.d.f444d == null) {
            aa.d.f444d = Boolean.valueOf((aa.g.a() && packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : false);
        }
        if (aa.d.f444d.booleanValue()) {
            this.H = false;
        }
        dVar.sendMessage(dVar.obtainMessage(6));
    }

    public static Status c(a<?> aVar, s9.b bVar) {
        String str = aVar.f7332b.f7304b;
        String valueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(str);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(1, 17, sb2.toString(), bVar.f31324w, bVar);
    }

    public static f f(Context context) {
        f fVar;
        synchronized (K) {
            if (L == null) {
                Looper looper = v9.g.b().getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = s9.e.f31336c;
                L = new f(applicationContext, looper);
            }
            fVar = L;
        }
        return fVar;
    }

    public final boolean a() {
        if (this.f7368v) {
            return false;
        }
        v9.q qVar = v9.p.a().f34931a;
        if (qVar != null && !qVar.f34933v) {
            return false;
        }
        int i6 = this.A.f34847a.get(203400000, -1);
        if (i6 != -1 && i6 != 0) {
            return false;
        }
        return true;
    }

    public final boolean b(s9.b bVar, int i6) {
        boolean z10;
        PendingIntent pendingIntent;
        s9.e eVar = this.f7372z;
        eVar.getClass();
        Context context = this.f7371y;
        if (ca.a.K0(context)) {
            return false;
        }
        int i10 = bVar.f31323v;
        if (i10 != 0 && bVar.f31324w != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            pendingIntent = bVar.f31324w;
        } else {
            pendingIntent = null;
            Intent a10 = eVar.a(context, null, i10);
            if (a10 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a10, ma.b.f25011a | 134217728);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int i11 = GoogleApiActivity.f7292v;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i6);
        intent.putExtra("notify_manager", true);
        eVar.g(context, i10, PendingIntent.getActivity(context, 0, intent, ka.c.f23209a | 134217728));
        return true;
    }

    public final b0<?> d(com.google.android.gms.common.api.b<?> bVar) {
        a<?> aVar = bVar.f7310e;
        ConcurrentHashMap concurrentHashMap = this.D;
        b0<?> b0Var = (b0) concurrentHashMap.get(aVar);
        if (b0Var == null) {
            b0Var = new b0<>(this, bVar);
            concurrentHashMap.put(aVar, b0Var);
        }
        if (b0Var.f7344b.o()) {
            this.F.add(aVar);
        }
        b0Var.l();
        return b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void e(ya.i<T> iVar, int i6, com.google.android.gms.common.api.b bVar) {
        i0 i0Var;
        long j10;
        long j11;
        boolean z10;
        if (i6 != 0) {
            a<O> aVar = bVar.f7310e;
            if (a()) {
                v9.q qVar = v9.p.a().f34931a;
                boolean z11 = true;
                if (qVar != null) {
                    if (qVar.f34933v) {
                        b0 b0Var = (b0) this.D.get(aVar);
                        if (b0Var != null) {
                            a.e eVar = b0Var.f7344b;
                            if (eVar instanceof v9.b) {
                                v9.b bVar2 = (v9.b) eVar;
                                if (bVar2.Q != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && !bVar2.d()) {
                                    v9.d b10 = i0.b(b0Var, bVar2, i6);
                                    if (b10 != null) {
                                        b0Var.f7353l++;
                                        z11 = b10.f34873w;
                                    }
                                }
                            }
                        }
                        z11 = qVar.f34934w;
                    }
                }
                if (z11) {
                    j10 = System.currentTimeMillis();
                } else {
                    j10 = 0;
                }
                if (z11) {
                    j11 = SystemClock.elapsedRealtime();
                } else {
                    j11 = 0;
                }
                i0Var = new i0(this, i6, aVar, j10, j11);
                if (i0Var == null) {
                    ya.v vVar = iVar.f38392a;
                    final ka.d dVar = this.G;
                    dVar.getClass();
                    vVar.addOnCompleteListener(new Executor(dVar) { // from class: com.google.android.gms.common.api.internal.x

                        /* renamed from: u  reason: collision with root package name */
                        public final Handler f7443u;

                        {
                            this.f7443u = dVar;
                        }

                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            this.f7443u.post(runnable);
                        }
                    }, i0Var);
                    return;
                }
                return;
            }
            i0Var = null;
            if (i0Var == null) {
            }
        }
    }

    public final void g(s9.b bVar, int i6) {
        if (!b(bVar, i6)) {
            ka.d dVar = this.G;
            dVar.sendMessage(dVar.obtainMessage(5, i6, 0, bVar));
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        s9.d[] g5;
        boolean z10;
        int i6 = message.what;
        ka.d dVar = this.G;
        ConcurrentHashMap concurrentHashMap = this.D;
        Context context = this.f7371y;
        long j10 = 300000;
        b0 b0Var = null;
        switch (i6) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f7367u = j10;
                dVar.removeMessages(12);
                for (a aVar : concurrentHashMap.keySet()) {
                    dVar.sendMessageDelayed(dVar.obtainMessage(12, aVar), this.f7367u);
                }
                break;
            case 2:
                ((z0) message.obj).getClass();
                throw null;
            case 3:
                for (b0 b0Var2 : concurrentHashMap.values()) {
                    v9.o.c(b0Var2.f7354m.G);
                    b0Var2.f7352k = null;
                    b0Var2.l();
                }
                break;
            case 4:
            case 8:
            case 13:
                k0 k0Var = (k0) message.obj;
                b0<?> b0Var3 = (b0) concurrentHashMap.get(k0Var.f7400c.f7310e);
                if (b0Var3 == null) {
                    b0Var3 = d(k0Var.f7400c);
                }
                boolean o10 = b0Var3.f7344b.o();
                y0 y0Var = k0Var.f7398a;
                if (o10 && this.C.get() != k0Var.f7399b) {
                    y0Var.a(I);
                    b0Var3.o();
                    break;
                } else {
                    b0Var3.m(y0Var);
                    break;
                }
            case 5:
                int i10 = message.arg1;
                s9.b bVar = (s9.b) message.obj;
                Iterator it = concurrentHashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        b0 b0Var4 = (b0) it.next();
                        if (b0Var4.f7348g == i10) {
                            b0Var = b0Var4;
                        }
                    }
                }
                if (b0Var != null) {
                    if (bVar.f31323v == 13) {
                        this.f7372z.getClass();
                        AtomicBoolean atomicBoolean = s9.h.f31341a;
                        String f02 = s9.b.f0(bVar.f31323v);
                        int length = String.valueOf(f02).length();
                        String str = bVar.f31325x;
                        StringBuilder sb2 = new StringBuilder(length + 69 + String.valueOf(str).length());
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(f02);
                        sb2.append(": ");
                        sb2.append(str);
                        b0Var.c(new Status(17, sb2.toString()));
                        break;
                    } else {
                        b0Var.c(c(b0Var.f7345c, bVar));
                        break;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i10);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                    break;
                }
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    b.b((Application) context.getApplicationContext());
                    b bVar2 = b.f7338y;
                    bVar2.a(new y(this));
                    AtomicBoolean atomicBoolean2 = bVar2.f7340v;
                    boolean z11 = atomicBoolean2.get();
                    AtomicBoolean atomicBoolean3 = bVar2.f7339u;
                    if (!z11) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean3.set(true);
                        }
                    }
                    if (!atomicBoolean3.get()) {
                        this.f7367u = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                d((com.google.android.gms.common.api.b) message.obj);
                break;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    b0 b0Var5 = (b0) concurrentHashMap.get(message.obj);
                    v9.o.c(b0Var5.f7354m.G);
                    if (b0Var5.f7350i) {
                        b0Var5.l();
                        break;
                    }
                }
                break;
            case 10:
                t.d dVar2 = this.F;
                Iterator it2 = dVar2.iterator();
                while (true) {
                    g.a aVar2 = (g.a) it2;
                    if (aVar2.hasNext()) {
                        b0 b0Var6 = (b0) concurrentHashMap.remove((a) aVar2.next());
                        if (b0Var6 != null) {
                            b0Var6.o();
                        }
                    } else {
                        dVar2.clear();
                        break;
                    }
                }
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    b0 b0Var7 = (b0) concurrentHashMap.get(message.obj);
                    f fVar = b0Var7.f7354m;
                    v9.o.c(fVar.G);
                    boolean z12 = b0Var7.f7350i;
                    if (z12) {
                        if (z12) {
                            f fVar2 = b0Var7.f7354m;
                            ka.d dVar3 = fVar2.G;
                            Object obj = b0Var7.f7345c;
                            dVar3.removeMessages(11, obj);
                            fVar2.G.removeMessages(9, obj);
                            b0Var7.f7350i = false;
                        }
                        if (fVar.f7372z.c(fVar.f7371y) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        b0Var7.c(status);
                        b0Var7.f7344b.b("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((b0) concurrentHashMap.get(message.obj)).k(true);
                    break;
                }
                break;
            case 14:
                ((v) message.obj).getClass();
                if (!concurrentHashMap.containsKey(null)) {
                    throw null;
                }
                ((b0) concurrentHashMap.get(null)).k(false);
                throw null;
            case 15:
                c0 c0Var = (c0) message.obj;
                if (concurrentHashMap.containsKey(c0Var.f7356a)) {
                    b0 b0Var8 = (b0) concurrentHashMap.get(c0Var.f7356a);
                    if (b0Var8.f7351j.contains(c0Var) && !b0Var8.f7350i) {
                        if (!b0Var8.f7344b.j()) {
                            b0Var8.l();
                            break;
                        } else {
                            b0Var8.e();
                            break;
                        }
                    }
                }
                break;
            case 16:
                c0 c0Var2 = (c0) message.obj;
                if (concurrentHashMap.containsKey(c0Var2.f7356a)) {
                    b0<?> b0Var9 = (b0) concurrentHashMap.get(c0Var2.f7356a);
                    if (b0Var9.f7351j.remove(c0Var2)) {
                        f fVar3 = b0Var9.f7354m;
                        fVar3.G.removeMessages(15, c0Var2);
                        fVar3.G.removeMessages(16, c0Var2);
                        LinkedList linkedList = b0Var9.f7343a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it3 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it3.hasNext();
                            s9.d dVar4 = c0Var2.f7357b;
                            if (hasNext) {
                                y0 y0Var2 = (y0) it3.next();
                                if ((y0Var2 instanceof h0) && (g5 = ((h0) y0Var2).g(b0Var9)) != null) {
                                    int length2 = g5.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            if (v9.m.a(g5[i11], dVar4)) {
                                                if (i11 >= 0) {
                                                    z10 = true;
                                                }
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                    z10 = false;
                                    if (z10) {
                                        arrayList.add(y0Var2);
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    y0 y0Var3 = (y0) arrayList.get(i12);
                                    linkedList.remove(y0Var3);
                                    y0Var3.b(new UnsupportedApiCallException(dVar4));
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 17:
                v9.r rVar = this.f7369w;
                if (rVar != null) {
                    if (rVar.f34938u > 0 || a()) {
                        if (this.f7370x == null) {
                            this.f7370x = new x9.c(context);
                        }
                        this.f7370x.c(rVar);
                    }
                    this.f7369w = null;
                    break;
                }
                break;
            case 18:
                j0 j0Var = (j0) message.obj;
                long j11 = j0Var.f7396c;
                v9.l lVar = j0Var.f7394a;
                int i13 = j0Var.f7395b;
                if (j11 == 0) {
                    v9.r rVar2 = new v9.r(i13, Arrays.asList(lVar));
                    if (this.f7370x == null) {
                        this.f7370x = new x9.c(context);
                    }
                    this.f7370x.c(rVar2);
                    break;
                } else {
                    v9.r rVar3 = this.f7369w;
                    if (rVar3 != null) {
                        List<v9.l> list = rVar3.f34939v;
                        if (rVar3.f34938u == i13 && (list == null || list.size() < j0Var.f7397d)) {
                            v9.r rVar4 = this.f7369w;
                            if (rVar4.f34939v == null) {
                                rVar4.f34939v = new ArrayList();
                            }
                            rVar4.f34939v.add(lVar);
                        } else {
                            dVar.removeMessages(17);
                            v9.r rVar5 = this.f7369w;
                            if (rVar5 != null) {
                                if (rVar5.f34938u > 0 || a()) {
                                    if (this.f7370x == null) {
                                        this.f7370x = new x9.c(context);
                                    }
                                    this.f7370x.c(rVar5);
                                }
                                this.f7369w = null;
                            }
                        }
                    }
                    if (this.f7369w == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(lVar);
                        this.f7369w = new v9.r(i13, arrayList2);
                        dVar.sendMessageDelayed(dVar.obtainMessage(17), j0Var.f7396c);
                        break;
                    }
                }
                break;
            case 19:
                this.f7368v = false;
                break;
            default:
                defpackage.d.k(31, "Unknown message id: ", i6, "GoogleApiManager");
                return false;
        }
        return true;
    }
}
