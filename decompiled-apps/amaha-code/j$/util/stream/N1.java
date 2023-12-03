package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
/* loaded from: classes3.dex */
final class N1 extends V1 implements U1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f21342b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiConsumer f21343c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BiConsumer f21344d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f21342b = supplier;
        this.f21343c = biConsumer;
        this.f21344d = biConsumer2;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(int i6) {
        AbstractC0850z0.G();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        AbstractC0850z0.H();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f21343c.accept(this.f21399a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21399a = this.f21342b.get();
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        this.f21344d.accept(this.f21399a, ((N1) u12).f21399a);
    }
}
