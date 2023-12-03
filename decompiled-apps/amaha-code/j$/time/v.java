package j$.time;

import j$.time.chrono.InterfaceC0694c;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public final class v implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final v f21036d = new v(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a  reason: collision with root package name */
    private final int f21037a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21038b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21039c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        AbstractC0689a.l(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    private v(int i6, int i10, int i11) {
        this.f21037a = i6;
        this.f21038b = i10;
        this.f21039c = i11;
    }

    public static v c(int i6) {
        return (0 | i6) == 0 ? f21036d : new v(0, 0, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v d(DataInput dataInput) {
        int readInt = dataInput.readInt();
        int readInt2 = dataInput.readInt();
        int readInt3 = dataInput.readInt();
        return ((readInt | readInt2) | readInt3) == 0 ? f21036d : new v(readInt, readInt2, readInt3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 14, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Temporal a(InterfaceC0694c interfaceC0694c) {
        long e10;
        ChronoUnit chronoUnit;
        Temporal temporal;
        Objects.requireNonNull(interfaceC0694c, "temporal");
        j$.time.chrono.n nVar = (j$.time.chrono.n) interfaceC0694c.J(j$.time.temporal.o.e());
        if (nVar != null && !j$.time.chrono.u.f20846d.equals(nVar)) {
            throw new d("Chronology mismatch, expected: ISO, actual: " + nVar.k());
        } else if (this.f21038b == 0) {
            int i6 = this.f21037a;
            temporal = interfaceC0694c;
            if (i6 != 0) {
                e10 = i6;
                chronoUnit = ChronoUnit.YEARS;
                temporal = interfaceC0694c.d(e10, (j$.time.temporal.s) chronoUnit);
            }
            int i10 = this.f21039c;
            return i10 == 0 ? temporal.d(i10, ChronoUnit.DAYS) : temporal;
        } else {
            e10 = e();
            temporal = interfaceC0694c;
            if (e10 != 0) {
                chronoUnit = ChronoUnit.MONTHS;
                temporal = interfaceC0694c.d(e10, (j$.time.temporal.s) chronoUnit);
            }
            int i102 = this.f21039c;
            if (i102 == 0) {
            }
        }
    }

    public final int b() {
        return this.f21039c;
    }

    public final long e() {
        return (this.f21037a * 12) + this.f21038b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return this.f21037a == vVar.f21037a && this.f21038b == vVar.f21038b && this.f21039c == vVar.f21039c;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(DataOutput dataOutput) {
        dataOutput.writeInt(this.f21037a);
        dataOutput.writeInt(this.f21038b);
        dataOutput.writeInt(this.f21039c);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f21039c, 16) + Integer.rotateLeft(this.f21038b, 8) + this.f21037a;
    }

    public final String toString() {
        if (this == f21036d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i6 = this.f21037a;
        if (i6 != 0) {
            sb2.append(i6);
            sb2.append('Y');
        }
        int i10 = this.f21038b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i11 = this.f21039c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
