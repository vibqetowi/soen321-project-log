package j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes3.dex */
abstract class L3 {

    /* renamed from: a  reason: collision with root package name */
    protected final j$.util.S f21324a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f21325b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f21326c;

    /* renamed from: d  reason: collision with root package name */
    private final long f21327d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f21328e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L3(j$.util.S s10, long j10, long j11) {
        this.f21324a = s10;
        int i6 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        this.f21325b = i6 < 0;
        this.f21327d = i6 >= 0 ? j11 : 0L;
        this.f21326c = 128;
        this.f21328e = new AtomicLong(i6 >= 0 ? j10 + j11 : j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L3(j$.util.S s10, L3 l32) {
        this.f21324a = s10;
        this.f21325b = l32.f21325b;
        this.f21328e = l32.f21328e;
        this.f21327d = l32.f21327d;
        this.f21326c = l32.f21326c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long a(long j10) {
        AtomicLong atomicLong;
        long j11;
        boolean z10;
        long min;
        do {
            atomicLong = this.f21328e;
            j11 = atomicLong.get();
            z10 = this.f21325b;
            if (j11 != 0) {
                min = Math.min(j11, j10);
                if (min <= 0) {
                    break;
                }
            } else if (z10) {
                return j10;
            } else {
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j11, j11 - min));
        if (z10) {
            return Math.max(j10 - min, 0L);
        }
        long j12 = this.f21327d;
        return j11 > j12 ? Math.max(min - (j11 - j12), 0L) : min;
    }

    protected abstract j$.util.S b(j$.util.S s10);

    public final int characteristics() {
        return this.f21324a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f21324a.estimateSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final K3 f() {
        return this.f21328e.get() > 0 ? K3.MAYBE_MORE : this.f21325b ? K3.UNLIMITED : K3.NO_MORE;
    }

    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) m20trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.I m17trySplit() {
        return (j$.util.I) m20trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.L m18trySplit() {
        return (j$.util.L) m20trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.O m19trySplit() {
        return (j$.util.O) m20trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public final j$.util.S m20trySplit() {
        j$.util.S trySplit;
        if (this.f21328e.get() == 0 || (trySplit = this.f21324a.trySplit()) == null) {
            return null;
        }
        return b(trySplit);
    }
}
