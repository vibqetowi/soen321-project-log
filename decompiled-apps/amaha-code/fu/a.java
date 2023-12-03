package fu;

import gv.n;
/* compiled from: CallableId.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f15914a;

    /* renamed from: b  reason: collision with root package name */
    public final c f15915b;

    /* renamed from: c  reason: collision with root package name */
    public final e f15916c;

    /* renamed from: d  reason: collision with root package name */
    public final c f15917d;

    static {
        c.j(g.f);
    }

    public a(c packageName, e eVar) {
        kotlin.jvm.internal.i.g(packageName, "packageName");
        this.f15914a = packageName;
        this.f15915b = null;
        this.f15916c = eVar;
        this.f15917d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.i.b(this.f15914a, aVar.f15914a) && kotlin.jvm.internal.i.b(this.f15915b, aVar.f15915b) && kotlin.jvm.internal.i.b(this.f15916c, aVar.f15916c) && kotlin.jvm.internal.i.b(this.f15917d, aVar.f15917d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f15914a.hashCode() * 31;
        int i6 = 0;
        c cVar = this.f15915b;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int hashCode3 = (this.f15916c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        c cVar2 = this.f15917d;
        if (cVar2 != null) {
            i6 = cVar2.hashCode();
        }
        return hashCode3 + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n.E0(this.f15914a.b(), '.', '/'));
        sb2.append("/");
        c cVar = this.f15915b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f15916c);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
