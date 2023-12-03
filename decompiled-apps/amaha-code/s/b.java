package s;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: RoundRectDrawable.java */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f31052a;

    /* renamed from: c  reason: collision with root package name */
    public final RectF f31054c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f31055d;

    /* renamed from: e  reason: collision with root package name */
    public float f31056e;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f31058h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuffColorFilter f31059i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f31060j;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f31057g = true;

    /* renamed from: k  reason: collision with root package name */
    public PorterDuff.Mode f31061k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f31053b = new Paint(5);

    public b(float f, ColorStateList colorStateList) {
        this.f31052a = f;
        b(colorStateList);
        this.f31054c = new RectF();
        this.f31055d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f31058h = colorStateList;
        this.f31053b.setColor(colorStateList.getColorForState(getState(), this.f31058h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f31054c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f31055d;
        rect2.set(rect);
        if (this.f) {
            float a10 = c.a(this.f31056e, this.f31052a, this.f31057g);
            float f = this.f31056e;
            float f2 = this.f31052a;
            if (this.f31057g) {
                f = (float) (((1.0d - c.f31062a) * f2) + f);
            }
            rect2.inset((int) Math.ceil(f), (int) Math.ceil(a10));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f31053b;
        if (this.f31059i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f31059i);
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF = this.f31054c;
        float f = this.f31052a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f31055d, this.f31052a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f31060j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f31058h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f31058h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f31053b;
        if (colorForState != paint.getColor()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f31060j;
        if (colorStateList2 != null && (mode = this.f31061k) != null) {
            this.f31059i = a(colorStateList2, mode);
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f31053b.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31053b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f31060j = colorStateList;
        this.f31059i = a(colorStateList, this.f31061k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f31061k = mode;
        this.f31059i = a(this.f31060j, mode);
        invalidateSelf();
    }
}
