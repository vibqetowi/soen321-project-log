package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B3 extends C3 implements j$.util.L {
    /* JADX INFO: Access modifiers changed from: package-private */
    public B3(j$.util.L l2, long j10, long j11) {
        super(l2, j10, j11);
    }

    B3(j$.util.L l2, long j10, long j11, long j12, long j13) {
        super(l2, j10, j11, j12, j13);
    }

    @Override // j$.util.stream.E3
    protected final j$.util.S a(j$.util.S s10, long j10, long j11, long j12, long j13) {
        return new B3((j$.util.L) s10, j10, j11, j12, j13);
    }

    @Override // j$.util.stream.C3
    protected final Object b() {
        return new A3(0);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.c(this, consumer);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.j(this, consumer);
    }
}
