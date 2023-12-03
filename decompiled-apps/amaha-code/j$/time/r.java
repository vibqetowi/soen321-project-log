package j$.time;

import j$.time.chrono.AbstractC0692a;
import j$.time.chrono.AbstractC0693b;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class r implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a  reason: collision with root package name */
    private final int f20983a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20984b;

    static {
        j$.time.format.w wVar = new j$.time.format.w();
        wVar.f("--");
        wVar.m(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        wVar.e('-');
        wVar.m(j$.time.temporal.a.DAY_OF_MONTH, 2);
        wVar.u();
    }

    private r(int i6, int i10) {
        this.f20983a = i6;
        this.f20984b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r T(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        byte readByte2 = dataInput.readByte();
        p W = p.W(readByte);
        Objects.requireNonNull(W, "month");
        j$.time.temporal.a.DAY_OF_MONTH.U(readByte2);
        if (readByte2 <= W.V()) {
            return new r(W.getValue(), readByte2);
        }
        String name = W.name();
        throw new d("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + name);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 13, this);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        int i6;
        if (pVar instanceof j$.time.temporal.a) {
            int i10 = q.f20982a[((j$.time.temporal.a) pVar).ordinal()];
            if (i10 == 1) {
                i6 = this.f20984b;
            } else if (i10 != 2) {
                throw new j$.time.temporal.t(e.a("Unsupported field: ", pVar));
            } else {
                i6 = this.f20983a;
            }
            return i6;
        }
        return pVar.G(this);
    }

    @Override // j$.time.temporal.l
    public final Object J(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.o.e() ? j$.time.chrono.u.f20846d : j$.time.temporal.o.c(this, rVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(DataOutput dataOutput) {
        dataOutput.writeByte(this.f20983a);
        dataOutput.writeByte(this.f20984b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        int i6 = this.f20983a - rVar.f20983a;
        return i6 == 0 ? this.f20984b - rVar.f20984b : i6;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.DAY_OF_MONTH : pVar != null && pVar.l(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f20983a == rVar.f20983a && this.f20984b == rVar.f20984b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20983a << 6) + this.f20984b;
    }

    @Override // j$.time.temporal.l
    public final int l(j$.time.temporal.p pVar) {
        return n(pVar).a(G(pVar), pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.n();
        }
        if (pVar == j$.time.temporal.a.DAY_OF_MONTH) {
            int i6 = this.f20983a;
            p W = p.W(i6);
            W.getClass();
            int i10 = o.f20979a[W.ordinal()];
            return j$.time.temporal.u.l(i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : 28, p.W(i6).V());
        }
        return j$.time.temporal.o.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal r(Temporal temporal) {
        if (((AbstractC0692a) AbstractC0693b.r(temporal)).equals(j$.time.chrono.u.f20846d)) {
            Temporal c10 = temporal.c(this.f20983a, j$.time.temporal.a.MONTH_OF_YEAR);
            j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
            return c10.c(Math.min(c10.n(aVar).d(), this.f20984b), aVar);
        }
        throw new d("Adjustment only supported on ISO date-time");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        int i6 = this.f20983a;
        sb2.append(i6 < 10 ? "0" : "");
        sb2.append(i6);
        int i10 = this.f20984b;
        sb2.append(i10 < 10 ? "-0" : "-");
        sb2.append(i10);
        return sb2.toString();
    }
}
