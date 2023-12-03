package j$.util.stream;

import j$.time.AbstractC0689a;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0835v1 extends CountedCompleter implements InterfaceC0818r2 {

    /* renamed from: a  reason: collision with root package name */
    protected final j$.util.S f21567a;

    /* renamed from: b  reason: collision with root package name */
    protected final AbstractC0850z0 f21568b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f21569c;

    /* renamed from: d  reason: collision with root package name */
    protected long f21570d;

    /* renamed from: e  reason: collision with root package name */
    protected long f21571e;
    protected int f;

    /* renamed from: g  reason: collision with root package name */
    protected int f21572g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0835v1(int i6, j$.util.S s10, AbstractC0850z0 abstractC0850z0) {
        this.f21567a = s10;
        this.f21568b = abstractC0850z0;
        this.f21569c = AbstractC0756f.g(s10.estimateSize());
        this.f21570d = 0L;
        this.f21571e = i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0835v1(AbstractC0835v1 abstractC0835v1, j$.util.S s10, long j10, long j11, int i6) {
        super(abstractC0835v1);
        this.f21567a = s10;
        this.f21568b = abstractC0835v1.f21568b;
        this.f21569c = abstractC0835v1.f21569c;
        this.f21570d = j10;
        this.f21571e = j11;
        if (j10 < 0 || j11 < 0 || (j10 + j11) - 1 >= i6) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j10), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i6)));
        }
    }

    abstract AbstractC0835v1 a(j$.util.S s10, long j10, long j11);

    public /* synthetic */ void accept(double d10) {
        AbstractC0850z0.z();
        throw null;
    }

    public /* synthetic */ void accept(int i6) {
        AbstractC0850z0.G();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        AbstractC0850z0.H();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return AbstractC0689a.c(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        long j11 = this.f21571e;
        if (j10 > j11) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i6 = (int) this.f21570d;
        this.f = i6;
        this.f21572g = i6 + ((int) j11);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.S trySplit;
        j$.util.S s10 = this.f21567a;
        AbstractC0835v1 abstractC0835v1 = this;
        while (s10.estimateSize() > abstractC0835v1.f21569c && (trySplit = s10.trySplit()) != null) {
            abstractC0835v1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC0835v1.a(trySplit, abstractC0835v1.f21570d, estimateSize).fork();
            abstractC0835v1 = abstractC0835v1.a(s10, abstractC0835v1.f21570d + estimateSize, abstractC0835v1.f21571e - estimateSize);
        }
        abstractC0835v1.f21568b.I0(s10, abstractC0835v1);
        abstractC0835v1.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final /* synthetic */ void end() {
    }
}
