package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.k2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0784k2 implements InterfaceC0804o2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0818r2 f21501a;

    public AbstractC0784k2(InterfaceC0818r2 interfaceC0818r2) {
        this.f21501a = (InterfaceC0818r2) Objects.requireNonNull(interfaceC0818r2);
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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public boolean e() {
        return this.f21501a.e();
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public void end() {
        this.f21501a.end();
    }

    @Override // j$.util.stream.InterfaceC0804o2
    public final /* synthetic */ void m(Double d10) {
        AbstractC0850z0.A(this, d10);
    }
}
