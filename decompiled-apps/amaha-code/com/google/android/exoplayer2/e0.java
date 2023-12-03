package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.ads.a;
import java.util.ArrayList;
/* compiled from: Timeline.java */
/* loaded from: classes.dex */
public abstract class e0 implements f {

    /* renamed from: u  reason: collision with root package name */
    public static final a f6464u = new a();

    /* compiled from: Timeline.java */
    /* loaded from: classes.dex */
    public class a extends e0 {
        @Override // com.google.android.exoplayer2.e0
        public final int c(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.e0
        public final b g(int i6, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.e0
        public final int i() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.e0
        public final Object m(int i6) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.e0
        public final c o(int i6, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.e0
        public final int p() {
            return 0;
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes.dex */
    public static final class b implements f {
        public com.google.android.exoplayer2.source.ads.a A = com.google.android.exoplayer2.source.ads.a.A;

        /* renamed from: u  reason: collision with root package name */
        public Object f6465u;

        /* renamed from: v  reason: collision with root package name */
        public Object f6466v;

        /* renamed from: w  reason: collision with root package name */
        public int f6467w;

        /* renamed from: x  reason: collision with root package name */
        public long f6468x;

        /* renamed from: y  reason: collision with root package name */
        public long f6469y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f6470z;

        static {
            new com.google.firebase.messaging.j(17);
        }

        public static String f(int i6) {
            return Integer.toString(i6, 36);
        }

        @Override // com.google.android.exoplayer2.f
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(f(0), this.f6467w);
            bundle.putLong(f(1), this.f6468x);
            bundle.putLong(f(2), this.f6469y);
            bundle.putBoolean(f(3), this.f6470z);
            bundle.putBundle(f(4), this.A.a());
            return bundle;
        }

        public final long b(int i6, int i10) {
            a.C0138a b10 = this.A.b(i6);
            if (b10.f6831v != -1) {
                return b10.f6834y[i10];
            }
            return -9223372036854775807L;
        }

        public final int c(long j10) {
            int i6;
            boolean z10;
            com.google.android.exoplayer2.source.ads.a aVar = this.A;
            long j11 = this.f6468x;
            aVar.getClass();
            if (j10 == Long.MIN_VALUE) {
                return -1;
            }
            if (j11 != -9223372036854775807L && j10 >= j11) {
                return -1;
            }
            int i10 = aVar.f6828y;
            while (true) {
                i6 = aVar.f6825v;
                if (i10 >= i6) {
                    break;
                }
                if (aVar.b(i10).f6830u == Long.MIN_VALUE || aVar.b(i10).f6830u > j10) {
                    a.C0138a b10 = aVar.b(i10);
                    int i11 = b10.f6831v;
                    if (i11 != -1 && b10.b(-1) >= i11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        break;
                    }
                }
                i10++;
            }
            if (i10 >= i6) {
                return -1;
            }
            return i10;
        }

        public final int d(int i6) {
            return this.A.b(i6).b(-1);
        }

        public final boolean e(int i6) {
            return this.A.b(i6).A;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (c9.w.a(this.f6465u, bVar.f6465u) && c9.w.a(this.f6466v, bVar.f6466v) && this.f6467w == bVar.f6467w && this.f6468x == bVar.f6468x && this.f6469y == bVar.f6469y && this.f6470z == bVar.f6470z && c9.w.a(this.A, bVar.A)) {
                return true;
            }
            return false;
        }

        public final void g(Object obj, Object obj2, int i6, long j10, long j11, com.google.android.exoplayer2.source.ads.a aVar, boolean z10) {
            this.f6465u = obj;
            this.f6466v = obj2;
            this.f6467w = i6;
            this.f6468x = j10;
            this.f6469y = j11;
            this.A = aVar;
            this.f6470z = z10;
        }

        public final int hashCode() {
            int hashCode;
            Object obj = this.f6465u;
            int i6 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i10 = (217 + hashCode) * 31;
            Object obj2 = this.f6466v;
            if (obj2 != null) {
                i6 = obj2.hashCode();
            }
            long j10 = this.f6468x;
            long j11 = this.f6469y;
            return this.A.hashCode() + ((((((((((i10 + i6) * 31) + this.f6467w) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f6470z ? 1 : 0)) * 31);
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes.dex */
    public static final class c implements f {
        public static final Object L = new Object();
        public static final Object M = new Object();
        public static final q N;
        public long A;
        public boolean B;
        public boolean C;
        @Deprecated
        public boolean D;
        public q.e E;
        public boolean F;
        public long G;
        public long H;
        public int I;
        public int J;
        public long K;
        @Deprecated

        /* renamed from: v  reason: collision with root package name */
        public Object f6472v;

        /* renamed from: x  reason: collision with root package name */
        public Object f6474x;

        /* renamed from: y  reason: collision with root package name */
        public long f6475y;

        /* renamed from: z  reason: collision with root package name */
        public long f6476z;

        /* renamed from: u  reason: collision with root package name */
        public Object f6471u = L;

        /* renamed from: w  reason: collision with root package name */
        public q f6473w = N;

        static {
            q.a aVar = new q.a();
            aVar.f6689a = "com.google.android.exoplayer2.Timeline";
            aVar.f6690b = Uri.EMPTY;
            N = aVar.a();
            new com.google.firebase.messaging.j(18);
        }

        public static String c(int i6) {
            return Integer.toString(i6, 36);
        }

        @Override // com.google.android.exoplayer2.f
        public final Bundle a() {
            return e();
        }

        public final boolean b() {
            boolean z10;
            boolean z11;
            boolean z12 = this.D;
            if (this.E != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            sc.b.C(z11);
            if (this.E != null) {
                return true;
            }
            return false;
        }

        public final void d(Object obj, q qVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, q.e eVar, long j13, long j14, int i6, int i10, long j15) {
            q qVar2;
            Object obj3;
            boolean z12;
            q.g gVar;
            this.f6471u = obj;
            if (qVar != null) {
                qVar2 = qVar;
            } else {
                qVar2 = N;
            }
            this.f6473w = qVar2;
            if (qVar != null && (gVar = qVar.f6685v) != null) {
                obj3 = gVar.f6740g;
            } else {
                obj3 = null;
            }
            this.f6472v = obj3;
            this.f6474x = obj2;
            this.f6475y = j10;
            this.f6476z = j11;
            this.A = j12;
            this.B = z10;
            this.C = z11;
            if (eVar != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.D = z12;
            this.E = eVar;
            this.G = j13;
            this.H = j14;
            this.I = i6;
            this.J = i10;
            this.K = j15;
            this.F = false;
        }

        public final Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putBundle(c(1), this.f6473w.a());
            bundle.putLong(c(2), this.f6475y);
            bundle.putLong(c(3), this.f6476z);
            bundle.putLong(c(4), this.A);
            bundle.putBoolean(c(5), this.B);
            bundle.putBoolean(c(6), this.C);
            q.e eVar = this.E;
            if (eVar != null) {
                bundle.putBundle(c(7), eVar.a());
            }
            bundle.putBoolean(c(8), this.F);
            bundle.putLong(c(9), this.G);
            bundle.putLong(c(10), this.H);
            bundle.putInt(c(11), this.I);
            bundle.putInt(c(12), this.J);
            bundle.putLong(c(13), this.K);
            return bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            if (c9.w.a(this.f6471u, cVar.f6471u) && c9.w.a(this.f6473w, cVar.f6473w) && c9.w.a(this.f6474x, cVar.f6474x) && c9.w.a(this.E, cVar.E) && this.f6475y == cVar.f6475y && this.f6476z == cVar.f6476z && this.A == cVar.A && this.B == cVar.B && this.C == cVar.C && this.F == cVar.F && this.G == cVar.G && this.H == cVar.H && this.I == cVar.I && this.J == cVar.J && this.K == cVar.K) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.f6473w.hashCode() + ((this.f6471u.hashCode() + 217) * 31)) * 31;
            Object obj = this.f6474x;
            int i6 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i10 = (hashCode2 + hashCode) * 31;
            q.e eVar = this.E;
            if (eVar != null) {
                i6 = eVar.hashCode();
            }
            long j10 = this.f6475y;
            long j11 = this.f6476z;
            long j12 = this.A;
            long j13 = this.G;
            long j14 = this.H;
            long j15 = this.K;
            return ((((((((((((((((((((((i10 + i6) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.I) * 31) + this.J) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    public static String r(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        ArrayList arrayList = new ArrayList();
        int p10 = p();
        c cVar = new c();
        for (int i6 = 0; i6 < p10; i6++) {
            arrayList.add(o(i6, cVar, 0L).e());
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = i();
        b bVar = new b();
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList2.add(g(i11, bVar, false).a());
        }
        int[] iArr = new int[p10];
        if (p10 > 0) {
            iArr[0] = b(true);
        }
        for (int i12 = 1; i12 < p10; i12++) {
            iArr[i12] = f(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        hc.d.e0(bundle, r(0), new o7.a(arrayList));
        hc.d.e0(bundle, r(1), new o7.a(arrayList2));
        bundle.putIntArray(r(2), iArr);
        return bundle;
    }

    public int b(boolean z10) {
        if (q()) {
            return -1;
        }
        return 0;
    }

    public abstract int c(Object obj);

    public int d(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int e(int i6, b bVar, c cVar, int i10, boolean z10) {
        int i11 = g(i6, bVar, false).f6467w;
        if (n(i11, cVar).J == i6) {
            int f = f(i11, i10, z10);
            if (f == -1) {
                return -1;
            }
            return n(f, cVar).I;
        }
        return i6 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.p() != p() || e0Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i6 = 0; i6 < p(); i6++) {
            if (!n(i6, cVar).equals(e0Var.n(i6, cVar2))) {
                return false;
            }
        }
        for (int i10 = 0; i10 < i(); i10++) {
            if (!g(i10, bVar, true).equals(e0Var.g(i10, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int f(int i6, int i10, boolean z10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i6 == d(z10)) {
                        return b(z10);
                    }
                    return i6 + 1;
                }
                throw new IllegalStateException();
            }
            return i6;
        } else if (i6 == d(z10)) {
            return -1;
        } else {
            return i6 + 1;
        }
    }

    public abstract b g(int i6, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(c(obj), bVar, true);
    }

    public final int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p10 = p() + 217;
        for (int i6 = 0; i6 < p(); i6++) {
            p10 = (p10 * 31) + n(i6, cVar).hashCode();
        }
        int i10 = i() + (p10 * 31);
        for (int i11 = 0; i11 < i(); i11++) {
            i10 = (i10 * 31) + g(i11, bVar, true).hashCode();
        }
        return i10;
    }

    public abstract int i();

    @Deprecated
    public final Pair<Object, Long> j(c cVar, b bVar, int i6, long j10) {
        Pair<Object, Long> k10 = k(cVar, bVar, i6, j10, 0L);
        k10.getClass();
        return k10;
    }

    @Deprecated
    public final Pair<Object, Long> k(c cVar, b bVar, int i6, long j10, long j11) {
        sc.b.v(i6, p());
        o(i6, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.G;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = cVar.I;
        g(i10, bVar, false);
        while (i10 < cVar.J && bVar.f6469y != j10) {
            int i11 = i10 + 1;
            if (g(i11, bVar, false).f6469y > j10) {
                break;
            }
            i10 = i11;
        }
        g(i10, bVar, true);
        long j12 = j10 - bVar.f6469y;
        long j13 = bVar.f6468x;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        long max = Math.max(0L, j12);
        Object obj = bVar.f6466v;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int l(int i6, int i10, boolean z10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i6 == b(z10)) {
                        return d(z10);
                    }
                    return i6 - 1;
                }
                throw new IllegalStateException();
            }
            return i6;
        } else if (i6 == b(z10)) {
            return -1;
        } else {
            return i6 - 1;
        }
    }

    public abstract Object m(int i6);

    public final c n(int i6, c cVar) {
        return o(i6, cVar, 0L);
    }

    public abstract c o(int i6, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        if (p() == 0) {
            return true;
        }
        return false;
    }
}
