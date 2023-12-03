package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class x3 extends C3 implements j$.util.F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x3(j$.util.F f, long j10, long j11) {
        super(f, j10, j11);
    }

    x3(j$.util.F f, long j10, long j11, long j12, long j13) {
        super(f, j10, j11, j12, j13);
    }

    @Override // j$.util.stream.E3
    protected final j$.util.S a(j$.util.S s10, long j10, long j11, long j12, long j13) {
        return new x3((j$.util.F) s10, j10, j11, j12, j13);
    }

    @Override // j$.util.stream.C3
    protected final Object b() {
        return new w3(0);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.a(this, consumer);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.h(this, consumer);
    }
}
