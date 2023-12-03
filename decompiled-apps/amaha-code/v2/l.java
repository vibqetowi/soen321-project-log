package v2;
/* compiled from: WorkSpec.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f34722a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34723b;

    public l(String workSpecId, int i6) {
        kotlin.jvm.internal.i.g(workSpecId, "workSpecId");
        this.f34722a = workSpecId;
        this.f34723b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (kotlin.jvm.internal.i.b(this.f34722a, lVar.f34722a) && this.f34723b == lVar.f34723b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f34722a.hashCode() * 31) + this.f34723b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f34722a);
        sb2.append(", generation=");
        return defpackage.c.s(sb2, this.f34723b, ')');
    }
}
