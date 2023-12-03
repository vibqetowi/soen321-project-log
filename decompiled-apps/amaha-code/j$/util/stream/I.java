package j$.util.stream;

import java.util.function.Predicate;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class I implements P3 {

    /* renamed from: a  reason: collision with root package name */
    final int f21292a;

    /* renamed from: b  reason: collision with root package name */
    final Object f21293b;

    /* renamed from: c  reason: collision with root package name */
    final Predicate f21294c;

    /* renamed from: d  reason: collision with root package name */
    final Supplier f21295d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(boolean z10, EnumC0770h3 enumC0770h3, Object obj, O0 o02, C0736b c0736b) {
        this.f21292a = (z10 ? 0 : EnumC0765g3.r) | EnumC0765g3.f21476u;
        this.f21293b = obj;
        this.f21294c = o02;
        this.f21295d = c0736b;
    }

    @Override // j$.util.stream.P3
    public final Object k(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        return new O(this, EnumC0765g3.ORDERED.r(abstractC0850z0.s0()), abstractC0850z0, s10).invoke();
    }

    @Override // j$.util.stream.P3
    public final int o() {
        return this.f21292a;
    }

    @Override // j$.util.stream.P3
    public final Object y(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        Q3 q32 = (Q3) this.f21295d.get();
        abstractC0850z0.I0(s10, q32);
        Object obj = q32.get();
        return obj != null ? obj : this.f21293b;
    }
}
