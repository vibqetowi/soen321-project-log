package j$.time.chrono;

import j$.time.AbstractC0689a;
import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* renamed from: j$.time.chrono.i  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0700i implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f20818e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a  reason: collision with root package name */
    private final n f20819a;

    /* renamed from: b  reason: collision with root package name */
    final int f20820b;

    /* renamed from: c  reason: collision with root package name */
    final int f20821c;

    /* renamed from: d  reason: collision with root package name */
    final int f20822d;

    static {
        AbstractC0689a.l(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0700i(n nVar, int i6, int i10, int i11) {
        Objects.requireNonNull(nVar, "chrono");
        this.f20819a = nVar;
        this.f20820b = i6;
        this.f20821c = i10;
        this.f20822d = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f20819a.k());
        dataOutput.writeInt(this.f20820b);
        dataOutput.writeInt(this.f20821c);
        dataOutput.writeInt(this.f20822d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0700i) {
            C0700i c0700i = (C0700i) obj;
            if (this.f20820b == c0700i.f20820b && this.f20821c == c0700i.f20821c && this.f20822d == c0700i.f20822d) {
                if (((AbstractC0692a) this.f20819a).equals(c0700i.f20819a)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC0692a) this.f20819a).hashCode() ^ (Integer.rotateLeft(this.f20822d, 16) + (Integer.rotateLeft(this.f20821c, 8) + this.f20820b));
    }

    public final String toString() {
        int i6 = this.f20822d;
        int i10 = this.f20821c;
        int i11 = this.f20820b;
        boolean z10 = i11 == 0 && i10 == 0 && i6 == 0;
        n nVar = this.f20819a;
        if (z10) {
            String k10 = ((AbstractC0692a) nVar).k();
            return k10 + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((AbstractC0692a) nVar).k());
        sb2.append(" P");
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('Y');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        if (i6 != 0) {
            sb2.append(i6);
            sb2.append('D');
        }
        return sb2.toString();
    }

    protected Object writeReplace() {
        return new G((byte) 9, this);
    }
}
