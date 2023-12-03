package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes3.dex */
final class V extends CountedCompleter {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f21392h = 0;

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0850z0 f21393a;

    /* renamed from: b  reason: collision with root package name */
    private j$.util.S f21394b;

    /* renamed from: c  reason: collision with root package name */
    private final long f21395c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap f21396d;

    /* renamed from: e  reason: collision with root package name */
    private final InterfaceC0818r2 f21397e;
    private final V f;

    /* renamed from: g  reason: collision with root package name */
    private I0 f21398g;

    V(V v10, j$.util.S s10, V v11) {
        super(v10);
        this.f21393a = v10.f21393a;
        this.f21394b = s10;
        this.f21395c = v10.f21395c;
        this.f21396d = v10.f21396d;
        this.f21397e = v10.f21397e;
        this.f = v11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public V(AbstractC0850z0 abstractC0850z0, j$.util.S s10, InterfaceC0818r2 interfaceC0818r2) {
        super(null);
        this.f21393a = abstractC0850z0;
        this.f21394b = s10;
        this.f21395c = AbstractC0756f.g(s10.estimateSize());
        this.f21396d = new ConcurrentHashMap(Math.max(16, AbstractC0756f.b() << 1));
        this.f21397e = interfaceC0818r2;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.S trySplit;
        j$.util.S s10 = this.f21394b;
        long j10 = this.f21395c;
        boolean z10 = false;
        V v10 = this;
        while (s10.estimateSize() > j10 && (trySplit = s10.trySplit()) != null) {
            V v11 = new V(v10, trySplit, v10.f);
            V v12 = new V(v10, s10, v11);
            v10.addToPendingCount(1);
            v12.addToPendingCount(1);
            v10.f21396d.put(v11, v12);
            if (v10.f != null) {
                v11.addToPendingCount(1);
                if (v10.f21396d.replace(v10.f, v10, v11)) {
                    v10.addToPendingCount(-1);
                } else {
                    v11.addToPendingCount(-1);
                }
            }
            if (z10) {
                s10 = trySplit;
                v10 = v11;
                v11 = v12;
            } else {
                v10 = v12;
            }
            z10 = !z10;
            v11.fork();
        }
        if (v10.getPendingCount() > 0) {
            C0736b c0736b = new C0736b(15);
            AbstractC0850z0 abstractC0850z0 = v10.f21393a;
            D0 D0 = abstractC0850z0.D0(abstractC0850z0.k0(s10), c0736b);
            v10.f21393a.I0(s10, D0);
            v10.f21398g = D0.build();
            v10.f21394b = null;
        }
        v10.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        I0 i02 = this.f21398g;
        if (i02 != null) {
            i02.forEach(this.f21397e);
            this.f21398g = null;
        } else {
            j$.util.S s10 = this.f21394b;
            if (s10 != null) {
                this.f21393a.I0(s10, this.f21397e);
                this.f21394b = null;
            }
        }
        V v10 = (V) this.f21396d.remove(this);
        if (v10 != null) {
            v10.tryComplete();
        }
    }
}
