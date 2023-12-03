package j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class L0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    final Object[] f21318a;

    /* renamed from: b  reason: collision with root package name */
    int f21319b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L0(long j10, IntFunction intFunction) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21318a = (Object[]) intFunction.apply((int) j10);
        this.f21319b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L0(Object[] objArr) {
        this.f21318a = objArr;
        this.f21319b = objArr.length;
    }

    @Override // j$.util.stream.I0
    public final I0 a(int i6) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return this.f21319b;
    }

    @Override // j$.util.stream.I0
    public final void forEach(Consumer consumer) {
        for (int i6 = 0; i6 < this.f21319b; i6++) {
            consumer.accept(this.f21318a[i6]);
        }
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.S(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.I0
    public final void j(Object[] objArr, int i6) {
        System.arraycopy(this.f21318a, 0, objArr, i6, this.f21319b);
    }

    @Override // j$.util.stream.I0
    public final Object[] k(IntFunction intFunction) {
        Object[] objArr = this.f21318a;
        if (objArr.length == this.f21319b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.I0
    public final j$.util.S spliterator() {
        return j$.util.g0.m(this.f21318a, 0, this.f21319b);
    }

    public String toString() {
        Object[] objArr = this.f21318a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f21319b), Arrays.toString(objArr));
    }
}
