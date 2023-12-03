package o5;

import android.content.SharedPreferences;
import gv.r;
import h5.p;
import is.e0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
/* compiled from: InAppPurchaseLoggerManager.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static SharedPreferences f27160b;

    /* renamed from: a  reason: collision with root package name */
    public static final g f27159a = new g();

    /* renamed from: c  reason: collision with root package name */
    public static final CopyOnWriteArraySet f27161c = new CopyOnWriteArraySet();

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f27162d = new ConcurrentHashMap();

    public static final boolean d() {
        if (b6.a.b(g.class)) {
            return false;
        }
        try {
            f27159a.f();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f27160b;
            if (sharedPreferences != null) {
                long j10 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
                if (j10 != 0 && currentTimeMillis - j10 < 86400) {
                    return false;
                }
                SharedPreferences sharedPreferences2 = f27160b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                    return true;
                }
                kotlin.jvm.internal.i.q("sharedPreferences");
                throw null;
            }
            kotlin.jvm.internal.i.q("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            b6.a.a(g.class, th2);
            return false;
        }
    }

    public static final void e(ConcurrentHashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap) {
        if (b6.a.b(g.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.i.g(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.i.g(skuDetailsMap, "skuDetailsMap");
            g gVar = f27159a;
            gVar.f();
            LinkedHashMap c10 = gVar.c(gVar.a(purchaseDetailsMap), skuDetailsMap);
            if (!b6.a.b(gVar)) {
                for (Map.Entry entry : c10.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str != null && str2 != null) {
                        q5.f.a(str, str2, false);
                    }
                }
            }
        } catch (Throwable th2) {
            b6.a.a(g.class, th2);
        }
    }

    public final HashMap a(ConcurrentHashMap purchaseDetailsMap) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.i.g(purchaseDetailsMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = e0.x0(purchaseDetailsMap).entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                copyOnWriteArraySet = f27161c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f27162d.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) string);
                            sb2.append(';');
                            sb2.append(currentTimeMillis);
                            copyOnWriteArraySet.add(sb2.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f27160b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).apply();
                return new HashMap(purchaseDetailsMap);
            }
            kotlin.jvm.internal.i.q("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final void b() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (b6.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f27160b;
            if (sharedPreferences != null) {
                long j10 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
                if (j10 == 0) {
                    SharedPreferences sharedPreferences2 = f27160b;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("sharedPreferences");
                        throw null;
                    }
                } else if (currentTimeMillis - j10 > 604800) {
                    ConcurrentHashMap concurrentHashMap = f27162d;
                    Iterator it = e0.x0(concurrentHashMap).entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        copyOnWriteArraySet = f27161c;
                        if (!hasNext) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        long longValue = ((Number) entry.getValue()).longValue();
                        if (currentTimeMillis - longValue > 86400) {
                            copyOnWriteArraySet.remove(str + ';' + longValue);
                            concurrentHashMap.remove(str);
                        }
                    }
                    SharedPreferences sharedPreferences3 = f27160b;
                    if (sharedPreferences3 != null) {
                        sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("sharedPreferences");
                        throw null;
                    }
                } else {
                    return;
                }
            }
            kotlin.jvm.internal.i.q("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final LinkedHashMap c(HashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.i.g(purchaseDetailsMap, "purchaseDetailsMap");
            kotlin.jvm.internal.i.g(skuDetailsMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get((String) entry.getKey());
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                            String jSONObject3 = jSONObject.toString();
                            kotlin.jvm.internal.i.f(jSONObject3, "purchaseDetail.toString()");
                            String jSONObject4 = jSONObject2.toString();
                            kotlin.jvm.internal.i.f(jSONObject4, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject3, jSONObject4);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final void f() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = p.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = p.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = p.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            kotlin.jvm.internal.i.f(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f27160b = sharedPreferences3;
            CopyOnWriteArraySet copyOnWriteArraySet = f27161c;
            Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            copyOnWriteArraySet.addAll(stringSet);
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                List a12 = r.a1((String) it.next(), new String[]{";"}, 2, 2);
                f27162d.put(a12.get(0), Long.valueOf(Long.parseLong((String) a12.get(1))));
            }
            b();
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
