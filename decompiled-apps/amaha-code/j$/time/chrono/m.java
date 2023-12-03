package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m implements InterfaceC0702k, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a  reason: collision with root package name */
    private final transient C0699h f20825a;

    /* renamed from: b  reason: collision with root package name */
    private final transient ZoneOffset f20826b;

    /* renamed from: c  reason: collision with root package name */
    private final transient ZoneId f20827c;

    private m(ZoneId zoneId, ZoneOffset zoneOffset, C0699h c0699h) {
        this.f20825a = (C0699h) Objects.requireNonNull(c0699h, "dateTime");
        this.f20826b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.f20827c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    static m T(n nVar, Temporal temporal) {
        m mVar = (m) temporal;
        AbstractC0692a abstractC0692a = (AbstractC0692a) nVar;
        if (abstractC0692a.equals(mVar.a())) {
            return mVar;
        }
        String k10 = abstractC0692a.k();
        String k11 = mVar.a().k();
        throw new ClassCastException("Chronology mismatch, required: " + k10 + ", actual: " + k11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (r2.contains(r7) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC0702k V(ZoneId zoneId, ZoneOffset zoneOffset, C0699h c0699h) {
        Objects.requireNonNull(c0699h, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new m(zoneId, (ZoneOffset) zoneId, c0699h);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime U = LocalDateTime.U(c0699h);
        List f = rules.f(U);
        if (f.size() != 1) {
            if (f.size() == 0) {
                j$.time.zone.b e10 = rules.e(U);
                c0699h = c0699h.X(e10.n().m());
                zoneOffset = e10.r();
            } else if (zoneOffset != null) {
            }
            Objects.requireNonNull(zoneOffset, "offset");
            return new m(zoneId, zoneOffset, c0699h);
        }
        zoneOffset = (ZoneOffset) f.get(0);
        Objects.requireNonNull(zoneOffset, "offset");
        return new m(zoneId, zoneOffset, c0699h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m W(n nVar, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new m(zoneId, offset, (C0699h) nVar.K(LocalDateTime.ofEpochSecond(instant.V(), instant.W(), offset)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 3, this);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final InterfaceC0702k B(ZoneId zoneId) {
        return V(zoneId, this.f20826b, this.f20825a);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final ZoneId F() {
        return this.f20827c;
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = AbstractC0701j.f20823a[((j$.time.temporal.a) pVar).ordinal()];
            return i6 != 1 ? i6 != 2 ? ((C0699h) s()).G(pVar) : i().c0() : S();
        }
        return pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object J(j$.time.temporal.r rVar) {
        return AbstractC0693b.n(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final /* synthetic */ long S() {
        return AbstractC0693b.q(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U */
    public final InterfaceC0702k g(long j10, j$.time.temporal.s sVar) {
        return T(a(), j$.time.temporal.o.b(this, j10, (ChronoUnit) sVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X */
    public final InterfaceC0702k d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            return T(a(), this.f20825a.d(j10, sVar).r(this));
        }
        return T(a(), sVar.l(this, j10));
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final n a() {
        return f().a();
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final j$.time.n b() {
        return ((C0699h) s()).b();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i6 = AbstractC0703l.f20824a[aVar.ordinal()];
            if (i6 != 1) {
                ZoneId zoneId = this.f20827c;
                C0699h c0699h = this.f20825a;
                if (i6 != 2) {
                    return V(zoneId, this.f20826b, c0699h.c(j10, pVar));
                }
                return W(a(), c0699h.Z(ZoneOffset.f0(aVar.T(j10))), zoneId);
            }
            return d(j10 - AbstractC0693b.q(this), ChronoUnit.SECONDS);
        }
        return T(a(), pVar.J(this, j10));
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return (pVar instanceof j$.time.temporal.a) || (pVar != null && pVar.l(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0702k) && AbstractC0693b.f(this, (InterfaceC0702k) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final InterfaceC0694c f() {
        return ((C0699h) s()).f();
    }

    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        InterfaceC0702k p10 = a().p(temporal);
        if (sVar instanceof ChronoUnit) {
            return this.f20825a.h(p10.v(this.f20826b).s(), sVar);
        }
        Objects.requireNonNull(sVar, "unit");
        return sVar.between(this, p10);
    }

    public final int hashCode() {
        return (this.f20825a.hashCode() ^ this.f20826b.hashCode()) ^ Integer.rotateLeft(this.f20827c.hashCode(), 3);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final ZoneOffset i() {
        return this.f20826b;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return AbstractC0693b.g(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal m(j$.time.j jVar) {
        return T(a(), jVar.r(this));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) ? pVar.n() : ((C0699h) s()).n(pVar) : pVar.m(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: r */
    public final /* synthetic */ int compareTo(InterfaceC0702k interfaceC0702k) {
        return AbstractC0693b.f(this, interfaceC0702k);
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final InterfaceC0697f s() {
        return this.f20825a;
    }

    public final String toString() {
        String c0699h = this.f20825a.toString();
        ZoneOffset zoneOffset = this.f20826b;
        String str = c0699h + zoneOffset.toString();
        ZoneId zoneId = this.f20827c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    @Override // j$.time.chrono.InterfaceC0702k
    public final InterfaceC0702k v(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "zone");
        if (this.f20827c.equals(zoneOffset)) {
            return this;
        }
        return W(a(), this.f20825a.Z(this.f20826b), zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f20825a);
        objectOutput.writeObject(this.f20826b);
        objectOutput.writeObject(this.f20827c);
    }
}
