package ku;

import gt.a0;
import wu.b0;
import wu.i0;
/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class t extends o<Short> {
    public t(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // ku.g
    public final b0 a(a0 module) {
        kotlin.jvm.internal.i.g(module, "module");
        dt.j o10 = module.o();
        o10.getClass();
        i0 t3 = o10.t(dt.k.SHORT);
        if (t3 != null) {
            return t3;
        }
        dt.j.a(57);
        throw null;
    }

    @Override // ku.g
    public final String toString() {
        return ((Number) this.f23941a).intValue() + ".toShort()";
    }
}
