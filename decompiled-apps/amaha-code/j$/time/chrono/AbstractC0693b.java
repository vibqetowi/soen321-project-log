package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
/* renamed from: j$.time.chrono.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0693b {
    public static Temporal a(InterfaceC0694c interfaceC0694c, Temporal temporal) {
        return temporal.c(interfaceC0694c.H(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static Temporal b(InterfaceC0697f interfaceC0697f, Temporal temporal) {
        return temporal.c(interfaceC0697f.f().H(), j$.time.temporal.a.EPOCH_DAY).c(interfaceC0697f.b().k0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static Temporal c(o oVar, Temporal temporal) {
        return temporal.c(oVar.getValue(), j$.time.temporal.a.ERA);
    }

    public static int d(InterfaceC0694c interfaceC0694c, InterfaceC0694c interfaceC0694c2) {
        int compare = Long.compare(interfaceC0694c.H(), interfaceC0694c2.H());
        if (compare == 0) {
            return ((AbstractC0692a) interfaceC0694c.a()).compareTo(interfaceC0694c2.a());
        }
        return compare;
    }

    public static int e(InterfaceC0697f interfaceC0697f, InterfaceC0697f interfaceC0697f2) {
        int Q = interfaceC0697f.f().Q(interfaceC0697f2.f());
        if (Q == 0) {
            int compareTo = interfaceC0697f.b().compareTo(interfaceC0697f2.b());
            if (compareTo == 0) {
                return ((AbstractC0692a) interfaceC0697f.a()).compareTo(interfaceC0697f2.a());
            }
            return compareTo;
        }
        return Q;
    }

    public static int f(InterfaceC0702k interfaceC0702k, InterfaceC0702k interfaceC0702k2) {
        int compare = Long.compare(interfaceC0702k.S(), interfaceC0702k2.S());
        if (compare == 0) {
            int Y = interfaceC0702k.b().Y() - interfaceC0702k2.b().Y();
            if (Y == 0) {
                int M = interfaceC0702k.s().M(interfaceC0702k2.s());
                if (M == 0) {
                    int compareTo = interfaceC0702k.F().k().compareTo(interfaceC0702k2.F().k());
                    if (compareTo == 0) {
                        return ((AbstractC0692a) interfaceC0702k.a()).compareTo(interfaceC0702k2.a());
                    }
                    return compareTo;
                }
                return M;
            }
            return Y;
        }
        return compare;
    }

    public static int g(InterfaceC0702k interfaceC0702k, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = AbstractC0701j.f20823a[((j$.time.temporal.a) pVar).ordinal()];
            if (i6 != 1) {
                return i6 != 2 ? interfaceC0702k.s().l(pVar) : interfaceC0702k.i().c0();
            }
            throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.o.a(interfaceC0702k, pVar);
    }

    public static int h(o oVar, j$.time.temporal.a aVar) {
        return aVar == j$.time.temporal.a.ERA ? oVar.getValue() : j$.time.temporal.o.a(oVar, aVar);
    }

    public static long i(o oVar, j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return oVar.getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.e.a("Unsupported field: ", pVar));
        }
        return pVar.G(oVar);
    }

    public static boolean j(InterfaceC0694c interfaceC0694c, j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar.isDateBased() : pVar != null && pVar.l(interfaceC0694c);
    }

    public static boolean k(o oVar, j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.ERA : pVar != null && pVar.l(oVar);
    }

    public static Object l(InterfaceC0694c interfaceC0694c, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.o.l() || rVar == j$.time.temporal.o.k() || rVar == j$.time.temporal.o.i() || rVar == j$.time.temporal.o.g()) {
            return null;
        }
        return rVar == j$.time.temporal.o.e() ? interfaceC0694c.a() : rVar == j$.time.temporal.o.j() ? ChronoUnit.DAYS : rVar.i(interfaceC0694c);
    }

    public static Object m(InterfaceC0697f interfaceC0697f, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.o.l() || rVar == j$.time.temporal.o.k() || rVar == j$.time.temporal.o.i()) {
            return null;
        }
        return rVar == j$.time.temporal.o.g() ? interfaceC0697f.b() : rVar == j$.time.temporal.o.e() ? interfaceC0697f.a() : rVar == j$.time.temporal.o.j() ? ChronoUnit.NANOS : rVar.i(interfaceC0697f);
    }

    public static Object n(InterfaceC0702k interfaceC0702k, j$.time.temporal.r rVar) {
        return (rVar == j$.time.temporal.o.k() || rVar == j$.time.temporal.o.l()) ? interfaceC0702k.F() : rVar == j$.time.temporal.o.i() ? interfaceC0702k.i() : rVar == j$.time.temporal.o.g() ? interfaceC0702k.b() : rVar == j$.time.temporal.o.e() ? interfaceC0702k.a() : rVar == j$.time.temporal.o.j() ? ChronoUnit.NANOS : rVar.i(interfaceC0702k);
    }

    public static Object o(o oVar, j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.o.j() ? ChronoUnit.ERAS : j$.time.temporal.o.c(oVar, rVar);
    }

    public static long p(InterfaceC0697f interfaceC0697f, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((interfaceC0697f.f().H() * 86400) + interfaceC0697f.b().l0()) - zoneOffset.c0();
    }

    public static long q(InterfaceC0702k interfaceC0702k) {
        return ((interfaceC0702k.f().H() * 86400) + interfaceC0702k.b().l0()) - interfaceC0702k.i().c0();
    }

    public static n r(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        Object obj = (n) lVar.J(j$.time.temporal.o.e());
        u uVar = u.f20846d;
        if (obj == null) {
            obj = Objects.requireNonNull(uVar, "defaultObj");
        }
        return (n) obj;
    }
}
