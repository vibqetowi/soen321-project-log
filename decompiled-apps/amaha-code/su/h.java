package su;

import gt.q0;
/* compiled from: ClassData.kt */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final cu.c f32016a;

    /* renamed from: b  reason: collision with root package name */
    public final au.b f32017b;

    /* renamed from: c  reason: collision with root package name */
    public final cu.a f32018c;

    /* renamed from: d  reason: collision with root package name */
    public final q0 f32019d;

    public h(cu.c nameResolver, au.b classProto, cu.a metadataVersion, q0 sourceElement) {
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(classProto, "classProto");
        kotlin.jvm.internal.i.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.i.g(sourceElement, "sourceElement");
        this.f32016a = nameResolver;
        this.f32017b = classProto;
        this.f32018c = metadataVersion;
        this.f32019d = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.i.b(this.f32016a, hVar.f32016a) && kotlin.jvm.internal.i.b(this.f32017b, hVar.f32017b) && kotlin.jvm.internal.i.b(this.f32018c, hVar.f32018c) && kotlin.jvm.internal.i.b(this.f32019d, hVar.f32019d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f32017b.hashCode();
        int hashCode2 = this.f32018c.hashCode();
        return this.f32019d.hashCode() + ((hashCode2 + ((hashCode + (this.f32016a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f32016a + ", classProto=" + this.f32017b + ", metadataVersion=" + this.f32018c + ", sourceElement=" + this.f32019d + ')';
    }
}
