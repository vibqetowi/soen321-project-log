package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S0 extends U0 implements F0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(F0 f02, F0 f03) {
        super(f02, f03);
    }

    @Override // j$.util.stream.I0
    /* renamed from: c */
    public final /* synthetic */ void j(Integer[] numArr, int i6) {
        AbstractC0850z0.K(this, numArr, i6);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0850z0.N(this, consumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.Q(this, j10, j11);
    }

    @Override // j$.util.stream.H0
    public final Object newArray(int i6) {
        return new int[i6];
    }

    @Override // j$.util.stream.I0
    public final j$.util.O spliterator() {
        return new C0778j1(this);
    }

    @Override // j$.util.stream.I0
    public final j$.util.S spliterator() {
        return new C0778j1(this);
    }
}
