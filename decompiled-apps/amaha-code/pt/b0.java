package pt;

import java.util.Map;
/* compiled from: Jsr305Settings.kt */
/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f28851a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f28852b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<fu.c, h0> f28853c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28854d;

    public b0() {
        throw null;
    }

    public b0(h0 h0Var, h0 h0Var2) {
        is.x xVar = is.x.f20677u;
        this.f28851a = h0Var;
        this.f28852b = h0Var2;
        this.f28853c = xVar;
        sp.b.O(new a0(this));
        h0 h0Var3 = h0.IGNORE;
        this.f28854d = h0Var == h0Var3 && h0Var2 == h0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f28851a == b0Var.f28851a && this.f28852b == b0Var.f28852b && kotlin.jvm.internal.i.b(this.f28853c, b0Var.f28853c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f28851a.hashCode() * 31;
        h0 h0Var = this.f28852b;
        if (h0Var == null) {
            hashCode = 0;
        } else {
            hashCode = h0Var.hashCode();
        }
        return this.f28853c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f28851a + ", migrationLevel=" + this.f28852b + ", userDefinedLevelForSpecificAnnotation=" + this.f28853c + ')';
    }
}
