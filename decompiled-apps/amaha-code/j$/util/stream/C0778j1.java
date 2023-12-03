package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.j1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0778j1 extends AbstractC0788l1 implements j$.util.I {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0778j1(F0 f02) {
        super(f02);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0714b.b(this, consumer);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC0714b.i(this, consumer);
    }
}
