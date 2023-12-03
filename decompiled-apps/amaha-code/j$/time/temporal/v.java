package j$.time.temporal;

import j$.time.AbstractC0689a;
import j$.time.chrono.AbstractC0693b;
import j$.time.chrono.InterfaceC0694c;
import j$.time.format.F;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class v implements p {
    private static final u f = u.j(1, 7);

    /* renamed from: g  reason: collision with root package name */
    private static final u f21019g = u.k(0, 4, 6);

    /* renamed from: h  reason: collision with root package name */
    private static final u f21020h = u.k(0, 52, 54);

    /* renamed from: i  reason: collision with root package name */
    private static final u f21021i = u.l(52, 53);

    /* renamed from: a  reason: collision with root package name */
    private final String f21022a;

    /* renamed from: b  reason: collision with root package name */
    private final w f21023b;

    /* renamed from: c  reason: collision with root package name */
    private final s f21024c;

    /* renamed from: d  reason: collision with root package name */
    private final s f21025d;

    /* renamed from: e  reason: collision with root package name */
    private final u f21026e;

    private v(String str, w wVar, s sVar, s sVar2, u uVar) {
        this.f21022a = str;
        this.f21023b = wVar;
        this.f21024c = sVar;
        this.f21025d = sVar2;
        this.f21026e = uVar;
    }

    private static int a(int i6, int i10) {
        return ((i10 - 1) + (i6 + 7)) / 7;
    }

    private int b(l lVar) {
        return o.h(lVar.l(a.DAY_OF_WEEK) - this.f21023b.e().getValue()) + 1;
    }

    private int c(l lVar) {
        int b10 = b(lVar);
        int l2 = lVar.l(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int l10 = lVar.l(aVar);
        int q10 = q(l10, b10);
        int a10 = a(q10, l10);
        if (a10 == 0) {
            return l2 - 1;
        }
        return a10 >= a(q10, this.f21023b.f() + ((int) lVar.n(aVar).d())) ? l2 + 1 : l2;
    }

    private long d(l lVar) {
        int b10 = b(lVar);
        int l2 = lVar.l(a.DAY_OF_MONTH);
        return a(q(l2, b10), l2);
    }

    private int e(l lVar) {
        int b10 = b(lVar);
        a aVar = a.DAY_OF_YEAR;
        int l2 = lVar.l(aVar);
        int q10 = q(l2, b10);
        int a10 = a(q10, l2);
        if (a10 == 0) {
            return e(AbstractC0693b.r(lVar).E(lVar).g(l2, ChronoUnit.DAYS));
        }
        if (a10 > 50) {
            int a11 = a(q10, this.f21023b.f() + ((int) lVar.n(aVar).d()));
            return a10 >= a11 ? (a10 - a11) + 1 : a10;
        }
        return a10;
    }

    private long f(l lVar) {
        int b10 = b(lVar);
        int l2 = lVar.l(a.DAY_OF_YEAR);
        return a(q(l2, b10), l2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v g(w wVar) {
        return new v("DayOfWeek", wVar, ChronoUnit.DAYS, ChronoUnit.WEEKS, f);
    }

    private InterfaceC0694c h(j$.time.chrono.n nVar, int i6, int i10, int i11) {
        InterfaceC0694c N = nVar.N(i6, 1, 1);
        int q10 = q(1, b(N));
        int i12 = i11 - 1;
        return N.d(((Math.min(i10, a(q10, this.f21023b.f() + N.P()) - 1) - 1) * 7) + i12 + (-q10), (s) ChronoUnit.DAYS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v i(w wVar) {
        return new v("WeekBasedYear", wVar, i.f21000d, ChronoUnit.FOREVER, a.YEAR.n());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v j(w wVar) {
        return new v("WeekOfMonth", wVar, ChronoUnit.WEEKS, ChronoUnit.MONTHS, f21019g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v k(w wVar) {
        return new v("WeekOfWeekBasedYear", wVar, ChronoUnit.WEEKS, i.f21000d, f21021i);
    }

    private u o(l lVar, a aVar) {
        int q10 = q(lVar.l(aVar), b(lVar));
        u n10 = lVar.n(aVar);
        return u.j(a(q10, (int) n10.e()), a(q10, (int) n10.d()));
    }

    private u p(l lVar) {
        a aVar = a.DAY_OF_YEAR;
        if (lVar.e(aVar)) {
            int b10 = b(lVar);
            int l2 = lVar.l(aVar);
            int q10 = q(l2, b10);
            int a10 = a(q10, l2);
            if (a10 == 0) {
                return p(AbstractC0693b.r(lVar).E(lVar).g(l2 + 7, ChronoUnit.DAYS));
            }
            int d10 = (int) lVar.n(aVar).d();
            int a11 = a(q10, this.f21023b.f() + d10);
            return a10 >= a11 ? p(AbstractC0693b.r(lVar).E(lVar).d((d10 - l2) + 1 + 7, (s) ChronoUnit.DAYS)) : u.j(1L, a11 - 1);
        }
        return f21020h;
    }

    private int q(int i6, int i10) {
        int h10 = o.h(i6 - i10);
        return h10 + 1 > this.f21023b.f() ? 7 - h10 : -h10;
    }

    @Override // j$.time.temporal.p
    public final long G(l lVar) {
        int c10;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        s sVar = this.f21025d;
        if (sVar == chronoUnit) {
            c10 = b(lVar);
        } else if (sVar == ChronoUnit.MONTHS) {
            return d(lVar);
        } else {
            if (sVar == ChronoUnit.YEARS) {
                return f(lVar);
            }
            if (sVar == w.f21028h) {
                c10 = e(lVar);
            } else if (sVar != ChronoUnit.FOREVER) {
                throw new IllegalStateException("unreachable, rangeUnit: " + sVar + ", this: " + this);
            } else {
                c10 = c(lVar);
            }
        }
        return c10;
    }

    @Override // j$.time.temporal.p
    public final Temporal J(Temporal temporal, long j10) {
        p pVar;
        p pVar2;
        int a10 = this.f21026e.a(j10, this);
        int l2 = temporal.l(this);
        if (a10 == l2) {
            return temporal;
        }
        if (this.f21025d == ChronoUnit.FOREVER) {
            w wVar = this.f21023b;
            pVar = wVar.f21031c;
            int l10 = temporal.l(pVar);
            pVar2 = wVar.f21033e;
            return h(AbstractC0693b.r(temporal), (int) j10, temporal.l(pVar2), l10);
        }
        return temporal.d(a10 - l2, this.f21024c);
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.p
    public final boolean isTimeBased() {
        return false;
    }

    @Override // j$.time.temporal.p
    public final boolean l(l lVar) {
        a aVar;
        if (lVar.e(a.DAY_OF_WEEK)) {
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            s sVar = this.f21025d;
            if (sVar == chronoUnit) {
                return true;
            }
            if (sVar == ChronoUnit.MONTHS) {
                aVar = a.DAY_OF_MONTH;
            } else if (sVar == ChronoUnit.YEARS || sVar == w.f21028h) {
                aVar = a.DAY_OF_YEAR;
            } else if (sVar != ChronoUnit.FOREVER) {
                return false;
            } else {
                aVar = a.YEAR;
            }
            return lVar.e(aVar);
        }
        return false;
    }

    @Override // j$.time.temporal.p
    public final u m(l lVar) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        s sVar = this.f21025d;
        if (sVar == chronoUnit) {
            return this.f21026e;
        }
        if (sVar == ChronoUnit.MONTHS) {
            return o(lVar, a.DAY_OF_MONTH);
        }
        if (sVar == ChronoUnit.YEARS) {
            return o(lVar, a.DAY_OF_YEAR);
        }
        if (sVar == w.f21028h) {
            return p(lVar);
        }
        if (sVar == ChronoUnit.FOREVER) {
            return a.YEAR.n();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + sVar + ", this: " + this);
    }

    @Override // j$.time.temporal.p
    public final u n() {
        return this.f21026e;
    }

    @Override // j$.time.temporal.p
    public final l r(HashMap hashMap, l lVar, F f2) {
        long longValue;
        Object obj;
        Object obj2;
        p pVar;
        Object obj3;
        p pVar2;
        p pVar3;
        Object obj4;
        p pVar4;
        InterfaceC0694c interfaceC0694c;
        Object obj5;
        Object obj6;
        Object obj7;
        InterfaceC0694c interfaceC0694c2;
        a aVar;
        InterfaceC0694c N;
        InterfaceC0694c interfaceC0694c3;
        int i6 = AbstractC0689a.i(((Long) hashMap.get(this)).longValue());
        s sVar = ChronoUnit.WEEKS;
        u uVar = this.f21026e;
        w wVar = this.f21023b;
        s sVar2 = this.f21025d;
        if (sVar2 == sVar) {
            hashMap.remove(this);
            hashMap.put(a.DAY_OF_WEEK, Long.valueOf(o.h((uVar.a(longValue, this) - 1) + (wVar.e().getValue() - 1)) + 1));
        } else {
            a aVar2 = a.DAY_OF_WEEK;
            if (hashMap.containsKey(aVar2)) {
                int h10 = o.h(aVar2.T(((Long) hashMap.get(aVar2)).longValue()) - wVar.e().getValue()) + 1;
                j$.time.chrono.n r = AbstractC0693b.r(lVar);
                a aVar3 = a.YEAR;
                if (hashMap.containsKey(aVar3)) {
                    int T = aVar3.T(((Long) hashMap.get(aVar3)).longValue());
                    s sVar3 = ChronoUnit.MONTHS;
                    if (sVar2 == sVar3) {
                        Object obj8 = a.MONTH_OF_YEAR;
                        if (hashMap.containsKey(obj8)) {
                            long longValue2 = ((Long) hashMap.get(obj8)).longValue();
                            long j10 = i6;
                            if (f2 == F.LENIENT) {
                                InterfaceC0694c d10 = r.N(T, 1, 1).d(AbstractC0689a.p(longValue2, 1L), sVar3);
                                interfaceC0694c3 = d10.d(AbstractC0689a.j(AbstractC0689a.o(AbstractC0689a.p(j10, d(d10)), 7), h10 - b(d10)), ChronoUnit.DAYS);
                                aVar = obj8;
                            } else {
                                aVar = obj8;
                                InterfaceC0694c d11 = r.N(T, aVar.T(longValue2), 1).d((((int) (uVar.a(j10, this) - d(N))) * 7) + (h10 - b(N)), ChronoUnit.DAYS);
                                if (f2 == F.STRICT && d11.G(aVar) != longValue2) {
                                    throw new j$.time.d("Strict mode rejected resolved date as it is in a different month");
                                }
                                interfaceC0694c3 = d11;
                            }
                            hashMap.remove(this);
                            hashMap.remove(aVar3);
                            hashMap.remove(aVar);
                            hashMap.remove(aVar2);
                            return interfaceC0694c3;
                        }
                    }
                    if (sVar2 == ChronoUnit.YEARS) {
                        long j11 = i6;
                        InterfaceC0694c N2 = r.N(T, 1, 1);
                        if (f2 == F.LENIENT) {
                            interfaceC0694c2 = N2.d(AbstractC0689a.j(AbstractC0689a.o(AbstractC0689a.p(j11, f(N2)), 7), h10 - b(N2)), ChronoUnit.DAYS);
                        } else {
                            InterfaceC0694c d12 = N2.d((((int) (uVar.a(j11, this) - f(N2))) * 7) + (h10 - b(N2)), ChronoUnit.DAYS);
                            if (f2 == F.STRICT && d12.G(aVar3) != T) {
                                throw new j$.time.d("Strict mode rejected resolved date as it is in a different year");
                            }
                            interfaceC0694c2 = d12;
                        }
                        hashMap.remove(this);
                        hashMap.remove(aVar3);
                        hashMap.remove(aVar2);
                        return interfaceC0694c2;
                    }
                } else if (sVar2 == w.f21028h || sVar2 == ChronoUnit.FOREVER) {
                    obj = wVar.f;
                    if (hashMap.containsKey(obj)) {
                        obj2 = wVar.f21033e;
                        if (hashMap.containsKey(obj2)) {
                            pVar = wVar.f;
                            u uVar2 = ((v) pVar).f21026e;
                            obj3 = wVar.f;
                            long longValue3 = ((Long) hashMap.get(obj3)).longValue();
                            pVar2 = wVar.f;
                            int a10 = uVar2.a(longValue3, pVar2);
                            if (f2 == F.LENIENT) {
                                InterfaceC0694c h11 = h(r, a10, 1, h10);
                                obj7 = wVar.f21033e;
                                interfaceC0694c = h11.d(AbstractC0689a.p(((Long) hashMap.get(obj7)).longValue(), 1L), sVar);
                            } else {
                                pVar3 = wVar.f21033e;
                                u uVar3 = ((v) pVar3).f21026e;
                                obj4 = wVar.f21033e;
                                long longValue4 = ((Long) hashMap.get(obj4)).longValue();
                                pVar4 = wVar.f21033e;
                                InterfaceC0694c h12 = h(r, a10, uVar3.a(longValue4, pVar4), h10);
                                if (f2 == F.STRICT && c(h12) != a10) {
                                    throw new j$.time.d("Strict mode rejected resolved date as it is in a different week-based-year");
                                }
                                interfaceC0694c = h12;
                            }
                            hashMap.remove(this);
                            obj5 = wVar.f;
                            hashMap.remove(obj5);
                            obj6 = wVar.f21033e;
                            hashMap.remove(obj6);
                            hashMap.remove(aVar2);
                            return interfaceC0694c;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final String toString() {
        String wVar = this.f21023b.toString();
        return this.f21022a + "[" + wVar + "]";
    }
}
