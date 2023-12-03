package je;

import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import oe.a;
/* compiled from: LruGarbageCollector.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final long f21891c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f21892d;

    /* renamed from: a  reason: collision with root package name */
    public final m f21893a;

    /* renamed from: b  reason: collision with root package name */
    public final b f21894b;

    /* compiled from: LruGarbageCollector.java */
    /* loaded from: classes.dex */
    public class a implements z0 {

        /* renamed from: a  reason: collision with root package name */
        public final oe.a f21895a;

        /* renamed from: b  reason: collision with root package name */
        public final k f21896b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f21897c = false;

        public a(oe.a aVar, k kVar) {
            this.f21895a = aVar;
            this.f21896b = kVar;
        }

        @Override // je.z0
        public final void start() {
            long j10;
            if (p.this.f21894b.f21899a != -1) {
                if (this.f21897c) {
                    j10 = p.f21892d;
                } else {
                    j10 = p.f21891c;
                }
                this.f21895a.a(a.c.GARBAGE_COLLECTION, j10, new o(0, this));
            }
        }
    }

    /* compiled from: LruGarbageCollector.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f21899a;

        public b(long j10) {
            this.f21899a = j10;
        }
    }

    /* compiled from: LruGarbageCollector.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    /* compiled from: LruGarbageCollector.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: c  reason: collision with root package name */
        public static final p0.d f21900c = new p0.d(21);

        /* renamed from: a  reason: collision with root package name */
        public final PriorityQueue<Long> f21901a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21902b;

        public d(int i6) {
            this.f21902b = i6;
            this.f21901a = new PriorityQueue<>(i6, f21900c);
        }

        public final void a(Long l2) {
            PriorityQueue<Long> priorityQueue = this.f21901a;
            if (priorityQueue.size() < this.f21902b) {
                priorityQueue.add(l2);
            } else if (l2.longValue() < priorityQueue.peek().longValue()) {
                priorityQueue.poll();
                priorityQueue.add(l2);
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f21891c = timeUnit.toMillis(1L);
        f21892d = timeUnit.toMillis(5L);
    }

    public p(m mVar, b bVar) {
        this.f21893a = mVar;
        this.f21894b = bVar;
    }
}
