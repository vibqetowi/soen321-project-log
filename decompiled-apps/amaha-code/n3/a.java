package n3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
/* compiled from: Keyframe.java */
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final a3.c f25861a;

    /* renamed from: b  reason: collision with root package name */
    public final T f25862b;

    /* renamed from: c  reason: collision with root package name */
    public T f25863c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f25864d;

    /* renamed from: e  reason: collision with root package name */
    public final float f25865e;
    public Float f;

    /* renamed from: g  reason: collision with root package name */
    public float f25866g;

    /* renamed from: h  reason: collision with root package name */
    public float f25867h;

    /* renamed from: i  reason: collision with root package name */
    public int f25868i;

    /* renamed from: j  reason: collision with root package name */
    public int f25869j;

    /* renamed from: k  reason: collision with root package name */
    public float f25870k;

    /* renamed from: l  reason: collision with root package name */
    public float f25871l;

    /* renamed from: m  reason: collision with root package name */
    public PointF f25872m;

    /* renamed from: n  reason: collision with root package name */
    public PointF f25873n;

    public a(a3.c cVar, T t3, T t10, Interpolator interpolator, float f, Float f2) {
        this.f25866g = -3987645.8f;
        this.f25867h = -3987645.8f;
        this.f25868i = 784923401;
        this.f25869j = 784923401;
        this.f25870k = Float.MIN_VALUE;
        this.f25871l = Float.MIN_VALUE;
        this.f25872m = null;
        this.f25873n = null;
        this.f25861a = cVar;
        this.f25862b = t3;
        this.f25863c = t10;
        this.f25864d = interpolator;
        this.f25865e = f;
        this.f = f2;
    }

    public final float a() {
        a3.c cVar = this.f25861a;
        if (cVar == null) {
            return 1.0f;
        }
        if (this.f25871l == Float.MIN_VALUE) {
            if (this.f == null) {
                this.f25871l = 1.0f;
            } else {
                this.f25871l = ((this.f.floatValue() - this.f25865e) / (cVar.f186l - cVar.f185k)) + b();
            }
        }
        return this.f25871l;
    }

    public final float b() {
        a3.c cVar = this.f25861a;
        if (cVar == null) {
            return 0.0f;
        }
        if (this.f25870k == Float.MIN_VALUE) {
            float f = cVar.f185k;
            this.f25870k = (this.f25865e - f) / (cVar.f186l - f);
        }
        return this.f25870k;
    }

    public final boolean c() {
        if (this.f25864d == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f25862b + ", endValue=" + this.f25863c + ", startFrame=" + this.f25865e + ", endFrame=" + this.f + ", interpolator=" + this.f25864d + '}';
    }

    public a(T t3) {
        this.f25866g = -3987645.8f;
        this.f25867h = -3987645.8f;
        this.f25868i = 784923401;
        this.f25869j = 784923401;
        this.f25870k = Float.MIN_VALUE;
        this.f25871l = Float.MIN_VALUE;
        this.f25872m = null;
        this.f25873n = null;
        this.f25861a = null;
        this.f25862b = t3;
        this.f25863c = t3;
        this.f25864d = null;
        this.f25865e = Float.MIN_VALUE;
        this.f = Float.valueOf(Float.MAX_VALUE);
    }
}
