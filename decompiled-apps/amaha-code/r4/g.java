package r4;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
/* compiled from: CenterInside.java */
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f30395b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(h4.e.f17166a);

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f30395b);
    }

    @Override // r4.d
    public final Bitmap c(l4.d dVar, Bitmap bitmap, int i6, int i10) {
        Paint paint = s.f30441a;
        if (bitmap.getWidth() <= i6 && bitmap.getHeight() <= i10) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
                return bitmap;
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return s.b(dVar, bitmap, i6, i10);
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        return obj instanceof g;
    }

    @Override // h4.e
    public final int hashCode() {
        return -670243078;
    }
}
