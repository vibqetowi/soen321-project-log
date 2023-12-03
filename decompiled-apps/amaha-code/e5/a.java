package e5;

import android.util.Log;
import e5.d;
/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0216a f13804a = new C0216a();

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        T a();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public static final class c<T> implements s0.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f13805a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f13806b;

        /* renamed from: c  reason: collision with root package name */
        public final s0.d<T> f13807c;

        public c(s0.e eVar, b bVar, e eVar2) {
            this.f13807c = eVar;
            this.f13805a = bVar;
            this.f13806b = eVar2;
        }

        @Override // s0.d
        public final boolean a(T t3) {
            if (t3 instanceof d) {
                ((d) t3).i().f13808a = true;
            }
            this.f13806b.a(t3);
            return this.f13807c.a(t3);
        }

        @Override // s0.d
        public final T b() {
            T b10 = this.f13807c.b();
            if (b10 == null) {
                b10 = this.f13805a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b10.getClass());
                }
            }
            if (b10 instanceof d) {
                ((d) b10).i().f13808a = false;
            }
            return b10;
        }
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface d {
        d.a i();
    }

    /* compiled from: FactoryPools.java */
    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t3);
    }

    public static c a(int i6, b bVar) {
        return new c(new s0.e(i6), bVar, f13804a);
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: e5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0216a implements e<Object> {
        @Override // e5.a.e
        public final void a(Object obj) {
        }
    }
}
