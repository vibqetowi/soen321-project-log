package j$.util.stream;

import j$.util.AbstractC0714b;
import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t3 extends AbstractC0775i3 implements j$.util.I {
    t3(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10) {
        super(abstractC0850z0, s10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t3(AbstractC0850z0 abstractC0850z0, C0731a c0731a, boolean z10) {
        super(abstractC0850z0, c0731a, z10);
    }

    @Override // j$.util.stream.AbstractC0775i3
    final void d() {
        W2 w22 = new W2();
        this.f21494h = w22;
        Objects.requireNonNull(w22);
        this.f21492e = this.f21489b.J0(new C0824s3(w22, 0));
        this.f = new C0731a(this, 4);
    }

    @Override // j$.util.stream.AbstractC0775i3
    final AbstractC0775i3 e(j$.util.S s10) {
        return new t3(this.f21489b, s10, this.f21488a);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.b(this, consumer);
    }

    @Override // j$.util.O
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f21494h != null || this.f21495i) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        C0824s3 c0824s3 = new C0824s3(intConsumer, 1);
        this.f21489b.I0(this.f21491d, c0824s3);
        this.f21495i = true;
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.i(this, consumer);
    }

    @Override // j$.util.O
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean a10 = a();
        if (a10) {
            W2 w22 = (W2) this.f21494h;
            long j10 = this.f21493g;
            int q10 = w22.q(j10);
            intConsumer.accept((w22.f21446c == 0 && q10 == 0) ? ((int[]) w22.f21421e)[(int) j10] : ((int[][]) w22.f)[q10][(int) (j10 - w22.f21447d[q10])]);
        }
        return a10;
    }

    @Override // j$.util.stream.AbstractC0775i3, j$.util.S
    public final j$.util.I trySplit() {
        return (j$.util.I) super.trySplit();
    }
}
