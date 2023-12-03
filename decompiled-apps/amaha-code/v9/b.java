package v9;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public abstract class b<T extends IInterface> {
    public static final s9.d[] S = new s9.d[0];
    public final q0 A;
    public j D;
    public c E;
    public IInterface F;
    public t0 H;
    public final a J;
    public final InterfaceC0590b K;
    public final int L;
    public final String M;
    public volatile String N;

    /* renamed from: v  reason: collision with root package name */
    public h1 f34841v;

    /* renamed from: w  reason: collision with root package name */
    public final Context f34842w;

    /* renamed from: x  reason: collision with root package name */
    public final Looper f34843x;

    /* renamed from: y  reason: collision with root package name */
    public final g f34844y;

    /* renamed from: z  reason: collision with root package name */
    public final s9.f f34845z;

    /* renamed from: u  reason: collision with root package name */
    public volatile String f34840u = null;
    public final Object B = new Object();
    public final Object C = new Object();
    public final ArrayList G = new ArrayList();
    public int I = 1;
    public s9.b O = null;
    public boolean P = false;
    public volatile x0 Q = null;
    public final AtomicInteger R = new AtomicInteger(0);

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes.dex */
    public interface a {
        void a(Bundle bundle);

        void z(int i6);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* renamed from: v9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0590b {
        void v(s9.b bVar);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes.dex */
    public interface c {
        void a(s9.b bVar);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes.dex */
    public class d implements c {
        public d() {
        }

        @Override // v9.b.c
        public final void a(s9.b bVar) {
            boolean z10;
            if (bVar.f31323v == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            b bVar2 = b.this;
            if (z10) {
                bVar2.f(null, bVar2.x());
                return;
            }
            InterfaceC0590b interfaceC0590b = bVar2.K;
            if (interfaceC0590b != null) {
                interfaceC0590b.v(bVar);
            }
        }
    }

    public b(Context context, Looper looper, e1 e1Var, s9.f fVar, int i6, a aVar, InterfaceC0590b interfaceC0590b, String str) {
        if (context != null) {
            this.f34842w = context;
            if (looper != null) {
                this.f34843x = looper;
                if (e1Var != null) {
                    this.f34844y = e1Var;
                    o.i(fVar, "API availability must not be null");
                    this.f34845z = fVar;
                    this.A = new q0(this, looper);
                    this.L = i6;
                    this.J = aVar;
                    this.K = interfaceC0590b;
                    this.M = str;
                    return;
                }
                throw new NullPointerException("Supervisor must not be null");
            }
            throw new NullPointerException("Looper must not be null");
        }
        throw new NullPointerException("Context must not be null");
    }

    public static /* bridge */ /* synthetic */ void F(b bVar) {
        int i6;
        int i10;
        synchronized (bVar.B) {
            i6 = bVar.I;
        }
        if (i6 == 3) {
            bVar.P = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        q0 q0Var = bVar.A;
        q0Var.sendMessage(q0Var.obtainMessage(i10, bVar.R.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean G(b bVar, int i6, int i10, IInterface iInterface) {
        synchronized (bVar.B) {
            if (bVar.I != i6) {
                return false;
            }
            bVar.H(i10, iInterface);
            return true;
        }
    }

    public abstract String A();

    public boolean B() {
        if (l() >= 211700000) {
            return true;
        }
        return false;
    }

    public void C(s9.b bVar) {
        bVar.getClass();
        System.currentTimeMillis();
    }

    public void D(int i6, IBinder iBinder, Bundle bundle, int i10) {
        u0 u0Var = new u0(this, i6, iBinder, bundle);
        q0 q0Var = this.A;
        q0Var.sendMessage(q0Var.obtainMessage(1, i10, -1, u0Var));
    }

    public boolean E() {
        return this instanceof p9.t;
    }

    public final void H(int i6, IInterface iInterface) {
        boolean z10;
        boolean z11;
        h1 h1Var;
        boolean z12 = false;
        if (i6 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        }
        o.b(z12);
        synchronized (this.B) {
            try {
                this.I = i6;
                this.F = iInterface;
                if (i6 != 1) {
                    if (i6 != 2 && i6 != 3) {
                        if (i6 == 4) {
                            o.h(iInterface);
                            System.currentTimeMillis();
                        }
                    } else {
                        t0 t0Var = this.H;
                        if (t0Var != null && (h1Var = this.f34841v) != null) {
                            String str = h1Var.f34907a;
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + str + " on com.google.android.gms");
                            g gVar = this.f34844y;
                            String str2 = this.f34841v.f34907a;
                            o.h(str2);
                            this.f34841v.getClass();
                            if (this.M == null) {
                                this.f34842w.getClass();
                            }
                            gVar.c(str2, "com.google.android.gms", 4225, t0Var, this.f34841v.f34908b);
                            this.R.incrementAndGet();
                        }
                        t0 t0Var2 = new t0(this, this.R.get());
                        this.H = t0Var2;
                        String A = A();
                        Object obj = g.f34896a;
                        boolean B = B();
                        this.f34841v = new h1(A, B);
                        if (B && l() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f34841v.f34907a)));
                        }
                        g gVar2 = this.f34844y;
                        String str3 = this.f34841v.f34907a;
                        o.h(str3);
                        this.f34841v.getClass();
                        String str4 = this.M;
                        if (str4 == null) {
                            str4 = this.f34842w.getClass().getName();
                        }
                        boolean z13 = this.f34841v.f34908b;
                        u();
                        if (!gVar2.d(new b1(4225, str3, "com.google.android.gms", z13), t0Var2, str4, null)) {
                            String str5 = this.f34841v.f34907a;
                            Log.w("GmsClient", "unable to connect to service: " + str5 + " on com.google.android.gms");
                            int i10 = this.R.get();
                            v0 v0Var = new v0(this, 16);
                            q0 q0Var = this.A;
                            q0Var.sendMessage(q0Var.obtainMessage(7, i10, -1, v0Var));
                        }
                    }
                } else {
                    t0 t0Var3 = this.H;
                    if (t0Var3 != null) {
                        g gVar3 = this.f34844y;
                        String str6 = this.f34841v.f34907a;
                        o.h(str6);
                        this.f34841v.getClass();
                        if (this.M == null) {
                            this.f34842w.getClass();
                        }
                        gVar3.c(str6, "com.google.android.gms", 4225, t0Var3, this.f34841v.f34908b);
                        this.H = null;
                    }
                }
            } finally {
            }
        }
    }

    public final void b(String str) {
        this.f34840u = str;
        h();
    }

    public final void c(com.google.android.gms.common.api.internal.a0 a0Var) {
        a0Var.f7335a.f7354m.G.post(new com.google.android.gms.common.api.internal.z(a0Var));
    }

    public final boolean d() {
        boolean z10;
        synchronized (this.B) {
            int i6 = this.I;
            z10 = true;
            if (i6 != 2 && i6 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public final String e() {
        if (j() && this.f34841v != null) {
            return "com.google.android.gms";
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public final void f(i iVar, Set<Scope> set) {
        Bundle w10 = w();
        int i6 = this.L;
        String str = this.N;
        int i10 = s9.f.f31338a;
        Scope[] scopeArr = e.I;
        Bundle bundle = new Bundle();
        s9.d[] dVarArr = e.J;
        e eVar = new e(6, i6, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        eVar.f34884x = this.f34842w.getPackageName();
        eVar.A = w10;
        if (set != null) {
            eVar.f34886z = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account s10 = s();
            if (s10 == null) {
                s10 = new Account("<<default account>>", "com.google");
            }
            eVar.B = s10;
            if (iVar != null) {
                eVar.f34885y = iVar.asBinder();
            }
        }
        eVar.C = S;
        eVar.D = t();
        if (E()) {
            eVar.G = true;
        }
        try {
            synchronized (this.C) {
                j jVar = this.D;
                if (jVar != null) {
                    jVar.E(new s0(this, this.R.get()), eVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i11 = this.R.get();
            q0 q0Var = this.A;
            q0Var.sendMessage(q0Var.obtainMessage(6, i11, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            D(8, null, null, this.R.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            D(8, null, null, this.R.get());
        }
    }

    public void h() {
        this.R.incrementAndGet();
        synchronized (this.G) {
            int size = this.G.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((r0) this.G.get(i6)).c();
            }
            this.G.clear();
        }
        synchronized (this.C) {
            this.D = null;
        }
        H(1, null);
    }

    public final void i(c cVar) {
        this.E = cVar;
        H(2, null);
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.B) {
            if (this.I == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean k() {
        return true;
    }

    public int l() {
        return s9.f.f31338a;
    }

    public final s9.d[] m() {
        x0 x0Var = this.Q;
        if (x0Var == null) {
            return null;
        }
        return x0Var.f34960v;
    }

    public final String n() {
        return this.f34840u;
    }

    public boolean o() {
        return false;
    }

    public final void q() {
        int b10 = this.f34845z.b(l(), this.f34842w);
        if (b10 != 0) {
            H(1, null);
            this.E = new d();
            int i6 = this.R.get();
            q0 q0Var = this.A;
            q0Var.sendMessage(q0Var.obtainMessage(3, i6, b10, null));
            return;
        }
        i(new d());
    }

    public abstract T r(IBinder iBinder);

    public Account s() {
        return null;
    }

    public s9.d[] t() {
        return S;
    }

    public Bundle v() {
        return null;
    }

    public Bundle w() {
        return new Bundle();
    }

    public Set<Scope> x() {
        return Collections.emptySet();
    }

    public final T y() {
        T t3;
        synchronized (this.B) {
            try {
                if (this.I != 5) {
                    if (j()) {
                        t3 = (T) this.F;
                        o.i(t3, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t3;
    }

    public abstract String z();

    public void u() {
    }
}
