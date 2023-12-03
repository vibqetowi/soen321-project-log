package f5;

import android.graphics.RectF;
import kotlin.jvm.internal.i;
/* compiled from: CropWindowHandler.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public float f14846c;

    /* renamed from: d  reason: collision with root package name */
    public float f14847d;

    /* renamed from: e  reason: collision with root package name */
    public float f14848e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f14849g;

    /* renamed from: h  reason: collision with root package name */
    public float f14850h;

    /* renamed from: i  reason: collision with root package name */
    public float f14851i;

    /* renamed from: j  reason: collision with root package name */
    public float f14852j;

    /* renamed from: a  reason: collision with root package name */
    public final RectF f14844a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f14845b = new RectF();

    /* renamed from: k  reason: collision with root package name */
    public float f14853k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f14854l = 1.0f;

    public static float a(float f, float f2, float f10, float f11) {
        return Math.max(Math.abs(f - f10), Math.abs(f2 - f11));
    }

    public static boolean g(float f, float f2, float f10, float f11, float f12, float f13) {
        if (f > f10 && f < f12 && f2 > f11 && f2 < f13) {
            return true;
        }
        return false;
    }

    public final float b() {
        float f = this.f;
        float f2 = this.f14852j / this.f14854l;
        if (f > f2) {
            return f2;
        }
        return f;
    }

    public final float c() {
        float f = this.f14848e;
        float f2 = this.f14851i / this.f14853k;
        if (f > f2) {
            return f2;
        }
        return f;
    }

    public final float d() {
        float f = this.f14847d;
        float f2 = this.f14850h / this.f14854l;
        if (f < f2) {
            return f2;
        }
        return f;
    }

    public final float e() {
        float f = this.f14846c;
        float f2 = this.f14849g / this.f14853k;
        if (f < f2) {
            return f2;
        }
        return f;
    }

    public final RectF f() {
        RectF rectF = this.f14845b;
        rectF.set(this.f14844a);
        return rectF;
    }

    public final void h(RectF rect) {
        i.g(rect, "rect");
        this.f14844a.set(rect);
    }
}
