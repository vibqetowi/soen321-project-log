package s1;
/* compiled from: NavArgument.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final c0<Object> f31109a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f31110b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f31111c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f31112d;

    public e(c0<Object> c0Var, boolean z10, Object obj, boolean z11) {
        boolean z12;
        boolean z13 = true;
        if (!c0Var.f31100a && z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            if (!z10 && z11 && obj == null) {
                z13 = false;
            }
            if (z13) {
                this.f31109a = c0Var;
                this.f31110b = z10;
                this.f31112d = obj;
                this.f31111c = z11;
                return;
            }
            throw new IllegalArgumentException(("Argument with type " + c0Var.b() + " has null value but is not nullable.").toString());
        }
        throw new IllegalArgumentException((c0Var.b() + " does not allow nullable values").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.i.b(e.class, obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f31110b != eVar.f31110b || this.f31111c != eVar.f31111c || !kotlin.jvm.internal.i.b(this.f31109a, eVar.f31109a)) {
            return false;
        }
        Object obj2 = eVar.f31112d;
        Object obj3 = this.f31112d;
        if (obj3 != null) {
            return kotlin.jvm.internal.i.b(obj3, obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = ((((this.f31109a.hashCode() * 31) + (this.f31110b ? 1 : 0)) * 31) + (this.f31111c ? 1 : 0)) * 31;
        Object obj = this.f31112d;
        if (obj != null) {
            i6 = obj.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e.class.getSimpleName());
        sb2.append(" Type: " + this.f31109a);
        sb2.append(" Nullable: " + this.f31110b);
        if (this.f31111c) {
            sb2.append(" DefaultValue: " + this.f31112d);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "sb.toString()");
        return sb3;
    }
}
