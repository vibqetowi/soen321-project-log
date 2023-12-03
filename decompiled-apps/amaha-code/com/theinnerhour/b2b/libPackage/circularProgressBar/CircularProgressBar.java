package com.theinnerhour.b2b.libPackage.circularProgressBar;

import a9.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import hc.d;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import lr.b;
/* compiled from: CircularProgressBar.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0014R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#¨\u0006/"}, d2 = {"Lcom/theinnerhour/b2b/libPackage/circularProgressBar/CircularProgressBar;", "Landroid/view/View;", "", "getProgress", Constants.SCREEN_PROGRESS, "Lhs/k;", "setProgress", "getProgressMax", "progressMax", "setProgressMax", "", "getColor", "color", "setColor", "getBackgroundColor", "backgroundColor", "setBackgroundColor", "Llr/b;", "listener", "setOnProgressChangedListener", "Llr/a;", "setOnIndeterminateModeChangeListener", "", "value", "G", "Z", "getRoundBorder", "()Z", "setRoundBorder", "(Z)V", "roundBorder", "strokeWidth", "getProgressBarWidth", "()F", "setProgressBarWidth", "(F)V", "progressBarWidth", "backgroundStrokeWidth", "getBackgroundProgressBarWidth", "setBackgroundProgressBarWidth", "backgroundProgressBarWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CircularProgressBar extends View {
    public static final /* synthetic */ int L = 0;
    public boolean A;
    public boolean B;
    public float C;
    public b D;
    public ValueAnimator E;
    public Handler F;
    public boolean G;
    public RectF H;
    public Paint I;
    public Paint J;
    public final a K;

    /* renamed from: u  reason: collision with root package name */
    public float f11733u;

    /* renamed from: v  reason: collision with root package name */
    public float f11734v;

    /* renamed from: w  reason: collision with root package name */
    public float f11735w;

    /* renamed from: x  reason: collision with root package name */
    public float f11736x;

    /* renamed from: y  reason: collision with root package name */
    public int f11737y;

    /* renamed from: z  reason: collision with root package name */
    public int f11738z;

    /* compiled from: CircularProgressBar.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CircularProgressBar circularProgressBar = CircularProgressBar.this;
            if (circularProgressBar.B) {
                Handler handler = circularProgressBar.F;
                i.d(handler);
                int i6 = CircularProgressBar.L;
                handler.postDelayed(this, 1500);
                boolean z10 = !circularProgressBar.A;
                circularProgressBar.A = z10;
                if (z10) {
                    circularProgressBar.c(0.0f, 1500);
                } else {
                    circularProgressBar.c(circularProgressBar.f11734v, 1500);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        i.g(context, "context");
        i.g(attrs, "attrs");
        new LinkedHashMap();
        this.f11734v = 100.0f;
        this.f11735w = getResources().getDimension(R.dimen.default_stroke_width);
        this.f11736x = getResources().getDimension(R.dimen.default_background_stroke_width);
        this.f11737y = -16777216;
        this.f11738z = -7829368;
        this.A = true;
        this.C = 270.0f;
        this.K = new a();
        this.H = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, d.F, 0, 0);
        i.f(obtainStyledAttributes, "context.theme.obtainStyl…ircularProgressBar, 0, 0)");
        try {
            this.f11733u = obtainStyledAttributes.getFloat(5, this.f11733u);
            this.f11734v = obtainStyledAttributes.getFloat(6, this.f11734v);
            this.B = obtainStyledAttributes.getBoolean(3, this.B);
            this.f11735w = obtainStyledAttributes.getDimension(8, this.f11735w);
            this.f11736x = obtainStyledAttributes.getDimension(1, this.f11736x);
            this.f11737y = obtainStyledAttributes.getInt(7, this.f11737y);
            this.f11738z = obtainStyledAttributes.getInt(0, this.f11738z);
            setRoundBorder(obtainStyledAttributes.getBoolean(9, this.G));
            obtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.I = paint;
            paint.setColor(this.f11738z);
            Paint paint2 = this.I;
            i.d(paint2);
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = this.I;
            i.d(paint3);
            paint3.setStrokeWidth(this.f11736x);
            Paint paint4 = new Paint(1);
            this.J = paint4;
            paint4.setColor(this.f11737y);
            Paint paint5 = this.J;
            i.d(paint5);
            paint5.setStyle(Paint.Style.STROKE);
            Paint paint6 = this.J;
            i.d(paint6);
            paint6.setStrokeWidth(this.f11735w);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a(boolean z10) {
        this.B = z10;
        this.A = true;
        this.C = 270.0f;
        Handler handler = this.F;
        a aVar = this.K;
        if (handler != null) {
            i.d(handler);
            handler.removeCallbacks(aVar);
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            i.d(valueAnimator);
            valueAnimator.cancel();
        }
        Handler handler2 = new Handler();
        this.F = handler2;
        if (this.B) {
            handler2.post(aVar);
        } else {
            b(0.0f, true);
        }
    }

    public final void b(float f, boolean z10) {
        ValueAnimator valueAnimator;
        if (!z10 && (valueAnimator = this.E) != null) {
            i.d(valueAnimator);
            valueAnimator.cancel();
            if (this.B) {
                a(false);
            }
        }
        float f2 = this.f11734v;
        if (f <= f2) {
            f2 = f;
        }
        this.f11733u = f2;
        b bVar = this.D;
        if (bVar != null) {
            i.d(bVar);
            bVar.a(f);
        }
        invalidate();
    }

    public final void c(float f, int i6) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            i.d(valueAnimator);
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f11733u, f);
        this.E = ofFloat;
        i.d(ofFloat);
        ofFloat.setDuration(i6);
        ValueAnimator valueAnimator2 = this.E;
        i.d(valueAnimator2);
        valueAnimator2.addUpdateListener(new c(4, this));
        ValueAnimator valueAnimator3 = this.E;
        i.d(valueAnimator3);
        valueAnimator3.start();
    }

    public final int getBackgroundColor() {
        return this.f11738z;
    }

    public final float getBackgroundProgressBarWidth() {
        return this.f11736x;
    }

    public final int getColor() {
        return this.f11737y;
    }

    public final float getProgress() {
        return this.f11733u;
    }

    public final float getProgressBarWidth() {
        return this.f11735w;
    }

    public final float getProgressMax() {
        return this.f11734v;
    }

    public final boolean getRoundBorder() {
        return this.G;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            i.d(valueAnimator);
            valueAnimator.cancel();
        }
        Handler handler = this.F;
        if (handler != null) {
            i.d(handler);
            handler.removeCallbacks(this.K);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i6;
        i.g(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.H;
        i.d(rectF);
        Paint paint = this.I;
        i.d(paint);
        canvas.drawOval(rectF, paint);
        float f = (this.f11733u * 100.0f) / this.f11734v;
        if (this.A) {
            i6 = 360;
        } else {
            i6 = -360;
        }
        RectF rectF2 = this.H;
        i.d(rectF2);
        float f2 = this.C;
        Paint paint2 = this.J;
        i.d(paint2);
        canvas.drawArc(rectF2, f2, (i6 * f) / 100, false, paint2);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.B) {
            a(true);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i6), View.getDefaultSize(getSuggestedMinimumHeight(), i10));
        setMeasuredDimension(min, min);
        float f = this.f11735w;
        float f2 = this.f11736x;
        if (f <= f2) {
            f = f2;
        }
        RectF rectF = this.H;
        i.d(rectF);
        float f10 = f / 2;
        float f11 = 0 + f10;
        float f12 = min - f10;
        rectF.set(f11, f11, f12, f12);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        this.f11738z = i6;
        Paint paint = this.I;
        i.d(paint);
        paint.setColor(i6);
        requestLayout();
        invalidate();
    }

    public final void setBackgroundProgressBarWidth(float f) {
        this.f11736x = f;
        Paint paint = this.I;
        i.d(paint);
        paint.setStrokeWidth(f);
        requestLayout();
        invalidate();
    }

    public final void setColor(int i6) {
        this.f11737y = i6;
        Paint paint = this.J;
        i.d(paint);
        paint.setColor(i6);
        requestLayout();
        invalidate();
    }

    public final void setOnIndeterminateModeChangeListener(lr.a listener) {
        i.g(listener, "listener");
    }

    public final void setOnProgressChangedListener(b listener) {
        i.g(listener, "listener");
        this.D = listener;
    }

    public final void setProgress(float f) {
        b(f, false);
    }

    public final void setProgressBarWidth(float f) {
        this.f11735w = f;
        Paint paint = this.J;
        i.d(paint);
        paint.setStrokeWidth(f);
        requestLayout();
        invalidate();
    }

    public final void setProgressMax(float f) {
        if (f < 0.0f) {
            f = 100.0f;
        }
        this.f11734v = f;
        requestLayout();
        invalidate();
    }

    public final void setProgressWithAnimation(float f) {
        c(f, 1500);
    }

    public final void setRoundBorder(boolean z10) {
        Paint.Cap cap;
        this.G = z10;
        Paint paint = this.J;
        if (paint != null) {
            if (z10) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            invalidate();
        }
    }
}
