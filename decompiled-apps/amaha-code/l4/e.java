package l4;

import android.graphics.Bitmap;
/* compiled from: BitmapPoolAdapter.java */
/* loaded from: classes.dex */
public class e implements d {
    @Override // l4.d
    public final Bitmap c(int i6, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i6, i10, config);
    }

    @Override // l4.d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // l4.d
    public final Bitmap e(int i6, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i6, i10, config);
    }

    @Override // l4.d
    public final void b() {
    }

    @Override // l4.d
    public final void a(int i6) {
    }
}
