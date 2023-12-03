package u4;

import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import h4.k;
import java.security.MessageDigest;
import k4.v;
import kc.f;
/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes.dex */
public final class c implements k<GifDrawable> {

    /* renamed from: b  reason: collision with root package name */
    public final k<Bitmap> f33802b;

    public c(k<Bitmap> kVar) {
        f.p(kVar);
        this.f33802b = kVar;
    }

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        this.f33802b.a(messageDigest);
    }

    @Override // h4.k
    public final v b(com.bumptech.glide.c cVar, v vVar, int i6, int i10) {
        GifDrawable gifDrawable = (GifDrawable) vVar.get();
        r4.c cVar2 = new r4.c(gifDrawable.f5980u.f5986a.f5997l, Glide.b(cVar).f5924u);
        k<Bitmap> kVar = this.f33802b;
        v b10 = kVar.b(cVar, cVar2, i6, i10);
        if (!cVar2.equals(b10)) {
            cVar2.recycle();
        }
        gifDrawable.f5980u.f5986a.c(kVar, (Bitmap) b10.get());
        return vVar;
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f33802b.equals(((c) obj).f33802b);
        }
        return false;
    }

    @Override // h4.e
    public final int hashCode() {
        return this.f33802b.hashCode();
    }
}
