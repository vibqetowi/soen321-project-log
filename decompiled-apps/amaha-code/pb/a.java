package pb;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import yb.i;
import yb.j;
/* compiled from: BorderDrawable.java */
/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: b  reason: collision with root package name */
    public final Paint f28083b;

    /* renamed from: h  reason: collision with root package name */
    public float f28088h;

    /* renamed from: i  reason: collision with root package name */
    public int f28089i;

    /* renamed from: j  reason: collision with root package name */
    public int f28090j;

    /* renamed from: k  reason: collision with root package name */
    public int f28091k;

    /* renamed from: l  reason: collision with root package name */
    public int f28092l;

    /* renamed from: m  reason: collision with root package name */
    public int f28093m;

    /* renamed from: o  reason: collision with root package name */
    public i f28095o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f28096p;

    /* renamed from: a  reason: collision with root package name */
    public final j f28082a = j.a.f38485a;

    /* renamed from: c  reason: collision with root package name */
    public final Path f28084c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f28085d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f28086e = new RectF();
    public final RectF f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final C0468a f28087g = new C0468a();

    /* renamed from: n  reason: collision with root package name */
    public boolean f28094n = true;

    /* compiled from: BorderDrawable.java */
    /* renamed from: pb.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0468a extends Drawable.ConstantState {
        public C0468a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return a.this;
        }
    }

    public a(i iVar) {
        this.f28095o = iVar;
        Paint paint = new Paint(1);
        this.f28083b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.f28094n;
        Paint paint = this.f28083b;
        Rect rect = this.f28085d;
        if (z10) {
            copyBounds(rect);
            float height = this.f28088h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{j0.d.f(this.f28089i, this.f28093m), j0.d.f(this.f28090j, this.f28093m), j0.d.f(j0.d.h(this.f28090j, 0), this.f28093m), j0.d.f(j0.d.h(this.f28092l, 0), this.f28093m), j0.d.f(this.f28092l, this.f28093m), j0.d.f(this.f28091k, this.f28093m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f28094n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f28086e;
        rectF.set(rect);
        yb.c cVar = this.f28095o.f38456e;
        RectF rectF2 = this.f;
        rectF2.set(getBounds());
        float min = Math.min(cVar.a(rectF2), rectF.width() / 2.0f);
        i iVar = this.f28095o;
        rectF2.set(getBounds());
        if (iVar.d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f28087g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f28088h > 0.0f) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        i iVar = this.f28095o;
        RectF rectF = this.f;
        rectF.set(getBounds());
        if (iVar.d(rectF)) {
            yb.c cVar = this.f28095o.f38456e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cVar.a(rectF));
            return;
        }
        Rect rect = this.f28085d;
        copyBounds(rect);
        RectF rectF2 = this.f28086e;
        rectF2.set(rect);
        i iVar2 = this.f28095o;
        Path path = this.f28084c;
        this.f28082a.a(iVar2, 1.0f, rectF2, null, path);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            outline.setPath(path);
        } else if (i6 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        i iVar = this.f28095o;
        RectF rectF = this.f;
        rectF.set(getBounds());
        if (iVar.d(rectF)) {
            int round = Math.round(this.f28088h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f28096p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f28094n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f28096p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f28093m)) != this.f28093m) {
            this.f28094n = true;
            this.f28093m = colorForState;
        }
        if (this.f28094n) {
            invalidateSelf();
        }
        return this.f28094n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.f28083b.setAlpha(i6);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28083b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
