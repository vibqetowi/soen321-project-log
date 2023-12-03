package j$.time.temporal;

import j$.util.Objects;
/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    static final r f21008a = new q(0);

    /* renamed from: b  reason: collision with root package name */
    static final r f21009b = new q(1);

    /* renamed from: c  reason: collision with root package name */
    static final r f21010c = new q(2);

    /* renamed from: d  reason: collision with root package name */
    static final r f21011d = new q(3);

    /* renamed from: e  reason: collision with root package name */
    static final r f21012e = new q(4);
    static final r f = new q(5);

    /* renamed from: g  reason: collision with root package name */
    static final r f21013g = new q(6);

    public static int a(l lVar, p pVar) {
        u n10 = lVar.n(pVar);
        if (!n10.h()) {
            throw new t("Invalid field " + pVar + " for get() method, use getLong() instead");
        }
        long G = lVar.G(pVar);
        if (n10.i(G)) {
            return (int) G;
        }
        throw new j$.time.d("Invalid value for " + pVar + " (valid values " + n10 + "): " + G);
    }

    public static Temporal b(Temporal temporal, long j10, ChronoUnit chronoUnit) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            temporal = temporal.d(Long.MAX_VALUE, chronoUnit);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return temporal.d(j11, chronoUnit);
    }

    public static Object c(l lVar, r rVar) {
        if (rVar == f21008a || rVar == f21009b || rVar == f21010c) {
            return null;
        }
        return rVar.i(lVar);
    }

    public static u d(l lVar, p pVar) {
        if (!(pVar instanceof a)) {
            Objects.requireNonNull(pVar, "field");
            return pVar.m(lVar);
        } else if (lVar.e(pVar)) {
            return pVar.n();
        } else {
            throw new t(j$.time.e.a("Unsupported field: ", pVar));
        }
    }

    public static r e() {
        return f21009b;
    }

    public static r f() {
        return f;
    }

    public static r g() {
        return f21013g;
    }

    public static /* synthetic */ int h(int i6) {
        int i10 = i6 % 7;
        if (i10 == 0) {
            return 0;
        }
        return (((i6 ^ 7) >> 31) | 1) > 0 ? i10 : i10 + 7;
    }

    public static r i() {
        return f21011d;
    }

    public static r j() {
        return f21010c;
    }

    public static r k() {
        return f21012e;
    }

    public static r l() {
        return f21008a;
    }
}
