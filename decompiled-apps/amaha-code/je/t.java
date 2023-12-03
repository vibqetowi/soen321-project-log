package je;

import java.util.HashMap;
/* compiled from: MemoryPersistence.java */
/* loaded from: classes.dex */
public final class t extends androidx.work.k {

    /* renamed from: h  reason: collision with root package name */
    public b0 f21945h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21946i;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f21940b = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final r f21942d = new r();

    /* renamed from: e  reason: collision with root package name */
    public final v f21943e = new v(this);
    public final k4.s f = new k4.s(1);

    /* renamed from: g  reason: collision with root package name */
    public final u f21944g = new u();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f21941c = new HashMap();

    @Override // androidx.work.k
    public final void A(String str, Runnable runnable) {
        this.f21945h.c();
        try {
            runnable.run();
        } finally {
            this.f21945h.b();
        }
    }

    @Override // androidx.work.k
    public final void B() {
        ca.a.u0(!this.f21946i, "MemoryPersistence double-started!", new Object[0]);
        this.f21946i = true;
    }

    @Override // androidx.work.k
    public final a m() {
        return this.f;
    }

    @Override // androidx.work.k
    public final b n(ge.e eVar) {
        HashMap hashMap = this.f21941c;
        q qVar = (q) hashMap.get(eVar);
        if (qVar == null) {
            q qVar2 = new q();
            hashMap.put(eVar, qVar2);
            return qVar2;
        }
        return qVar;
    }

    @Override // androidx.work.k
    public final f o(ge.e eVar) {
        return this.f21942d;
    }

    @Override // androidx.work.k
    public final w p(ge.e eVar, f fVar) {
        HashMap hashMap = this.f21940b;
        s sVar = (s) hashMap.get(eVar);
        if (sVar == null) {
            s sVar2 = new s(this);
            hashMap.put(eVar, sVar2);
            return sVar2;
        }
        return sVar;
    }

    @Override // androidx.work.k
    public final x q() {
        return new tr.r();
    }

    @Override // androidx.work.k
    public final b0 r() {
        return this.f21945h;
    }

    @Override // androidx.work.k
    public final c0 s() {
        return this.f21944g;
    }

    @Override // androidx.work.k
    public final a1 t() {
        return this.f21943e;
    }

    @Override // androidx.work.k
    public final boolean u() {
        return this.f21946i;
    }

    @Override // androidx.work.k
    public final <T> T z(String str, oe.l<T> lVar) {
        this.f21945h.c();
        try {
            return lVar.get();
        } finally {
            this.f21945h.b();
        }
    }
}
