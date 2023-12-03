package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import ub.d;
import ug.l;
import yb.f;
import yb.i;
import yb.j;
import yb.m;
/* loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements m {
    public final Paint A;
    public final Paint B;
    public final Path C;
    public ColorStateList D;
    public f E;
    public i F;
    public float G;
    public final Path H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public boolean O;

    /* renamed from: x  reason: collision with root package name */
    public final j f9080x;

    /* renamed from: y  reason: collision with root package name */
    public final RectF f9081y;

    /* renamed from: z  reason: collision with root package name */
    public final RectF f9082z;

    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f9083a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.F == null) {
                return;
            }
            if (shapeableImageView.E == null) {
                shapeableImageView.E = new f(shapeableImageView.F);
            }
            RectF rectF = shapeableImageView.f9081y;
            Rect rect = this.f9083a;
            rectF.round(rect);
            shapeableImageView.E.setBounds(rect);
            shapeableImageView.E.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, 0, 2132083876), attributeSet, 0);
        this.f9080x = j.a.f38485a;
        this.C = new Path();
        this.O = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.B = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f9081y = new RectF();
        this.f9082z = new RectF();
        this.H = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l.J, 0, 2132083876);
        setLayerType(2, null);
        this.D = d.a(context2, obtainStyledAttributes, 9);
        this.G = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.I = dimensionPixelSize;
        this.J = dimensionPixelSize;
        this.K = dimensionPixelSize;
        this.L = dimensionPixelSize;
        this.I = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.J = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.K = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.L = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.M = obtainStyledAttributes.getDimensionPixelSize(5, LinearLayoutManager.INVALID_OFFSET);
        this.N = obtainStyledAttributes.getDimensionPixelSize(2, LinearLayoutManager.INVALID_OFFSET);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.A = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.F = i.b(context2, attributeSet, 0, 2132083876).a();
        setOutlineProvider(new a());
    }

    public final boolean c() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void d(int i6, int i10) {
        RectF rectF = this.f9081y;
        rectF.set(getPaddingLeft(), getPaddingTop(), i6 - getPaddingRight(), i10 - getPaddingBottom());
        i iVar = this.F;
        Path path = this.C;
        this.f9080x.a(iVar, 1.0f, rectF, null, path);
        Path path2 = this.H;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f9082z;
        rectF2.set(0.0f, 0.0f, i6, i10);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.L;
    }

    public final int getContentPaddingEnd() {
        int i6 = this.N;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        if (c()) {
            return this.I;
        }
        return this.K;
    }

    public int getContentPaddingLeft() {
        boolean z10;
        int i6 = this.N;
        int i10 = this.M;
        if (i10 == Integer.MIN_VALUE && i6 == Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (c() && i6 != Integer.MIN_VALUE) {
                return i6;
            }
            if (!c() && i10 != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.I;
    }

    public int getContentPaddingRight() {
        boolean z10;
        int i6 = this.N;
        int i10 = this.M;
        if (i10 == Integer.MIN_VALUE && i6 == Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (c() && i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (!c() && i6 != Integer.MIN_VALUE) {
                return i6;
            }
        }
        return this.K;
    }

    public final int getContentPaddingStart() {
        int i6 = this.M;
        if (i6 != Integer.MIN_VALUE) {
            return i6;
        }
        if (c()) {
            return this.K;
        }
        return this.I;
    }

    public int getContentPaddingTop() {
        return this.J;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public i getShapeAppearanceModel() {
        return this.F;
    }

    public ColorStateList getStrokeColor() {
        return this.D;
    }

    public float getStrokeWidth() {
        return this.G;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.H, this.B);
        if (this.D != null) {
            Paint paint = this.A;
            paint.setStrokeWidth(this.G);
            int colorForState = this.D.getColorForState(getDrawableState(), this.D.getDefaultColor());
            if (this.G > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.C, paint);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        if (this.O || !isLayoutDirectionResolved()) {
            return;
        }
        boolean z10 = true;
        this.O = true;
        if (!isPaddingRelative()) {
            if (this.M == Integer.MIN_VALUE && this.N == Integer.MIN_VALUE) {
                z10 = false;
            }
            if (!z10) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                return;
            }
        }
        setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        d(i6, i10);
    }

    @Override // android.view.View
    public final void setPadding(int i6, int i10, int i11, int i12) {
        super.setPadding(getContentPaddingLeft() + i6, getContentPaddingTop() + i10, getContentPaddingRight() + i11, getContentPaddingBottom() + i12);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i6, int i10, int i11, int i12) {
        super.setPaddingRelative(getContentPaddingStart() + i6, getContentPaddingTop() + i10, getContentPaddingEnd() + i11, getContentPaddingBottom() + i12);
    }

    @Override // yb.m
    public void setShapeAppearanceModel(i iVar) {
        this.F = iVar;
        f fVar = this.E;
        if (fVar != null) {
            fVar.setShapeAppearanceModel(iVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i6) {
        setStrokeColor(g0.a.c(i6, getContext()));
    }

    public void setStrokeWidth(float f) {
        if (this.G != f) {
            this.G = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i6) {
        setStrokeWidth(getResources().getDimensionPixelSize(i6));
    }
}
