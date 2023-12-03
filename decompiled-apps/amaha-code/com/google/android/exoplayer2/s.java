package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.s;
/* compiled from: MediaPeriodQueue.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final e0.b f6783a = new e0.b();

    /* renamed from: b  reason: collision with root package name */
    public final e0.c f6784b = new e0.c();

    /* renamed from: c  reason: collision with root package name */
    public final p7.n f6785c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f6786d;

    /* renamed from: e  reason: collision with root package name */
    public long f6787e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6788g;

    /* renamed from: h  reason: collision with root package name */
    public o7.o f6789h;

    /* renamed from: i  reason: collision with root package name */
    public o7.o f6790i;

    /* renamed from: j  reason: collision with root package name */
    public o7.o f6791j;

    /* renamed from: k  reason: collision with root package name */
    public int f6792k;

    /* renamed from: l  reason: collision with root package name */
    public Object f6793l;

    /* renamed from: m  reason: collision with root package name */
    public long f6794m;

    public s(p7.n nVar, Handler handler) {
        this.f6785c = nVar;
        this.f6786d = handler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
        if (r8 != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[LOOP:0: B:3:0x0012->B:20:0x003d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0040 A[EDGE_INSN: B:43:0x0040->B:21:0x0040 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i.a m(e0 e0Var, Object obj, long j10, long j11, e0.b bVar) {
        boolean z10;
        e0Var.h(obj, bVar);
        com.google.android.exoplayer2.source.ads.a aVar = bVar.A;
        long j12 = bVar.f6468x;
        boolean z11 = true;
        int i6 = aVar.f6825v - 1;
        while (i6 >= 0) {
            if (j10 != Long.MIN_VALUE) {
                long j13 = aVar.b(i6).f6830u;
                if (j13 != Long.MIN_VALUE ? j10 < j13 : !(j12 != -9223372036854775807L && j10 >= j12)) {
                    z10 = true;
                    if (z10) {
                        break;
                    }
                    i6--;
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        if (i6 >= 0) {
            a.C0138a b10 = aVar.b(i6);
            int i10 = b10.f6831v;
            if (i10 != -1) {
                int i11 = 0;
                while (true) {
                    if (i11 < i10) {
                        int i12 = b10.f6833x[i11];
                        if (i12 == 0 || i12 == 1) {
                            break;
                        }
                        i11++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
            }
        }
        i6 = -1;
        if (i6 == -1) {
            return new i.a(bVar.c(j10), j11, obj);
        }
        return new i.a(obj, i6, bVar.d(i6), j11);
    }

    public final o7.o a() {
        o7.o oVar = this.f6789h;
        if (oVar == null) {
            return null;
        }
        if (oVar == this.f6790i) {
            this.f6790i = oVar.f27221l;
        }
        oVar.f();
        int i6 = this.f6792k - 1;
        this.f6792k = i6;
        if (i6 == 0) {
            this.f6791j = null;
            o7.o oVar2 = this.f6789h;
            this.f6793l = oVar2.f27212b;
            this.f6794m = oVar2.f.f27225a.f27275d;
        }
        this.f6789h = this.f6789h.f27221l;
        j();
        return this.f6789h;
    }

    public final void b() {
        if (this.f6792k == 0) {
            return;
        }
        o7.o oVar = this.f6789h;
        sc.b.E(oVar);
        this.f6793l = oVar.f27212b;
        this.f6794m = oVar.f.f27225a.f27275d;
        while (oVar != null) {
            oVar.f();
            oVar = oVar.f27221l;
        }
        this.f6789h = null;
        this.f6791j = null;
        this.f6790i = null;
        this.f6792k = 0;
        j();
    }

    public final o7.p c(e0 e0Var, o7.o oVar, long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        o7.p pVar = oVar.f;
        long j15 = (oVar.f27224o + pVar.f27229e) - j10;
        long j16 = 0;
        boolean z10 = pVar.f27230g;
        e0.b bVar = this.f6783a;
        i.a aVar = pVar.f27225a;
        if (z10) {
            int e10 = e0Var.e(e0Var.c(aVar.f27272a), this.f6783a, this.f6784b, this.f, this.f6788g);
            if (e10 == -1) {
                return null;
            }
            int i6 = e0Var.g(e10, bVar, true).f6467w;
            Object obj = bVar.f6466v;
            if (e0Var.n(i6, this.f6784b).I == e10) {
                Pair<Object, Long> k10 = e0Var.k(this.f6784b, this.f6783a, i6, -9223372036854775807L, Math.max(0L, j15));
                if (k10 == null) {
                    return null;
                }
                obj = k10.first;
                long longValue = ((Long) k10.second).longValue();
                o7.o oVar2 = oVar.f27221l;
                if (oVar2 != null && oVar2.f27212b.equals(obj)) {
                    j13 = oVar2.f.f27225a.f27275d;
                } else {
                    j13 = this.f6787e;
                    this.f6787e = 1 + j13;
                }
                j14 = longValue;
                j16 = -9223372036854775807L;
            } else {
                j13 = aVar.f27275d;
                j14 = 0;
            }
            return d(e0Var, m(e0Var, obj, j14, j13, this.f6783a), j16, j14);
        }
        e0Var.h(aVar.f27272a, bVar);
        boolean a10 = aVar.a();
        Object obj2 = aVar.f27272a;
        if (a10) {
            int i10 = aVar.f27273b;
            int i11 = bVar.A.b(i10).f6831v;
            if (i11 == -1) {
                return null;
            }
            int b10 = bVar.A.b(i10).b(aVar.f27274c);
            if (b10 < i11) {
                return e(e0Var, aVar.f27272a, i10, b10, pVar.f27227c, aVar.f27275d);
            }
            long j17 = pVar.f27227c;
            if (j17 == -9223372036854775807L) {
                Pair<Object, Long> k11 = e0Var.k(this.f6784b, bVar, bVar.f6467w, -9223372036854775807L, Math.max(0L, j15));
                if (k11 == null) {
                    return null;
                }
                j17 = ((Long) k11.second).longValue();
            }
            e0Var.h(obj2, bVar);
            com.google.android.exoplayer2.source.ads.a aVar2 = bVar.A;
            int i12 = aVar.f27273b;
            long j18 = aVar2.b(i12).f6830u;
            if (j18 == Long.MIN_VALUE) {
                j12 = bVar.f6468x;
            } else {
                j12 = bVar.A.b(i12).f6835z + j18;
            }
            return f(e0Var, aVar.f27272a, Math.max(j12, j17), pVar.f27227c, aVar.f27275d);
        }
        int i13 = aVar.f27276e;
        int d10 = bVar.d(i13);
        if (d10 == bVar.A.b(i13).f6831v) {
            e0Var.h(obj2, bVar);
            long j19 = bVar.A.b(i13).f6830u;
            if (j19 == Long.MIN_VALUE) {
                j11 = bVar.f6468x;
            } else {
                j11 = j19 + bVar.A.b(i13).f6835z;
            }
            return f(e0Var, aVar.f27272a, j11, pVar.f27229e, aVar.f27275d);
        }
        return e(e0Var, aVar.f27272a, aVar.f27276e, d10, pVar.f27229e, aVar.f27275d);
    }

    public final o7.p d(e0 e0Var, i.a aVar, long j10, long j11) {
        e0Var.h(aVar.f27272a, this.f6783a);
        if (aVar.a()) {
            return e(e0Var, aVar.f27272a, aVar.f27273b, aVar.f27274c, j10, aVar.f27275d);
        }
        return f(e0Var, aVar.f27272a, j11, j10, aVar.f27275d);
    }

    public final o7.p e(e0 e0Var, Object obj, int i6, int i10, long j10, long j11) {
        long j12;
        long j13;
        i.a aVar = new i.a(obj, i6, i10, j11);
        e0.b bVar = this.f6783a;
        long b10 = e0Var.h(obj, bVar).b(i6, i10);
        if (i10 == bVar.d(i6)) {
            j12 = bVar.A.f6826w;
        } else {
            j12 = 0;
        }
        boolean e10 = bVar.e(i6);
        if (b10 != -9223372036854775807L && j12 >= b10) {
            j13 = Math.max(0L, b10 - 1);
        } else {
            j13 = j12;
        }
        return new o7.p(aVar, j13, j10, -9223372036854775807L, b10, e10, false, false, false);
    }

    public final o7.p f(e0 e0Var, Object obj, long j10, long j11, long j12) {
        boolean z10;
        boolean z11;
        long j13;
        long j14;
        long j15 = j10;
        e0.b bVar = this.f6783a;
        e0Var.h(obj, bVar);
        int c10 = bVar.c(j15);
        i.a aVar = new i.a(c10, j12, obj);
        if (!aVar.a() && c10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean i6 = i(e0Var, aVar);
        boolean h10 = h(e0Var, aVar, z10);
        if (c10 != -1 && bVar.e(c10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c10 != -1) {
            j13 = bVar.A.b(c10).f6830u;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L && j13 != Long.MIN_VALUE) {
            j14 = j13;
        } else {
            j14 = bVar.f6468x;
        }
        if (j14 != -9223372036854775807L && j15 >= j14) {
            j15 = Math.max(0L, j14 - 1);
        }
        return new o7.p(aVar, j15, j11, j13, j14, z11, z10, i6, h10);
    }

    public final o7.p g(e0 e0Var, o7.p pVar) {
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        i.a aVar = pVar.f27225a;
        if (!aVar.a() && aVar.f27276e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean i6 = i(e0Var, aVar);
        boolean h10 = h(e0Var, aVar, z10);
        Object obj = pVar.f27225a.f27272a;
        e0.b bVar = this.f6783a;
        e0Var.h(obj, bVar);
        boolean a10 = aVar.a();
        int i10 = aVar.f27276e;
        if (!a10 && i10 != -1) {
            j10 = bVar.A.b(i10).f6830u;
        } else {
            j10 = -9223372036854775807L;
        }
        boolean a11 = aVar.a();
        int i11 = aVar.f27273b;
        if (a11) {
            j11 = bVar.b(i11, aVar.f27274c);
        } else if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = bVar.f6468x;
        }
        if (aVar.a()) {
            z11 = bVar.e(i11);
        } else if (i10 != -1 && bVar.e(i10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new o7.p(aVar, pVar.f27226b, pVar.f27227c, j10, j11, z11, z10, i6, h10);
    }

    public final boolean h(e0 e0Var, i.a aVar, boolean z10) {
        boolean z11;
        int c10 = e0Var.c(aVar.f27272a);
        if (e0Var.n(e0Var.g(c10, this.f6783a, false).f6467w, this.f6784b).C) {
            return false;
        }
        if (e0Var.e(c10, this.f6783a, this.f6784b, this.f, this.f6788g) == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 || !z10) {
            return false;
        }
        return true;
    }

    public final boolean i(e0 e0Var, i.a aVar) {
        boolean z10;
        if (!aVar.a() && aVar.f27276e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Object obj = aVar.f27272a;
        int i6 = e0Var.h(obj, this.f6783a).f6467w;
        if (e0Var.n(i6, this.f6784b).J == e0Var.c(obj)) {
            return true;
        }
        return false;
    }

    public final void j() {
        i.a aVar;
        if (this.f6785c != null) {
            s.b bVar = com.google.common.collect.s.f9446v;
            s.a aVar2 = new s.a();
            for (o7.o oVar = this.f6789h; oVar != null; oVar = oVar.f27221l) {
                aVar2.b(oVar.f.f27225a);
            }
            o7.o oVar2 = this.f6790i;
            if (oVar2 == null) {
                aVar = null;
            } else {
                aVar = oVar2.f.f27225a;
            }
            this.f6786d.post(new androidx.emoji2.text.g(5, this, aVar2, aVar));
        }
    }

    public final boolean k(o7.o oVar) {
        boolean z10;
        boolean z11 = false;
        if (oVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        if (oVar.equals(this.f6791j)) {
            return false;
        }
        this.f6791j = oVar;
        while (true) {
            oVar = oVar.f27221l;
            if (oVar == null) {
                break;
            }
            if (oVar == this.f6790i) {
                this.f6790i = this.f6789h;
                z11 = true;
            }
            oVar.f();
            this.f6792k--;
        }
        o7.o oVar2 = this.f6791j;
        if (oVar2.f27221l != null) {
            oVar2.b();
            oVar2.f27221l = null;
            oVar2.c();
        }
        j();
        return z11;
    }

    public final i.a l(e0 e0Var, Object obj, long j10) {
        long j11;
        int c10;
        e0.b bVar = this.f6783a;
        int i6 = e0Var.h(obj, bVar).f6467w;
        Object obj2 = this.f6793l;
        if (obj2 != null && (c10 = e0Var.c(obj2)) != -1 && e0Var.g(c10, bVar, false).f6467w == i6) {
            j11 = this.f6794m;
        } else {
            o7.o oVar = this.f6789h;
            while (true) {
                if (oVar != null) {
                    if (oVar.f27212b.equals(obj)) {
                        j11 = oVar.f.f27225a.f27275d;
                        break;
                    }
                    oVar = oVar.f27221l;
                } else {
                    o7.o oVar2 = this.f6789h;
                    while (true) {
                        if (oVar2 != null) {
                            int c11 = e0Var.c(oVar2.f27212b);
                            if (c11 != -1 && e0Var.g(c11, bVar, false).f6467w == i6) {
                                j11 = oVar2.f.f27225a.f27275d;
                                break;
                            }
                            oVar2 = oVar2.f27221l;
                        } else {
                            j11 = this.f6787e;
                            this.f6787e = 1 + j11;
                            if (this.f6789h == null) {
                                this.f6793l = obj;
                                this.f6794m = j11;
                            }
                        }
                    }
                }
            }
        }
        return m(e0Var, obj, j10, j11, this.f6783a);
    }

    public final boolean n(e0 e0Var) {
        o7.o oVar;
        o7.o oVar2 = this.f6789h;
        if (oVar2 == null) {
            return true;
        }
        int c10 = e0Var.c(oVar2.f27212b);
        while (true) {
            c10 = e0Var.e(c10, this.f6783a, this.f6784b, this.f, this.f6788g);
            while (true) {
                oVar = oVar2.f27221l;
                if (oVar == null || oVar2.f.f27230g) {
                    break;
                }
                oVar2 = oVar;
            }
            if (c10 == -1 || oVar == null || e0Var.c(oVar.f27212b) != c10) {
                break;
            }
            oVar2 = oVar;
        }
        boolean k10 = k(oVar2);
        oVar2.f = g(e0Var, oVar2.f);
        return !k10;
    }

    public final boolean o(e0 e0Var, long j10, long j11) {
        boolean k10;
        boolean z10;
        o7.p pVar;
        boolean z11;
        long j12;
        boolean z12;
        o7.o oVar = null;
        for (o7.o oVar2 = this.f6789h; oVar2 != null; oVar2 = oVar2.f27221l) {
            o7.p pVar2 = oVar2.f;
            if (oVar == null) {
                pVar = g(e0Var, pVar2);
            } else {
                o7.p c10 = c(e0Var, oVar, j10);
                if (c10 == null) {
                    k10 = k(oVar);
                } else {
                    if (pVar2.f27226b == c10.f27226b && pVar2.f27225a.equals(c10.f27225a)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        k10 = k(oVar);
                    } else {
                        pVar = c10;
                    }
                }
                return !k10;
            }
            oVar2.f = pVar.a(pVar2.f27227c);
            long j13 = pVar.f27229e;
            long j14 = pVar2.f27229e;
            if (j14 != -9223372036854775807L && j14 != j13) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                oVar2.h();
                if (j13 == -9223372036854775807L) {
                    j12 = Long.MAX_VALUE;
                } else {
                    j12 = oVar2.f27224o + j13;
                }
                if (oVar2 == this.f6790i && !oVar2.f.f && (j11 == Long.MIN_VALUE || j11 >= j12)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!k(oVar2) && !z12) {
                    return true;
                }
                return false;
            }
            oVar = oVar2;
        }
        return true;
    }
}
