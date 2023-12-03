package j$.util.stream;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r extends AbstractC0769h2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r(AbstractC0741c abstractC0741c, int i6) {
        super(abstractC0741c, i6);
    }

    static M0 b1(AbstractC0741c abstractC0741c, j$.util.S s10) {
        O0 o02 = new O0(15);
        O0 o03 = new O0(16);
        O0 o04 = new O0(17);
        Objects.requireNonNull(o02);
        Objects.requireNonNull(o03);
        Objects.requireNonNull(o04);
        return new M0((Collection) new E1(EnumC0770h3.REFERENCE, o04, o03, o02, 3).k(abstractC0741c, s10));
    }

    @Override // j$.util.stream.AbstractC0741c
    final I0 T0(j$.util.S s10, AbstractC0741c abstractC0741c, IntFunction intFunction) {
        if (EnumC0765g3.DISTINCT.r(abstractC0741c.s0())) {
            return abstractC0741c.K0(s10, false, intFunction);
        }
        if (EnumC0765g3.ORDERED.r(abstractC0741c.s0())) {
            return b1(abstractC0741c, s10);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C0801o c0801o = new C0801o(0, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c0801o);
        new T(c0801o, false).k(abstractC0741c, s10);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new M0(keySet);
    }

    @Override // j$.util.stream.AbstractC0741c
    final j$.util.S U0(AbstractC0741c abstractC0741c, j$.util.S s10) {
        return EnumC0765g3.DISTINCT.r(abstractC0741c.s0()) ? abstractC0741c.a1(s10) : EnumC0765g3.ORDERED.r(abstractC0741c.s0()) ? b1(abstractC0741c, s10).spliterator() : new C0810p3(abstractC0741c.a1(s10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        Objects.requireNonNull(interfaceC0818r2);
        return EnumC0765g3.DISTINCT.r(i6) ? interfaceC0818r2 : EnumC0765g3.SORTED.r(i6) ? new C0806p(this, interfaceC0818r2) : new C0811q(interfaceC0818r2);
    }
}
