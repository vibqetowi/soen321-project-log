package k4;
/* compiled from: EngineResource.java */
/* loaded from: classes.dex */
public final class q<Z> implements v<Z> {
    public boolean A;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f22925u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f22926v;

    /* renamed from: w  reason: collision with root package name */
    public final v<Z> f22927w;

    /* renamed from: x  reason: collision with root package name */
    public final a f22928x;

    /* renamed from: y  reason: collision with root package name */
    public final h4.e f22929y;

    /* renamed from: z  reason: collision with root package name */
    public int f22930z;

    /* compiled from: EngineResource.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(h4.e eVar, q<?> qVar);
    }

    public q(v<Z> vVar, boolean z10, boolean z11, h4.e eVar, a aVar) {
        kc.f.p(vVar);
        this.f22927w = vVar;
        this.f22925u = z10;
        this.f22926v = z11;
        this.f22929y = eVar;
        kc.f.p(aVar);
        this.f22928x = aVar;
    }

    @Override // k4.v
    public final int a() {
        return this.f22927w.a();
    }

    @Override // k4.v
    public final Class<Z> b() {
        return this.f22927w.b();
    }

    public final synchronized void c() {
        if (!this.A) {
            this.f22930z++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final void d() {
        boolean z10;
        synchronized (this) {
            int i6 = this.f22930z;
            if (i6 > 0) {
                z10 = true;
                int i10 = i6 - 1;
                this.f22930z = i10;
                if (i10 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f22928x.a(this.f22929y, this);
        }
    }

    @Override // k4.v
    public final Z get() {
        return this.f22927w.get();
    }

    @Override // k4.v
    public final synchronized void recycle() {
        if (this.f22930z <= 0) {
            if (!this.A) {
                this.A = true;
                if (this.f22926v) {
                    this.f22927w.recycle();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f22925u + ", listener=" + this.f22928x + ", key=" + this.f22929y + ", acquired=" + this.f22930z + ", isRecycled=" + this.A + ", resource=" + this.f22927w + '}';
    }
}
