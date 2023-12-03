package f5;

import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.i;
/* compiled from: CropImageAnimation.kt */
/* loaded from: classes.dex */
public final class e extends Animation implements Animation.AnimationListener {
    public final ImageView A;
    public final CropOverlayView B;

    /* renamed from: u  reason: collision with root package name */
    public final float[] f14817u;

    /* renamed from: v  reason: collision with root package name */
    public final float[] f14818v;

    /* renamed from: w  reason: collision with root package name */
    public final RectF f14819w;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f14820x;

    /* renamed from: y  reason: collision with root package name */
    public final float[] f14821y;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f14822z;

    public e(ImageView imageView, CropOverlayView cropOverlayView) {
        i.g(imageView, "imageView");
        i.g(cropOverlayView, "cropOverlayView");
        this.A = imageView;
        this.B = cropOverlayView;
        this.f14817u = new float[8];
        this.f14818v = new float[8];
        this.f14819w = new RectF();
        this.f14820x = new RectF();
        this.f14821y = new float[9];
        this.f14822z = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation t3) {
        i.g(t3, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f14819w;
        float f2 = rectF2.left;
        RectF rectF3 = this.f14820x;
        rectF.left = defpackage.e.e(rectF3.left, f2, f, f2);
        float f10 = rectF2.top;
        rectF.top = defpackage.e.e(rectF3.top, f10, f, f10);
        float f11 = rectF2.right;
        rectF.right = defpackage.e.e(rectF3.right, f11, f, f11);
        float f12 = rectF2.bottom;
        rectF.bottom = defpackage.e.e(rectF3.bottom, f12, f, f12);
        float[] fArr = new float[8];
        for (int i6 = 0; i6 < 8; i6++) {
            float f13 = this.f14817u[i6];
            fArr[i6] = defpackage.e.e(this.f14818v[i6], f13, f, f13);
        }
        CropOverlayView cropOverlayView = this.B;
        cropOverlayView.setCropWindowRect(rectF);
        ImageView imageView = this.A;
        cropOverlayView.g(fArr, imageView.getWidth(), imageView.getHeight());
        cropOverlayView.invalidate();
        float[] fArr2 = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            float f14 = this.f14821y[i10];
            fArr2[i10] = defpackage.e.e(this.f14822z[i10], f14, f, f14);
        }
        imageView.getImageMatrix().setValues(fArr2);
        imageView.invalidate();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        i.g(animation, "animation");
        this.A.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        i.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        i.g(animation, "animation");
    }
}
