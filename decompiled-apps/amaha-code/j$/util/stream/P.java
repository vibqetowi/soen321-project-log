package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P extends U implements InterfaceC0804o2 {

    /* renamed from: b  reason: collision with root package name */
    final DoubleConsumer f21356b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(DoubleConsumer doubleConsumer, boolean z10) {
        super(z10);
        this.f21356b = doubleConsumer;
    }

    @Override // j$.util.stream.U, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        this.f21356b.accept(d10);
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
