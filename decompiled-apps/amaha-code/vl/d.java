package vl;

import kotlin.jvm.internal.i;
/* compiled from: HowItWorkItemModel.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f35266a;

    /* renamed from: b  reason: collision with root package name */
    public final int f35267b;

    public d(String str, int i6) {
        this.f35266a = str;
        this.f35267b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (i.b(this.f35266a, dVar.f35266a) && this.f35267b == dVar.f35267b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f35266a.hashCode() * 31) + this.f35267b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HowItWorkItemModel(title=");
        sb2.append(this.f35266a);
        sb2.append(", resource=");
        return defpackage.c.s(sb2, this.f35267b, ')');
    }
}
