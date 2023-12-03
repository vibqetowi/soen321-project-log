package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes3.dex */
final class O extends AbstractC0746d {

    /* renamed from: j  reason: collision with root package name */
    private final I f21346j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f21347k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(I i6, boolean z10, AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        super(abstractC0850z0, s10);
        this.f21347k = z10;
        this.f21346j = i6;
    }

    O(O o10, j$.util.S s10) {
        super(o10, s10);
        this.f21347k = o10.f21347k;
        this.f21346j = o10.f21346j;
    }

    @Override // j$.util.stream.AbstractC0756f
    protected final Object a() {
        boolean z10;
        AbstractC0850z0 abstractC0850z0 = this.f21452a;
        Q3 q32 = (Q3) this.f21346j.f21295d.get();
        abstractC0850z0.I0(this.f21453b, q32);
        Object obj = q32.get();
        if (!this.f21347k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f21441h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        } else if (obj != null) {
            O o10 = this;
            while (true) {
                if (o10 != null) {
                    AbstractC0756f d10 = o10.d();
                    if (d10 != null && d10.f21455d != o10) {
                        z10 = false;
                        break;
                    }
                    o10 = d10;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                AtomicReference atomicReference2 = this.f21441h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            } else {
                i();
            }
            return obj;
        } else {
            return null;
        }
    }

    @Override // j$.util.stream.AbstractC0756f
    protected final AbstractC0756f e(j$.util.S s10) {
        return new O(this, s10);
    }

    @Override // j$.util.stream.AbstractC0746d
    protected final Object j() {
        return this.f21346j.f21293b;
    }

    @Override // j$.util.stream.AbstractC0756f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z10;
        if (this.f21347k) {
            O o10 = (O) this.f21455d;
            O o11 = null;
            while (true) {
                if (o10 == o11) {
                    break;
                }
                Object c10 = o10.c();
                if (c10 == null || !this.f21346j.f21294c.test(c10)) {
                    o11 = o10;
                    o10 = (O) this.f21456e;
                } else {
                    f(c10);
                    O o12 = this;
                    while (true) {
                        if (o12 != null) {
                            AbstractC0756f d10 = o12.d();
                            if (d10 != null && d10.f21455d != o12) {
                                z10 = false;
                                break;
                            }
                            o12 = d10;
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        AtomicReference atomicReference = this.f21441h;
                        while (!atomicReference.compareAndSet(null, c10) && atomicReference.get() == null) {
                        }
                    } else {
                        i();
                    }
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
