package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T0 extends U0 implements G0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public T0(G0 g02, G0 g03) {
        super(g02, g03);
    }

    @Override // j$.util.stream.I0
    /* renamed from: c */
    public final /* synthetic */ void j(Long[] lArr, int i6) {
        AbstractC0850z0.L(this, lArr, i6);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0850z0.O(this, consumer);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 i(long j10, long j11, IntFunction intFunction) {
        return AbstractC0850z0.R(this, j10, j11);
    }

    @Override // j$.util.stream.H0
    public final Object newArray(int i6) {
        return new long[i6];
    }

    @Override // j$.util.stream.I0
    public final j$.util.O spliterator() {
        return new C0783k1(this);
    }

    @Override // j$.util.stream.I0
    public final j$.util.S spliterator() {
        return new C0783k1(this);
    }
}
