package k4;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k4.q;
/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22825a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f22826b;

    /* renamed from: c  reason: collision with root package name */
    public final ReferenceQueue<q<?>> f22827c;

    /* renamed from: d  reason: collision with root package name */
    public q.a f22828d;

    /* compiled from: ActiveResources.java */
    /* loaded from: classes.dex */
    public static final class a extends WeakReference<q<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final h4.e f22829a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f22830b;

        /* renamed from: c  reason: collision with root package name */
        public v<?> f22831c;

        public a(h4.e eVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z10) {
            super(qVar, referenceQueue);
            v<?> vVar;
            kc.f.p(eVar);
            this.f22829a = eVar;
            if (qVar.f22925u && z10) {
                vVar = qVar.f22927w;
                kc.f.p(vVar);
            } else {
                vVar = null;
            }
            this.f22831c = vVar;
            this.f22830b = qVar.f22925u;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new k4.a());
        this.f22826b = new HashMap();
        this.f22827c = new ReferenceQueue<>();
        this.f22825a = false;
        newSingleThreadExecutor.execute(new b(this));
    }

    public final synchronized void a(h4.e eVar, q<?> qVar) {
        a aVar = (a) this.f22826b.put(eVar, new a(eVar, qVar, this.f22827c, this.f22825a));
        if (aVar != null) {
            aVar.f22831c = null;
            aVar.clear();
        }
    }

    public final void b(a aVar) {
        v<?> vVar;
        synchronized (this) {
            this.f22826b.remove(aVar.f22829a);
            if (aVar.f22830b && (vVar = aVar.f22831c) != null) {
                this.f22828d.a(aVar.f22829a, new q<>(vVar, true, false, aVar.f22829a, this.f22828d));
            }
        }
    }
}
