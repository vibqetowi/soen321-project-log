package com.google.common.collect;

import com.google.common.collect.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import nc.f;
/* compiled from: MapMaker.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9472a;

    /* renamed from: b  reason: collision with root package name */
    public int f9473b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f9474c = -1;

    /* renamed from: d  reason: collision with root package name */
    public z.p f9475d;

    /* renamed from: e  reason: collision with root package name */
    public z.p f9476e;
    public nc.d<Object> f;

    public final z.p a() {
        return (z.p) nc.f.a(this.f9475d, z.p.f9511u);
    }

    public final <K, V> ConcurrentMap<K, V> b() {
        if (!this.f9472a) {
            int i6 = this.f9473b;
            if (i6 == -1) {
                i6 = 16;
            }
            int i10 = this.f9474c;
            if (i10 == -1) {
                i10 = 4;
            }
            return new ConcurrentHashMap(i6, 0.75f, i10);
        }
        z.a aVar = z.D;
        z.p a10 = a();
        z.p.a aVar2 = z.p.f9511u;
        if (a10 == aVar2 && ((z.p) nc.f.a(this.f9476e, aVar2)) == aVar2) {
            return new z(this, z.q.a.f9515a);
        }
        z.p a11 = a();
        z.p.b bVar = z.p.f9512v;
        if (a11 == aVar2 && ((z.p) nc.f.a(this.f9476e, aVar2)) == bVar) {
            return new z(this, z.s.a.f9517a);
        }
        if (a() == bVar && ((z.p) nc.f.a(this.f9476e, aVar2)) == aVar2) {
            return new z(this, z.w.a.f9520a);
        }
        if (a() == bVar && ((z.p) nc.f.a(this.f9476e, aVar2)) == bVar) {
            return new z(this, z.y.a.f9522a);
        }
        throw new AssertionError();
    }

    public final String toString() {
        f.a c10 = nc.f.c(this);
        int i6 = this.f9473b;
        if (i6 != -1) {
            c10.a(i6, "initialCapacity");
        }
        int i10 = this.f9474c;
        if (i10 != -1) {
            c10.a(i10, "concurrencyLevel");
        }
        z.p pVar = this.f9475d;
        if (pVar != null) {
            c10.c(sc.b.h0(pVar.toString()), "keyStrength");
        }
        z.p pVar2 = this.f9476e;
        if (pVar2 != null) {
            c10.c(sc.b.h0(pVar2.toString()), "valueStrength");
        }
        if (this.f != null) {
            f.a.b bVar = new f.a.b();
            c10.f25995c.f25999c = bVar;
            c10.f25995c = bVar;
            bVar.f25998b = "keyEquivalence";
        }
        return c10.toString();
    }
}
