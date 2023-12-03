package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import o8.l;
/* compiled from: MediaSourceList.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d  reason: collision with root package name */
    public final d f7028d;

    /* renamed from: e  reason: collision with root package name */
    public final j.a f7029e;
    public final c.a f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<c, b> f7030g;

    /* renamed from: h  reason: collision with root package name */
    public final HashSet f7031h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7033j;

    /* renamed from: k  reason: collision with root package name */
    public b9.u f7034k;

    /* renamed from: i  reason: collision with root package name */
    public o8.l f7032i = new l.a();

    /* renamed from: b  reason: collision with root package name */
    public final IdentityHashMap<com.google.android.exoplayer2.source.h, c> f7026b = new IdentityHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7027c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7025a = new ArrayList();

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.exoplayer2.source.i f7039a;

        /* renamed from: b  reason: collision with root package name */
        public final i.b f7040b;

        /* renamed from: c  reason: collision with root package name */
        public final a f7041c;

        public b(com.google.android.exoplayer2.source.g gVar, o7.r rVar, a aVar) {
            this.f7039a = gVar;
            this.f7040b = rVar;
            this.f7041c = aVar;
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public static final class c implements o7.q {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.exoplayer2.source.g f7042a;

        /* renamed from: d  reason: collision with root package name */
        public int f7045d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f7046e;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f7044c = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f7043b = new Object();

        public c(com.google.android.exoplayer2.source.i iVar, boolean z10) {
            this.f7042a = new com.google.android.exoplayer2.source.g(iVar, z10);
        }

        @Override // o7.q
        public final Object a() {
            return this.f7043b;
        }

        @Override // o7.q
        public final e0 b() {
            return this.f7042a.f6888n;
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    public t(d dVar, p7.n nVar, Handler handler) {
        this.f7028d = dVar;
        j.a aVar = new j.a();
        this.f7029e = aVar;
        c.a aVar2 = new c.a();
        this.f = aVar2;
        this.f7030g = new HashMap<>();
        this.f7031h = new HashSet();
        if (nVar != null) {
            aVar.f6898c.add(new j.a.C0139a(handler, nVar));
            aVar2.f6440c.add(new c.a.C0135a(handler, nVar));
        }
    }

    public final e0 a(int i6, List<c> list, o8.l lVar) {
        if (!list.isEmpty()) {
            this.f7032i = lVar;
            for (int i10 = i6; i10 < list.size() + i6; i10++) {
                c cVar = list.get(i10 - i6);
                ArrayList arrayList = this.f7025a;
                if (i10 > 0) {
                    c cVar2 = (c) arrayList.get(i10 - 1);
                    cVar.f7045d = cVar2.f7042a.f6888n.p() + cVar2.f7045d;
                    cVar.f7046e = false;
                    cVar.f7044c.clear();
                } else {
                    cVar.f7045d = 0;
                    cVar.f7046e = false;
                    cVar.f7044c.clear();
                }
                int p10 = cVar.f7042a.f6888n.p();
                for (int i11 = i10; i11 < arrayList.size(); i11++) {
                    ((c) arrayList.get(i11)).f7045d += p10;
                }
                arrayList.add(i10, cVar);
                this.f7027c.put(cVar.f7043b, cVar);
                if (this.f7033j) {
                    e(cVar);
                    if (this.f7026b.isEmpty()) {
                        this.f7031h.add(cVar);
                    } else {
                        b bVar = this.f7030g.get(cVar);
                        if (bVar != null) {
                            bVar.f7039a.f(bVar.f7040b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final e0 b() {
        ArrayList arrayList = this.f7025a;
        if (arrayList.isEmpty()) {
            return e0.f6464u;
        }
        int i6 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            cVar.f7045d = i6;
            i6 += cVar.f7042a.f6888n.p();
        }
        return new o7.t(arrayList, this.f7032i);
    }

    public final void c() {
        Iterator it = this.f7031h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f7044c.isEmpty()) {
                b bVar = this.f7030g.get(cVar);
                if (bVar != null) {
                    bVar.f7039a.f(bVar.f7040b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.f7046e && cVar.f7044c.isEmpty()) {
            b remove = this.f7030g.remove(cVar);
            remove.getClass();
            i.b bVar = remove.f7040b;
            com.google.android.exoplayer2.source.i iVar = remove.f7039a;
            iVar.b(bVar);
            a aVar = remove.f7041c;
            iVar.e(aVar);
            iVar.i(aVar);
            this.f7031h.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.source.i$b, o7.r] */
    public final void e(c cVar) {
        com.google.android.exoplayer2.source.g gVar = cVar.f7042a;
        ?? r12 = new i.b() { // from class: o7.r
            @Override // com.google.android.exoplayer2.source.i.b
            public final void a(com.google.android.exoplayer2.source.i iVar, e0 e0Var) {
                ((com.google.android.exoplayer2.m) com.google.android.exoplayer2.t.this.f7028d).B.j(22);
            }
        };
        a aVar = new a(cVar);
        this.f7030g.put(cVar, new b(gVar, r12, aVar));
        int i6 = c9.w.f5205a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        gVar.d(new Handler(myLooper, null), aVar);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        gVar.h(new Handler(myLooper2, null), aVar);
        gVar.c(r12, this.f7034k);
    }

    public final void f(com.google.android.exoplayer2.source.h hVar) {
        IdentityHashMap<com.google.android.exoplayer2.source.h, c> identityHashMap = this.f7026b;
        c remove = identityHashMap.remove(hVar);
        remove.getClass();
        remove.f7042a.l(hVar);
        remove.f7044c.remove(((com.google.android.exoplayer2.source.f) hVar).f6878u);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(remove);
    }

    public final void g(int i6, int i10) {
        for (int i11 = i10 - 1; i11 >= i6; i11--) {
            ArrayList arrayList = this.f7025a;
            c cVar = (c) arrayList.remove(i11);
            this.f7027c.remove(cVar.f7043b);
            int i12 = -cVar.f7042a.f6888n.p();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((c) arrayList.get(i13)).f7045d += i12;
            }
            cVar.f7046e = true;
            if (this.f7033j) {
                d(cVar);
            }
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes.dex */
    public final class a implements com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.drm.c {

        /* renamed from: u  reason: collision with root package name */
        public final c f7035u;

        /* renamed from: v  reason: collision with root package name */
        public j.a f7036v;

        /* renamed from: w  reason: collision with root package name */
        public c.a f7037w;

        public a(c cVar) {
            this.f7036v = t.this.f7029e;
            this.f7037w = t.this.f;
            this.f7035u = cVar;
        }

        @Override // com.google.android.exoplayer2.source.j
        public final void I(int i6, i.a aVar, o8.d dVar, o8.e eVar) {
            if (a(i6, aVar)) {
                this.f7036v.f(dVar, eVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public final void J(int i6, i.a aVar, o8.d dVar, o8.e eVar) {
            if (a(i6, aVar)) {
                this.f7036v.j(dVar, eVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public final void K(int i6, i.a aVar, o8.d dVar, o8.e eVar) {
            if (a(i6, aVar)) {
                this.f7036v.d(dVar, eVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void O(int i6, i.a aVar) {
            if (a(i6, aVar)) {
                this.f7037w.b();
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void X(int i6, i.a aVar) {
            if (a(i6, aVar)) {
                this.f7037w.a();
            }
        }

        public final boolean a(int i6, i.a aVar) {
            c cVar = this.f7035u;
            i.a aVar2 = null;
            if (aVar != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= cVar.f7044c.size()) {
                        break;
                    } else if (((i.a) cVar.f7044c.get(i10)).f27275d == aVar.f27275d) {
                        Object obj = cVar.f7043b;
                        int i11 = com.google.android.exoplayer2.a.f6162y;
                        aVar2 = aVar.b(Pair.create(obj, aVar.f27272a));
                        break;
                    } else {
                        i10++;
                    }
                }
                if (aVar2 == null) {
                    return false;
                }
            }
            int i12 = i6 + cVar.f7045d;
            j.a aVar3 = this.f7036v;
            int i13 = aVar3.f6896a;
            t tVar = t.this;
            if (i13 != i12 || !c9.w.a(aVar3.f6897b, aVar2)) {
                this.f7036v = new j.a(tVar.f7029e.f6898c, i12, aVar2);
            }
            c.a aVar4 = this.f7037w;
            if (aVar4.f6438a != i12 || !c9.w.a(aVar4.f6439b, aVar2)) {
                this.f7037w = new c.a(tVar.f.f6440c, i12, aVar2);
                return true;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void g0(int i6, i.a aVar, int i10) {
            if (a(i6, aVar)) {
                this.f7037w.d(i10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void h0(int i6, i.a aVar) {
            if (a(i6, aVar)) {
                this.f7037w.f();
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void k0(int i6, i.a aVar) {
            if (a(i6, aVar)) {
                this.f7037w.c();
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public final void n(int i6, i.a aVar, o8.e eVar) {
            if (a(i6, aVar)) {
                this.f7036v.b(eVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.j
        public final void p(int i6, i.a aVar, o8.d dVar, o8.e eVar, IOException iOException, boolean z10) {
            if (a(i6, aVar)) {
                this.f7036v.h(dVar, eVar, iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final void u(int i6, i.a aVar, Exception exc) {
            if (a(i6, aVar)) {
                this.f7037w.e(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.c
        public final /* synthetic */ void k() {
        }
    }
}
