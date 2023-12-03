package com.theinnerhour.b2b.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import hc.d;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class TemplateCircularSlider extends View {
    public int A;
    public double B;
    public double C;
    public int D;
    public final Paint E;
    public SweepGradient F;
    public a G;
    public RectF H;
    public final int I;
    public int J;
    public boolean K;
    public Drawable L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11848u;

    /* renamed from: v  reason: collision with root package name */
    public int f11849v;

    /* renamed from: w  reason: collision with root package name */
    public int f11850w;

    /* renamed from: x  reason: collision with root package name */
    public int f11851x;

    /* renamed from: y  reason: collision with root package name */
    public int f11852y;

    /* renamed from: z  reason: collision with root package name */
    public int[] f11853z;

    /* loaded from: classes2.dex */
    public interface a {
        void a(float f);
    }

    public TemplateCircularSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.C = this.B;
        this.D = Color.parseColor("#ffffff");
        this.E = new Paint();
        this.H = new RectF();
        this.I = Color.parseColor("#ffffff");
        this.J = Color.parseColor("#ff9800");
        this.K = true;
        this.Q = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.G, 0, 0);
        float f = obtainStyledAttributes.getFloat(5, 1.5707964f);
        float f2 = obtainStyledAttributes.getFloat(0, 1.5707964f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 20);
        int color = obtainStyledAttributes.getColor(2, -65536);
        String string = obtainStyledAttributes.getString(3);
        int color2 = obtainStyledAttributes.getColor(1, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(7);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(8, 50);
        int color3 = obtainStyledAttributes.getColor(6, -7829368);
        setStartAngle(f);
        setAngle(f2);
        setBorderThickness(dimensionPixelSize);
        setBorderColor(color);
        if (string != null) {
            setBorderGradientColors(string.split(";"));
        }
        setThumbSize(dimensionPixelSize2);
        setThumbImage(drawable);
        setThumbColor(color3);
        setSliderBackGroundColor(color2);
        setPadding((getPaddingStart() + (getPaddingEnd() + (getPaddingTop() + (getPaddingBottom() + (getPaddingRight() + getPaddingLeft()))))) / 6);
        obtainStyledAttributes.recycle();
    }

    public final void a(int i6, int i10) {
        int i11 = i6 - this.f11849v;
        int i12 = this.f11850w - i10;
        double d10 = i11;
        double acos = Math.acos(d10 / Math.sqrt(Math.pow(i12, 2.0d) + Math.pow(d10, 2.0d)));
        this.C = acos;
        if (i12 < 0) {
            this.C = -acos;
        }
    }

    public int getSliderBackgroundColor() {
        return this.D;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.E;
        paint.setAntiAlias(true);
        SweepGradient sweepGradient = this.F;
        if (sweepGradient != null) {
            paint.setShader(sweepGradient);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.A);
        paint.setColor(this.I);
        canvas.drawArc(this.H, 0.0f, 360.0f, false, paint);
        float f = (float) (-Math.toDegrees(this.C));
        if (f <= 0.0f) {
            f += 360.0f;
        }
        paint.setColor(this.J);
        canvas.drawArc(this.H, 0.0f, f, false, paint);
        if (this.f11848u) {
            this.O = (int) ((Math.cos(this.C) * this.f11851x) + this.f11849v);
            int sin = (int) (this.f11850w - (Math.sin(this.C) * this.f11851x));
            this.P = sin;
            Drawable drawable = this.L;
            if (drawable != null) {
                int i6 = this.O;
                int i10 = this.M;
                drawable.setBounds(i6 - (i10 / 2), sin - (i10 / 2), (i10 / 2) + i6, (i10 / 2) + sin);
                this.L.draw(canvas);
                return;
            }
            paint.setColor(this.N);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(this.O, this.P, this.M, paint);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        int i13;
        if (i6 > i10) {
            i13 = i10;
        } else {
            i13 = i6;
        }
        int i14 = ((i6 - i13) / 2) + i13;
        int i15 = ((i10 - i13) / 2) + i13;
        this.f11849v = ((i6 - i14) / 2) + (i14 / 2);
        this.f11850w = ((i10 - i15) / 2) + (i15 / 2);
        this.f11851x = ((i13 / 2) - (this.A / 2)) - this.f11852y;
        int i16 = this.f11849v;
        int i17 = this.f11851x;
        int i18 = this.f11850w;
        this.H = new RectF(i16 - i17, i18 - i17, i16 + i17, i18 + i17);
        if (this.f11853z != null) {
            int i19 = this.f11851x;
            this.F = new SweepGradient(i19, i19, this.f11853z, (float[]) null);
        }
        super.onSizeChanged(i6, i10, i11, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.K) {
                        return true;
                    }
                    a((int) motionEvent.getX(), (int) motionEvent.getY());
                    this.Q = true;
                }
            } else if (this.K) {
                return true;
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                if (this.G != null) {
                    float f = (float) (-Math.toDegrees(this.C));
                    if (f <= 0.0f) {
                        f += 360.0f;
                    }
                    this.G.a(f);
                }
                this.Q = false;
            }
        } else if (this.K) {
            return true;
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            a((int) motionEvent.getX(), (int) motionEvent.getY());
            this.Q = true;
        }
        invalidate();
        return true;
    }

    public void setAngle(double d10) {
        this.C = d10;
    }

    public void setBorderGradientColors(String[] strArr) {
        this.f11853z = new int[strArr.length];
        for (int i6 = 0; i6 < strArr.length; i6++) {
            this.f11853z[i6] = Color.parseColor(strArr[i6]);
        }
    }

    public void setBorderThickness(int i6) {
        this.A = i6;
    }

    public void setColorCode(int i6) {
        this.J = i6;
        invalidate();
    }

    public void setDisableTouch(boolean z10) {
        this.K = z10;
    }

    public void setOnSliderMovedListener(a aVar) {
        this.G = aVar;
    }

    public void setPadding(int i6) {
        this.f11852y = i6;
    }

    public void setPercentage(double d10) {
        if (d10 >= 0.0d && d10 <= 1.0d) {
            this.C = -Math.toRadians(d10 * 360.0d);
            invalidate();
        }
    }

    public void setPosition(double d10) {
        if (d10 >= 0.0d && d10 <= 1.0d) {
            this.C = (d10 * 2.0d * 3.141592653589793d) + this.B;
            invalidate();
        }
    }

    public void setSliderBackGroundColor(int i6) {
        this.D = i6;
    }

    public void setStartAngle(double d10) {
        this.B = d10;
    }

    public void setThumbColor(int i6) {
        this.N = i6;
    }

    public void setThumbImage(Drawable drawable) {
        this.L = drawable;
    }

    public void setThumbSize(int i6) {
        this.M = i6;
    }

    public void setBorderGradientColors(int[] iArr) {
        if (iArr == null) {
            this.f11853z = null;
            this.F = null;
            return;
        }
        this.f11853z = Arrays.copyOf(iArr, iArr.length);
        int i6 = this.f11851x;
        this.F = new SweepGradient(i6, i6, this.f11853z, (float[]) null);
    }

    public void setBorderColor(int i6) {
    }
}
