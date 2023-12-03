package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0758f1 implements F0 {

    /* renamed from: a  reason: collision with root package name */
    final int[] f21457a;

    /* renamed from: b  reason: collision with root package name */
    int f21458b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0758f1(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21457a = new int[(int) j10];
        this.f21458b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0758f1(int[] iArr) {
        this.f21457a = iArr;
        this.f21458b = iArr.length;
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
        int[] iArr = this.f21457a;
        int length = iArr.length;
        int i6 = this.f21458b;
        return length == i6 ? iArr : Arrays.copyOf(iArr, i6);
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return this.f21458b;
    }

    @Override // j$.util.stream.H0
    public final void f(Object obj, int i6) {
        int i10 = this.f21458b;
        System.arraycopy(this.f21457a, 0, (int[]) obj, i6, i10);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0850z0.N(this, consumer);
    }

    @Override // j$.util.stream.H0
    public final void g(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i6 = 0; i6 < this.f21458b; i6++) {
            intConsumer.accept(this.f21457a[i6]);
        }
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.Q(this, j10, j11);
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
    public final /* synthetic */ void j(Integer[] numArr, int i6) {
        AbstractC0850z0.K(this, numArr, i6);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final j$.util.O spliterator() {
        return j$.util.g0.k(this.f21457a, 0, this.f21458b);
    }

    @Override // j$.util.stream.H0, j$.util.stream.I0
    public final j$.util.S spliterator() {
        return j$.util.g0.k(this.f21457a, 0, this.f21458b);
    }

    public String toString() {
        int[] iArr = this.f21457a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f21458b), Arrays.toString(iArr));
    }
}
