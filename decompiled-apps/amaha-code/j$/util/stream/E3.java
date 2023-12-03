package j$.util.stream;
/* loaded from: classes3.dex */
abstract class E3 {

    /* renamed from: a  reason: collision with root package name */
    final long f21274a;

    /* renamed from: b  reason: collision with root package name */
    final long f21275b;

    /* renamed from: c  reason: collision with root package name */
    j$.util.S f21276c;

    /* renamed from: d  reason: collision with root package name */
    long f21277d;

    /* renamed from: e  reason: collision with root package name */
    long f21278e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E3(j$.util.S s10, long j10, long j11, long j12, long j13) {
        this.f21276c = s10;
        this.f21274a = j10;
        this.f21275b = j11;
        this.f21277d = j12;
        this.f21278e = j13;
    }

    protected abstract j$.util.S a(j$.util.S s10, long j10, long j11, long j12, long j13);

    public final int characteristics() {
        return this.f21276c.characteristics();
    }

    public final long estimateSize() {
        long j10 = this.f21278e;
        long j11 = this.f21274a;
        if (j11 < j10) {
            return j10 - Math.max(j11, this.f21277d);
        }
        return 0L;
    }

    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) m16trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.I m13trySplit() {
        return (j$.util.I) m16trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.L m14trySplit() {
        return (j$.util.L) m16trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.O m15trySplit() {
        return (j$.util.O) m16trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public final j$.util.S m16trySplit() {
        long j10 = this.f21278e;
        if (this.f21274a >= j10 || this.f21277d >= j10) {
            return null;
        }
        while (true) {
            j$.util.S trySplit = this.f21276c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f21277d;
            long min = Math.min(estimateSize, this.f21275b);
            long j11 = this.f21274a;
            if (j11 >= min) {
                this.f21277d = min;
            } else {
                long j12 = this.f21275b;
                if (min < j12) {
                    long j13 = this.f21277d;
                    if (j13 < j11 || estimateSize > j12) {
                        this.f21277d = min;
                        return a(trySplit, j11, j12, j13, min);
                    }
                    this.f21277d = min;
                    return trySplit;
                }
                this.f21276c = trySplit;
                this.f21278e = min;
            }
        }
    }
}
