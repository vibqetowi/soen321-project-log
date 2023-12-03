package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.p0;
/* compiled from: SharedFlow.kt */
/* loaded from: classes2.dex */
public class t<T> extends jv.a<v> implements o<T>, d {
    public Object[] A;
    public long B;
    public long C;
    public int D;
    public int E;

    /* renamed from: x  reason: collision with root package name */
    public final int f23547x;

    /* renamed from: y  reason: collision with root package name */
    public final int f23548y;

    /* renamed from: z  reason: collision with root package name */
    public final iv.e f23549z;

    /* compiled from: SharedFlow.kt */
    /* loaded from: classes2.dex */
    public static final class a implements p0 {

        /* renamed from: u  reason: collision with root package name */
        public final t<?> f23550u;

        /* renamed from: v  reason: collision with root package name */
        public final long f23551v;

        /* renamed from: w  reason: collision with root package name */
        public final Object f23552w;

        /* renamed from: x  reason: collision with root package name */
        public final ls.d<hs.k> f23553x;

        public a(t tVar, long j10, Object obj, kotlinx.coroutines.k kVar) {
            this.f23550u = tVar;
            this.f23551v = j10;
            this.f23552w = obj;
            this.f23553x = kVar;
        }

        @Override // kotlinx.coroutines.p0
        public final void i() {
            t<?> tVar = this.f23550u;
            synchronized (tVar) {
                if (this.f23551v >= tVar.m()) {
                    Object[] objArr = tVar.A;
                    kotlin.jvm.internal.i.d(objArr);
                    int i6 = (int) this.f23551v;
                    if (objArr[(objArr.length - 1) & i6] == this) {
                        objArr[i6 & (objArr.length - 1)] = kc.f.f23217g0;
                        tVar.h();
                        hs.k kVar = hs.k.f19476a;
                    }
                }
            }
        }
    }

