package vu;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: locks.kt */
/* loaded from: classes2.dex */
public class b implements k {

    /* renamed from: u  reason: collision with root package name */
    public final Lock f36138u;

    public /* synthetic */ b(int i6) {
        this(new ReentrantLock());
    }

    @Override // vu.k
    public void lock() {
        this.f36138u.lock();
    }

    @Override // vu.k
    public final void unlock() {
        this.f36138u.unlock();
    }

    public b(Lock lock) {
        kotlin.jvm.internal.i.g(lock, "lock");
        this.f36138u = lock;
    }
}
