package r4;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
/* compiled from: CenterCrop.java */
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f30394b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(h4.e.f17166a);

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f30394b);
    }

    @Override // r4.d
    public final Bitmap c(l4.d dVar, Bitmap bitmap, int i6, int i10) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = s.f30441a;
        if (bitmap.getWidth() != i6 || bitmap.getHeight() != i10) {
            Matrix matrix = new Matrix();
            float f = 0.0f;
            if (bitmap.getWidth() * i10 > bitmap.getHeight() * i6) {
                width = i10 / bitmap.getHeight();
                f = (i6 - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i6 / bitmap.getWidth();
                height = (i10 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap e10 = dVar.e(i6, i10, config);
            e10.setHasAlpha(bitmap.hasAlpha());
            s.a(bitmap, e10, matrix);
            return e10;
        }
        return bitmap;
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        return obj instanceof f;
    }

    @Override // h4.e
    public final int hashCode() {
        return -599754482;
    }
}
