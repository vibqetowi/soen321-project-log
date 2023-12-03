package z;

import a0.p;
import w.l;
import w.n;
import w.o;
/* compiled from: StopLogic.java */
/* loaded from: classes.dex */
public final class a extends p {

    /* renamed from: a  reason: collision with root package name */
    public final o f39099a;

    /* renamed from: b  reason: collision with root package name */
    public l f39100b;

    /* renamed from: c  reason: collision with root package name */
    public n f39101c;

    public a() {
        o oVar = new o();
        this.f39099a = oVar;
        this.f39101c = oVar;
    }

    @Override // a0.p
    public final float a() {
        return this.f39101c.b();
    }

    public final void b(float f, float f2, float f10, float f11, float f12, float f13) {
        boolean z10;
        o oVar = this.f39099a;
        this.f39101c = oVar;
        oVar.f36264l = f;
        if (f > f2) {
            z10 = true;
        } else {
            z10 = false;
        }
        oVar.f36263k = z10;
        if (z10) {
            oVar.d(-f10, f - f2, f12, f13, f11);
        } else {
            oVar.d(f10, f2 - f, f12, f13, f11);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f39101c.getInterpolation(f);
    }
}
