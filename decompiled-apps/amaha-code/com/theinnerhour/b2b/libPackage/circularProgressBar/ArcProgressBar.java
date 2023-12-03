package com.theinnerhour.b2b.libPackage.circularProgressBar;

import a9.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.k;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import hc.d;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import lr.b;
/* compiled from: ArcProgressBar.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0014R$\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a¨\u0006&"}, d2 = {"Lcom/theinnerhour/b2b/libPackage/circularProgressBar/ArcProgressBar;", "Landroid/view/View;", "", "getProgress", Constants.SCREEN_PROGRESS, "Lhs/k;", "setProgress", "getProgressMax", "progressMax", "setProgressMax", "", "getColor", "color", "setColor", "getBackgroundColor", "backgroundColor", "setBackgroundColor", "Llr/b;", "listener", "setOnProgressChangedListener", "Llr/a;", "setOnIndeterminateModeChangeListener", "strokeWidth", "getProgressBarWidth", "()F", "setProgressBarWidth", "(F)V", "progressBarWidth", "backgroundStrokeWidth", "getBackgroundProgressBarWidth", "setBackgroundProgressBarWidth", "backgroundProgressBarWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ArcProgressBar extends View {
    public static final /* synthetic */ int N = 0;
    public int A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public b F;
    public ValueAnimator G;
    public Handler H;
    public boolean I;
    public RectF J;
    public Paint K;
    public Paint L;
    public final a M;

    /* renamed from: u  reason: collision with root package name */
    public float f11726u;

    /* renamed from: v  reason: collision with root package name */
    public float f11727v;

    /* renamed from: w  reason: collision with root package name */
    public float f11728w;

    /* renamed from: x  reason: collision with root package name */
    public float f11729x;

    /* renamed from: y  reason: collision with root package name */
    public float f11730y;

    /* renamed from: z  reason: collision with root package name */
    public int f11731z;

    /* compiled from: ArcProgressBar.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArcProgressBar arcProgressBar = ArcProgressBar.this;
            if (arcProgressBar.C) {
                Handler handler = arcProgressBar.H;
                i.d(handler);
                int i6 = ArcProgressBar.N;
                handler.postDelayed(this, 1500);
                boolean z10 = !arcProgressBar.B;
                arcProgressBar.B = z10;
                if (z10) {
                    arcProgressBar.c(0.0f, 1500);
                } else {
                    arcProgressBar.c(arcProgressBar.f11727v, 1500);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        i.g(context, "context");
        i.g(attrs, "attrs");
        new LinkedHashMap();
        this.f11727v = 100.0f;
        this.f11728w = 240.0f;
        this.f11729x = getResources().getDimension(R.dimen.default_stroke_width);
        this.f11730y = getResources().getDimension(R.dimen.default_background_stroke_width);
        this.f11731z = -16777216;
        this.A = -7829368;
        this.B = true;
        this.D = 150.0f;
        this.E = 150.0f;
        this.I = true;
        this.M = new a();
        this.J = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, d.F, 0, 0);
        i.f(obtainStyledAttributes, "context.theme.obtainStyl…ircularProgressBar, 0, 0)");
        try {
            this.f11726u = obtainStyledAttributes.getFloat(5, this.f11726u);
            this.f11727v = obtainStyledAttributes.getFloat(6, this.f11727v);
            this.C = obtainStyledAttributes.getBoolean(3, this.C);
            this.f11729x = obtainStyledAttributes.getDimension(8, this.f11729x);
            this.f11730y = obtainStyledAttributes.getDimension(1, this.f11730y);
            this.f11731z = obtainStyledAttributes.getInt(7, this.f11731z);
            this.A = obtainStyledAttributes.getInt(0, this.A);
            float f = obtainStyledAttributes.getFloat(10, this.D);
            this.D = f;
            this.E = f;
            this.f11728w = obtainStyledAttributes.getFloat(4, this.f11728w);
            this.I = obtainStyledAttributes.getBoolean(2, this.I);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.K = paint;
            paint.setColor(this.A);
            Paint paint2 = this.K;
            i.d(paint2);
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = this.K;
            i.d(paint3);
            paint3.setStrokeWidth(this.f11730y);
            Paint paint4 = this.K;
            i.d(paint4);
            paint4.setStrokeCap(Paint.Cap.ROUND);
            Paint paint5 = this.K;
            i.d(paint5);
            paint5.setStrokeJoin(Paint.Join.ROUND);
            Paint paint6 = new Paint(1);
            this.L = paint6;
            paint6.setColor(this.f11731z);
            Paint paint7 = this.L;
            i.d(paint7);
            paint7.setStyle(Paint.Style.STROKE);
            Paint paint8 = this.L;
            i.d(paint8);
            paint8.setStrokeWidth(this.f11729x);
            Paint paint9 = this.L;
            i.d(paint9);
            paint9.setStrokeCap(Paint.Cap.ROUND);
            Paint paint10 = this.L;
            i.d(paint10);
            paint10.setStrokeJoin(Paint.Join.ROUND);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a(boolean z10) {
        this.C = z10;
        this.B = true;
        this.E = this.D;
        Handler handler = this.H;
        a aVar = this.M;
        if (handler != null) {
            i.d(handler);
            handler.removeCallbacks(aVar);
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            i.d(valueAnimator);
            valueAnimator.cancel();
        }
        Handler handler2 = new Handler();
        this.H = handler2;
        if (this.C) {
            handler2.post(aVar);
        } else {
            b(0.0f, true);
        }
    }

    public final void b(float f, boolean z10) {
        ValueAnimator valueAnimator;
        if (!z10 && (valueAnimator = this.G) != null) {
            i.d(valueAnimator);
            valueAnimator.cancel();
            if (this.C) {
                a(false);
            }
        }
        float f2 = this.f11727v;
        if (f <= f2) {
            f2 = f;
        }
        this.f11726u = f2;
        b bVar = this.F;
        if (bVar != null) {
            i.d(bVar);
            bVar.a(f);
        }
        invalidate();
    }

    public final void c(float f, int i6) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            i.d(valueAnimator);
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f11726u, f);
        this.G = ofFloat;
        i.d(ofFloat);
        ofFloat.setDuration(i6);
        ValueAnimator valueAnimator2 = this.G;
        i.d(valueAnimator2);
        valueAnimator2.addUpdateListener(new c(3, this));
        ValueAnimator valueAnimator3 = this.G;
        i.d(valueAnimator3);
        valueAnimator3.start();
    }

    public final int getBackgroundColor() {
        return this.A;
    }

    public final float getBackgroundProgressBarWidth() {
        return this.f11730y;
    }

    public final int getColor() {
        return this.f11731z;
    }

    public final float getProgress() {
        return this.f11726u;
    }

    public final float getProgressBarWidth() {
        return this.f11729x;
    }

    public final float getProgressMax() {
        return this.f11727v;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            i.d(valueAnimator);
            valueAnimator.cancel();
        }
        Handler handler = this.H;
        if (handler != null) {
            i.d(handler);
            handler.removeCallbacks(this.M);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        i.g(canvas, "canvas");
        super.onDraw(canvas);
        float f2 = (this.f11726u * 100.0f) / this.f11727v;
        if (this.B) {
            f = this.f11728w;
        } else {
            f = -this.f11728w;
        }
        float f10 = (f * f2) / 100;
        RectF rectF = this.J;
        i.d(rectF);
        float f11 = this.E;
        float f12 = this.f11728w;
        Paint paint = this.K;
        i.d(paint);
        canvas.drawArc(rectF, f11, f12, false, paint);
        if (this.I) {
            SweepGradient sweepGradient = new SweepGradient(getMeasuredHeight() / 2, getMeasuredHeight() / 2, new int[]{Color.parseColor("#ffeb3b"), Color.parseColor("#ff9800"), Color.parseColor("#e91e63")}, new float[]{0.0f, f2 / 300, f2 / ((float) k.d.DEFAULT_DRAG_ANIMATION_DURATION)});
            Matrix matrix = new Matrix();
            matrix.preRotate(this.D - 5, getMeasuredHeight() / 2, getMeasuredHeight() / 2);
            sweepGradient.setLocalMatrix(matrix);
            Paint paint2 = this.L;
            i.d(paint2);
            paint2.setShader(sweepGradient);
        }
        RectF rectF2 = this.J;
        i.d(rectF2);
        float f13 = this.E;
        Paint paint3 = this.L;
        i.d(paint3);
        canvas.drawArc(rectF2, f13, f10, false, paint3);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.C) {
            a(true);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i6), View.getDefaultSize(getSuggestedMinimumHeight(), i10));
        setMeasuredDimension(min, min);
        float f = this.f11729x;
        float f2 = this.f11730y;
        if (f <= f2) {
            f = f2;
        }
        RectF rectF = this.J;
        i.d(rectF);
        float f10 = f / 2;
        float f11 = 0 + f10;
        float f12 = min - f10;
        rectF.set(f11, f11, f12, f12);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        this.A = i6;
        Paint paint = this.K;
        i.d(paint);
        paint.setColor(i6);
        requestLayout();
        invalidate();
    }

    public final void setBackgroundProgressBarWidth(float f) {
        this.f11730y = f;
        Paint paint = this.K;
        i.d(paint);
        paint.setStrokeWidth(f);
        requestLayout();
        invalidate();
    }

    public final void setColor(int i6) {
        this.f11731z = i6;
        Paint paint = this.L;
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
        this.F = listener;
    }

    public final void setProgress(float f) {
        b(f, false);
    }

    public final void setProgressBarWidth(float f) {
        this.f11729x = f;
        Paint paint = this.L;
        i.d(paint);
        paint.setStrokeWidth(f);
        requestLayout();
        invalidate();
    }

    public final void setProgressMax(float f) {
        if (f < 0.0f) {
            f = 100.0f;
        }
        this.f11727v = f;
        requestLayout();
        invalidate();
    }

    public final void setProgressWithAnimation(float f) {
        c(f, 1500);
    }
}
