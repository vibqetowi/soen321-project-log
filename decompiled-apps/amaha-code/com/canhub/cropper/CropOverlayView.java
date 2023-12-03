package com.canhub.cropper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.canhub.cropper.CropImageView;
import f5.f;
import f5.g;
import f5.h;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
/* loaded from: classes.dex */
public class CropOverlayView extends View {
    public Paint A;
    public Paint B;
    public Paint C;
    public Paint D;
    public final Path E;
    public final float[] F;
    public final RectF G;
    public int H;
    public int I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public h O;
    public boolean P;
    public int Q;
    public int R;
    public float S;
    public CropImageView.c T;
    public CropImageView.b U;
    public final Rect V;
    public boolean W;

    /* renamed from: u  reason: collision with root package name */
    public ScaleGestureDetector f6036u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6037v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6038w;

    /* renamed from: x  reason: collision with root package name */
    public final g f6039x;

    /* renamed from: y  reason: collision with root package name */
    public a f6040y;

    /* renamed from: z  reason: collision with root package name */
    public final RectF f6041z;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public b() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            CropOverlayView cropOverlayView = CropOverlayView.this;
            RectF f = cropOverlayView.f6039x.f();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f2 = focusY - currentSpanY;
            float f10 = focusX - currentSpanX;
            float f11 = focusX + currentSpanX;
            float f12 = focusY + currentSpanY;
            if (f10 < f11 && f2 <= f12 && f10 >= 0.0f && f11 <= cropOverlayView.f6039x.c() && f2 >= 0.0f && f12 <= cropOverlayView.f6039x.b()) {
                f.set(f10, f2, f11, f12);
                cropOverlayView.f6039x.h(f);
                cropOverlayView.invalidate();
                return true;
            }
            return true;
        }
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6038w = true;
        this.f6039x = new g();
        this.f6041z = new RectF();
        this.E = new Path();
        this.F = new float[8];
        this.G = new RectF();
        this.S = this.Q / this.R;
        this.V = new Rect();
    }

    public static Paint e(float f, int i6) {
        if (f > 0.0f) {
            Paint paint = new Paint();
            paint.setColor(i6);
            paint.setStrokeWidth(f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }
        return null;
    }

    public final boolean a(RectF rectF) {
        boolean z10;
        float f;
        float f2;
        float f10;
        float[] fArr = this.F;
        float o10 = c.o(fArr);
        float q10 = c.q(fArr);
        float p10 = c.p(fArr);
        float m10 = c.m(fArr);
        if (fArr[0] != fArr[6] && fArr[1] != fArr[7]) {
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF2 = this.G;
        if (!z10) {
            rectF2.set(o10, q10, p10, m10);
            return false;
        }
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        if (f16 < f12) {
            f2 = fArr[3];
            if (f12 < f2) {
                float f17 = fArr[2];
                f = f15;
                f12 = f14;
                f15 = f17;
                f14 = f16;
                f11 = f13;
            } else {
                f15 = f11;
                f11 = fArr[2];
                f = f13;
                f2 = f12;
                f12 = f2;
            }
        } else {
            float f18 = fArr[3];
            if (f12 > f18) {
                f = fArr[2];
                f14 = f18;
                f2 = f16;
            } else {
                f = f11;
                f11 = f15;
                f15 = f13;
                f2 = f14;
                f14 = f12;
                f12 = f16;
            }
        }
        float f19 = (f12 - f14) / (f11 - f);
        float f20 = (-1.0f) / f19;
        float f21 = f14 - (f19 * f);
        float f22 = f14 - (f * f20);
        float f23 = f2 - (f19 * f15);
        float f24 = f2 - (f15 * f20);
        float centerY = rectF.centerY() - rectF.top;
        float centerX = rectF.centerX();
        float f25 = rectF.left;
        float f26 = centerY / (centerX - f25);
        float f27 = -f26;
        float f28 = rectF.top;
        float f29 = f28 - (f25 * f26);
        float f30 = rectF.right;
        float f31 = f28 - (f27 * f30);
        float f32 = f19 - f26;
        float f33 = (f29 - f21) / f32;
        if (f33 < f30) {
            f10 = f33;
        } else {
            f10 = o10;
        }
        float max = Math.max(o10, f10);
        float f34 = (f29 - f22) / (f20 - f26);
        if (f34 >= rectF.right) {
            f34 = max;
        }
        float max2 = Math.max(max, f34);
        float f35 = f20 - f27;
        float f36 = (f31 - f24) / f35;
        if (f36 >= rectF.right) {
            f36 = max2;
        }
        float max3 = Math.max(max2, f36);
        float f37 = (f31 - f22) / f35;
        if (f37 <= rectF.left) {
            f37 = p10;
        }
        float min = Math.min(p10, f37);
        float f38 = (f31 - f23) / (f19 - f27);
        if (f38 <= rectF.left) {
            f38 = min;
        }
        float min2 = Math.min(min, f38);
        float f39 = (f29 - f23) / f32;
        if (f39 <= rectF.left) {
            f39 = min2;
        }
        float min3 = Math.min(min2, f39);
        float max4 = Math.max(q10, Math.max((f19 * max3) + f21, (f20 * min3) + f22));
        float min4 = Math.min(m10, Math.min((f20 * max3) + f24, (f19 * min3) + f23));
        rectF2.left = max3;
        rectF2.top = max4;
        rectF2.right = min3;
        rectF2.bottom = min4;
        return true;
    }

    public final void b(boolean z10) {
        try {
            a aVar = this.f6040y;
            if (aVar != null) {
                int i6 = CropImageView.f6011g0;
                ((CropImageView) ((f0.b) aVar).f14603v).c(z10, true);
            }
        } catch (Exception e10) {
            Log.e("AIC", "Exception in crop window changed", e10);
        }
    }

    public final void c(Canvas canvas) {
        float f;
        if (this.C != null) {
            Paint paint = this.A;
            if (paint != null) {
                f = paint.getStrokeWidth();
            } else {
                f = 0.0f;
            }
            RectF f2 = this.f6039x.f();
            f2.inset(f, f);
            float width = f2.width() / 3.0f;
            float height = f2.height() / 3.0f;
            int ordinal = this.U.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        throw new IllegalStateException("Unrecognized crop shape");
                    }
                } else {
                    float width2 = (f2.width() / 2.0f) - f;
                    float height2 = (f2.height() / 2.0f) - f;
                    float f10 = f2.left + width;
                    float f11 = f2.right - width;
                    float sin = (float) (Math.sin(Math.acos((width2 - width) / width2)) * height2);
                    canvas.drawLine(f10, (f2.top + height2) - sin, f10, (f2.bottom - height2) + sin, this.C);
                    canvas.drawLine(f11, (f2.top + height2) - sin, f11, (f2.bottom - height2) + sin, this.C);
                    float f12 = f2.top + height;
                    float f13 = f2.bottom - height;
                    float cos = (float) (Math.cos(Math.asin((height2 - height) / height2)) * width2);
                    canvas.drawLine((f2.left + width2) - cos, f12, (f2.right - width2) + cos, f12, this.C);
                    canvas.drawLine((f2.left + width2) - cos, f13, (f2.right - width2) + cos, f13, this.C);
                    return;
                }
            }
            float f14 = f2.left + width;
            float f15 = f2.right - width;
            canvas.drawLine(f14, f2.top, f14, f2.bottom, this.C);
            canvas.drawLine(f15, f2.top, f15, f2.bottom, this.C);
            float f16 = f2.top + height;
            float f17 = f2.bottom - height;
            canvas.drawLine(f2.left, f16, f2.right, f16, this.C);
            canvas.drawLine(f2.left, f17, f2.right, f17, this.C);
        }
    }

    public final void d(RectF rectF) {
        float width = rectF.width();
        g gVar = this.f6039x;
        if (width < gVar.e()) {
            float e10 = (gVar.e() - rectF.width()) / 2.0f;
            rectF.left -= e10;
            rectF.right += e10;
        }
        if (rectF.height() < gVar.d()) {
            float d10 = (gVar.d() - rectF.height()) / 2.0f;
            rectF.top -= d10;
            rectF.bottom += d10;
        }
        if (rectF.width() > gVar.c()) {
            float width2 = (rectF.width() - gVar.c()) / 2.0f;
            rectF.left += width2;
            rectF.right -= width2;
        }
        if (rectF.height() > gVar.b()) {
            float height = (rectF.height() - gVar.b()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        a(rectF);
        RectF rectF2 = this.G;
        if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
            float max = Math.max(rectF2.left, 0.0f);
            float max2 = Math.max(rectF2.top, 0.0f);
            float min = Math.min(rectF2.right, getWidth());
            float min2 = Math.min(rectF2.bottom, getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.P && Math.abs(rectF.width() - (rectF.height() * this.S)) > 0.1d) {
            if (rectF.width() > rectF.height() * this.S) {
                float abs = Math.abs((rectF.height() * this.S) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.S) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    public final void f() {
        float[] fArr = this.F;
        float max = Math.max(c.o(fArr), 0.0f);
        float max2 = Math.max(c.q(fArr), 0.0f);
        float min = Math.min(c.p(fArr), getWidth());
        float min2 = Math.min(c.m(fArr), getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.W = true;
            float f = this.L;
            float f2 = min - max;
            float f10 = f * f2;
            float f11 = min2 - max2;
            float f12 = f * f11;
            Rect rect = this.V;
            int width = rect.width();
            g gVar = this.f6039x;
            if (width > 0 && rect.height() > 0) {
                float f13 = (rect.left / gVar.f14853k) + max;
                rectF.left = f13;
                rectF.top = (rect.top / gVar.f14854l) + max2;
                rectF.right = (rect.width() / gVar.f14853k) + f13;
                rectF.bottom = (rect.height() / gVar.f14854l) + rectF.top;
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (this.P && min > max && min2 > max2) {
                if (f2 / f11 > this.S) {
                    rectF.top = max2 + f12;
                    rectF.bottom = min2 - f12;
                    float width2 = getWidth() / 2.0f;
                    this.S = this.Q / this.R;
                    float max3 = Math.max(gVar.e(), rectF.height() * this.S) / 2.0f;
                    rectF.left = width2 - max3;
                    rectF.right = width2 + max3;
                } else {
                    rectF.left = max + f10;
                    rectF.right = min - f10;
                    float height = getHeight() / 2.0f;
                    float max4 = Math.max(gVar.d(), rectF.width() / this.S) / 2.0f;
                    rectF.top = height - max4;
                    rectF.bottom = height + max4;
                }
            } else {
                rectF.left = max + f10;
                rectF.top = max2 + f12;
                rectF.right = min - f10;
                rectF.bottom = min2 - f12;
            }
            d(rectF);
            gVar.h(rectF);
        }
    }

    public final void g(float[] fArr, int i6, int i10) {
        float[] fArr2 = this.F;
        if (fArr == null || !Arrays.equals(fArr2, fArr)) {
            if (fArr == null) {
                Arrays.fill(fArr2, 0.0f);
            } else {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            }
            this.H = i6;
            this.I = i10;
            RectF f = this.f6039x.f();
            if (f.width() == 0.0f || f.height() == 0.0f) {
                f();
            }
        }
    }

    public int getAspectRatioX() {
        return this.Q;
    }

    public int getAspectRatioY() {
        return this.R;
    }

    public CropImageView.b getCropShape() {
        return this.U;
    }

    public RectF getCropWindowRect() {
        return this.f6039x.f();
    }

    public CropImageView.c getGuidelines() {
        return this.T;
    }

    public Rect getInitialCropWindowRect() {
        return this.V;
    }

    public final boolean h(boolean z10) {
        if (this.f6037v != z10) {
            this.f6037v = z10;
            if (z10 && this.f6036u == null) {
                this.f6036u = new ScaleGestureDetector(getContext(), new b());
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i6;
        boolean z10;
        int i10;
        boolean z11;
        RectF rectF;
        float f;
        Paint paint;
        float f2;
        RectF f10;
        int ordinal;
        super.onDraw(canvas);
        g gVar = this.f6039x;
        RectF f11 = gVar.f();
        float[] fArr = this.F;
        float max = Math.max(c.o(fArr), 0.0f);
        float max2 = Math.max(c.q(fArr), 0.0f);
        float min = Math.min(c.p(fArr), getWidth());
        float min2 = Math.min(c.m(fArr), getHeight());
        int ordinal2 = this.U.ordinal();
        Path path = this.E;
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2 && ordinal2 != 3) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
            } else {
                path.reset();
                int i11 = Build.VERSION.SDK_INT;
                RectF rectF2 = this.f6041z;
                rectF2.set(f11.left, f11.top, f11.right, f11.bottom);
                path.addOval(rectF2, Path.Direction.CW);
                canvas.save();
                if (i11 >= 26) {
                    canvas.clipOutPath(path);
                } else {
                    canvas.clipPath(path, Region.Op.XOR);
                }
                i6 = 2;
                canvas.drawRect(max, max2, min, min2, this.D);
                canvas.restore();
                i10 = 1;
                z11 = false;
                rectF = gVar.f14844a;
                f = 100;
                if (rectF.width() >= f && rectF.height() >= f) {
                    z11 = true;
                }
                if (z11) {
                    CropImageView.c cVar = this.T;
                    if (cVar == CropImageView.c.ON) {
                        c(canvas);
                    } else if (cVar == CropImageView.c.ON_TOUCH && this.O != null) {
                        c(canvas);
                    }
                }
                paint = this.A;
                if (paint != null) {
                    float strokeWidth = paint.getStrokeWidth();
                    RectF f12 = gVar.f();
                    float f13 = strokeWidth / 2.0f;
                    f12.inset(f13, f13);
                    int ordinal3 = this.U.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != i10) {
                            if (ordinal3 != i6 && ordinal3 != 3) {
                                throw new IllegalStateException("Unrecognized crop shape");
                            }
                        } else {
                            canvas.drawOval(f12, this.A);
                        }
                    }
                    canvas.drawRect(f12, this.A);
                }
                if (this.B == null) {
                    Paint paint2 = this.A;
                    if (paint2 != null) {
                        f2 = paint2.getStrokeWidth();
                    } else {
                        f2 = 0.0f;
                    }
                    float strokeWidth2 = this.B.getStrokeWidth();
                    float f14 = (strokeWidth2 - f2) / 2.0f;
                    float f15 = strokeWidth2 / 2.0f;
                    float f16 = f15 + f14;
                    int ordinal4 = this.U.ordinal();
                    if (ordinal4 != 0) {
                        if (ordinal4 != i10) {
                            if (ordinal4 != i6 && ordinal4 != 3) {
                                throw new IllegalStateException("Unrecognized crop shape");
                            }
                        }
                        f10 = gVar.f();
                        f10.inset(f15, f15);
                        ordinal = this.U.ordinal();
                        if (ordinal == 0 && ordinal != i10) {
                            if (ordinal != i6) {
                                if (ordinal == 3) {
                                    canvas.drawLine(f10.left - f14, f10.centerY() - this.K, f10.left - f14, this.K + f10.centerY(), this.B);
                                    canvas.drawLine(f10.right + f14, f10.centerY() - this.K, f10.right + f14, this.K + f10.centerY(), this.B);
                                    return;
                                }
                                throw new IllegalStateException("Unrecognized crop shape");
                            }
                            canvas.drawLine(f10.centerX() - this.K, f10.top - f14, this.K + f10.centerX(), f10.top - f14, this.B);
                            canvas.drawLine(f10.centerX() - this.K, f10.bottom + f14, this.K + f10.centerX(), f10.bottom + f14, this.B);
                            return;
                        }
                        float f17 = f10.left - f14;
                        float f18 = f10.top;
                        canvas.drawLine(f17, f18 - f16, f17, f18 + this.K, this.B);
                        float f19 = f10.left;
                        float f20 = f10.top - f14;
                        canvas.drawLine(f19 - f16, f20, this.K + f19, f20, this.B);
                        float f21 = f10.right + f14;
                        float f22 = f10.top;
                        canvas.drawLine(f21, f22 - f16, f21, f22 + this.K, this.B);
                        float f23 = f10.right;
                        float f24 = f10.top - f14;
                        canvas.drawLine(f23 + f16, f24, f23 - this.K, f24, this.B);
                        float f25 = f10.left - f14;
                        float f26 = f10.bottom;
                        canvas.drawLine(f25, f26 + f16, f25, f26 - this.K, this.B);
                        float f27 = f10.left;
                        float f28 = f10.bottom + f14;
                        canvas.drawLine(f27 - f16, f28, this.K + f27, f28, this.B);
                        float f29 = f10.right + f14;
                        float f30 = f10.bottom;
                        canvas.drawLine(f29, f30 + f16, f29, f30 - this.K, this.B);
                        float f31 = f10.right;
                        float f32 = f10.bottom + f14;
                        canvas.drawLine(f31 + f16, f32, f31 - this.K, f32, this.B);
                        return;
                    }
                    f15 += this.J;
                    f10 = gVar.f();
                    f10.inset(f15, f15);
                    ordinal = this.U.ordinal();
                    if (ordinal == 0) {
                    }
                    float f172 = f10.left - f14;
                    float f182 = f10.top;
                    canvas.drawLine(f172, f182 - f16, f172, f182 + this.K, this.B);
                    float f192 = f10.left;
                    float f202 = f10.top - f14;
                    canvas.drawLine(f192 - f16, f202, this.K + f192, f202, this.B);
                    float f212 = f10.right + f14;
                    float f222 = f10.top;
                    canvas.drawLine(f212, f222 - f16, f212, f222 + this.K, this.B);
                    float f232 = f10.right;
                    float f242 = f10.top - f14;
                    canvas.drawLine(f232 + f16, f242, f232 - this.K, f242, this.B);
                    float f252 = f10.left - f14;
                    float f262 = f10.bottom;
                    canvas.drawLine(f252, f262 + f16, f252, f262 - this.K, this.B);
                    float f272 = f10.left;
                    float f282 = f10.bottom + f14;
                    canvas.drawLine(f272 - f16, f282, this.K + f272, f282, this.B);
                    float f292 = f10.right + f14;
                    float f302 = f10.bottom;
                    canvas.drawLine(f292, f302 + f16, f292, f302 - this.K, this.B);
                    float f312 = f10.right;
                    float f322 = f10.bottom + f14;
                    canvas.drawLine(f312 + f16, f322, f312 - this.K, f322, this.B);
                    return;
                }
                return;
            }
        }
        i6 = 2;
        if (fArr[0] != fArr[6] && fArr[1] != fArr[7]) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i12 = Build.VERSION.SDK_INT;
            path.reset();
            z11 = false;
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.close();
            canvas.save();
            if (i12 >= 26) {
                canvas.clipOutPath(path);
            } else {
                canvas.clipPath(path, Region.Op.INTERSECT);
            }
            canvas.clipRect(f11, Region.Op.XOR);
            i10 = 1;
            canvas.drawRect(max, max2, min, min2, this.D);
            canvas.restore();
        } else {
            i10 = 1;
            z11 = false;
            canvas.drawRect(max, max2, min, f11.top, this.D);
            canvas.drawRect(max, f11.bottom, min, min2, this.D);
            canvas.drawRect(max, f11.top, f11.left, f11.bottom, this.D);
            canvas.drawRect(f11.right, f11.top, min, f11.bottom, this.D);
        }
        rectF = gVar.f14844a;
        f = 100;
        if (rectF.width() >= f) {
            z11 = true;
        }
        if (z11) {
        }
        paint = this.A;
        if (paint != null) {
        }
        if (this.B == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x03a0, code lost:
        if (f5.g.g(r1, r3, r14.left, r14.top, r14.right, r14.bottom) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03dc, code lost:
        if (f5.g.g(r1, r3, r14.left, r14.top, r14.right, r14.bottom) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0406, code lost:
        if (r3 < r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0419, code lost:
        if (r15 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0424, code lost:
        if (r3 < r4) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04b8, code lost:
        if ((!r19) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0570, code lost:
        if ((!r19) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0572, code lost:
        r2 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        if (r8 <= r14.right) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (r2 <= r14.bottom) goto L36;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        RectF rectF;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        h hVar;
        boolean z21;
        float f;
        int i6 = 0;
        if (!isEnabled()) {
            return false;
        }
        if (this.f6037v) {
            this.f6036u.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        g gVar = this.f6039x;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (this.O != null) {
                        float f2 = this.N;
                        RectF rect = gVar.f();
                        if (a(rect)) {
                            f2 = 0.0f;
                        }
                        h hVar2 = this.O;
                        RectF bounds = this.G;
                        int i10 = this.H;
                        int i11 = this.I;
                        boolean z22 = this.P;
                        float f10 = this.S;
                        hVar2.getClass();
                        i.g(rect, "rect");
                        i.g(bounds, "bounds");
                        PointF pointF = hVar2.f14859e;
                        float f11 = x10 + pointF.x;
                        float f12 = y10 + pointF.y;
                        int i12 = hVar2.f;
                        if (i12 == 9) {
                            float centerX = f11 - rect.centerX();
                            float centerY = f12 - rect.centerY();
                            float f13 = rect.left + centerX;
                            float f14 = 0;
                            if (f13 >= f14) {
                                float f15 = rect.right + centerX;
                                if (f15 <= i10) {
                                    if (f13 >= bounds.left) {
                                    }
                                }
                            }
                            centerX /= 1.05f;
                            pointF.x -= centerX / 2;
                            float f16 = rect.top + centerY;
                            if (f16 >= f14) {
                                float f17 = rect.bottom + centerY;
                                if (f17 <= i11) {
                                    if (f16 >= bounds.top) {
                                    }
                                }
                            }
                            centerY /= 1.05f;
                            pointF.y -= centerY / 2;
                            rect.offset(centerX, centerY);
                            float f18 = rect.left;
                            float f19 = bounds.left;
                            if (f18 < f19 + f2) {
                                float f20 = f19 - f18;
                                f = 0.0f;
                                rect.offset(f20, 0.0f);
                            } else {
                                f = 0.0f;
                            }
                            float f21 = rect.top;
                            float f22 = bounds.top;
                            if (f21 < f22 + f2) {
                                rect.offset(f, f22 - f21);
                            }
                            float f23 = rect.right;
                            float f24 = bounds.right;
                            if (f23 > f24 - f2) {
                                rect.offset(f24 - f23, f);
                            }
                            float f25 = rect.bottom;
                            float f26 = bounds.bottom;
                            if (f25 > f26 - f2) {
                                rect.offset(f, f26 - f25);
                            }
                        } else if (z22) {
                            switch (v.h.d(i12)) {
                                case 0:
                                    if ((rect.right - f11) / (rect.bottom - f12) < f10) {
                                        hVar2.e(rect, f12, bounds, f2, f10, true, false);
                                        rect.left = rect.right - (rect.height() * f10);
                                        break;
                                    } else {
                                        hVar2.b(rect, f11, bounds, f2, f10, true, false);
                                        rect.top = rect.bottom - (rect.width() / f10);
                                        break;
                                    }
                                case 1:
                                    if ((f11 - rect.left) / (rect.bottom - f12) < f10) {
                                        hVar2.e(rect, f12, bounds, f2, f10, false, true);
                                        rect.right = (rect.height() * f10) + rect.left;
                                        break;
                                    } else {
                                        hVar2.d(rect, f11, bounds, i10, f2, f10, true, false);
                                        rect.top = rect.bottom - (rect.width() / f10);
                                        break;
                                    }
                                case 2:
                                    if ((rect.right - f11) / (f12 - rect.top) < f10) {
                                        hVar2.a(rect, f12, bounds, i11, f2, f10, true, false);
                                        rect.left = rect.right - (rect.height() * f10);
                                        break;
                                    } else {
                                        hVar2.b(rect, f11, bounds, f2, f10, false, true);
                                        rect.bottom = (rect.width() / f10) + rect.top;
                                        break;
                                    }
                                case 3:
                                    if ((f11 - rect.left) / (f12 - rect.top) < f10) {
                                        hVar2.a(rect, f12, bounds, i11, f2, f10, false, true);
                                        rect.right = (rect.height() * f10) + rect.left;
                                        break;
                                    } else {
                                        hVar2.d(rect, f11, bounds, i10, f2, f10, false, true);
                                        rect.bottom = (rect.width() / f10) + rect.top;
                                        break;
                                    }
                                case 4:
                                    hVar2.b(rect, f11, bounds, f2, f10, true, true);
                                    h.f(rect, bounds, f10);
                                    break;
                                case 5:
                                    hVar2.e(rect, f12, bounds, f2, f10, true, true);
                                    h.c(rect, bounds, f10);
                                    break;
                                case 6:
                                    hVar2.d(rect, f11, bounds, i10, f2, f10, true, true);
                                    h.f(rect, bounds, f10);
                                    break;
                                case 7:
                                    hVar2.a(rect, f12, bounds, i11, f2, f10, true, true);
                                    h.c(rect, bounds, f10);
                                    break;
                            }
                        } else {
                            switch (v.h.d(i12)) {
                                case 0:
                                    float f27 = f2;
                                    hVar2.e(rect, f12, bounds, f27, 0.0f, false, false);
                                    hVar2.b(rect, f11, bounds, f27, 0.0f, false, false);
                                    break;
                                case 1:
                                    hVar2.e(rect, f12, bounds, f2, 0.0f, false, false);
                                    hVar2.d(rect, f11, bounds, i10, f2, 0.0f, false, false);
                                    break;
                                case 2:
                                    hVar2.a(rect, f12, bounds, i11, f2, 0.0f, false, false);
                                    hVar2.b(rect, f11, bounds, f2, 0.0f, false, false);
                                    break;
                                case 3:
                                    float f28 = f2;
                                    hVar2.a(rect, f12, bounds, i11, f28, 0.0f, false, false);
                                    hVar2.d(rect, f11, bounds, i10, f28, 0.0f, false, false);
                                    break;
                                case 4:
                                    hVar2.b(rect, f11, bounds, f2, 0.0f, false, false);
                                    break;
                                case 5:
                                    hVar2.e(rect, f12, bounds, f2, 0.0f, false, false);
                                    break;
                                case 6:
                                    hVar2.d(rect, f11, bounds, i10, f2, 0.0f, false, false);
                                    break;
                                case 7:
                                    hVar2.a(rect, f12, bounds, i11, f2, 0.0f, false, false);
                                    break;
                            }
                        }
                        gVar.h(rect);
                        z21 = true;
                        b(true);
                        invalidate();
                    } else {
                        z21 = true;
                    }
                    getParent().requestDisallowInterceptTouchEvent(z21);
                    return z21;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            if (this.O != null) {
                this.O = null;
                b(false);
                invalidate();
            }
            return true;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        float f29 = this.M;
        CropImageView.b cropShape = this.U;
        boolean z23 = this.f6038w;
        gVar.getClass();
        i.g(cropShape, "cropShape");
        int ordinal = cropShape.ordinal();
        RectF rectF2 = gVar.f14844a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (g.a(x11, y11, rectF2.left, rectF2.centerY()) > f29) {
                            if (g.a(x11, y11, rectF2.right, rectF2.centerY()) > f29) {
                                if (z23) {
                                }
                            }
                            i6 = 7;
                        }
                        i6 = 5;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (g.a(x11, y11, rectF2.centerX(), rectF2.top) > f29) {
                        if (g.a(x11, y11, rectF2.centerX(), rectF2.bottom) > f29) {
                            if (z23) {
                            }
                        }
                        i6 = 8;
                    }
                    i6 = 6;
                }
            } else {
                float f30 = 6;
                float width = rectF2.width() / f30;
                float f31 = rectF2.left;
                float f32 = f31 + width;
                float f33 = 5;
                float f34 = (width * f33) + f31;
                float height = rectF2.height() / f30;
                float f35 = rectF2.top;
                float f36 = f35 + height;
                float f37 = (f33 * height) + f35;
                if (x11 < f32) {
                    if (y11 >= f36) {
                    }
                    i6 = 1;
                } else if (x11 < f34) {
                    if (y11 >= f36) {
                        if (y11 < f37) {
                        }
                        i6 = 8;
                    }
                    i6 = 6;
                } else {
                    if (y11 >= f36) {
                    }
                    i6 = 2;
                }
            }
        } else {
            if (g.a(x11, y11, rectF2.left, rectF2.top) <= f29) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (g.a(x11, y11, rectF2.right, rectF2.top) <= f29) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (g.a(x11, y11, rectF2.left, rectF2.bottom) <= f29) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (g.a(x11, y11, rectF2.right, rectF2.bottom) <= f29) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            if (z23) {
                                z14 = z23;
                                if (g.g(x11, y11, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom)) {
                                    float f38 = 100;
                                    if (rectF2.width() >= f38 && rectF2.height() >= f38) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                }
                                rectF = rectF2;
                            } else {
                                z14 = z23;
                                rectF = rectF2;
                            }
                            float f39 = rectF.left;
                            float f40 = rectF.right;
                            float f41 = rectF.top;
                            if (x11 > f39 && x11 < f40 && Math.abs(y11 - f41) <= f29) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (!z15) {
                                float f42 = rectF.left;
                                float f43 = rectF.right;
                                float f44 = rectF.bottom;
                                if (x11 > f42 && x11 < f43 && Math.abs(y11 - f44) <= f29) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (!z16) {
                                    float f45 = rectF.left;
                                    float f46 = rectF.top;
                                    float f47 = rectF.bottom;
                                    if (Math.abs(x11 - f45) <= f29 && y11 > f46 && y11 < f47) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if (!z17) {
                                        float f48 = rectF.right;
                                        float f49 = rectF.top;
                                        float f50 = rectF.bottom;
                                        if (Math.abs(x11 - f48) <= f29 && y11 > f49 && y11 < f50) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        if (!z18) {
                                            if (z14 && g.g(x11, y11, rectF.left, rectF.top, rectF.right, rectF.bottom)) {
                                                float f51 = 100;
                                                if (rectF.width() >= f51 && rectF.height() >= f51) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                            }
                                        }
                                        i6 = 7;
                                    }
                                    i6 = 5;
                                }
                                i6 = 8;
                            }
                            i6 = 6;
                        }
                        i6 = 4;
                    }
                    i6 = 3;
                }
                i6 = 2;
            }
            i6 = 1;
        }
        if (i6 != 0) {
            hVar = new h(i6, gVar, x11, y11);
        } else {
            hVar = null;
        }
        this.O = hVar;
        if (hVar != null) {
            invalidate();
            return true;
        }
        return true;
    }

    public void setAspectRatioX(int i6) {
        if (i6 > 0) {
            if (this.Q != i6) {
                this.Q = i6;
                this.S = i6 / this.R;
                if (this.W) {
                    f();
                    invalidate();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
    }

    public void setAspectRatioY(int i6) {
        if (i6 > 0) {
            if (this.R != i6) {
                this.R = i6;
                this.S = this.Q / i6;
                if (this.W) {
                    f();
                    invalidate();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
    }

    public void setCropShape(CropImageView.b bVar) {
        if (this.U != bVar) {
            this.U = bVar;
            invalidate();
        }
    }

    public void setCropWindowChangeListener(a aVar) {
        this.f6040y = aVar;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f6039x.h(rectF);
    }

    public void setFixedAspectRatio(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (this.W) {
                f();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.c cVar) {
        if (this.T != cVar) {
            this.T = cVar;
            if (this.W) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(f options) {
        g gVar = this.f6039x;
        gVar.getClass();
        i.g(options, "options");
        gVar.f14846c = options.S;
        gVar.f14847d = options.T;
        gVar.f14849g = options.U;
        gVar.f14850h = options.V;
        gVar.f14851i = options.W;
        gVar.f14852j = options.X;
        setCropShape(options.f14838u);
        setSnapRadius(options.f14839v);
        setGuidelines(options.f14841x);
        setFixedAspectRatio(options.G);
        setAspectRatioX(options.H);
        setAspectRatioY(options.I);
        h(options.C);
        boolean z10 = options.D;
        if (this.f6038w != z10) {
            this.f6038w = z10;
        }
        this.M = options.f14840w;
        this.L = options.F;
        this.A = e(options.J, options.K);
        this.J = options.M;
        this.K = options.N;
        this.B = e(options.L, options.O);
        this.C = e(options.P, options.Q);
        int i6 = options.R;
        Paint paint = new Paint();
        paint.setColor(i6);
        this.D = paint;
    }

    public void setInitialCropWindowRect(Rect rect) {
        if (rect == null) {
            rect = c.f6078a;
        }
        this.V.set(rect);
        if (this.W) {
            f();
            invalidate();
            b(false);
        }
    }

    public void setSnapRadius(float f) {
        this.N = f;
    }
}
