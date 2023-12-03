package j$.time.chrono;

import j$.time.AbstractC0689a;
import j$.time.AbstractC0691c;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes3.dex */
public final class x extends AbstractC0692a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final x f20849d = new x();
    private static final long serialVersionUID = 459996390165777884L;

    private x() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c E(j$.time.temporal.l lVar) {
        return lVar instanceof z ? (z) lVar : new z(j$.time.j.V(lVar));
    }

    @Override // j$.time.chrono.AbstractC0692a, j$.time.chrono.n
    public final InterfaceC0697f K(j$.time.temporal.l lVar) {
        return super.K(lVar);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c N(int i6, int i10, int i11) {
        return new z(j$.time.j.h0(i6, i10, i11));
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0702k O(Instant instant, ZoneId zoneId) {
        return m.W(this, instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final boolean R(long j10) {
        return u.f20846d.R(j10);
    }

    @Override // j$.time.chrono.AbstractC0692a
    final InterfaceC0694c V(HashMap hashMap, j$.time.format.F f) {
        z m10;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l2 = (Long) hashMap.get(aVar);
        A q10 = l2 != null ? A.q(u(aVar).a(l2.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l10 = (Long) hashMap.get(aVar2);
        int a10 = l10 != null ? u(aVar2).a(l10.longValue(), aVar2) : 0;
        if (q10 == null && l10 != null && !hashMap.containsKey(j$.time.temporal.a.YEAR) && f != j$.time.format.F.STRICT) {
            q10 = A.x()[A.x().length - 1];
        }
        if (l10 != null && q10 != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (hashMap.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (hashMap.containsKey(aVar4)) {
                    hashMap.remove(aVar);
                    hashMap.remove(aVar2);
                    if (f == j$.time.format.F.LENIENT) {
                        return new z(j$.time.j.h0((q10.o().b0() + a10) - 1, 1, 1)).d(AbstractC0689a.p(((Long) hashMap.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).d(AbstractC0689a.p(((Long) hashMap.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int a11 = u(aVar3).a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
                    int a12 = u(aVar4).a(((Long) hashMap.remove(aVar4)).longValue(), aVar4);
                    if (f != j$.time.format.F.SMART) {
                        j$.time.j jVar = z.f20851d;
                        Objects.requireNonNull(q10, "era");
                        j$.time.j h02 = j$.time.j.h0((q10.o().b0() + a10) - 1, a11, a12);
                        if (h02.c0(q10.o()) || q10 != A.j(h02)) {
                            throw new j$.time.d("year, month, and day not valid for Era");
                        }
                        return new z(q10, a10, h02);
                    } else if (a10 < 1) {
                        throw new j$.time.d("Invalid YearOfEra: " + a10);
                    } else {
                        int b02 = (q10.o().b0() + a10) - 1;
                        try {
                            m10 = new z(j$.time.j.h0(b02, a11, a12));
                        } catch (j$.time.d unused) {
                            m10 = new z(j$.time.j.h0(b02, a11, 1)).m(new j$.time.k());
                        }
                        if (m10.Y() == q10 || j$.time.temporal.o.a(m10, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || a10 <= 1) {
                            return m10;
                        }
                        throw new j$.time.d("Invalid YearOfEra for Era: " + q10 + " " + a10);
                    }
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (hashMap.containsKey(aVar5)) {
                hashMap.remove(aVar);
                hashMap.remove(aVar2);
                if (f == j$.time.format.F.LENIENT) {
                    return new z(j$.time.j.k0((q10.o().b0() + a10) - 1, 1)).d(AbstractC0689a.p(((Long) hashMap.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int a13 = u(aVar5).a(((Long) hashMap.remove(aVar5)).longValue(), aVar5);
                j$.time.j jVar2 = z.f20851d;
                Objects.requireNonNull(q10, "era");
                int b03 = q10.o().b0();
                j$.time.j k02 = a10 == 1 ? j$.time.j.k0(b03, (q10.o().Y() + a13) - 1) : j$.time.j.k0((b03 + a10) - 1, a13);
                if (k02.c0(q10.o()) || q10 != A.j(k02)) {
                    throw new j$.time.d("Invalid parameters");
                }
                return new z(q10, a10, k02);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c j(long j10) {
        return new z(j$.time.j.j0(j10));
    }

    @Override // j$.time.chrono.n
    public final String k() {
        return "Japanese";
    }

    @Override // j$.time.chrono.AbstractC0692a
    public final InterfaceC0694c n() {
        j$.time.j g02 = j$.time.j.g0(AbstractC0691c.c());
        return g02 instanceof z ? (z) g02 : new z(j$.time.j.V(g02));
    }

    @Override // j$.time.chrono.n
    public final String o() {
        return "japanese";
    }

    @Override // j$.time.chrono.AbstractC0692a, j$.time.chrono.n
    public final InterfaceC0702k p(j$.time.temporal.l lVar) {
        return super.p(lVar);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c q(int i6, int i10) {
        return new z(j$.time.j.k0(i6, i10));
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.u u(j$.time.temporal.a aVar) {
        switch (w.f20848a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.t("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.u.l(A.w(), 999999999 - A.k().o().b0());
            case 6:
                return j$.time.temporal.u.l(A.u(), j$.time.temporal.a.DAY_OF_YEAR.n().d());
            case 7:
                return j$.time.temporal.u.j(z.f20851d.b0(), 999999999L);
            case 8:
                return j$.time.temporal.u.j(A.f20794d.getValue(), A.k().getValue());
            default:
                return aVar.n();
        }
    }

    @Override // j$.time.chrono.n
    public final List w() {
        return AbstractC0689a.l(A.x());
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }

    @Override // j$.time.chrono.n
    public final o x(int i6) {
        return A.q(i6);
    }

    @Override // j$.time.chrono.AbstractC0692a, j$.time.chrono.n
    public final InterfaceC0694c y(HashMap hashMap, j$.time.format.F f) {
        return (z) super.y(hashMap, f);
    }

    @Override // j$.time.chrono.n
    public final int z(o oVar, int i6) {
        if (oVar instanceof A) {
            A a10 = (A) oVar;
            int b02 = (a10.o().b0() + i6) - 1;
            if (i6 == 1) {
                return b02;
            }
            if (b02 < -999999999 || b02 > 999999999 || b02 < a10.o().b0() || oVar != A.j(j$.time.j.h0(b02, 1, 1))) {
                throw new j$.time.d("Invalid yearOfEra value");
            }
            return b02;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }
}
