package pt;

import java.util.Collection;
/* compiled from: AnnotationQualifiersFqNames.kt */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final xt.k f28951a;

    /* renamed from: b  reason: collision with root package name */
    public final Collection<c> f28952b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28953c;

    /* JADX WARN: Multi-variable type inference failed */
    public s(xt.k kVar, Collection<? extends c> qualifierApplicabilityTypes, boolean z10) {
        kotlin.jvm.internal.i.g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f28951a = kVar;
        this.f28952b = qualifierApplicabilityTypes;
        this.f28953c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (kotlin.jvm.internal.i.b(this.f28951a, sVar.f28951a) && kotlin.jvm.internal.i.b(this.f28952b, sVar.f28952b) && this.f28953c == sVar.f28953c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f28952b.hashCode() + (this.f28951a.hashCode() * 31)) * 31;
        boolean z10 = this.f28953c;
        int i6 = z10;
        if (z10 != 0) {
            i6 = 1;
        }
        return hashCode + i6;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb2.append(this.f28951a);
        sb2.append(", qualifierApplicabilityTypes=");
        sb2.append(this.f28952b);
        sb2.append(", definitelyNotNull=");
        return defpackage.c.t(sb2, this.f28953c, ')');
    }

    public s(xt.k kVar, Collection collection) {
        this(kVar, collection, kVar.f38031a == xt.j.NOT_NULL);
    }
}
