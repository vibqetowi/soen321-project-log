package m4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f24804a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C0401b f24805b = new C0401b();

    /* compiled from: DiskCacheWriteLocker.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ReentrantLock f24806a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f24807b;
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: m4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0401b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f24808a = new ArrayDeque();

        public final a a() {
            a aVar;
            synchronized (this.f24808a) {
                aVar = (a) this.f24808a.poll();
            }
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }

        public final void b(a aVar) {
            synchronized (this.f24808a) {
                if (this.f24808a.size() < 10) {
                    this.f24808a.offer(aVar);
                }
            }
        }
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f24804a.get(str);
            kc.f.p(obj);
            aVar = (a) obj;
            int i6 = aVar.f24807b;
            if (i6 >= 1) {
                int i10 = i6 - 1;
                aVar.f24807b = i10;
                if (i10 == 0) {
                    a aVar2 = (a) this.f24804a.remove(str);
                    if (aVar2.equals(aVar)) {
                        this.f24805b.b(aVar2);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f24807b);
            }
        }
        aVar.f24806a.unlock();
    }
}
