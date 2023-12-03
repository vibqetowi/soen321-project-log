package w;
/* compiled from: SpringStopEngine.java */
/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: b  reason: collision with root package name */
    public double f36246b;

    /* renamed from: c  reason: collision with root package name */
    public double f36247c;

    /* renamed from: d  reason: collision with root package name */
    public float f36248d;

    /* renamed from: e  reason: collision with root package name */
    public float f36249e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f36250g;

    /* renamed from: h  reason: collision with root package name */
    public float f36251h;

    /* renamed from: a  reason: collision with root package name */
    public double f36245a = 0.5d;

    /* renamed from: i  reason: collision with root package name */
    public int f36252i = 0;

    @Override // w.n
    public final boolean a() {
        double d10 = this.f36249e - this.f36247c;
        double d11 = this.f36246b;
        double d12 = this.f;
        if (Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * this.f36250g)) / d11) <= this.f36251h) {
            return true;
        }
        return false;
    }

    @Override // w.n
    public final float b() {
        return 0.0f;
    }

    @Override // w.n
    public final float getInterpolation(float f) {
        l lVar = this;
        float f2 = f;
        double d10 = f2 - lVar.f36248d;
        double d11 = lVar.f36246b;
        double d12 = lVar.f36245a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d11 / lVar.f36250g) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / sqrt;
        int i6 = 0;
        while (i6 < sqrt) {
            double d14 = lVar.f36249e;
            double d15 = lVar.f36247c;
            int i10 = sqrt;
            int i11 = i6;
            double d16 = lVar.f;
            double d17 = lVar.f36250g;
            double d18 = ((((((-d11) * (d14 - d15)) - (d16 * d12)) / d17) * d13) / 2.0d) + d16;
            double d19 = ((((-((((d13 * d18) / 2.0d) + d14) - d15)) * d11) - (d18 * d12)) / d17) * d13;
            float f10 = (float) (d16 + d19);
            this.f = f10;
            float f11 = (float) ((((d19 / 2.0d) + d16) * d13) + d14);
            this.f36249e = f11;
            int i12 = this.f36252i;
            if (i12 > 0) {
                if (f11 < 0.0f && (i12 & 1) == 1) {
                    this.f36249e = -f11;
                    this.f = -f10;
                }
                float f12 = this.f36249e;
                if (f12 > 1.0f && (i12 & 2) == 2) {
                    this.f36249e = 2.0f - f12;
                    this.f = -this.f;
                }
            }
            f2 = f;
            sqrt = i10;
            i6 = i11 + 1;
            lVar = this;
        }
        l lVar2 = lVar;
        lVar2.f36248d = f2;
        return lVar2.f36249e;
    }
}
