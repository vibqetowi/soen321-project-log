package xt;
/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final j f38031a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f38032b;

    public /* synthetic */ k() {
        throw null;
    }

    public k(j jVar, boolean z10) {
        this.f38031a = jVar;
        this.f38032b = z10;
    }

    public static k a(k kVar, j qualifier, boolean z10, int i6) {
        if ((i6 & 1) != 0) {
            qualifier = kVar.f38031a;
        }
        if ((i6 & 2) != 0) {
            z10 = kVar.f38032b;
        }
        kVar.getClass();
        kotlin.jvm.internal.i.g(qualifier, "qualifier");
        return new k(qualifier, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f38031a == kVar.f38031a && this.f38032b == kVar.f38032b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f38031a.hashCode() * 31;
        boolean z10 = this.f38032b;
        int i6 = z10;
        if (z10 != 0) {
            i6 = 1;
        }
        return hashCode + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb2.append(this.f38031a);
        sb2.append(", isForWarningOnly=");
        return defpackage.c.t(sb2, this.f38032b, ')');
    }
}
