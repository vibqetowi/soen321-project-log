package wu;

import java.util.Collection;
/* compiled from: AbstractTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.k implements ss.l<x0, Iterable<? extends b0>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f f37242u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super(1);
        this.f37242u = fVar;
    }

    @Override // ss.l
    public final Iterable<? extends b0> invoke(x0 x0Var) {
        f fVar;
        x0 it = x0Var;
        kotlin.jvm.internal.i.g(it, "it");
        this.f37242u.getClass();
        if (it instanceof f) {
            fVar = (f) it;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            return is.u.u2(fVar.i(), fVar.f37231b.invoke().f37232a);
        }
        Collection<b0> supertypes = it.c();
        kotlin.jvm.internal.i.f(supertypes, "supertypes");
        return supertypes;
    }
}
