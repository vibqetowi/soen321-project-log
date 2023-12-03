package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
final class O1 implements U1, InterfaceC0809p2 {

    /* renamed from: a  reason: collision with root package name */
    private int f21349a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f21350b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f21351c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O1(int i6, IntBinaryOperator intBinaryOperator) {
        this.f21350b = i6;
        this.f21351c = intBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        this.f21349a = this.f21351c.applyAsInt(this.f21349a, i6);
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

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        this.f21349a = this.f21350b;
    }

    @Override // j$.util.stream.InterfaceC0809p2
    public final /* synthetic */ void d(Integer num) {
        AbstractC0850z0.C(this, num);
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
        return Integer.valueOf(this.f21349a);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        accept(((O1) u12).f21349a);
    }
}
