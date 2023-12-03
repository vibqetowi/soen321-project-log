package z9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import ca.c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import v9.f1;
import v9.o;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f39355b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f39356c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f39357a = new ConcurrentHashMap();

    public static a b() {
        if (f39356c == null) {
            synchronized (f39355b) {
                if (f39356c == null) {
                    f39356c = new a();
                }
            }
        }
        a aVar = f39356c;
        o.h(aVar);
        return aVar;
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i6) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i6, null);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof f1)) {
            ConcurrentHashMap concurrentHashMap = this.f39357a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i6, Executor executor) {
        boolean bindService;
        boolean bindService2;
        ComponentName component = intent.getComponent();
        boolean z10 = false;
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).a(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        boolean z11 = true;
        if (!(serviceConnection instanceof f1)) {
            ConcurrentHashMap concurrentHashMap = this.f39357a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    z11 = false;
                }
                if (z11 && executor != null) {
                    bindService2 = context.bindService(intent, i6, executor, serviceConnection);
                } else {
                    bindService2 = context.bindService(intent, serviceConnection, i6);
                }
                if (!bindService2) {
                    concurrentHashMap.remove(serviceConnection, serviceConnection);
                    return false;
                }
                return bindService2;
            } catch (Throwable th2) {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        }
        if (z10 && executor != null) {
            bindService = context.bindService(intent, i6, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i6);
    }
}
