package iv;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: ConflatedChannel.kt */
/* loaded from: classes2.dex */
public final class l<E> extends a<E> {

    /* renamed from: x  reason: collision with root package name */
    public final ReentrantLock f20753x;

    /* renamed from: y  reason: collision with root package name */
    public Object f20754y;

    public l(ss.l<? super E, hs.k> lVar) {
        super(lVar);
        this.f20753x = new ReentrantLock();
        this.f20754y = tr.r.f33546d0;
    }

    @Override // iv.b
    public final String d() {
        ReentrantLock reentrantLock = this.f20753x;
        reentrantLock.lock();
        try {
            return "(value=" + this.f20754y + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // iv.b
    public final boolean i() {
        return false;
    }

    @Override // iv.b
    public final boolean j() {
        return false;
    }

    @Override // iv.b
    public final Object k(E e10) {
        ss.l<E, hs.k> lVar;
        t<E> m10;
        ReentrantLock reentrantLock = this.f20753x;
        reentrantLock.lock();
        try {
            k<?> e11 = e();
            if (e11 != null) {
                return e11;
            }
            Object obj = this.f20754y;
            kotlinx.coroutines.internal.r rVar = tr.r.f33546d0;
            if (obj == rVar) {
                do {
                    m10 = m();
                    if (m10 != null) {
                        if (m10 instanceof k) {
                            return m10;
                        }
                    }
                } while (m10.b(e10) == null);
                hs.k kVar = hs.k.f19476a;
                reentrantLock.unlock();
                m10.j(e10);
                return m10.c();
            }
            Object obj2 = this.f20754y;
            UndeliveredElementException undeliveredElementException = null;
            if (obj2 != rVar && (lVar = this.f20731u) != null) {
                undeliveredElementException = kc.f.l(lVar, obj2, null);
            }
            this.f20754y = e10;
            if (undeliveredElementException == null) {
                return tr.r.e0;
            }
            throw undeliveredElementException;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // iv.a
    public final boolean p(r<? super E> rVar) {
        ReentrantLock reentrantLock = this.f20753x;
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
        boolean z10;
        ReentrantLock reentrantLock = this.f20753x;
        reentrantLock.lock();
        try {
            if (this.f20754y == tr.r.f33546d0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // iv.a
    public final void v(boolean z10) {
        ss.l<E, hs.k> lVar;
        ReentrantLock reentrantLock = this.f20753x;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.internal.r rVar = tr.r.f33546d0;
            Object obj = this.f20754y;
            UndeliveredElementException undeliveredElementException = null;
            if (obj != rVar && (lVar = this.f20731u) != null) {
                undeliveredElementException = kc.f.l(lVar, obj, null);
            }
            this.f20754y = rVar;
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
        ReentrantLock reentrantLock = this.f20753x;
        reentrantLock.lock();
        try {
            Object obj = this.f20754y;
            kotlinx.coroutines.internal.r rVar = tr.r.f33546d0;
            if (obj == rVar) {
                Object e10 = e();
                if (e10 == null) {
                    e10 = tr.r.f33548g0;
                }
                return e10;
            }
            this.f20754y = rVar;
            hs.k kVar = hs.k.f19476a;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
