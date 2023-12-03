package j$.time.chrono;

import j$.time.temporal.Temporal;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class A implements o, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final A f20794d;

    /* renamed from: e  reason: collision with root package name */
    private static final A[] f20795e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a  reason: collision with root package name */
    private final transient int f20796a;

    /* renamed from: b  reason: collision with root package name */
    private final transient j$.time.j f20797b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f20798c;

    static {
        A a10 = new A(-1, j$.time.j.h0(1868, 1, 1), "Meiji");
        f20794d = a10;
        A a11 = new A(0, j$.time.j.h0(1912, 7, 30), "Taisho");
        A a12 = new A(1, j$.time.j.h0(1926, 12, 25), "Showa");
        A a13 = new A(2, j$.time.j.h0(1989, 1, 8), "Heisei");
        A a14 = new A(3, j$.time.j.h0(2019, 5, 1), "Reiwa");
        f20795e = r8;
        A[] aArr = {a10, a11, a12, a13, a14};
    }

    private A(int i6, j$.time.j jVar, String str) {
        this.f20796a = i6;
        this.f20797b = jVar;
        this.f20798c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A j(j$.time.j jVar) {
        A a10;
        if (jVar.c0(z.f20851d)) {
            throw new j$.time.d("JapaneseDate before Meiji 6 are not supported");
        }
        A[] aArr = f20795e;
        int length = aArr.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            a10 = aArr[length];
        } while (jVar.compareTo(a10.f20797b) < 0);
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A k() {
        A[] aArr = f20795e;
        return aArr[aArr.length - 1];
    }

    public static A q(int i6) {
        int i10 = (i6 + 2) - 1;
        if (i10 >= 0) {
            A[] aArr = f20795e;
            if (i10 < aArr.length) {
                return aArr[i10];
            }
        }
        throw new j$.time.d("Invalid era: " + i6);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long u() {
        A[] aArr;
        long f = j$.time.temporal.a.DAY_OF_YEAR.n().f();
        for (A a10 : f20795e) {
            f = Math.min(f, (a10.f20797b.P() - a10.f20797b.Y()) + 1);
            if (a10.p() != null) {
                f = Math.min(f, a10.p().f20797b.Y() - 1);
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long w() {
        int b02 = (999999999 - k().f20797b.b0()) + 1;
        A[] aArr = f20795e;
        int b03 = aArr[0].f20797b.b0();
        for (int i6 = 1; i6 < aArr.length; i6++) {
            A a10 = aArr[i6];
            b02 = Math.min(b02, (a10.f20797b.b0() - b03) + 1);
            b03 = a10.f20797b.b0();
        }
        return b02;
    }

    private Object writeReplace() {
        return new G((byte) 5, this);
    }

    public static A[] x() {
        A[] aArr = f20795e;
        return (A[]) Arrays.copyOf(aArr, aArr.length);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ long G(j$.time.temporal.p pVar) {
        return AbstractC0693b.i(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object J(j$.time.temporal.r rVar) {
        return AbstractC0693b.o(this, rVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean e(j$.time.temporal.p pVar) {
        return AbstractC0693b.k(this, pVar);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return this.f20796a;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return AbstractC0693b.h(this, (j$.time.temporal.a) pVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u n(j$.time.temporal.p pVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return pVar == aVar ? x.f20849d.u(aVar) : j$.time.temporal.o.d(this, pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.j o() {
        return this.f20797b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final A p() {
        if (this == k()) {
            return null;
        }
        return q(this.f20796a + 1);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal r(Temporal temporal) {
        return AbstractC0693b.c(this, temporal);
    }

    public final String toString() {
        return this.f20798c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(DataOutput dataOutput) {
        dataOutput.writeByte(this.f20796a);
    }
}
