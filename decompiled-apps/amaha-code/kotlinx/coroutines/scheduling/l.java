package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: WorkQueue.kt */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23681b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23682c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23683d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23684e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<g> f23685a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final g a(g gVar, boolean z10) {
        if (z10) {
            return b(gVar);
        }
        g gVar2 = (g) f23681b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        boolean z10 = true;
        if (gVar.f23672v.d() != 1) {
            z10 = false;
        }
        if (z10) {
            f23684e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i6 = this.producerIndex & 127;
        while (this.f23685a.get(i6) != null) {
            Thread.yield();
        }
        this.f23685a.lazySet(i6, gVar);
        f23682c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        if (this.lastScheduledTask != null) {
            return (this.producerIndex - this.consumerIndex) + 1;
        }
        return this.producerIndex - this.consumerIndex;
    }

    public final g d() {
        g andSet;
        while (true) {
            int i6 = this.consumerIndex;
            if (i6 - this.producerIndex == 0) {
                return null;
            }
            int i10 = i6 & 127;
            if (f23683d.compareAndSet(this, i6, i6 + 1) && (andSet = this.f23685a.getAndSet(i10, null)) != null) {
                boolean z10 = true;
                if (andSet.f23672v.d() != 1) {
                    z10 = false;
                }
                if (z10) {
                    f23684e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        return f(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(l lVar) {
        boolean z10;
        int i6 = lVar.consumerIndex;
        int i10 = lVar.producerIndex;
        AtomicReferenceArray<g> atomicReferenceArray = lVar.f23685a;
        while (true) {
            boolean z11 = true;
            if (i6 == i10) {
                break;
            }
            int i11 = i6 & 127;
            if (lVar.blockingTasksInBuffer == 0) {
                break;
            }
            g gVar = atomicReferenceArray.get(i11);
            if (gVar != null) {
                if (gVar.f23672v.d() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i11, gVar, null)) {
                            if (atomicReferenceArray.get(i11) != gVar) {
                                z11 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z11) {
                        f23684e.decrementAndGet(lVar);
                        a(gVar, false);
                        return -1L;
                    }
                } else {
                    continue;
                }
            }
            i6++;
        }
    }

    public final long f(l lVar, boolean z10) {
        g gVar;
        boolean z11;
        boolean z12;
        do {
            gVar = (g) lVar.lastScheduledTask;
            if (gVar == null) {
                return -2L;
            }
            z11 = true;
            if (z10) {
                if (gVar.f23672v.d() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    return -2L;
                }
            }
            j.f23678e.getClass();
            long nanoTime = System.nanoTime() - gVar.f23671u;
            long j10 = j.f23674a;
            if (nanoTime < j10) {
                return j10 - nanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23681b;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(lVar, gVar, null)) {
                    if (atomicReferenceFieldUpdater.get(lVar) != gVar) {
                        z11 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z11);
        a(gVar, false);
        return -1L;
    }
}
