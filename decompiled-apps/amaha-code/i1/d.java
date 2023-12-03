package i1;

import android.view.animation.Interpolator;
/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f19655a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19656b;

    public d(float[] fArr) {
        this.f19655a = fArr;
        this.f19656b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f19655a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f19656b;
        float f10 = fArr[min];
        return e.e(fArr[min + 1], f10, (f - (min * f2)) / f2, f10);
    }
}
