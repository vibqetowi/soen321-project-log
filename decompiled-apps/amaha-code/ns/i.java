package ns;

import kotlin.jvm.internal.y;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class i extends c implements kotlin.jvm.internal.e<Object> {
    private final int arity;

    public i(int i6, ls.d<Object> dVar) {
        super(dVar);
        this.arity = i6;
    }

    @Override // kotlin.jvm.internal.e
    public int getArity() {
        return this.arity;
    }

    @Override // ns.a
    public String toString() {
        if (getCompletion() == null) {
            String g5 = y.f23470a.g(this);
            kotlin.jvm.internal.i.f(g5, "renderLambdaToString(this)");
            return g5;
        }
        return super.toString();
    }

    public i(int i6) {
        this(i6, null);
    }
}
