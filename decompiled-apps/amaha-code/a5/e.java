package a5;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: ImageViewTarget.java */
/* loaded from: classes.dex */
public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: x  reason: collision with root package name */
    public Animatable f317x;

    public e(ImageView imageView) {
        super(imageView);
    }

    public final void a(Z z10) {
        b bVar = (b) this;
        int i6 = bVar.f306y;
        T t3 = bVar.f320v;
        switch (i6) {
            case 0:
                ((ImageView) t3).setImageBitmap((Bitmap) z10);
                break;
            default:
                ((ImageView) t3).setImageDrawable((Drawable) z10);
                break;
        }
        if (z10 instanceof Animatable) {
            Animatable animatable = (Animatable) z10;
            this.f317x = animatable;
            animatable.start();
            return;
        }
        this.f317x = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a5.h
    public final void f(Object obj) {
        a(obj);
    }

    @Override // a5.a, a5.h
    public final void h(Drawable drawable) {
        a(null);
        ((ImageView) this.f320v).setImageDrawable(drawable);
    }

    @Override // a5.a, w4.g
    public final void i() {
        Animatable animatable = this.f317x;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // a5.a, a5.h
    public final void k(Drawable drawable) {
        a(null);
        ((ImageView) this.f320v).setImageDrawable(drawable);
    }

    @Override // a5.i, a5.a, a5.h
    public final void m(Drawable drawable) {
        super.m(drawable);
        Animatable animatable = this.f317x;
        if (animatable != null) {
            animatable.stop();
        }
        a(null);
        ((ImageView) this.f320v).setImageDrawable(drawable);
    }

    @Override // a5.a, w4.g
    public final void n() {
        Animatable animatable = this.f317x;
        if (animatable != null) {
            animatable.start();
        }
    }
}
