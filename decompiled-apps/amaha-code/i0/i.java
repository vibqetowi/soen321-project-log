package i0;
/* compiled from: ViewingConditions.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: k  reason: collision with root package name */
    public static final i f19642k;

    /* renamed from: a  reason: collision with root package name */
    public final float f19643a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19644b;

    /* renamed from: c  reason: collision with root package name */
    public final float f19645c;

    /* renamed from: d  reason: collision with root package name */
    public final float f19646d;

    /* renamed from: e  reason: collision with root package name */
    public final float f19647e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f19648g;

    /* renamed from: h  reason: collision with root package name */
    public final float f19649h;

    /* renamed from: i  reason: collision with root package name */
    public final float f19650i;

    /* renamed from: j  reason: collision with root package name */
    public final float f19651j;

    static {
        float f;
        float f2;
        float[] fArr = sc.b.E;
        float l02 = (float) ((sc.b.l0() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = sc.b.C;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr[1];
        float f12 = fArr3[1] * f11;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12 + (fArr3[0] * f10);
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f10 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f = 0.100000046f;
            f2 = 0.59f;
        } else {
            f = 0.12999998f;
            f2 = 0.525f;
        }
        float f17 = f + f2;
        float exp = (1.0f - (((float) Math.exp(((-l02) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * l02) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(l02 * 5.0d))) + (f19 * l02);
        float l03 = sc.b.l0() / fArr[1];
        double d11 = l03;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f16) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f15) / 100.0d, 0.42d), pow2};
        float f21 = fArr7[0];
        float f22 = fArr7[1];
        f19642k = new i(l03, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f21 * 400.0f) / (f21 + 27.13f)) * 2.0f) + ((f22 * 400.0f) / (f22 + 27.13f))) * pow, pow, pow, f17, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public i(float f, float f2, float f10, float f11, float f12, float f13, float[] fArr, float f14, float f15, float f16) {
        this.f = f;
        this.f19643a = f2;
        this.f19644b = f10;
        this.f19645c = f11;
        this.f19646d = f12;
        this.f19647e = f13;
        this.f19648g = fArr;
        this.f19649h = f14;
        this.f19650i = f15;
        this.f19651j = f16;
    }
}
