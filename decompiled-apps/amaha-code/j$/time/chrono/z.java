package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* loaded from: classes3.dex */
public final class z extends AbstractC0696e {

    /* renamed from: d  reason: collision with root package name */
    static final j$.time.j f20851d = j$.time.j.h0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a  reason: collision with root package name */
    private final transient j$.time.j f20852a;

    /* renamed from: b  reason: collision with root package name */
    private transient A f20853b;

    /* renamed from: c  reason: collision with root package name */
    private transient int f20854c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(A a10, int i6, j$.time.j jVar) {
        if (jVar.c0(f20851d)) {
            throw new j$.time.d("JapaneseDate before Meiji 6 is not supported");
        }
        this.f20853b = a10;
        this.f20854c = i6;
        this.f20852a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(j$.time.j jVar) {
        if (jVar.c0(f20851d)) {
            throw new j$.time.d("JapaneseDate before Meiji 6 is not supported");
        }
        this.f20853b = A.j(jVar);
        this.f20854c = (jVar.b0() - this.f20853b.o().b0()) + 1;
        this.f20852a = jVar;
    }

    private z b0(j$.time.j jVar) {
        return jVar.equals(this.f20852a) ? this : new z(jVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final InterfaceC0694c A(j$.time.v vVar) {
        return (z) super.A(vVar);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        int Y;
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = y.f20850a[((j$.time.temporal.a) pVar).ordinal()];
            j$.time.j jVar = this.f20852a;
            switch (i6) {
                case 2:
                    if (this.f20854c != 1) {
                        Y = jVar.Y();
                        break;
                    } else {
                        Y = (jVar.Y() - this.f20853b.o().Y()) + 1;
                        break;
                    }
                case 3:
                    Y = this.f20854c;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    throw new j$.time.temporal.t(j$.time.e.a("Unsupported field: ", pVar));
                case 8:
                    Y = this.f20853b.getValue();
                    break;
                default:
                    return jVar.G(pVar);
            }
            return Y;
        }
        return pVar.G(this);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final long H() {
        return this.f20852a.H();
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final InterfaceC0697f I(j$.time.n nVar) {
        return C0699h.V(this, nVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final o L() {
        return this.f20853b;
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final int P() {
        A p10 = this.f20853b.p();
        j$.time.j jVar = this.f20852a;
        int P = (p10 == null || p10.o().b0() != jVar.b0()) ? jVar.P() : p10.o().Y() - 1;
        return this.f20854c == 1 ? P - (this.f20853b.o().Y() - 1) : P;
    }

    @Override // j$.time.chrono.AbstractC0696e
    final InterfaceC0694c V(long j10) {
        return b0(this.f20852a.m0(j10));
    }

    @Override // j$.time.chrono.AbstractC0696e
    final InterfaceC0694c W(long j10) {
        return b0(this.f20852a.n0(j10));
    }

    @Override // j$.time.chrono.AbstractC0696e
    final InterfaceC0694c X(long j10) {
        return b0(this.f20852a.p0(j10));
    }

    public final A Y() {
        return this.f20853b;
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    /* renamed from: Z */
    public final z d(long j10, j$.time.temporal.s sVar) {
        return (z) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final n a() {
        return x.f20849d;
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    /* renamed from: a0 */
    public final z c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (G(aVar) == j10) {
                return this;
            }
            int[] iArr = y.f20850a;
            int i6 = iArr[aVar.ordinal()];
            j$.time.j jVar = this.f20852a;
            if (i6 == 3 || i6 == 8 || i6 == 9) {
                x xVar = x.f20849d;
                int a10 = xVar.u(aVar).a(j10, aVar);
                int i10 = iArr[aVar.ordinal()];
                if (i10 == 3) {
                    return b0(jVar.u0(xVar.z(this.f20853b, a10)));
                }
                if (i10 == 8) {
                    return b0(jVar.u0(xVar.z(A.q(a10), this.f20854c)));
                }
                if (i10 == 9) {
                    return b0(jVar.u0(a10));
                }
            }
            return b0(jVar.c(j10, pVar));
        }
        return (z) super.c(j10, pVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.temporal.Temporal
    /* renamed from: c0 */
    public final z m(j$.time.temporal.m mVar) {
        return (z) super.m(mVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.l
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return pVar instanceof j$.time.temporal.a ? pVar.isDateBased() : pVar != null && pVar.l(this);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f20852a.equals(((z) obj).f20852a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public final InterfaceC0694c g(long j10, ChronoUnit chronoUnit) {
        return (z) super.g(j10, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return (z) super.g(j10, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final int hashCode() {
        x.f20849d.getClass();
        return this.f20852a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        int d02;
        long j10;
        if (pVar instanceof j$.time.temporal.a) {
            if (e(pVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
                int i6 = y.f20850a[aVar.ordinal()];
                if (i6 == 1) {
                    d02 = this.f20852a.d0();
                } else if (i6 != 2) {
                    if (i6 != 3) {
                        return x.f20849d.u(aVar);
                    }
                    int b02 = this.f20853b.o().b0();
                    A p10 = this.f20853b.p();
                    j10 = p10 != null ? (p10.o().b0() - b02) + 1 : 999999999 - b02;
                    return j$.time.temporal.u.j(1L, j10);
                } else {
                    d02 = P();
                }
                j10 = d02;
                return j$.time.temporal.u.j(1L, j10);
            }
            throw new j$.time.temporal.t(j$.time.e.a("Unsupported field: ", pVar));
        }
        return pVar.m(this);
    }
}
