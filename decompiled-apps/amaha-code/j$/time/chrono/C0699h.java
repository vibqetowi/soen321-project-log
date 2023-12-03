package j$.time.chrono;

import j$.time.AbstractC0689a;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.h  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0699h implements InterfaceC0697f, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a  reason: collision with root package name */
    private final transient InterfaceC0694c f20816a;

    /* renamed from: b  reason: collision with root package name */
    private final transient j$.time.n f20817b;

    private C0699h(InterfaceC0694c interfaceC0694c, j$.time.n nVar) {
        Objects.requireNonNull(interfaceC0694c, "date");
        Objects.requireNonNull(nVar, "time");
        this.f20816a = interfaceC0694c;
        this.f20817b = nVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0699h T(n nVar, Temporal temporal) {
        C0699h c0699h = (C0699h) temporal;
        AbstractC0692a abstractC0692a = (AbstractC0692a) nVar;
        if (abstractC0692a.equals(c0699h.a())) {
            return c0699h;
        }
        String k10 = abstractC0692a.k();
        String k11 = c0699h.a().k();
        throw new ClassCastException("Chronology mismatch, required: " + k10 + ", actual: " + k11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0699h V(InterfaceC0694c interfaceC0694c, j$.time.n nVar) {
        return new C0699h(interfaceC0694c, nVar);
    }

    private C0699h Y(InterfaceC0694c interfaceC0694c, long j10, long j11, long j12, long j13) {
        j$.time.n nVar = this.f20817b;
        if ((j10 | j11 | j12 | j13) == 0) {
            return b0(interfaceC0694c, nVar);
        }
        long j14 = j11 / 1440;
        long j15 = j10 / 24;
        long j16 = (j11 % 1440) * 60000000000L;
        long j17 = ((j10 % 24) * 3600000000000L) + j16 + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long k02 = nVar.k0();
        long j18 = j17 + k02;
        long n10 = AbstractC0689a.n(j18, 86400000000000L) + j15 + j14 + (j12 / 86400) + (j13 / 86400000000000L);
        long m10 = AbstractC0689a.m(j18, 86400000000000L);
        if (m10 != k02) {
            nVar = j$.time.n.c0(m10);
        }
        return b0(interfaceC0694c.d(n10, (j$.time.temporal.s) ChronoUnit.DAYS), nVar);
    }

    private C0699h b0(Temporal temporal, j$.time.n nVar) {
        InterfaceC0694c interfaceC0694c = this.f20816a;
        return (interfaceC0694c == temporal && this.f20817b == nVar) ? this : new C0699h(AbstractC0696e.T(interfaceC0694c.a(), temporal), nVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 2, this);
    }

    @Override // j$.time.chrono.InterfaceC0697f
    public final InterfaceC0702k D(ZoneId zoneId) {
        return m.V(zoneId, null, this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).isTimeBased() ? this.f20817b.G(pVar) : this.f20816a.G(pVar) : pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object J(j$.time.temporal.r rVar) {
        return AbstractC0693b.m(this, rVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: M */
    public final /* synthetic */ int compareTo(InterfaceC0697f interfaceC0697f) {
        return AbstractC0693b.e(this, interfaceC0697f);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U */
    public final InterfaceC0697f g(long j10, j$.time.temporal.s sVar) {
        return T(a(), j$.time.temporal.o.b(this, j10, (ChronoUnit) sVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W */
    public final C0699h d(long j10, j$.time.temporal.s sVar) {
        boolean z10 = sVar instanceof ChronoUnit;
        InterfaceC0694c interfaceC0694c = this.f20816a;
        if (z10) {
            int i6 = AbstractC0698g.f20815a[((ChronoUnit) sVar).ordinal()];
            j$.time.n nVar = this.f20817b;
            switch (i6) {
                case 1:
                    return Y(this.f20816a, 0L, 0L, 0L, j10);
                case 2:
                    C0699h b02 = b0(interfaceC0694c.d(j10 / 86400000000L, (j$.time.temporal.s) ChronoUnit.DAYS), nVar);
                    return b02.Y(b02.f20816a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
                case 3:
                    C0699h b03 = b0(interfaceC0694c.d(j10 / 86400000, (j$.time.temporal.s) ChronoUnit.DAYS), nVar);
                    return b03.Y(b03.f20816a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
                case 4:
                    return X(j10);
                case 5:
                    return Y(this.f20816a, 0L, j10, 0L, 0L);
                case 6:
                    return Y(this.f20816a, j10, 0L, 0L, 0L);
                case 7:
                    C0699h b04 = b0(interfaceC0694c.d(j10 / 256, (j$.time.temporal.s) ChronoUnit.DAYS), nVar);
                    return b04.Y(b04.f20816a, (j10 % 256) * 12, 0L, 0L, 0L);
                default:
                    return b0(interfaceC0694c.d(j10, sVar), nVar);
            }
        }
        return T(interfaceC0694c.a(), sVar.l(this, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0699h X(long j10) {
        return Y(this.f20816a, 0L, 0L, j10, 0L);
    }

    public final Instant Z(ZoneOffset zoneOffset) {
        return Instant.Y(AbstractC0693b.p(this, zoneOffset), this.f20817b.Y());
    }

    @Override // j$.time.chrono.InterfaceC0697f
    public final n a() {
        return f().a();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0 */
    public final C0699h c(long j10, j$.time.temporal.p pVar) {
        boolean z10 = pVar instanceof j$.time.temporal.a;
        InterfaceC0694c interfaceC0694c = this.f20816a;
        if (z10) {
            boolean isTimeBased = ((j$.time.temporal.a) pVar).isTimeBased();
            j$.time.n nVar = this.f20817b;
            return isTimeBased ? b0(interfaceC0694c, nVar.c(j10, pVar)) : b0(interfaceC0694c.c(j10, pVar), nVar);
        }
        return T(interfaceC0694c.a(), pVar.J(this, j10));
    }

    @Override // j$.time.chrono.InterfaceC0697f
    public final j$.time.n b() {
        return this.f20817b;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.l(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.isDateBased() || aVar.isTimeBased();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0697f) && AbstractC0693b.e(this, (InterfaceC0697f) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0697f
    public final InterfaceC0694c f() {
        return this.f20816a;
    }

    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        long j10;
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC0697f K = a().K(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            Objects.requireNonNull(sVar, "unit");
            return sVar.between(this, K);
        }
        boolean isTimeBased = sVar.isTimeBased();
        InterfaceC0694c interfaceC0694c = this.f20816a;
        j$.time.n nVar = this.f20817b;
        if (!isTimeBased) {
            InterfaceC0694c f = K.f();
            if (K.b().compareTo(nVar) < 0) {
                f = f.g(1L, ChronoUnit.DAYS);
            }
            return interfaceC0694c.h(f, sVar);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long G = K.G(aVar) - interfaceC0694c.G(aVar);
        switch (AbstractC0698g.f20815a[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                j10 = 86400000000000L;
                G = AbstractC0689a.o(G, j10);
                break;
            case 2:
                j10 = 86400000000L;
                G = AbstractC0689a.o(G, j10);
                break;
            case 3:
                j10 = 86400000;
                G = AbstractC0689a.o(G, j10);
                break;
            case 4:
                G = AbstractC0689a.o(G, 86400);
                break;
            case 5:
                G = AbstractC0689a.o(G, 1440);
                break;
            case 6:
                G = AbstractC0689a.o(G, 24);
                break;
            case 7:
                G = AbstractC0689a.o(G, 2);
                break;
        }
        return AbstractC0689a.j(G, nVar.h(K.b(), sVar));
    }

    public final int hashCode() {
        return this.f20816a.hashCode() ^ this.f20817b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).isTimeBased() ? this.f20817b.l(pVar) : this.f20816a.l(pVar) : n(pVar).a(G(pVar), pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal m(j$.time.j jVar) {
        return b0(jVar, this.f20817b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).isTimeBased()) {
                j$.time.n nVar = this.f20817b;
                nVar.getClass();
                return j$.time.temporal.o.d(nVar, pVar);
            }
            return this.f20816a.n(pVar);
        }
        return pVar.m(this);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal r(Temporal temporal) {
        return AbstractC0693b.b(this, temporal);
    }

    public final String toString() {
        String interfaceC0694c = this.f20816a.toString();
        String nVar = this.f20817b.toString();
        return interfaceC0694c + "T" + nVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f20816a);
        objectOutput.writeObject(this.f20817b);
    }
}
