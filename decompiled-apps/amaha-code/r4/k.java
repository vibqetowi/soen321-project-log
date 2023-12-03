package r4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;
/* compiled from: DrawableTransformation.java */
/* loaded from: classes.dex */
public final class k implements h4.k<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final h4.k<Bitmap> f30414b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f30415c;

    public k(h4.k<Bitmap> kVar, boolean z10) {
        this.f30414b = kVar;
        this.f30415c = z10;
    }

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        this.f30414b.a(messageDigest);
    }

    @Override // h4.k
    public final k4.v b(com.bumptech.glide.c cVar, k4.v vVar, int i6, int i10) {
        l4.d dVar = Glide.b(cVar).f5924u;
        Drawable drawable = (Drawable) vVar.get();
        c a10 = j.a(dVar, drawable, i6, i10);
        if (a10 == null) {
            if (!this.f30415c) {
                return vVar;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        k4.v b10 = this.f30414b.b(cVar, a10, i6, i10);
        if (b10.equals(a10)) {
            b10.recycle();
            return vVar;
        }
        return new c(cVar.getResources(), b10);
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f30414b.equals(((k) obj).f30414b);
        }
        return false;
    }

    @Override // h4.e
    public final int hashCode() {
        return this.f30414b.hashCode();
    }
}
