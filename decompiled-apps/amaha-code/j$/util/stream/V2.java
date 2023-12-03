package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
final class V2 extends Z2 implements j$.util.I {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ W2 f21400g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(W2 w22, int i6, int i10, int i11, int i12) {
        super(w22, i6, i10, i11, i12);
        this.f21400g = w22;
    }

    @Override // j$.util.stream.Z2
    final void a(int i6, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i6]);
    }

    @Override // j$.util.stream.Z2
    final j$.util.O b(Object obj, int i6, int i10) {
        return j$.util.g0.k((int[]) obj, i6, i10 + i6);
    }

    @Override // j$.util.stream.Z2
    final j$.util.O c(int i6, int i10, int i11, int i12) {
        return new V2(this.f21400g, i6, i10, i11, i12);
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
