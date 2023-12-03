package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.C0725m;
import java.util.function.DoubleConsumer;
/* loaded from: classes3.dex */
final class J extends N implements InterfaceC0804o2 {

    /* renamed from: c  reason: collision with root package name */
    static final I f21301c;

    /* renamed from: d  reason: collision with root package name */
    static final I f21302d;

    static {
        EnumC0770h3 enumC0770h3 = EnumC0770h3.DOUBLE_VALUE;
        f21301c = new I(true, enumC0770h3, C0725m.a(), new O0(23), new C0736b(11));
        f21302d = new I(false, enumC0770h3, C0725m.a(), new O0(23), new C0736b(11));
    }

    @Override // j$.util.stream.N, j$.util.stream.InterfaceC0818r2
    public final void accept(double d10) {
        m(Double.valueOf(d10));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f21339a) {
            return C0725m.d(((Double) this.f21340b).doubleValue());
        }
        return null;
    }
}
