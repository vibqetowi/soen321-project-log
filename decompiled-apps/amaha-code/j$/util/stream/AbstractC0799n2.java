package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.Objects;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.n2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0799n2 implements InterfaceC0818r2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0818r2 f21519a;

    public AbstractC0799n2(InterfaceC0818r2 interfaceC0818r2) {
        this.f21519a = (InterfaceC0818r2) Objects.requireNonNull(interfaceC0818r2);
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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public boolean e() {
        return this.f21519a.e();
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public void end() {
        this.f21519a.end();
    }
}
