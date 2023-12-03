package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0827t1 extends AbstractC0835v1 implements InterfaceC0814q2 {

    /* renamed from: h  reason: collision with root package name */
    private final long[] f21552h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0827t1(j$.util.S s10, AbstractC0850z0 abstractC0850z0, long[] jArr) {
        super(jArr.length, s10, abstractC0850z0);
        this.f21552h = jArr;
    }

    C0827t1(C0827t1 c0827t1, j$.util.S s10, long j10, long j11) {
        super(c0827t1, s10, j10, j11, c0827t1.f21552h.length);
        this.f21552h = c0827t1.f21552h;
    }

    @Override // j$.util.stream.AbstractC0835v1
    final AbstractC0835v1 a(j$.util.S s10, long j10, long j11) {
        return new C0827t1(this, s10, j10, j11);
    }

    @Override // j$.util.stream.AbstractC0835v1, j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        int i6 = this.f;
        if (i6 >= this.f21572g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.f21552h;
        this.f = i6 + 1;
        jArr[i6] = j10;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0814q2
    public final /* synthetic */ void l(Long l2) {
        AbstractC0850z0.E(this, l2);
    }
}
