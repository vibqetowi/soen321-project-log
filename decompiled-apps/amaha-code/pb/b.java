package pb;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public final class b implements TypeEvaluator<Float> {

    /* renamed from: a  reason: collision with root package name */
    public final FloatEvaluator f28098a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f, Float f2, Float f10) {
        float floatValue = this.f28098a.evaluate(f, (Number) f2, (Number) f10).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
