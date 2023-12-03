package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.C0727o;
import java.util.function.LongConsumer;
/* loaded from: classes3.dex */
final class L extends N implements InterfaceC0814q2 {

    /* renamed from: c  reason: collision with root package name */
    static final I f21316c;

    /* renamed from: d  reason: collision with root package name */
    static final I f21317d;

    static {
        EnumC0770h3 enumC0770h3 = EnumC0770h3.LONG_VALUE;
        f21316c = new I(true, enumC0770h3, C0727o.a(), new O0(25), new C0736b(13));
        f21317d = new I(false, enumC0770h3, C0727o.a(), new O0(25), new C0736b(13));
    }

    @Override // j$.util.stream.N, j$.util.stream.InterfaceC0818r2, j$.util.stream.InterfaceC0814q2, java.util.function.LongConsumer
    public final void accept(long j10) {
        m(Long.valueOf(j10));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f21339a) {
            return C0727o.d(((Long) this.f21340b).longValue());
        }
        return null;
    }
}
