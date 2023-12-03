package j$.util.stream;

import j$.util.Optional;
/* loaded from: classes3.dex */
final class M extends N {

    /* renamed from: c  reason: collision with root package name */
    static final I f21329c;

    /* renamed from: d  reason: collision with root package name */
    static final I f21330d;

    static {
        EnumC0770h3 enumC0770h3 = EnumC0770h3.REFERENCE;
        f21329c = new I(true, enumC0770h3, Optional.a(), new O0(26), new C0736b(14));
        f21330d = new I(false, enumC0770h3, Optional.a(), new O0(26), new C0736b(14));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f21339a) {
            return Optional.d(this.f21340b);
        }
        return null;
    }
}
