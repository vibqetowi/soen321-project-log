package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.o1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0803o1 implements G0 {

    /* renamed from: a  reason: collision with root package name */
    final long[] f21525a;

    /* renamed from: b  reason: collision with root package name */
    int f21526b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0803o1(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21525a = new long[(int) j10];
        this.f21526b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0803o1(long[] jArr) {
        this.f21525a = jArr;
        this.f21526b = jArr.length;
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
        long[] jArr = this.f21525a;
        int length = jArr.length;
        int i6 = this.f21526b;
        return length == i6 ? jArr : Arrays.copyOf(jArr, i6);
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return this.f21526b;
    }

    @Override // j$.util.stream.H0
    public final void f(Object obj, int i6) {
        int i10 = this.f21526b;
        System.arraycopy(this.f21525a, 0, (long[]) obj, i6, i10);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0850z0.O(this, consumer);
    }

    @Override // j$.util.stream.H0
    public final void g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i6 = 0; i6 < this.f21526b; i6++) {
            longConsumer.accept(this.f21525a[i6]);
        }
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.R(this, j10, j11);
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
    public final /* synthetic */ void j(Long[] lArr, int i6) {
        AbstractC0850z0.L(this, lArr, i6);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final j$.util.O spliterator() {
        return j$.util.g0.l(this.f21525a, 0, this.f21526b);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final j$.util.S spliterator() {
        return j$.util.g0.l(this.f21525a, 0, this.f21526b);
    }

    public String toString() {
        long[] jArr = this.f21525a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f21526b), Arrays.toString(jArr));
    }
}
