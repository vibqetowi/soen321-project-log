package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.u0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0830u0 extends AbstractC0834v0 implements InterfaceC0804o2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0830u0(EnumC0838w0 enumC0838w0) {
        super(enumC0838w0);
    }

    @Override // j$.util.stream.AbstractC0834v0, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        if (!this.f21565a) {
            throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0804o2
    public final /* synthetic */ void m(Double d10) {
        AbstractC0850z0.A(this, d10);
    }
}
