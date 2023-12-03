package j$.time;

import com.appsflyer.R;
import j$.time.chrono.AbstractC0692a;
import j$.time.chrono.AbstractC0693b;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
/* loaded from: classes3.dex */
public enum p implements j$.time.temporal.l, j$.time.temporal.m {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    

    /* renamed from: a  reason: collision with root package name */
    private static final p[] f20980a = values();

    public static p W(int i6) {
        if (i6 < 1 || i6 > 12) {
            throw new d("Invalid value for MonthOfYear: " + i6);
        }
        return f20980a[i6 - 1];
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
        }
        return pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.o.e() ? j$.time.chrono.u.f20846d : rVar == j$.time.temporal.o.j() ? ChronoUnit.MONTHS : j$.time.temporal.o.c(this, rVar);
    }

    public final int T(boolean z10) {
        switch (o.f20979a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + 152;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + R.styleable.AppCompatTheme_windowFixedHeightMinor;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + 213;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    public final int U(boolean z10) {
        int i6 = o.f20979a[ordinal()];
        return i6 != 1 ? (i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public final int V() {
        int i6 = o.f20979a[ordinal()];
        if (i6 != 1) {
            return (i6 == 2 || i6 == 3 || i6 == 4 || i6 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final p X() {
        int i6 = ((int) 1) + 12;
        return f20980a[(i6 + ordinal()) % 12];
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR : pVar != null && pVar.l(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.MONTH_OF_YEAR ? getValue() : j$.time.temporal.o.a(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.MONTH_OF_YEAR ? pVar.n() : j$.time.temporal.o.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        if (((AbstractC0692a) AbstractC0693b.r(temporal)).equals(j$.time.chrono.u.f20846d)) {
            return temporal.c(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
        }
        throw new d("Adjustment only supported on ISO date-time");
    }
}
