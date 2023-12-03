package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.k1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0783k1 extends AbstractC0788l1 implements j$.util.L {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0783k1(G0 g02) {
        super(g02);
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
