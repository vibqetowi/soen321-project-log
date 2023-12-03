package ne;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import je.l0;
import ne.f;
/* compiled from: AndroidConnectivityMonitor.java */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26207a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f26208b = new ArrayList();

    /* compiled from: AndroidConnectivityMonitor.java */
    /* loaded from: classes.dex */
    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            e.this.c(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            e.this.c(false);
        }
    }

    /* compiled from: AndroidConnectivityMonitor.java */
    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public boolean f26210a = false;

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean b10 = eVar.b();
            if (eVar.b() && !this.f26210a) {
                eVar.c(true);
            } else if (!b10 && this.f26210a) {
                eVar.c(false);
            }
            this.f26210a = b10;
        }
    }

    public e(Context context) {
        boolean z10;
        if (context != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Context must be non-null", new Object[0]);
        this.f26207a = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Application application = (Application) context.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new c(this, atomicBoolean));
        application.registerComponentCallbacks(new d(atomicBoolean));
        if (Build.VERSION.SDK_INT >= 24 && connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback(new a());
        } else {
            context.registerReceiver(new b(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @Override // ne.f
    public final void a(l0 l0Var) {
        synchronized (this.f26208b) {
            this.f26208b.add(l0Var);
        }
    }

    public final boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f26207a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        f.a aVar;
        synchronized (this.f26208b) {
            Iterator it = this.f26208b.iterator();
            while (it.hasNext()) {
                oe.d dVar = (oe.d) it.next();
                if (z10) {
                    aVar = f.a.REACHABLE;
                } else {
                    aVar = f.a.UNREACHABLE;
                }
                dVar.accept(aVar);
            }
        }
    }

    public final void d() {
        kc.f.A(1, "AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (b()) {
            c(true);
        }
    }
}
