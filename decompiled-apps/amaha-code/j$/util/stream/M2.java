package j$.util.stream;

import j$.util.Comparator;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;
/* loaded from: classes3.dex */
final class M2 extends AbstractC0769h2 {

    /* renamed from: s  reason: collision with root package name */
    private final boolean f21335s;

    /* renamed from: t  reason: collision with root package name */
    private final Comparator f21336t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M2(AbstractC0741c abstractC0741c) {
        super(abstractC0741c, EnumC0765g3.f21473q | EnumC0765g3.f21471o);
        this.f21335s = true;
        this.f21336t = Comparator.CC.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M2(AbstractC0741c abstractC0741c, java.util.Comparator comparator) {
        super(abstractC0741c, EnumC0765g3.f21473q | EnumC0765g3.f21472p);
        this.f21335s = false;
        this.f21336t = (java.util.Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC0741c
    public final I0 T0(j$.util.S s10, AbstractC0741c abstractC0741c, IntFunction intFunction) {
        if (EnumC0765g3.SORTED.r(abstractC0741c.s0()) && this.f21335s) {
            return abstractC0741c.K0(s10, false, intFunction);
        }
        Object[] k10 = abstractC0741c.K0(s10, true, intFunction).k(intFunction);
        Arrays.sort(k10, this.f21336t);
        return new L0(k10);
    }

    @Override // j$.util.stream.AbstractC0741c
    public final InterfaceC0818r2 W0(int i6, InterfaceC0818r2 interfaceC0818r2) {
        Objects.requireNonNull(interfaceC0818r2);
        if (EnumC0765g3.SORTED.r(i6) && this.f21335s) {
            return interfaceC0818r2;
        }
        boolean r = EnumC0765g3.SIZED.r(i6);
        java.util.Comparator comparator = this.f21336t;
        return r ? new R2(interfaceC0818r2, comparator) : new N2(interfaceC0818r2, comparator);
    }
}
