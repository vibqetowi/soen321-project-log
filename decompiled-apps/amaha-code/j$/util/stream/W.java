package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* loaded from: classes3.dex */
final class W extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    private j$.util.S f21401a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0818r2 f21402b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC0850z0 f21403c;

    /* renamed from: d  reason: collision with root package name */
    private long f21404d;

    W(W w10, j$.util.S s10) {
        super(w10);
        this.f21401a = s10;
        this.f21402b = w10.f21402b;
        this.f21404d = w10.f21404d;
        this.f21403c = w10.f21403c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public W(AbstractC0850z0 abstractC0850z0, j$.util.S s10, InterfaceC0818r2 interfaceC0818r2) {
        super(null);
        this.f21402b = interfaceC0818r2;
        this.f21403c = abstractC0850z0;
        this.f21401a = s10;
        this.f21404d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.S trySplit;
        j$.util.S s10 = this.f21401a;
        long estimateSize = s10.estimateSize();
        long j10 = this.f21404d;
        if (j10 == 0) {
            j10 = AbstractC0756f.g(estimateSize);
            this.f21404d = j10;
        }
        boolean r = EnumC0765g3.SHORT_CIRCUIT.r(this.f21403c.s0());
        InterfaceC0818r2 interfaceC0818r2 = this.f21402b;
        boolean z10 = false;
        W w10 = this;
        while (true) {
            if (r && interfaceC0818r2.e()) {
                break;
            } else if (estimateSize <= j10 || (trySplit = s10.trySplit()) == null) {
                break;
            } else {
                W w11 = new W(w10, trySplit);
                w10.addToPendingCount(1);
                if (z10) {
                    s10 = trySplit;
                } else {
                    W w12 = w10;
                    w10 = w11;
                    w11 = w12;
                }
                z10 = !z10;
                w10.fork();
                w10 = w11;
                estimateSize = s10.estimateSize();
            }
        }
        w10.f21403c.f0(s10, interfaceC0818r2);
        w10.f21401a = null;
        w10.propagateCompletion();
    }
}
