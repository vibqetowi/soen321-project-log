package com.google.android.exoplayer2.source;

import android.util.Pair;
import b9.u;
import c9.w;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i;
/* compiled from: MaskingMediaSource.java */
/* loaded from: classes.dex */
public final class g extends c<Void> {

    /* renamed from: j  reason: collision with root package name */
    public final i f6884j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6885k;

    /* renamed from: l  reason: collision with root package name */
    public final e0.c f6886l;

    /* renamed from: m  reason: collision with root package name */
    public final e0.b f6887m;

    /* renamed from: n  reason: collision with root package name */
    public a f6888n;

    /* renamed from: o  reason: collision with root package name */
    public f f6889o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6890p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6891q;
    public boolean r;

    /* compiled from: MaskingMediaSource.java */
    /* loaded from: classes.dex */
    public static final class a extends o8.c {

        /* renamed from: y  reason: collision with root package name */
        public static final Object f6892y = new Object();

        /* renamed from: w  reason: collision with root package name */
        public final Object f6893w;

        /* renamed from: x  reason: collision with root package name */
        public final Object f6894x;

        public a(e0 e0Var, Object obj, Object obj2) {
            super(e0Var);
            this.f6893w = obj;
            this.f6894x = obj2;
        }

        @Override // o8.c, com.google.android.exoplayer2.e0
        public final int c(Object obj) {
            Object obj2;
            if (f6892y.equals(obj) && (obj2 = this.f6894x) != null) {
                obj = obj2;
            }
            return this.f27263v.c(obj);
        }

        @Override // o8.c, com.google.android.exoplayer2.e0
        public final e0.b g(int i6, e0.b bVar, boolean z10) {
            this.f27263v.g(i6, bVar, z10);
            if (w.a(bVar.f6466v, this.f6894x) && z10) {
                bVar.f6466v = f6892y;
            }
            return bVar;
        }

        @Override // o8.c, com.google.android.exoplayer2.e0
        public final Object m(int i6) {
            Object m10 = this.f27263v.m(i6);
            if (w.a(m10, this.f6894x)) {
                return f6892y;
            }
            return m10;
        }

        @Override // o8.c, com.google.android.exoplayer2.e0
        public final e0.c o(int i6, e0.c cVar, long j10) {
            this.f27263v.o(i6, cVar, j10);
            if (w.a(cVar.f6471u, this.f6893w)) {
                cVar.f6471u = e0.c.L;
            }
            return cVar;
        }
    }

    /* compiled from: MaskingMediaSource.java */
    /* loaded from: classes.dex */
    public static final class b extends e0 {

        /* renamed from: v  reason: collision with root package name */
        public final com.google.android.exoplayer2.q f6895v;

        public b(com.google.android.exoplayer2.q qVar) {
            this.f6895v = qVar;
        }

