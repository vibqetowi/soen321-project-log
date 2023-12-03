package j$.util.stream;

import j$.util.Objects;
import java.util.Arrays;
import java.util.function.IntFunction;
/* loaded from: classes3.dex */
final class K2 extends AbstractC0752e0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public K2(AbstractC0741c abstractC0741c) {
        super(abstractC0741c, EnumC0765g3.f21473q | EnumC0765g3.f21471o);
    }

    @Override // j$.util.stream.AbstractC0741c
    public final I0 T0(j$.util.S s10, AbstractC0741c abstractC0741c, IntFunction intFunction) {
        if (EnumC0765g3.SORTED.r(abstractC0741c.s0())) {
            return abstractC0741c.K0(s10, false, intFunction);
        }
        int[] iArr = (int[]) ((F0) abstractC0741c.K0(s10, true, intFunction)).b();
        Arrays.sort(iArr);
        return new C0758f1(iArr);
    }

    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        Objects.requireNonNull(interfaceC0818r2);
        return EnumC0765g3.SORTED.r(i6) ? interfaceC0818r2 : EnumC0765g3.SIZED.r(i6) ? new P2(interfaceC0818r2) : new H2(interfaceC0818r2);
    }
}
