package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0822s1 extends AbstractC0835v1 implements InterfaceC0809p2 {

    /* renamed from: h  reason: collision with root package name */
    private final int[] f21545h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0822s1(j$.util.S s10, AbstractC0850z0 abstractC0850z0, int[] iArr) {
        super(iArr.length, s10, abstractC0850z0);
        this.f21545h = iArr;
    }

    C0822s1(C0822s1 c0822s1, j$.util.S s10, long j10, long j11) {
        super(c0822s1, s10, j10, j11, c0822s1.f21545h.length);
        this.f21545h = c0822s1.f21545h;
    }

    @Override // j$.util.stream.AbstractC0835v1
    final AbstractC0835v1 a(j$.util.S s10, long j10, long j11) {
        return new C0822s1(this, s10, j10, j11);
    }

    @Override // j$.util.stream.AbstractC0835v1, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        int i10 = this.f;
        if (i10 >= this.f21572g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.f21545h;
        this.f = i10 + 1;
        iArr[i10] = i6;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0809p2
    public final /* synthetic */ void d(Integer num) {
        AbstractC0850z0.C(this, num);
    }
}
