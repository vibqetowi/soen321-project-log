package w4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.f;
import w4.b;
/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: u  reason: collision with root package name */
    public final Context f36395u;

    /* renamed from: v  reason: collision with root package name */
    public final b.a f36396v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f36397w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f36398x;

    /* renamed from: y  reason: collision with root package name */
    public final a f36399y = new a();

    /* compiled from: DefaultConnectivityMonitor.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            d dVar = d.this;
            boolean z10 = dVar.f36397w;
            dVar.f36397w = d.a(context);
            if (z10 != d.this.f36397w) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + d.this.f36397w);
                }
                d dVar2 = d.this;
                f.c cVar = (f.c) dVar2.f36396v;
                if (dVar2.f36397w) {
                    synchronized (com.bumptech.glide.f.this) {
                        cVar.f5963a.e();
                    }
                    return;
                }
                cVar.getClass();
            }
        }
    }

    public d(Context context, f.c cVar) {
        this.f36395u = context.getApplicationContext();
        this.f36396v = cVar;
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        kc.f.p(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            return false;
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
            }
            return true;
        }
    }

    @Override // w4.g
    public final void i() {
        if (this.f36398x) {
            this.f36395u.unregisterReceiver(this.f36399y);
            this.f36398x = false;
        }
    }

    @Override // w4.g
    public final void n() {
        if (!this.f36398x) {
            Context context = this.f36395u;
            this.f36397w = a(context);
            try {
                context.registerReceiver(this.f36399y, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f36398x = true;
            } catch (SecurityException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e10);
                }
            }
        }
    }

    @Override // w4.g
    public final void g() {
    }
}
