package uu;

import au.q;
import au.s;
import au.v;
import cu.f;
import gt.d0;
import is.u;
import is.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/* compiled from: DeserializedPackageMemberScope.kt */
/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: g  reason: collision with root package name */
    public final d0 f34586g;

    /* renamed from: h  reason: collision with root package name */
    public final String f34587h;

    /* renamed from: i  reason: collision with root package name */
    public final fu.c f34588i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(d0 packageDescriptor, au.k kVar, cu.c nameResolver, cu.a metadataVersion, g gVar, su.l lVar, String debugName, ss.a<? extends Collection<fu.e>> classNames) {
        super(r1, r2, r3, r4, classNames);
        kotlin.jvm.internal.i.g(packageDescriptor, "packageDescriptor");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.i.g(debugName, "debugName");
        kotlin.jvm.internal.i.g(classNames, "classNames");
        s sVar = kVar.A;
        kotlin.jvm.internal.i.f(sVar, "proto.typeTable");
        cu.e eVar = new cu.e(sVar);
        cu.f fVar = cu.f.f12049b;
        v vVar = kVar.B;
        kotlin.jvm.internal.i.f(vVar, "proto.versionRequirementTable");
        j7.k a10 = lVar.a(packageDescriptor, nameResolver, eVar, f.a.a(vVar), metadataVersion, gVar);
        List<au.h> list = kVar.f3753x;
        kotlin.jvm.internal.i.f(list, "proto.functionList");
        List<au.m> list2 = kVar.f3754y;
        kotlin.jvm.internal.i.f(list2, "proto.propertyList");
        List<q> list3 = kVar.f3755z;
        kotlin.jvm.internal.i.f(list3, "proto.typeAliasList");
        this.f34586g = packageDescriptor;
        this.f34587h = debugName;
        this.f34588i = packageDescriptor.e();
    }

    @Override // pu.j, pu.k
    public final Collection f(pu.d kindFilter, ss.l nameFilter) {
        kotlin.jvm.internal.i.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
        List i6 = i(kindFilter, nameFilter);
        Iterable<jt.b> iterable = ((su.l) this.f34561b.f21732u).f32053k;
        ArrayList arrayList = new ArrayList();
        for (jt.b bVar : iterable) {
            is.q.R1(bVar.b(this.f34588i), arrayList);
        }
        return u.u2(arrayList, i6);
    }

    @Override // uu.i, pu.j, pu.k
    public final gt.g g(fu.e name, ot.c cVar) {
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.h.Y(((su.l) this.f34561b.f21732u).f32051i, cVar, this.f34586g, name);
        return super.g(name, cVar);
    }

    @Override // uu.i
    public final void h(ArrayList arrayList, ss.l nameFilter) {
        kotlin.jvm.internal.i.g(nameFilter, "nameFilter");
    }

    @Override // uu.i
    public final fu.b l(fu.e name) {
        kotlin.jvm.internal.i.g(name, "name");
        return new fu.b(this.f34588i, name);
    }

    @Override // uu.i
    public final Set<fu.e> n() {
        return y.f20678u;
    }

    @Override // uu.i
    public final Set<fu.e> o() {
        return y.f20678u;
    }

    @Override // uu.i
    public final Set<fu.e> p() {
        return y.f20678u;
    }

    @Override // uu.i
    public final boolean q(fu.e name) {
        boolean z10;
        kotlin.jvm.internal.i.g(name, "name");
        if (super.q(name)) {
            return true;
        }
        Iterable<jt.b> iterable = ((su.l) this.f34561b.f21732u).f32053k;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (jt.b bVar : iterable) {
                if (bVar.c(this.f34588i, name)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (z10) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f34587h;
    }
}
