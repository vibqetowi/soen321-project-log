package kotlinx.coroutines;
/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class o extends d1 implements n {

    /* renamed from: y  reason: collision with root package name */
    public final p f23639y;

    public o(g1 g1Var) {
        this.f23639y = g1Var;
    }

    @Override // kotlinx.coroutines.w
    public final void B(Throwable th2) {
        this.f23639y.v0(C());
    }

    @Override // kotlinx.coroutines.n
    public final boolean d(Throwable th2) {
        return C().C(th2);
    }

    @Override // kotlinx.coroutines.n
    public final c1 getParent() {
        return C();
    }

    @Override // ss.l
    public final /* bridge */ /* synthetic */ hs.k invoke(Throwable th2) {
        B(th2);
        return hs.k.f19476a;
    }
}
