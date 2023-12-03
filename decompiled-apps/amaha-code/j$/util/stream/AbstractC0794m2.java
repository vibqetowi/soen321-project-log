package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.m2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0794m2 implements InterfaceC0814q2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0818r2 f21507a;

    public AbstractC0794m2(InterfaceC0818r2 interfaceC0818r2) {
        this.f21507a = (InterfaceC0818r2) Objects.requireNonNull(interfaceC0818r2);
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public boolean e() {
        return this.f21507a.e();
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public void end() {
        this.f21507a.end();
    }

    @Override // j$.util.stream.InterfaceC0814q2
    public final /* synthetic */ void l(Long l2) {
        AbstractC0850z0.E(this, l2);
    }
}
