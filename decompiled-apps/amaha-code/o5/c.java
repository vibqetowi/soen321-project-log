package o5;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import h5.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import w5.o;
import w5.p;
/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f27119a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final String f27120b = c.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicBoolean f27121c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f27122d;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f27123e;
    public static a f;

    /* renamed from: g  reason: collision with root package name */
    public static b f27124g;

    /* renamed from: h  reason: collision with root package name */
    public static Intent f27125h;

    /* renamed from: i  reason: collision with root package name */
    public static Object f27126i;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(c cVar, Context context, ArrayList arrayList, boolean z10) {
        LinkedHashMap j10;
        cVar.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String purchase = (String) it.next();
                try {
                    String sku = new JSONObject(purchase).getString("productId");
                    kotlin.jvm.internal.i.f(sku, "sku");
                    kotlin.jvm.internal.i.f(purchase, "purchase");
                    hashMap.put(sku, purchase);
                    arrayList2.add(sku);
                } catch (JSONException e10) {
                    Log.e(f27120b, "Error parsing in-app purchase data.", e10);
                }
            }
            f fVar = f.f27154a;
            Object obj = f27126i;
            f fVar2 = f.f27154a;
            if (!b6.a.b(f.class)) {
                try {
                    j10 = fVar2.j(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        if (!j10.containsKey(str)) {
                            arrayList3.add(str);
                        }
                    }
                    j10.putAll(fVar2.g(context, arrayList3, obj, z10));
                } catch (Throwable th2) {
                    b6.a.a(f.class, th2);
                }
                for (Map.Entry entry : j10.entrySet()) {
                    String str2 = (String) entry.getValue();
                    String str3 = (String) hashMap.get((String) entry.getKey());
                    if (str3 != null) {
                        q5.f.a(str3, str2, z10);
                    }
                }
            }
            j10 = null;
            while (r8.hasNext()) {
            }
        }
    }

    public static final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        f27119a.getClass();
        if (f27122d == null) {
            if (j.a("com.android.vending.billing.IInAppBillingService$Stub") != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            Boolean valueOf = Boolean.valueOf(z11);
            f27122d = valueOf;
            if (!kotlin.jvm.internal.i.b(valueOf, Boolean.FALSE)) {
                if (j.a("com.android.billingclient.api.ProxyBillingActivity") != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f27123e = Boolean.valueOf(z12);
                f fVar = f.f27154a;
                if (!b6.a.b(f.class)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = f.f27158e;
                        long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                        if (j10 == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else if (currentTimeMillis - j10 > 604800) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        }
                    } catch (Throwable th2) {
                        b6.a.a(f.class, th2);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                kotlin.jvm.internal.i.f(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                f27125h = intent;
                f = new a();
                f27124g = new b();
            }
        }
        if (kotlin.jvm.internal.i.b(f27122d, Boolean.FALSE)) {
            return;
        }
        q5.f fVar2 = q5.f.f29153a;
        o b10 = p.b(h5.p.b());
        if (b10 != null && g0.b() && b10.f36517g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && f27121c.compareAndSet(false, true)) {
            Context a10 = h5.p.a();
            if (a10 instanceof Application) {
                Application application = (Application) a10;
                b bVar = f27124g;
                if (bVar != null) {
                    application.registerActivityLifecycleCallbacks(bVar);
                    Intent intent2 = f27125h;
                    if (intent2 != null) {
                        a aVar = f;
                        if (aVar != null) {
                            a10.bindService(intent2, aVar, 1);
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("serviceConnection");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.i.q("intent");
                    throw null;
                }
                kotlin.jvm.internal.i.q("callbacks");
                throw null;
            }
        }
    }
}
