package uu;

import gt.b;
import gt.q0;
import gt.u;
import kt.p0;
import kt.x;
/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes2.dex */
public final class l extends p0 implements b {
    public final au.h Y;
    public final cu.c Z;

    /* renamed from: a0  reason: collision with root package name */
    public final cu.e f34589a0;

    /* renamed from: b0  reason: collision with root package name */
    public final cu.f f34590b0;
    public final g c0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(gt.j containingDeclaration, gt.p0 p0Var, ht.h annotations, fu.e eVar, b.a kind, au.h proto, cu.c nameResolver, cu.e typeTable, cu.f versionRequirementTable, g gVar, q0 q0Var) {
        super(containingDeclaration, p0Var, annotations, eVar, kind, r6);
        q0.a aVar;
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.i.g(annotations, "annotations");
        kotlin.jvm.internal.i.g(kind, "kind");
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        kotlin.jvm.internal.i.g(versionRequirementTable, "versionRequirementTable");
        if (q0Var == null) {
            aVar = q0.f16815a;
        } else {
            aVar = q0Var;
        }
        this.Y = proto;
        this.Z = nameResolver;
        this.f34589a0 = typeTable;
        this.f34590b0 = versionRequirementTable;
        this.c0 = gVar;
    }

    @Override // uu.h
    public final gu.n C() {
        return this.Y;
    }

    @Override // kt.p0, kt.x
    public final x M0(b.a kind, gt.j newOwner, u uVar, q0 q0Var, ht.h annotations, fu.e eVar) {
        fu.e eVar2;
        kotlin.jvm.internal.i.g(newOwner, "newOwner");
        kotlin.jvm.internal.i.g(kind, "kind");
        kotlin.jvm.internal.i.g(annotations, "annotations");
        gt.p0 p0Var = (gt.p0) uVar;
        if (eVar == null) {
            fu.e name = getName();
            kotlin.jvm.internal.i.f(name, "name");
            eVar2 = name;
        } else {
            eVar2 = eVar;
        }
        l lVar = new l(newOwner, p0Var, annotations, eVar2, kind, this.Y, this.Z, this.f34589a0, this.f34590b0, this.c0, q0Var);
        lVar.Q = this.Q;
        return lVar;
    }

    @Override // uu.h
    public final cu.e T() {
        return this.f34589a0;
    }

    @Override // uu.h
    public final cu.c Z() {
        return this.Z;
    }

    @Override // uu.h
    public final g c0() {
        return this.c0;
    }
}
