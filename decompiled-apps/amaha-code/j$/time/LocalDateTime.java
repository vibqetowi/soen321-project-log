package j$.time;

import j$.time.chrono.AbstractC0693b;
import j$.time.chrono.InterfaceC0694c;
import j$.time.chrono.InterfaceC0697f;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.m, InterfaceC0697f, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final LocalDateTime f20777c = c0(j.f20964d, n.f20972e);

    /* renamed from: d  reason: collision with root package name */
    public static final LocalDateTime f20778d = c0(j.f20965e, n.f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a  reason: collision with root package name */
    private final j f20779a;

    /* renamed from: b  reason: collision with root package name */
    private final n f20780b;

    private LocalDateTime(j jVar, n nVar) {
        this.f20779a = jVar;
        this.f20780b = nVar;
    }

    private int T(LocalDateTime localDateTime) {
        int T = this.f20779a.T(localDateTime.f20779a);
        return T == 0 ? this.f20780b.compareTo(localDateTime.f20780b) : T;
    }

    public static LocalDateTime U(j$.time.temporal.l lVar) {
        if (lVar instanceof LocalDateTime) {
            return (LocalDateTime) lVar;
        }
        if (lVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) lVar).s();
        }
        if (lVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) lVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(j.V(lVar), n.V(lVar));
        } catch (d e10) {
            String name = lVar.getClass().getName();
            throw new d("Unable to obtain LocalDateTime from TemporalAccessor: " + lVar + " of type " + name, e10);
        }
    }

    public static LocalDateTime a0(int i6) {
        return new LocalDateTime(j.h0(i6, 12, 31), n.a0(0));
    }

    public static LocalDateTime b0(int i6, int i10, int i11, int i12, int i13, int i14) {
        return new LocalDateTime(j.h0(i6, i10, i11), n.b0(i12, i13, i14, 0));
    }

    public static LocalDateTime c0(j jVar, n nVar) {
        Objects.requireNonNull(jVar, "date");
        Objects.requireNonNull(nVar, "time");
        return new LocalDateTime(jVar, nVar);
    }

    private LocalDateTime g0(j jVar, long j10, long j11, long j12, long j13) {
        n nVar = this.f20780b;
        if ((j10 | j11 | j12 | j13) == 0) {
            return k0(jVar, nVar);
        }
        long j14 = j10 / 24;
        long j15 = j14 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
        long j16 = 1;
        long j17 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long k02 = nVar.k0();
        long j18 = (j17 * j16) + k02;
        long n10 = AbstractC0689a.n(j18, 86400000000000L) + (j15 * j16);
        long m10 = AbstractC0689a.m(j18, 86400000000000L);
        if (m10 != k02) {
            nVar = n.c0(m10);
        }
        return k0(jVar.m0(n10), nVar);
    }

    private LocalDateTime k0(j jVar, n nVar) {
        return (this.f20779a == jVar && this.f20780b == nVar) ? this : new LocalDateTime(jVar, nVar);
    }

    public static LocalDateTime now() {
        AbstractC0691c c10 = AbstractC0691c.c();
        Objects.requireNonNull(c10, "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        return ofEpochSecond(ofEpochMilli.V(), ofEpochMilli.W(), c10.a().getRules().getOffset(ofEpochMilli));
    }

    public static LocalDateTime ofEpochSecond(long j10, int i6, ZoneOffset zoneOffset) {
        long c0;
        long j11;
        Objects.requireNonNull(zoneOffset, "offset");
        long j12 = i6;
        j$.time.temporal.a.NANO_OF_SECOND.U(j12);
        return new LocalDateTime(j.j0(AbstractC0689a.n(j10 + zoneOffset.c0(), 86400)), n.c0((((int) AbstractC0689a.m(c0, j11)) * 1000000000) + j12));
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.f(charSequence, new k());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 5, this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).isTimeBased() ? this.f20780b.G(pVar) : this.f20779a.G(pVar) : pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.o.f() ? this.f20779a : AbstractC0693b.m(this, rVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: M */
    public final int compareTo(InterfaceC0697f interfaceC0697f) {
        return interfaceC0697f instanceof LocalDateTime ? T((LocalDateTime) interfaceC0697f) : AbstractC0693b.e(this, interfaceC0697f);
    }

    public final int V() {
        return this.f20780b.Y();
    }

    public final int W() {
        return this.f20780b.Z();
    }

    public final int X() {
        return this.f20779a.b0();
    }

    public final boolean Y(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return T(localDateTime) > 0;
        }
        int i6 = (this.f20779a.H() > localDateTime.f20779a.H() ? 1 : (this.f20779a.H() == localDateTime.f20779a.H() ? 0 : -1));
        if (i6 <= 0) {
            return i6 == 0 && this.f20780b.k0() > localDateTime.f20780b.k0();
        }
        return true;
    }

    public final boolean Z(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return T(localDateTime) < 0;
        }
        int i6 = (this.f20779a.H() > localDateTime.f20779a.H() ? 1 : (this.f20779a.H() == localDateTime.f20779a.H() ? 0 : -1));
        if (i6 >= 0) {
            return i6 == 0 && this.f20780b.k0() < localDateTime.f20780b.k0();
        }
        return true;
    }

    @Override // j$.time.chrono.InterfaceC0697f
    public final j$.time.chrono.n a() {
        return ((j) f()).a();
    }

    @Override // j$.time.chrono.InterfaceC0697f
    /* renamed from: atZone */
    public ZonedDateTime D(ZoneId zoneId) {
        return ZonedDateTime.W(this, zoneId, null);
    }

    @Override // j$.time.chrono.InterfaceC0697f
    public final n b() {
        return this.f20780b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: d0 */
    public final LocalDateTime d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            switch (l.f20969a[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return g0(this.f20779a, 0L, 0L, 0L, j10);
                case 2:
                    LocalDateTime e0 = e0(j10 / 86400000000L);
                    return e0.g0(e0.f20779a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
                case 3:
                    LocalDateTime e02 = e0(j10 / 86400000);
                    return e02.g0(e02.f20779a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
                case 4:
                    return f0(j10);
                case 5:
                    return g0(this.f20779a, 0L, j10, 0L, 0L);
                case 6:
                    return g0(this.f20779a, j10, 0L, 0L, 0L);
                case 7:
                    LocalDateTime e03 = e0(j10 / 256);
                    return e03.g0(e03.f20779a, (j10 % 256) * 12, 0L, 0L, 0L);
                default:
                    return k0(this.f20779a.d(j10, sVar), this.f20780b);
            }
        }
        return (LocalDateTime) sVar.l(this, j10);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.l(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.isDateBased() || aVar.isTimeBased();
    }

    public final LocalDateTime e0(long j10) {
        return k0(this.f20779a.m0(j10), this.f20780b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            return this.f20779a.equals(localDateTime.f20779a) && this.f20780b.equals(localDateTime.f20780b);
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0697f
    public final InterfaceC0694c f() {
        return this.f20779a;
    }

    public final LocalDateTime f0(long j10) {
        return g0(this.f20779a, 0L, 0L, j10, 0L);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        long j10;
        long j11;
        long o10;
        long j12;
        LocalDateTime U = U(temporal);
        if (sVar instanceof ChronoUnit) {
            boolean isTimeBased = sVar.isTimeBased();
            n nVar = this.f20780b;
            j jVar = this.f20779a;
            if (!isTimeBased) {
                j jVar2 = U.f20779a;
                jVar2.getClass();
                boolean z10 = !(jVar instanceof j) ? jVar2.H() <= jVar.H() : jVar2.T(jVar) <= 0;
                n nVar2 = U.f20780b;
                if (z10) {
                    if (nVar2.compareTo(nVar) < 0) {
                        jVar2 = jVar2.m0(-1L);
                        return jVar.h(jVar2, sVar);
                    }
                }
                if (jVar2.c0(jVar)) {
                    if (nVar2.compareTo(nVar) > 0) {
                        jVar2 = jVar2.m0(1L);
                    }
                }
                return jVar.h(jVar2, sVar);
            }
            j jVar3 = U.f20779a;
            jVar.getClass();
            long H = jVar3.H() - jVar.H();
            n nVar3 = U.f20780b;
            int i6 = (H > 0L ? 1 : (H == 0L ? 0 : -1));
            if (i6 == 0) {
                return nVar.h(nVar3, sVar);
            }
            long k02 = nVar3.k0() - nVar.k0();
            if (i6 > 0) {
                j10 = H - 1;
                j11 = k02 + 86400000000000L;
            } else {
                j10 = H + 1;
                j11 = k02 - 86400000000000L;
            }
            switch (l.f20969a[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    j10 = AbstractC0689a.o(j10, 86400000000000L);
                    break;
                case 2:
                    o10 = AbstractC0689a.o(j10, 86400000000L);
                    j12 = 1000;
                    j10 = o10;
                    j11 /= j12;
                    break;
                case 3:
                    o10 = AbstractC0689a.o(j10, 86400000L);
                    j12 = 1000000;
                    j10 = o10;
                    j11 /= j12;
                    break;
                case 4:
                    o10 = AbstractC0689a.o(j10, 86400);
                    j12 = 1000000000;
                    j10 = o10;
                    j11 /= j12;
                    break;
                case 5:
                    o10 = AbstractC0689a.o(j10, 1440);
                    j12 = 60000000000L;
                    j10 = o10;
                    j11 /= j12;
                    break;
                case 6:
                    o10 = AbstractC0689a.o(j10, 24);
                    j12 = 3600000000000L;
                    j10 = o10;
                    j11 /= j12;
                    break;
                case 7:
                    o10 = AbstractC0689a.o(j10, 2);
                    j12 = 43200000000000L;
                    j10 = o10;
                    j11 /= j12;
                    break;
            }
            return AbstractC0689a.j(j10, j11);
        }
        return sVar.between(this, U);
    }

    public final j h0() {
        return this.f20779a;
    }

    public final int hashCode() {
        return this.f20779a.hashCode() ^ this.f20780b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: i0 */
    public final LocalDateTime c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            boolean isTimeBased = ((j$.time.temporal.a) pVar).isTimeBased();
            n nVar = this.f20780b;
            j jVar = this.f20779a;
            return isTimeBased ? k0(jVar, nVar.c(j10, pVar)) : k0(jVar.c(j10, pVar), nVar);
        }
        return (LocalDateTime) pVar.J(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: j0 */
    public final LocalDateTime m(j jVar) {
        return k0(jVar, this.f20780b);
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).isTimeBased() ? this.f20780b.l(pVar) : this.f20779a.l(pVar) : j$.time.temporal.o.a(this, pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l0(DataOutput dataOutput) {
        this.f20779a.v0(dataOutput);
        this.f20780b.o0(dataOutput);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).isTimeBased()) {
                n nVar = this.f20780b;
                nVar.getClass();
                return j$.time.temporal.o.d(nVar, pVar);
            }
            return this.f20779a.n(pVar);
        }
        return pVar.m(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        return AbstractC0693b.b(this, temporal);
    }

    public final String toString() {
        String jVar = this.f20779a.toString();
        String nVar = this.f20780b.toString();
        return jVar + "T" + nVar;
    }
}
