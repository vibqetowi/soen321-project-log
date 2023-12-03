package a4;

import is.u;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: IdentityManager.kt */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final i f297a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantReadWriteLock f298b;

    /* renamed from: c  reason: collision with root package name */
    public c f299c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f300d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f301e;
    public boolean f;

    public h(i identityStorage) {
        kotlin.jvm.internal.i.g(identityStorage, "identityStorage");
        this.f297a = identityStorage;
        this.f298b = new ReentrantReadWriteLock(true);
        this.f299c = new c(null, null);
        this.f300d = new Object();
        this.f301e = new LinkedHashSet();
        a(identityStorage.a(), k.Initialized);
    }

    /* JADX WARN: Finally extract failed */
    @Override // a4.g
    public final void a(c identity, k updateType) {
        int i6;
        Set<f> M2;
        kotlin.jvm.internal.i.g(identity, "identity");
        kotlin.jvm.internal.i.g(updateType, "updateType");
        c c10 = c();
        ReentrantReadWriteLock reentrantReadWriteLock = this.f298b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i6 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i6 = 0;
        }
        for (int i11 = 0; i11 < i6; i11++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f299c = identity;
            if (updateType == k.Initialized) {
                this.f = true;
            }
            hs.k kVar = hs.k.f19476a;
            while (i10 < i6) {
                readLock.lock();
                i10++;
            }
            writeLock.unlock();
            if (!kotlin.jvm.internal.i.b(identity, c10)) {
                synchronized (this.f300d) {
                    M2 = u.M2(this.f301e);
                }
                if (updateType != k.Initialized) {
                    if (!kotlin.jvm.internal.i.b(identity.f287a, c10.f287a)) {
                        this.f297a.c(identity.f287a);
                    }
                    if (!kotlin.jvm.internal.i.b(identity.f288b, c10.f288b)) {
                        this.f297a.b(identity.f288b);
                    }
                }
                for (f fVar : M2) {
                    if (!kotlin.jvm.internal.i.b(identity.f287a, c10.f287a)) {
                        fVar.b(identity.f287a);
                    }
                    if (!kotlin.jvm.internal.i.b(identity.f288b, c10.f288b)) {
                        fVar.a(identity.f288b);
                    }
                    fVar.c(identity, updateType);
                }
            }
        } catch (Throwable th2) {
            while (i10 < i6) {
                readLock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final void b(y3.a aVar) {
        synchronized (this.f300d) {
            this.f301e.add(aVar);
        }
    }

    public final c c() {
        ReentrantReadWriteLock.ReadLock readLock = this.f298b.readLock();
        readLock.lock();
        try {
            return this.f299c;
        } finally {
            readLock.unlock();
        }
    }
}
