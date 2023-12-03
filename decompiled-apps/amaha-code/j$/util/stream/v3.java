package j$.util.stream;

import j$.util.AbstractC0714b;
import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class v3 extends AbstractC0775i3 implements j$.util.L {
    v3(AbstractC0850z0 abstractC0850z0, j$.util.S s10, boolean z10) {
        super(abstractC0850z0, s10, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v3(AbstractC0850z0 abstractC0850z0, C0731a c0731a, boolean z10) {
        super(abstractC0850z0, c0731a, z10);
    }

    @Override // j$.util.stream.AbstractC0775i3
    final void d() {
        Y2 y22 = new Y2();
        this.f21494h = y22;
        Objects.requireNonNull(y22);
        this.f21492e = this.f21489b.J0(new u3(y22, 0));
        this.f = new C0731a(this, 5);
    }

    @Override // j$.util.stream.AbstractC0775i3
    final AbstractC0775i3 e(j$.util.S s10) {
        return new v3(this.f21489b, s10, this.f21488a);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.c(this, consumer);
    }

    @Override // j$.util.O
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f21494h != null || this.f21495i) {
            do {
            } while (tryAdvance(longConsumer));
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        u3 u3Var = new u3(longConsumer, 1);
        this.f21489b.I0(this.f21491d, u3Var);
        this.f21495i = true;
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.j(this, consumer);
    }

    @Override // j$.util.O
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean a10 = a();
        if (a10) {
            Y2 y22 = (Y2) this.f21494h;
            long j10 = this.f21493g;
            int q10 = y22.q(j10);
            longConsumer.accept((y22.f21446c == 0 && q10 == 0) ? ((long[]) y22.f21421e)[(int) j10] : ((long[][]) y22.f)[q10][(int) (j10 - y22.f21447d[q10])]);
        }
        return a10;
    }

    @Override // j$.util.stream.AbstractC0775i3, j$.util.S
    public final j$.util.L trySplit() {
        return (j$.util.L) super.trySplit();
    }
}
