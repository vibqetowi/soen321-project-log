package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
/* loaded from: classes3.dex */
final class K1 implements U1 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f21312a;

    /* renamed from: b  reason: collision with root package name */
    private Object f21313b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f21314c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K1(BinaryOperator binaryOperator) {
        this.f21314c = binaryOperator;
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
        if (this.f21312a) {
            this.f21312a = false;
        } else {
            obj = this.f21314c.apply(this.f21313b, obj);
        }
        this.f21313b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21312a = true;
        this.f21313b = null;
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
        return this.f21312a ? Optional.a() : Optional.d(this.f21313b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        K1 k12 = (K1) u12;
        if (k12.f21312a) {
            return;
        }
        accept(k12.f21313b);
    }
}
