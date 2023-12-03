package r4;

import android.graphics.Bitmap;
import java.security.MessageDigest;
/* compiled from: FitCenter.java */
/* loaded from: classes.dex */
public final class m extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f30416b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(h4.e.f17166a);

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f30416b);
    }

    @Override // r4.d
    public final Bitmap c(l4.d dVar, Bitmap bitmap, int i6, int i10) {
        return s.b(dVar, bitmap, i6, i10);
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        return obj instanceof m;
    }

    @Override // h4.e
    public final int hashCode() {
        return 1572326941;
    }
}
