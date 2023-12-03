package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class W0 implements E0 {

    /* renamed from: a  reason: collision with root package name */
    final double[] f21405a;

    /* renamed from: b  reason: collision with root package name */
    int f21406b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W0(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21405a = new double[(int) j10];
        this.f21406b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public W0(double[] dArr) {
        this.f21405a = dArr;
        this.f21406b = dArr.length;
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final H0 a(int i6) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final /* bridge */ /* synthetic */ I0 a(int i6) {
        a(i6);
        throw null;
    }

    @Override // j$.util.stream.H0
    public final Object b() {
        double[] dArr = this.f21405a;
        int length = dArr.length;
        int i6 = this.f21406b;
        return length == i6 ? dArr : Arrays.copyOf(dArr, i6);
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return this.f21406b;
    }

    @Override // j$.util.stream.H0
    public final void f(Object obj, int i6) {
        int i10 = this.f21406b;
        System.arraycopy(this.f21405a, 0, (double[]) obj, i6, i10);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0850z0.M(this, consumer);
    }

    @Override // j$.util.stream.H0
    public final void g(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i6 = 0; i6 < this.f21406b; i6++) {
            doubleConsumer.accept(this.f21405a[i6]);
        }
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.P(this, j10, j11);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return AbstractC0850z0.I(this, intFunction);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.I0
    /* renamed from: o */
    public final /* synthetic */ void j(Double[] dArr, int i6) {
        AbstractC0850z0.J(this, dArr, i6);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final j$.util.O spliterator() {
        return j$.util.g0.j(this.f21405a, 0, this.f21406b);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final j$.util.S spliterator() {
        return j$.util.g0.j(this.f21405a, 0, this.f21406b);
    }

    public String toString() {
        double[] dArr = this.f21405a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f21406b), Arrays.toString(dArr));
    }
}
