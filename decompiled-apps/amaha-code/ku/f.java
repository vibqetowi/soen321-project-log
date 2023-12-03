package ku;
/* compiled from: ClassLiteralValue.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final fu.b f23939a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23940b;

    public f(fu.b bVar, int i6) {
        this.f23939a = bVar;
        this.f23940b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (kotlin.jvm.internal.i.b(this.f23939a, fVar.f23939a) && this.f23940b == fVar.f23940b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23939a.hashCode() * 31) + this.f23940b;
    }

    public final String toString() {
        int i6;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            i6 = this.f23940b;
            if (i10 >= i6) {
                break;
            }
            sb2.append("kotlin/Array<");
            i10++;
        }
        sb2.append(this.f23939a);
        for (int i11 = 0; i11 < i6; i11++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
