package z4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import d5.j;
import h4.k;
import k4.l;
import r4.h;
import z4.a;
/* compiled from: BaseRequestOptions.java */
/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    public Drawable A;
    public int B;
    public boolean G;
    public Drawable I;
    public int J;
    public boolean N;
    public Resources.Theme O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean T;

    /* renamed from: u  reason: collision with root package name */
    public int f39154u;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f39158y;

    /* renamed from: z  reason: collision with root package name */
    public int f39159z;

    /* renamed from: v  reason: collision with root package name */
    public float f39155v = 1.0f;

    /* renamed from: w  reason: collision with root package name */
    public l f39156w = l.f22880c;

    /* renamed from: x  reason: collision with root package name */
    public com.bumptech.glide.d f39157x = com.bumptech.glide.d.NORMAL;
    public boolean C = true;
    public int D = -1;
    public int E = -1;
    public h4.e F = c5.c.f4987b;
    public boolean H = true;
    public h4.g K = new h4.g();
    public d5.b L = new d5.b();
    public Class<?> M = Object.class;
    public boolean S = true;

    public static boolean h(int i6, int i10) {
        if ((i6 & i10) != 0) {
            return true;
        }
        return false;
    }

    public T a(a<?> aVar) {
        if (this.P) {
            return (T) clone().a(aVar);
        }
        if (h(aVar.f39154u, 2)) {
            this.f39155v = aVar.f39155v;
        }
        if (h(aVar.f39154u, 262144)) {
            this.Q = aVar.Q;
        }
        if (h(aVar.f39154u, 1048576)) {
            this.T = aVar.T;
        }
        if (h(aVar.f39154u, 4)) {
            this.f39156w = aVar.f39156w;
        }
        if (h(aVar.f39154u, 8)) {
            this.f39157x = aVar.f39157x;
        }
        if (h(aVar.f39154u, 16)) {
            this.f39158y = aVar.f39158y;
            this.f39159z = 0;
            this.f39154u &= -33;
        }
        if (h(aVar.f39154u, 32)) {
            this.f39159z = aVar.f39159z;
            this.f39158y = null;
            this.f39154u &= -17;
        }
        if (h(aVar.f39154u, 64)) {
            this.A = aVar.A;
            this.B = 0;
            this.f39154u &= -129;
        }
        if (h(aVar.f39154u, 128)) {
            this.B = aVar.B;
            this.A = null;
            this.f39154u &= -65;
        }
        if (h(aVar.f39154u, 256)) {
            this.C = aVar.C;
        }
        if (h(aVar.f39154u, 512)) {
            this.E = aVar.E;
            this.D = aVar.D;
        }
        if (h(aVar.f39154u, Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID)) {
            this.F = aVar.F;
        }
        if (h(aVar.f39154u, 4096)) {
            this.M = aVar.M;
        }
        if (h(aVar.f39154u, 8192)) {
            this.I = aVar.I;
            this.J = 0;
            this.f39154u &= -16385;
        }
        if (h(aVar.f39154u, 16384)) {
            this.J = aVar.J;
            this.I = null;
            this.f39154u &= -8193;
        }
        if (h(aVar.f39154u, 32768)) {
            this.O = aVar.O;
        }
        if (h(aVar.f39154u, 65536)) {
            this.H = aVar.H;
        }
        if (h(aVar.f39154u, 131072)) {
            this.G = aVar.G;
        }
        if (h(aVar.f39154u, Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID)) {
            this.L.putAll(aVar.L);
            this.S = aVar.S;
        }
        if (h(aVar.f39154u, 524288)) {
            this.R = aVar.R;
        }
        if (!this.H) {
            this.L.clear();
            this.G = false;
            this.f39154u = this.f39154u & (-2049) & (-131073);
            this.S = true;
        }
        this.f39154u |= aVar.f39154u;
        this.K.f17172b.j(aVar.K.f17172b);
        m();
        return this;
    }

    @Override // 
    /* renamed from: b */
    public T clone() {
        try {
            T t3 = (T) super.clone();
            h4.g gVar = new h4.g();
            t3.K = gVar;
            gVar.f17172b.j(this.K.f17172b);
            d5.b bVar = new d5.b();
            t3.L = bVar;
            bVar.putAll(this.L);
            t3.N = false;
            t3.P = false;
            return t3;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final T c(Class<?> cls) {
        if (this.P) {
            return (T) clone().c(cls);
        }
        this.M = cls;
        this.f39154u |= 4096;
        m();
        return this;
    }

    public final T d(l lVar) {
        if (this.P) {
            return (T) clone().d(lVar);
        }
        kc.f.p(lVar);
        this.f39156w = lVar;
        this.f39154u |= 4;
        m();
        return this;
    }

    public final T e(int i6) {
        if (this.P) {
            return (T) clone().e(i6);
        }
        this.f39159z = i6;
        this.f39158y = null;
        this.f39154u = (this.f39154u | 32) & (-17);
        m();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.compare(aVar.f39155v, this.f39155v) == 0 && this.f39159z == aVar.f39159z && j.a(this.f39158y, aVar.f39158y) && this.B == aVar.B && j.a(this.A, aVar.A) && this.J == aVar.J && j.a(this.I, aVar.I) && this.C == aVar.C && this.D == aVar.D && this.E == aVar.E && this.G == aVar.G && this.H == aVar.H && this.Q == aVar.Q && this.R == aVar.R && this.f39156w.equals(aVar.f39156w) && this.f39157x == aVar.f39157x && this.K.equals(aVar.K) && this.L.equals(aVar.L) && this.M.equals(aVar.M) && j.a(this.F, aVar.F) && j.a(this.O, aVar.O)) {
                return true;
            }
        }
        return false;
    }

    public final a f() {
        if (this.P) {
            return clone().f();
        }
        this.J = R.drawable.ic_stat_notification_amaha;
        this.I = null;
        this.f39154u = (this.f39154u | 16384) & (-8193);
        m();
        return this;
    }

    public final int hashCode() {
        float f = this.f39155v;
        char[] cArr = j.f12201a;
        return j.e(j.e(j.e(j.e(j.e(j.e(j.e((((((((((((((j.e((j.e((j.e(((Float.floatToIntBits(f) + 527) * 31) + this.f39159z, this.f39158y) * 31) + this.B, this.A) * 31) + this.J, this.I) * 31) + (this.C ? 1 : 0)) * 31) + this.D) * 31) + this.E) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0), this.f39156w), this.f39157x), this.K), this.L), this.M), this.F), this.O);
    }

    public final a i(r4.h hVar, r4.d dVar) {
        if (this.P) {
            return clone().i(hVar, dVar);
        }
        h4.f fVar = r4.h.f;
        kc.f.p(hVar);
        n(fVar, hVar);
        return r(dVar, false);
    }

    public final T j(int i6, int i10) {
        if (this.P) {
            return (T) clone().j(i6, i10);
        }
        this.E = i6;
        this.D = i10;
        this.f39154u |= 512;
        m();
        return this;
    }

    public final T k(int i6) {
        if (this.P) {
            return (T) clone().k(i6);
        }
        this.B = i6;
        this.A = null;
        this.f39154u = (this.f39154u | 128) & (-65);
        m();
        return this;
    }

    public final a l() {
        com.bumptech.glide.d dVar = com.bumptech.glide.d.LOW;
        if (this.P) {
            return clone().l();
        }
        this.f39157x = dVar;
        this.f39154u |= 8;
        m();
        return this;
    }

    public final void m() {
        if (!this.N) {
            return;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final <Y> T n(h4.f<Y> fVar, Y y10) {
        if (this.P) {
            return (T) clone().n(fVar, y10);
        }
        kc.f.p(fVar);
        kc.f.p(y10);
        this.K.f17172b.put(fVar, y10);
        m();
        return this;
    }

    public final T p(h4.e eVar) {
        if (this.P) {
            return (T) clone().p(eVar);
        }
        this.F = eVar;
        this.f39154u |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
        m();
        return this;
    }

    public final T q(boolean z10) {
        if (this.P) {
            return (T) clone().q(true);
        }
        this.C = !z10;
        this.f39154u |= 256;
        m();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T r(k<Bitmap> kVar, boolean z10) {
        if (this.P) {
            return (T) clone().r(kVar, z10);
        }
        r4.k kVar2 = new r4.k(kVar, z10);
        t(Bitmap.class, kVar, z10);
        t(Drawable.class, kVar2, z10);
        t(BitmapDrawable.class, kVar2, z10);
        t(GifDrawable.class, new u4.c(kVar), z10);
        m();
        return this;
    }

    public final <Y> T t(Class<Y> cls, k<Y> kVar, boolean z10) {
        if (this.P) {
            return (T) clone().t(cls, kVar, z10);
        }
        kc.f.p(kVar);
        this.L.put(cls, kVar);
        int i6 = this.f39154u | Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
        this.H = true;
        int i10 = i6 | 65536;
        this.f39154u = i10;
        this.S = false;
        if (z10) {
            this.f39154u = i10 | 131072;
            this.G = true;
        }
        m();
        return this;
    }

    public final a u(h.d dVar, r4.f fVar) {
        if (this.P) {
            return clone().u(dVar, fVar);
        }
        h4.f fVar2 = r4.h.f;
        kc.f.p(dVar);
        n(fVar2, dVar);
        return r(fVar, true);
    }

    public final a v() {
        if (this.P) {
            return clone().v();
        }
        this.T = true;
        this.f39154u |= 1048576;
        m();
        return this;
    }
}
