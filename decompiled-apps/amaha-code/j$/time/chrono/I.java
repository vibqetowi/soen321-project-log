package j$.time.chrono;

import j$.time.AbstractC0689a;
import j$.time.AbstractC0691c;
import j$.time.Instant;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes3.dex */
public final class I extends AbstractC0692a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final I f20807d = new I();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private I() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c E(j$.time.temporal.l lVar) {
        return lVar instanceof K ? (K) lVar : new K(j$.time.j.V(lVar));
    }

    @Override // j$.time.chrono.AbstractC0692a, j$.time.chrono.n
    public final InterfaceC0697f K(j$.time.temporal.l lVar) {
        return super.K(lVar);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c N(int i6, int i10, int i11) {
        return new K(j$.time.j.h0(i6 - 543, i10, i11));
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0702k O(Instant instant, ZoneId zoneId) {
        return m.W(this, instant, zoneId);
    }

    @Override // j$.time.chrono.n
    public final boolean R(long j10) {
        return u.f20846d.R(j10 - 543);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c j(long j10) {
        return new K(j$.time.j.j0(j10));
    }

    @Override // j$.time.chrono.n
    public final String k() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.AbstractC0692a
    public final InterfaceC0694c n() {
        j$.time.j g02 = j$.time.j.g0(AbstractC0691c.c());
        return g02 instanceof K ? (K) g02 : new K(j$.time.j.V(g02));
    }

    @Override // j$.time.chrono.n
    public final String o() {
        return "buddhist";
    }

    @Override // j$.time.chrono.AbstractC0692a, j$.time.chrono.n
    public final InterfaceC0702k p(j$.time.temporal.l lVar) {
        return super.p(lVar);
    }

    @Override // j$.time.chrono.n
    public final InterfaceC0694c q(int i6, int i10) {
        return new K(j$.time.j.k0(i6 - 543, i10));
    }

    @Override // j$.time.chrono.n
    public final j$.time.temporal.u u(j$.time.temporal.a aVar) {
        int i6 = H.f20806a[aVar.ordinal()];
        if (i6 == 1) {
            j$.time.temporal.u n10 = j$.time.temporal.a.PROLEPTIC_MONTH.n();
            return j$.time.temporal.u.j(n10.e() + 6516, n10.d() + 6516);
        } else if (i6 == 2) {
            j$.time.temporal.u n11 = j$.time.temporal.a.YEAR.n();
            return j$.time.temporal.u.l((-(n11.e() + 543)) + 1, n11.d() + 543);
        } else if (i6 != 3) {
            return aVar.n();
        } else {
            j$.time.temporal.u n12 = j$.time.temporal.a.YEAR.n();
            return j$.time.temporal.u.j(n12.e() + 543, n12.d() + 543);
        }
    }

    @Override // j$.time.chrono.n
    public final List w() {
        return AbstractC0689a.l(L.values());
    }

    Object writeReplace() {
        return new G((byte) 1, this);
    }

    @Override // j$.time.chrono.n
    public final o x(int i6) {
        if (i6 != 0) {
            if (i6 == 1) {
                return L.BE;
            }
            throw new j$.time.d("Invalid era: " + i6);
        }
        return L.BEFORE_BE;
    }

    @Override // j$.time.chrono.AbstractC0692a, j$.time.chrono.n
    public final InterfaceC0694c y(HashMap hashMap, j$.time.format.F f) {
        return (K) super.y(hashMap, f);
    }

    @Override // j$.time.chrono.n
    public final int z(o oVar, int i6) {
        if (oVar instanceof L) {
            return oVar == L.BE ? i6 : 1 - i6;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }
}
