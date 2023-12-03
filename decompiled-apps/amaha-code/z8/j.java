package z8;

import android.os.Bundle;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.common.collect.l0;
import com.google.common.collect.n0;
import com.google.common.collect.s;
import com.google.common.collect.u;
/* compiled from: TrackSelectionParameters.java */
/* loaded from: classes.dex */
public class j implements com.google.android.exoplayer2.f {
    public final int C;
    public final int D;
    public final boolean E;
    public final s<String> F;
    public final s<String> G;
    public final int H;
    public final int I;
    public final int J;
    public final s<String> K;
    public final s<String> L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final i Q;
    public final u<Integer> R;

    /* renamed from: u  reason: collision with root package name */
    public final int f39325u;

    /* renamed from: v  reason: collision with root package name */
    public final int f39326v;

    /* renamed from: w  reason: collision with root package name */
    public final int f39327w;

    /* renamed from: x  reason: collision with root package name */
    public final int f39328x;

    /* renamed from: y  reason: collision with root package name */
    public final int f39329y = 0;

    /* renamed from: z  reason: collision with root package name */
    public final int f39330z = 0;
    public final int A = 0;
    public final int B = 0;

    /* compiled from: TrackSelectionParameters.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f39331a = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* renamed from: b  reason: collision with root package name */
        public final int f39332b = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* renamed from: c  reason: collision with root package name */
        public final int f39333c = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* renamed from: d  reason: collision with root package name */
        public final int f39334d = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* renamed from: e  reason: collision with root package name */
        public int f39335e = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        public int f = SubsamplingScaleImageView.TILE_SIZE_AUTO;

        /* renamed from: g  reason: collision with root package name */
        public boolean f39336g = true;

        /* renamed from: h  reason: collision with root package name */
        public final l0 f39337h;

        /* renamed from: i  reason: collision with root package name */
        public final l0 f39338i;

        /* renamed from: j  reason: collision with root package name */
        public final int f39339j;

        /* renamed from: k  reason: collision with root package name */
        public final int f39340k;

        /* renamed from: l  reason: collision with root package name */
        public final int f39341l;

        /* renamed from: m  reason: collision with root package name */
        public final l0 f39342m;

        /* renamed from: n  reason: collision with root package name */
        public l0 f39343n;

        /* renamed from: o  reason: collision with root package name */
        public int f39344o;

        /* renamed from: p  reason: collision with root package name */
        public final boolean f39345p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f39346q;
        public final boolean r;

        /* renamed from: s  reason: collision with root package name */
        public final i f39347s;

        /* renamed from: t  reason: collision with root package name */
        public final u<Integer> f39348t;

        @Deprecated
        public a() {
            s.b bVar = s.f9446v;
            l0 l0Var = l0.f9412y;
            this.f39337h = l0Var;
            this.f39338i = l0Var;
            this.f39339j = 0;
            this.f39340k = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.f39341l = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.f39342m = l0Var;
            this.f39343n = l0Var;
            this.f39344o = 0;
            this.f39345p = false;
            this.f39346q = false;
            this.r = false;
            this.f39347s = i.f39320v;
            int i6 = u.f9464w;
            this.f39348t = n0.D;
        }

        public a a(int i6, int i10) {
            this.f39335e = i6;
            this.f = i10;
            this.f39336g = true;
            return this;
        }
    }

    static {
        new j(new a());
    }

    public j(a aVar) {
        this.f39325u = aVar.f39331a;
        this.f39326v = aVar.f39332b;
        this.f39327w = aVar.f39333c;
        this.f39328x = aVar.f39334d;
        this.C = aVar.f39335e;
        this.D = aVar.f;
        this.E = aVar.f39336g;
        this.F = aVar.f39337h;
        this.G = aVar.f39338i;
        this.H = aVar.f39339j;
        this.I = aVar.f39340k;
        this.J = aVar.f39341l;
        this.K = aVar.f39342m;
        this.L = aVar.f39343n;
        this.M = aVar.f39344o;
        this.N = aVar.f39345p;
        this.O = aVar.f39346q;
        this.P = aVar.r;
        this.Q = aVar.f39347s;
        this.R = aVar.f39348t;
    }

    public static String b(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(6), this.f39325u);
        bundle.putInt(b(7), this.f39326v);
        bundle.putInt(b(8), this.f39327w);
        bundle.putInt(b(9), this.f39328x);
        bundle.putInt(b(10), this.f39329y);
        bundle.putInt(b(11), this.f39330z);
        bundle.putInt(b(12), this.A);
        bundle.putInt(b(13), this.B);
        bundle.putInt(b(14), this.C);
        bundle.putInt(b(15), this.D);
        bundle.putBoolean(b(16), this.E);
        bundle.putStringArray(b(17), (String[]) this.F.toArray(new String[0]));
        bundle.putStringArray(b(1), (String[]) this.G.toArray(new String[0]));
        bundle.putInt(b(2), this.H);
        bundle.putInt(b(18), this.I);
        bundle.putInt(b(19), this.J);
        bundle.putStringArray(b(20), (String[]) this.K.toArray(new String[0]));
        bundle.putStringArray(b(3), (String[]) this.L.toArray(new String[0]));
        bundle.putInt(b(4), this.M);
        bundle.putBoolean(b(5), this.N);
        bundle.putBoolean(b(21), this.O);
        bundle.putBoolean(b(22), this.P);
        bundle.putBundle(b(23), this.Q.a());
        bundle.putIntArray(b(25), qc.a.G(this.R));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f39325u == jVar.f39325u && this.f39326v == jVar.f39326v && this.f39327w == jVar.f39327w && this.f39328x == jVar.f39328x && this.f39329y == jVar.f39329y && this.f39330z == jVar.f39330z && this.A == jVar.A && this.B == jVar.B && this.E == jVar.E && this.C == jVar.C && this.D == jVar.D && this.F.equals(jVar.F) && this.G.equals(jVar.G) && this.H == jVar.H && this.I == jVar.I && this.J == jVar.J && this.K.equals(jVar.K) && this.L.equals(jVar.L) && this.M == jVar.M && this.N == jVar.N && this.O == jVar.O && this.P == jVar.P && this.Q.equals(jVar.Q) && this.R.equals(jVar.R)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.F.hashCode();
        int hashCode2 = this.G.hashCode();
        int hashCode3 = this.K.hashCode();
        int hashCode4 = this.L.hashCode();
        int hashCode5 = this.Q.hashCode();
        return this.R.hashCode() + ((hashCode5 + ((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((hashCode + ((((((((((((((((((((((this.f39325u + 31) * 31) + this.f39326v) * 31) + this.f39327w) * 31) + this.f39328x) * 31) + this.f39329y) * 31) + this.f39330z) * 31) + this.A) * 31) + this.B) * 31) + (this.E ? 1 : 0)) * 31) + this.C) * 31) + this.D) * 31)) * 31)) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31)) * 31)) * 31) + this.M) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31)) * 31);
    }
}
