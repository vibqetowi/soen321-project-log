package j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;
/* loaded from: classes3.dex */
public final class g implements Comparable, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final g f20957c = new g(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a  reason: collision with root package name */
    private final long f20958a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20959b;

    static {
        BigInteger.valueOf(1000000000L);
    }

    private g(long j10, int i6) {
        this.f20958a = j10;
        this.f20959b = i6;
    }

    public static g G(long j10, long j11) {
        return l(AbstractC0689a.j(j10, AbstractC0689a.n(j11, 1000000000L)), (int) AbstractC0689a.m(j11, 1000000000L));
    }

    private static g l(long j10, int i6) {
        return (((long) i6) | j10) == 0 ? f20957c : new g(j10, i6);
    }

    public static g n(long j10) {
        long j11 = j10 / 1000000000;
        int i6 = (int) (j10 % 1000000000);
        if (i6 < 0) {
            i6 = (int) (i6 + 1000000000);
            j11--;
        }
        return l(j11, i6);
    }

    public static g r(long j10) {
        return l(j10, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 1, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(DataOutput dataOutput) {
        dataOutput.writeLong(this.f20958a);
        dataOutput.writeInt(this.f20959b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        int compare = Long.compare(this.f20958a, gVar.f20958a);
        return compare != 0 ? compare : this.f20959b - gVar.f20959b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f20958a == gVar.f20958a && this.f20959b == gVar.f20959b;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f20958a;
        return (this.f20959b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final long m() {
        return this.f20958a;
    }

    public final String toString() {
        if (this == f20957c) {
            return "PT0S";
        }
        long j10 = this.f20958a;
        int i6 = this.f20959b;
        long j11 = (j10 >= 0 || i6 <= 0) ? j10 : 1 + j10;
        long j12 = j11 / 3600;
        int i10 = (int) ((j11 % 3600) / 60);
        int i11 = (int) (j11 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j12 != 0) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i11 == 0 && i6 == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (j10 >= 0 || i6 <= 0 || i11 != 0) {
            sb2.append(i11);
        } else {
            sb2.append("-0");
        }
        if (i6 > 0) {
            int length = sb2.length();
            sb2.append(j10 < 0 ? 2000000000 - i6 : i6 + 1000000000);
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }
}
