package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W1 extends AbstractC0734a2 implements InterfaceC0804o2 {
    @Override // j$.util.stream.AbstractC0734a2, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        this.f21420b++;
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
