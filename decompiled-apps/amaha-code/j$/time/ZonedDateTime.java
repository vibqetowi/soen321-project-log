package j$.time;

import j$.time.chrono.AbstractC0693b;
import j$.time.chrono.InterfaceC0694c;
import j$.time.chrono.InterfaceC0702k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes3.dex */
public final class ZonedDateTime implements Temporal, InterfaceC0702k, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f20789a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f20790b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneId f20791c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f20789a = localDateTime;
        this.f20790b = zoneOffset;
        this.f20791c = zoneId;
    }

    private static ZonedDateTime T(long j10, int i6, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.Y(j10, i6));
        return new ZonedDateTime(LocalDateTime.ofEpochSecond(j10, i6, offset), zoneId, offset);
    }

    public static ZonedDateTime U(j$.time.temporal.l lVar) {
        if (lVar instanceof ZonedDateTime) {
            return (ZonedDateTime) lVar;
        }
        try {
            ZoneId T = ZoneId.T(lVar);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            return lVar.e(aVar) ? T(lVar.G(aVar), lVar.l(j$.time.temporal.a.NANO_OF_SECOND), T) : W(LocalDateTime.c0(j.V(lVar), n.V(lVar)), T, null);
        } catch (d e10) {
            String name = lVar.getClass().getName();
            throw new d("Unable to obtain ZonedDateTime from TemporalAccessor: " + lVar + " of type " + name, e10);
        }
    }

    public static ZonedDateTime V(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return T(instant.V(), instant.W(), zoneId);
    }

    public static ZonedDateTime W(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Object requireNonNull;
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List f = rules.f(localDateTime);
        if (f.size() != 1) {
            if (f.size() == 0) {
                j$.time.zone.b e10 = rules.e(localDateTime);
                localDateTime = localDateTime.f0(e10.n().m());
                zoneOffset = e10.r();
            } else if (zoneOffset == null || !f.contains(zoneOffset)) {
                requireNonNull = Objects.requireNonNull((ZoneOffset) f.get(0), "offset");
            }
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        requireNonNull = f.get(0);
        zoneOffset = (ZoneOffset) requireNonNull;
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZonedDateTime Y(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f20777c;
        j jVar = j.f20964d;
        LocalDateTime c0 = LocalDateTime.c0(j.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), n.j0(objectInput));
        ZoneOffset h02 = ZoneOffset.h0(objectInput);
        ZoneId zoneId = (ZoneId) w.a(objectInput);
        Objects.requireNonNull(c0, "localDateTime");
        Objects.requireNonNull(h02, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || h02.equals(zoneId)) {
            return new ZonedDateTime(c0, zoneId, h02);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private ZonedDateTime Z(LocalDateTime localDateTime) {
        return W(localDateTime, this.f20791c, this.f20790b);
    }

    private ZonedDateTime a0(ZoneOffset zoneOffset) {
        if (!zoneOffset.equals(this.f20790b)) {
            ZoneId zoneId = this.f20791c;
            ZoneRules rules = zoneId.getRules();
            LocalDateTime localDateTime = this.f20789a;
            if (rules.f(localDateTime).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
            }
        }
        return this;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 6, this);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final InterfaceC0702k B(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f20791c.equals(zoneId) ? this : W(this.f20789a, zoneId, this.f20790b);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final ZoneId F() {
        return this.f20791c;
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = C.f20773a[((j$.time.temporal.a) pVar).ordinal()];
            return i6 != 1 ? i6 != 2 ? this.f20789a.G(pVar) : this.f20790b.c0() : AbstractC0693b.q(this);
        }
        return pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.o.f() ? this.f20789a.h0() : AbstractC0693b.n(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final /* synthetic */ long S() {
        return AbstractC0693b.q(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X */
    public final ZonedDateTime d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            boolean isDateBased = sVar.isDateBased();
            LocalDateTime d10 = this.f20789a.d(j10, sVar);
            if (isDateBased) {
                return Z(d10);
            }
            Objects.requireNonNull(d10, "localDateTime");
            ZoneOffset zoneOffset = this.f20790b;
            Objects.requireNonNull(zoneOffset, "offset");
            ZoneId zoneId = this.f20791c;
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.getRules().f(d10).contains(zoneOffset)) {
                return new ZonedDateTime(d10, zoneId, zoneOffset);
            }
            d10.getClass();
            return T(AbstractC0693b.p(d10, zoneOffset), d10.V(), zoneId);
        }
        return (ZonedDateTime) sVar.l(this, j10);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final j$.time.chrono.n a() {
        return ((j) f()).a();
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final n b() {
        return this.f20789a.b();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: b0 */
    public final ZonedDateTime m(j jVar) {
        return Z(LocalDateTime.c0(jVar, this.f20789a.b()));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i6 = C.f20773a[aVar.ordinal()];
            LocalDateTime localDateTime = this.f20789a;
            return i6 != 1 ? i6 != 2 ? Z(localDateTime.c(j10, pVar)) : a0(ZoneOffset.f0(aVar.T(j10))) : T(j10, localDateTime.V(), this.f20791c);
        }
        return (ZonedDateTime) pVar.J(this, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c0(DataOutput dataOutput) {
        this.f20789a.l0(dataOutput);
        this.f20790b.i0(dataOutput);
        this.f20791c.Z(dataOutput);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return (pVar instanceof j$.time.temporal.a) || (pVar != null && pVar.l(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            return this.f20789a.equals(zonedDateTime.f20789a) && this.f20790b.equals(zonedDateTime.f20790b) && this.f20791c.equals(zonedDateTime.f20791c);
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final InterfaceC0694c f() {
        return this.f20789a.h0();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        ZonedDateTime U = U(temporal);
        if (sVar instanceof ChronoUnit) {
            ZonedDateTime v10 = U.v(this.f20791c);
            boolean isDateBased = sVar.isDateBased();
            LocalDateTime localDateTime = this.f20789a;
            return isDateBased ? localDateTime.h(v10.f20789a, sVar) : OffsetDateTime.T(localDateTime, this.f20790b).h(OffsetDateTime.T(v10.f20789a, v10.f20790b), sVar);
        }
        return sVar.between(this, U);
    }

    public final int hashCode() {
        return (this.f20789a.hashCode() ^ this.f20790b.hashCode()) ^ Integer.rotateLeft(this.f20791c.hashCode(), 3);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final ZoneOffset i() {
        return this.f20790b;
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = C.f20773a[((j$.time.temporal.a) pVar).ordinal()];
            if (i6 != 1) {
                return i6 != 2 ? this.f20789a.l(pVar) : this.f20790b.c0();
            }
            throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC0693b.g(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? pVar.n() : this.f20789a.n(pVar) : pVar.m(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: r */
    public final /* synthetic */ int compareTo(InterfaceC0702k interfaceC0702k) {
        return AbstractC0693b.f(this, interfaceC0702k);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    /* renamed from: toLocalDateTime */
    public LocalDateTime s() {
        return this.f20789a;
    }

    public final String toString() {
        String localDateTime = this.f20789a.toString();
        ZoneOffset zoneOffset = this.f20790b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.f20791c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    @Override // j$.time.chrono.InterfaceC0702k
    /* renamed from: withZoneSameInstant */
    public ZonedDateTime v(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f20791c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.f20789a;
        localDateTime.getClass();
        return T(AbstractC0693b.p(localDateTime, this.f20790b), localDateTime.V(), zoneId);
    }
}
