package com.theinnerhour.b2b.libPackage.ringProgressLibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import hc.d;
import java.util.ArrayList;
import java.util.List;
import mr.a;
import mr.b;
/* loaded from: classes2.dex */
public class RingProgress extends View {
    public int A;
    public int B;
    public int C;
    public int D;
    public List<b> E;
    public RectF F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public boolean K;
    public final float L;
    public float M;
    public float N;

    /* renamed from: u  reason: collision with root package name */
    public Paint f11750u;

    /* renamed from: v  reason: collision with root package name */
    public Bitmap f11751v;

    /* renamed from: w  reason: collision with root package name */
    public Paint f11752w;

    /* renamed from: x  reason: collision with root package name */
    public int f11753x;

    /* renamed from: y  reason: collision with root package name */
    public int f11754y;

    /* renamed from: z  reason: collision with root package name */
    public int f11755z;

    public RingProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11753x = SubsamplingScaleImageView.ORIENTATION_180;
        this.A = 0;
        this.B = SubsamplingScaleImageView.ORIENTATION_270;
        this.C = Color.argb(100, 0, 0, 0);
        this.D = Color.rgb(141, 141, 141);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = 0.0f;
        this.K = false;
        this.L = 1.0f;
        this.M = 0.0f;
        this.N = 0.0f;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.K);
        if (obtainStyledAttributes != null) {
            this.G = obtainStyledAttributes.getBoolean(7, false);
            this.H = obtainStyledAttributes.getBoolean(5, false);
            this.I = obtainStyledAttributes.getBoolean(6, false);
            this.B = obtainStyledAttributes.getInt(4, SubsamplingScaleImageView.ORIENTATION_270);
            this.J = obtainStyledAttributes.getFloat(3, 0.5f);
            this.C = obtainStyledAttributes.getColor(1, this.C);
            this.D = obtainStyledAttributes.getColor(0, this.D);
            this.f11753x = obtainStyledAttributes.getInt(2, SubsamplingScaleImageView.ORIENTATION_180);
            obtainStyledAttributes.recycle();
        }
        this.f11750u = new Paint();
        Paint paint = new Paint();
        this.f11752w = paint;
        paint.setAntiAlias(true);
        this.f11752w.setStyle(Paint.Style.FILL);
        this.f11752w.setColor(-1);
    }

    public final void a(Paint paint, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        for (int i6 = 0; i6 < this.E.size(); i6++) {
            paint.reset();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.A);
            paint.setStyle(Paint.Style.STROKE);
            if (this.G) {
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
            }
            int i10 = this.D;
            int i11 = (16711680 & i10) >> 16;
            int i12 = (65280 & i10) >> 8;
            int i13 = i10 & 255;
            paint.setColor(Color.rgb((((255 - i11) / this.E.size()) * i6) + i11, (((255 - i12) / this.E.size()) * i6) + i12, (((255 - i13) / this.E.size()) * i6) + i13));
            Path path = new Path();
            RectF rectF = new RectF();
            RectF rectF2 = this.F;
            float f = rectF2.top;
            float f2 = this.A * i6;
            rectF.top = f + f2;
            rectF.bottom = rectF2.bottom - f2;
            rectF.left = rectF2.left + f2;
            rectF.right = rectF2.right - f2;
            this.E.get(i6).f25724a = rectF;
            path.addArc(rectF, 0.0f, this.f11753x);
            if (i6 == 0 && this.I) {
                float f10 = this.A;
                paint.setShadowLayer(f10 / 3.0f, 0.0f - (f10 / 4.0f), 0.0f, this.C);
            }
            if (this.H) {
                canvas.drawPath(path, paint);
            }
        }
        this.K = false;
    }

    public float getRingWidthScale() {
        return this.J;
    }

    public int getRotateAngle() {
        return this.B;
    }

    public int getSweepAngle() {
        return this.f11753x;
    }

    public List<b> getmListRing() {
        return this.E;
    }

    public a getmOnSelectRing() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.rotate(this.B, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        if (this.E.size() > 0) {
            this.A = (int) ((1.0f - this.J) * ((this.f11755z / 2.0f) / (this.E.size() + 0.5f)));
        }
        this.f11754y = this.A;
        this.F = new RectF(((getMeasuredWidth() / 2.0f) - (this.f11755z / 2.0f)) + this.f11754y, ((getMeasuredHeight() / 2.0f) - (this.f11755z / 2.0f)) + this.f11754y, ((this.f11755z / 2.0f) + (getMeasuredWidth() / 2.0f)) - this.f11754y, ((this.f11755z / 2.0f) + (getMeasuredHeight() / 2.0f)) - this.f11754y);
        Paint paint = this.f11750u;
        boolean z10 = true;
        paint.setAntiAlias(true);
        if (this.f11751v == null) {
            Bitmap createBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.f11751v = createBitmap;
            a(paint, createBitmap);
        }
        if (this.K) {
            Bitmap createBitmap2 = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.f11751v = createBitmap2;
            a(paint, createBitmap2);
        }
        float f = 0.0f;
        canvas.drawBitmap(this.f11751v, 0.0f, 0.0f, paint);
        Paint paint2 = this.f11750u;
        int i6 = 0;
        int i10 = 0;
        while (i10 < this.E.size()) {
            paint2.reset();
            paint2.setAntiAlias(z10);
            paint2.setStrokeWidth(this.A);
            paint2.setStyle(Paint.Style.STROKE);
            Path path = new Path();
            RectF rectF = this.E.get(i10).f25724a;
            this.E.get(i10).getClass();
            float f2 = i6;
            float f10 = this.L;
            path.addArc(rectF, f, (int) ((this.f11753x / 100.0f) * f2 * f10));
            this.E.get(i10).getClass();
            this.E.get(i10).getClass();
            paint2.setShader(new LinearGradient(this.E.get(i10).f25724a.left, this.E.get(i10).f25724a.top, this.E.get(i10).f25724a.left, this.E.get(i10).f25724a.bottom, new int[]{0, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            if (this.G) {
                paint2.setStrokeCap(Paint.Cap.ROUND);
                paint2.setStrokeJoin(Paint.Join.ROUND);
            }
            canvas.drawPath(path, paint2);
            paint2.setShader(null);
            this.f11752w.setTextSize(this.f11750u.getStrokeWidth() / 2.0f);
            this.E.get(i10).getClass();
            this.E.get(i10).getClass();
            float width = (this.f11753x / 360.0f) * ((float) (this.E.get(i10).f25724a.width() * 3.141592653589793d * (f2 / 100.0f)));
            float measureText = this.f11752w.measureText("null");
            if (f10 == 1.0f) {
                float f11 = width - (1.5f * measureText);
                if (f11 <= 0.0f) {
                    int i11 = (int) (width / ((1.0f * measureText) / 4));
                    if (i11 >= 4) {
                        Paint.FontMetrics fontMetrics = this.f11752w.getFontMetrics();
                        canvas.drawTextOnPath("null", path, 10.0f, (fontMetrics.descent - fontMetrics.ascent) / 3.0f, this.f11752w);
                    } else {
                        String str = "n";
                        for (int i12 = 0; i12 < i11; i12++) {
                            str = pl.a.f(str, ".");
                        }
                        Paint.FontMetrics fontMetrics2 = this.f11752w.getFontMetrics();
                        canvas.drawTextOnPath(str, path, 10.0f, (fontMetrics2.descent - fontMetrics2.ascent) / 3.0f, this.f11752w);
                    }
                } else {
                    Paint.FontMetrics fontMetrics3 = this.f11752w.getFontMetrics();
                    canvas.drawTextOnPath("null", path, f11, (fontMetrics3.descent - fontMetrics3.ascent) / 3.0f, this.f11752w);
                }
            }
            this.E.get(i10).getClass();
            float f12 = 4;
            float measureText2 = (this.f11752w.measureText("null") * 1.0f) / f12;
            float f13 = width - (measureText * 1.8f);
            if (f13 < 0.0f) {
                f13 = 0.0f;
            }
            float f14 = f13 / measureText2;
            if (f14 <= f12) {
                if (f14 < 1.0f) {
                    f12 = 0.0f;
                } else {
                    f12 = f14;
                }
            }
            String substring = "null".substring(0, (int) f12);
            Paint.FontMetrics fontMetrics4 = this.f11752w.getFontMetrics();
            canvas.drawTextOnPath(substring, path, 10.0f, (fontMetrics4.descent - fontMetrics4.ascent) / 3.0f, this.f11752w);
            i10++;
            z10 = true;
            f = 0.0f;
            i6 = 0;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension((int) ((getContext().getResources().getDisplayMetrics().density * 30.0f) + 0.5f), (int) ((getContext().getResources().getDisplayMetrics().density * 30.0f) + 0.5f));
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(size2, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, size);
        }
        if (getMeasuredWidth() > getHeight()) {
            this.f11755z = getMeasuredHeight();
        } else {
            this.f11755z = getMeasuredWidth();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        if (i6 > i10) {
            this.f11755z = i10;
        } else {
            this.f11755z = i6;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.M = motionEvent.getX();
            this.N = motionEvent.getY();
            return true;
        } else if (1 != motionEvent.getAction() || Math.abs(motionEvent.getX() - this.M) >= 5.0f || Math.abs(motionEvent.getY() - this.N) >= 5.0f) {
            return false;
        } else {
            float sqrt = (float) Math.sqrt(Math.pow(Math.abs(motionEvent.getY() - this.F.centerY()), 2.0d) + Math.pow(Math.abs(motionEvent.getX() - this.F.centerX()), 2.0d));
            for (int size = this.E.size() - 1; size >= 0; size--) {
                if ((this.A / 2.0f) + (this.E.get(size).f25724a.width() / 2.0f) > sqrt && (this.E.get(size).f25724a.width() / 2.0f) - (this.A / 2.0f) < sqrt) {
                    float round = Math.round((float) ((Math.asin(Math.abs(motionEvent.getY() - this.F.centerY()) / sqrt) / 3.141592653589793d) * 180.0d));
                    if (motionEvent.getY() - this.F.centerY() >= 0.0f && motionEvent.getX() - this.F.centerX() >= 0.0f) {
                        round += 0.0f;
                    } else if (motionEvent.getY() - this.F.centerY() <= 0.0f && motionEvent.getX() - this.F.centerX() >= 0.0f) {
                        round = 360.0f - round;
                    } else if (motionEvent.getY() - this.F.centerY() <= 0.0f && motionEvent.getX() - this.F.centerX() <= 0.0f) {
                        round += 180.0f;
                    } else if (motionEvent.getY() - this.F.centerY() >= 0.0f && motionEvent.getX() - this.F.centerX() <= 0.0f) {
                        round = 180.0f - round;
                    }
                    this.E.get(size).getClass();
                    float f = (0 / 100.0f) * 360.0f;
                    int i6 = this.B;
                    if (i6 + f <= 360.0f && i6 <= 360) {
                        if (round >= i6) {
                            this.E.get(size).getClass();
                        }
                    } else {
                        this.E.get(size).getClass();
                        int i10 = this.B;
                        if (f + i10 >= 360.0f && i10 <= 360 && ((round < i10 || round > 360.0f) && round >= 0.0f)) {
                            this.E.get(size).getClass();
                        }
                    }
                    return true;
                }
            }
            return true;
        }
    }

    public void setCorner(boolean z10) {
        this.G = z10;
        this.K = true;
        invalidate();
    }

    public void setDrawBg(boolean z10) {
        this.H = z10;
        this.K = true;
        invalidate();
    }

    public void setDrawBgShadow(boolean z10) {
        this.I = z10;
        this.K = true;
        invalidate();
    }

    public void setRingWidthScale(float f) {
        this.J = f;
        this.K = true;
        invalidate();
    }

    public void setRotateAngle(int i6) {
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > 360) {
            i6 = 360;
        }
        this.B = i6;
        invalidate();
    }

    public void setSweepAngle(int i6) {
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > 360) {
            i6 = 360;
        }
        this.f11753x = i6;
        this.K = true;
        invalidate();
    }

    public void setmListRing(List<b> list) {
        this.E = list;
    }

    public void setOnSelectRing(a aVar) {
    }
}
