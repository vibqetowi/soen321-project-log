package r1;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import r1.l;
/* compiled from: MediaRouteProvider.java */
/* loaded from: classes.dex */
public abstract class g {
    public j A;
    public boolean B;

    /* renamed from: u  reason: collision with root package name */
    public final Context f30258u;

    /* renamed from: v  reason: collision with root package name */
    public final d f30259v;

    /* renamed from: w  reason: collision with root package name */
    public final c f30260w = new c();

    /* renamed from: x  reason: collision with root package name */
    public a f30261x;

    /* renamed from: y  reason: collision with root package name */
    public f f30262y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f30263z;

    /* compiled from: MediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static abstract class a {
    }

    /* compiled from: MediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static abstract class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Object f30264a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public Executor f30265b;

        /* renamed from: c  reason: collision with root package name */
        public InterfaceC0515b f30266c;

        /* renamed from: d  reason: collision with root package name */
        public r1.e f30267d;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList f30268e;

        /* compiled from: MediaRouteProvider.java */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final r1.e f30269a;

            /* renamed from: b  reason: collision with root package name */
            public final int f30270b;

            /* renamed from: c  reason: collision with root package name */
            public final boolean f30271c;

            /* renamed from: d  reason: collision with root package name */
            public final boolean f30272d;

            /* renamed from: e  reason: collision with root package name */
            public final boolean f30273e;

            public a(r1.e eVar, int i6, boolean z10, boolean z11, boolean z12) {
                this.f30269a = eVar;
                this.f30270b = i6;
                this.f30271c = z10;
                this.f30272d = z11;
                this.f30273e = z12;
            }
        }

        /* compiled from: MediaRouteProvider.java */
        /* renamed from: r1.g$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0515b {
        }

        public String j() {
            return null;
        }

        public String k() {
            return null;
        }

        public final void l(r1.e eVar, ArrayList arrayList) {
            if (eVar != null) {
                synchronized (this.f30264a) {
                    Executor executor = this.f30265b;
                    if (executor != null) {
                        executor.execute(new i(this, this.f30266c, eVar, arrayList));
                    } else {
                        this.f30267d = eVar;
                        this.f30268e = new ArrayList(arrayList);
                    }
                }
                return;
            }
            throw new NullPointerException("groupRoute must not be null");
        }

        public abstract void m(String str);

        public abstract void n(String str);

        public abstract void o(List<String> list);
    }

    /* compiled from: MediaRouteProvider.java */
    /* loaded from: classes.dex */
    public final class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i6 = message.what;
            g gVar = g.this;
            if (i6 != 1) {
                if (i6 == 2) {
                    gVar.f30263z = false;
                    gVar.o(gVar.f30262y);
                    return;
                }
                return;
            }
            gVar.B = false;
            a aVar = gVar.f30261x;
            if (aVar != null) {
                j jVar = gVar.A;
                l.d dVar = l.d.this;
                l.f d10 = dVar.d(gVar);
                if (d10 != null) {
                    dVar.n(d10, jVar);
                }
            }
        }
    }

    /* compiled from: MediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f30275a;

        public d(ComponentName componentName) {
            this.f30275a = componentName;
        }

        public final String toString() {
            return "ProviderMetadata{ componentName=" + this.f30275a.flattenToShortString() + " }";
        }
    }

    public g(Context context, d dVar) {
        if (context != null) {
            this.f30258u = context;
            if (dVar == null) {
                this.f30259v = new d(new ComponentName(context, getClass()));
                return;
            } else {
                this.f30259v = dVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public b l(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public e m(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public e n(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return m(str);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final void p(j jVar) {
        l.b();
        if (this.A != jVar) {
            this.A = jVar;
            if (!this.B) {
                this.B = true;
                this.f30260w.sendEmptyMessage(1);
            }
        }
    }

    public final void q(f fVar) {
        l.b();
        if (s0.b.a(this.f30262y, fVar)) {
            return;
        }
        this.f30262y = fVar;
        if (!this.f30263z) {
            this.f30263z = true;
            this.f30260w.sendEmptyMessage(2);
        }
    }

    /* compiled from: MediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public void h(int i6) {
            g();
        }

        public void d() {
        }

        public void e() {
        }

        @Deprecated
        public void g() {
        }

        public void f(int i6) {
        }

        public void i(int i6) {
        }
    }

    public void o(f fVar) {
    }
}
