package t4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.f;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.a;
/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f32407v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Drawable drawable, int i6) {
        super(drawable);
        this.f32407v = i6;
    }

    @Override // k4.v
    public final int a() {
        int i6 = this.f32407v;
        T t3 = this.f32406u;
        switch (i6) {
            case 0:
                return Math.max(1, t3.getIntrinsicHeight() * t3.getIntrinsicWidth() * 4);
            default:
                com.bumptech.glide.load.resource.gif.a aVar = ((GifDrawable) t3).f5980u.f5986a;
                return aVar.f5987a.f() + aVar.f6000o;
        }
    }

    @Override // k4.v
    public final Class b() {
        switch (this.f32407v) {
            case 0:
                return this.f32406u.getClass();
            default:
                return GifDrawable.class;
        }
    }

    @Override // k4.r
    public final void initialize() {
        int i6 = this.f32407v;
        T t3 = this.f32406u;
        switch (i6) {
            case 1:
                ((GifDrawable) t3).f5980u.f5986a.f5997l.prepareToDraw();
                return;
            default:
                if (t3 instanceof BitmapDrawable) {
                    ((BitmapDrawable) t3).getBitmap().prepareToDraw();
                    return;
                } else if (t3 instanceof GifDrawable) {
                    ((GifDrawable) t3).f5980u.f5986a.f5997l.prepareToDraw();
                    return;
                } else {
                    return;
                }
        }
    }

    @Override // k4.v
    public final void recycle() {
        switch (this.f32407v) {
            case 0:
                return;
            default:
                GifDrawable gifDrawable = (GifDrawable) this.f32406u;
                gifDrawable.stop();
                gifDrawable.f5983x = true;
                com.bumptech.glide.load.resource.gif.a aVar = gifDrawable.f5980u.f5986a;
                aVar.f5989c.clear();
                Bitmap bitmap = aVar.f5997l;
                if (bitmap != null) {
                    aVar.f5991e.d(bitmap);
                    aVar.f5997l = null;
                }
                aVar.f = false;
                a.C0127a c0127a = aVar.f5994i;
                f fVar = aVar.f5990d;
                if (c0127a != null) {
                    fVar.b(c0127a);
                    aVar.f5994i = null;
                }
                a.C0127a c0127a2 = aVar.f5996k;
                if (c0127a2 != null) {
                    fVar.b(c0127a2);
                    aVar.f5996k = null;
                }
                a.C0127a c0127a3 = aVar.f5999n;
                if (c0127a3 != null) {
                    fVar.b(c0127a3);
                    aVar.f5999n = null;
                }
                aVar.f5987a.clear();
                aVar.f5995j = true;
                return;
        }
    }
}
