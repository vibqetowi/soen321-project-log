package j6;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* compiled from: ShimmerDrawable.java */
/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final C0322a f21683a = new C0322a();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f21684b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f21685c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f21686d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f21687e;
    public com.facebook.shimmer.a f;

    /* compiled from: ShimmerDrawable.java */
    /* renamed from: j6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0322a implements ValueAnimator.AnimatorUpdateListener {
        public C0322a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.invalidateSelf();
        }
    }

    public a() {
        Paint paint = new Paint();
        this.f21684b = paint;
        this.f21685c = new Rect();
        this.f21686d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        com.facebook.shimmer.a aVar;
        ValueAnimator valueAnimator = this.f21687e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (aVar = this.f) != null && aVar.f6127o && getCallback() != null) {
            this.f21687e.start();
        }
    }

    public final void b() {
        com.facebook.shimmer.a aVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (aVar = this.f) != null) {
            int i6 = aVar.f6119g;
            if (i6 <= 0) {
                i6 = Math.round(aVar.f6121i * width);
            }
            com.facebook.shimmer.a aVar2 = this.f;
            int i10 = aVar2.f6120h;
            if (i10 <= 0) {
                i10 = Math.round(aVar2.f6122j * height);
            }
            com.facebook.shimmer.a aVar3 = this.f;
            boolean z10 = true;
            if (aVar3.f != 1) {
                int i11 = aVar3.f6116c;
                if (i11 != 1 && i11 != 3) {
                    z10 = false;
                }
                if (z10) {
                    i6 = 0;
                }
                if (!z10) {
                    i10 = 0;
                }
                com.facebook.shimmer.a aVar4 = this.f;
                radialGradient = new LinearGradient(0.0f, 0.0f, i6, i10, aVar4.f6115b, aVar4.f6114a, Shader.TileMode.CLAMP);
            } else {
                com.facebook.shimmer.a aVar5 = this.f;
                radialGradient = new RadialGradient(i6 / 2.0f, i10 / 2.0f, (float) (Math.max(i6, i10) / Math.sqrt(2.0d)), aVar5.f6115b, aVar5.f6114a, Shader.TileMode.CLAMP);
            }
            this.f21684b.setShader(radialGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float e10;
        float e11;
        if (this.f != null) {
            Paint paint = this.f21684b;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians(this.f.f6125m));
                Rect rect = this.f21685c;
                float width = (rect.width() * tan) + rect.height();
                float height = (tan * rect.height()) + rect.width();
                ValueAnimator valueAnimator = this.f21687e;
                float f2 = 0.0f;
                if (valueAnimator != null) {
                    f = valueAnimator.getAnimatedFraction();
                } else {
                    f = 0.0f;
                }
                int i6 = this.f.f6116c;
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            float f10 = -height;
                            e11 = e.e(height, f10, f, f10);
                        } else {
                            e10 = e.e(-width, width, f, width);
                        }
                    } else {
                        e11 = e.e(-height, height, f, height);
                    }
                    f2 = e11;
                    e10 = 0.0f;
                } else {
                    float f11 = -width;
                    e10 = e.e(width, f11, f, f11);
                }
                Matrix matrix = this.f21686d;
                matrix.reset();
                matrix.setRotate(this.f.f6125m, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(f2, e10);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        com.facebook.shimmer.a aVar = this.f;
        if (aVar != null && (aVar.f6126n || aVar.f6128p)) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f21685c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
