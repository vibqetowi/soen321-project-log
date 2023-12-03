package st;

import kotlin.jvm.internal.k;
import pt.z;
/* compiled from: context.kt */
/* loaded from: classes2.dex */
public final class a extends k implements ss.a<z> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q.f f31930u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ gt.f f31931v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q.f fVar, gt.f fVar2) {
        super(0);
        this.f31930u = fVar;
        this.f31931v = fVar2;
    }

    @Override // ss.a
    public final z invoke() {
        ht.h additionalAnnotations = this.f31931v.getAnnotations();
        q.f fVar = this.f31930u;
        kotlin.jvm.internal.i.g(fVar, "<this>");
        kotlin.jvm.internal.i.g(additionalAnnotations, "additionalAnnotations");
        return ((c) fVar.f29104v).f31949q.b((z) ((hs.d) fVar.f29107y).getValue(), additionalAnnotations);
    }
}
