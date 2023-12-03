package jf;

import android.content.Context;
import android.content.pm.PackageManager;
import bf.f;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kf.g;
import lf.a;
import lf.c;
import ne.u;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f22003u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f22004v;

    public /* synthetic */ d(e eVar, int i6) {
        this.f22003u = i6;
        this.f22004v = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0103, code lost:
        if (r3 == null) goto L18;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e eVar;
        f fVar;
        String str;
        String str2;
        c.a X;
        a.C0380a S;
        String str3;
        switch (this.f22003u) {
            case 0:
                eVar = this.f22004v;
                sc.e eVar2 = eVar.f22008x;
                eVar2.b();
                Context context = eVar2.f31432a;
                eVar.D = context;
                eVar.I = context.getPackageName();
                eVar.E = bf.a.e();
                eVar.F = new c(eVar.D, new g(100L, 1L, TimeUnit.MINUTES));
                eVar.G = af.a.a();
                re.b<a7.g> bVar = eVar.A;
                bf.a aVar = eVar.E;
                aVar.getClass();
                f fVar2 = f.f4259v;
                synchronized (f.class) {
                    if (f.f4259v == null) {
                        f.f4259v = new f();
                    }
                    fVar = f.f4259v;
                }
                if (ze.a.f39365a.booleanValue()) {
                    fVar.getClass();
                    str = "FIREPERF";
                } else {
                    fVar.getClass();
                    long longValue = ((Long) aVar.f4252a.getRemoteConfigValueOrDefault("fpr_log_source", -1L)).longValue();
                    Map<Long, String> map = f.f4260w;
                    if (map.containsKey(Long.valueOf(longValue)) && (str2 = map.get(Long.valueOf(longValue))) != null) {
                        aVar.f4254c.e("com.google.firebase.perf.LogSourceName", str2);
                        str = str2;
                    } else {
                        kf.e<String> d10 = aVar.d(fVar);
                        if (d10.b()) {
                            str = d10.a();
                        } else {
                            str = "FIREPERF";
                        }
                    }
                }
                eVar.B = new a(bVar, str);
                eVar.G.d(new WeakReference<>(e.M));
                X = lf.c.X();
                eVar.H = X;
                sc.e eVar3 = eVar.f22008x;
                eVar3.b();
                String str4 = eVar3.f31434c.f31445b;
                X.u();
                lf.c.M((lf.c) X.f10073v, str4);
                S = lf.a.S();
                String str5 = eVar.I;
                S.u();
                lf.a.M((lf.a) S.f10073v, str5);
                S.u();
                lf.a.N((lf.a) S.f10073v);
                Context context2 = eVar.D;
                try {
                    str3 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    break;
                } catch (PackageManager.NameNotFoundException unused) {
                    break;
                }
                break;
            default:
                e eVar4 = this.f22004v;
                c cVar = eVar4.F;
                boolean z10 = eVar4.K;
                cVar.f21990d.a(z10);
                cVar.f21991e.a(z10);
                return;
        }
        str3 = "";
        S.u();
        lf.a.O((lf.a) S.f10073v, str3);
        X.u();
        lf.c.Q((lf.c) X.f10073v, S.r());
        eVar.f22007w.set(true);
        while (true) {
            ConcurrentLinkedQueue<b> concurrentLinkedQueue = eVar.f22006v;
            if (!concurrentLinkedQueue.isEmpty()) {
                b poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    eVar.C.execute(new u(eVar, 9, poll));
                }
            } else {
                return;
            }
        }
    }
}
