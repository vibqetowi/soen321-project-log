package q8;

import c9.w;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p8.g;
import p8.j;
import p8.k;
import r7.e;
/* compiled from: CeaDecoder.java */
/* loaded from: classes.dex */
public abstract class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<a> f29395a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<k> f29396b;

    /* renamed from: c  reason: collision with root package name */
    public final PriorityQueue<a> f29397c;

    /* renamed from: d  reason: collision with root package name */
    public a f29398d;

    /* renamed from: e  reason: collision with root package name */
    public long f29399e;
    public long f;

    /* compiled from: CeaDecoder.java */
    /* loaded from: classes.dex */
    public static final class a extends j implements Comparable<a> {
        public long D;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (k(4) != aVar2.k(4)) {
                if (!k(4)) {
                    return -1;
                }
            } else {
                long j10 = this.f6362y - aVar2.f6362y;
                if (j10 == 0) {
                    j10 = this.D - aVar2.D;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 <= 0) {
                    return -1;
                }
            }
            return 1;
        }
    }

    /* compiled from: CeaDecoder.java */
    /* loaded from: classes.dex */
    public static final class b extends k {

        /* renamed from: y  reason: collision with root package name */
        public final e.a<b> f29400y;

        public b(f0.b bVar) {
            this.f29400y = bVar;
        }

        @Override // r7.e
        public final void n() {
            c cVar = (c) ((f0.b) this.f29400y).f14603v;
            cVar.getClass();
            this.f30528u = 0;
            this.f28025w = null;
            cVar.f29396b.add(this);
        }
    }

    public c() {
        for (int i6 = 0; i6 < 10; i6++) {
            this.f29395a.add(new a());
        }
        this.f29396b = new ArrayDeque<>();
        for (int i10 = 0; i10 < 2; i10++) {
            this.f29396b.add(new b(new f0.b(21, this)));
        }
        this.f29397c = new PriorityQueue<>();
    }

    @Override // p8.g
    public final void b(long j10) {
        this.f29399e = j10;
    }

    @Override // r7.d
    public final j d() {
        boolean z10;
        if (this.f29398d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        ArrayDeque<a> arrayDeque = this.f29395a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        a pollFirst = arrayDeque.pollFirst();
        this.f29398d = pollFirst;
        return pollFirst;
    }

    @Override // r7.d
    public final void e(j jVar) {
        boolean z10;
        if (jVar == this.f29398d) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        a aVar = (a) jVar;
        if (aVar.l()) {
            aVar.n();
            this.f29395a.add(aVar);
        } else {
            long j10 = this.f;
            this.f = 1 + j10;
            aVar.D = j10;
            this.f29397c.add(aVar);
        }
        this.f29398d = null;
    }

    public abstract d f();

    @Override // r7.d
    public void flush() {
        ArrayDeque<a> arrayDeque;
        this.f = 0L;
        this.f29399e = 0L;
        while (true) {
            PriorityQueue<a> priorityQueue = this.f29397c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f29395a;
            if (isEmpty) {
                break;
            }
            a poll = priorityQueue.poll();
            int i6 = w.f5205a;
            poll.n();
            arrayDeque.add(poll);
        }
        a aVar = this.f29398d;
        if (aVar != null) {
            aVar.n();
            arrayDeque.add(aVar);
            this.f29398d = null;
        }
    }

    public abstract void g(a aVar);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        return null;
     */
    @Override // r7.d
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k c() {
        ArrayDeque<k> arrayDeque = this.f29396b;
        if (!arrayDeque.isEmpty()) {
            while (true) {
                PriorityQueue<a> priorityQueue = this.f29397c;
                if (!priorityQueue.isEmpty()) {
                    int i6 = w.f5205a;
                    if (priorityQueue.peek().f6362y > this.f29399e) {
                        break;
                    }
                    a poll = priorityQueue.poll();
                    boolean k10 = poll.k(4);
                    ArrayDeque<a> arrayDeque2 = this.f29395a;
                    if (k10) {
                        k pollFirst = arrayDeque.pollFirst();
                        pollFirst.j(4);
                        poll.n();
                        arrayDeque2.add(poll);
                        return pollFirst;
                    }
                    g(poll);
                    if (i()) {
                        d f = f();
                        k pollFirst2 = arrayDeque.pollFirst();
                        pollFirst2.p(poll.f6362y, f, Long.MAX_VALUE);
                        poll.n();
                        arrayDeque2.add(poll);
                        return pollFirst2;
                    }
                    poll.n();
                    arrayDeque2.add(poll);
                } else {
                    break;
                }
            }
        } else {
            return null;
        }
    }

    public abstract boolean i();

    @Override // r7.d
    public void a() {
    }
}
