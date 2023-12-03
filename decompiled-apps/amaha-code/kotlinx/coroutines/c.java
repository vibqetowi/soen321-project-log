package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: Await.kt */
/* loaded from: classes2.dex */
public final class c<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23489b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount");

    /* renamed from: a  reason: collision with root package name */
    public final h0<T>[] f23490a;
    volatile /* synthetic */ int notCompletedCount;

    /* compiled from: Await.kt */
    /* loaded from: classes2.dex */
    public final class a extends f1 {
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: y  reason: collision with root package name */
        public final j<List<? extends T>> f23491y;

        /* renamed from: z  reason: collision with root package name */
        public p0 f23492z;

        public a(k kVar) {
            this.f23491y = kVar;
        }

        @Override // kotlinx.coroutines.w
        public final void B(Throwable th2) {
            if (th2 != null) {
                if (this.f23491y.t(th2) != null) {
                    this.f23491y.i();
                    b bVar = (b) this._disposer;
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (c.f23489b.decrementAndGet(c.this) == 0) {
                j<List<? extends T>> jVar = this.f23491y;
                h0<T>[] h0VarArr = c.this.f23490a;
                ArrayList arrayList = new ArrayList(h0VarArr.length);
                for (h0<T> h0Var : h0VarArr) {
                    arrayList.add(h0Var.m());
                }
                jVar.resumeWith(arrayList);
            }
        }

        public final void D(c<T>.b bVar) {
            this._disposer = bVar;
        }

        @Override // ss.l
        public final /* bridge */ /* synthetic */ hs.k invoke(Throwable th2) {
            B(th2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: Await.kt */
    /* loaded from: classes2.dex */
    public final class b extends h {

        /* renamed from: u  reason: collision with root package name */
        public final c<T>.a[] f23493u;

        public b(a[] aVarArr) {
            this.f23493u = aVarArr;
        }

        @Override // kotlinx.coroutines.i
        public final void a(Throwable th2) {
            b();
        }

        public final void b() {
            for (c<T>.a aVar : this.f23493u) {
                p0 p0Var = aVar.f23492z;
                if (p0Var != null) {
                    p0Var.i();
                } else {
                    kotlin.jvm.internal.i.q("handle");
                    throw null;
                }
            }
        }

        @Override // ss.l
        public final hs.k invoke(Throwable th2) {
            b();
            return hs.k.f19476a;
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.f23493u + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(h0<? extends T>[] h0VarArr) {
        this.f23490a = h0VarArr;
        this.notCompletedCount = h0VarArr.length;
    }

    public final Object a(ls.d<? super List<? extends T>> dVar) {
        k kVar = new k(1, ca.a.G0(dVar));
        kVar.u();
        c1[] c1VarArr = this.f23490a;
        int length = c1VarArr.length;
        a[] aVarArr = new a[length];
        for (int i6 = 0; i6 < length; i6++) {
            c1 c1Var = c1VarArr[i6];
            c1Var.start();
            a aVar = new a(kVar);
            aVar.f23492z = c1Var.k0(aVar);
            hs.k kVar2 = hs.k.f19476a;
            aVarArr[i6] = aVar;
        }
        c<T>.b bVar = new b(aVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10].D(bVar);
        }
        if (kVar.y()) {
            bVar.b();
        } else {
            kVar.p(bVar);
        }
        return kVar.s();
    }
}
