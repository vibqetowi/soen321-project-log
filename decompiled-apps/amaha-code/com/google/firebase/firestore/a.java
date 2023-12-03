package com.google.firebase.firestore;

import fe.e;
import fe.f;
import fe.h;
import he.j;
import he.m;
import he.n;
import he.t;
import he.y;
import he.z;
import java.util.Collections;
import java.util.concurrent.Executor;
import ke.i;
import ke.p;
import le.l;
import oe.g;
import s1.s;
import ya.v;
/* compiled from: DocumentReference.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final i f9625a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseFirestore f9626b;

    public a(i iVar, FirebaseFirestore firebaseFirestore) {
        iVar.getClass();
        this.f9625a = iVar;
        this.f9626b = firebaseFirestore;
    }

    public final t a(Executor executor, j.a aVar, h hVar) {
        he.d dVar = new he.d(executor, new f(this, hVar, 0));
        y a10 = y.a(this.f9625a.f23275u);
        n nVar = this.f9626b.f9617i;
        synchronized (nVar.f17552d.f27381a) {
        }
        z zVar = new z(a10, aVar, dVar);
        nVar.f17552d.b(new m(nVar, zVar, 0));
        return new t(this.f9626b.f9617i, zVar, dVar);
    }

    public final fe.c b(String str) {
        return new fe.c(this.f9625a.f23275u.f(p.u(str)), this.f9626b);
    }

    public final ya.h<Void> c() {
        return this.f9626b.f9617i.b(Collections.singletonList(new le.c(this.f9625a, l.f24227c))).continueWith(g.f27421b, oe.n.f27433b);
    }

    public final v d() {
        ya.i iVar = new ya.i();
        ya.i iVar2 = new ya.i();
        j.a aVar = new j.a();
        aVar.f17532a = true;
        aVar.f17533b = true;
        aVar.f17534c = true;
        iVar2.b(a(g.f27421b, aVar, new e(iVar, iVar2, 0)));
        return iVar.f38392a;
    }

    public final ya.h<Void> e(Object obj) {
        return f(obj, fe.t.f15011c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f9625a.equals(aVar.f9625a) && this.f9626b.equals(aVar.f9626b)) {
            return true;
        }
        return false;
    }

    public final ya.h<Void> f(Object obj, fe.t tVar) {
        s f;
        if (obj != null) {
            if (tVar != null) {
                if (tVar.f15013a) {
                    f = this.f9626b.f9615g.d(obj, tVar.f15014b);
                } else {
                    f = this.f9626b.f9615g.f(obj);
                }
                return this.f9626b.f9617i.b(Collections.singletonList(f.L(this.f9625a, l.f24227c))).continueWith(g.f27421b, oe.n.f27433b);
            }
            throw new NullPointerException("Provided options must not be null.");
        }
        throw new NullPointerException("Provided data must not be null.");
    }

    public final int hashCode() {
        return this.f9626b.hashCode() + (this.f9625a.hashCode() * 31);
    }
}
