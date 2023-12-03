package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
/* loaded from: classes3.dex */
public enum f implements j$.time.temporal.l, j$.time.temporal.m {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: a  reason: collision with root package name */
    private static final f[] f20855a = values();

    public static f T(int i6) {
        if (i6 < 1 || i6 > 7) {
            throw new d("Invalid value for DayOfWeek: " + i6);
        }
        return f20855a[i6 - 1];
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
        }
        return pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.o.j() ? ChronoUnit.DAYS : j$.time.temporal.o.c(this, rVar);
    }

    public final f U(long j10) {
        int i6 = ((int) (j10 % 7)) + 7;
        return f20855a[(i6 + ordinal()) % 7];
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.DAY_OF_WEEK : pVar != null && pVar.l(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.o.a(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.a.DAY_OF_WEEK ? pVar.n() : j$.time.temporal.o.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        return temporal.c(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
