package s5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import h5.p;
import h6.a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import w5.e0;
import w5.j;
/* compiled from: RemoteServiceWrapper.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f31277a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f31278b;

    /* compiled from: RemoteServiceWrapper.kt */
    /* loaded from: classes.dex */
    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        

        /* renamed from: u  reason: collision with root package name */
        public final String f31282u;

        a(String str) {
            this.f31282u = str;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 2);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f31282u;
        }
    }

    /* compiled from: RemoteServiceWrapper.kt */
    /* loaded from: classes.dex */
    public static final class b implements ServiceConnection {

        /* renamed from: u  reason: collision with root package name */
        public final CountDownLatch f31283u = new CountDownLatch(1);

        /* renamed from: v  reason: collision with root package name */
        public IBinder f31284v;

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName name) {
            i.g(name, "name");
            this.f31283u.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            i.g(name, "name");
            i.g(serviceBinder, "serviceBinder");
            this.f31284v = serviceBinder;
            this.f31283u.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName name) {
            i.g(name, "name");
        }
    }

    /* compiled from: RemoteServiceWrapper.kt */
    /* loaded from: classes.dex */
    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            return (c[]) Arrays.copyOf(values(), 3);
        }
    }

    public final Intent a(Context context) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && j.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (j.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final c b(a aVar, String str, List<i5.d> list) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            c cVar = c.SERVICE_NOT_AVAILABLE;
            int i6 = q5.d.f29148a;
            Context a10 = p.a();
            Intent a11 = a(a10);
            if (a11 != null) {
                b bVar = new b();
                boolean bindService = a10.bindService(a11, bVar, 1);
                c cVar2 = c.SERVICE_ERROR;
                if (bindService) {
                    try {
                        bVar.f31283u.await(5L, TimeUnit.SECONDS);
                        IBinder iBinder = bVar.f31284v;
                        if (iBinder != null) {
                            h6.a v10 = a.AbstractBinderC0272a.v(iBinder);
                            Bundle a12 = s5.c.a(aVar, str, list);
                            if (a12 != null) {
                                v10.R(a12);
                                e0 e0Var = e0.f36453a;
                                i.n(a12, "Successfully sent events to the remote service: ");
                            }
                            cVar = c.OPERATION_SUCCESS;
                        }
                        a10.unbindService(bVar);
                        e0 e0Var2 = e0.f36453a;
                        return cVar;
                    } catch (RemoteException unused) {
                        e0 e0Var3 = e0.f36453a;
                        p pVar = p.f17269a;
                        a10.unbindService(bVar);
                        return cVar2;
                    } catch (InterruptedException unused2) {
                        e0 e0Var4 = e0.f36453a;
                        p pVar2 = p.f17269a;
                        a10.unbindService(bVar);
                        return cVar2;
                    }
                }
                return cVar2;
            }
            return cVar;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
