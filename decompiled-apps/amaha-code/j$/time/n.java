package j$.time;

import j$.time.chrono.AbstractC0693b;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class n implements Temporal, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final n f20972e;
    public static final n f;

    /* renamed from: g  reason: collision with root package name */
    public static final n f20973g;

    /* renamed from: h  reason: collision with root package name */
    private static final n[] f20974h = new n[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a  reason: collision with root package name */
    private final byte f20975a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f20976b;

    /* renamed from: c  reason: collision with root package name */
    private final byte f20977c;

    /* renamed from: d  reason: collision with root package name */
    private final int f20978d;

    static {
        int i6 = 0;
        while (true) {
            n[] nVarArr = f20974h;
            if (i6 >= nVarArr.length) {
                n nVar = nVarArr[0];
                f20973g = nVar;
                n nVar2 = nVarArr[12];
                f20972e = nVar;
                f = new n(23, 59, 59, 999999999);
                return;
            }
            nVarArr[i6] = new n(i6, 0, 0, 0);
            i6++;
        }
    }

    private n(int i6, int i10, int i11, int i12) {
        this.f20975a = (byte) i6;
        this.f20976b = (byte) i10;
        this.f20977c = (byte) i11;
        this.f20978d = i12;
    }

    private static n U(int i6, int i10, int i11, int i12) {
        return ((i10 | i11) | i12) == 0 ? f20974h[i6] : new n(i6, i10, i11, i12);
    }

    public static n V(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        n nVar = (n) lVar.J(j$.time.temporal.o.g());
        if (nVar != null) {
            return nVar;
        }
        String name = lVar.getClass().getName();
        throw new d("Unable to obtain LocalTime from TemporalAccessor: " + lVar + " of type " + name);
    }

    private int W(j$.time.temporal.p pVar) {
        int i6 = m.f20970a[((j$.time.temporal.a) pVar).ordinal()];
        byte b10 = this.f20976b;
        int i10 = this.f20978d;
        byte b11 = this.f20975a;
        switch (i6) {
            case 1:
                return i10;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i10 / 1000;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i10 / 1000000;
            case 6:
                return (int) (k0() / 1000000);
            case 7:
                return this.f20977c;
            case 8:
                return l0();
            case 9:
                return b10;
            case 10:
                return (b11 * 60) + b10;
            case 11:
                return b11 % 12;
            case 12:
                int i11 = b11 % 12;
                if (i11 % 12 == 0) {
                    return 12;
                }
                return i11;
            case 13:
                return b11;
            case 14:
                if (b11 == 0) {
                    return 24;
                }
                return b11;
            case 15:
                return b11 / 12;
            default:
                throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
        }
    }

    public static n a0(int i6) {
        j$.time.temporal.a.HOUR_OF_DAY.U(i6);
        return f20974h[i6];
    }

    public static n b0(int i6, int i10, int i11, int i12) {
        j$.time.temporal.a.HOUR_OF_DAY.U(i6);
        j$.time.temporal.a.MINUTE_OF_HOUR.U(i10);
        j$.time.temporal.a.SECOND_OF_MINUTE.U(i11);
        j$.time.temporal.a.NANO_OF_SECOND.U(i12);
        return U(i6, i10, i11, i12);
    }

    public static n c0(long j10) {
        j$.time.temporal.a.NANO_OF_DAY.U(j10);
        int i6 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (i6 * 3600000000000L);
        int i10 = (int) (j11 / 60000000000L);
        long j12 = j11 - (i10 * 60000000000L);
        int i11 = (int) (j12 / 1000000000);
        return U(i6, i10, i11, (int) (j12 - (i11 * 1000000000)));
    }

    public static n d0(long j10) {
        j$.time.temporal.a.SECOND_OF_DAY.U(j10);
        int i6 = (int) (j10 / 3600);
        long j11 = j10 - (i6 * 3600);
        int i10 = (int) (j11 / 60);
        return U(i6, i10, (int) (j11 - (i10 * 60)), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    public static n j0(DataInput dataInput) {
        byte b10;
        int i6;
        byte b11;
        int readByte = dataInput.readByte();
        byte b12 = 0;
        if (readByte >= 0) {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r52 = ~readByte2;
                i6 = 0;
                b12 = r52;
                b10 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    b12 = readByte2;
                    b11 = ~readByte3;
                } else {
                    int readInt = dataInput.readInt();
                    b10 = readByte3;
                    i6 = readInt;
                    b12 = readByte2;
                }
            }
            return b0(readByte, b12, b10, i6);
        }
        readByte = ~readByte;
        b11 = 0;
        i6 = 0;
        b10 = b11;
        return b0(readByte, b12, b10, i6);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 4, this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.NANO_OF_DAY ? k0() : pVar == j$.time.temporal.a.MICRO_OF_DAY ? k0() / 1000 : W(pVar) : pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.o.e() || rVar == j$.time.temporal.o.l() || rVar == j$.time.temporal.o.k() || rVar == j$.time.temporal.o.i()) {
            return null;
        }
        if (rVar == j$.time.temporal.o.g()) {
            return this;
        }
        if (rVar == j$.time.temporal.o.f()) {
            return null;
        }
        return rVar == j$.time.temporal.o.j() ? ChronoUnit.NANOS : rVar.i(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: T */
    public final int compareTo(n nVar) {
        int compare = Integer.compare(this.f20975a, nVar.f20975a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.f20976b, nVar.f20976b);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.f20977c, nVar.f20977c);
                return compare3 == 0 ? Integer.compare(this.f20978d, nVar.f20978d) : compare3;
            }
            return compare2;
        }
        return compare;
    }

    public final int X() {
        return this.f20975a;
    }

    public final int Y() {
        return this.f20978d;
    }

    public final int Z() {
        return this.f20977c;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar.isTimeBased() : pVar != null && pVar.l(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: e0 */
    public final n d(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            switch (m.f20971b[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return h0(j10);
                case 2:
                    return h0((j10 % 86400000000L) * 1000);
                case 3:
                    return h0((j10 % 86400000) * 1000000);
                case 4:
                    return i0(j10);
                case 5:
                    return g0(j10);
                case 6:
                    return f0(j10);
                case 7:
                    return f0((j10 % 2) * 12);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (n) sVar.l(this, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f20975a == nVar.f20975a && this.f20976b == nVar.f20976b && this.f20977c == nVar.f20977c && this.f20978d == nVar.f20978d;
        }
        return false;
    }

    public final n f0(long j10) {
        if (j10 == 0) {
            return this;
        }
        return U(((((int) (j10 % 24)) + this.f20975a) + 24) % 24, this.f20976b, this.f20977c, this.f20978d);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    public final n g0(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i6 = (this.f20975a * 60) + this.f20976b;
        int i10 = ((((int) (j10 % 1440)) + i6) + 1440) % 1440;
        return i6 == i10 ? this : U(i10 / 60, i10 % 60, this.f20977c, this.f20978d);
    }

    @Override // j$.time.temporal.Temporal
    public final long h(Temporal temporal, j$.time.temporal.s sVar) {
        long j10;
        n V = V(temporal);
        if (sVar instanceof ChronoUnit) {
            long k02 = V.k0() - k0();
            switch (m.f20971b[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return k02;
                case 2:
                    j10 = 1000;
                    break;
                case 3:
                    j10 = 1000000;
                    break;
                case 4:
                    j10 = 1000000000;
                    break;
                case 5:
                    j10 = 60000000000L;
                    break;
                case 6:
                    j10 = 3600000000000L;
                    break;
                case 7:
                    j10 = 43200000000000L;
                    break;
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
            return k02 / j10;
        }
        return sVar.between(this, V);
    }

    public final n h0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long k02 = k0();
        long j11 = (((j10 % 86400000000000L) + k02) + 86400000000000L) % 86400000000000L;
        return k02 == j11 ? this : U((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
    }

    public final int hashCode() {
        long k02 = k0();
        return (int) (k02 ^ (k02 >>> 32));
    }

    public final n i0(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i6 = (this.f20976b * 60) + (this.f20975a * 3600) + this.f20977c;
        int i10 = ((((int) (j10 % 86400)) + i6) + 86400) % 86400;
        return i6 == i10 ? this : U(i10 / 3600, (i10 / 60) % 60, i10 % 60, this.f20978d);
    }

    public final long k0() {
        return (this.f20977c * 1000000000) + (this.f20976b * 60000000000L) + (this.f20975a * 3600000000000L) + this.f20978d;
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? W(pVar) : j$.time.temporal.o.a(this, pVar);
    }

    public final int l0() {
        return (this.f20976b * 60) + (this.f20975a * 3600) + this.f20977c;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal m(j jVar) {
        boolean z10 = jVar instanceof n;
        j$.time.temporal.l lVar = jVar;
        if (!z10) {
            lVar = AbstractC0693b.a(jVar, this);
        }
        return (n) lVar;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: m0 */
    public final n c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            aVar.U(j10);
            int i6 = m.f20970a[aVar.ordinal()];
            byte b10 = this.f20976b;
            byte b11 = this.f20977c;
            int i10 = this.f20978d;
            byte b12 = this.f20975a;
            switch (i6) {
                case 1:
                    return n0((int) j10);
                case 2:
                    return c0(j10);
                case 3:
                    return n0(((int) j10) * 1000);
                case 4:
                    return c0(j10 * 1000);
                case 5:
                    return n0(((int) j10) * 1000000);
                case 6:
                    return c0(j10 * 1000000);
                case 7:
                    int i11 = (int) j10;
                    if (b11 == i11) {
                        return this;
                    }
                    j$.time.temporal.a.SECOND_OF_MINUTE.U(i11);
                    return U(b12, b10, i11, i10);
                case 8:
                    return i0(j10 - l0());
                case 9:
                    int i12 = (int) j10;
                    if (b10 == i12) {
                        return this;
                    }
                    j$.time.temporal.a.MINUTE_OF_HOUR.U(i12);
                    return U(b12, i12, b11, i10);
                case 10:
                    return g0(j10 - ((b12 * 60) + b10));
                case 11:
                    return f0(j10 - (b12 % 12));
                case 12:
                    if (j10 == 12) {
                        j10 = 0;
                    }
                    return f0(j10 - (b12 % 12));
                case 13:
                    int i13 = (int) j10;
                    if (b12 == i13) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.U(i13);
                    return U(i13, b10, b11, i10);
                case 14:
                    if (j10 == 24) {
                        j10 = 0;
                    }
                    int i14 = (int) j10;
                    if (b12 == i14) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.U(i14);
                    return U(i14, b10, b11, i10);
                case 15:
                    return f0((j10 - (b12 / 12)) * 12);
                default:
                    throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
            }
        }
        return (n) pVar.J(this, j10);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return j$.time.temporal.o.d(this, pVar);
    }

    public final n n0(int i6) {
        if (this.f20978d == i6) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.U(i6);
        return U(this.f20975a, this.f20976b, this.f20977c, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o0(DataOutput dataOutput) {
        int i6;
        byte b10 = this.f20977c;
        byte b11 = this.f20976b;
        byte b12 = this.f20975a;
        int i10 = this.f20978d;
        if (i10 != 0) {
            dataOutput.writeByte(b12);
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b10);
            dataOutput.writeInt(i10);
            return;
        }
        if (b10 != 0) {
            dataOutput.writeByte(b12);
            dataOutput.writeByte(b11);
            i6 = ~b10;
        } else if (b11 == 0) {
            i6 = ~b12;
        } else {
            dataOutput.writeByte(b12);
            i6 = ~b11;
        }
        dataOutput.writeByte(i6);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        return temporal.c(k0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final String toString() {
        int i6;
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f20975a;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        byte b11 = this.f20976b;
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        byte b12 = this.f20977c;
        int i10 = this.f20978d;
        if (b12 > 0 || i10 > 0) {
            sb2.append(b12 >= 10 ? ":" : ":0");
            sb2.append((int) b12);
            if (i10 > 0) {
                sb2.append('.');
                int i11 = 1000000;
                if (i10 % 1000000 == 0) {
                    i6 = (i10 / 1000000) + 1000;
                } else {
                    if (i10 % 1000 == 0) {
                        i10 /= 1000;
                    } else {
                        i11 = 1000000000;
                    }
                    i6 = i10 + i11;
                }
                sb2.append(Integer.toString(i6).substring(1));
            }
        }
        return sb2.toString();
    }
}
