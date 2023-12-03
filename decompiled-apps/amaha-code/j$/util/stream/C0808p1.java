package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0808p1 extends C0803o1 implements C0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0808p1(long j10) {
        super(j10);
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
        int i6 = this.f21526b;
        long[] jArr = this.f21525a;
        if (i6 >= jArr.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
        }
        this.f21526b = i6 + 1;
        jArr[i6] = j10;
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

    @Override // j$.util.stream.C0, j$.util.stream.D0
    public final G0 build() {
        int i6 = this.f21526b;
        long[] jArr = this.f21525a;
        if (i6 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f21526b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.C0, j$.util.stream.D0
    public final /* bridge */ /* synthetic */ I0 build() {
        build();
        return this;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        long[] jArr = this.f21525a;
        if (j10 != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(jArr.length)));
        }
        this.f21526b = 0;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void end() {
        int i6 = this.f21526b;
        long[] jArr = this.f21525a;
        if (i6 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f21526b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.InterfaceC0814q2
    public final /* synthetic */ void l(Long l2) {
        AbstractC0850z0.E(this, l2);
    }

    @Override // j$.util.stream.C0803o1
    public final String toString() {
        long[] jArr = this.f21525a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f21526b), Arrays.toString(jArr));
    }
}
