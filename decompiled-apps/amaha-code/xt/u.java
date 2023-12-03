package xt;

import wu.b0;
import wu.k1;
/* compiled from: signatureEnhancement.kt */
/* loaded from: classes2.dex */
public final class u extends a<ht.c> {

    /* renamed from: a  reason: collision with root package name */
    public final ht.a f38084a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f38085b;

    /* renamed from: c  reason: collision with root package name */
    public final q.f f38086c;

    /* renamed from: d  reason: collision with root package name */
    public final pt.c f38087d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f38088e;

    public /* synthetic */ u(ht.a aVar, boolean z10, q.f fVar, pt.c cVar) {
        this(aVar, z10, fVar, cVar, false);
    }

    public final fu.d e(zu.i iVar) {
        gt.e eVar;
        yu.f fVar = k1.f37261a;
        gt.g a10 = ((b0) iVar).O0().a();
        if (a10 instanceof gt.e) {
            eVar = (gt.e) a10;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return null;
        }
        return iu.g.g(eVar);
    }

    public u(ht.a aVar, boolean z10, q.f containerContext, pt.c cVar, boolean z11) {
        kotlin.jvm.internal.i.g(containerContext, "containerContext");
        this.f38084a = aVar;
        this.f38085b = z10;
        this.f38086c = containerContext;
        this.f38087d = cVar;
        this.f38088e = z11;
    }
}
