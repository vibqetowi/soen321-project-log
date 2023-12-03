package p8;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;
/* compiled from: Cue.java */
/* loaded from: classes.dex */
public final class a implements com.google.android.exoplayer2.f {
    public static final a L;
    public static final p7.e M;
    public final int A;
    public final float B;
    public final int C;
    public final float D;
    public final float E;
    public final boolean F;
    public final int G;
    public final int H;
    public final float I;
    public final int J;
    public final float K;

    /* renamed from: u  reason: collision with root package name */
    public final CharSequence f27983u;

    /* renamed from: v  reason: collision with root package name */
    public final Layout.Alignment f27984v;

    /* renamed from: w  reason: collision with root package name */
    public final Layout.Alignment f27985w;

    /* renamed from: x  reason: collision with root package name */
    public final Bitmap f27986x;

    /* renamed from: y  reason: collision with root package name */
    public final float f27987y;

    /* renamed from: z  reason: collision with root package name */
    public final int f27988z;

    static {
        C0467a c0467a = new C0467a();
        c0467a.f27989a = "";
        L = c0467a.a();
        M = new p7.e(21);
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i6, int i10, float f2, int i11, int i12, float f10, float f11, float f12, boolean z10, int i13, int i14, float f13) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            sc.b.q(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f27983u = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f27983u = charSequence.toString();
        } else {
            this.f27983u = null;
        }
        this.f27984v = alignment;
        this.f27985w = alignment2;
        this.f27986x = bitmap;
        this.f27987y = f;
        this.f27988z = i6;
        this.A = i10;
        this.B = f2;
        this.C = i11;
        this.D = f11;
        this.E = f12;
        this.F = z10;
        this.G = i13;
        this.H = i12;
        this.I = f10;
        this.J = i14;
        this.K = f13;
    }

    public static String b(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(b(0), this.f27983u);
        bundle.putSerializable(b(1), this.f27984v);
        bundle.putSerializable(b(2), this.f27985w);
        bundle.putParcelable(b(3), this.f27986x);
        bundle.putFloat(b(4), this.f27987y);
        bundle.putInt(b(5), this.f27988z);
        bundle.putInt(b(6), this.A);
        bundle.putFloat(b(7), this.B);
        bundle.putInt(b(8), this.C);
        bundle.putInt(b(9), this.H);
        bundle.putFloat(b(10), this.I);
        bundle.putFloat(b(11), this.D);
        bundle.putFloat(b(12), this.E);
        bundle.putBoolean(b(14), this.F);
        bundle.putInt(b(13), this.G);
        bundle.putInt(b(15), this.J);
        bundle.putFloat(b(16), this.K);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (TextUtils.equals(this.f27983u, aVar.f27983u) && this.f27984v == aVar.f27984v && this.f27985w == aVar.f27985w) {
            Bitmap bitmap = aVar.f27986x;
            Bitmap bitmap2 = this.f27986x;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f27987y == aVar.f27987y && this.f27988z == aVar.f27988z && this.A == aVar.A && this.B == aVar.B && this.C == aVar.C && this.D == aVar.D && this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I && this.J == aVar.J && this.K == aVar.K) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27983u, this.f27984v, this.f27985w, this.f27986x, Float.valueOf(this.f27987y), Integer.valueOf(this.f27988z), Integer.valueOf(this.A), Float.valueOf(this.B), Integer.valueOf(this.C), Float.valueOf(this.D), Float.valueOf(this.E), Boolean.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H), Float.valueOf(this.I), Integer.valueOf(this.J), Float.valueOf(this.K)});
    }

    /* compiled from: Cue.java */
    /* renamed from: p8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0467a {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f27989a;

        /* renamed from: b  reason: collision with root package name */
        public Bitmap f27990b;

        /* renamed from: c  reason: collision with root package name */
        public Layout.Alignment f27991c;

        /* renamed from: d  reason: collision with root package name */
        public Layout.Alignment f27992d;

        /* renamed from: e  reason: collision with root package name */
        public float f27993e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f27994g;

        /* renamed from: h  reason: collision with root package name */
        public float f27995h;

        /* renamed from: i  reason: collision with root package name */
        public int f27996i;

        /* renamed from: j  reason: collision with root package name */
        public int f27997j;

        /* renamed from: k  reason: collision with root package name */
        public float f27998k;

        /* renamed from: l  reason: collision with root package name */
        public float f27999l;

        /* renamed from: m  reason: collision with root package name */
        public float f28000m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f28001n;

        /* renamed from: o  reason: collision with root package name */
        public int f28002o;

        /* renamed from: p  reason: collision with root package name */
        public int f28003p;

        /* renamed from: q  reason: collision with root package name */
        public float f28004q;

        public C0467a() {
            this.f27989a = null;
            this.f27990b = null;
            this.f27991c = null;
            this.f27992d = null;
            this.f27993e = -3.4028235E38f;
            this.f = LinearLayoutManager.INVALID_OFFSET;
            this.f27994g = LinearLayoutManager.INVALID_OFFSET;
            this.f27995h = -3.4028235E38f;
            this.f27996i = LinearLayoutManager.INVALID_OFFSET;
            this.f27997j = LinearLayoutManager.INVALID_OFFSET;
            this.f27998k = -3.4028235E38f;
            this.f27999l = -3.4028235E38f;
            this.f28000m = -3.4028235E38f;
            this.f28001n = false;
            this.f28002o = -16777216;
            this.f28003p = LinearLayoutManager.INVALID_OFFSET;
        }

        public final a a() {
            return new a(this.f27989a, this.f27991c, this.f27992d, this.f27990b, this.f27993e, this.f, this.f27994g, this.f27995h, this.f27996i, this.f27997j, this.f27998k, this.f27999l, this.f28000m, this.f28001n, this.f28002o, this.f28003p, this.f28004q);
        }

        public C0467a(a aVar) {
            this.f27989a = aVar.f27983u;
            this.f27990b = aVar.f27986x;
            this.f27991c = aVar.f27984v;
            this.f27992d = aVar.f27985w;
            this.f27993e = aVar.f27987y;
            this.f = aVar.f27988z;
            this.f27994g = aVar.A;
            this.f27995h = aVar.B;
            this.f27996i = aVar.C;
            this.f27997j = aVar.H;
            this.f27998k = aVar.I;
            this.f27999l = aVar.D;
            this.f28000m = aVar.E;
            this.f28001n = aVar.F;
            this.f28002o = aVar.G;
            this.f28003p = aVar.J;
            this.f28004q = aVar.K;
        }
    }
}
