package j$.time;

import com.theinnerhour.b2b.utils.Constants;
import j$.time.chrono.AbstractC0692a;
import j$.time.chrono.AbstractC0693b;
import j$.time.format.G;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class A implements Temporal, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f20767c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a  reason: collision with root package name */
    private final int f20768a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20769b;

    static {
        j$.time.format.w wVar = new j$.time.format.w();
        wVar.k(j$.time.temporal.a.YEAR, 4, 10, G.EXCEEDS_PAD);
        wVar.e('-');
        wVar.m(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        wVar.u();
    }

    private A(int i6, int i10) {
        this.f20768a = i6;
        this.f20769b = i10;
    }

    private long T() {
        return ((this.f20768a * 12) + this.f20769b) - 1;
    }

    public static A U(int i6, int i10) {
        j$.time.temporal.a.YEAR.U(i6);
        j$.time.temporal.a.MONTH_OF_YEAR.U(i10);
        return new A(i6, i10);
    }

    private A Y(int i6, int i10) {
        return (this.f20768a == i6 && this.f20769b == i10) ? this : new A(i6, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 12, this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = z.f21046a[((j$.time.temporal.a) pVar).ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    int i10 = this.f20768a;
                    if (i6 == 3) {
                        if (i10 < 1) {
                            i10 = 1 - i10;
                        }
                        return i10;
                    } else if (i6 != 4) {
                        if (i6 == 5) {
                            return i10 < 1 ? 0 : 1;
                        }
                        throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
                    } else {
                        return i10;
                    }
                }
                return T();
            }
            return this.f20769b;
        }
        return pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.o.e() ? j$.time.chrono.u.f20846d : rVar == j$.time.temporal.o.j() ? ChronoUnit.MONTHS : j$.time.temporal.o.c(this, rVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V */
    public final A d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            switch (z.f21047b[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return W(j10);
                case 2:
                    return X(j10);
                case 3:
                    return X(AbstractC0689a.o(j10, 10));
                case 4:
                    return X(AbstractC0689a.o(j10, 100));
                case 5:
                    return X(AbstractC0689a.o(j10, 1000));
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return c(AbstractC0689a.j(G(aVar), j10), aVar);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (A) sVar.l(this, j10);
    }

    public final A W(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f20768a * 12) + (this.f20769b - 1) + j10;
        long j12 = 12;
        return Y(j$.time.temporal.a.YEAR.T(AbstractC0689a.n(j11, j12)), ((int) AbstractC0689a.m(j11, j12)) + 1);
    }

    public final A X(long j10) {
        return j10 == 0 ? this : Y(j$.time.temporal.a.YEAR.T(this.f20768a + j10), this.f20769b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Z */
    public final A c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            aVar.U(j10);
            int i6 = z.f21046a[aVar.ordinal()];
            int i10 = this.f20768a;
            if (i6 == 1) {
                int i11 = (int) j10;
                j$.time.temporal.a.MONTH_OF_YEAR.U(i11);
                return Y(i10, i11);
            } else if (i6 != 2) {
                int i12 = this.f20769b;
                if (i6 == 3) {
                    if (i10 < 1) {
                        j10 = 1 - j10;
                    }
                    int i13 = (int) j10;
                    j$.time.temporal.a.YEAR.U(i13);
                    return Y(i13, i12);
                } else if (i6 == 4) {
                    int i14 = (int) j10;
                    j$.time.temporal.a.YEAR.U(i14);
                    return Y(i14, i12);
                } else if (i6 == 5) {
                    if (G(j$.time.temporal.a.ERA) == j10) {
                        return this;
                    }
                    int i15 = 1 - i10;
                    j$.time.temporal.a.YEAR.U(i15);
                    return Y(i15, i12);
                } else {
                    throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
                }
            } else {
                return W(j10 - T());
            }
        }
        return (A) pVar.J(this, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f20768a);
        dataOutput.writeByte(this.f20769b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        A a10 = (A) obj;
        int i6 = this.f20768a - a10.f20768a;
        return i6 == 0 ? this.f20769b - a10.f20769b : i6;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.l(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            A a10 = (A) obj;
            return this.f20768a == a10.f20768a && this.f20769b == a10.f20769b;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        A U;
        if (temporal instanceof A) {
            U = (A) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.u.f20846d.equals(AbstractC0693b.r(temporal))) {
                    temporal = j.V(temporal);
                }
                U = U(temporal.l(j$.time.temporal.a.YEAR), temporal.l(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (d e10) {
                String name = temporal.getClass().getName();
                throw new d("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + name, e10);
            }
        }
        if (sVar instanceof ChronoUnit) {
            long T = U.T() - T();
            switch (z.f21047b[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return T;
                case 2:
                    return T / 12;
                case 3:
                    return T / 120;
                case 4:
                    return T / 1200;
                case 5:
                    return T / 12000;
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return U.G(aVar) - G(aVar);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return sVar.between(this, U);
    }

    public final int hashCode() {
        return (this.f20769b << 27) ^ this.f20768a;
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        return n(pVar).a(G(pVar), pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal m(j jVar) {
        return (A) AbstractC0693b.a(jVar, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.j(1L, this.f20768a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.o.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        if (((AbstractC0692a) AbstractC0693b.r(temporal)).equals(j$.time.chrono.u.f20846d)) {
            return temporal.c(T(), j$.time.temporal.a.PROLEPTIC_MONTH);
        }
        throw new d("Adjustment only supported on ISO date-time");
    }

    public final String toString() {
        int i6;
        int i10 = this.f20768a;
        int abs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(9);
        if (abs < 1000) {
            if (i10 < 0) {
                sb2.append(i10 - 10000);
                i6 = 1;
            } else {
                sb2.append(i10 + Constants.TIMEOUT_MS);
                i6 = 0;
            }
            sb2.deleteCharAt(i6);
        } else {
            sb2.append(i10);
        }
        int i11 = this.f20769b;
        sb2.append(i11 < 10 ? "-0" : "-");
        sb2.append(i11);
        return sb2.toString();
    }
}
