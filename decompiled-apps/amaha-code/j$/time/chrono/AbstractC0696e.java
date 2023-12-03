package j$.time.chrono;

import j$.time.AbstractC0689a;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0696e implements InterfaceC0694c, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC0694c T(n nVar, Temporal temporal) {
        InterfaceC0694c interfaceC0694c = (InterfaceC0694c) temporal;
        AbstractC0692a abstractC0692a = (AbstractC0692a) nVar;
        if (abstractC0692a.equals(interfaceC0694c.a())) {
            return interfaceC0694c;
        }
        String k10 = abstractC0692a.k();
        String k11 = interfaceC0694c.a().k();
        throw new ClassCastException("Chronology mismatch, expected: " + k10 + ", actual: " + k11);
    }

    private long U(InterfaceC0694c interfaceC0694c) {
        if (a().u(j$.time.temporal.a.MONTH_OF_YEAR).d() == 12) {
            j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
            j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
            return (((interfaceC0694c.G(aVar) * 32) + interfaceC0694c.l(aVar2)) - ((G(aVar) * 32) + j$.time.temporal.o.a(this, aVar2))) / 32;
        }
        throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public InterfaceC0694c A(j$.time.v vVar) {
        return T(a(), vVar.a(this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C */
    public InterfaceC0694c m(j$.time.temporal.m mVar) {
        return T(a(), mVar.r(this));
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public long H() {
        return G(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public InterfaceC0697f I(j$.time.n nVar) {
        return C0699h.V(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object J(j$.time.temporal.r rVar) {
        return AbstractC0693b.l(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public o L() {
        return a().x(l(j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public int P() {
        return t() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: Q */
    public final /* synthetic */ int compareTo(InterfaceC0694c interfaceC0694c) {
        return AbstractC0693b.d(this, interfaceC0694c);
    }

    abstract InterfaceC0694c V(long j10);

    abstract InterfaceC0694c W(long j10);

    abstract InterfaceC0694c X(long j10);

    @Override // j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public InterfaceC0694c c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.e.a("Unsupported field: ", pVar));
        }
        return T(a(), pVar.J(this, j10));
    }

    @Override // j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public InterfaceC0694c d(long j10, j$.time.temporal.s sVar) {
        boolean z10 = sVar instanceof ChronoUnit;
        if (!z10) {
            if (z10) {
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
            return T(a(), sVar.l(this, j10));
        }
        switch (AbstractC0695d.f20814a[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                return V(j10);
            case 2:
                return V(AbstractC0689a.o(j10, 7));
            case 3:
                return W(j10);
            case 4:
                return X(j10);
            case 5:
                return X(AbstractC0689a.o(j10, 10));
            case 6:
                return X(AbstractC0689a.o(j10, 100));
            case 7:
                return X(AbstractC0689a.o(j10, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(AbstractC0689a.j(G(aVar), j10), (j$.time.temporal.p) aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    @Override // j$.time.chrono.InterfaceC0694c, j$.time.temporal.l
    public /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return AbstractC0693b.j(this, pVar);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0694c) && AbstractC0693b.d(this, (InterfaceC0694c) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public InterfaceC0694c g(long j10, ChronoUnit chronoUnit) {
        return T(a(), j$.time.temporal.o.b(this, j10, chronoUnit));
    }

    @Override // j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public long h(Temporal temporal, j$.time.temporal.s sVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC0694c E = a().E(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            Objects.requireNonNull(sVar, "unit");
            return sVar.between(this, E);
        }
        switch (AbstractC0695d.f20814a[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                return E.H() - H();
            case 2:
                return (E.H() - H()) / 7;
            case 3:
                return U(E);
            case 4:
                return U(E) / 12;
            case 5:
                return U(E) / 120;
            case 6:
                return U(E) / 1200;
            case 7:
                return U(E) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return E.G(aVar) - G(aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public int hashCode() {
        long H = H();
        return ((AbstractC0692a) a()).hashCode() ^ ((int) (H ^ (H >>> 32)));
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return j$.time.temporal.o.a(this, pVar);
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return j$.time.temporal.o.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal r(Temporal temporal) {
        return AbstractC0693b.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public boolean t() {
        return a().R(G(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public String toString() {
        long G = G(j$.time.temporal.a.YEAR_OF_ERA);
        long G2 = G(j$.time.temporal.a.MONTH_OF_YEAR);
        long G3 = G(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(((AbstractC0692a) a()).k());
        sb2.append(" ");
        sb2.append(L());
        sb2.append(" ");
        sb2.append(G);
        sb2.append(G2 < 10 ? "-0" : "-");
        sb2.append(G2);
        sb2.append(G3 >= 10 ? "-" : "-0");
        sb2.append(G3);
        return sb2.toString();
    }
}
