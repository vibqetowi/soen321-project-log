package uu;

import gt.b;
import gt.k0;
import gt.q;
import gt.q0;
import gt.z;
import kt.l0;
/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes2.dex */
public final class k extends l0 implements b {
    public final au.m V;
    public final cu.c W;
    public final cu.e X;
    public final cu.f Y;
    public final g Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gt.j containingDeclaration, k0 k0Var, ht.h annotations, z modality, q visibility, boolean z10, fu.e name, b.a kind, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, au.m proto, cu.c nameResolver, cu.e typeTable, cu.f versionRequirementTable, g gVar) {
        super(containingDeclaration, k0Var, annotations, modality, visibility, z10, name, kind, q0.f16815a, z11, z12, z15, false, z13, z14);
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.i.g(annotations, "annotations");
        kotlin.jvm.internal.i.g(modality, "modality");
        kotlin.jvm.internal.i.g(visibility, "visibility");
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(kind, "kind");
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        kotlin.jvm.internal.i.g(versionRequirementTable, "versionRequirementTable");
        this.V = proto;
        this.W = nameResolver;
        this.X = typeTable;
        this.Y = versionRequirementTable;
        this.Z = gVar;
    }

    @Override // uu.h
    public final gu.n C() {
        return this.V;
    }

    @Override // kt.l0
    public final l0 N0(gt.j newOwner, z newModality, q newVisibility, k0 k0Var, b.a kind, fu.e newName) {
        kotlin.jvm.internal.i.g(newOwner, "newOwner");
        kotlin.jvm.internal.i.g(newModality, "newModality");
        kotlin.jvm.internal.i.g(newVisibility, "newVisibility");
        kotlin.jvm.internal.i.g(kind, "kind");
        kotlin.jvm.internal.i.g(newName, "newName");
        return new k(newOwner, k0Var, getAnnotations(), newModality, newVisibility, this.f23927z, newName, kind, this.H, this.I, isExternal(), this.M, this.J, this.V, this.W, this.X, this.Y, this.Z);
    }

    @Override // uu.h
    public final cu.e T() {
        return this.X;
    }

    @Override // uu.h
    public final cu.c Z() {
        return this.W;
    }

    @Override // uu.h
    public final g c0() {
        return this.Z;
    }

    @Override // kt.l0, gt.y
    public final boolean isExternal() {
        return ri.e.g(cu.b.D, this.V.f3769x, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
    }
}
