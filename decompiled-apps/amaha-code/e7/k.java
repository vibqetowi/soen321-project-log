package e7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MetadataBackendRegistry.java */
/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public final a f13825a;

    /* renamed from: b  reason: collision with root package name */
    public final i f13826b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f13827c;

    /* compiled from: MetadataBackendRegistry.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f13828a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f13829b = null;

        public a(Context context) {
            this.f13828a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final d a(String str) {
            Bundle bundle;
            Map<String, String> map;
            PackageManager packageManager;
            if (this.f13829b == null) {
                Context context = this.f13828a;
                try {
                    packageManager = context.getPackageManager();
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                        if (bundle != null) {
                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            map = Collections.emptyMap();
                        } else {
                            HashMap hashMap = new HashMap();
                            for (String str2 : bundle.keySet()) {
                                Object obj = bundle.get(str2);
                                if ((obj instanceof String) && str2.startsWith("backend:")) {
                                    for (String str3 : ((String) obj).split(",", -1)) {
                                        String trim = str3.trim();
                                        if (!trim.isEmpty()) {
                                            hashMap.put(trim, str2.substring(8));
                                        }
                                    }
                                }
                            }
                            map = hashMap;
                        }
                        this.f13829b = map;
                    }
                }
                bundle = null;
                if (bundle != null) {
                }
                this.f13829b = map;
            }
            String str4 = this.f13829b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e14);
                return null;
            }
        }
    }

    public k(Context context, i iVar) {
        a aVar = new a(context);
        this.f13827c = new HashMap();
        this.f13825a = aVar;
        this.f13826b = iVar;
    }

    @Override // e7.e
    public final synchronized l a(String str) {
        if (this.f13827c.containsKey(str)) {
            return (l) this.f13827c.get(str);
        }
        d a10 = this.f13825a.a(str);
        if (a10 == null) {
            return null;
        }
        i iVar = this.f13826b;
        l create = a10.create(new c(iVar.f13818a, iVar.f13819b, iVar.f13820c, str));
        this.f13827c.put(str, create);
        return create;
    }
}
