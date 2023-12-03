package j$.time.zone;

import j$.time.AbstractC0689a;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0693b;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a  reason: collision with root package name */
    private final long f21061a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalDateTime f21062b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneOffset f21063c;

    /* renamed from: d  reason: collision with root package name */
    private final ZoneOffset f21064d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f21061a = j10;
        this.f21062b = LocalDateTime.ofEpochSecond(j10, 0, zoneOffset);
        this.f21063c = zoneOffset;
        this.f21064d = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f21061a = AbstractC0693b.p(localDateTime, zoneOffset);
        this.f21062b = localDateTime;
        this.f21063c = zoneOffset;
        this.f21064d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final ZoneOffset G() {
        return this.f21063c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List J() {
        return T() ? Collections.emptyList() : AbstractC0689a.l(new Object[]{this.f21063c, this.f21064d});
    }

    public final long S() {
        return this.f21061a;
    }

    public final boolean T() {
        return this.f21064d.c0() > this.f21063c.c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(DataOutput dataOutput) {
        a.c(this.f21061a, dataOutput);
        a.d(this.f21063c, dataOutput);
        a.d(this.f21064d, dataOutput);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f21061a, ((b) obj).f21061a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f21061a == bVar.f21061a && this.f21063c.equals(bVar.f21063c) && this.f21064d.equals(bVar.f21064d);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f21062b.hashCode() ^ this.f21063c.hashCode()) ^ Integer.rotateLeft(this.f21064d.hashCode(), 16);
    }

    public final LocalDateTime l() {
        return this.f21062b.f0(this.f21064d.c0() - this.f21063c.c0());
    }

    public final LocalDateTime m() {
        return this.f21062b;
    }

    public final j$.time.g n() {
        return j$.time.g.r(this.f21064d.c0() - this.f21063c.c0());
    }

    public final ZoneOffset r() {
        return this.f21064d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(T() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f21062b);
        sb2.append(this.f21063c);
        sb2.append(" to ");
        sb2.append(this.f21064d);
        sb2.append(']');
        return sb2.toString();
    }
}
