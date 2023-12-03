package j$.time.chrono;

import j$.time.AbstractC0689a;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceLoader;
/* renamed from: j$.time.chrono.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0692a implements n {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f20811a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f20812b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f20813c = 0;

    static {
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n G(AbstractC0692a abstractC0692a, String str) {
        String o10;
        n nVar = (n) f20811a.putIfAbsent(str, abstractC0692a);
        if (nVar == null && (o10 = abstractC0692a.o()) != null) {
            f20812b.putIfAbsent(o10, abstractC0692a);
        }
        return nVar;
    }

    static InterfaceC0694c J(InterfaceC0694c interfaceC0694c, long j10, long j11, long j12) {
        long j13;
        InterfaceC0694c d10 = interfaceC0694c.d(j10, (j$.time.temporal.s) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        InterfaceC0694c d11 = d10.d(j11, (j$.time.temporal.s) chronoUnit);
        if (j12 <= 7) {
            if (j12 < 1) {
                d11 = d11.d(AbstractC0689a.p(j12, 7L) / 7, (j$.time.temporal.s) chronoUnit);
                j13 = j12 + 6;
            }
            return d11.C(new j$.time.temporal.n(j$.time.f.T((int) j12).getValue(), 0));
        }
        j13 = j12 - 1;
        d11 = d11.d(j13 / 7, (j$.time.temporal.s) chronoUnit);
        j12 = (j13 % 7) + 1;
        return d11.C(new j$.time.temporal.n(j$.time.f.T((int) j12).getValue(), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(HashMap hashMap, j$.time.temporal.a aVar, long j10) {
        Long l2 = (Long) hashMap.get(aVar);
        if (l2 == null || l2.longValue() == j10) {
            hashMap.put(aVar, Long.valueOf(j10));
            return;
        }
        throw new j$.time.d("Conflict found: " + aVar + " " + l2 + " differs from " + aVar + " " + j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n r(String str) {
        boolean z10;
        Objects.requireNonNull(str, "id");
        do {
            ConcurrentHashMap concurrentHashMap = f20811a;
            n nVar = (n) concurrentHashMap.get(str);
            if (nVar == null) {
                nVar = (n) f20812b.get(str);
            }
            if (nVar != null) {
                return nVar;
            }
            if (concurrentHashMap.get("ISO") == null) {
                q qVar = q.f20829o;
                G(qVar, qVar.k());
                x xVar = x.f20849d;
                G(xVar, xVar.k());
                C c10 = C.f20800d;
                G(c10, c10.k());
                I i6 = I.f20807d;
                G(i6, i6.k());
                Iterator it = ServiceLoader.load(AbstractC0692a.class, null).iterator();
                while (it.hasNext()) {
                    AbstractC0692a abstractC0692a = (AbstractC0692a) it.next();
                    if (!abstractC0692a.k().equals("ISO")) {
                        G(abstractC0692a, abstractC0692a.k());
                    }
                }
                u uVar = u.f20846d;
                G(uVar, uVar.k());
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
        } while (z10);
        Iterator it2 = ServiceLoader.load(n.class).iterator();
        while (it2.hasNext()) {
            n nVar2 = (n) it2.next();
            if (str.equals(nVar2.k()) || str.equals(nVar2.o())) {
                return nVar2;
            }
            while (it2.hasNext()) {
            }
        }
        throw new j$.time.d("Unknown chronology: " + str);
    }

    @Override // j$.time.chrono.n
    public InterfaceC0697f K(j$.time.temporal.l lVar) {
        try {
            return E(lVar).I(j$.time.n.V(lVar));
        } catch (j$.time.d e10) {
            Class<?> cls = lVar.getClass();
            throw new j$.time.d("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + cls, e10);
        }
    }

    void T(HashMap hashMap, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l2 = (Long) hashMap.remove(aVar);
        if (l2 != null) {
            if (f != j$.time.format.F.LENIENT) {
                aVar.U(l2.longValue());
            }
            InterfaceC0694c c10 = n().c(1L, (j$.time.temporal.p) j$.time.temporal.a.DAY_OF_MONTH).c(l2.longValue(), (j$.time.temporal.p) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            l(hashMap, aVar2, c10.l(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            l(hashMap, aVar3, c10.l(aVar3));
        }
    }

    InterfaceC0694c U(HashMap hashMap, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a10 = u(aVar).a(((Long) hashMap.remove(aVar)).longValue(), aVar);
        if (f == j$.time.format.F.LENIENT) {
            long p10 = AbstractC0689a.p(((Long) hashMap.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return N(a10, 1, 1).d(p10, (j$.time.temporal.s) ChronoUnit.MONTHS).d(AbstractC0689a.p(((Long) hashMap.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.s) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a11 = u(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a12 = u(aVar3).a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
        if (f == j$.time.format.F.SMART) {
            try {
                return N(a10, a11, a12);
            } catch (j$.time.d unused) {
                return N(a10, a11, 1).C(new j$.time.k());
            }
        }
        return N(a10, a11, a12);
    }

    InterfaceC0694c V(HashMap hashMap, j$.time.format.F f) {
        j$.time.temporal.a aVar;
        o oVar;
        long j10;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) hashMap.remove(aVar2);
        if (l2 == null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
            if (hashMap.containsKey(aVar3)) {
                u(aVar3).b(((Long) hashMap.get(aVar3)).longValue(), aVar3);
                return null;
            }
            return null;
        }
        Long l10 = (Long) hashMap.remove(j$.time.temporal.a.ERA);
        int a10 = f != j$.time.format.F.LENIENT ? u(aVar2).a(l2.longValue(), aVar2) : AbstractC0689a.i(l2.longValue());
        if (l10 != null) {
            l(hashMap, j$.time.temporal.a.YEAR, z(x(u(aVar).a(l10.longValue(), aVar)), a10));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        if (hashMap.containsKey(aVar4)) {
            oVar = q(u(aVar4).a(((Long) hashMap.get(aVar4)).longValue(), aVar4), 1).L();
        } else if (f == j$.time.format.F.STRICT) {
            hashMap.put(aVar2, l2);
            return null;
        } else {
            List w10 = w();
            if (w10.isEmpty()) {
                j10 = a10;
                l(hashMap, aVar4, j10);
                return null;
            }
            oVar = (o) w10.get(w10.size() - 1);
        }
        j10 = z(oVar, a10);
        l(hashMap, aVar4, j10);
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0692a) && compareTo((AbstractC0692a) obj) == 0;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ k().hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: m */
    public final int compareTo(n nVar) {
        return k().compareTo(nVar.k());
    }

    public abstract /* synthetic */ InterfaceC0694c n();

    @Override // j$.time.chrono.n
    public InterfaceC0702k p(j$.time.temporal.l lVar) {
        try {
            ZoneId T = ZoneId.T(lVar);
            try {
                return O(Instant.U(lVar), T);
            } catch (j$.time.d unused) {
                return m.V(T, null, C0699h.T(this, K(lVar)));
            }
        } catch (j$.time.d e10) {
            Class<?> cls = lVar.getClass();
            throw new j$.time.d("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + cls, e10);
        }
    }

    public final String toString() {
        return k();
    }

    @Override // j$.time.chrono.n
    public InterfaceC0694c y(HashMap hashMap, j$.time.format.F f) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (hashMap.containsKey(aVar)) {
            return j(((Long) hashMap.remove(aVar)).longValue());
        }
        T(hashMap, f);
        InterfaceC0694c V = V(hashMap, f);
        if (V != null) {
            return V;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (hashMap.containsKey(aVar2)) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (hashMap.containsKey(aVar3)) {
                if (hashMap.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                    return U(hashMap, f);
                }
                j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                if (hashMap.containsKey(aVar4)) {
                    j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (hashMap.containsKey(aVar5)) {
                        int a10 = u(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
                        if (f == j$.time.format.F.LENIENT) {
                            long p10 = AbstractC0689a.p(((Long) hashMap.remove(aVar3)).longValue(), 1L);
                            long p11 = AbstractC0689a.p(((Long) hashMap.remove(aVar4)).longValue(), 1L);
                            return N(a10, 1, 1).d(p10, (j$.time.temporal.s) ChronoUnit.MONTHS).d(p11, (j$.time.temporal.s) ChronoUnit.WEEKS).d(AbstractC0689a.p(((Long) hashMap.remove(aVar5)).longValue(), 1L), (j$.time.temporal.s) ChronoUnit.DAYS);
                        }
                        int a11 = u(aVar3).a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
                        int a12 = u(aVar4).a(((Long) hashMap.remove(aVar4)).longValue(), aVar4);
                        InterfaceC0694c d10 = N(a10, a11, 1).d((u(aVar5).a(((Long) hashMap.remove(aVar5)).longValue(), aVar5) - 1) + ((a12 - 1) * 7), (j$.time.temporal.s) ChronoUnit.DAYS);
                        if (f != j$.time.format.F.STRICT || d10.l(aVar3) == a11) {
                            return d10;
                        }
                        throw new j$.time.d("Strict mode rejected resolved date as it is in a different month");
                    }
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (hashMap.containsKey(aVar6)) {
                        int a13 = u(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
                        if (f == j$.time.format.F.LENIENT) {
                            return J(N(a13, 1, 1), AbstractC0689a.p(((Long) hashMap.remove(aVar3)).longValue(), 1L), AbstractC0689a.p(((Long) hashMap.remove(aVar4)).longValue(), 1L), AbstractC0689a.p(((Long) hashMap.remove(aVar6)).longValue(), 1L));
                        }
                        int a14 = u(aVar3).a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
                        InterfaceC0694c C = N(a13, a14, 1).d((u(aVar4).a(((Long) hashMap.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.s) ChronoUnit.DAYS).C(new j$.time.temporal.n(j$.time.f.T(u(aVar6).a(((Long) hashMap.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                        if (f != j$.time.format.F.STRICT || C.l(aVar3) == a14) {
                            return C;
                        }
                        throw new j$.time.d("Strict mode rejected resolved date as it is in a different month");
                    }
                }
            }
            j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
            if (hashMap.containsKey(aVar7)) {
                int a15 = u(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
                if (f == j$.time.format.F.LENIENT) {
                    return q(a15, 1).d(AbstractC0689a.p(((Long) hashMap.remove(aVar7)).longValue(), 1L), (j$.time.temporal.s) ChronoUnit.DAYS);
                }
                return q(a15, u(aVar7).a(((Long) hashMap.remove(aVar7)).longValue(), aVar7));
            }
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (hashMap.containsKey(aVar8)) {
                j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (hashMap.containsKey(aVar9)) {
                    int a16 = u(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
                    if (f == j$.time.format.F.LENIENT) {
                        long p12 = AbstractC0689a.p(((Long) hashMap.remove(aVar8)).longValue(), 1L);
                        return q(a16, 1).d(p12, (j$.time.temporal.s) ChronoUnit.WEEKS).d(AbstractC0689a.p(((Long) hashMap.remove(aVar9)).longValue(), 1L), (j$.time.temporal.s) ChronoUnit.DAYS);
                    }
                    int a17 = u(aVar8).a(((Long) hashMap.remove(aVar8)).longValue(), aVar8);
                    InterfaceC0694c d11 = q(a16, 1).d((u(aVar9).a(((Long) hashMap.remove(aVar9)).longValue(), aVar9) - 1) + ((a17 - 1) * 7), (j$.time.temporal.s) ChronoUnit.DAYS);
                    if (f != j$.time.format.F.STRICT || d11.l(aVar2) == a16) {
                        return d11;
                    }
                    throw new j$.time.d("Strict mode rejected resolved date as it is in a different year");
                }
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (hashMap.containsKey(aVar10)) {
                    int a18 = u(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
                    if (f == j$.time.format.F.LENIENT) {
                        return J(q(a18, 1), 0L, AbstractC0689a.p(((Long) hashMap.remove(aVar8)).longValue(), 1L), AbstractC0689a.p(((Long) hashMap.remove(aVar10)).longValue(), 1L));
                    }
                    InterfaceC0694c C2 = q(a18, 1).d((u(aVar8).a(((Long) hashMap.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.s) ChronoUnit.DAYS).C(new j$.time.temporal.n(j$.time.f.T(u(aVar10).a(((Long) hashMap.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
                    if (f != j$.time.format.F.STRICT || C2.l(aVar2) == a18) {
                        return C2;
                    }
                    throw new j$.time.d("Strict mode rejected resolved date as it is in a different year");
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
