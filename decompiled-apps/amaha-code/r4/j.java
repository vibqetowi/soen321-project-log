package r4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30413a = new a();

    public static c a(l4.d dVar, Drawable drawable, int i6, int i10) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i6 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
            } else if (i10 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i6 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i10 = current.getIntrinsicHeight();
                }
                Lock lock = s.f30442b;
                lock.lock();
                Bitmap e10 = dVar.e(i6, i10, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(e10);
                    current.setBounds(0, 0, i6, i10);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = e10;
                    z10 = true;
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            }
            bitmap = null;
            z10 = true;
        } else {
            bitmap = null;
        }
        if (!z10) {
            dVar = f30413a;
        }
        return c.c(bitmap, dVar);
    }

    /* compiled from: DrawableToBitmapConverter.java */
    /* loaded from: classes.dex */
    public class a extends l4.e {
        @Override // l4.e, l4.d
        public final void d(Bitmap bitmap) {
        }
    }
}
