package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
/* loaded from: classes3.dex */
final class Z0 extends AbstractC0748d1 implements E0 {
    @Override // j$.util.stream.AbstractC0748d1, j$.util.stream.I0
    public final H0 a(int i6) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.AbstractC0748d1, j$.util.stream.I0
    public final /* bridge */ /* synthetic */ I0 a(int i6) {
        a(i6);
        throw null;
    }

    @Override // j$.util.stream.H0
    public final Object b() {
        double[] dArr;
        dArr = AbstractC0850z0.f21607g;
        return dArr;
    }

    @Override // j$.util.stream.I0
    /* renamed from: c */
    public final /* synthetic */ void j(Double[] dArr, int i6) {
        AbstractC0850z0.J(this, dArr, i6);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0850z0.M(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0748d1, j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.P(this, j10, j11);
    }

    @Override // j$.util.stream.I0
    public final j$.util.O spliterator() {
        return j$.util.g0.b();
    }

    @Override // j$.util.stream.I0
    public final j$.util.S spliterator() {
        return j$.util.g0.b();
    }
}
