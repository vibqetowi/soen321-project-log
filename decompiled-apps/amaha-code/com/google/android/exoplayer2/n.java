package com.google.android.exoplayer2;

import android.os.Bundle;
import com.appsflyer.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: Format.java */
/* loaded from: classes.dex */
public final class n implements f {

    /* renamed from: a0  reason: collision with root package name */
    public static final n f6648a0 = new n(new a());

    /* renamed from: b0  reason: collision with root package name */
    public static final com.google.firebase.messaging.j f6649b0 = new com.google.firebase.messaging.j(2);
    public final int A;
    public final int B;
    public final String C;
    public final g8.a D;
    public final String E;
    public final String F;
    public final int G;
    public final List<byte[]> H;
    public final com.google.android.exoplayer2.drm.b I;
    public final long J;
    public final int K;
    public final int L;
    public final float M;
    public final int N;
    public final float O;
    public final byte[] P;
    public final int Q;
    public final d9.b R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final int Y;
    public int Z;

    /* renamed from: u  reason: collision with root package name */
    public final String f6650u;

    /* renamed from: v  reason: collision with root package name */
    public final String f6651v;

    /* renamed from: w  reason: collision with root package name */
    public final String f6652w;

    /* renamed from: x  reason: collision with root package name */
    public final int f6653x;

    /* renamed from: y  reason: collision with root package name */
    public final int f6654y;

    /* renamed from: z  reason: collision with root package name */
    public final int f6655z;

    public n(a aVar) {
        this.f6650u = aVar.f6656a;
        this.f6651v = aVar.f6657b;
        this.f6652w = c9.w.z(aVar.f6658c);
        this.f6653x = aVar.f6659d;
        this.f6654y = aVar.f6660e;
        int i6 = aVar.f;
        this.f6655z = i6;
        int i10 = aVar.f6661g;
        this.A = i10;
        this.B = i10 != -1 ? i10 : i6;
        this.C = aVar.f6662h;
        this.D = aVar.f6663i;
        this.E = aVar.f6664j;
        this.F = aVar.f6665k;
        this.G = aVar.f6666l;
        List<byte[]> list = aVar.f6667m;
        this.H = list == null ? Collections.emptyList() : list;
        com.google.android.exoplayer2.drm.b bVar = aVar.f6668n;
        this.I = bVar;
        this.J = aVar.f6669o;
        this.K = aVar.f6670p;
        this.L = aVar.f6671q;
        this.M = aVar.r;
        int i11 = aVar.f6672s;
        this.N = i11 == -1 ? 0 : i11;
        float f = aVar.f6673t;
        this.O = f == -1.0f ? 1.0f : f;
        this.P = aVar.f6674u;
        this.Q = aVar.f6675v;
        this.R = aVar.f6676w;
        this.S = aVar.f6677x;
        this.T = aVar.f6678y;
        this.U = aVar.f6679z;
        int i12 = aVar.A;
        this.V = i12 == -1 ? 0 : i12;
        int i13 = aVar.B;
        this.W = i13 != -1 ? i13 : 0;
        this.X = aVar.C;
        int i14 = aVar.D;
        if (i14 == 0 && bVar != null) {
            this.Y = 1;
        } else {
            this.Y = i14;
        }
    }

    public static String d(int i6) {
        return Integer.toString(i6, 36);
    }

