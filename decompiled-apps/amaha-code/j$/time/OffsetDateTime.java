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
public final class OffsetDateTime implements Temporal, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f20781a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f20782b;

    static {
        LocalDateTime localDateTime = LocalDateTime.f20777c;
        ZoneOffset zoneOffset = ZoneOffset.f20786g;
        localDateTime.getClass();
        T(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f20778d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        T(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f20781a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f20782b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public static OffsetDateTime T(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime U(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.ofEpochSecond(instant.V(), instant.W(), offset), offset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OffsetDateTime W(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f20777c;
        j jVar = j.f20964d;
        return new OffsetDateTime(LocalDateTime.c0(j.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), n.j0(objectInput)), ZoneOffset.h0(objectInput));
    }

    private OffsetDateTime X(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f20781a == localDateTime && this.f20782b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 10, this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = s.f20985a[((j$.time.temporal.a) pVar).ordinal()];
            ZoneOffset zoneOffset = this.f20782b;
            LocalDateTime localDateTime = this.f20781a;
            if (i6 != 1) {
                return i6 != 2 ? localDateTime.G(pVar) : zoneOffset.c0();
            }
            localDateTime.getClass();
            return AbstractC0693b.p(localDateTime, zoneOffset);
        }
        return pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.o.i() || rVar == j$.time.temporal.o.k()) {
            return this.f20782b;
        }
        if (rVar == j$.time.temporal.o.l()) {
            return null;
        }
        j$.time.temporal.r f = j$.time.temporal.o.f();
        LocalDateTime localDateTime = this.f20781a;
        return rVar == f ? localDateTime.h0() : rVar == j$.time.temporal.o.g() ? localDateTime.b() : rVar == j$.time.temporal.o.e() ? j$.time.chrono.u.f20846d : rVar == j$.time.temporal.o.j() ? ChronoUnit.NANOS : rVar.i(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V */
    public final OffsetDateTime d(long j10, j$.time.temporal.s sVar) {
        return sVar instanceof ChronoUnit ? X(this.f20781a.d(j10, sVar), this.f20782b) : (OffsetDateTime) sVar.l(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i6 = s.f20985a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.f20782b;
            LocalDateTime localDateTime = this.f20781a;
            return i6 != 1 ? i6 != 2 ? X(localDateTime.c(j10, pVar), zoneOffset) : X(localDateTime, ZoneOffset.f0(aVar.T(j10))) : U(Instant.Y(j10, localDateTime.V()), zoneOffset);
        }
        return (OffsetDateTime) pVar.J(this, j10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int Y;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f20782b;
        ZoneOffset zoneOffset2 = this.f20782b;
        if (zoneOffset2.equals(zoneOffset)) {
            Y = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f20781a;
            localDateTime.getClass();
            long p10 = AbstractC0693b.p(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.f20781a;
            localDateTime2.getClass();
            int compare = Long.compare(p10, AbstractC0693b.p(localDateTime2, offsetDateTime2.f20782b));
            Y = compare == 0 ? localDateTime.b().Y() - localDateTime2.b().Y() : compare;
        }
        return Y == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : Y;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return (pVar instanceof j$.time.temporal.a) || (pVar != null && pVar.l(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            return this.f20781a.equals(offsetDateTime.f20781a) && this.f20782b.equals(offsetDateTime.f20782b);
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset b02 = ZoneOffset.b0(temporal);
                j jVar = (j) temporal.J(j$.time.temporal.o.f());
                n nVar = (n) temporal.J(j$.time.temporal.o.g());
                temporal = (jVar == null || nVar == null) ? U(Instant.U(temporal), b02) : new OffsetDateTime(LocalDateTime.c0(jVar, nVar), b02);
            } catch (d e10) {
                String name = temporal.getClass().getName();
                throw new d("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + name, e10);
            }
        }
        if (sVar instanceof ChronoUnit) {
            ZoneOffset zoneOffset = temporal.f20782b;
            ZoneOffset zoneOffset2 = this.f20782b;
            OffsetDateTime offsetDateTime = temporal;
            if (!zoneOffset2.equals(zoneOffset)) {
                offsetDateTime = new OffsetDateTime(temporal.f20781a.f0(zoneOffset2.c0() - zoneOffset.c0()), zoneOffset2);
            }
            return this.f20781a.h(offsetDateTime.f20781a, sVar);
        }
        return sVar.between(this, temporal);
    }

    public final int hashCode() {
        return this.f20781a.hashCode() ^ this.f20782b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = s.f20985a[((j$.time.temporal.a) pVar).ordinal()];
            if (i6 != 1) {
                return i6 != 2 ? this.f20781a.l(pVar) : this.f20782b.c0();
            }
            throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.o.a(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal m(j jVar) {
        return X(this.f20781a.m(jVar), this.f20782b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? pVar.n() : this.f20781a.n(pVar) : pVar.m(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f20781a;
        return temporal.c(localDateTime.h0().H(), aVar).c(localDateTime.b().k0(), j$.time.temporal.a.NANO_OF_DAY).c(this.f20782b.c0(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f20781a;
    }

    public final String toString() {
        String localDateTime = this.f20781a.toString();
        String zoneOffset = this.f20782b.toString();
        return localDateTime + zoneOffset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f20781a.l0(objectOutput);
        this.f20782b.i0(objectOutput);
    }
}
