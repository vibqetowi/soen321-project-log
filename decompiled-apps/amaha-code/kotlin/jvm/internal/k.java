package kotlin.jvm.internal;

import java.io.Serializable;
/* compiled from: Lambda.kt */
/* loaded from: classes2.dex */
public abstract class k<R> implements e<R>, Serializable {
    private final int arity;

    public k(int i6) {
        this.arity = i6;
    }

    @Override // kotlin.jvm.internal.e
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String h10 = y.f23470a.h(this);
        i.f(h10, "renderLambdaToString(this)");
        return h10;
    }
}
