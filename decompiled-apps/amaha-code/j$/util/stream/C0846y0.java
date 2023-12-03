package j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: j$.util.stream.y0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0846y0 extends AbstractC0746d {

    /* renamed from: j  reason: collision with root package name */
    private final C0842x0 f21592j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0846y0(C0842x0 c0842x0, AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        super(abstractC0850z0, s10);
        this.f21592j = c0842x0;
    }

    C0846y0(C0846y0 c0846y0, j$.util.S s10) {
        super(c0846y0, s10);
        this.f21592j = c0846y0.f21592j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0756f
    public final Object a() {
        boolean z10;
        Boolean valueOf;
        AbstractC0850z0 abstractC0850z0 = this.f21452a;
        AbstractC0834v0 abstractC0834v0 = (AbstractC0834v0) this.f21592j.f21587b.get();
        abstractC0850z0.I0(this.f21453b, abstractC0834v0);
        boolean z11 = abstractC0834v0.f21566b;
        z10 = this.f21592j.f21586a.f21579b;
        if (z11 == z10 && (valueOf = Boolean.valueOf(z11)) != null) {
            AtomicReference atomicReference = this.f21441h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0756f
    public final AbstractC0756f e(j$.util.S s10) {
        return new C0846y0(this, s10);
    }

    @Override // j$.util.stream.AbstractC0746d
    protected final Object j() {
        boolean z10;
        z10 = this.f21592j.f21586a.f21579b;
        return Boolean.valueOf(!z10);
    }
}