    public static String e(int i6) {
        String d10 = d(12);
        String num = Integer.toString(i6, 36);
        StringBuilder sb2 = new StringBuilder(ri.e.c(num, ri.e.c(d10, 1)));
        sb2.append(d10);
        sb2.append("_");
        sb2.append(num);
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        int i6 = 0;
        bundle.putString(d(0), this.f6650u);
        bundle.putString(d(1), this.f6651v);
        bundle.putString(d(2), this.f6652w);
        bundle.putInt(d(3), this.f6653x);
        bundle.putInt(d(4), this.f6654y);
        bundle.putInt(d(5), this.f6655z);
        bundle.putInt(d(6), this.A);
        bundle.putString(d(7), this.C);
        bundle.putParcelable(d(8), this.D);
        bundle.putString(d(9), this.E);
        bundle.putString(d(10), this.F);
        bundle.putInt(d(11), this.G);
        while (true) {
            List<byte[]> list = this.H;
            if (i6 < list.size()) {
                bundle.putByteArray(e(i6), list.get(i6));
                i6++;
            } else {
                bundle.putParcelable(d(13), this.I);
                bundle.putLong(d(14), this.J);
                bundle.putInt(d(15), this.K);
                bundle.putInt(d(16), this.L);
                bundle.putFloat(d(17), this.M);
                bundle.putInt(d(18), this.N);
                bundle.putFloat(d(19), this.O);
                bundle.putByteArray(d(20), this.P);
                bundle.putInt(d(21), this.Q);
                bundle.putBundle(d(22), c9.a.d(this.R));
                bundle.putInt(d(23), this.S);
                bundle.putInt(d(24), this.T);
                bundle.putInt(d(25), this.U);
                bundle.putInt(d(26), this.V);
                bundle.putInt(d(27), this.W);
                bundle.putInt(d(28), this.X);
                bundle.putInt(d(29), this.Y);
                return bundle;
            }
        }
    }

    public final a b() {
        return new a(this);
    }

