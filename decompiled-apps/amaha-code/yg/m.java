package yg;

import android.content.Context;
import hh.g;
import java.util.Set;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f38597u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Context f38598v;

    public /* synthetic */ m(Context context, int i6) {
        this.f38597u = i6;
        this.f38598v = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38597u) {
            case 0:
                Context context = this.f38598v;
                kotlin.jvm.internal.i.g(context, "$context");
                try {
                    hh.a aVar = hh.g.f17610d;
                    g.a.b(0, w.f38620u, 3);
                    for (ih.p pVar : qg.g0.f29557b.values()) {
                        qg.w.f29578a.getClass();
                        qg.w.e(pVar).a(context);
                    }
                    return;
                } catch (Throwable th2) {
                    hh.a aVar2 = hh.g.f17610d;
                    g.a.a(1, th2, x.f38621u);
                    return;
                }
            case 1:
                Context context2 = this.f38598v;
                Set<fh.a> set = eh.o.f14029a;
                kotlin.jvm.internal.i.g(context2, "$context");
                Set<fh.a> listeners = eh.o.f14029a;
                kotlin.jvm.internal.i.f(listeners, "listeners");
                synchronized (listeners) {
                    try {
                        for (fh.a aVar3 : listeners) {
                            try {
                                aVar3.a(context2);
                            } catch (Exception e10) {
                                hh.a aVar4 = hh.g.f17610d;
                                g.a.a(1, e10, eh.p.f14043u);
                            }
                        }
                        hs.k kVar = hs.k.f19476a;
                    }
                }
                return;
            default:
                Context context3 = this.f38598v;
                kotlin.jvm.internal.i.g(context3, "$context");
                hh.a aVar5 = hh.g.f17610d;
                g.a.b(0, ji.q.f22062u, 3);
                ji.o.b(context3);
                return;
        }
    }
}
