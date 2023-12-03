package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.AbstractC0714b;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
final class F3 extends I3 implements j$.util.F, DoubleConsumer {
    double f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F3(j$.util.F f, long j10, long j11) {
        super(f, j10, j11);
    }

    F3(j$.util.F f, F3 f32) {
        super(f, f32);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f = d10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.L3
    protected final j$.util.S b(j$.util.S s10) {
        return new F3((j$.util.F) s10, this);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.a(this, consumer);
    }

    @Override // j$.util.stream.I3
    protected final void g(Object obj) {
        ((DoubleConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.I3
    protected final AbstractC0795m3 i(int i6) {
        return new C0780j3(i6);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.h(this, consumer);
    }
}
