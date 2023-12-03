package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
final class X2 extends Z2 implements j$.util.L {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Y2 f21408g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(Y2 y22, int i6, int i10, int i11, int i12) {
        super(y22, i6, i10, i11, i12);
        this.f21408g = y22;
    }

    @Override // j$.util.stream.Z2
    final void a(int i6, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i6]);
    }

    @Override // j$.util.stream.Z2
    final j$.util.O b(Object obj, int i6, int i10) {
        return j$.util.g0.l((long[]) obj, i6, i10 + i6);
    }

    @Override // j$.util.stream.Z2
    final j$.util.O c(int i6, int i10, int i11, int i12) {
        return new X2(this.f21408g, i6, i10, i11, i12);
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
