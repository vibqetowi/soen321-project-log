package kotlinx.coroutines.internal;
/* compiled from: Scopes.kt */
/* loaded from: classes2.dex */
public class p<T> extends kotlinx.coroutines.a<T> implements ns.d {

    /* renamed from: w  reason: collision with root package name */
    public final ls.d<T> f23613w;

    public p(ls.d dVar, ls.f fVar) {
        super(fVar, true);
        this.f23613w = dVar;
    }

    @Override // kotlinx.coroutines.g1
    public final boolean V() {
        return true;
    }

    @Override // ns.d
    public final ns.d getCallerFrame() {
        ls.d<T> dVar = this.f23613w;
        if (dVar instanceof ns.d) {
            return (ns.d) dVar;
        }
        return null;
    }

    @Override // kotlinx.coroutines.a
    public void n0(Object obj) {
        this.f23613w.resumeWith(ca.a.e1(obj));
    }

    @Override // kotlinx.coroutines.g1
    public void u(Object obj) {
        sc.b.d0(ca.a.G0(this.f23613w), ca.a.e1(obj), null);
    }
}
