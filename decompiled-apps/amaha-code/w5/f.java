package w5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.List;
/* compiled from: CustomTabUtils.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f36460a;

    static {
        new f();
        f36460a = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    }

    public static final String a() {
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            Context a10 = h5.p.a();
            List<ResolveInfo> queryIntentServices = a10.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            kotlin.jvm.internal.i.f(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            String[] strArr = f36460a;
            kotlin.jvm.internal.i.g(strArr, "<this>");
            HashSet hashSet = new HashSet(sp.b.P(strArr.length));
            is.k.h2(hashSet, strArr);
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public static final String b() {
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            return kotlin.jvm.internal.i.n(h5.p.a().getPackageName(), "fbconnect://cct.");
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public static final String c(String developerDefinedRedirectURI) {
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.i.g(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            String str = f0.f36461a;
            if (f0.a(h5.p.a(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            if (f0.a(h5.p.a(), b())) {
                return b();
            }
            return "";
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }
}
