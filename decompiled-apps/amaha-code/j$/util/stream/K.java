package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.C0726n;
import java.util.function.IntConsumer;
/* loaded from: classes3.dex */
final class K extends N implements InterfaceC0809p2 {

    /* renamed from: c  reason: collision with root package name */
    static final I f21307c;

    /* renamed from: d  reason: collision with root package name */
    static final I f21308d;

    static {
        EnumC0770h3 enumC0770h3 = EnumC0770h3.INT_VALUE;
        f21307c = new I(true, enumC0770h3, C0726n.a(), new O0(24), new C0736b(12));
        f21308d = new I(false, enumC0770h3, C0726n.a(), new O0(24), new C0736b(12));
    }

    @Override // j$.util.stream.N, j$.util.stream.InterfaceC0818r2
    public final void accept(int i6) {
        m(Integer.valueOf(i6));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f21339a) {
            return C0726n.d(((Integer) this.f21340b).intValue());
        }
        return null;
    }
}
