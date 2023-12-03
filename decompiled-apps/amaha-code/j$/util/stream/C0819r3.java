package j$.util.stream;

import j$.util.AbstractC0714b;
import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0819r3 extends AbstractC0775i3 implements j$.util.F {
    C0819r3(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10) {
        super(abstractC0850z0, s10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0819r3(AbstractC0850z0 abstractC0850z0, C0731a c0731a, boolean z10) {
        super(abstractC0850z0, c0731a, z10);
    }

    @Override // j$.util.stream.AbstractC0775i3
    final void d() {
        U2 u22 = new U2();
        this.f21494h = u22;
        Objects.requireNonNull(u22);
        this.f21492e = this.f21489b.J0(new C0815q3(u22, 0));
        this.f = new C0731a(this, 3);
    }

    @Override // j$.util.stream.AbstractC0775i3
    final AbstractC0775i3 e(j$.util.S s10) {
        return new C0819r3(this.f21489b, s10, this.f21488a);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.a(this, consumer);
    }

    @Override // j$.util.O
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f21494h != null || this.f21495i) {
            do {
            } while (tryAdvance(doubleConsumer));
            return;
        }
        Objects.requireNonNull(doubleConsumer);
        c();
        Objects.requireNonNull(doubleConsumer);
        C0815q3 c0815q3 = new C0815q3(doubleConsumer, 1);
        this.f21489b.I0(this.f21491d, c0815q3);
        this.f21495i = true;
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.h(this, consumer);
    }

    @Override // j$.util.O
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        boolean a10 = a();
        if (a10) {
            U2 u22 = (U2) this.f21494h;
            long j10 = this.f21493g;
            int q10 = u22.q(j10);
            doubleConsumer.accept((u22.f21446c == 0 && q10 == 0) ? ((double[]) u22.f21421e)[(int) j10] : ((double[][]) u22.f)[q10][(int) (j10 - u22.f21447d[q10])]);
        }
        return a10;
    }

    @Override // j$.util.stream.AbstractC0775i3, j$.util.S
    public final j$.util.F trySplit() {
        return (j$.util.F) super.trySplit();
    }
}
