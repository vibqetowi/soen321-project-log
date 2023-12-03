package ku;

import gt.a0;
import wu.b0;
import wu.i0;
/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class c extends g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f23938b = 1;

    public c(boolean z10) {
        super(Boolean.valueOf(z10));
    }

    @Override // ku.g
    public final /* bridge */ /* synthetic */ b0 a(a0 a0Var) {
        switch (this.f23938b) {
            case 0:
                return c(a0Var);
            case 1:
                return c(a0Var);
            default:
                return c(a0Var);
        }
    }

    public final i0 c(a0 module) {
        switch (this.f23938b) {
            case 0:
                kotlin.jvm.internal.i.g(module, "module");
                dt.j o10 = module.o();
                o10.getClass();
                i0 t3 = o10.t(dt.k.BOOLEAN);
                if (t3 != null) {
                    return t3;
                }
                dt.j.a(63);
                throw null;
            case 1:
                kotlin.jvm.internal.i.g(module, "module");
                dt.j o11 = module.o();
                o11.getClass();
                i0 t10 = o11.t(dt.k.DOUBLE);
                if (t10 != null) {
                    return t10;
                }
                dt.j.a(61);
                throw null;
            default:
                kotlin.jvm.internal.i.g(module, "module");
                dt.j o12 = module.o();
                o12.getClass();
                i0 t11 = o12.t(dt.k.FLOAT);
                if (t11 != null) {
                    return t11;
                }
                dt.j.a(60);
                throw null;
        }
    }

    @Override // ku.g
    public final String toString() {
        int i6 = this.f23938b;
        T t3 = this.f23941a;
        switch (i6) {
            case 1:
                return ((Number) t3).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) t3).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d10) {
        super(Double.valueOf(d10));
    }

    public c(float f) {
        super(Float.valueOf(f));
    }
}
