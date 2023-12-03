package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.AbstractC0714b;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
final class G3 extends I3 implements j$.util.I, IntConsumer {
    int f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G3(j$.util.I i6, long j10, long j11) {
        super(i6, j10, j11);
    }

    G3(j$.util.I i6, G3 g32) {
        super(i6, g32);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        this.f = i6;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }

    @Override // j$.util.stream.L3
    protected final j$.util.S b(j$.util.S s10) {
        return new G3((j$.util.I) s10, this);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.b(this, consumer);
    }

    @Override // j$.util.stream.I3
    protected final void g(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // j$.util.stream.I3
    protected final AbstractC0795m3 i(int i6) {
        return new C0785k3(i6);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.i(this, consumer);
    }
}
