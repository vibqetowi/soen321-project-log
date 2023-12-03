package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X1 extends AbstractC0734a2 implements InterfaceC0809p2 {
    @Override // j$.util.stream.AbstractC0734a2, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        this.f21420b++;
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
