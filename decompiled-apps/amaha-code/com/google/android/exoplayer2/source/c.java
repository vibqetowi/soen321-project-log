package com.google.android.exoplayer2.source;

import android.os.Handler;
import b9.u;
import c9.w;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import java.io.IOException;
import java.util.HashMap;
/* compiled from: CompositeMediaSource.java */
/* loaded from: classes.dex */
public abstract class c<T> extends com.google.android.exoplayer2.source.a {

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<T, b<T>> f6845g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public Handler f6846h;

    /* renamed from: i  reason: collision with root package name */
    public u f6847i;

    /* compiled from: CompositeMediaSource.java */
    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final i f6852a;

        /* renamed from: b  reason: collision with root package name */
        public final i.b f6853b;

        /* renamed from: c  reason: collision with root package name */
        public final c<T>.a f6854c;

        public b(i iVar, o8.a aVar, a aVar2) {
            this.f6852a = iVar;
            this.f6853b = aVar;
            this.f6854c = aVar2;
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public void j() {
        for (b<T> bVar : this.f6845g.values()) {
            bVar.f6852a.j();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public final void o() {
        for (b<T> bVar : this.f6845g.values()) {
            bVar.f6852a.f(bVar.f6853b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public final void p() {
        for (b<T> bVar : this.f6845g.values()) {
            bVar.f6852a.n(bVar.f6853b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void s() {
        HashMap<T, b<T>> hashMap = this.f6845g;
        for (b<T> bVar : hashMap.values()) {
            bVar.f6852a.b(bVar.f6853b);
            i iVar = bVar.f6852a;
            c<T>.a aVar = bVar.f6854c;
            iVar.e(aVar);
            iVar.i(aVar);
        }
        hashMap.clear();
    }

    public abstract void u(T t3, i iVar, e0 e0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.exoplayer2.source.i$b, o8.a] */
    public final void v(final T t3, i iVar) {
        HashMap<T, b<T>> hashMap = this.f6845g;
        sc.b.q(!hashMap.containsKey(t3));
        ?? r12 = new i.b() { // from class: o8.a
            @Override // com.google.android.exoplayer2.source.i.b
            public final void a(com.google.android.exoplayer2.source.i iVar2, e0 e0Var) {
                com.google.android.exoplayer2.source.c.this.u(t3, iVar2, e0Var);
            }
        };
        a aVar = new a(t3);
        hashMap.put(t3, new b<>(iVar, r12, aVar));
        Handler handler = this.f6846h;
        handler.getClass();
        iVar.d(handler, aVar);
        Handler handler2 = this.f6846h;
        handler2.getClass();
        iVar.h(handler2, aVar);
        iVar.c(r12, this.f6847i);
        if (!(!this.f6819b.isEmpty())) {
            iVar.f(r12);
        }
    }

    /* compiled from: CompositeMediaSource.java */
    /* loaded from: classes.dex */
    public final class a implements j, com.google.android.exoplayer2.drm.c {

        /* renamed from: u  reason: collision with root package name */
        public final T f6848u;

        /* renamed from: v  reason: collision with root package name */
        public j.a f6849v;

        /* renamed from: w  reason: collision with root package name */
        public c.a f6850w;

        public a(T t3) {
            this.f6849v = new j.a(c.this.f6820c.f6898c, 0, null);
            this.f6850w = new c.a(c.this.f6821d.f6440c, 0, null);
            this.f6848u = t3;
        }

        @Override // com.google.android.exoplayer2.source.j
        public final void I(int i6, i.a aVar, o8.d dVar, o8.e eVar) {
            if (a(i6, aVar)) {
                this.f6849v.f(dVar, b(eVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public final void J(int i6, i.a aVar, o8.d dVar, o8.e eVar) {
            if (a(i6, aVar)) {
                this.f6849v.j(dVar, b(eVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public final void K(int i6, i.a aVar, o8.d dVar, o8.e eVar) {
            if (a(i6, aVar)) {
                this.f6849v.d(dVar, b(eVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void O(int i6, i.a aVar) {
            if (a(i6, aVar)) {
                this.f6850w.b();
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void X(int i6, i.a aVar) {
            if (a(i6, aVar)) {
                this.f6850w.a();
            }
        }

        public final boolean a(int i6, i.a aVar) {
            i.a aVar2;
            c cVar = c.this;
            if (aVar != null) {
                aVar2 = cVar.t(this.f6848u, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            cVar.getClass();
            j.a aVar3 = this.f6849v;
            if (aVar3.f6896a != i6 || !w.a(aVar3.f6897b, aVar2)) {
                this.f6849v = new j.a(cVar.f6820c.f6898c, i6, aVar2);
            }
            c.a aVar4 = this.f6850w;
            if (aVar4.f6438a != i6 || !w.a(aVar4.f6439b, aVar2)) {
                this.f6850w = new c.a(cVar.f6821d.f6440c, i6, aVar2);
                return true;
            }
            return true;
        }

        public final o8.e b(o8.e eVar) {
            long j10 = eVar.f;
            c cVar = c.this;
            cVar.getClass();
            long j11 = eVar.f27271g;
            cVar.getClass();
            if (j10 == eVar.f && j11 == eVar.f27271g) {
                return eVar;
            }
            return new o8.e(eVar.f27266a, eVar.f27267b, eVar.f27268c, eVar.f27269d, eVar.f27270e, j10, j11);
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void g0(int i6, i.a aVar, int i10) {
            if (a(i6, aVar)) {
                this.f6850w.d(i10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void h0(int i6, i.a aVar) {
            if (a(i6, aVar)) {
                this.f6850w.f();
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void k0(int i6, i.a aVar) {
            if (a(i6, aVar)) {
                this.f6850w.c();
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public final void n(int i6, i.a aVar, o8.e eVar) {
            if (a(i6, aVar)) {
                this.f6849v.b(b(eVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public final void p(int i6, i.a aVar, o8.d dVar, o8.e eVar, IOException iOException, boolean z10) {
            if (a(i6, aVar)) {
                this.f6849v.h(dVar, b(eVar), iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void u(int i6, i.a aVar, Exception exc) {
            if (a(i6, aVar)) {
                this.f6850w.e(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final /* synthetic */ void k() {
        }
    }

    public i.a t(T t3, i.a aVar) {
        return aVar;
    }
}
