package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.t0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0826t0 extends AbstractC0834v0 implements InterfaceC0814q2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0826t0(EnumC0838w0 enumC0838w0) {
        super(enumC0838w0);
    }

    @Override // j$.util.stream.AbstractC0834v0, j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        if (!this.f21565a) {
            throw null;
        }
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
