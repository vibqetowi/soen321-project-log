package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.IntConsumer;
/* renamed from: j$.util.stream.s0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0821s0 extends AbstractC0834v0 implements InterfaceC0809p2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0821s0(EnumC0838w0 enumC0838w0) {
        super(enumC0838w0);
    }

    @Override // j$.util.stream.AbstractC0834v0, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        if (!this.f21565a) {
            throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0809p2
    public final /* synthetic */ void d(Integer num) {
        AbstractC0850z0.C(this, num);
    }
}
