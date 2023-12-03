package r4;

import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
/* compiled from: BitmapTransformation.java */
/* loaded from: classes.dex */
public abstract class d implements h4.k<Bitmap> {
    @Override // h4.k
    public final k4.v b(com.bumptech.glide.c cVar, k4.v vVar, int i6, int i10) {
        if (d5.j.f(i6, i10)) {
            l4.d dVar = Glide.b(cVar).f5924u;
            Bitmap bitmap = (Bitmap) vVar.get();
            if (i6 == Integer.MIN_VALUE) {
                i6 = bitmap.getWidth();
            }
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getHeight();
            }
            Bitmap c10 = c(dVar, bitmap, i6, i10);
            if (!bitmap.equals(c10)) {
                return c.c(c10, dVar);
            }
            return vVar;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i6 + " or height: " + i10 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(l4.d dVar, Bitmap bitmap, int i6, int i10);
}
