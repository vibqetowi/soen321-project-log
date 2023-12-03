package k4;

import e5.a;
import e5.d;
/* compiled from: LockedResource.java */
/* loaded from: classes.dex */
public final class u<Z> implements v<Z>, a.d {

    /* renamed from: y  reason: collision with root package name */
    public static final a.c f22936y = e5.a.a(20, new a());

    /* renamed from: u  reason: collision with root package name */
    public final d.a f22937u = new d.a();

    /* renamed from: v  reason: collision with root package name */
    public v<Z> f22938v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f22939w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f22940x;

    /* compiled from: LockedResource.java */
    /* loaded from: classes.dex */
    public class a implements a.b<u<?>> {
        @Override // e5.a.b
        public final u<?> a() {
            return new u<>();
        }
    }

    @Override // k4.v
    public final int a() {
        return this.f22938v.a();
    }

    @Override // k4.v
    public final Class<Z> b() {
        return this.f22938v.b();
    }

    public final synchronized void c() {
        this.f22937u.a();
        if (this.f22939w) {
            this.f22939w = false;
            if (this.f22940x) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // k4.v
    public final Z get() {
        return this.f22938v.get();
    }

    @Override // e5.a.d
    public final d.a i() {
        return this.f22937u;
    }

    @Override // k4.v
    public final synchronized void recycle() {
        this.f22937u.a();
        this.f22940x = true;
        if (!this.f22939w) {
            this.f22938v.recycle();
            this.f22938v = null;
            f22936y.a(this);
        }
    }
}