        @Override // com.google.android.exoplayer2.e0
        public final int c(Object obj) {
            if (obj == a.f6892y) {
                return 0;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.e0
        public final e0.b g(int i6, e0.b bVar, boolean z10) {
            Integer num;
            Object obj = null;
            if (z10) {
                num = 0;
            } else {
                num = null;
            }
            if (z10) {
                obj = a.f6892y;
            }
            bVar.g(num, obj, 0, -9223372036854775807L, 0L, com.google.android.exoplayer2.source.ads.a.A, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.e0
        public final int i() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.e0
        public final Object m(int i6) {
            return a.f6892y;
        }

        @Override // com.google.android.exoplayer2.e0
        public final e0.c o(int i6, e0.c cVar, long j10) {
            cVar.d(e0.c.L, this.f6895v, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.F = true;
            return cVar;
        }

        @Override // com.google.android.exoplayer2.e0
        public final int p() {
            return 1;
        }
    }

    public g(i iVar, boolean z10) {
        boolean z11;
        this.f6884j = iVar;
        if (z10) {
            iVar.k();
            z11 = true;
        } else {
            z11 = false;
        }
        this.f6885k = z11;
        this.f6886l = new e0.c();
        this.f6887m = new e0.b();
        iVar.m();
        this.f6888n = new a(new b(iVar.g()), e0.c.L, a.f6892y);
    }

    @Override // com.google.android.exoplayer2.source.i
    public final com.google.android.exoplayer2.q g() {
        return this.f6884j.g();
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void l(h hVar) {
        ((f) hVar).i();
        if (hVar == this.f6889o) {
            this.f6889o = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public final void q(u uVar) {
        this.f6847i = uVar;
        this.f6846h = w.j(null);
        if (!this.f6885k) {
            this.f6890p = true;
            v(null, this.f6884j);
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public final void s() {
        this.f6891q = false;
        this.f6890p = false;
        super.s();
    }

    @Override // com.google.android.exoplayer2.source.c
    public final i.a t(Void r22, i.a aVar) {
        Object obj = aVar.f27272a;
        Object obj2 = this.f6888n.f6894x;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f6892y;
        }
        return aVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Void r13, i iVar, e0 e0Var) {
        long j10;
        a aVar;
        f fVar;
        i.a b10;
        a aVar2;
        if (this.f6891q) {
            a aVar3 = this.f6888n;
            this.f6888n = new a(e0Var, aVar3.f6893w, aVar3.f6894x);
            f fVar2 = this.f6889o;
            if (fVar2 != null) {
                x(fVar2.A);
            }
        } else if (e0Var.q()) {
            if (this.r) {
                a aVar4 = this.f6888n;
                aVar2 = new a(e0Var, aVar4.f6893w, aVar4.f6894x);
            } else {
                aVar2 = new a(e0Var, e0.c.L, a.f6892y);
            }
            this.f6888n = aVar2;
        } else {
            e0.c cVar = this.f6886l;
            e0Var.n(0, cVar);
            long j11 = cVar.G;
            Object obj = cVar.f6471u;
            f fVar3 = this.f6889o;
            if (fVar3 != null) {
                a aVar5 = this.f6888n;
                Object obj2 = fVar3.f6878u.f27272a;
                e0.b bVar = this.f6887m;
                aVar5.h(obj2, bVar);
                long j12 = bVar.f6469y + fVar3.f6879v;
                if (j12 != this.f6888n.n(0, cVar).G) {
                    j10 = j12;
                    Pair<Object, Long> j13 = e0Var.j(this.f6886l, this.f6887m, 0, j10);
                    Object obj3 = j13.first;
                    long longValue = ((Long) j13.second).longValue();
                    if (!this.r) {
                        a aVar6 = this.f6888n;
                        aVar = new a(e0Var, aVar6.f6893w, aVar6.f6894x);
                    } else {
                        aVar = new a(e0Var, obj, obj3);
                    }
                    this.f6888n = aVar;
                    fVar = this.f6889o;
                    if (fVar != null) {
                        x(longValue);
                        i.a aVar7 = fVar.f6878u;
                        Object obj4 = aVar7.f27272a;
                        if (this.f6888n.f6894x != null && obj4.equals(a.f6892y)) {
                            obj4 = this.f6888n.f6894x;
                        }
                        b10 = aVar7.b(obj4);
                        this.r = true;
                        this.f6891q = true;
                        r(this.f6888n);
                        if (b10 == null) {
                            f fVar4 = this.f6889o;
                            fVar4.getClass();
                            fVar4.e(b10);
                            return;
                        }
                        return;
                    }
                }
            }
            j10 = j11;
            Pair<Object, Long> j132 = e0Var.j(this.f6886l, this.f6887m, 0, j10);
            Object obj32 = j132.first;
            long longValue2 = ((Long) j132.second).longValue();
            if (!this.r) {
            }
            this.f6888n = aVar;
            fVar = this.f6889o;
            if (fVar != null) {
            }
        }
        b10 = null;
        this.r = true;
        this.f6891q = true;
        r(this.f6888n);
        if (b10 == null) {
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    /* renamed from: w */
    public final f a(i.a aVar, b9.i iVar, long j10) {
        boolean z10;
        f fVar = new f(aVar, iVar, j10);
        if (fVar.f6881x == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        i iVar2 = this.f6884j;
        fVar.f6881x = iVar2;
        if (this.f6891q) {
            Object obj = this.f6888n.f6894x;
            Object obj2 = aVar.f27272a;
            if (obj != null && obj2.equals(a.f6892y)) {
                obj2 = this.f6888n.f6894x;
            }
            fVar.e(aVar.b(obj2));
        } else {
            this.f6889o = fVar;
            if (!this.f6890p) {
                this.f6890p = true;
                v(null, iVar2);
            }
        }
        return fVar;
    }

    public final void x(long j10) {
        f fVar = this.f6889o;
        int c10 = this.f6888n.c(fVar.f6878u.f27272a);
        if (c10 == -1) {
            return;
        }
        a aVar = this.f6888n;
        e0.b bVar = this.f6887m;
        aVar.g(c10, bVar, false);
        long j11 = bVar.f6468x;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        fVar.A = j10;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.i
    public final void j() {
    }
}
