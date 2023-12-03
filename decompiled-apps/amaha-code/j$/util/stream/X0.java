package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X0 extends W0 implements A0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public X0(long j10) {
        super(j10);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        int i6 = this.f21406b;
        double[] dArr = this.f21405a;
        if (i6 >= dArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
        }
        this.f21406b = i6 + 1;
        dArr[i6] = d10;
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

    @Override // j$.util.stream.A0, j$.util.stream.D0
    public final E0 build() {
        int i6 = this.f21406b;
        double[] dArr = this.f21405a;
        if (i6 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f21406b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.A0, j$.util.stream.D0
    public final /* bridge */ /* synthetic */ I0 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        double[] dArr = this.f21405a;
        if (j10 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(dArr.length)));
        }
        this.f21406b = 0;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void end() {
        int i6 = this.f21406b;
        double[] dArr = this.f21405a;
        if (i6 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f21406b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC0804o2
    public final /* synthetic */ void m(Double d10) {
        AbstractC0850z0.A(this, d10);
    }

    @Override // j$.util.stream.W0
    public final String toString() {
        double[] dArr = this.f21405a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f21406b), Arrays.toString(dArr));
    }
}
