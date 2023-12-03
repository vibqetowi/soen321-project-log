package j$.time;

import j$.time.temporal.Temporal;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* loaded from: classes3.dex */
public final class ZoneOffset extends ZoneId implements j$.time.temporal.l, j$.time.temporal.m, Comparable<ZoneOffset> {
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b  reason: collision with root package name */
    private final int f20787b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f20788c;

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap f20784d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap f20785e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = f0(0);
    public static final ZoneOffset f = f0(-64800);

    /* renamed from: g  reason: collision with root package name */
    public static final ZoneOffset f20786g = f0(64800);

    private ZoneOffset(int i6) {
        String sb2;
        this.f20787b = i6;
        if (i6 == 0) {
            sb2 = "Z";
        } else {
            int abs = Math.abs(i6);
            StringBuilder sb3 = new StringBuilder();
            int i10 = abs / 3600;
            int i11 = (abs / 60) % 60;
            sb3.append(i6 < 0 ? "-" : "+");
            sb3.append(i10 < 10 ? "0" : "");
            sb3.append(i10);
            sb3.append(i11 < 10 ? ":0" : ":");
            sb3.append(i11);
            int i12 = abs % 60;
            if (i12 != 0) {
                sb3.append(i12 >= 10 ? ":" : ":0");
                sb3.append(i12);
            }
            sb2 = sb3.toString();
        }
        this.f20788c = sb2;
    }

    public static ZoneOffset b0(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) lVar.J(j$.time.temporal.o.i());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        String name = lVar.getClass().getName();
        throw new d("Unable to obtain ZoneOffset from TemporalAccessor: " + lVar + " of type " + name);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZoneOffset d0(String str) {
        int g02;
        int i6;
        int i10;
        char charAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) f20785e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else if (length != 3) {
            if (length == 5) {
                g02 = g0(str, 1, false);
                i6 = g0(str, 3, false);
            } else if (length != 6) {
                if (length == 7) {
                    g02 = g0(str, 1, false);
                    i6 = g0(str, 3, false);
                    i10 = g0(str, 5, false);
                } else if (length != 9) {
                    throw new d("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                } else {
                    g02 = g0(str, 1, false);
                    i6 = g0(str, 4, true);
                    i10 = g0(str, 7, true);
                }
                charAt = str.charAt(0);
                if (charAt != '+' || charAt == '-') {
                    return charAt == '-' ? e0(-g02, -i6, -i10) : e0(g02, i6, i10);
                }
                throw new d("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            } else {
                g02 = g0(str, 1, false);
                i6 = g0(str, 4, true);
            }
            i10 = 0;
            charAt = str.charAt(0);
            if (charAt != '+') {
            }
            if (charAt == '-') {
            }
        }
        g02 = g0(str, 1, false);
        i6 = 0;
        i10 = 0;
        charAt = str.charAt(0);
        if (charAt != '+') {
        }
        if (charAt == '-') {
        }
    }

    public static ZoneOffset e0(int i6, int i10, int i11) {
        if (i6 < -18 || i6 > 18) {
            throw new d("Zone offset hours not in valid range: value " + i6 + " is not in the range -18 to 18");
        }
        if (i6 > 0) {
            if (i10 < 0 || i11 < 0) {
                throw new d("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i6 < 0) {
            if (i10 > 0 || i11 > 0) {
                throw new d("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i10 > 0 && i11 < 0) || (i10 < 0 && i11 > 0)) {
            throw new d("Zone offset minutes and seconds must have the same sign");
        }
        if (i10 < -59 || i10 > 59) {
            throw new d("Zone offset minutes not in valid range: value " + i10 + " is not in the range -59 to 59");
        } else if (i11 < -59 || i11 > 59) {
            throw new d("Zone offset seconds not in valid range: value " + i11 + " is not in the range -59 to 59");
        } else if (Math.abs(i6) != 18 || (i10 | i11) == 0) {
            return f0((i10 * 60) + (i6 * 3600) + i11);
        } else {
            throw new d("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static ZoneOffset f0(int i6) {
        if (i6 < -64800 || i6 > 64800) {
            throw new d("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i6 % 900 == 0) {
            Integer valueOf = Integer.valueOf(i6);
            ConcurrentHashMap concurrentHashMap = f20784d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset == null) {
                concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i6));
                ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
                f20785e.putIfAbsent(zoneOffset2.f20788c, zoneOffset2);
                return zoneOffset2;
            }
            return zoneOffset;
        }
        return new ZoneOffset(i6);
    }

    private static int g0(CharSequence charSequence, int i6, boolean z10) {
        if (z10 && charSequence.charAt(i6 - 1) != ':') {
            throw new d("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i6);
        char charAt2 = charSequence.charAt(i6 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new d("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset h0(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? f0(dataInput.readInt()) : f0(readByte * 900);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 8, this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f20787b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
        }
        return pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        return (rVar == j$.time.temporal.o.i() || rVar == j$.time.temporal.o.k()) ? this : j$.time.temporal.o.c(this, rVar);
    }

    @Override // j$.time.ZoneId
    final void Z(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        i0(dataOutput);
    }

    public final int a0(ZoneOffset zoneOffset) {
        return zoneOffset.f20787b - this.f20787b;
    }

    public final int c0() {
        return this.f20787b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f20787b - this.f20787b;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.l(this);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f20787b == ((ZoneOffset) obj).f20787b;
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        return ZoneRules.i(this);
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f20787b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i0(DataOutput dataOutput) {
        int i6 = this.f20787b;
        int i10 = i6 % 900 == 0 ? i6 / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(i6);
        }
    }

    @Override // j$.time.ZoneId
    public final String k() {
        return this.f20788c;
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f20787b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
        }
        return j$.time.temporal.o.d(this, pVar).a(G(pVar), pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        return j$.time.temporal.o.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        return temporal.c(this.f20787b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f20788c;
    }
}
