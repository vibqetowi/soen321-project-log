package iv;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: ArrayChannel.kt */
/* loaded from: classes2.dex */
public final class d<E> extends a<E> {
    public Object[] A;
    public int B;
    private volatile /* synthetic */ int size;

    /* renamed from: x  reason: collision with root package name */
    public final int f20735x;

    /* renamed from: y  reason: collision with root package name */
    public final e f20736y;

    /* renamed from: z  reason: collision with root package name */
    public final ReentrantLock f20737z;

    public d(int i6, e eVar, ss.l<? super E, hs.k> lVar) {
        super(lVar);
        this.f20735x = i6;
        this.f20736y = eVar;
        if (i6 >= 1) {
            this.f20737z = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i6, 8)];
            is.i.N1(objArr, tr.r.f33546d0);
            this.A = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(defpackage.c.q("ArrayChannel capacity must be at least 1, but ", i6, " was specified").toString());
    }

    @Override // iv.b
    public final Object c(w wVar) {
        ReentrantLock reentrantLock = this.f20737z;
        reentrantLock.lock();
        try {
            return super.c(wVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // iv.b
    public final String d() {
        StringBuilder sb2 = new StringBuilder("(buffer:capacity=");
        sb2.append(this.f20735x);
        sb2.append(",size=");
        return defpackage.c.s(sb2, this.size, ')');
    }

    @Override // iv.b
    public final boolean i() {
        return false;
    }

    @Override // iv.b
    public final boolean j() {
        if (this.size == this.f20735x && this.f20736y == e.SUSPEND) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0038 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    @Override // iv.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(E e10) {
        kotlinx.coroutines.internal.r rVar;
        t<E> m10;
        ReentrantLock reentrantLock = this.f20737z;
        reentrantLock.lock();
        try {
            int i6 = this.size;
            k<?> e11 = e();
            if (e11 != null) {
                return e11;
            }
            int i10 = this.f20735x;
            kotlinx.coroutines.internal.r rVar2 = tr.r.e0;
            if (i6 < i10) {
                this.size = i6 + 1;
            } else {
                int ordinal = this.f20736y.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            rVar = rVar2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    rVar = tr.r.f33547f0;
                }
                if (rVar == null) {
                    return rVar;
                }
                if (i6 == 0) {
                    do {
                        m10 = m();
                        if (m10 != null) {
                            if (m10 instanceof k) {
                                this.size = i6;
                                return m10;
                            }
                        }
                    } while (m10.b(e10) == null);
                    this.size = i6;
                    hs.k kVar = hs.k.f19476a;
                    reentrantLock.unlock();
                    m10.j(e10);
                    return m10.c();
                }
                y(i6, e10);
                return rVar2;
            }
            rVar = null;
            if (rVar == null) {
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // iv.a
    public final boolean p(r<? super E> rVar) {
        ReentrantLock reentrantLock = this.f20737z;
        reentrantLock.lock();
        try {
            return super.p(rVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // iv.a
    public final boolean s() {
        return false;
    }

    @Override // iv.a
    public final boolean t() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    @Override // iv.a
    public final boolean u() {
        ReentrantLock reentrantLock = this.f20737z;
        reentrantLock.lock();
        try {
            return super.u();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // iv.a
    public final void v(boolean z10) {
        ss.l<E, hs.k> lVar = this.f20731u;
        ReentrantLock reentrantLock = this.f20737z;
        reentrantLock.lock();
        try {
            int i6 = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i10 = 0; i10 < i6; i10++) {
                Object obj = this.A[this.B];
                kotlinx.coroutines.internal.r rVar = tr.r.f33546d0;
                if (lVar != null && obj != rVar) {
                    undeliveredElementException = kc.f.l(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.A;
                int i11 = this.B;
                objArr[i11] = rVar;
                this.B = (i11 + 1) % objArr.length;
            }
            this.size = 0;
            hs.k kVar = hs.k.f19476a;
            reentrantLock.unlock();
            super.v(z10);
            if (undeliveredElementException == null) {
                return;
            }
            throw undeliveredElementException;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // iv.a
    public final Object x() {
        Object obj;
        u uVar;
        boolean z10;
        ReentrantLock reentrantLock = this.f20737z;
        reentrantLock.lock();
        try {
            int i6 = this.size;
            Object obj2 = tr.r.f33548g0;
            if (i6 == 0) {
                k<?> e10 = e();
                if (e10 != null) {
                    obj2 = e10;
                }
                return obj2;
            }
            Object[] objArr = this.A;
            int i10 = this.B;
            Object obj3 = objArr[i10];
            u uVar2 = null;
            objArr[i10] = null;
            this.size = i6 - 1;
            if (i6 == this.f20735x) {
                while (true) {
                    uVar = o();
                    if (uVar == null) {
                        break;
                    } else if (uVar.E() != null) {
                        obj = uVar.C();
                        z10 = true;
                        break;
                    } else {
                        uVar.F();
                        uVar2 = uVar;
                    }
                }
            }
            obj = obj2;
            uVar = uVar2;
            z10 = false;
            if (obj != obj2 && !(obj instanceof k)) {
                this.size = i6;
                Object[] objArr2 = this.A;
                objArr2[(this.B + i6) % objArr2.length] = obj;
            }
            this.B = (this.B + 1) % this.A.length;
            hs.k kVar = hs.k.f19476a;
            if (z10) {
                kotlin.jvm.internal.i.d(uVar);
                uVar.B();
            }
            return obj3;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void y(int i6, E e10) {
        int i10 = this.f20735x;
        if (i6 < i10) {
            Object[] objArr = this.A;
            if (i6 >= objArr.length) {
                int min = Math.min(objArr.length * 2, i10);
                Object[] objArr2 = new Object[min];
                for (int i11 = 0; i11 < i6; i11++) {
                    Object[] objArr3 = this.A;
                    objArr2[i11] = objArr3[(this.B + i11) % objArr3.length];
                }
                Arrays.fill(objArr2, i6, min, tr.r.f33546d0);
                this.A = objArr2;
                this.B = 0;
            }
            Object[] objArr4 = this.A;
            objArr4[(this.B + i6) % objArr4.length] = e10;
            return;
        }
        Object[] objArr5 = this.A;
        int i12 = this.B;
        objArr5[i12 % objArr5.length] = null;
        objArr5[(i6 + i12) % objArr5.length] = e10;
        this.B = (i12 + 1) % objArr5.length;
    }
}
