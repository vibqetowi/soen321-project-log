package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0756f extends CountedCompleter {

    /* renamed from: g  reason: collision with root package name */
    private static final int f21451g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a  reason: collision with root package name */
    protected final AbstractC0850z0 f21452a;

    /* renamed from: b  reason: collision with root package name */
    protected j$.util.S f21453b;

    /* renamed from: c  reason: collision with root package name */
    protected long f21454c;

    /* renamed from: d  reason: collision with root package name */
    protected AbstractC0756f f21455d;

    /* renamed from: e  reason: collision with root package name */
    protected AbstractC0756f f21456e;
    private Object f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0756f(AbstractC0756f abstractC0756f, j$.util.S s10) {
        super(abstractC0756f);
        this.f21453b = s10;
        this.f21452a = abstractC0756f.f21452a;
        this.f21454c = abstractC0756f.f21454c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0756f(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        super(null);
        this.f21452a = abstractC0850z0;
        this.f21453b = s10;
        this.f21454c = 0L;
    }

    public static int b() {
        return f21451g;
    }

    public static long g(long j10) {
        long j11 = j10 / f21451g;
        if (j11 > 0) {
            return j11;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        j$.util.S trySplit;
        j$.util.S s10 = this.f21453b;
        long estimateSize = s10.estimateSize();
        long j10 = this.f21454c;
        if (j10 == 0) {
            j10 = g(estimateSize);
            this.f21454c = j10;
        }
        boolean z10 = false;
        AbstractC0756f abstractC0756f = this;
        while (estimateSize > j10 && (trySplit = s10.trySplit()) != null) {
            AbstractC0756f e10 = abstractC0756f.e(trySplit);
            abstractC0756f.f21455d = e10;
            AbstractC0756f e11 = abstractC0756f.e(s10);
            abstractC0756f.f21456e = e11;
            abstractC0756f.setPendingCount(1);
            if (z10) {
                s10 = trySplit;
                abstractC0756f = e10;
                e10 = e11;
            } else {
                abstractC0756f = e11;
            }
            z10 = !z10;
            e10.fork();
            estimateSize = s10.estimateSize();
        }
        abstractC0756f.f(abstractC0756f.a());
        abstractC0756f.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC0756f d() {
        return (AbstractC0756f) getCompleter();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC0756f e(j$.util.S s10);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f21453b = null;
        this.f21456e = null;
        this.f21455d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
