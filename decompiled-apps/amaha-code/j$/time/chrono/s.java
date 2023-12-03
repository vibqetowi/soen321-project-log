package j$.time.chrono;

import j$.time.AbstractC0689a;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
/* loaded from: classes3.dex */
public final class s extends AbstractC0696e {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a  reason: collision with root package name */
    private final transient q f20841a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f20842b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f20843c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f20844d;

    private s(q qVar, int i6, int i10, int i11) {
        qVar.Z(i6, i10, i11);
        this.f20841a = qVar;
        this.f20842b = i6;
        this.f20843c = i10;
        this.f20844d = i11;
    }

    private s(q qVar, long j10) {
        int[] a02 = qVar.a0((int) j10);
        this.f20841a = qVar;
        this.f20842b = a02[0];
        this.f20843c = a02[1];
        this.f20844d = a02[2];
    }

    private int Y() {
        return this.f20841a.Y(this.f20842b, this.f20843c) + this.f20844d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s Z(q qVar, int i6, int i10, int i11) {
        return new s(qVar, i6, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s a0(q qVar, long j10) {
        return new s(qVar, j10);
    }

    private s d0(int i6, int i10, int i11) {
        q qVar = this.f20841a;
        int d02 = qVar.d0(i6, i10);
        if (i11 > d02) {
            i11 = d02;
        }
        return new s(qVar, i6, i10, i11);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final InterfaceC0694c A(j$.time.v vVar) {
        return (s) super.A(vVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final InterfaceC0694c C(j$.time.temporal.m mVar) {
        return (s) super.m(mVar);
    }

    @Override // j$.time.temporal.l
    public final long G(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i6 = r.f20840a[((j$.time.temporal.a) pVar).ordinal()];
            int i10 = this.f20843c;
            int i11 = this.f20842b;
            int i12 = this.f20844d;
            switch (i6) {
                case 1:
                    return i12;
                case 2:
                    return Y();
                case 3:
                    return ((i12 - 1) / 7) + 1;
                case 4:
                    return ((int) AbstractC0689a.m(H() + 3, 7)) + 1;
                case 5:
                    return ((i12 - 1) % 7) + 1;
                case 6:
                    return ((Y() - 1) % 7) + 1;
                case 7:
                    return H();
                case 8:
                    return ((Y() - 1) / 7) + 1;
                case 9:
                    return i10;
                case 10:
                    return ((i11 * 12) + i10) - 1;
                case 11:
                    return i11;
                case 12:
                    return i11;
                case 13:
                    return i11 <= 1 ? 0 : 1;
                default:
                    throw new j$.time.temporal.t(j$.time.e.a("Unsupported field: ", pVar));
            }
        }
        return pVar.G(this);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final long H() {
        return this.f20841a.Z(this.f20842b, this.f20843c, this.f20844d);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final InterfaceC0697f I(j$.time.n nVar) {
        return C0699h.V(this, nVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final o L() {
        return t.AH;
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final int P() {
        return this.f20841a.e0(this.f20842b);
    }

    @Override // j$.time.chrono.AbstractC0696e
    final InterfaceC0694c X(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = this.f20842b + ((int) j10);
        int i6 = (int) j11;
        if (j11 == i6) {
            return d0(i6, this.f20843c, this.f20844d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.InterfaceC0694c
    public final n a() {
        return this.f20841a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0696e
    /* renamed from: b0 */
    public final s V(long j10) {
        return new s(this.f20841a, H() + j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0696e
    /* renamed from: c0 */
    public final s W(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.f20842b * 12) + (this.f20843c - 1) + j10;
        long n10 = AbstractC0689a.n(j11, 12L);
        q qVar = this.f20841a;
        if (n10 < qVar.c0() || n10 > qVar.b0()) {
            throw new j$.time.d("Invalid Hijrah year: " + n10);
        }
        return d0((int) n10, ((int) AbstractC0689a.m(j11, 12L)) + 1, this.f20844d);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public final InterfaceC0694c d(long j10, j$.time.temporal.s sVar) {
        return (s) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public final Temporal d(long j10, j$.time.temporal.s sVar) {
        return (s) super.d(j10, sVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    /* renamed from: e0 */
    public final s c(long j10, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            q qVar = this.f20841a;
            qVar.u(aVar).b(j10, aVar);
            int i6 = (int) j10;
            int i10 = r.f20840a[aVar.ordinal()];
            int i11 = this.f20844d;
            int i12 = this.f20843c;
            int i13 = this.f20842b;
            switch (i10) {
                case 1:
                    return d0(i13, i12, i6);
                case 2:
                    return V(Math.min(i6, P()) - Y());
                case 3:
                    return V((j10 - G(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 4:
                    return V(j10 - (((int) AbstractC0689a.m(H() + 3, 7)) + 1));
                case 5:
                    return V(j10 - G(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 6:
                    return V(j10 - G(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 7:
                    return new s(qVar, j10);
                case 8:
                    return V((j10 - G(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 9:
                    return d0(i13, i6, i11);
                case 10:
                    return W(j10 - (((i13 * 12) + i12) - 1));
                case 11:
                    if (i13 < 1) {
                        i6 = 1 - i6;
                    }
                    return d0(i6, i12, i11);
                case 12:
                    return d0(i6, i12, i11);
                case 13:
                    return d0(1 - i13, i12, i11);
                default:
                    throw new j$.time.temporal.t(j$.time.e.a("Unsupported field: ", pVar));
            }
        }
        return (s) super.c(j10, pVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f20842b == sVar.f20842b && this.f20843c == sVar.f20843c && this.f20844d == sVar.f20844d && this.f20841a.equals(sVar.f20841a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public final InterfaceC0694c g(long j10, ChronoUnit chronoUnit) {
        return (s) super.g(j10, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c, j$.time.temporal.Temporal
    public final Temporal g(long j10, ChronoUnit chronoUnit) {
        return (s) super.g(j10, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final int hashCode() {
        int hashCode = this.f20841a.k().hashCode();
        int i6 = this.f20842b;
        return (hashCode ^ (i6 & (-2048))) ^ (((i6 << 11) + (this.f20843c << 6)) + this.f20844d);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.temporal.Temporal
    public final Temporal m(j$.time.j jVar) {
        return (s) super.m(jVar);
    }

    @Override // j$.time.chrono.AbstractC0696e, j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        int d02;
        long j10;
        if (pVar instanceof j$.time.temporal.a) {
            if (AbstractC0693b.j(this, pVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
                int i6 = r.f20840a[aVar.ordinal()];
                q qVar = this.f20841a;
                if (i6 == 1) {
                    d02 = qVar.d0(this.f20842b, this.f20843c);
                } else if (i6 != 2) {
                    if (i6 != 3) {
                        return qVar.u(aVar);
                    }
                    j10 = 5;
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

    @Override // j$.time.chrono.AbstractC0696e, j$.time.chrono.InterfaceC0694c
    public final boolean t() {
        return this.f20841a.R(this.f20842b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f20841a);
        objectOutput.writeInt(j$.time.temporal.o.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.o.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.o.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }
}
