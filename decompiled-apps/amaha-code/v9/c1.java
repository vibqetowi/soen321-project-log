package v9;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class c1 implements ServiceConnection, f1 {
    public final /* synthetic */ e1 A;

    /* renamed from: u  reason: collision with root package name */
    public final HashMap f34865u = new HashMap();

    /* renamed from: v  reason: collision with root package name */
    public int f34866v = 2;

    /* renamed from: w  reason: collision with root package name */
    public boolean f34867w;

    /* renamed from: x  reason: collision with root package name */
    public IBinder f34868x;

    /* renamed from: y  reason: collision with root package name */
    public final b1 f34869y;

    /* renamed from: z  reason: collision with root package name */
    public ComponentName f34870z;

    public c1(e1 e1Var, b1 b1Var) {
        this.A = e1Var;
        this.f34869y = b1Var;
    }

    public final void a(String str, Executor executor) {
        boolean z10;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f34866v = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            e1 e1Var = this.A;
            z9.a aVar = e1Var.f34893g;
            Context context = e1Var.f34892e;
            boolean d10 = aVar.d(context, str, this.f34869y.a(context), this, this.f34869y.f34852c, executor);
            this.f34867w = d10;
            if (d10) {
                this.A.f.sendMessageDelayed(this.A.f.obtainMessage(1, this.f34869y), this.A.f34895i);
            } else {
                this.f34866v = 2;
                try {
                    e1 e1Var2 = this.A;
                    e1Var2.f34893g.c(e1Var2.f34892e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.A.f34891d) {
            this.A.f.removeMessages(1, this.f34869y);
            this.f34868x = iBinder;
            this.f34870z = componentName;
            for (ServiceConnection serviceConnection : this.f34865u.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f34866v = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.A.f34891d) {
            this.A.f.removeMessages(1, this.f34869y);
            this.f34868x = null;
            this.f34870z = componentName;
            for (ServiceConnection serviceConnection : this.f34865u.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f34866v = 2;
        }
    }
}