    public final boolean c(n nVar) {
        List<byte[]> list = this.H;
        if (list.size() != nVar.H.size()) {
            return false;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!Arrays.equals(list.get(i6), nVar.H.get(i6))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i6;
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        int i10 = this.Z;
        if ((i10 == 0 || (i6 = nVar.Z) == 0 || i10 == i6) && this.f6653x == nVar.f6653x && this.f6654y == nVar.f6654y && this.f6655z == nVar.f6655z && this.A == nVar.A && this.G == nVar.G && this.J == nVar.J && this.K == nVar.K && this.L == nVar.L && this.N == nVar.N && this.Q == nVar.Q && this.S == nVar.S && this.T == nVar.T && this.U == nVar.U && this.V == nVar.V && this.W == nVar.W && this.X == nVar.X && this.Y == nVar.Y && Float.compare(this.M, nVar.M) == 0 && Float.compare(this.O, nVar.O) == 0 && c9.w.a(this.f6650u, nVar.f6650u) && c9.w.a(this.f6651v, nVar.f6651v) && c9.w.a(this.C, nVar.C) && c9.w.a(this.E, nVar.E) && c9.w.a(this.F, nVar.F) && c9.w.a(this.f6652w, nVar.f6652w) && Arrays.equals(this.P, nVar.P) && c9.w.a(this.D, nVar.D) && c9.w.a(this.R, nVar.R) && c9.w.a(this.I, nVar.I) && c(nVar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.Z == 0) {
            int i10 = 0;
            String str = this.f6650u;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f6651v;
            if (str2 != null) {
                i6 = str2.hashCode();
            } else {
                i6 = 0;
            }
            int i12 = (i11 + i6) * 31;
            String str3 = this.f6652w;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i13 = (((((((((i12 + hashCode2) * 31) + this.f6653x) * 31) + this.f6654y) * 31) + this.f6655z) * 31) + this.A) * 31;
            String str4 = this.C;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            g8.a aVar = this.D;
            if (aVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = aVar.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str5 = this.E;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            String str6 = this.F;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.M);
            this.Z = ((((((((((((((((Float.floatToIntBits(this.O) + ((((floatToIntBits + ((((((((((i16 + i10) * 31) + this.G) * 31) + ((int) this.J)) * 31) + this.K) * 31) + this.L) * 31)) * 31) + this.N) * 31)) * 31) + this.Q) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W) * 31) + this.X) * 31) + this.Y;
        }
        return this.Z;
    }

    public final String toString() {
        String str = this.f6650u;
        int c10 = ri.e.c(str, R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
        String str2 = this.f6651v;
        int c11 = ri.e.c(str2, c10);
        String str3 = this.E;
        int c12 = ri.e.c(str3, c11);
        String str4 = this.F;
        int c13 = ri.e.c(str4, c12);
        String str5 = this.C;
        int c14 = ri.e.c(str5, c13);
        String str6 = this.f6652w;
        StringBuilder n10 = defpackage.e.n(ri.e.c(str6, c14), "Format(", str, ", ", str2);
        n10.append(", ");
        n10.append(str3);
        n10.append(", ");
        n10.append(str4);
        n10.append(", ");
        n10.append(str5);
        n10.append(", ");
        n10.append(this.B);
        n10.append(", ");
        n10.append(str6);
        n10.append(", [");
        n10.append(this.K);
        n10.append(", ");
        n10.append(this.L);
        n10.append(", ");
        n10.append(this.M);
        n10.append("], [");
        n10.append(this.S);
        n10.append(", ");
        return pl.a.g(n10, this.T, "])");
    }

    /* compiled from: Format.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int A;
        public int B;
        public int C;
        public int D;

        /* renamed from: a  reason: collision with root package name */
        public String f6656a;

        /* renamed from: b  reason: collision with root package name */
        public String f6657b;

        /* renamed from: c  reason: collision with root package name */
        public String f6658c;

        /* renamed from: d  reason: collision with root package name */
        public int f6659d;

        /* renamed from: e  reason: collision with root package name */
        public int f6660e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f6661g;

        /* renamed from: h  reason: collision with root package name */
        public String f6662h;

        /* renamed from: i  reason: collision with root package name */
        public g8.a f6663i;

        /* renamed from: j  reason: collision with root package name */
        public String f6664j;

        /* renamed from: k  reason: collision with root package name */
        public String f6665k;

        /* renamed from: l  reason: collision with root package name */
        public int f6666l;

        /* renamed from: m  reason: collision with root package name */
        public List<byte[]> f6667m;

        /* renamed from: n  reason: collision with root package name */
        public com.google.android.exoplayer2.drm.b f6668n;

        /* renamed from: o  reason: collision with root package name */
        public long f6669o;

        /* renamed from: p  reason: collision with root package name */
        public int f6670p;

        /* renamed from: q  reason: collision with root package name */
        public int f6671q;
        public float r;

        /* renamed from: s  reason: collision with root package name */
        public int f6672s;

        /* renamed from: t  reason: collision with root package name */
        public float f6673t;

        /* renamed from: u  reason: collision with root package name */
        public byte[] f6674u;

        /* renamed from: v  reason: collision with root package name */
        public int f6675v;

        /* renamed from: w  reason: collision with root package name */
        public d9.b f6676w;

        /* renamed from: x  reason: collision with root package name */
        public int f6677x;

        /* renamed from: y  reason: collision with root package name */
        public int f6678y;

        /* renamed from: z  reason: collision with root package name */
        public int f6679z;

        public a() {
            this.f = -1;
            this.f6661g = -1;
            this.f6666l = -1;
            this.f6669o = Long.MAX_VALUE;
            this.f6670p = -1;
            this.f6671q = -1;
            this.r = -1.0f;
            this.f6673t = 1.0f;
            this.f6675v = -1;
            this.f6677x = -1;
            this.f6678y = -1;
            this.f6679z = -1;
            this.C = -1;
            this.D = 0;
        }

        public final n a() {
            return new n(this);
        }

        public final void b(int i6) {
            this.f6656a = Integer.toString(i6);
        }

        public a(n nVar) {
            this.f6656a = nVar.f6650u;
            this.f6657b = nVar.f6651v;
            this.f6658c = nVar.f6652w;
            this.f6659d = nVar.f6653x;
            this.f6660e = nVar.f6654y;
            this.f = nVar.f6655z;
            this.f6661g = nVar.A;
            this.f6662h = nVar.C;
            this.f6663i = nVar.D;
            this.f6664j = nVar.E;
            this.f6665k = nVar.F;
            this.f6666l = nVar.G;
            this.f6667m = nVar.H;
            this.f6668n = nVar.I;
            this.f6669o = nVar.J;
            this.f6670p = nVar.K;
            this.f6671q = nVar.L;
            this.r = nVar.M;
            this.f6672s = nVar.N;
            this.f6673t = nVar.O;
            this.f6674u = nVar.P;
            this.f6675v = nVar.Q;
            this.f6676w = nVar.R;
            this.f6677x = nVar.S;
            this.f6678y = nVar.T;
            this.f6679z = nVar.U;
            this.A = nVar.V;
            this.B = nVar.W;
            this.C = nVar.X;
            this.D = nVar.Y;
        }
    }
}
