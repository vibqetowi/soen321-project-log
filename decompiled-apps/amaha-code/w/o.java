package w;
/* compiled from: StopLogicEngine.java */
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public float f36254a;

    /* renamed from: b  reason: collision with root package name */
    public float f36255b;

    /* renamed from: c  reason: collision with root package name */
    public float f36256c;

    /* renamed from: d  reason: collision with root package name */
    public float f36257d;

    /* renamed from: e  reason: collision with root package name */
    public float f36258e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f36259g;

    /* renamed from: h  reason: collision with root package name */
    public float f36260h;

    /* renamed from: i  reason: collision with root package name */
    public float f36261i;

    /* renamed from: j  reason: collision with root package name */
    public int f36262j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f36263k = false;

    /* renamed from: l  reason: collision with root package name */
    public float f36264l;

    /* renamed from: m  reason: collision with root package name */
    public float f36265m;

    @Override // w.n
    public final boolean a() {
        if (b() < 1.0E-5f && Math.abs(this.f36261i - this.f36265m) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    @Override // w.n
    public final float b() {
        if (this.f36263k) {
            return -c(this.f36265m);
        }
        return c(this.f36265m);
    }

    public final float c(float f) {
        float f2;
        float f10;
        float f11 = this.f36257d;
        if (f <= f11) {
            f2 = this.f36254a;
            f10 = this.f36255b;
        } else {
            int i6 = this.f36262j;
            if (i6 == 1) {
                return 0.0f;
            }
            f -= f11;
            f11 = this.f36258e;
            if (f < f11) {
                f2 = this.f36255b;
                f10 = this.f36256c;
            } else if (i6 == 2) {
                return this.f36260h;
            } else {
                float f12 = f - f11;
                float f13 = this.f;
                if (f12 < f13) {
                    float f14 = this.f36256c;
                    return f14 - ((f12 * f14) / f13);
                }
                return this.f36261i;
            }
        }
        return (((f10 - f2) * f) / f11) + f2;
    }

    public final void d(float f, float f2, float f10, float f11, float f12) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f36254a = f;
        float f13 = f / f10;
        float f14 = (f13 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((f2 - ((((-f) / f10) * f) / 2.0f)) * f10);
            if (sqrt < f11) {
                this.f36262j = 2;
                this.f36254a = f;
                this.f36255b = sqrt;
                this.f36256c = 0.0f;
                float f15 = (sqrt - f) / f10;
                this.f36257d = f15;
                this.f36258e = sqrt / f10;
                this.f36259g = ((f + sqrt) * f15) / 2.0f;
                this.f36260h = f2;
                this.f36261i = f2;
                return;
            }
            this.f36262j = 3;
            this.f36254a = f;
            this.f36255b = f11;
            this.f36256c = f11;
            float f16 = (f11 - f) / f10;
            this.f36257d = f16;
            float f17 = f11 / f10;
            this.f = f17;
            float f18 = ((f + f11) * f16) / 2.0f;
            float f19 = (f17 * f11) / 2.0f;
            this.f36258e = ((f2 - f18) - f19) / f11;
            this.f36259g = f18;
            this.f36260h = f2 - f19;
            this.f36261i = f2;
        } else if (f14 >= f2) {
            this.f36262j = 1;
            this.f36254a = f;
            this.f36255b = 0.0f;
            this.f36259g = f2;
            this.f36257d = (2.0f * f2) / f;
        } else {
            float f20 = f2 - f14;
            float f21 = f20 / f;
            if (f21 + f13 < f12) {
                this.f36262j = 2;
                this.f36254a = f;
                this.f36255b = f;
                this.f36256c = 0.0f;
                this.f36259g = f20;
                this.f36260h = f2;
                this.f36257d = f21;
                this.f36258e = f13;
                return;
            }
            float sqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f10 * f2));
            float f22 = (sqrt2 - f) / f10;
            this.f36257d = f22;
            float f23 = sqrt2 / f10;
            this.f36258e = f23;
            if (sqrt2 < f11) {
                this.f36262j = 2;
                this.f36254a = f;
                this.f36255b = sqrt2;
                this.f36256c = 0.0f;
                this.f36257d = f22;
                this.f36258e = f23;
                this.f36259g = ((f + sqrt2) * f22) / 2.0f;
                this.f36260h = f2;
                return;
            }
            this.f36262j = 3;
            this.f36254a = f;
            this.f36255b = f11;
            this.f36256c = f11;
            float f24 = (f11 - f) / f10;
            this.f36257d = f24;
            float f25 = f11 / f10;
            this.f = f25;
            float f26 = ((f + f11) * f24) / 2.0f;
            float f27 = (f25 * f11) / 2.0f;
            this.f36258e = ((f2 - f26) - f27) / f11;
            this.f36259g = f26;
            this.f36260h = f2 - f27;
            this.f36261i = f2;
        }
    }

    @Override // w.n
    public final float getInterpolation(float f) {
        float f2;
        float f10 = this.f36257d;
        if (f <= f10) {
            float f11 = this.f36254a;
            f2 = ((((this.f36255b - f11) * f) * f) / (f10 * 2.0f)) + (f11 * f);
        } else {
            int i6 = this.f36262j;
            if (i6 == 1) {
                f2 = this.f36259g;
            } else {
                float f12 = f - f10;
                float f13 = this.f36258e;
                if (f12 < f13) {
                    float f14 = this.f36259g;
                    float f15 = this.f36255b;
                    f2 = ((((this.f36256c - f15) * f12) * f12) / (f13 * 2.0f)) + (f15 * f12) + f14;
                } else if (i6 == 2) {
                    f2 = this.f36260h;
                } else {
                    float f16 = f12 - f13;
                    float f17 = this.f;
                    if (f16 <= f17) {
                        float f18 = this.f36260h;
                        float f19 = this.f36256c * f16;
                        f2 = (f18 + f19) - ((f19 * f16) / (f17 * 2.0f));
                    } else {
                        f2 = this.f36261i;
                    }
                }
            }
        }
        this.f36265m = f;
        if (this.f36263k) {
            return this.f36264l - f2;
        }
        return this.f36264l + f2;
    }
}
