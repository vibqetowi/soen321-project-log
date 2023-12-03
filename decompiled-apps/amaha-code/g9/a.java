package g9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import ha.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import s9.f;
import v9.o;
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public s9.a f16380a;

    /* renamed from: b  reason: collision with root package name */
    public d f16381b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16382c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f16383d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public c f16384e;
    public final Context f;

    /* renamed from: g  reason: collision with root package name */
    public final long f16385g;

    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    /* renamed from: g9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0248a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16386a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16387b;

        @Deprecated
        public C0248a(String str, boolean z10) {
            this.f16386a = str;
            this.f16387b = z10;
        }

        public final String toString() {
            String str = this.f16386a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(this.f16387b);
            return sb2.toString();
        }
    }

    public a(Context context) {
        o.h(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.f16382c = false;
        this.f16385g = -1L;
    }

    public static C0248a a(Context context) {
        a aVar = new a(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            C0248a e10 = aVar.e();
            d(e10, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e10;
        } finally {
        }
    }

    public static void d(C0248a c0248a, long j10, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", "1");
            if (c0248a != null) {
                if (true != c0248a.f16387b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = c0248a.f16386a;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th2 != null) {
                hashMap.put("error", th2.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j10));
            new b(hashMap).start();
        }
    }

    public final void b() {
        o.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f != null && this.f16380a != null) {
                if (this.f16382c) {
                    z9.a.b().c(this.f, this.f16380a);
                }
                this.f16382c = false;
                this.f16381b = null;
                this.f16380a = null;
            }
        }
    }

    public final void c() {
        d bVar;
        o.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f16382c) {
                b();
            }
            Context context = this.f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int b10 = f.f31339b.b(12451000, context);
                if (b10 != 0 && b10 != 2) {
                    throw new IOException("Google Play services not available");
                }
                s9.a aVar = new s9.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (z9.a.b().a(context, intent, aVar, 1)) {
                    this.f16380a = aVar;
                    try {
                        IBinder a10 = aVar.a(TimeUnit.MILLISECONDS);
                        int i6 = ha.c.f17353a;
                        IInterface queryLocalInterface = a10.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        if (queryLocalInterface instanceof d) {
                            bVar = (d) queryLocalInterface;
                        } else {
                            bVar = new ha.b(a10);
                        }
                        this.f16381b = bVar;
                        this.f16382c = true;
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException();
            }
        }
    }

    public final C0248a e() {
        C0248a c0248a;
        o.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f16382c) {
                synchronized (this.f16383d) {
                    c cVar = this.f16384e;
                    if (cVar == null || !cVar.f16392x) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    c();
                    if (!this.f16382c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            o.h(this.f16380a);
            o.h(this.f16381b);
            try {
                c0248a = new C0248a(this.f16381b.c(), this.f16381b.d());
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        f();
        return c0248a;
    }

    public final void f() {
        synchronized (this.f16383d) {
            c cVar = this.f16384e;
            if (cVar != null) {
                cVar.f16391w.countDown();
                try {
                    this.f16384e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f16385g;
            if (j10 > 0) {
                this.f16384e = new c(this, j10);
            }
        }
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
