package ab;

import android.animation.TypeEvaluator;
/* compiled from: ArgbEvaluatorCompat.java */
/* loaded from: classes.dex */
public final class b implements TypeEvaluator<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f454a = new b();

    @Override // android.animation.TypeEvaluator
    public final Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float e10 = defpackage.e.e(((intValue2 >> 24) & 255) / 255.0f, f2, f, f2);
        float e11 = defpackage.e.e(pow4, pow, f, pow);
        float e12 = defpackage.e.e((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f, pow2);
        float e13 = defpackage.e.e((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow(e11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(e13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(e10 * 255.0f) << 24) | (Math.round(((float) Math.pow(e12, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
