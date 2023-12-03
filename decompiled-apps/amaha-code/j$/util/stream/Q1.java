package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.C0726n;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
final class Q1 implements U1, InterfaceC0809p2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f21366a;

    /* renamed from: b  reason: collision with root package name */
    private int f21367b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f21368c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q1(IntBinaryOperator intBinaryOperator) {
        this.f21368c = intBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        if (this.f21366a) {
            this.f21366a = false;
        } else {
            i6 = this.f21368c.applyAsInt(this.f21367b, i6);
        }
        this.f21367b = i6;
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
        this.f21366a = true;
        this.f21367b = 0;
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
        return this.f21366a ? C0726n.a() : C0726n.d(this.f21367b);
    }

    @Override // j$.util.stream.U1
    public final void h(U1 u12) {
        Q1 q1 = (Q1) u12;
        if (q1.f21366a) {
            return;
        }
        accept(q1.f21367b);
    }
}
