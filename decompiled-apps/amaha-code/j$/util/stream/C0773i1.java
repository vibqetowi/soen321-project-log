package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.i1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0773i1 extends AbstractC0788l1 implements j$.util.F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0773i1(E0 e0) {
        super(e0);
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
