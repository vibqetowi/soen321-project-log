package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S extends U implements InterfaceC0814q2 {

    /* renamed from: b  reason: collision with root package name */
    final LongConsumer f21376b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(LongConsumer longConsumer, boolean z10) {
        super(z10);
        this.f21376b = longConsumer;
    }

    @Override // j$.util.stream.U, j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f21376b.accept(j10);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0814q2
    public final /* synthetic */ void l(Long l2) {
        AbstractC0850z0.E(this, l2);
    }
}
