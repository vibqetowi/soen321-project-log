package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes2.dex */
public class h<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23600a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new i(8, false);

    public final boolean a(E e10) {
        while (true) {
            i iVar = (i) this._cur;
            int a10 = iVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                if (a10 == 2) {
                    return false;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23600a;
                i<E> e11 = iVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, e11) && atomicReferenceFieldUpdater.get(this) == iVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            i iVar = (i) this._cur;
            if (iVar.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23600a;
            i<E> e10 = iVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, e10) && atomicReferenceFieldUpdater.get(this) == iVar) {
            }
        }
    }

    public final int c() {
        return ((i) this._cur).c();
    }

    public final E d() {
        while (true) {
            i iVar = (i) this._cur;
            E e10 = (E) iVar.f();
            if (e10 != i.f23602g) {
                return e10;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23600a;
            i<E> e11 = iVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, e11) && atomicReferenceFieldUpdater.get(this) == iVar) {
            }
        }
    }
}
