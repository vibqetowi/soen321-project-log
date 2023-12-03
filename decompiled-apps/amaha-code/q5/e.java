package q5;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import h5.g0;
import h5.p;
import h5.w;
import i5.s;
import is.e0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;
import w5.l;
import w5.v;
/* compiled from: AppEventsLoggerUtility.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f29149a = e0.s0(new hs.f(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), new hs.f(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* compiled from: AppEventsLoggerUtility.kt */
    /* loaded from: classes.dex */
    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            return (a[]) Arrays.copyOf(values(), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JSONObject a(a aVar, w5.a aVar2, String str, boolean z10, Context context) {
        String E;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f29149a.get(aVar));
        i5.c cVar = i5.c.f19836a;
        if (!i5.c.f19840e) {
            Log.w(i5.c.f19837b, "initStore should have been called before calling setUserID");
            i5.c.f19836a.getClass();
            i5.c.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = i5.c.f19838c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = i5.c.f19839d;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            w5.e0 e0Var = w5.e0.f36453a;
            w5.l lVar = w5.l.f36497a;
            l.b bVar = l.b.ServiceUpdateCompliance;
            if (!w5.l.c(bVar)) {
                jSONObject.put("anon_id", str);
            }
            boolean z11 = true;
            jSONObject.put("application_tracking_enabled", !z10);
            p pVar = p.f17269a;
            jSONObject.put("advertiser_id_collection_enabled", g0.a());
            if (aVar2 != null) {
                boolean c10 = w5.l.c(bVar);
                w5.e0 e0Var2 = w5.e0.f36453a;
                if (c10) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        e0Var2.getClass();
                        if (w5.e0.z(context)) {
                            if (!aVar2.f36430e) {
                                jSONObject.put("anon_id", str);
                            }
                        }
                    } else {
                        e0Var2.getClass();
                    }
                    jSONObject.put("anon_id", str);
                }
                if (aVar2.f36428c != null) {
                    if (w5.l.c(bVar)) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            e0Var2.getClass();
                            if (w5.e0.z(context)) {
                                if (!aVar2.f36430e) {
                                    jSONObject.put("attribution", aVar2.f36428c);
                                }
                            }
                        } else {
                            e0Var2.getClass();
                        }
                        jSONObject.put("attribution", aVar2.f36428c);
                    } else {
                        jSONObject.put("attribution", aVar2.f36428c);
                    }
                }
                if (aVar2.a() != null) {
                    jSONObject.put("advertiser_id", aVar2.a());
                    jSONObject.put("advertiser_tracking_enabled", !aVar2.f36430e);
                }
                if (!aVar2.f36430e) {
                    s sVar = s.f19889a;
                    if (!b6.a.b(s.class)) {
                        try {
                            boolean z12 = s.f19892d.get();
                            s sVar2 = s.f19889a;
                            if (!z12) {
                                sVar2.b();
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.putAll(s.f19893e);
                            hashMap.putAll(sVar2.a());
                            E = w5.e0.E(hashMap);
                        } catch (Throwable th2) {
                            b6.a.a(s.class, th2);
                        }
                        if (E.length() != 0) {
                            z11 = false;
                        }
                        if (!z11) {
                            jSONObject.put("ud", E);
                        }
                    }
                    E = null;
                    if (E.length() != 0) {
                    }
                    if (!z11) {
                    }
                }
                String str3 = aVar2.f36429d;
                if (str3 != null) {
                    jSONObject.put("installer_package", str3);
                }
            }
            try {
                w5.e0.J(context, jSONObject);
            } catch (Exception e10) {
                v.a aVar3 = v.f36544d;
                w wVar = w.APP_EVENTS;
                e10.toString();
                p.i(wVar);
            }
            JSONObject o10 = w5.e0.o();
            if (o10 != null) {
                Iterator<String> keys = o10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, o10.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th3) {
            i5.c.f19838c.readLock().unlock();
            throw th3;
        }
    }
}
