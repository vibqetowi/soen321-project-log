package j$.time.temporal;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.time.AbstractC0689a;
import j$.time.format.F;
import java.util.HashMap;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
abstract class g implements p {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f20993a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ g[] f20994b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.p
            public final long G(l lVar) {
                int[] iArr;
                if (l(lVar)) {
                    int l2 = lVar.l(a.DAY_OF_YEAR);
                    int l10 = lVar.l(a.MONTH_OF_YEAR);
                    long G = lVar.G(a.YEAR);
                    iArr = g.f20993a;
                    return l2 - iArr[((l10 - 1) / 3) + (j$.time.chrono.u.f20846d.R(G) ? 4 : 0)];
                }
                throw new t("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.p
            public final Temporal J(Temporal temporal, long j10) {
                long G = G(temporal);
                n().b(j10, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.c((j10 - G) + temporal.G(aVar), aVar);
            }

            @Override // j$.time.temporal.p
            public final boolean l(l lVar) {
                return lVar.e(a.DAY_OF_YEAR) && lVar.e(a.MONTH_OF_YEAR) && lVar.e(a.YEAR) && i.a(lVar);
            }

            @Override // j$.time.temporal.p
            public final u m(l lVar) {
                if (l(lVar)) {
                    long G = lVar.G(g.QUARTER_OF_YEAR);
                    if (G == 1) {
                        return j$.time.chrono.u.f20846d.R(lVar.G(a.YEAR)) ? u.j(1L, 91L) : u.j(1L, 90L);
                    }
                    return G == 2 ? u.j(1L, 91L) : (G == 3 || G == 4) ? u.j(1L, 92L) : n();
                }
                throw new t("Unsupported field: DayOfQuarter");
            }

            @Override // j$.time.temporal.p
            public final u n() {
                return u.l(90L, 92L);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.p
            public final l r(HashMap hashMap, l lVar, F f) {
                long j10;
                j$.time.j jVar;
                a aVar = a.YEAR;
                Long l2 = (Long) hashMap.get(aVar);
                p pVar = g.QUARTER_OF_YEAR;
                Long l10 = (Long) hashMap.get(pVar);
                if (l2 == null || l10 == null) {
                    return null;
                }
                int T = aVar.T(l2.longValue());
                long longValue = ((Long) hashMap.get(g.DAY_OF_QUARTER)).longValue();
                if (i.a(lVar)) {
                    if (f == F.LENIENT) {
                        jVar = j$.time.j.h0(T, 1, 1).n0(AbstractC0689a.o(AbstractC0689a.p(l10.longValue(), 1L), 3));
                        j10 = AbstractC0689a.p(longValue, 1L);
                    } else {
                        j$.time.j h02 = j$.time.j.h0(T, ((pVar.n().a(l10.longValue(), pVar) - 1) * 3) + 1, 1);
                        if (longValue < 1 || longValue > 90) {
                            (f == F.STRICT ? m(h02) : n()).b(longValue, this);
                        }
                        j10 = longValue - 1;
                        jVar = h02;
                    }
                    hashMap.remove(this);
                    hashMap.remove(aVar);
                    hashMap.remove(pVar);
                    return jVar.m0(j10);
                }
                throw new j$.time.d("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final long G(l lVar) {
                if (l(lVar)) {
                    return (lVar.G(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new t("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.p
            public final Temporal J(Temporal temporal, long j10) {
                long G = G(temporal);
                n().b(j10, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.c(((j10 - G) * 3) + temporal.G(aVar), aVar);
            }

            @Override // j$.time.temporal.p
            public final boolean l(l lVar) {
                return lVar.e(a.MONTH_OF_YEAR) && i.a(lVar);
            }

            @Override // j$.time.temporal.p
            public final u m(l lVar) {
                if (l(lVar)) {
                    return n();
                }
                throw new t("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.p
            public final u n() {
                return u.j(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final long G(l lVar) {
                if (l(lVar)) {
                    return g.U(j$.time.j.V(lVar));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final Temporal J(Temporal temporal, long j10) {
                n().b(j10, this);
                return temporal.d(AbstractC0689a.p(j10, G(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.p
            public final boolean l(l lVar) {
                return lVar.e(a.EPOCH_DAY) && i.a(lVar);
            }

            @Override // j$.time.temporal.p
            public final u m(l lVar) {
                if (l(lVar)) {
                    return g.X(j$.time.j.V(lVar));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final u n() {
                return u.l(52L, 53L);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.p
            public final l r(HashMap hashMap, l lVar, F f) {
                j$.time.j c10;
                long j10;
                j$.time.j o02;
                long j11;
                p pVar = g.WEEK_BASED_YEAR;
                Long l2 = (Long) hashMap.get(pVar);
                a aVar = a.DAY_OF_WEEK;
                Long l10 = (Long) hashMap.get(aVar);
                if (l2 == null || l10 == null) {
                    return null;
                }
                int a10 = pVar.n().a(l2.longValue(), pVar);
                long longValue = ((Long) hashMap.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                if (i.a(lVar)) {
                    j$.time.j h02 = j$.time.j.h0(a10, 1, 4);
                    if (f == F.LENIENT) {
                        long longValue2 = l10.longValue();
                        if (longValue2 > 7) {
                            j11 = longValue2 - 1;
                            o02 = h02.o0(j11 / 7);
                        } else {
                            j10 = 1;
                            if (longValue2 < 1) {
                                o02 = h02.o0(AbstractC0689a.p(longValue2, 7L) / 7);
                                j11 = longValue2 + 6;
                            }
                            c10 = h02.o0(AbstractC0689a.p(longValue, j10)).c(longValue2, aVar);
                        }
                        h02 = o02;
                        j10 = 1;
                        longValue2 = (j11 % 7) + 1;
                        c10 = h02.o0(AbstractC0689a.p(longValue, j10)).c(longValue2, aVar);
                    } else {
                        int T = aVar.T(l10.longValue());
                        if (longValue < 1 || longValue > 52) {
                            (f == F.STRICT ? g.X(h02) : n()).b(longValue, this);
                        }
                        c10 = h02.o0(longValue - 1).c(T, aVar);
                    }
                    hashMap.remove(this);
                    hashMap.remove(pVar);
                    hashMap.remove(aVar);
                    return c10;
                }
                throw new j$.time.d("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final long G(l lVar) {
                int Y;
                if (l(lVar)) {
                    Y = g.Y(j$.time.j.V(lVar));
                    return Y;
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final Temporal J(Temporal temporal, long j10) {
                int Z;
                if (l(temporal)) {
                    int a10 = n().a(j10, g.WEEK_BASED_YEAR);
                    j$.time.j V = j$.time.j.V(temporal);
                    a aVar = a.DAY_OF_WEEK;
                    int l2 = V.l(aVar);
                    int U = g.U(V);
                    if (U == 53) {
                        Z = g.Z(a10);
                        if (Z == 52) {
                            U = 52;
                        }
                    }
                    j$.time.j h02 = j$.time.j.h0(a10, 1, 4);
                    return temporal.m(h02.m0(((U - 1) * 7) + (l2 - h02.l(aVar))));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final boolean l(l lVar) {
                return lVar.e(a.EPOCH_DAY) && i.a(lVar);
            }

            @Override // j$.time.temporal.p
            public final u m(l lVar) {
                if (l(lVar)) {
                    return n();
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final u n() {
                return a.YEAR.n();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        f20994b = new g[]{gVar, gVar2, gVar3, gVar4};
        f20993a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(String str, int i6) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        if ((r0 == -3 || (r0 == -2 && r5.t())) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int U(j$.time.j jVar) {
        int ordinal = jVar.X().ordinal();
        int i6 = 1;
        int Y = jVar.Y() - 1;
        int i10 = (3 - ordinal) + Y;
        int i11 = (i10 - ((i10 / 7) * 7)) - 3;
        if (i11 < -3) {
            i11 += 7;
        }
        if (Y < i11) {
            return (int) u.j(1L, Z(Y(jVar.t0(SubsamplingScaleImageView.ORIENTATION_180).p0(-1L)))).d();
        }
        int i12 = ((Y - i11) / 7) + 1;
        if (i12 == 53) {
        }
        i6 = i12;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u X(j$.time.j jVar) {
        return u.j(1L, Z(Y(jVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Y(j$.time.j jVar) {
        int b02 = jVar.b0();
        int Y = jVar.Y();
        if (Y <= 3) {
            return Y - jVar.X().ordinal() < -2 ? b02 - 1 : b02;
        } else if (Y >= 363) {
            return ((Y - 363) - (jVar.t() ? 1 : 0)) - jVar.X().ordinal() >= 0 ? b02 + 1 : b02;
        } else {
            return b02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Z(int i6) {
        j$.time.j h02 = j$.time.j.h0(i6, 1, 1);
        if (h02.X() != j$.time.f.THURSDAY) {
            return (h02.X() == j$.time.f.WEDNESDAY && h02.t()) ? 53 : 52;
        }
        return 53;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f20994b.clone();
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.p
    public final boolean isTimeBased() {
        return false;
    }

    public /* synthetic */ l r(HashMap hashMap, l lVar, F f) {
        return null;
    }
}
