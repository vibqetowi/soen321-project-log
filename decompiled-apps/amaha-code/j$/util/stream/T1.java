package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.C0727o;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
final class T1 implements U1, InterfaceC0814q2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f21387a;

    /* renamed from: b  reason: collision with root package name */
    private long f21388b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f21389c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T1(LongBinaryOperator longBinaryOperator) {
        this.f21389c = longBinaryOperator;
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
    public final void accept(long j10) {
        if (this.f21387a) {
            this.f21387a = false;
        } else {
            j10 = ((Y) this.f21389c).b(this.f21388b, j10);
        }
        this.f21388b = j10;
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
    public final void c(long j10) {
        this.f21387a = true;
        this.f21388b = 0L;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void end() {
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f21387a ? C0727o.a() : C0727o.d(this.f21388b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        T1 t1 = (T1) u12;
        if (t1.f21387a) {
            return;
        }
        accept(t1.f21388b);
    }

    @Override // j$.util.stream.InterfaceC0814q2
    public final /* synthetic */ void l(Long l2) {
        AbstractC0850z0.E(this, l2);
    }
}
