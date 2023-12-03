package kotlinx.coroutines;
/* compiled from: Unconfined.kt */
/* loaded from: classes2.dex */
public final class v1 extends a0 {

    /* renamed from: w  reason: collision with root package name */
    public static final v1 f23710w = new v1();

    @Override // kotlinx.coroutines.a0
    public final void f0(ls.f fVar, Runnable runnable) {
        if (((y1) fVar.e(y1.f23718v)) != null) {
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // kotlinx.coroutines.a0
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
