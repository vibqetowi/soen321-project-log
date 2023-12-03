package j7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import d7.s;
import gv.n;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import je.g0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f21704u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f21705v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f21706w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f21707x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f21708y;

    public /* synthetic */ e(hh.h hVar, int i6, String str, Throwable th2) {
        this.f21704u = 2;
        this.f21706w = hVar;
        this.f21705v = i6;
        this.f21707x = str;
        this.f21708y = th2;
    }

    private final void a() {
        hh.h this$0 = (hh.h) this.f21706w;
        int i6 = this.f21705v;
        String message = (String) this.f21707x;
        Throwable th2 = (Throwable) this.f21708y;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(message, "$message");
        synchronized (this$0.f17618e) {
            if (!n.B0(message)) {
                List<nh.a> list = this$0.f17616c;
                String str = hh.e.f17608b.get(Integer.valueOf(i6));
                if (str == null) {
                    str = "verbose";
                }
                list.add(new nh.a(str, sp.b.m(), new ih.e(message, ca.a.q0(th2), 2)));
                int i10 = this$0.f17617d + 1;
                this$0.f17617d = i10;
                if (i10 == 30) {
                    this$0.c();
                }
                hs.k kVar = hs.k.f19476a;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.f21704u) {
            case 0:
                j jVar = (j) this.f21706w;
                s sVar = (s) this.f21707x;
                int i6 = this.f21705v;
                Runnable runnable = (Runnable) this.f21708y;
                l7.a aVar = jVar.f;
                try {
                    try {
                        k7.d dVar = jVar.f21726c;
                        Objects.requireNonNull(dVar);
                        aVar.e(new f0.b(8, dVar));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) jVar.f21724a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            aVar.e(new f(jVar, sVar, i6, 0));
                        } else {
                            jVar.a(sVar, i6);
                        }
                    } catch (SynchronizationException unused) {
                        jVar.f21727d.a(sVar, i6 + 1);
                    }
                    return;
                } finally {
                    runnable.run();
                }
            case 1:
                int i10 = this.f21705v;
                Map map = (Map) this.f21708y;
                le.b g5 = ((g0) this.f21706w).g((byte[]) this.f21707x, i10);
                synchronized (map) {
                    map.put(g5.a(), g5);
                }
                return;
            default:
                a();
                return;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, int i6, Object obj3, int i10) {
        this.f21704u = i10;
        this.f21706w = obj;
        this.f21707x = obj2;
        this.f21705v = i6;
        this.f21708y = obj3;
    }
}
