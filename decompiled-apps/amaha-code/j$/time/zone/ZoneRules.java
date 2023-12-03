package j$.time.zone;

import j$.time.AbstractC0689a;
import j$.time.AbstractC0691c;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0693b;
import j$.time.j;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
/* loaded from: classes3.dex */
public final class ZoneRules implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final long[] f21048i = new long[0];

    /* renamed from: j  reason: collision with root package name */
    private static final e[] f21049j = new e[0];

    /* renamed from: k  reason: collision with root package name */
    private static final LocalDateTime[] f21050k = new LocalDateTime[0];

    /* renamed from: l  reason: collision with root package name */
    private static final b[] f21051l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a  reason: collision with root package name */
    private final long[] f21052a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset[] f21053b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f21054c;

    /* renamed from: d  reason: collision with root package name */
    private final LocalDateTime[] f21055d;

    /* renamed from: e  reason: collision with root package name */
    private final ZoneOffset[] f21056e;
    private final e[] f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeZone f21057g;

    /* renamed from: h  reason: collision with root package name */
    private final transient ConcurrentHashMap f21058h = new ConcurrentHashMap();

    private ZoneRules(ZoneOffset zoneOffset) {
        this.f21053b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f21048i;
        this.f21052a = jArr;
        this.f21054c = jArr;
        this.f21055d = f21050k;
        this.f21056e = zoneOffsetArr;
        this.f = f21049j;
        this.f21057g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneRules(TimeZone timeZone) {
        this.f21053b = r0;
        ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        long[] jArr = f21048i;
        this.f21052a = jArr;
        this.f21054c = jArr;
        this.f21055d = f21050k;
        this.f21056e = zoneOffsetArr;
        this.f = f21049j;
        this.f21057g = timeZone;
    }

    private ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        LocalDateTime m10;
        this.f21052a = jArr;
        this.f21053b = zoneOffsetArr;
        this.f21054c = jArr2;
        this.f21056e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.f21055d = f21050k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            while (i6 < jArr2.length) {
                int i10 = i6 + 1;
                b bVar = new b(jArr2[i6], zoneOffsetArr2[i6], zoneOffsetArr2[i10]);
                if (bVar.T()) {
                    arrayList.add(bVar.m());
                    m10 = bVar.l();
                } else {
                    arrayList.add(bVar.l());
                    m10 = bVar.m();
                }
                arrayList.add(m10);
                i6 = i10;
            }
            this.f21055d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f21057g = null;
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime m10 = bVar.m();
        boolean T = bVar.T();
        boolean Z = localDateTime.Z(m10);
        return T ? Z ? bVar.G() : localDateTime.Z(bVar.l()) ? bVar : bVar.r() : !Z ? bVar.r() : localDateTime.Z(bVar.l()) ? bVar.G() : bVar;
    }

    private b[] b(int i6) {
        long j10;
        Integer valueOf = Integer.valueOf(i6);
        ConcurrentHashMap concurrentHashMap = this.f21058h;
        b[] bVarArr = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f21057g;
        if (timeZone == null) {
            e[] eVarArr = this.f;
            b[] bVarArr2 = new b[eVarArr.length];
            for (int i10 = 0; i10 < eVarArr.length; i10++) {
                bVarArr2[i10] = eVarArr[i10].a(i6);
            }
            if (i6 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = f21051l;
        if (i6 < 1800) {
            return bVarArr3;
        }
        long p10 = AbstractC0693b.p(LocalDateTime.a0(i6 - 1), this.f21053b[0]);
        int offset = timeZone.getOffset(p10 * 1000);
        long j11 = 31968000 + p10;
        while (p10 < j11) {
            long j12 = 7776000 + p10;
            long j13 = p10;
            if (offset != timeZone.getOffset(j12 * 1000)) {
                p10 = j13;
                while (j12 - p10 > 1) {
                    int i11 = offset;
                    long j14 = j11;
                    long n10 = AbstractC0689a.n(j12 + p10, 2L);
                    if (timeZone.getOffset(n10 * 1000) == i11) {
                        p10 = n10;
                    } else {
                        j12 = n10;
                    }
                    offset = i11;
                    j11 = j14;
                }
                j10 = j11;
                int i12 = offset;
                if (timeZone.getOffset(p10 * 1000) == i12) {
                    p10 = j12;
                }
                ZoneOffset j15 = j(i12);
                offset = timeZone.getOffset(p10 * 1000);
                ZoneOffset j16 = j(offset);
                if (c(p10, j16) == i6) {
                    bVarArr3 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new b(p10, j15, j16);
                }
            } else {
                j10 = j11;
                p10 = j12;
            }
            j11 = j10;
        }
        if (1916 <= i6 && i6 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j10, ZoneOffset zoneOffset) {
        return j.j0(AbstractC0689a.n(j10 + zoneOffset.c0(), 86400)).b0();
    }

    private Object d(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f21053b;
        int i6 = 0;
        TimeZone timeZone = this.f21057g;
        if (timeZone != null) {
            b[] b10 = b(localDateTime.X());
            if (b10.length == 0) {
                return j(timeZone.getOffset(AbstractC0693b.p(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = b10.length;
            while (i6 < length) {
                b bVar = b10[i6];
                Object a10 = a(localDateTime, bVar);
                if ((a10 instanceof b) || a10.equals(bVar.G())) {
                    return a10;
                }
                i6++;
                obj = a10;
            }
            return obj;
        } else if (this.f21054c.length == 0) {
            return zoneOffsetArr[0];
        } else {
            int length2 = this.f.length;
            LocalDateTime[] localDateTimeArr = this.f21055d;
            if (length2 > 0 && localDateTime.Y(localDateTimeArr[localDateTimeArr.length - 1])) {
                b[] b11 = b(localDateTime.X());
                int length3 = b11.length;
                while (i6 < length3) {
                    b bVar2 = b11[i6];
                    Object a11 = a(localDateTime, bVar2);
                    if ((a11 instanceof b) || a11.equals(bVar2.G())) {
                        return a11;
                    }
                    i6++;
                    obj = a11;
                }
                return obj;
            }
            int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
            ZoneOffset[] zoneOffsetArr2 = this.f21056e;
            if (binarySearch == -1) {
                return zoneOffsetArr2[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else if (binarySearch < localDateTimeArr.length - 1) {
                int i10 = binarySearch + 1;
                if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i10])) {
                    binarySearch = i10;
                }
            }
            if ((binarySearch & 1) == 0) {
                LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
                LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
                int i11 = binarySearch / 2;
                ZoneOffset zoneOffset = zoneOffsetArr2[i11];
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i11 + 1];
                return zoneOffset2.c0() > zoneOffset.c0() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
            }
            return zoneOffsetArr2[(binarySearch / 2) + 1];
        }
    }

    public static ZoneRules i(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new ZoneRules(zoneOffset);
    }

    private static ZoneOffset j(int i6) {
        return ZoneOffset.f0(i6 / 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneRules k(DataInput dataInput) {
        int readInt = dataInput.readInt();
        long[] jArr = f21048i;
        long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
        for (int i6 = 0; i6 < readInt; i6++) {
            jArr2[i6] = a.a(dataInput);
        }
        int i10 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            zoneOffsetArr[i11] = a.b(dataInput);
        }
        int readInt2 = dataInput.readInt();
        if (readInt2 != 0) {
            jArr = new long[readInt2];
        }
        long[] jArr3 = jArr;
        for (int i12 = 0; i12 < readInt2; i12++) {
            jArr3[i12] = a.a(dataInput);
        }
        int i13 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            zoneOffsetArr2[i14] = a.b(dataInput);
        }
        int readByte = dataInput.readByte();
        e[] eVarArr = readByte == 0 ? f21049j : new e[readByte];
        for (int i15 = 0; i15 < readByte; i15++) {
            eVarArr[i15] = e.b(dataInput);
        }
        return new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f21057g != null ? (byte) 100 : (byte) 1, this);
    }

    public final b e(LocalDateTime localDateTime) {
        Object d10 = d(localDateTime);
        if (d10 instanceof b) {
            return (b) d10;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRules) {
            ZoneRules zoneRules = (ZoneRules) obj;
            return Objects.equals(this.f21057g, zoneRules.f21057g) && Arrays.equals(this.f21052a, zoneRules.f21052a) && Arrays.equals(this.f21053b, zoneRules.f21053b) && Arrays.equals(this.f21054c, zoneRules.f21054c) && Arrays.equals(this.f21056e, zoneRules.f21056e) && Arrays.equals(this.f, zoneRules.f);
        }
        return false;
    }

    public final List f(LocalDateTime localDateTime) {
        Object d10 = d(localDateTime);
        return d10 instanceof b ? ((b) d10).J() : Collections.singletonList((ZoneOffset) d10);
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.f21057g;
        if (timeZone != null) {
            zoneOffset = j(timeZone.getRawOffset());
        } else {
            int length = this.f21054c.length;
            ZoneOffset[] zoneOffsetArr = this.f21053b;
            if (length == 0) {
                zoneOffset = zoneOffsetArr[0];
            } else {
                int binarySearch = Arrays.binarySearch(this.f21052a, instant.V());
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                }
                zoneOffset = zoneOffsetArr[binarySearch + 1];
            }
        }
        return !zoneOffset.equals(getOffset(instant));
    }

    public ZoneOffset getOffset(Instant instant) {
        TimeZone timeZone = this.f21057g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.c0()));
        }
        long[] jArr = this.f21054c;
        if (jArr.length == 0) {
            return this.f21053b[0];
        }
        long V = instant.V();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.f21056e;
        if (length <= 0 || V <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, V);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return zoneOffsetArr[binarySearch + 1];
        }
        b[] b10 = b(c(V, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i6 = 0; i6 < b10.length; i6++) {
            bVar = b10[i6];
            if (V < bVar.S()) {
                return bVar.G();
            }
        }
        return bVar.r();
    }

    public final boolean h() {
        b bVar;
        TimeZone timeZone = this.f21057g;
        if (timeZone == null) {
            return this.f21054c.length == 0;
        } else if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
            return false;
        } else {
            Instant now = Instant.now();
            long V = now.V();
            if (now.W() > 0 && V < Long.MAX_VALUE) {
                V++;
            }
            int c10 = c(V, getOffset(now));
            b[] b10 = b(c10);
            int length = b10.length - 1;
            while (true) {
                if (length < 0) {
                    if (c10 > 1800) {
                        b[] b11 = b(c10 - 1);
                        int length2 = b11.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                int offset = timeZone.getOffset((V - 1) * 1000);
                                long H = j.h0(1800, 1, 1).H() * 86400;
                                for (long min = Math.min(V - 31104000, (AbstractC0691c.d().b() / 1000) + 31968000); H <= min; min -= 7776000) {
                                    int offset2 = timeZone.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int c11 = c(min, j(offset2));
                                        b[] b12 = b(c11 + 1);
                                        int length3 = b12.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                b[] b13 = b(c11);
                                                bVar = b13[b13.length - 1];
                                                break;
                                            } else if (V > b12[length3].S()) {
                                                bVar = b12[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    }
                                }
                            } else if (V > b11[length2].S()) {
                                bVar = b11[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                    bVar = null;
                } else if (V > b10[length].S()) {
                    bVar = b10[length];
                    break;
                } else {
                    length--;
                }
            }
            return bVar == null;
        }
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f21057g) ^ Arrays.hashCode(this.f21052a)) ^ Arrays.hashCode(this.f21053b)) ^ Arrays.hashCode(this.f21054c)) ^ Arrays.hashCode(this.f21056e)) ^ Arrays.hashCode(this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(DataOutput dataOutput) {
        long[] jArr = this.f21052a;
        dataOutput.writeInt(jArr.length);
        for (long j10 : jArr) {
            a.c(j10, dataOutput);
        }
        for (ZoneOffset zoneOffset : this.f21053b) {
            a.d(zoneOffset, dataOutput);
        }
        long[] jArr2 = this.f21054c;
        dataOutput.writeInt(jArr2.length);
        for (long j11 : jArr2) {
            a.c(j11, dataOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f21056e) {
            a.d(zoneOffset2, dataOutput);
        }
        e[] eVarArr = this.f;
        dataOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.c(dataOutput);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f21057g.getID());
    }

    public final String toString() {
        StringBuilder sb2;
        TimeZone timeZone = this.f21057g;
        if (timeZone != null) {
            String id2 = timeZone.getID();
            sb2 = new StringBuilder("ZoneRules[timeZone=");
            sb2.append(id2);
        } else {
            ZoneOffset[] zoneOffsetArr = this.f21053b;
            ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
            sb2 = new StringBuilder("ZoneRules[currentStandardOffset=");
            sb2.append(zoneOffset);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
