package kotlinx.coroutines;
/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: classes2.dex */
public abstract class k1 extends a0 {
    public abstract k1 L0();

    @Override // kotlinx.coroutines.a0
    public String toString() {
        k1 k1Var;
        String str;
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        k1 k1Var2 = kotlinx.coroutines.internal.k.f23608a;
        if (this == k1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                k1Var = k1Var2.L0();
            } catch (UnsupportedOperationException unused) {
                k1Var = null;
            }
            if (this == k1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            return getClass().getSimpleName() + '@' + e0.q(this);
        }
        return str;
    }
}
