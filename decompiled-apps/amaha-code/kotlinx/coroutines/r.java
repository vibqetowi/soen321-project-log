package kotlinx.coroutines;
/* compiled from: CompletableDeferred.kt */
/* loaded from: classes2.dex */
public final class r<T> extends g1 implements q<T> {
    public r(c1 c1Var) {
        super(true);
        U(c1Var);
    }

    @Override // kotlinx.coroutines.h0
    public final Object e0(ls.d<? super T> dVar) {
        return x(dVar);
    }

    @Override // kotlinx.coroutines.q
    public final boolean l0(T t3) {
        Object j02;
        do {
            j02 = j0(Q(), t3);
            if (j02 == kotlin.jvm.internal.b0.M) {
                return false;
            }
            if (j02 == kotlin.jvm.internal.b0.N) {
                break;
            }
        } while (j02 == kotlin.jvm.internal.b0.O);
        return true;
    }

    @Override // kotlinx.coroutines.h0
    public final T m() {
        return (T) H();
    }
}
