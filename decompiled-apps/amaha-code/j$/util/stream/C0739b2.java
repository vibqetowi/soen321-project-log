package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0739b2 extends AbstractC0756f {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC0850z0 f21426h;

    C0739b2(C0739b2 c0739b2, j$.util.S s10) {
        super(c0739b2, s10);
        this.f21426h = c0739b2.f21426h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0739b2(AbstractC0850z0 abstractC0850z0, AbstractC0850z0 abstractC0850z02, j$.util.S s10) {
        super(abstractC0850z02, s10);
        this.f21426h = abstractC0850z0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0756f
    public final Object a() {
        AbstractC0850z0 abstractC0850z0 = this.f21452a;
        U1 G0 = this.f21426h.G0();
        abstractC0850z0.I0(this.f21453b, G0);
        return G0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0756f
    public final AbstractC0756f e(j$.util.S s10) {
        return new C0739b2(this, s10);
    }

    @Override // j$.util.stream.AbstractC0756f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0756f abstractC0756f = this.f21455d;
        if (!(abstractC0756f == null)) {
            U1 u12 = (U1) ((C0739b2) abstractC0756f).c();
            u12.h((U1) ((C0739b2) this.f21456e).c());
            f(u12);
        }
        super.onCompletion(countedCompleter);
    }
}
