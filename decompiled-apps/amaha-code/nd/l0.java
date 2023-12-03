package nd;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import pd.l;
import pd.m;
import td.b;
/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f26083a;

    /* renamed from: b  reason: collision with root package name */
    public final sd.a f26084b;

    /* renamed from: c  reason: collision with root package name */
    public final td.a f26085c;

    /* renamed from: d  reason: collision with root package name */
    public final od.c f26086d;

    /* renamed from: e  reason: collision with root package name */
    public final od.h f26087e;

    public l0(a0 a0Var, sd.a aVar, td.a aVar2, od.c cVar, od.h hVar) {
        this.f26083a = a0Var;
        this.f26084b = aVar;
        this.f26085c = aVar2;
        this.f26086d = cVar;
        this.f26087e = hVar;
    }

    public static pd.l a(pd.l lVar, od.c cVar, od.h hVar) {
        Map unmodifiableMap;
        l.a aVar = new l.a(lVar);
        String b10 = cVar.f27354b.b();
        if (b10 != null) {
            aVar.f28309e = new pd.u(b10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        od.b reference = hVar.f27378d.f27380a.getReference();
        synchronized (reference) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f27349a));
        }
        ArrayList c10 = c(unmodifiableMap);
        ArrayList c11 = c(hVar.f27379e.a());
        if (!c10.isEmpty() || !c11.isEmpty()) {
            m.a f = lVar.f28302c.f();
            f.f28316b = new pd.c0<>(c10);
            f.f28317c = new pd.c0<>(c11);
            aVar.f28307c = f.a();
        }
        return aVar.a();
    }

    public static l0 b(Context context, h0 h0Var, sd.b bVar, a aVar, od.c cVar, od.h hVar, a9.a aVar2, ud.d dVar, z zVar) {
        a0 a0Var = new a0(context, h0Var, aVar, aVar2, dVar);
        sd.a aVar3 = new sd.a(bVar, dVar);
        qd.a aVar4 = td.a.f32991b;
        d7.w.b(context);
        return new l0(a0Var, aVar3, new td.a(new td.b(d7.w.a().c(new b7.a(td.a.f32992c, td.a.f32993d)).a("FIREBASE_CRASHLYTICS_REPORT", new a7.b("json"), td.a.f32994e), dVar.b(), zVar)), cVar, hVar);
    }

    public static ArrayList c(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new pd.e(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new p0.d(16));
        return arrayList;
    }

    public final void d(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        String str3;
        boolean z11;
        boolean equals = str2.equals("crash");
        a0 a0Var = this.f26083a;
        Context context = a0Var.f26024a;
        int i6 = context.getResources().getConfiguration().orientation;
        vd.b bVar = a0Var.f26027d;
        v.c cVar = new v.c(th2, bVar);
        l.a aVar = new l.a();
        aVar.f28306b = str2;
        aVar.f28305a = Long.valueOf(j10);
        String str4 = a0Var.f26026c.f26020e;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(Constants.SCREEN_ACTIVITY)).getRunningAppProcesses();
        Boolean bool = null;
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str4)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        }
        Boolean bool2 = bool;
        Integer valueOf = Integer.valueOf(i6);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a0.e(thread, (StackTraceElement[]) cVar.f34633x, 4));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(a0.e(key, bVar.a(entry.getValue()), 0));
                }
            }
        }
        pd.c0 c0Var = new pd.c0(arrayList);
        pd.p c10 = a0.c(cVar, 0);
        Long l2 = 0L;
        String str5 = "";
        if (l2 != null) {
            str3 = "";
        } else {
            str3 = " address";
        }
        if (str3.isEmpty()) {
            pd.n nVar = new pd.n(c0Var, c10, null, new pd.q("0", "0", l2.longValue()), a0Var.a());
            if (valueOf == null) {
                str5 = "".concat(" uiOrientation");
            }
            if (str5.isEmpty()) {
                aVar.f28307c = new pd.m(nVar, null, null, bool2, valueOf.intValue());
                aVar.f28308d = a0Var.b(i6);
                this.f26084b.c(a(aVar.a(), this.f26086d, this.f26087e), str, equals);
                return;
            }
            throw new IllegalStateException("Missing required properties:".concat(str5));
        }
        throw new IllegalStateException("Missing required properties:".concat(str3));
    }

    public final ya.v e(String str, Executor executor) {
        boolean z10;
        ya.i<b0> iVar;
        ArrayList b10 = this.f26084b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                qd.a aVar = sd.a.f;
                String d10 = sd.a.d(file);
                aVar.getClass();
                arrayList.add(new b(qd.a.g(d10), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b0 b0Var = (b0) it2.next();
            if (str == null || str.equals(b0Var.c())) {
                td.a aVar2 = this.f26085c;
                boolean z11 = false;
                if (str != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                td.b bVar = aVar2.f32995a;
                synchronized (bVar.f33000e) {
                    iVar = new ya.i<>();
                    if (z10) {
                        ((AtomicInteger) bVar.f33002h.f26148b).getAndIncrement();
                        if (bVar.f33000e.size() < bVar.f32999d) {
                            z11 = true;
                        }
                        if (z11) {
                            com.google.android.gms.internal.cast.w wVar = com.google.android.gms.internal.cast.w.A;
                            wVar.e("Enqueueing report: " + b0Var.c());
                            wVar.e("Queue size: " + bVar.f33000e.size());
                            bVar.f.execute(new b.a(b0Var, iVar));
                            wVar.e("Closing task for report: " + b0Var.c());
                            iVar.d(b0Var);
                        } else {
                            bVar.a();
                            String str2 = "Dropping report due to queue being full: " + b0Var.c();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            ((AtomicInteger) bVar.f33002h.f26149c).getAndIncrement();
                            iVar.d(b0Var);
                        }
                    } else {
                        bVar.b(b0Var, iVar);
                    }
                }
                arrayList2.add(iVar.f38392a.continueWith(executor, new f0.b(26, this)));
            }
        }
        return ya.k.f(arrayList2);
    }
}
