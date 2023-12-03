package j$.time;

import j$.time.chrono.AbstractC0693b;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class Instant implements Temporal, j$.time.temporal.m, Comparable<Instant>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Instant f20774c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a  reason: collision with root package name */
    private final long f20775a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20776b;

    static {
        Y(-31557014167219200L, 0L);
        Y(31556889864403199L, 999999999L);
    }

    private Instant(long j10, int i6) {
        this.f20775a = j10;
        this.f20776b = i6;
    }

    private static Instant T(long j10, int i6) {
        if ((i6 | j10) == 0) {
            return f20774c;
        }
        if (j10 < -31557014167219200L || j10 > 31556889864403199L) {
            throw new d("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j10, i6);
    }

    public static Instant U(j$.time.temporal.l lVar) {
        if (lVar instanceof Instant) {
            return (Instant) lVar;
        }
        Objects.requireNonNull(lVar, "temporal");
        try {
            return Y(lVar.G(j$.time.temporal.a.INSTANT_SECONDS), lVar.l(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (d e10) {
            String name = lVar.getClass().getName();
            throw new d("Unable to obtain Instant from TemporalAccessor: " + lVar + " of type " + name, e10);
        }
    }

    public static Instant X(long j10) {
        return T(j10, 0);
    }

    public static Instant Y(long j10, long j11) {
        return T(AbstractC0689a.j(j10, AbstractC0689a.n(j11, 1000000000L)), (int) AbstractC0689a.m(j11, 1000000000L));
    }

    private Instant Z(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return Y(AbstractC0689a.j(AbstractC0689a.j(this.f20775a, j10), j11 / 1000000000), this.f20776b + (j11 % 1000000000));
    }

    private long b0(Instant instant) {
        long p10 = AbstractC0689a.p(instant.f20775a, this.f20775a);
        long j10 = instant.f20776b - this.f20776b;
        int i6 = (p10 > 0L ? 1 : (p10 == 0L ? 0 : -1));
        return (i6 <= 0 || j10 >= 0) ? (i6 >= 0 || j10 <= 0) ? p10 : p10 + 1 : p10 - 1;
    }

    public static Instant now() {
        C0690b.f20792b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j10) {
        long j11 = 1000;
        return T(AbstractC0689a.n(j10, j11), ((int) AbstractC0689a.m(j10, j11)) * 1000000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 2, this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        int i6;
        if (pVar instanceof j$.time.temporal.a) {
            int i10 = h.f20960a[((j$.time.temporal.a) pVar).ordinal()];
            int i11 = this.f20776b;
            if (i10 != 1) {
                if (i10 == 2) {
                    i6 = i11 / 1000;
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        return this.f20775a;
                    }
                    throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
                } else {
                    i6 = i11 / 1000000;
                }
                return i6;
            }
            return i11;
        }
        return pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.o.j()) {
            return ChronoUnit.NANOS;
        }
        if (rVar == j$.time.temporal.o.e() || rVar == j$.time.temporal.o.l() || rVar == j$.time.temporal.o.k() || rVar == j$.time.temporal.o.i() || rVar == j$.time.temporal.o.f() || rVar == j$.time.temporal.o.g()) {
            return null;
        }
        return rVar.i(this);
    }

    public final long V() {
        return this.f20775a;
    }

    public final int W() {
        return this.f20776b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: a0 */
    public final Instant d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            switch (h.f20961b[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return Z(0L, j10);
                case 2:
                    return Z(j10 / 1000000, (j10 % 1000000) * 1000);
                case 3:
                    return Z(j10 / 1000, (j10 % 1000) * 1000000);
                case 4:
                    return Z(j10, 0L);
                case 5:
                    return Z(AbstractC0689a.o(j10, 60), 0L);
                case 6:
                    return Z(AbstractC0689a.o(j10, 3600), 0L);
                case 7:
                    return Z(AbstractC0689a.o(j10, 43200), 0L);
                case 8:
                    return Z(AbstractC0689a.o(j10, 86400), 0L);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (Instant) sVar.l(this, j10);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.U(this, zoneOffset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r7 != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r7 != r4) goto L22;
     */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Temporal c(long j10, j$.time.temporal.p pVar) {
        int i6;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (Instant) pVar.J(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.U(j10);
        int i10 = h.f20960a[aVar.ordinal()];
        long j11 = this.f20775a;
        int i11 = this.f20776b;
        if (i10 == 1) {
            if (j10 != i11) {
                i6 = (int) j10;
                return T(j11, i6);
            }
            return this;
        } else if (i10 != 2) {
            if (i10 == 3) {
                i6 = ((int) j10) * 1000000;
            } else if (i10 != 4) {
                throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
            } else {
                if (j10 != j11) {
                    return T(j10, i11);
                }
            }
            return this;
        } else {
            i6 = ((int) j10) * 1000;
        }
    }

    public final long c0() {
        long o10;
        int i6;
        int i10 = this.f20776b;
        long j10 = this.f20775a;
        if (j10 >= 0 || i10 <= 0) {
            o10 = AbstractC0689a.o(j10, 1000);
            i6 = i10 / 1000000;
        } else {
            o10 = AbstractC0689a.o(j10 + 1, 1000);
            i6 = (i10 / 1000000) - 1000;
        }
        return AbstractC0689a.j(o10, i6);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.f20775a, instant2.f20775a);
        return compare != 0 ? compare : this.f20776b - instant2.f20776b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d0(DataOutput dataOutput) {
        dataOutput.writeLong(this.f20775a);
        dataOutput.writeInt(this.f20776b);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND : pVar != null && pVar.l(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.f20775a == instant.f20775a && this.f20776b == instant.f20776b;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        Instant U = U(temporal);
        if (sVar instanceof ChronoUnit) {
            int i6 = h.f20961b[((ChronoUnit) sVar).ordinal()];
            int i10 = this.f20776b;
            long j10 = this.f20775a;
            switch (i6) {
                case 1:
                    return AbstractC0689a.j(AbstractC0689a.o(AbstractC0689a.p(U.f20775a, j10), 1000000000L), U.f20776b - i10);
                case 2:
                    return AbstractC0689a.j(AbstractC0689a.o(AbstractC0689a.p(U.f20775a, j10), 1000000000L), U.f20776b - i10) / 1000;
                case 3:
                    return AbstractC0689a.p(U.c0(), c0());
                case 4:
                    return b0(U);
                case 5:
                    return b0(U) / 60;
                case 6:
                    return b0(U) / 3600;
                case 7:
                    return b0(U) / 43200;
                case 8:
                    return b0(U) / 86400;
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return sVar.between(this, U);
    }

    public final int hashCode() {
        long j10 = this.f20775a;
        return (this.f20776b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = h.f20960a[((j$.time.temporal.a) pVar).ordinal()];
            int i10 = this.f20776b;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            j$.time.temporal.a.INSTANT_SECONDS.T(this.f20775a);
                        }
                        throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
                    }
                    return i10 / 1000000;
                }
                return i10 / 1000;
            }
            return i10;
        }
        return j$.time.temporal.o.d(this, pVar).a(pVar.G(this), pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal m(j jVar) {
        return (Instant) AbstractC0693b.a(jVar, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return j$.time.temporal.o.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        return temporal.c(this.f20775a, j$.time.temporal.a.INSTANT_SECONDS).c(this.f20776b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public final String toString() {
        return DateTimeFormatter.f20867h.a(this);
    }
}
