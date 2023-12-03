package j$.time.temporal;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
/* loaded from: classes3.dex */
final class q implements r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21014a;

    public /* synthetic */ q(int i6) {
        this.f21014a = i6;
    }

    public final ZoneId a(l lVar) {
        r rVar = o.f21008a;
        switch (this.f21014a) {
            case 0:
                return (ZoneId) lVar.J(rVar);
            default:
                ZoneId zoneId = (ZoneId) lVar.J(rVar);
                return zoneId != null ? zoneId : (ZoneId) lVar.J(o.f21011d);
        }
    }

    @Override // j$.time.temporal.r
    public final Object i(l lVar) {
        switch (this.f21014a) {
            case 0:
                return a(lVar);
            case 1:
                return (j$.time.chrono.n) lVar.J(o.f21009b);
            case 2:
                return (s) lVar.J(o.f21010c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (lVar.e(aVar)) {
                    return ZoneOffset.f0(lVar.l(aVar));
                }
                return null;
            case 4:
                return a(lVar);
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (lVar.e(aVar2)) {
                    return j$.time.j.j0(lVar.G(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (lVar.e(aVar3)) {
                    return j$.time.n.c0(lVar.G(aVar3));
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f21014a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
