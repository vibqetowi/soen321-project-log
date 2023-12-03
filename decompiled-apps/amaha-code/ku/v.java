package ku;

import dt.n;
import gt.a0;
import wu.b0;
import wu.i0;
/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class v extends w {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f23956b = 0;

    public v(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // ku.g
    public final b0 a(a0 module) {
        yu.h hVar = yu.h.T;
        i0 i0Var = null;
        switch (this.f23956b) {
            case 0:
                kotlin.jvm.internal.i.g(module, "module");
                gt.e a10 = gt.t.a(module, n.a.R);
                if (a10 != null) {
                    i0Var = a10.r();
                }
                if (i0Var == null) {
                    return yu.i.c(hVar, "UByte");
                }
                return i0Var;
            case 1:
                kotlin.jvm.internal.i.g(module, "module");
                gt.e a11 = gt.t.a(module, n.a.T);
                if (a11 != null) {
                    i0Var = a11.r();
                }
                if (i0Var == null) {
                    return yu.i.c(hVar, "UInt");
                }
                return i0Var;
            case 2:
                kotlin.jvm.internal.i.g(module, "module");
                gt.e a12 = gt.t.a(module, n.a.U);
                if (a12 != null) {
                    i0Var = a12.r();
                }
                if (i0Var == null) {
                    return yu.i.c(hVar, "ULong");
                }
                return i0Var;
            default:
                kotlin.jvm.internal.i.g(module, "module");
                gt.e a13 = gt.t.a(module, n.a.S);
                if (a13 != null) {
                    i0Var = a13.r();
                }
                if (i0Var == null) {
                    return yu.i.c(hVar, "UShort");
                }
                return i0Var;
        }
    }

    @Override // ku.g
    public final String toString() {
        int i6 = this.f23956b;
        T t3 = this.f23941a;
        switch (i6) {
            case 0:
                return ((Number) t3).intValue() + ".toUByte()";
            case 1:
                return ((Number) t3).intValue() + ".toUInt()";
            case 2:
                return ((Number) t3).longValue() + ".toULong()";
            default:
                return ((Number) t3).intValue() + ".toUShort()";
        }
    }

    public v(short s10) {
        super(Short.valueOf(s10));
    }

    public v(int i6) {
        super(Integer.valueOf(i6));
    }

    public v(long j10) {
        super(Long.valueOf(j10));
    }
}
