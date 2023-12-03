package j$.time;

import com.theinnerhour.b2b.utils.Constants;
import j$.time.chrono.AbstractC0693b;
import j$.time.chrono.InterfaceC0694c;
import j$.time.chrono.InterfaceC0697f;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class j implements Temporal, j$.time.temporal.m, InterfaceC0694c, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final j f20964d = h0(-999999999, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    public static final j f20965e = h0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a  reason: collision with root package name */
    private final int f20966a;

    /* renamed from: b  reason: collision with root package name */
    private final short f20967b;

    /* renamed from: c  reason: collision with root package name */
    private final short f20968c;

    static {
        h0(1970, 1, 1);
    }

    private j(int i6, int i10, int i11) {
        this.f20966a = i6;
        this.f20967b = (short) i10;
        this.f20968c = (short) i11;
    }

    private static j U(int i6, int i10, int i11) {
        int i12 = 28;
        if (i11 > 28) {
            if (i10 != 2) {
                i12 = (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
            } else if (j$.time.chrono.u.f20846d.R(i6)) {
                i12 = 29;
            }
            if (i11 > i12) {
                if (i11 == 29) {
                    throw new d("Invalid date 'February 29' as '" + i6 + "' is not a leap year");
                }
                String name = p.W(i10).name();
                throw new d("Invalid date '" + name + " " + i11 + "'");
            }
        }
        return new j(i6, i10, i11);
    }

    public static j V(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        j jVar = (j) lVar.J(j$.time.temporal.o.f());
        if (jVar != null) {
            return jVar;
        }
        String name = lVar.getClass().getName();
        throw new d("Unable to obtain LocalDate from TemporalAccessor: " + lVar + " of type " + name);
    }

    private int W(j$.time.temporal.p pVar) {
        int i6;
        int i10 = i.f20962a[((j$.time.temporal.a) pVar).ordinal()];
        int i11 = this.f20966a;
        short s10 = this.f20968c;
        switch (i10) {
            case 1:
                return s10;
            case 2:
                return Y();
            case 3:
                i6 = (s10 - 1) / 7;
                break;
            case 4:
                return i11 >= 1 ? i11 : 1 - i11;
            case 5:
                return X().getValue();
            case 6:
                i6 = (s10 - 1) % 7;
                break;
            case 7:
                return ((Y() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Y() - 1) / 7) + 1;
            case 10:
                return this.f20967b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i11;
            case 13:
                return i11 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
        }
        return i6 + 1;
    }

    private long a0() {
        return ((this.f20966a * 12) + this.f20967b) - 1;
    }

    private long f0(j jVar) {
        return (((jVar.a0() * 32) + jVar.f20968c) - ((a0() * 32) + this.f20968c)) / 32;
    }

    public static j g0(AbstractC0691c abstractC0691c) {
        Objects.requireNonNull(abstractC0691c, "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId a10 = abstractC0691c.a();
        Objects.requireNonNull(ofEpochMilli, "instant");
        Objects.requireNonNull(a10, "zone");
        return j0(AbstractC0689a.n(ofEpochMilli.V() + a10.getRules().getOffset(ofEpochMilli).c0(), 86400));
    }

    public static j h0(int i6, int i10, int i11) {
        j$.time.temporal.a.YEAR.U(i6);
        j$.time.temporal.a.MONTH_OF_YEAR.U(i10);
        j$.time.temporal.a.DAY_OF_MONTH.U(i11);
        return U(i6, i10, i11);
    }

    public static j i0(int i6, p pVar, int i10) {
        j$.time.temporal.a.YEAR.U(i6);
        Objects.requireNonNull(pVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.U(i10);
        return U(i6, pVar.getValue(), i10);
    }

    public static j j0(long j10) {
        long j11;
        j$.time.temporal.a.EPOCH_DAY.U(j10);
        long j12 = (j10 + 719528) - 60;
        if (j12 < 0) {
            long j13 = ((j12 + 1) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i6 = (int) j15;
        int i10 = ((i6 * 5) + 2) / 153;
        return new j(j$.time.temporal.a.YEAR.T(j14 + j11 + (i10 / 10)), ((i10 + 2) % 12) + 1, (i6 - (((i10 * 306) + 5) / 10)) + 1);
    }

    public static j k0(int i6, int i10) {
        long j10 = i6;
        j$.time.temporal.a.YEAR.U(j10);
        j$.time.temporal.a.DAY_OF_YEAR.U(i10);
        boolean R = j$.time.chrono.u.f20846d.R(j10);
        if (i10 == 366 && !R) {
            throw new d("Invalid date 'DayOfYear 366' as '" + i6 + "' is not a leap year");
        }
        p W = p.W(((i10 - 1) / 31) + 1);
        if (i10 > (W.U(R) + W.T(R)) - 1) {
            W = W.X();
        }
        return new j(i6, W.getValue(), (i10 - W.T(R)) + 1);
    }

    private static j q0(int i6, int i10, int i11) {
        int i12;
        if (i10 != 2) {
            if (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) {
                i12 = 30;
            }
            return new j(i6, i10, i11);
        }
        i12 = j$.time.chrono.u.f20846d.R((long) i6) ? 29 : 28;
        i11 = Math.min(i11, i12);
        return new j(i6, i10, i11);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 3, this);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final InterfaceC0694c A(v vVar) {
        if (vVar instanceof v) {
            return n0(vVar.e()).m0(vVar.b());
        }
        Objects.requireNonNull(vVar, "amountToAdd");
        return (j) vVar.a(this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.EPOCH_DAY ? H() : pVar == j$.time.temporal.a.PROLEPTIC_MONTH ? a0() : W(pVar) : pVar.G(this);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final long H() {
        long j10;
        long j11 = this.f20966a;
        long j12 = this.f20967b;
        long j13 = (365 * j11) + 0;
        if (j11 >= 0) {
            j10 = ((j11 + 399) / 400) + (((3 + j11) / 4) - ((99 + j11) / 100)) + j13;
        } else {
            j10 = j13 - ((j11 / (-400)) + ((j11 / (-4)) - (j11 / (-100))));
        }
        long j14 = (((367 * j12) - 362) / 12) + j10 + (this.f20968c - 1);
        if (j12 > 2) {
            j14--;
            if (!t()) {
                j14--;
            }
        }
        return j14 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final InterfaceC0697f I(n nVar) {
        return LocalDateTime.c0(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.o.f() ? this : AbstractC0693b.l(this, rVar);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final j$.time.chrono.o L() {
        return this.f20966a >= 1 ? j$.time.chrono.v.CE : j$.time.chrono.v.BCE;
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final int P() {
        return t() ? 366 : 365;
    }

    @Override // java.lang.Comparable
    /* renamed from: Q */
    public final int compareTo(InterfaceC0694c interfaceC0694c) {
        return interfaceC0694c instanceof j ? T((j) interfaceC0694c) : AbstractC0693b.d(this, interfaceC0694c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int T(j jVar) {
        int i6 = this.f20966a - jVar.f20966a;
        if (i6 == 0) {
            int i10 = this.f20967b - jVar.f20967b;
            return i10 == 0 ? this.f20968c - jVar.f20968c : i10;
        }
        return i6;
    }

    public final f X() {
        return f.T(((int) AbstractC0689a.m(H() + 3, 7)) + 1);
    }

    public final int Y() {
        return (p.W(this.f20967b).T(t()) + this.f20968c) - 1;
    }

    public final int Z() {
        return this.f20967b;
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final j$.time.chrono.n a() {
        return j$.time.chrono.u.f20846d;
    }

    public final int b0() {
        return this.f20966a;
    }

    public final boolean c0(j jVar) {
        return jVar instanceof j ? T(jVar) < 0 : H() < jVar.H();
    }

    public final int d0() {
        short s10 = this.f20967b;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : t() ? 29 : 28;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return AbstractC0693b.j(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e0 */
    public final j g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && T((j) obj) == 0;
    }

    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        long H;
        long j10;
        j V = V(temporal);
        if (sVar instanceof ChronoUnit) {
            switch (i.f20963b[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return V.H() - H();
                case 2:
                    H = V.H() - H();
                    j10 = 7;
                    break;
                case 3:
                    return f0(V);
                case 4:
                    H = f0(V);
                    j10 = 12;
                    break;
                case 5:
                    H = f0(V);
                    j10 = 120;
                    break;
                case 6:
                    H = f0(V);
                    j10 = 1200;
                    break;
                case 7:
                    H = f0(V);
                    j10 = 12000;
                    break;
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return V.G(aVar) - G(aVar);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
            return H / j10;
        }
        return sVar.between(this, V);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final int hashCode() {
        int i6 = this.f20966a;
        return (((i6 << 11) + (this.f20967b << 6)) + this.f20968c) ^ (i6 & (-2048));
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? W(pVar) : j$.time.temporal.o.a(this, pVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: l0 */
    public final j d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            switch (i.f20963b[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return m0(j10);
                case 2:
                    return o0(j10);
                case 3:
                    return n0(j10);
                case 4:
                    return p0(j10);
                case 5:
                    return p0(AbstractC0689a.o(j10, 10));
                case 6:
                    return p0(AbstractC0689a.o(j10, 100));
                case 7:
                    return p0(AbstractC0689a.o(j10, 1000));
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return c(AbstractC0689a.j(G(aVar), j10), aVar);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (j) sVar.l(this, j10);
    }

    public final j m0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = this.f20968c + j10;
        if (j11 > 0) {
            short s10 = this.f20967b;
            int i6 = this.f20966a;
            if (j11 <= 28) {
                return new j(i6, s10, (int) j11);
            }
            if (j11 <= 59) {
                long d02 = d0();
                if (j11 <= d02) {
                    return new j(i6, s10, (int) j11);
                }
                if (s10 < 12) {
                    return new j(i6, s10 + 1, (int) (j11 - d02));
                }
                int i10 = i6 + 1;
                j$.time.temporal.a.YEAR.U(i10);
                return new j(i10, 1, (int) (j11 - d02));
            }
        }
        return j0(AbstractC0689a.j(H(), j10));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        int d02;
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (aVar.isDateBased()) {
                int i6 = i.f20962a[aVar.ordinal()];
                if (i6 == 1) {
                    d02 = d0();
                } else if (i6 != 2) {
                    if (i6 == 3) {
                        return j$.time.temporal.u.j(1L, (p.W(this.f20967b) != p.FEBRUARY || t()) ? 5L : 4L);
                    } else if (i6 != 4) {
                        return pVar.n();
                    } else {
                        return j$.time.temporal.u.j(1L, this.f20966a <= 0 ? 1000000000L : 999999999L);
                    }
                } else {
                    d02 = P();
                }
                return j$.time.temporal.u.j(1L, d02);
            }
            throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
        }
        return pVar.m(this);
    }

    public final j n0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f20966a * 12) + (this.f20967b - 1) + j10;
        long j12 = 12;
        return q0(j$.time.temporal.a.YEAR.T(AbstractC0689a.n(j11, j12)), ((int) AbstractC0689a.m(j11, j12)) + 1, this.f20968c);
    }

    public final j o0(long j10) {
        return m0(AbstractC0689a.o(j10, 7));
    }

    public final j p0(long j10) {
        return j10 == 0 ? this : q0(j$.time.temporal.a.YEAR.T(this.f20966a + j10), this.f20967b, this.f20968c);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        return AbstractC0693b.a(this, temporal);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: r0 */
    public final j c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            aVar.U(j10);
            int i6 = i.f20962a[aVar.ordinal()];
            short s10 = this.f20967b;
            short s11 = this.f20968c;
            int i10 = this.f20966a;
            switch (i6) {
                case 1:
                    int i11 = (int) j10;
                    return s11 == i11 ? this : h0(i10, s10, i11);
                case 2:
                    return t0((int) j10);
                case 3:
                    return o0(j10 - G(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (i10 < 1) {
                        j10 = 1 - j10;
                    }
                    return u0((int) j10);
                case 5:
                    return m0(j10 - X().getValue());
                case 6:
                    return m0(j10 - G(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return m0(j10 - G(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return j0(j10);
                case 9:
                    return o0(j10 - G(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    int i12 = (int) j10;
                    if (s10 == i12) {
                        return this;
                    }
                    j$.time.temporal.a.MONTH_OF_YEAR.U(i12);
                    return q0(i10, i12, s11);
                case 11:
                    return n0(j10 - a0());
                case 12:
                    return u0((int) j10);
                case 13:
                    return G(j$.time.temporal.a.ERA) == j10 ? this : u0(1 - i10);
                default:
                    throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
            }
        }
        return (j) pVar.J(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: s0 */
    public final j m(j$.time.temporal.m mVar) {
        return mVar instanceof j ? (j) mVar : (j) mVar.r(this);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final boolean t() {
        return j$.time.chrono.u.f20846d.R(this.f20966a);
    }

    public final j t0(int i6) {
        return Y() == i6 ? this : k0(this.f20966a, i6);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final String toString() {
        int i6;
        int i10 = this.f20966a;
        int abs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
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
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        }
        short s10 = this.f20967b;
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        short s11 = this.f20968c;
        sb2.append(s11 >= 10 ? "-" : "-0");
        sb2.append((int) s11);
        return sb2.toString();
    }

    public final j u0(int i6) {
        if (this.f20966a == i6) {
            return this;
        }
        j$.time.temporal.a.YEAR.U(i6);
        return q0(i6, this.f20967b, this.f20968c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f20966a);
        dataOutput.writeByte(this.f20967b);
        dataOutput.writeByte(this.f20968c);
    }
}
