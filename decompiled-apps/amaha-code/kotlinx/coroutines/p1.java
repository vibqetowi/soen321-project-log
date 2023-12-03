package kotlinx.coroutines;
/* compiled from: CancellableContinuation.kt */
/* loaded from: classes2.dex */
public final class p1 extends d {

    /* renamed from: u  reason: collision with root package name */
    public final kotlinx.coroutines.internal.g f23643u;

    public p1(kotlinx.coroutines.internal.g gVar) {
        this.f23643u = gVar;
    }

    @Override // kotlinx.coroutines.i
    public final void a(Throwable th2) {
        this.f23643u.w();
    }

    @Override // ss.l
    public final /* bridge */ /* synthetic */ hs.k invoke(Throwable th2) {
        a(th2);
        return hs.k.f19476a;
    }

    public final String toString() {
        return "RemoveOnCancel[" + this.f23643u + ']';
    }
}
