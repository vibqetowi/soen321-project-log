package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.AbstractC0714b;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
final class H3 extends I3 implements j$.util.L, LongConsumer {
    long f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H3(j$.util.L l2, long j10, long j11) {
        super(l2, j10, j11);
    }

    H3(j$.util.L l2, H3 h32) {
        super(l2, h32);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f = j10;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }

    @Override // j$.util.stream.L3
    protected final j$.util.S b(j$.util.S s10) {
        return new H3((j$.util.L) s10, this);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.c(this, consumer);
    }

    @Override // j$.util.stream.I3
    protected final void g(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.I3
    protected final AbstractC0795m3 i(int i6) {
        return new C0790l3(i6);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.j(this, consumer);
    }
}
