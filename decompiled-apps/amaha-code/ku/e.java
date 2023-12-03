package ku;

import gt.a0;
import wu.b0;
import wu.i0;
/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class e extends o<Character> {
    public e(char c10) {
        super(Character.valueOf(c10));
    }

    @Override // ku.g
    public final b0 a(a0 module) {
        kotlin.jvm.internal.i.g(module, "module");
        dt.j o10 = module.o();
        o10.getClass();
        i0 t3 = o10.t(dt.k.CHAR);
        if (t3 != null) {
            return t3;
        }
        dt.j.a(62);
        throw null;
    }

    @Override // ku.g
    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        T t3 = this.f23941a;
        boolean z10 = false;
        objArr[0] = Integer.valueOf(((Character) t3).charValue());
        char charValue = ((Character) t3).charValue();
        if (charValue == '\b') {
            str = "\\b";
        } else if (charValue == '\t') {
            str = "\\t";
        } else if (charValue == '\n') {
            str = "\\n";
        } else if (charValue == '\f') {
            str = "\\f";
        } else if (charValue == '\r') {
            str = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                z10 = true;
            }
            if (z10) {
                str = String.valueOf(charValue);
            } else {
                str = "?";
            }
        }
        objArr[1] = str;
        return defpackage.b.o(objArr, 2, "\\u%04X ('%s')", "format(this, *args)");
    }
}
