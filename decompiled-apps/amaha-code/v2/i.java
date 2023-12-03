package v2;
/* compiled from: SystemIdInfo.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f34715a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34716b;

    /* renamed from: c  reason: collision with root package name */
    public final int f34717c;

    public i(String workSpecId, int i6, int i10) {
        kotlin.jvm.internal.i.g(workSpecId, "workSpecId");
        this.f34715a = workSpecId;
        this.f34716b = i6;
        this.f34717c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (kotlin.jvm.internal.i.b(this.f34715a, iVar.f34715a) && this.f34716b == iVar.f34716b && this.f34717c == iVar.f34717c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f34715a.hashCode() * 31) + this.f34716b) * 31) + this.f34717c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f34715a);
        sb2.append(", generation=");
        sb2.append(this.f34716b);
        sb2.append(", systemId=");
        return defpackage.c.s(sb2, this.f34717c, ')');
    }
}
