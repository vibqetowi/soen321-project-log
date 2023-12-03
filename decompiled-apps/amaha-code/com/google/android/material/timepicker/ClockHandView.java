package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.k;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import qb.w;
import t0.d0;
import t0.o0;
import ug.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public final RectF A;
    public final int B;
    public float C;
    public boolean D;
    public double E;
    public int F;
    public int G;

    /* renamed from: u  reason: collision with root package name */
    public final ValueAnimator f9306u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9307v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f9308w;

    /* renamed from: x  reason: collision with root package name */
    public final int f9309x;

    /* renamed from: y  reason: collision with root package name */
    public final float f9310y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f9311z;

    /* loaded from: classes.dex */
    public interface a {
        void a(float f);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f9306u = new ValueAnimator();
        this.f9308w = new ArrayList();
        Paint paint = new Paint();
        this.f9311z = paint;
        this.A = new RectF();
        this.G = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f34127j, R.attr.materialClockStyle, 2132083899);
        rb.a.c(context, R.attr.motionDurationLong2, k.d.DEFAULT_DRAG_ANIMATION_DURATION);
        rb.a.d(context, R.attr.motionEasingEmphasizedInterpolator, ab.a.f450b);
        this.F = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f9309x = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f9310y = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i6) {
        if (i6 == 2) {
            return Math.round(this.F * 0.66f);
        }
        return this.F;
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.f9306u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f, false);
    }

    public final void c(float f, boolean z10) {
        float f2 = f % 360.0f;
        this.C = f2;
        this.E = Math.toRadians(f2 - 90.0f);
        float a10 = a(this.G);
        float cos = (((float) Math.cos(this.E)) * a10) + (getWidth() / 2);
        float sin = (a10 * ((float) Math.sin(this.E))) + (getHeight() / 2);
        float f10 = this.f9309x;
        this.A.set(cos - f10, sin - f10, cos + f10, sin + f10);
        Iterator it = this.f9308w.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f2);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a10;
        int i6;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float a11 = a(this.G);
        float f2 = height;
        Paint paint = this.f9311z;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.E)) * a11) + f, (a11 * ((float) Math.sin(this.E))) + f2, this.f9309x, paint);
        double sin = Math.sin(this.E);
        paint.setStrokeWidth(this.B);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.E) * r12)), height + ((int) (r12 * sin)), paint);
        canvas.drawCircle(f, f2, this.f9310y, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        if (!this.f9306u.isRunning()) {
            b(this.C);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z10 = false;
            } else {
                z10 = this.D;
                if (this.f9307v) {
                    if (((float) Math.hypot(x10 - (getWidth() / 2), y10 - (getHeight() / 2))) <= a(2) + w.b(12, getContext())) {
                        i6 = 2;
                    } else {
                        i6 = 1;
                    }
                    this.G = i6;
                }
            }
            z11 = false;
        } else {
            this.D = false;
            z10 = false;
            z11 = true;
        }
        boolean z14 = this.D;
        int degrees = ((int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x10 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f = degrees;
        if (this.C != f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 || !z12) {
            if (z12 || z10) {
                b(f);
            }
            this.D = z14 | z13;
            return true;
        }
        z13 = true;
        this.D = z14 | z13;
        return true;
    }
}
