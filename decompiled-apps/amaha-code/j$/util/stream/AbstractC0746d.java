package j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0746d extends AbstractC0756f {

    /* renamed from: h  reason: collision with root package name */
    protected final AtomicReference f21441h;

    /* renamed from: i  reason: collision with root package name */
    protected volatile boolean f21442i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0746d(AbstractC0746d abstractC0746d, j$.util.S s10) {
        super(abstractC0746d, s10);
        this.f21441h = abstractC0746d.f21441h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0746d(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        super(abstractC0850z0, s10);
        this.f21441h = new AtomicReference(null);
    }

    @Override // j$.util.stream.AbstractC0756f
    public final Object c() {
        if (d() == null) {
            Object obj = this.f21441h.get();
            return obj == null ? j() : obj;
        }
        return super.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        r8 = r7.a();
     */
    @Override // j$.util.stream.AbstractC0756f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void compute() {
        Object obj;
        j$.util.S trySplit;
        j$.util.S s10 = this.f21453b;
        long estimateSize = s10.estimateSize();
        long j10 = this.f21454c;
        if (j10 == 0) {
            j10 = AbstractC0756f.g(estimateSize);
            this.f21454c = j10;
        }
        AtomicReference atomicReference = this.f21441h;
        boolean z10 = false;
        AbstractC0746d abstractC0746d = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z11 = abstractC0746d.f21442i;
            if (!z11) {
                AbstractC0756f d10 = abstractC0746d.d();
                while (true) {
                    AbstractC0746d abstractC0746d2 = (AbstractC0746d) d10;
                    if (z11 || abstractC0746d2 == null) {
                        break;
                    }
                    z11 = abstractC0746d2.f21442i;
                    d10 = abstractC0746d2.d();
                }
            }
            if (z11) {
                obj = abstractC0746d.j();
                break;
            } else if (estimateSize <= j10 || (trySplit = s10.trySplit()) == null) {
                break;
            } else {
                AbstractC0746d abstractC0746d3 = (AbstractC0746d) abstractC0746d.e(trySplit);
                abstractC0746d.f21455d = abstractC0746d3;
                AbstractC0746d abstractC0746d4 = (AbstractC0746d) abstractC0746d.e(s10);
                abstractC0746d.f21456e = abstractC0746d4;
                abstractC0746d.setPendingCount(1);
                if (z10) {
                    s10 = trySplit;
                    abstractC0746d = abstractC0746d3;
                    abstractC0746d3 = abstractC0746d4;
                } else {
                    abstractC0746d = abstractC0746d4;
                }
                z10 = !z10;
                abstractC0746d3.fork();
                estimateSize = s10.estimateSize();
            }
        }
        abstractC0746d.f(obj);
        abstractC0746d.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0756f
    public final void f(Object obj) {
        if (!(d() == null)) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f21441h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC0756f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.f21442i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        AbstractC0746d abstractC0746d = this;
        for (AbstractC0746d abstractC0746d2 = (AbstractC0746d) d(); abstractC0746d2 != null; abstractC0746d2 = (AbstractC0746d) abstractC0746d2.d()) {
            if (abstractC0746d2.f21455d == abstractC0746d) {
                AbstractC0746d abstractC0746d3 = (AbstractC0746d) abstractC0746d2.f21456e;
                if (!abstractC0746d3.f21442i) {
                    abstractC0746d3.h();
                }
            }
            abstractC0746d = abstractC0746d2;
        }
    }

    protected abstract Object j();
}
