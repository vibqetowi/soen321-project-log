package x1;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import x1.h;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f37556u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s f37557v;

    public /* synthetic */ q(s sVar, int i6) {
        this.f37556u = i6;
        this.f37557v = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Executor executor;
        AtomicBoolean atomicBoolean;
        boolean z11;
        int i6 = this.f37556u;
        s this$0 = this.f37557v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.f37565s.compareAndSet(false, true)) {
                    h hVar = this$0.f37559l.f37519e;
                    hVar.getClass();
                    r observer = this$0.f37563p;
                    kotlin.jvm.internal.i.g(observer, "observer");
                    hVar.a(new h.e(hVar, observer));
                }
                do {
                    AtomicBoolean atomicBoolean2 = this$0.r;
                    boolean compareAndSet = atomicBoolean2.compareAndSet(false, true);
                    atomicBoolean = this$0.f37564q;
                    if (compareAndSet) {
                        Object obj = null;
                        z11 = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                try {
                                    obj = this$0.f37562o.call();
                                    z11 = true;
                                } catch (Exception e10) {
                                    throw new RuntimeException("Exception while computing database live data.", e10);
                                }
                            } finally {
                                atomicBoolean2.set(false);
                            }
                        }
                        if (z11) {
                            this$0.i(obj);
                        }
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.f2358c > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this$0.f37564q.compareAndSet(false, true) && z10) {
                    boolean z12 = this$0.f37561n;
                    n nVar = this$0.f37559l;
                    if (z12) {
                        executor = nVar.f37517c;
                        if (executor == null) {
                            kotlin.jvm.internal.i.q("internalTransactionExecutor");
                            throw null;
                        }
                    } else {
                        executor = nVar.f37516b;
                        if (executor == null) {
                            kotlin.jvm.internal.i.q("internalQueryExecutor");
                            throw null;
                        }
                    }
                    executor.execute(this$0.f37566t);
                    return;
                }
                return;
        }
    }
}
