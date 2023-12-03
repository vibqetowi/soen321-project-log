package j$.time.chrono;

import j$.time.AbstractC0689a;
import j$.time.AbstractC0691c;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes3.dex */
public final class u extends AbstractC0692a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final u f20846d = new u();
    private static final long serialVersionUID = -1440403870442975015L;

    private u() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c E(j$.time.temporal.l lVar) {
        return j$.time.j.V(lVar);
    }

    @Override // j$.time.chrono.AbstractC0692a, j$.time.chrono.n
    public final InterfaceC0697f K(j$.time.temporal.l lVar) {
        return LocalDateTime.U(lVar);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c N(int i6, int i10, int i11) {
        return j$.time.j.h0(i6, i10, i11);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0702k O(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.V(instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final boolean R(long j10) {
        return (3 & j10) == 0 && (j10 % 100 != 0 || j10 % 400 == 0);
    }

    @Override // j$.time.chrono.AbstractC0692a
    final void T(HashMap hashMap, j$.time.format.F f) {
        long j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l2 = (Long) hashMap.remove(aVar);
        if (l2 != null) {
            if (f != j$.time.format.F.LENIENT) {
                aVar.U(l2.longValue());
            }
            AbstractC0692a.l(hashMap, j$.time.temporal.a.MONTH_OF_YEAR, ((int) AbstractC0689a.m(l2.longValue(), j10)) + 1);
            AbstractC0692a.l(hashMap, j$.time.temporal.a.YEAR, AbstractC0689a.n(l2.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC0692a
    final InterfaceC0694c U(HashMap hashMap, j$.time.format.F f) {
        int i6;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int T = aVar.T(((Long) hashMap.remove(aVar)).longValue());
        boolean z10 = true;
        if (f == j$.time.format.F.LENIENT) {
            return j$.time.j.h0(T, 1, 1).n0(AbstractC0689a.p(((Long) hashMap.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).m0(AbstractC0689a.p(((Long) hashMap.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int T2 = aVar2.T(((Long) hashMap.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int T3 = aVar3.T(((Long) hashMap.remove(aVar3)).longValue());
        if (f == j$.time.format.F.SMART) {
            if (T2 == 4 || T2 == 6 || T2 == 9 || T2 == 11) {
                i6 = 30;
            } else if (T2 == 2) {
                j$.time.p pVar = j$.time.p.FEBRUARY;
                long j10 = T;
                int i10 = j$.time.y.f21044b;
                if ((3 & j10) != 0 || (j10 % 100 == 0 && j10 % 400 != 0)) {
                    z10 = false;
                }
                i6 = pVar.U(z10);
            }
            T3 = Math.min(T3, i6);
        }
        return j$.time.j.h0(T, T2, T3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r11 > 0) goto L14;
     */
    @Override // j$.time.chrono.AbstractC0692a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final InterfaceC0694c V(HashMap hashMap, j$.time.format.F f) {
        j$.time.temporal.a aVar;
        long p10;
        long longValue;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) hashMap.remove(aVar2);
        if (l2 == null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
            if (hashMap.containsKey(aVar3)) {
                aVar3.U(((Long) hashMap.get(aVar3)).longValue());
                return null;
            }
            return null;
        }
        if (f != j$.time.format.F.LENIENT) {
            aVar2.U(l2.longValue());
        }
        Long l10 = (Long) hashMap.remove(j$.time.temporal.a.ERA);
        if (l10 != null) {
            if (l10.longValue() == 1) {
                aVar = j$.time.temporal.a.YEAR;
                p10 = l2.longValue();
            } else if (l10.longValue() != 0) {
                throw new j$.time.d("Invalid value for era: " + l10);
            } else {
                aVar = j$.time.temporal.a.YEAR;
                p10 = AbstractC0689a.p(1L, l2.longValue());
            }
            AbstractC0692a.l(hashMap, aVar, p10);
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        Long l11 = (Long) hashMap.get(aVar4);
        if (f != j$.time.format.F.STRICT) {
            if (l11 == null || l11.longValue() > 0) {
                longValue = l2.longValue();
                AbstractC0692a.l(hashMap, aVar4, longValue);
                return null;
            }
            longValue = l2.longValue();
            longValue = AbstractC0689a.p(1L, longValue);
            AbstractC0692a.l(hashMap, aVar4, longValue);
            return null;
        } else if (l11 == null) {
            hashMap.put(aVar2, l2);
            return null;
        } else {
            int i6 = (l11.longValue() > 0L ? 1 : (l11.longValue() == 0L ? 0 : -1));
            longValue = l2.longValue();
        }
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c j(long j10) {
        return j$.time.j.j0(j10);
    }

    @Override // j$.time.chrono.n
    public final String k() {
        return "ISO";
    }

    @Override // j$.time.chrono.AbstractC0692a
    public final InterfaceC0694c n() {
        AbstractC0691c c10 = AbstractC0691c.c();
        Objects.requireNonNull(c10, "clock");
        return j$.time.j.V(j$.time.j.g0(c10));
    }

    @Override // j$.time.chrono.n
    public final String o() {
        return "iso8601";
    }

    @Override // j$.time.chrono.AbstractC0692a, j$.time.chrono.n
    public final InterfaceC0702k p(j$.time.temporal.l lVar) {
        return ZonedDateTime.U(lVar);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c q(int i6, int i10) {
        return j$.time.j.k0(i6, i10);
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.u u(j$.time.temporal.a aVar) {
        return aVar.n();
    }

    @Override // j$.time.chrono.n
    public final List w() {
        return AbstractC0689a.l(v.values());
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }

    @Override // j$.time.chrono.n
    public final o x(int i6) {
        if (i6 != 0) {
            if (i6 == 1) {
                return v.CE;
            }
            throw new j$.time.d("Invalid era: " + i6);
        }
        return v.BCE;
    }

    @Override // j$.time.chrono.AbstractC0692a, j$.time.chrono.n
    public final InterfaceC0694c y(HashMap hashMap, j$.time.format.F f) {
        return (j$.time.j) super.y(hashMap, f);
    }

    @Override // j$.time.chrono.n
    public final int z(o oVar, int i6) {
        if (oVar instanceof v) {
            return oVar == v.CE ? i6 : 1 - i6;
        }
        throw new ClassCastException("Era must be IsoEra");
    }
}
