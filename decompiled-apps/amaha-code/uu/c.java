package uu;

import gt.b;
import gt.q0;
import gt.u;
import kt.x;
/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes2.dex */
public final class c extends kt.l implements b {
    public final au.c Z;

    /* renamed from: a0  reason: collision with root package name */
    public final cu.c f34530a0;

    /* renamed from: b0  reason: collision with root package name */
    public final cu.e f34531b0;
    public final cu.f c0;

    /* renamed from: d0  reason: collision with root package name */
    public final g f34532d0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(gt.e containingDeclaration, gt.i iVar, ht.h annotations, boolean z10, b.a kind, au.c proto, cu.c nameResolver, cu.e typeTable, cu.f versionRequirementTable, g gVar, q0 q0Var) {
        super(containingDeclaration, iVar, annotations, z10, kind, r6);
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
        this.Z = proto;
        this.f34530a0 = nameResolver;
        this.f34531b0 = typeTable;
        this.c0 = versionRequirementTable;
        this.f34532d0 = gVar;
    }

    @Override // uu.h
    public final gu.n C() {
        return this.Z;
    }

    @Override // kt.l, kt.x
    public final /* bridge */ /* synthetic */ x M0(b.a aVar, gt.j jVar, u uVar, q0 q0Var, ht.h hVar, fu.e eVar) {
        return Z0(aVar, jVar, uVar, q0Var, hVar);
    }

    @Override // kt.x, gt.u
    public final boolean Q() {
        return false;
    }

    @Override // uu.h
    public final cu.e T() {
        return this.f34531b0;
    }

    @Override // kt.l
    public final /* bridge */ /* synthetic */ kt.l V0(b.a aVar, gt.j jVar, u uVar, q0 q0Var, ht.h hVar, fu.e eVar) {
        return Z0(aVar, jVar, uVar, q0Var, hVar);
    }

    @Override // uu.h
    public final cu.c Z() {
        return this.f34530a0;
    }

    public final c Z0(b.a kind, gt.j newOwner, u uVar, q0 q0Var, ht.h annotations) {
        kotlin.jvm.internal.i.g(newOwner, "newOwner");
        kotlin.jvm.internal.i.g(kind, "kind");
        kotlin.jvm.internal.i.g(annotations, "annotations");
        c cVar = new c((gt.e) newOwner, (gt.i) uVar, annotations, this.Y, kind, this.Z, this.f34530a0, this.f34531b0, this.c0, this.f34532d0, q0Var);
        cVar.Q = this.Q;
        return cVar;
    }

    @Override // uu.h
    public final g c0() {
        return this.f34532d0;
    }

    @Override // kt.x, gt.y
    public final boolean isExternal() {
        return false;
    }

    @Override // kt.x, gt.u
    public final boolean isInline() {
        return false;
    }

    @Override // kt.x, gt.u
    public final boolean isSuspend() {
        return false;
    }
}
