package he;
/* compiled from: OrderBy.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final int f17573a;

    /* renamed from: b  reason: collision with root package name */
    public final ke.m f17574b;

    public x(int i6, ke.m mVar) {
        this.f17573a = i6;
        this.f17574b = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof x)) {
            x xVar = (x) obj;
            if (this.f17573a == xVar.f17573a && this.f17574b.equals(xVar.f17574b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17574b.hashCode() + ((v.h.d(this.f17573a) + 899) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f17573a == 1) {
            str = "";
        } else {
            str = "-";
        }
        sb2.append(str);
        sb2.append(this.f17574b.h());
        return sb2.toString();
    }
}
