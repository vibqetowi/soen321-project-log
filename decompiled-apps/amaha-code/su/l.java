package su;

import java.util.List;
import java.util.Set;
import jt.a;
import jt.c;
import jt.e;
import ot.b;
import su.k;
import su.m;
import su.x;
import wu.u0;
import xu.k;
/* compiled from: context.kt */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final vu.l f32044a;

    /* renamed from: b  reason: collision with root package name */
    public final gt.a0 f32045b;

    /* renamed from: c  reason: collision with root package name */
    public final m f32046c;

    /* renamed from: d  reason: collision with root package name */
    public final i f32047d;

    /* renamed from: e  reason: collision with root package name */
    public final d<ht.c, ku.g<?>> f32048e;
    public final gt.e0 f;

    /* renamed from: g  reason: collision with root package name */
    public final x f32049g;

    /* renamed from: h  reason: collision with root package name */
    public final t f32050h;

    /* renamed from: i  reason: collision with root package name */
    public final ot.b f32051i;

    /* renamed from: j  reason: collision with root package name */
    public final u f32052j;

    /* renamed from: k  reason: collision with root package name */
    public final Iterable<jt.b> f32053k;

    /* renamed from: l  reason: collision with root package name */
    public final gt.c0 f32054l;

    /* renamed from: m  reason: collision with root package name */
    public final k f32055m;

    /* renamed from: n  reason: collision with root package name */
    public final jt.a f32056n;

    /* renamed from: o  reason: collision with root package name */
    public final jt.c f32057o;

    /* renamed from: p  reason: collision with root package name */
    public final gu.e f32058p;

    /* renamed from: q  reason: collision with root package name */
    public final xu.k f32059q;
    public final jt.e r;

    /* renamed from: s  reason: collision with root package name */
    public final List<u0> f32060s;

    /* renamed from: t  reason: collision with root package name */
    public final j f32061t;

    public l(vu.l storageManager, gt.a0 moduleDescriptor, i iVar, d dVar, gt.e0 packageFragmentProvider, t tVar, u uVar, Iterable fictitiousClassDescriptorFactories, gt.c0 c0Var, jt.a aVar, jt.c cVar, gu.e extensionRegistryLite, xu.l lVar, ou.b bVar, List list, int i6) {
        xu.l kotlinTypeChecker;
        m.a aVar2 = m.a.f32062a;
        x.a aVar3 = x.a.f32073a;
        b.a aVar4 = b.a.f27780a;
        k.a.C0541a c0541a = k.a.f32042a;
        jt.a additionalClassPartsProvider = (i6 & 8192) != 0 ? a.C0345a.f22623a : aVar;
        jt.c platformDependentDeclarationFilter = (i6 & 16384) != 0 ? c.a.f22624a : cVar;
        if ((65536 & i6) != 0) {
            xu.k.f38114b.getClass();
            kotlinTypeChecker = k.a.f38116b;
        } else {
            kotlinTypeChecker = lVar;
        }
        e.a platformDependentTypeTransformer = (262144 & i6) != 0 ? e.a.f22627a : null;
        List typeAttributeTranslators = (i6 & 524288) != 0 ? ca.a.O0(wu.n.f37270a) : list;
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        kotlin.jvm.internal.i.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.i.g(packageFragmentProvider, "packageFragmentProvider");
        kotlin.jvm.internal.i.g(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        kotlin.jvm.internal.i.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        kotlin.jvm.internal.i.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.i.g(extensionRegistryLite, "extensionRegistryLite");
        kotlin.jvm.internal.i.g(kotlinTypeChecker, "kotlinTypeChecker");
        kotlin.jvm.internal.i.g(platformDependentTypeTransformer, "platformDependentTypeTransformer");
        kotlin.jvm.internal.i.g(typeAttributeTranslators, "typeAttributeTranslators");
        this.f32044a = storageManager;
        this.f32045b = moduleDescriptor;
        this.f32046c = aVar2;
        this.f32047d = iVar;
        this.f32048e = dVar;
        this.f = packageFragmentProvider;
        this.f32049g = aVar3;
        this.f32050h = tVar;
        this.f32051i = aVar4;
        this.f32052j = uVar;
        this.f32053k = fictitiousClassDescriptorFactories;
        this.f32054l = c0Var;
        this.f32055m = c0541a;
        this.f32056n = additionalClassPartsProvider;
        this.f32057o = platformDependentDeclarationFilter;
        this.f32058p = extensionRegistryLite;
        this.f32059q = kotlinTypeChecker;
        this.r = platformDependentTypeTransformer;
        this.f32060s = typeAttributeTranslators;
        this.f32061t = new j(this);
    }

    public final j7.k a(gt.d0 descriptor, cu.c nameResolver, cu.e eVar, cu.f fVar, cu.a metadataVersion, uu.g gVar) {
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(metadataVersion, "metadataVersion");
        return new j7.k(this, nameResolver, (gt.j) descriptor, eVar, fVar, metadataVersion, gVar, (j0) null, (List) is.w.f20676u);
    }

    public final gt.e b(fu.b classId) {
        kotlin.jvm.internal.i.g(classId, "classId");
        Set<fu.b> set = j.f32023c;
        return this.f32061t.a(classId, null);
    }
}
