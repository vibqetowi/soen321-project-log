package kotlin.jvm.internal;

import kotlinx.coroutines.e0;
import kotlinx.coroutines.internal.g;
/* compiled from: PropertyReference0.java */
/* loaded from: classes2.dex */
public abstract class p extends t implements ys.k {
    public p(Object obj) {
        super(obj, e0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.internal.a
    public final ys.c computeReflected() {
        return y.f23470a.e(this);
    }

    @Override // ss.a
    public final Object invoke() {
        return ((g.b) this).o();
    }
}
