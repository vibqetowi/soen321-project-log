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
import com.theinnerhour.b2b.utils.Constants;
import hc.d;
import java.util.Arrays;
import kq.c;
/* loaded from: classes2.dex */
public class CircularSlider extends View {
    public int A;
    public int B;
    public int C;
    public int D;
    public int[] E;
    public int F;
    public double G;
    public double H;
    public boolean I;
    public int J;
    public final Paint K;
    public SweepGradient L;
    public a M;
    public RectF N;
    public final int O;
    public int[] P;
    public final int[] Q;

    /* renamed from: u  reason: collision with root package name */
    public int f11826u;

    /* renamed from: v  reason: collision with root package name */
    public int f11827v;

    /* renamed from: w  reason: collision with root package name */
    public int f11828w;

    /* renamed from: x  reason: collision with root package name */
    public int f11829x;

    /* renamed from: y  reason: collision with root package name */
    public int f11830y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f11831z;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public CircularSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.H = this.G;
        this.I = false;
        this.J = Color.parseColor("#ffffff");
        this.K = new Paint();
        this.N = new RectF();
        this.O = Color.parseColor("#aaffffff");
        this.P = new int[0];
        this.Q = new int[]{-2130706433, 1728053247, 1308622847, 872415231, 452984831};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.G, 0, 0);
        float f = obtainStyledAttributes.getFloat(5, 1.5707964f);
        float f2 = obtainStyledAttributes.getFloat(0, 1.5707964f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 50);
        int color = obtainStyledAttributes.getColor(6, -7829368);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(4, 20);
        int color2 = obtainStyledAttributes.getColor(2, -65536);
        String string = obtainStyledAttributes.getString(3);
        Drawable drawable = obtainStyledAttributes.getDrawable(7);
        int color3 = obtainStyledAttributes.getColor(1, -1);
        setStartAngle(f);
        setAngle(f2);
        setBorderThickness(dimensionPixelSize2);
        setBorderColor(color2);
        if (string != null) {
            setBorderGradientColors(string.split(";"));
        }
        setThumbSize(dimensionPixelSize);
        setThumbImage(drawable);
        setThumbColor(color);
        setSliderBackGroundColor(color3);
        setPadding((getPaddingStart() + (getPaddingEnd() + (getPaddingTop() + (getPaddingBottom() + (getPaddingRight() + getPaddingLeft()))))) / 6);
        obtainStyledAttributes.recycle();
    }

    public final void a(int i6, int i10) {
        int length;
        int i11 = i6 - this.f11828w;
        int i12 = this.f11829x - i10;
        double d10 = i11;
        double acos = Math.acos(d10 / Math.sqrt(Math.pow(i12, 2.0d) + Math.pow(d10, 2.0d)));
        this.H = acos;
        if (i12 < 0) {
            this.H = -acos;
        }
        a aVar = this.M;
        if (aVar != null) {
            aVar.getClass();
            float f = (float) (-Math.toDegrees(this.H));
            if (f <= 0.0f) {
                f += 360.0f;
            }
            c cVar = (c) this.M;
            cVar.getClass();
            if (f == 360.0f) {
                length = Constants.colorCode.length - 1;
            } else {
                length = ((int) f) / (360 / Constants.colorCode.length);
            }
            cVar.f23789w = Constants.moodStr[length];
            cVar.f23790x.setImageResource(Constants.trackerSmiley[length]);
            cVar.f23788v.setText(cVar.f23789w);
        }
    }

    public int getSliderBackgroundColor() {
        return this.J;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        int length;
        super.onDraw(canvas);
        float f = (float) (-Math.toDegrees(this.H));
        if (f <= 0.0f) {
            f += 360.0f;
        }
        float f2 = f;
        int i6 = this.D;
        int[] iArr = this.P;
        if (iArr.length > 0) {
            if (f2 == 360.0f) {
                length = iArr.length - 1;
            } else {
                length = ((int) f2) / (360 / iArr.length);
            }
            i6 = iArr[length];
        }
        int i10 = i6;
        Paint paint = this.K;
        paint.setAntiAlias(true);
        SweepGradient sweepGradient = this.L;
        if (sweepGradient != null) {
            paint.setShader(sweepGradient);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i10);
        canvas.drawCircle(this.f11828w, this.f11829x, (this.f11830y / 2) + 5, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f11830y / 4.0f);
        int i11 = 0;
        for (int i12 = 2; i11 < i12; i12 = 2) {
            int i13 = i11 + 1;
            if (i11 == 0) {
                RectF rectF2 = this.N;
                float f10 = rectF2.left;
                int i14 = this.f11830y;
                float f11 = (i14 / 4.0f) + f10;
                int i15 = this.A;
                rectF = new RectF(f11 + i15, (i14 / 4.0f) + rectF2.top + i15, (rectF2.right - (i14 / 4.0f)) - i15, (rectF2.bottom - (i14 / 4.0f)) - i15);
            } else {
                RectF rectF3 = this.N;
                float f12 = rectF3.left;
                int i16 = this.A;
                rectF = new RectF(f12 + i16, rectF3.top + i16, rectF3.right - i16, rectF3.bottom - i16);
            }
            paint.setColor(this.Q[i11] & i10);
            canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
            i11 = i13;
        }
        RectF rectF4 = this.N;
        float f13 = rectF4.left;
        int i17 = this.f11830y;
        RectF rectF5 = new RectF((i17 / 2.0f) + f13, (i17 / 2.0f) + rectF4.top, rectF4.right - (i17 / 2.0f), rectF4.bottom - (i17 / 2.0f));
        paint.setStrokeWidth(this.F / 2.0f);
        paint.setColor(this.O);
        canvas.drawArc(rectF5, 0.0f, 360.0f, false, paint);
        paint.setColor(i10);
        canvas.drawArc(rectF5, 0.0f, f2, false, paint);
        this.f11826u = (int) ((Math.cos(this.H) * (this.f11830y / 2.0d)) + this.f11828w);
        int sin = (int) (this.f11829x - (Math.sin(this.H) * (this.f11830y / 2.0d)));
        this.f11827v = sin;
        Drawable drawable = this.f11831z;
        if (drawable != null) {
            int i18 = this.f11826u;
            int i19 = this.B;
            drawable.setBounds(i18 - (i19 / 2), sin - (i19 / 2), (i19 / 2) + i18, (i19 / 2) + sin);
            this.f11831z.draw(canvas);
            return;
        }
        paint.setColor(this.C);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(this.f11826u, this.f11827v, this.B, paint);
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
        this.f11828w = ((i6 - i14) / 2) + (i14 / 2);
        this.f11829x = ((i10 - i15) / 2) + (i15 / 2);
        this.f11830y = (i13 / 2) - this.A;
        int i16 = this.f11828w;
        int i17 = this.f11830y;
        int i18 = this.f11829x;
        this.N = new RectF(i16 - i17, i18 - i17, i16 + i17, i18 + i17);
        if (this.E != null) {
            int i19 = this.f11830y;
            this.L = new SweepGradient(i19, i19, this.E, (float[]) null);
        }
        super.onSizeChanged(i6, i10, i11, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.I) {
                    a((int) motionEvent.getX(), (int) motionEvent.getY());
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.I = false;
            }
        } else {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int i6 = this.f11826u;
            int i10 = this.B;
            if (x10 < i6 + i10 && x10 > i6 - i10) {
                int i11 = this.f11827v;
                if (y10 < i11 + i10 && y10 > i11 - i10) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.I = true;
                    a(x10, y10);
                }
            }
        }
        invalidate();
        return true;
    }

    public void setAngle(double d10) {
        this.H = d10;
    }

    public void setBorderColor(int i6) {
        this.D = i6;
    }

    public void setBorderGradientColors(String[] strArr) {
        this.E = new int[strArr.length];
        for (int i6 = 0; i6 < strArr.length; i6++) {
            this.E[i6] = Color.parseColor(strArr[i6]);
        }
    }

    public void setBorderThickness(int i6) {
        this.F = i6;
    }

    public void setColorCode(int[] iArr) {
        this.P = iArr;
        invalidate();
    }

    public void setOnSliderMovedListener(a aVar) {
        this.M = aVar;
    }

    public void setPadding(int i6) {
        this.A = i6;
    }

    public void setPosition(double d10) {
        if (d10 >= 0.0d && d10 <= 1.0d) {
            this.H = (d10 * 2.0d * 3.141592653589793d) + this.G;
        }
    }

    public void setSliderBackGroundColor(int i6) {
        this.J = i6;
    }

    public void setStartAngle(double d10) {
        this.G = d10;
    }

    public void setThumbColor(int i6) {
        this.C = i6;
    }

    public void setThumbImage(Drawable drawable) {
        this.f11831z = drawable;
    }

    public void setThumbSize(int i6) {
        this.B = i6;
    }

    public void setBorderGradientColors(int[] iArr) {
        if (iArr == null) {
            this.E = null;
            this.L = null;
            return;
        }
        this.E = Arrays.copyOf(iArr, iArr.length);
        int i6 = this.f11830y;
        this.L = new SweepGradient(i6, i6, this.E, (float[]) null);
    }
}
