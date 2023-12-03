package j$.util.stream;

import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class U0 extends K0 implements H0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public U0(H0 h02, H0 h03) {
        super(h02, h03);
    }

    @Override // j$.util.stream.H0
    public final Object b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            f(newArray, 0);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.H0
    public final void f(Object obj, int i6) {
        I0 i02 = this.f21309a;
        ((H0) i02).f(obj, i6);
        ((H0) this.f21310b).f(obj, i6 + ((int) ((H0) i02).count()));
    }

    @Override // j$.util.stream.H0
    public final void g(Object obj) {
        ((H0) this.f21309a).g(obj);
        ((H0) this.f21310b).g(obj);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ Object[] k(IntFunction intFunction) {
        return AbstractC0850z0.I(this, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f21309a, this.f21310b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
