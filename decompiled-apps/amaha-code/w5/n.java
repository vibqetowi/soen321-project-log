package w5;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import h5.q;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: FetchedAppGateKeepersManager.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f36507a = new n();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f36508b;

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentLinkedQueue<a> f36509c;

    /* renamed from: d  reason: collision with root package name */
    public static final ConcurrentHashMap f36510d;

    /* renamed from: e  reason: collision with root package name */
    public static Long f36511e;
    public static g.x f;

    /* compiled from: FetchedAppGateKeepersManager.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    static {
        kotlin.jvm.internal.y.a(n.class).i();
        f36508b = new AtomicBoolean(false);
        f36509c = new ConcurrentLinkedQueue<>();
        f36510d = new ConcurrentHashMap();
    }

    public static JSONObject a() {
        Bundle a10 = r1.b0.a("platform", "android");
        h5.p pVar = h5.p.f17269a;
        a10.putString("sdk_version", "16.0.1");
        a10.putString("fields", "gatekeepers");
        String str = h5.q.f17287j;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
        h5.q g5 = q.c.g(null, format, null);
        g5.f17293d = a10;
        JSONObject jSONObject = g5.c().f17319d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final boolean b(String name, String str, boolean z10) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        kotlin.jvm.internal.i.g(name, "name");
        f36507a.getClass();
        ArrayList<x5.a> arrayList = null;
        c(null);
        ConcurrentHashMap concurrentHashMap2 = f36510d;
        if (!concurrentHashMap2.containsKey(str)) {
            hashMap = new HashMap();
        } else {
            g.x xVar = f;
            if (xVar != null && (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) xVar.f16143v).get(str)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((x5.a) ((Map.Entry) it.next()).getValue());
                }
            }
            if (arrayList != null) {
                hashMap = new HashMap();
                for (x5.a aVar : arrayList) {
                    hashMap.put(aVar.f37608a, Boolean.valueOf(aVar.f37609b));
                }
            } else {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) concurrentHashMap2.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    kotlin.jvm.internal.i.f(key, "key");
                    hashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                g.x xVar2 = f;
                if (xVar2 == null) {
                    xVar2 = new g.x(7);
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList2.add(new x5.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    x5.a aVar2 = (x5.a) it2.next();
                    concurrentHashMap3.put(aVar2.f37608a, aVar2);
                }
                ((ConcurrentHashMap) xVar2.f16143v).put(str, concurrentHashMap3);
                f = xVar2;
                hashMap = hashMap2;
            }
        }
        if (hashMap.containsKey(name)) {
            Boolean bool = (Boolean) hashMap.get(name);
            if (bool == null) {
                return z10;
            }
            return bool.booleanValue();
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:6:0x000a, B:14:0x002f, B:16:0x0037, B:21:0x003e, B:23:0x0066, B:27:0x0073, B:28:0x0076, B:32:0x0084, B:25:0x006d, B:9:0x001a), top: B:39:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized void c(m mVar) {
        boolean z10;
        String string;
        synchronized (n.class) {
            if (mVar != null) {
                f36509c.add(mVar);
            }
            String b10 = h5.p.b();
            n nVar = f36507a;
            Long l2 = f36511e;
            nVar.getClass();
            if (l2 != null && System.currentTimeMillis() - l2.longValue() < 3600000) {
                z10 = true;
                if (!z10 && f36510d.containsKey(b10)) {
                    e();
                    return;
                }
                Context a10 = h5.p.a();
                String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{b10}, 1));
                kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
                JSONObject jSONObject = null;
                string = a10.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
                if (!e0.A(string)) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        e0 e0Var = e0.f36453a;
                        h5.p pVar = h5.p.f17269a;
                    }
                    if (jSONObject != null) {
                        d(jSONObject, b10);
                    }
                }
                Executor c10 = h5.p.c();
                if (f36508b.compareAndSet(false, true)) {
                    return;
                }
                c10.execute(new s5.a(a10, b10, format));
                return;
            }
            z10 = false;
            if (!z10) {
            }
            Context a102 = h5.p.a();
            String format2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{b10}, 1));
            kotlin.jvm.internal.i.f(format2, "java.lang.String.format(format, *args)");
            JSONObject jSONObject2 = null;
            string = a102.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format2, null);
            if (!e0.A(string)) {
            }
            Executor c102 = h5.p.c();
            if (f36508b.compareAndSet(false, true)) {
            }
        }
    }

    public static final synchronized JSONObject d(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        synchronized (n.class) {
            jSONObject2 = (JSONObject) f36510d.get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            int i6 = 0;
            if (optJSONArray == null) {
                optJSONObject = null;
            } else {
                optJSONObject = optJSONArray.optJSONObject(0);
            }
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i10 = i6 + 1;
                    try {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i6);
                        jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                    } catch (JSONException unused) {
                        e0 e0Var = e0.f36453a;
                        h5.p pVar = h5.p.f17269a;
                    }
                    if (i10 >= length) {
                        break;
                    }
                    i6 = i10;
                }
            }
            f36510d.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f36509c;
            if (!concurrentLinkedQueue.isEmpty()) {
                a poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new androidx.activity.b(14, poll));
                }
            } else {
                return;
            }
        }
    }
}
