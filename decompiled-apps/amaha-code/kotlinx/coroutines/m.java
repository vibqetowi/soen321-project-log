package kotlinx.coroutines;
/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class m extends d1 {

    /* renamed from: y  reason: collision with root package name */
    public final k<?> f23636y;

    public m(k<?> kVar) {
        this.f23636y = kVar;
    }

    @Override // kotlinx.coroutines.w
    public final void B(Throwable th2) {
        boolean n10;
        g1 C = C();
        k<?> kVar = this.f23636y;
        Throwable r = kVar.r(C);
        if (!kVar.z()) {
            n10 = false;
        } else {
            n10 = ((kotlinx.coroutines.internal.d) kVar.f23630x).n(r);
        }
        if (!n10) {
            kVar.w(r);
            if (!kVar.z()) {
                kVar.o();
            }
        }
    }

    @Override // ss.l
    public final /* bridge */ /* synthetic */ hs.k invoke(Throwable th2) {
        B(th2);
        return hs.k.f19476a;
    }
}
