package st;

import kotlin.jvm.internal.k;
import pt.z;
import wt.y;
/* compiled from: context.kt */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: context.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<z> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ q.f f31932u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ht.h f31933v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q.f fVar, ht.h hVar) {
            super(0);
            this.f31932u = fVar;
            this.f31933v = hVar;
        }

        @Override // ss.a
        public final z invoke() {
            q.f fVar = this.f31932u;
            kotlin.jvm.internal.i.g(fVar, "<this>");
            ht.h additionalAnnotations = this.f31933v;
            kotlin.jvm.internal.i.g(additionalAnnotations, "additionalAnnotations");
            return ((c) fVar.f29104v).f31949q.b((z) ((hs.d) fVar.f29107y).getValue(), additionalAnnotations);
        }
    }

    public static q.f a(q.f fVar, gt.f containingDeclaration, y yVar, int i6) {
        j jVar;
        if ((i6 & 2) != 0) {
            yVar = null;
        }
        kotlin.jvm.internal.i.g(fVar, "<this>");
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        hs.d N = sp.b.N(3, new st.a(fVar, containingDeclaration));
        c cVar = (c) fVar.f29104v;
        if (yVar != null) {
            jVar = new g(fVar, containingDeclaration, yVar, 0);
        } else {
            jVar = (j) fVar.f29105w;
        }
        return new q.f(cVar, jVar, N);
    }

    public static final q.f b(q.f fVar, ht.h additionalAnnotations) {
        kotlin.jvm.internal.i.g(fVar, "<this>");
        kotlin.jvm.internal.i.g(additionalAnnotations, "additionalAnnotations");
        if (!additionalAnnotations.isEmpty()) {
            return new q.f((c) fVar.f29104v, (j) fVar.f29105w, sp.b.N(3, new a(fVar, additionalAnnotations)));
        }
        return fVar;
    }
}
