package ns;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(ls.d<Object> dVar) {
        super(dVar);
        boolean z10;
        if (dVar != null) {
            if (dVar.getContext() == ls.g.f24521u) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // ls.d
    public final ls.f getContext() {
        return ls.g.f24521u;
    }
}
