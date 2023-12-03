package j$.time;

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
public final class y implements Temporal, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f21044b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a  reason: collision with root package name */
    private final int f21045a;

    static {
        new j$.time.format.w().k(j$.time.temporal.a.YEAR, 4, 10, G.EXCEEDS_PAD).u();
    }

    private y(int i6) {
        this.f21045a = i6;
    }

    public static y T(int i6) {
        j$.time.temporal.a.YEAR.U(i6);
        return new y(i6);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 11, this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = x.f21042a[((j$.time.temporal.a) pVar).ordinal()];
            int i10 = this.f21045a;
            if (i6 == 1) {
                if (i10 < 1) {
                    i10 = 1 - i10;
                }
                return i10;
            } else if (i6 != 2) {
                if (i6 == 3) {
                    return i10 < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
            } else {
                return i10;
            }
        }
        return pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.o.e() ? j$.time.chrono.u.f20846d : rVar == j$.time.temporal.o.j() ? ChronoUnit.YEARS : j$.time.temporal.o.c(this, rVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U */
    public final y d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            int i6 = x.f21043b[((ChronoUnit) sVar).ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                                return c(AbstractC0689a.j(G(aVar), j10), aVar);
                            }
                            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
                        }
                        return V(AbstractC0689a.o(j10, 1000));
                    }
                    return V(AbstractC0689a.o(j10, 100));
                }
                return V(AbstractC0689a.o(j10, 10));
            }
            return V(j10);
        }
        return (y) sVar.l(this, j10);
    }

    public final y V(long j10) {
        return j10 == 0 ? this : T(j$.time.temporal.a.YEAR.T(this.f21045a + j10));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W */
    public final y c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            aVar.U(j10);
            int i6 = x.f21042a[aVar.ordinal()];
            int i10 = this.f21045a;
            if (i6 == 1) {
                if (i10 < 1) {
                    j10 = 1 - j10;
                }
                return T((int) j10);
            } else if (i6 != 2) {
                if (i6 == 3) {
                    return G(j$.time.temporal.a.ERA) == j10 ? this : T(1 - i10);
                }
                throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
            } else {
                return T((int) j10);
            }
        }
        return (y) pVar.J(this, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X(DataOutput dataOutput) {
        dataOutput.writeInt(this.f21045a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21045a - ((y) obj).f21045a;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.l(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f21045a == ((y) obj).f21045a;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        y T;
        if (temporal instanceof y) {
            T = (y) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.u.f20846d.equals(AbstractC0693b.r(temporal))) {
                    temporal = j.V(temporal);
                }
                T = T(temporal.l(j$.time.temporal.a.YEAR));
            } catch (d e10) {
                String name = temporal.getClass().getName();
                throw new d("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + name, e10);
            }
        }
        if (sVar instanceof ChronoUnit) {
            long j10 = T.f21045a - this.f21045a;
            int i6 = x.f21043b[((ChronoUnit) sVar).ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                                return T.G(aVar) - G(aVar);
                            }
                            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
                        }
                        return j10 / 1000;
                    }
                    return j10 / 100;
                }
                return j10 / 10;
            }
            return j10;
        }
        return sVar.between(this, T);
    }

    public final int hashCode() {
        return this.f21045a;
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        return n(pVar).a(G(pVar), pVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal m(j jVar) {
        return (y) AbstractC0693b.a(jVar, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.j(1L, this.f21045a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.o.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        if (((AbstractC0692a) AbstractC0693b.r(temporal)).equals(j$.time.chrono.u.f20846d)) {
            return temporal.c(this.f21045a, j$.time.temporal.a.YEAR);
        }
        throw new d("Adjustment only supported on ISO date-time");
    }

    public final String toString() {
        return Integer.toString(this.f21045a);
    }
}
