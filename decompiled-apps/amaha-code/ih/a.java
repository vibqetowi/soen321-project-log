package ih;
/* compiled from: Attribute.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f20046a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20047b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20048c;

    public a(String name, Object value, int i6) {
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(value, "value");
        defpackage.d.j(i6, "attributeType");
        this.f20046a = name;
        this.f20047b = value;
        this.f20048c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.i.b(this.f20046a, aVar.f20046a) && kotlin.jvm.internal.i.b(this.f20047b, aVar.f20047b) && this.f20048c == aVar.f20048c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f20047b.hashCode();
        return v.h.d(this.f20048c) + ((hashCode + (this.f20046a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Attribute(name=" + this.f20046a + ", value=" + this.f20047b + ", attributeType=" + defpackage.e.x(this.f20048c) + ')';
    }
}
