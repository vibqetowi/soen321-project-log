package j$.time;

import j$.time.chrono.AbstractC0693b;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class u implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a  reason: collision with root package name */
    private final n f21034a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f21035b;

    static {
        n nVar = n.f20972e;
        ZoneOffset zoneOffset = ZoneOffset.f20786g;
        nVar.getClass();
        T(nVar, zoneOffset);
        n nVar2 = n.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        nVar2.getClass();
        T(nVar2, zoneOffset2);
    }

    private u(n nVar, ZoneOffset zoneOffset) {
        this.f21034a = (n) Objects.requireNonNull(nVar, "time");
        this.f21035b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public static u T(n nVar, ZoneOffset zoneOffset) {
        return new u(nVar, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u V(ObjectInput objectInput) {
        return new u(n.j0(objectInput), ZoneOffset.h0(objectInput));
    }

    private long W() {
        return this.f21034a.k0() - (this.f21035b.c0() * 1000000000);
    }

    private u X(n nVar, ZoneOffset zoneOffset) {
        return (this.f21034a == nVar && this.f21035b.equals(zoneOffset)) ? this : new u(nVar, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 9, this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.OFFSET_SECONDS ? this.f21035b.c0() : this.f21034a.G(pVar) : pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.o.i() || rVar == j$.time.temporal.o.k()) {
            return this.f21035b;
        }
        if (((rVar == j$.time.temporal.o.l()) || (rVar == j$.time.temporal.o.e())) || rVar == j$.time.temporal.o.f()) {
            return null;
        }
        return rVar == j$.time.temporal.o.g() ? this.f21034a : rVar == j$.time.temporal.o.j() ? ChronoUnit.NANOS : rVar.i(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U */
    public final u d(long j10, j$.time.temporal.s sVar) {
        return sVar instanceof ChronoUnit ? X(this.f21034a.d(j10, sVar), this.f21035b) : (u) sVar.l(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            n nVar = this.f21034a;
            return pVar == aVar ? X(nVar, ZoneOffset.f0(((j$.time.temporal.a) pVar).T(j10))) : X(nVar.c(j10, pVar), this.f21035b);
        }
        return (u) pVar.J(this, j10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compare;
        u uVar = (u) obj;
        return (this.f21035b.equals(uVar.f21035b) || (compare = Long.compare(W(), uVar.W())) == 0) ? this.f21034a.compareTo(uVar.f21034a) : compare;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar.isTimeBased() || pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.l(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f21034a.equals(uVar.f21034a) && this.f21035b.equals(uVar.f21035b);
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        u uVar;
        long j10;
        if (temporal instanceof u) {
            uVar = (u) temporal;
        } else {
            try {
                uVar = new u(n.V(temporal), ZoneOffset.b0(temporal));
            } catch (d e10) {
                String name = temporal.getClass().getName();
                throw new d("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + name, e10);
            }
        }
        if (sVar instanceof ChronoUnit) {
            long W = uVar.W() - W();
            switch (t.f20986a[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return W;
                case 2:
                    j10 = 1000;
                    break;
                case 3:
                    j10 = 1000000;
                    break;
                case 4:
                    j10 = 1000000000;
                    break;
                case 5:
                    j10 = 60000000000L;
                    break;
                case 6:
                    j10 = 3600000000000L;
                    break;
                case 7:
                    j10 = 43200000000000L;
                    break;
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
            return W / j10;
        }
        return sVar.between(this, uVar);
    }

    public final int hashCode() {
        return this.f21034a.hashCode() ^ this.f21035b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        return j$.time.temporal.o.a(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal m(j jVar) {
        if (jVar instanceof n) {
            return X((n) jVar, this.f21035b);
        }
        if (jVar instanceof ZoneOffset) {
            return X(this.f21034a, (ZoneOffset) jVar);
        }
        boolean z10 = jVar instanceof u;
        j$.time.temporal.l lVar = jVar;
        if (!z10) {
            lVar = AbstractC0693b.a(jVar, this);
        }
        return (u) lVar;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return pVar.n();
            }
            n nVar = this.f21034a;
            nVar.getClass();
            return j$.time.temporal.o.d(nVar, pVar);
        }
        return pVar.m(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        return temporal.c(this.f21034a.k0(), j$.time.temporal.a.NANO_OF_DAY).c(this.f21035b.c0(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final String toString() {
        String nVar = this.f21034a.toString();
        String zoneOffset = this.f21035b.toString();
        return nVar + zoneOffset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f21034a.o0(objectOutput);
        this.f21035b.i0(objectOutput);
    }
}
