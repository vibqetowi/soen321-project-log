package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0817r1 extends AbstractC0835v1 implements InterfaceC0804o2 {

    /* renamed from: h  reason: collision with root package name */
    private final double[] f21542h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0817r1(j$.util.S s10, AbstractC0850z0 abstractC0850z0, double[] dArr) {
        super(dArr.length, s10, abstractC0850z0);
        this.f21542h = dArr;
    }

    C0817r1(C0817r1 c0817r1, j$.util.S s10, long j10, long j11) {
        super(c0817r1, s10, j10, j11, c0817r1.f21542h.length);
        this.f21542h = c0817r1.f21542h;
    }

    @Override // j$.util.stream.AbstractC0835v1
    final AbstractC0835v1 a(j$.util.S s10, long j10, long j11) {
        return new C0817r1(this, s10, j10, j11);
    }

    @Override // j$.util.stream.AbstractC0835v1, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        int i6 = this.f;
        if (i6 >= this.f21572g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        double[] dArr = this.f21542h;
        this.f = i6 + 1;
        dArr[i6] = d10;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0804o2
    public final /* synthetic */ void m(Double d10) {
        AbstractC0850z0.A(this, d10);
    }
}
