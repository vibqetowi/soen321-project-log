package yt;

import gt.q0;
import java.util.HashMap;
import java.util.List;
import ku.q;
import yt.g;
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* loaded from: classes2.dex */
public final class h extends g.a {

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<fu.e, ku.g<?>> f39027b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f39028c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ gt.e f39029d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ fu.b f39030e;
    public final /* synthetic */ List<ht.c> f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q0 f39031g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, gt.e eVar, fu.b bVar, List<ht.c> list, q0 q0Var) {
        super();
        this.f39028c = gVar;
        this.f39029d = eVar;
        this.f39030e = bVar;
        this.f = list;
        this.f39031g = q0Var;
        this.f39027b = new HashMap<>();
    }

    @Override // yt.o.a
    public final void a() {
        boolean z10;
        ku.q qVar;
        HashMap<fu.e, ku.g<?>> arguments = this.f39027b;
        g gVar = this.f39028c;
        gVar.getClass();
        fu.b annotationClassId = this.f39030e;
        kotlin.jvm.internal.i.g(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.i.g(arguments, "arguments");
        if (kotlin.jvm.internal.i.b(annotationClassId, ct.b.f12013b)) {
            ku.g<?> gVar2 = arguments.get(fu.e.j("value"));
            q.a.b bVar = null;
            if (gVar2 instanceof ku.q) {
                qVar = (ku.q) gVar2;
            } else {
                qVar = null;
            }
            if (qVar != null) {
                T t3 = qVar.f23941a;
                if (t3 instanceof q.a.b) {
                    bVar = (q.a.b) t3;
                }
                if (bVar != null) {
                    z10 = gVar.p(bVar.f23955a.f23939a);
                    if (!z10 || gVar.p(annotationClassId)) {
                        return;
                    }
                    this.f.add(new ht.d(this.f39029d.r(), arguments, this.f39031g));
                }
            }
        }
        z10 = false;
        if (!z10) {
            return;
        }
        this.f.add(new ht.d(this.f39029d.r(), arguments, this.f39031g));
    }

    @Override // yt.g.a
    public final void g(fu.e eVar, ku.g<?> gVar) {
        if (eVar != null) {
            this.f39027b.put(eVar, gVar);
        }
    }
}
