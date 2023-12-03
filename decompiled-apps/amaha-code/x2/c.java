package x2;

import x2.a;
/* compiled from: SettableFuture.java */
/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    public final boolean i(V v10) {
        if (v10 == null) {
            v10 = (V) a.A;
        }
        if (a.f37580z.b(this, null, v10)) {
            a.b(this);
            return true;
        }
        return false;
    }

    public final boolean j(Throwable th2) {
        th2.getClass();
        if (a.f37580z.b(this, null, new a.c(th2))) {
            a.b(this);
            return true;
        }
        return false;
    }

    public final boolean k(rc.b<? extends V> bVar) {
        a.c cVar;
        bVar.getClass();
        Object obj = this.f37581u;
        if (obj == null) {
            if (bVar.isDone()) {
                if (!a.f37580z.b(this, null, a.f(bVar))) {
                    return false;
                }
                a.b(this);
            } else {
                a.f fVar = new a.f(this, bVar);
                if (a.f37580z.b(this, null, fVar)) {
                    try {
                        bVar.d(fVar, b.f37604u);
                    } catch (Throwable th2) {
                        try {
                            cVar = new a.c(th2);
                        } catch (Throwable unused) {
                            cVar = a.c.f37588b;
                        }
                        a.f37580z.b(this, fVar, cVar);
                    }
                } else {
                    obj = this.f37581u;
                }
            }
            return true;
        }
        if (!(obj instanceof a.b)) {
            return false;
        }
        bVar.cancel(((a.b) obj).f37586a);
        return false;
    }
}
