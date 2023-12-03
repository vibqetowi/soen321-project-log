package j$.util.stream;

import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0748d1 implements I0 {
    @Override // j$.util.stream.I0
    public I0 a(int i6) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return 0L;
    }

    public final void f(Object obj, int i6) {
    }

    public final void g(Object obj) {
    }

    @Override // j$.util.stream.I0
    public /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.S(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.I0
    public final Object[] k(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int n() {
        return 0;
    }
}
