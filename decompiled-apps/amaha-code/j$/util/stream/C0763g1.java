package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0763g1 extends C0758f1 implements B0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0763g1(long j10) {
        super(j10);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        int i10 = this.f21458b;
        int[] iArr = this.f21457a;
        if (i10 >= iArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
        }
        this.f21458b = i10 + 1;
        iArr[i10] = i6;
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

    @Override // j$.util.stream.B0, j$.util.stream.D0
    public final F0 build() {
        int i6 = this.f21458b;
        int[] iArr = this.f21457a;
        if (i6 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f21458b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.B0, j$.util.stream.D0
    public final /* bridge */ /* synthetic */ I0 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        int[] iArr = this.f21457a;
        if (j10 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(iArr.length)));
        }
        this.f21458b = 0;
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
    public final void end() {
        int i6 = this.f21458b;
        int[] iArr = this.f21457a;
        if (i6 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f21458b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.C0758f1
    public final String toString() {
        int[] iArr = this.f21457a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f21458b), Arrays.toString(iArr));
    }
}
