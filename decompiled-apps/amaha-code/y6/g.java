package y6;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
/* compiled from: ViewPortHandler.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f38299a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f38300b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public float f38301c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f38302d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f38303e = 1.0f;
    public float f = Float.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f38304g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f38305h = Float.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public float f38306i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f38307j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f38308k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f38309l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f38310m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public final Matrix f38311n = new Matrix();

    /* renamed from: o  reason: collision with root package name */
    public final float[] f38312o = new float[9];

    public final float a() {
        return this.f38300b.width();
    }

    public final boolean b() {
        float f = this.f38306i;
        float f2 = this.f38304g;
        if (f <= f2 && f2 <= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        float f = this.f38307j;
        float f2 = this.f38303e;
        if (f <= f2 && f2 <= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean d(float f) {
        if (this.f38300b.bottom >= ((int) (f * 100.0f)) / 100.0f) {
            return true;
        }
        return false;
    }

    public final boolean e(float f) {
        if (this.f38300b.left <= f + 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean f(float f) {
        if (this.f38300b.right >= (((int) (f * 100.0f)) / 100.0f) - 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean g(float f) {
        if (this.f38300b.top <= f) {
            return true;
        }
        return false;
    }

    public final void h(Matrix matrix, RectF rectF) {
        float f;
        float f2;
        float[] fArr = this.f38312o;
        matrix.getValues(fArr);
        float f10 = fArr[2];
        float f11 = fArr[0];
        float f12 = fArr[5];
        float f13 = fArr[4];
        this.f38306i = Math.min(Math.max(this.f38304g, f11), this.f38305h);
        this.f38307j = Math.min(Math.max(this.f38303e, f13), this.f);
        if (rectF != null) {
            f = rectF.width();
            f2 = rectF.height();
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f38308k = Math.min(Math.max(f10, ((this.f38306i - 1.0f) * (-f)) - this.f38309l), this.f38309l);
        float max = Math.max(Math.min(f12, ((this.f38307j - 1.0f) * f2) + this.f38310m), -this.f38310m);
        fArr[2] = this.f38308k;
        fArr[0] = this.f38306i;
        fArr[5] = max;
        fArr[4] = this.f38307j;
        matrix.setValues(fArr);
    }

    public final float i() {
        return this.f38302d - this.f38300b.bottom;
    }

    public final void j(Matrix matrix, View view, boolean z10) {
        Matrix matrix2 = this.f38299a;
        matrix2.set(matrix);
        h(matrix2, this.f38300b);
        if (z10) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }
}
