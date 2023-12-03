package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
final class T2 extends Z2 implements j$.util.F {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ U2 f21390g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T2(U2 u22, int i6, int i10, int i11, int i12) {
        super(u22, i6, i10, i11, i12);
        this.f21390g = u22;
    }

    @Override // j$.util.stream.Z2
    final void a(int i6, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i6]);
    }

    @Override // j$.util.stream.Z2
    final j$.util.O b(Object obj, int i6, int i10) {
        return j$.util.g0.j((double[]) obj, i6, i10 + i6);
    }

    @Override // j$.util.stream.Z2
    final j$.util.O c(int i6, int i10, int i11, int i12) {
        return new T2(this.f21390g, i6, i10, i11, i12);
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
