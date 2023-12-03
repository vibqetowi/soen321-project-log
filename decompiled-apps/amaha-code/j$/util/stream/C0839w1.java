package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0839w1 extends C0740b3 implements I0, D0 {
    @Override // j$.util.stream.I0
    public final I0 a(int i6) {
        throw new IndexOutOfBoundsException();
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
    public final /* synthetic */ void accept(long j10) {
        AbstractC0850z0.H();
        throw null;
    }

    @Override // j$.util.stream.C0740b3, java.util.function.Consumer
    public final void accept(Object obj) {
        super.accept(obj);
    }

    @Override // j$.util.stream.D0
    public final I0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        clear();
        o(j10);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void end() {
    }

    @Override // j$.util.stream.C0740b3, java.lang.Iterable
    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.S(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.I0
    public final void j(Object[] objArr, int i6) {
        long j10 = i6;
        long count = count() + j10;
        if (count > objArr.length || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f21446c == 0) {
            System.arraycopy(this.f21427e, 0, objArr, i6, this.f21445b);
            return;
        }
        for (int i10 = 0; i10 < this.f21446c; i10++) {
            Object[] objArr2 = this.f[i10];
            System.arraycopy(objArr2, 0, objArr, i6, objArr2.length);
            i6 += this.f[i10].length;
        }
        int i11 = this.f21445b;
        if (i11 > 0) {
            System.arraycopy(this.f21427e, 0, objArr, i6, i11);
        }
    }

    @Override // j$.util.stream.I0
    public final Object[] k(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            j(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int n() {
        return 0;
    }

    @Override // j$.util.stream.C0740b3, java.lang.Iterable
    public final j$.util.S spliterator() {
        return super.spliterator();
    }
}
