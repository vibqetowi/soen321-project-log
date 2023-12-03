package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* loaded from: classes3.dex */
public final class E extends AbstractC0696e {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a  reason: collision with root package name */
    private final transient j$.time.j f20802a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(j$.time.j jVar) {
        Objects.requireNonNull(jVar, "isoDate");
        this.f20802a = jVar;
    }

    private int Y() {
        return this.f20802a.b0() - 1911;
    }

    private E a0(j$.time.j jVar) {
        return jVar.equals(this.f20802a) ? this : new E(jVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final InterfaceC0694c A(j$.time.v vVar) {
        return (E) super.A(vVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final InterfaceC0694c C(j$.time.temporal.m mVar) {
        return (E) super.m(mVar);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = D.f20801a[((j$.time.temporal.a) pVar).ordinal()];
            if (i6 == 4) {
                int Y = Y();
                if (Y < 1) {
                    Y = 1 - Y;
                }
                return Y;
            }
            j$.time.j jVar = this.f20802a;
            if (i6 != 5) {
                if (i6 != 6) {
                    if (i6 != 7) {
                        return jVar.G(pVar);
                    }
                    return Y() < 1 ? 0 : 1;
                }
                return Y();
            }
            return ((Y() * 12) + jVar.Z()) - 1;
        }
        return pVar.G(this);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final long H() {
        return this.f20802a.H();
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final InterfaceC0697f I(j$.time.n nVar) {
        return C0699h.V(this, nVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final o L() {
        return Y() >= 1 ? F.ROC : F.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC0696e
    final InterfaceC0694c V(long j10) {
        return a0(this.f20802a.m0(j10));
    }

    @Override // j$.time.chrono.AbstractC0696e
    final InterfaceC0694c W(long j10) {
        return a0(this.f20802a.n0(j10));
    }

    @Override // j$.time.chrono.AbstractC0696e
    final InterfaceC0694c X(long j10) {
        return a0(this.f20802a.p0(j10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2 != 7) goto L13;
     */
    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (G(aVar) == j10) {
                return this;
            }
            int[] iArr = D.f20801a;
            int i6 = iArr[aVar.ordinal()];
            j$.time.j jVar = this.f20802a;
            if (i6 != 4) {
                if (i6 == 5) {
                    C.f20800d.u(aVar).b(j10, aVar);
                    return a0(jVar.n0(j10 - (((Y() * 12) + jVar.Z()) - 1)));
                } else if (i6 != 6) {
                }
            }
            int a10 = C.f20800d.u(aVar).a(j10, aVar);
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 4) {
                return a0(jVar.u0(Y() >= 1 ? a10 + 1911 : (1 - a10) + 1911));
            } else if (i10 != 6) {
                if (i10 == 7) {
                    return a0(jVar.u0((1 - Y()) + 1911));
                }
                return a0(jVar.c(j10, pVar));
            } else {
                return a0(jVar.u0(a10 + 1911));
            }
        }
        return (E) super.c(j10, pVar);
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final n a() {
        return C.f20800d;
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public final InterfaceC0694c d(long j10, j$.time.temporal.s sVar) {
        return (E) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public final Temporal d(long j10, j$.time.temporal.s sVar) {
        return (E) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            return this.f20802a.equals(((E) obj).f20802a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public final InterfaceC0694c g(long j10, ChronoUnit chronoUnit) {
        return (E) super.g(j10, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return (E) super.g(j10, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final int hashCode() {
        C.f20800d.getClass();
        return this.f20802a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.temporal.Temporal
    public final Temporal m(j$.time.j jVar) {
        return (E) super.m(jVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (AbstractC0693b.j(this, pVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
                int i6 = D.f20801a[aVar.ordinal()];
                if (i6 == 1 || i6 == 2 || i6 == 3) {
                    return this.f20802a.n(pVar);
                }
                if (i6 != 4) {
                    return C.f20800d.u(aVar);
                }
                j$.time.temporal.u n10 = j$.time.temporal.a.YEAR.n();
                return j$.time.temporal.u.j(1L, Y() <= 0 ? (-n10.e()) + 1 + 1911 : n10.d() - 1911);
            }
            throw new j$.time.temporal.t(j$.time.e.a("Unsupported field: ", pVar));
        }
        return pVar.m(this);
    }
}
