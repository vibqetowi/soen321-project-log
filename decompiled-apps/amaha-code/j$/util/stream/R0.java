package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class R0 extends U0 implements E0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public R0(E0 e0, E0 e02) {
        super(e0, e02);
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

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.P(this, j10, j11);
    }

    @Override // j$.util.stream.H0
    public final Object newArray(int i6) {
        return new double[i6];
    }

    @Override // j$.util.stream.I0
    public final j$.util.O spliterator() {
        return new C0773i1(this);
    }

    @Override // j$.util.stream.I0
    public final j$.util.S spliterator() {
        return new C0773i1(this);
    }
}
