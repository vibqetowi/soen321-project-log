package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.u;
import j$.time.j;
import j$.time.n;
import j$.time.p;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes3.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a  reason: collision with root package name */
    private final p f21067a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f21068b;

    /* renamed from: c  reason: collision with root package name */
    private final j$.time.f f21069c;

    /* renamed from: d  reason: collision with root package name */
    private final n f21070d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f21071e;
    private final d f;

    /* renamed from: g  reason: collision with root package name */
    private final ZoneOffset f21072g;

    /* renamed from: h  reason: collision with root package name */
    private final ZoneOffset f21073h;

    /* renamed from: i  reason: collision with root package name */
    private final ZoneOffset f21074i;

    e(p pVar, int i6, j$.time.f fVar, n nVar, boolean z10, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f21067a = pVar;
        this.f21068b = (byte) i6;
        this.f21069c = fVar;
        this.f21070d = nVar;
        this.f21071e = z10;
        this.f = dVar;
        this.f21072g = zoneOffset;
        this.f21073h = zoneOffset2;
        this.f21074i = zoneOffset3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e b(DataInput dataInput) {
        int readInt = dataInput.readInt();
        p W = p.W(readInt >>> 28);
        int i6 = ((264241152 & readInt) >>> 22) - 32;
        int i10 = (3670016 & readInt) >>> 19;
        j$.time.f T = i10 == 0 ? null : j$.time.f.T(i10);
        int i11 = (507904 & readInt) >>> 14;
        d dVar = d.values()[(readInt & 12288) >>> 12];
        int i12 = (readInt & 4080) >>> 4;
        int i13 = (readInt & 12) >>> 2;
        int i14 = readInt & 3;
        n d02 = i11 == 31 ? n.d0(dataInput.readInt()) : n.a0(i11 % 24);
        ZoneOffset f02 = ZoneOffset.f0(i12 == 255 ? dataInput.readInt() : (i12 - 128) * 900);
        ZoneOffset f03 = i13 == 3 ? ZoneOffset.f0(dataInput.readInt()) : ZoneOffset.f0((i13 * 1800) + f02.c0());
        ZoneOffset f04 = i14 == 3 ? ZoneOffset.f0(dataInput.readInt()) : ZoneOffset.f0((i14 * 1800) + f02.c0());
        boolean z10 = i11 == 24;
        Objects.requireNonNull(W, "month");
        Objects.requireNonNull(d02, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(f02, "standardOffset");
        Objects.requireNonNull(f03, "offsetBefore");
        Objects.requireNonNull(f04, "offsetAfter");
        if (i6 < -28 || i6 > 31 || i6 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (!z10 || d02.equals(n.f20973g)) {
            if (d02.Y() == 0) {
                return new e(W, i6, T, d02, z10, dVar, f02, f03, f04);
            }
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final b a(int i6) {
        j i02;
        j$.time.temporal.n nVar;
        int c0;
        ZoneOffset zoneOffset;
        j$.time.f fVar = this.f21069c;
        p pVar = this.f21067a;
        byte b10 = this.f21068b;
        if (b10 < 0) {
            i02 = j.i0(i6, pVar, pVar.U(u.f20846d.R(i6)) + 1 + b10);
            if (fVar != null) {
                nVar = new j$.time.temporal.n(fVar.getValue(), 1);
                i02 = i02.m(nVar);
            }
        } else {
            i02 = j.i0(i6, pVar, b10);
            if (fVar != null) {
                nVar = new j$.time.temporal.n(fVar.getValue(), 0);
                i02 = i02.m(nVar);
            }
        }
        if (this.f21071e) {
            i02 = i02.m0(1L);
        }
        LocalDateTime c02 = LocalDateTime.c0(i02, this.f21070d);
        d dVar = this.f;
        dVar.getClass();
        int i10 = c.f21065a[dVar.ordinal()];
        ZoneOffset zoneOffset2 = this.f21073h;
        if (i10 != 1) {
            if (i10 == 2) {
                c0 = zoneOffset2.c0();
                zoneOffset = this.f21072g;
            }
            return new b(c02, zoneOffset2, this.f21074i);
        }
        c0 = zoneOffset2.c0();
        zoneOffset = ZoneOffset.UTC;
        c02 = c02.f0(c0 - zoneOffset.c0());
        return new b(c02, zoneOffset2, this.f21074i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(DataOutput dataOutput) {
        n nVar = this.f21070d;
        boolean z10 = this.f21071e;
        int l02 = z10 ? 86400 : nVar.l0();
        int c0 = this.f21072g.c0();
        ZoneOffset zoneOffset = this.f21073h;
        int c02 = zoneOffset.c0() - c0;
        ZoneOffset zoneOffset2 = this.f21074i;
        int c03 = zoneOffset2.c0() - c0;
        int X = l02 % 3600 == 0 ? z10 ? 24 : nVar.X() : 31;
        int i6 = c0 % 900 == 0 ? (c0 / 900) + 128 : 255;
        int i10 = (c02 == 0 || c02 == 1800 || c02 == 3600) ? c02 / 1800 : 3;
        int i11 = (c03 == 0 || c03 == 1800 || c03 == 3600) ? c03 / 1800 : 3;
        j$.time.f fVar = this.f21069c;
        dataOutput.writeInt((this.f21067a.getValue() << 28) + ((this.f21068b + 32) << 22) + ((fVar == null ? 0 : fVar.getValue()) << 19) + (X << 14) + (this.f.ordinal() << 12) + (i6 << 4) + (i10 << 2) + i11);
        if (X == 31) {
            dataOutput.writeInt(l02);
        }
        if (i6 == 255) {
            dataOutput.writeInt(c0);
        }
        if (i10 == 3) {
            dataOutput.writeInt(zoneOffset.c0());
        }
        if (i11 == 3) {
            dataOutput.writeInt(zoneOffset2.c0());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f21067a == eVar.f21067a && this.f21068b == eVar.f21068b && this.f21069c == eVar.f21069c && this.f == eVar.f && this.f21070d.equals(eVar.f21070d) && this.f21071e == eVar.f21071e && this.f21072g.equals(eVar.f21072g) && this.f21073h.equals(eVar.f21073h) && this.f21074i.equals(eVar.f21074i);
        }
        return false;
    }

    public final int hashCode() {
        int l02 = ((this.f21070d.l0() + (this.f21071e ? 1 : 0)) << 15) + (this.f21067a.ordinal() << 11) + ((this.f21068b + 32) << 5);
        j$.time.f fVar = this.f21069c;
        return ((this.f21072g.hashCode() ^ (this.f.ordinal() + (l02 + ((fVar == null ? 7 : fVar.ordinal()) << 2)))) ^ this.f21073h.hashCode()) ^ this.f21074i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f21073h;
        ZoneOffset zoneOffset2 = this.f21074i;
        sb2.append(zoneOffset.a0(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb2.append(zoneOffset);
        sb2.append(" to ");
        sb2.append(zoneOffset2);
        sb2.append(", ");
        byte b10 = this.f21068b;
        p pVar = this.f21067a;
        j$.time.f fVar = this.f21069c;
        if (fVar == null) {
            sb2.append(pVar.name());
            sb2.append(' ');
            sb2.append((int) b10);
        } else if (b10 == -1) {
            sb2.append(fVar.name());
            sb2.append(" on or before last day of ");
            sb2.append(pVar.name());
        } else if (b10 < 0) {
            sb2.append(fVar.name());
            sb2.append(" on or before last day minus ");
            sb2.append((-b10) - 1);
            sb2.append(" of ");
            sb2.append(pVar.name());
        } else {
            sb2.append(fVar.name());
            sb2.append(" on or after ");
            sb2.append(pVar.name());
            sb2.append(' ');
            sb2.append((int) b10);
        }
        sb2.append(" at ");
        sb2.append(this.f21071e ? "24:00" : this.f21070d.toString());
        sb2.append(" ");
        sb2.append(this.f);
        sb2.append(", standard offset ");
        sb2.append(this.f21072g);
        sb2.append(']');
        return sb2.toString();
    }
}
