package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q extends U implements InterfaceC0809p2 {

    /* renamed from: b  reason: collision with root package name */
    final IntConsumer f21362b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(IntConsumer intConsumer, boolean z10) {
        super(z10);
        this.f21362b = intConsumer;
    }

    @Override // j$.util.stream.U, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        this.f21362b.accept(i6);
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
