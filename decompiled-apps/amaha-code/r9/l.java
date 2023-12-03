package r9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzq;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class l implements ServiceConnection {

    /* renamed from: w  reason: collision with root package name */
    public androidx.appcompat.widget.l f30629w;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ o f30632z;

    /* renamed from: u  reason: collision with root package name */
    public int f30627u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final Messenger f30628v = new Messenger(new la.b(Looper.getMainLooper(), new Handler.Callback() { // from class: r9.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            l lVar = l.this;
            int i6 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i6);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (lVar) {
                n<?> nVar = lVar.f30631y.get(i6);
                if (nVar == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i6);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                lVar.f30631y.remove(i6);
                lVar.c();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    nVar.c(new zzq("Not supported by GmsCore", null));
                    return true;
                }
                nVar.a(data);
                return true;
            }
        }
    }));

    /* renamed from: x  reason: collision with root package name */
    public final ArrayDeque f30630x = new ArrayDeque();

    /* renamed from: y  reason: collision with root package name */
    public final SparseArray<n<?>> f30631y = new SparseArray<>();

    public final synchronized void a(int i6, String str) {
        b(i6, str, null);
    }

    public final synchronized void b(int i6, String str, SecurityException securityException) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i10 = this.f30627u;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f30627u = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f30627u = 4;
            z9.a.b().c((Context) this.f30632z.f30640c, this);
            zzq zzqVar = new zzq(str, securityException);
            Iterator it = this.f30630x.iterator();
            while (it.hasNext()) {
                ((n) it.next()).c(zzqVar);
            }
            this.f30630x.clear();
            for (int i11 = 0; i11 < this.f30631y.size(); i11++) {
                this.f30631y.valueAt(i11).c(zzqVar);
            }
            this.f30631y.clear();
            return;
        }
        throw new IllegalStateException();
    }

    public final synchronized void c() {
        if (this.f30627u == 2 && this.f30630x.isEmpty() && this.f30631y.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f30627u = 3;
            z9.a.b().c((Context) this.f30632z.f30640c, this);
        }
    }

    public final synchronized boolean d(m mVar) {
        boolean z10;
        int i6 = this.f30627u;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    return false;
                }
                this.f30630x.add(mVar);
                ((ScheduledExecutorService) this.f30632z.f30641d).execute(new k(this, 1));
                return true;
            }
            this.f30630x.add(mVar);
            return true;
        }
        this.f30630x.add(mVar);
        if (this.f30627u == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f30627u = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!z9.a.b().a((Context) this.f30632z.f30640c, intent, this, 1)) {
                    a(0, "Unable to bind to service");
                } else {
                    ((ScheduledExecutorService) this.f30632z.f30641d).schedule(new k(this, 2), 30L, TimeUnit.SECONDS);
                }
            } catch (SecurityException e10) {
                b(0, "Unable to bind to service", e10);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f30632z.f30641d).execute(new androidx.work.n(this, 7, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f30632z.f30641d).execute(new k(this, 0));
    }
}
