package s1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
/* compiled from: NavBackStackEntry.kt */
/* loaded from: classes.dex */
public final class f implements androidx.lifecycle.p, r0, androidx.lifecycle.h, a2.c {
    public final Bundle A;
    public boolean D;
    public j.c F;

    /* renamed from: u  reason: collision with root package name */
    public final Context f31114u;

    /* renamed from: v  reason: collision with root package name */
    public u f31115v;

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f31116w;

    /* renamed from: x  reason: collision with root package name */
    public j.c f31117x;

    /* renamed from: y  reason: collision with root package name */
    public final d0 f31118y;

    /* renamed from: z  reason: collision with root package name */
    public final String f31119z;
    public final androidx.lifecycle.q B = new androidx.lifecycle.q(this);
    public final a2.b C = new a2.b(this);
    public final hs.i E = sp.b.O(new d());

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static f a(Context context, u uVar, Bundle bundle, j.c hostLifecycleState, p pVar) {
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.i.f(uuid, "randomUUID().toString()");
            kotlin.jvm.internal.i.g(hostLifecycleState, "hostLifecycleState");
            return new f(context, uVar, bundle, hostLifecycleState, pVar, uuid, null);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class b extends androidx.lifecycle.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f owner) {
            super(owner);
            kotlin.jvm.internal.i.g(owner, "owner");
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class c extends l0 {

        /* renamed from: x  reason: collision with root package name */
        public final androidx.lifecycle.d0 f31120x;

        public c(androidx.lifecycle.d0 handle) {
            kotlin.jvm.internal.i.g(handle, "handle");
            this.f31120x = handle;
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.h0> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.h0 invoke() {
            Context context;
            f fVar = f.this;
            Context context2 = fVar.f31114u;
            Application application = null;
            if (context2 != null) {
                context = context2.getApplicationContext();
            } else {
                context = null;
            }
            if (context instanceof Application) {
                application = (Application) context;
            }
            return new androidx.lifecycle.h0(application, fVar, fVar.f31116w);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.d0> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.d0 invoke() {
            boolean z10;
            f fVar = f.this;
            if (fVar.D) {
                if (fVar.B.f2454c != j.c.DESTROYED) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return ((c) new o0(fVar, new b(fVar)).a(c.class)).f31120x;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    static {
        new a();
    }

    public f(Context context, u uVar, Bundle bundle, j.c cVar, d0 d0Var, String str, Bundle bundle2) {
        this.f31114u = context;
        this.f31115v = uVar;
        this.f31116w = bundle;
        this.f31117x = cVar;
        this.f31118y = d0Var;
        this.f31119z = str;
        this.A = bundle2;
        sp.b.O(new e());
        this.F = j.c.INITIALIZED;
    }

    public final void a(j.c maxState) {
        kotlin.jvm.internal.i.g(maxState, "maxState");
        this.F = maxState;
        b();
    }

    public final void b() {
        if (!this.D) {
            a2.b bVar = this.C;
            bVar.a();
            this.D = true;
            if (this.f31118y != null) {
                androidx.lifecycle.e0.b(this);
            }
            bVar.b(this.A);
        }
        int ordinal = this.f31117x.ordinal();
        int ordinal2 = this.F.ordinal();
        androidx.lifecycle.q qVar = this.B;
        if (ordinal < ordinal2) {
            qVar.h(this.f31117x);
        } else {
            qVar.h(this.F);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        Set<String> keySet;
        Object obj2;
        boolean z11;
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!kotlin.jvm.internal.i.b(this.f31119z, fVar.f31119z) || !kotlin.jvm.internal.i.b(this.f31115v, fVar.f31115v) || !kotlin.jvm.internal.i.b(this.B, fVar.B) || !kotlin.jvm.internal.i.b(this.C.f174b, fVar.C.f174b)) {
            return false;
        }
        Bundle bundle = this.f31116w;
        Bundle bundle2 = fVar.f31116w;
        if (!kotlin.jvm.internal.i.b(bundle, bundle2)) {
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                if (!keySet.isEmpty()) {
                    for (String str : keySet) {
                        Object obj3 = bundle.get(str);
                        if (bundle2 != null) {
                            obj2 = bundle2.get(str);
                        } else {
                            obj2 = null;
                        }
                        if (!kotlin.jvm.internal.i.b(obj3, obj2)) {
                            z11 = false;
                            break;
                        }
                    }
                }
                z11 = true;
                if (z11) {
                    z10 = true;
                    if (z10) {
                        return false;
                    }
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.h
    public final k1.a getDefaultViewModelCreationExtras() {
        Context context;
        k1.d dVar = new k1.d(0);
        Application application = null;
        Context context2 = this.f31114u;
        if (context2 != null) {
            context = context2.getApplicationContext();
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = context;
        }
        LinkedHashMap linkedHashMap = dVar.f22765a;
        if (application != null) {
            linkedHashMap.put(n0.f2445a, application);
        }
        linkedHashMap.put(androidx.lifecycle.e0.f2400a, this);
        linkedHashMap.put(androidx.lifecycle.e0.f2401b, this);
        Bundle bundle = this.f31116w;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.e0.f2402c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.h
    public final o0.b getDefaultViewModelProviderFactory() {
        return (androidx.lifecycle.h0) this.E.getValue();
    }

    @Override // androidx.lifecycle.p
    public final androidx.lifecycle.j getLifecycle() {
        return this.B;
    }

    @Override // a2.c
    public final a2.a getSavedStateRegistry() {
        return this.C.f174b;
    }

    @Override // androidx.lifecycle.r0
    public final q0 getViewModelStore() {
        boolean z10;
        if (this.D) {
            if (this.B.f2454c != j.c.DESTROYED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                d0 d0Var = this.f31118y;
                if (d0Var != null) {
                    return d0Var.a(this.f31119z);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    public final int hashCode() {
        Set<String> keySet;
        int i6;
        int hashCode = this.f31115v.hashCode() + (this.f31119z.hashCode() * 31);
        Bundle bundle = this.f31116w;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i10 = hashCode * 31;
                Object obj = bundle.get(str);
                if (obj != null) {
                    i6 = obj.hashCode();
                } else {
                    i6 = 0;
                }
                hashCode = i10 + i6;
            }
        }
        return this.C.f174b.hashCode() + ((this.B.hashCode() + (hashCode * 31)) * 31);
    }
}
