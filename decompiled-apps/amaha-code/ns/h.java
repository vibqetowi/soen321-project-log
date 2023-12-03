package ns;

import kotlin.jvm.internal.y;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class h extends g implements kotlin.jvm.internal.e<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final int f26781u;

    public h(ls.d dVar) {
        super(dVar);
        this.f26781u = 2;
    }

    @Override // kotlin.jvm.internal.e
    public final int getArity() {
        return this.f26781u;
    }

    @Override // ns.a
    public final String toString() {
        if (getCompletion() == null) {
            String g5 = y.f23470a.g(this);
            kotlin.jvm.internal.i.f(g5, "renderLambdaToString(this)");
            return g5;
        }
        return super.toString();
    }
}
