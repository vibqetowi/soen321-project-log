package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.stream.l2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0789l2 implements InterfaceC0809p2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0818r2 f21504a;

    public AbstractC0789l2(InterfaceC0818r2 interfaceC0818r2) {
        this.f21504a = (InterfaceC0818r2) Objects.requireNonNull(interfaceC0818r2);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j10) {
        AbstractC0850z0.H();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0809p2
    public final /* synthetic */ void d(Integer num) {
        AbstractC0850z0.C(this, num);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public boolean e() {
        return this.f21504a.e();
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public void end() {
        this.f21504a.end();
    }
}
