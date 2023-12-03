package j$.util.stream;

import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0842x0 implements P3 {

    /* renamed from: a  reason: collision with root package name */
    final EnumC0838w0 f21586a;

    /* renamed from: b  reason: collision with root package name */
    final Supplier f21587b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0842x0(EnumC0770h3 enumC0770h3, EnumC0838w0 enumC0838w0, C0801o c0801o) {
        this.f21586a = enumC0838w0;
        this.f21587b = c0801o;
    }

    @Override // j$.util.stream.P3
    public final Object k(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        return (Boolean) new C0846y0(this, abstractC0850z0, s10).invoke();
    }

    @Override // j$.util.stream.P3
    public final int o() {
        return EnumC0765g3.f21476u | EnumC0765g3.r;
    }

    @Override // j$.util.stream.P3
    public final Object y(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        return Boolean.valueOf(((AbstractC0834v0) abstractC0850z0.I0(s10, (AbstractC0834v0) this.f21587b.get())).f21566b);
    }
}
