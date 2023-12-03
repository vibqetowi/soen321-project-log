package v5;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import gv.n;
import java.util.HashMap;
import kotlin.jvm.internal.i;
import w5.b0;
import w5.e0;
import w5.o;
import w5.p;
/* compiled from: DeviceRequestsHelper.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34812a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<String, NsdManager.RegistrationListener> f34813b = new HashMap<>();

    /* compiled from: DeviceRequestsHelper.kt */
    /* renamed from: v5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0589a implements NsdManager.RegistrationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f34814a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f34815b;

        public C0589a(String str, String str2) {
            this.f34814a = str;
            this.f34815b = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onRegistrationFailed(NsdServiceInfo serviceInfo, int i6) {
            i.g(serviceInfo, "serviceInfo");
            a aVar = a.f34812a;
            a.a(this.f34815b);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
            i.g(NsdServiceInfo, "NsdServiceInfo");
            if (!i.b(this.f34814a, NsdServiceInfo.getServiceName())) {
                a aVar = a.f34812a;
                a.a(this.f34815b);
            }
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onServiceUnregistered(NsdServiceInfo serviceInfo) {
            i.g(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public final void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i6) {
            i.g(serviceInfo, "serviceInfo");
        }
    }

    public static final void a(String str) {
        if (b6.a.b(a.class)) {
            return;
        }
        try {
            f34812a.b(str);
        } catch (Throwable th2) {
            b6.a.a(a.class, th2);
        }
    }

    public static final boolean c() {
        if (b6.a.b(a.class)) {
            return false;
        }
        try {
            p pVar = p.f36526a;
            o b10 = p.b(h5.p.b());
            if (b10 == null) {
                return false;
            }
            if (!b10.f36514c.contains(b0.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            b6.a.a(a.class, th2);
            return false;
        }
    }

    public final void b(String str) {
        if (b6.a.b(this)) {
            return;
        }
        HashMap<String, NsdManager.RegistrationListener> hashMap = f34813b;
        try {
            NsdManager.RegistrationListener registrationListener = hashMap.get(str);
            if (registrationListener != null) {
                Object systemService = h5.p.a().getSystemService("servicediscovery");
                if (systemService != null) {
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        e0 e0Var = e0.f36453a;
                        e0 e0Var2 = e0.f36453a;
                        h5.p pVar = h5.p.f17269a;
                    }
                    hashMap.remove(str);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final boolean d(String str) {
        if (b6.a.b(this)) {
            return false;
        }
        try {
            HashMap<String, NsdManager.RegistrationListener> hashMap = f34813b;
            if (hashMap.containsKey(str)) {
                return true;
            }
            h5.p pVar = h5.p.f17269a;
            String str2 = "fbsdk_" + i.n(n.E0("16.0.1", '.', '|'), "android-") + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = h5.p.a().getSystemService("servicediscovery");
            if (systemService != null) {
                C0589a c0589a = new C0589a(str2, str);
                hashMap.put(str, c0589a);
                ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c0589a);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return false;
        }
    }
}