    public t(int i6, int i10, iv.e eVar) {
        this.f23547x = i6;
        this.f23548y = i10;
        this.f23549z = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
        throw r8.I();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ms.a i(t tVar, e eVar, ls.d dVar) {
        u uVar;
        int i6;
        v c10;
        e eVar2;
        v vVar;
        t tVar2;
        Throwable th2;
        c1 c1Var;
        e eVar3;
        Object r;
        try {
            if (dVar instanceof u) {
                uVar = (u) dVar;
                int i10 = uVar.A;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    uVar.A = i10 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = uVar.f23558y;
                    ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                    i6 = uVar.A;
                    if (i6 == 0) {
                        if (i6 != 1) {
                            if (i6 != 2 && i6 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1Var = uVar.f23557x;
                            vVar = uVar.f23556w;
                            eVar3 = uVar.f23555v;
                            tVar2 = uVar.f23554u;
                            try {
                                sp.b.d0(obj);
                                while (true) {
                                    r = tVar2.r(vVar);
                                    if (r == kc.f.f23217g0) {
                                        uVar.f23554u = tVar2;
                                        uVar.f23555v = eVar3;
                                        uVar.f23556w = vVar;
                                        uVar.f23557x = c1Var;
                                        uVar.A = 2;
                                        if (tVar2.g(vVar, uVar) == aVar) {
                                            return aVar;
                                        }
                                    } else {
                                        if (c1Var != null && !c1Var.a()) {
                                            break;
                                        }
                                        uVar.f23554u = tVar2;
                                        uVar.f23555v = eVar3;
                                        uVar.f23556w = vVar;
                                        uVar.f23557x = c1Var;
                                        uVar.A = 3;
                                        if (eVar3.b(r, uVar) == aVar) {
                                            return aVar;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                c10 = vVar;
                                th = th2;
                                tVar = tVar2;
                                tVar.f(c10);
                                throw th;
                            }
                        } else {
                            vVar = uVar.f23556w;
                            e eVar4 = uVar.f23555v;
                            t tVar3 = uVar.f23554u;
                            try {
                                sp.b.d0(obj);
                                eVar2 = eVar4;
                                tVar = tVar3;
                            } catch (Throwable th4) {
                                c10 = vVar;
                                th = th4;
                                tVar = tVar3;
                                tVar.f(c10);
                                throw th;
                            }
                        }
                    } else {
                        sp.b.d0(obj);
                        c10 = tVar.c();
                        try {
                            if (eVar instanceof a0) {
                                uVar.f23554u = tVar;
                                uVar.f23555v = eVar;
                                uVar.f23556w = c10;
                                uVar.A = 1;
                                if (((a0) eVar).a(uVar) == aVar) {
                                    return aVar;
                                }
                            }
                            eVar2 = eVar;
                            vVar = c10;
                        } catch (Throwable th5) {
                            th = th5;
                            tVar.f(c10);
                            throw th;
                        }
                    }
                    tVar2 = tVar;
                    c1Var = (c1) uVar.getContext().e(c1.b.f23496u);
                    eVar3 = eVar2;
                    while (true) {
                        r = tVar2.r(vVar);
                        if (r == kc.f.f23217g0) {
                        }
                    }
                }
            }
            tVar2 = tVar;
            c1Var = (c1) uVar.getContext().e(c1.b.f23496u);
            eVar3 = eVar2;
            while (true) {
                r = tVar2.r(vVar);
                if (r == kc.f.f23217g0) {
                }
            }
        } catch (Throwable th6) {
            tVar2 = tVar;
            th2 = th6;
            c10 = vVar;
            th = th2;
            tVar = tVar2;
            tVar.f(c10);
            throw th;
        }
        uVar = new u(tVar, dVar);
        Object obj2 = uVar.f23558y;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = uVar.A;
        if (i6 == 0) {
        }
    }

    @Override // kotlinx.coroutines.flow.s, kotlinx.coroutines.flow.d
    public final Object a(e<? super T> eVar, ls.d<?> dVar) {
        i(this, eVar, dVar);
        return ms.a.COROUTINE_SUSPENDED;
    }

    @Override // kotlinx.coroutines.flow.o, kotlinx.coroutines.flow.e
    public final Object b(T t3, ls.d<? super hs.k> dVar) {
        ls.d<hs.k>[] dVarArr;
        a aVar;
        if (o(t3)) {
            return hs.k.f19476a;
        }
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        ls.d<hs.k>[] dVarArr2 = kotlin.jvm.internal.h.N;
        synchronized (this) {
            if (p(t3)) {
                kVar.resumeWith(hs.k.f19476a);
                dVarArr = l(dVarArr2);
                aVar = null;
            } else {
                a aVar2 = new a(this, this.D + this.E + m(), t3, kVar);
                k(aVar2);
                this.E++;
                if (this.f23548y == 0) {
                    dVarArr2 = l(dVarArr2);
                }
                dVarArr = dVarArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            kVar.p(new kotlinx.coroutines.g(1, aVar));
        }
        for (ls.d<hs.k> dVar2 : dVarArr) {
            if (dVar2 != null) {
                dVar2.resumeWith(hs.k.f19476a);
            }
        }
        Object s10 = kVar.s();
        ms.a aVar3 = ms.a.COROUTINE_SUSPENDED;
        if (s10 != aVar3) {
            s10 = hs.k.f19476a;
        }
        if (s10 != aVar3) {
            return hs.k.f19476a;
        }
        return s10;
    }

    @Override // jv.a
    public final v d() {
        return new v();
    }

    @Override // jv.a
    public final jv.b[] e() {
        return new v[2];
    }

    public final Object g(v vVar, u uVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(uVar));
        kVar.u();
        synchronized (this) {
            if (q(vVar) < 0) {
                vVar.f23561b = kVar;
            } else {
                kVar.resumeWith(hs.k.f19476a);
            }
            hs.k kVar2 = hs.k.f19476a;
        }
        Object s10 = kVar.s();
        if (s10 == ms.a.COROUTINE_SUSPENDED) {
            return s10;
        }
        return hs.k.f19476a;
    }

    public final void h() {
        if (this.f23548y == 0 && this.E <= 1) {
            return;
        }
        Object[] objArr = this.A;
        kotlin.jvm.internal.i.d(objArr);
        while (this.E > 0) {
            long m10 = m();
            int i6 = this.D;
            int i10 = this.E;
            if (objArr[(objArr.length - 1) & ((int) ((m10 + (i6 + i10)) - 1))] == kc.f.f23217g0) {
                this.E = i10 - 1;
                objArr[(objArr.length - 1) & ((int) (m() + this.D + this.E))] = null;
            } else {
                return;
            }
        }
    }

    public final void j() {
        Object[] objArr;
        Object[] objArr2 = this.A;
        kotlin.jvm.internal.i.d(objArr2);
        objArr2[(objArr2.length - 1) & ((int) m())] = null;
        this.D--;
        long m10 = m() + 1;
        if (this.B < m10) {
            this.B = m10;
        }
        if (this.C < m10) {
            if (this.f22637v != 0 && (objArr = this.f22636u) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        v vVar = (v) obj;
                        long j10 = vVar.f23560a;
                        if (j10 >= 0 && j10 < m10) {
                            vVar.f23560a = m10;
                        }
                    }
                }
            }
            this.C = m10;
        }
    }

    public final void k(Object obj) {
        int i6 = this.D + this.E;
        Object[] objArr = this.A;
        if (objArr == null) {
            objArr = n(0, 2, null);
        } else if (i6 >= objArr.length) {
            objArr = n(i6, objArr.length * 2, objArr);
        }
        objArr[((int) (m() + i6)) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final ls.d<hs.k>[] l(ls.d<hs.k>[] dVarArr) {
        Object[] objArr;
        v vVar;
        kotlinx.coroutines.k kVar;
        int length = dVarArr.length;
        if (this.f22637v != 0 && (objArr = this.f22636u) != null) {
            int length2 = objArr.length;
            int i6 = 0;
            dVarArr = dVarArr;
            while (i6 < length2) {
                Object obj = objArr[i6];
                if (obj != null && (kVar = (vVar = (v) obj).f23561b) != null && q(vVar) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        kotlin.jvm.internal.i.f(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = kVar;
                    vVar.f23561b = null;
                    length++;
                }
                i6++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long m() {
        return Math.min(this.C, this.B);
    }

    public final Object[] n(int i6, int i10, Object[] objArr) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object[] objArr2 = new Object[i10];
            this.A = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m10 = m();
            for (int i11 = 0; i11 < i6; i11++) {
                int i12 = (int) (i11 + m10);
                objArr2[i12 & (i10 - 1)] = objArr[(objArr.length - 1) & i12];
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean o(T t3) {
        int i6;
        boolean z10;
        ls.d<hs.k>[] dVarArr = kotlin.jvm.internal.h.N;
        synchronized (this) {
            if (p(t3)) {
                dVarArr = l(dVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (ls.d<hs.k> dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(hs.k.f19476a);
            }
        }
        return z10;
    }

    public final boolean p(T t3) {
        int i6 = this.f22637v;
        int i10 = this.f23547x;
        if (i6 == 0) {
            if (i10 != 0) {
                k(t3);
                int i11 = this.D + 1;
                this.D = i11;
                if (i11 > i10) {
                    j();
                }
                this.C = m() + this.D;
            }
            return true;
        }
        int i12 = this.D;
        int i13 = this.f23548y;
        if (i12 >= i13 && this.C <= this.B) {
            int ordinal = this.f23549z.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        k(t3);
        int i14 = this.D + 1;
        this.D = i14;
        if (i14 > i13) {
            j();
        }
        long m10 = m() + this.D;
        long j10 = this.B;
        if (((int) (m10 - j10)) > i10) {
            s(j10 + 1, this.C, m() + this.D, m() + this.D + this.E);
        }
        return true;
    }

    public final long q(v vVar) {
        long j10 = vVar.f23560a;
        if (j10 < m() + this.D) {
            return j10;
        }
        if (this.f23548y > 0 || j10 > m() || this.E == 0) {
            return -1L;
        }
        return j10;
    }

    public final Object r(v vVar) {
        Object obj;
        ls.d<hs.k>[] dVarArr = kotlin.jvm.internal.h.N;
        synchronized (this) {
            long q10 = q(vVar);
            if (q10 < 0) {
                obj = kc.f.f23217g0;
            } else {
                long j10 = vVar.f23560a;
                Object[] objArr = this.A;
                kotlin.jvm.internal.i.d(objArr);
                Object obj2 = objArr[((int) q10) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).f23552w;
                }
                vVar.f23560a = q10 + 1;
                Object obj3 = obj2;
                dVarArr = t(j10);
                obj = obj3;
            }
        }
        for (ls.d<hs.k> dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(hs.k.f19476a);
            }
        }
        return obj;
    }

    public final void s(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long m10 = m(); m10 < min; m10++) {
            Object[] objArr = this.A;
            kotlin.jvm.internal.i.d(objArr);
            objArr[((int) m10) & (objArr.length - 1)] = null;
        }
        this.B = j10;
        this.C = j11;
        this.D = (int) (j12 - min);
        this.E = (int) (j13 - j12);
    }

    public final ls.d<hs.k>[] t(long j10) {
        int i6;
        long j11;
        long j12;
        long j13;
        boolean z10;
        long j14;
        Object[] objArr;
        long j15 = this.C;
        ls.d<hs.k>[] dVarArr = kotlin.jvm.internal.h.N;
        if (j10 > j15) {
            return dVarArr;
        }
        long m10 = m();
        long j16 = this.D + m10;
        int i10 = this.f23548y;
        if (i10 == 0 && this.E > 0) {
            j16++;
        }
        if (this.f22637v != 0 && (objArr = this.f22636u) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j17 = ((v) obj).f23560a;
                    if (j17 >= 0 && j17 < j16) {
                        j16 = j17;
                    }
                }
            }
        }
        if (j16 <= this.C) {
            return dVarArr;
        }
        long m11 = m() + this.D;
        if (this.f22637v > 0) {
            i6 = Math.min(this.E, i10 - ((int) (m11 - j16)));
        } else {
            i6 = this.E;
        }
        long j18 = this.E + m11;
        kotlinx.coroutines.internal.r rVar = kc.f.f23217g0;
        if (i6 > 0) {
            dVarArr = new ls.d[i6];
            Object[] objArr2 = this.A;
            kotlin.jvm.internal.i.d(objArr2);
            long j19 = m11;
            int i11 = 0;
            while (true) {
                if (m11 < j18) {
                    j11 = j16;
                    int i12 = (int) m11;
                    Object obj2 = objArr2[(objArr2.length - 1) & i12];
                    if (obj2 != rVar) {
                        if (obj2 != null) {
                            a aVar = (a) obj2;
                            j12 = j18;
                            int i13 = i11 + 1;
                            dVarArr[i11] = aVar.f23553x;
                            objArr2[i12 & (objArr2.length - 1)] = rVar;
                            objArr2[((int) j19) & (objArr2.length - 1)] = aVar.f23552w;
                            j14 = 1;
                            j19++;
                            if (i13 >= i6) {
                                break;
                            }
                            i11 = i13;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        }
                    } else {
                        j12 = j18;
                        j14 = 1;
                    }
                    m11 += j14;
                    j16 = j11;
                    j18 = j12;
                } else {
                    j11 = j16;
                    j12 = j18;
                    break;
                }
            }
            m11 = j19;
        } else {
            j11 = j16;
            j12 = j18;
        }
        ls.d<hs.k>[] dVarArr2 = dVarArr;
        int i14 = (int) (m11 - m10);
        if (this.f22637v == 0) {
            j13 = m11;
        } else {
            j13 = j11;
        }
        long max = Math.max(this.B, m11 - Math.min(this.f23547x, i14));
        if (i10 == 0 && max < j12) {
            Object[] objArr3 = this.A;
            kotlin.jvm.internal.i.d(objArr3);
            if (kotlin.jvm.internal.i.b(objArr3[((int) max) & (objArr3.length - 1)], rVar)) {
                m11++;
                max++;
            }
        }
        s(max, j13, m11, j12);
        h();
        if (dVarArr2.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return l(dVarArr2);
        }
        return dVarArr2;
    }
}
