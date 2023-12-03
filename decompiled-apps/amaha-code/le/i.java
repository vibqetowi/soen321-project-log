package le;

import ke.t;
import rf.s;
/* compiled from: NumericIncrementTransformOperation.java */
/* loaded from: classes.dex */
public final class i implements o {

    /* renamed from: a  reason: collision with root package name */
    public final s f24224a;

    public i(s sVar) {
        boolean z10;
        if (!t.j(sVar) && !t.i(sVar)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ca.a.u0(z10, "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f24224a = sVar;
    }

    @Override // le.o
    public final s a(sc.h hVar, s sVar) {
        long d02;
        s c10 = c(sVar);
        if (t.j(c10)) {
            s sVar2 = this.f24224a;
            if (t.j(sVar2)) {
                long d03 = c10.d0();
                if (t.i(sVar2)) {
                    d02 = (long) sVar2.b0();
                } else if (t.j(sVar2)) {
                    d02 = sVar2.d0();
                } else {
                    ca.a.V("Expected 'operand' to be of Number type, but was " + sVar2.getClass().getCanonicalName(), new Object[0]);
                    throw null;
                }
                long j10 = d03 + d02;
                if (((d03 ^ j10) & (d02 ^ j10)) < 0) {
                    if (j10 >= 0) {
                        j10 = Long.MIN_VALUE;
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                }
                s.a j02 = s.j0();
                j02.u();
                s.V((s) j02.f10073v, j10);
                return j02.r();
            }
        }
        if (t.j(c10)) {
            double d10 = d() + c10.d0();
            s.a j03 = s.j0();
            j03.y(d10);
            return j03.r();
        }
        ca.a.u0(t.i(c10), "Expected NumberValue to be of type DoubleValue, but was ", sVar.getClass().getCanonicalName());
        double d11 = d() + c10.b0();
        s.a j04 = s.j0();
        j04.y(d11);
        return j04.r();
    }

    @Override // le.o
    public final s c(s sVar) {
        boolean z10;
        if (!t.j(sVar) && !t.i(sVar)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            s.a j02 = s.j0();
            j02.u();
            s.V((s) j02.f10073v, 0L);
            return j02.r();
        }
        return sVar;
    }

    public final double d() {
        s sVar = this.f24224a;
        if (t.i(sVar)) {
            return sVar.b0();
        }
        if (t.j(sVar)) {
            return sVar.d0();
        }
        ca.a.V("Expected 'operand' to be of Number type, but was " + sVar.getClass().getCanonicalName(), new Object[0]);
        throw null;
    }

    @Override // le.o
    public final s b(s sVar, s sVar2) {
        return sVar2;
    }
}
