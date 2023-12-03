package t5;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.i;
import org.json.JSONObject;
import w5.e0;
import w5.o;
import w5.p;
/* compiled from: RestrictiveDataManager.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f32411b;

    /* renamed from: a  reason: collision with root package name */
    public static final a f32410a = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final String f32412c = a.class.getCanonicalName();

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f32413d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public static final CopyOnWriteArraySet f32414e = new CopyOnWriteArraySet();

    /* compiled from: RestrictiveDataManager.kt */
    /* renamed from: t5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0545a {

        /* renamed from: a  reason: collision with root package name */
        public final String f32415a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f32416b;

        public C0545a(String str, HashMap hashMap) {
            this.f32415a = str;
            this.f32416b = hashMap;
        }
    }

    public final String a(String str, String str2) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            try {
                Iterator it = new ArrayList(f32413d).iterator();
                while (it.hasNext()) {
                    C0545a c0545a = (C0545a) it.next();
                    if (c0545a != null && i.b(str, c0545a.f32415a)) {
                        for (String str3 : c0545a.f32416b.keySet()) {
                            if (i.b(str2, str3)) {
                                return c0545a.f32416b.get(str3);
                            }
                        }
                        continue;
                    }
                }
            } catch (Exception e10) {
                Log.w(f32412c, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final void b() {
        String str;
        if (b6.a.b(this)) {
            return;
        }
        try {
            p pVar = p.f36526a;
            boolean z10 = false;
            o f = p.f(h5.p.b(), false);
            if (f != null && (str = f.f36523m) != null) {
                if (str.length() == 0) {
                    z10 = true;
                }
                if (!z10) {
                    JSONObject jSONObject = new JSONObject(str);
                    ArrayList arrayList = f32413d;
                    arrayList.clear();
                    CopyOnWriteArraySet copyOnWriteArraySet = f32414e;
                    copyOnWriteArraySet.clear();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                        if (jSONObject2 != null) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                            i.f(key, "key");
                            C0545a c0545a = new C0545a(key, new HashMap());
                            if (optJSONObject != null) {
                                c0545a.f32416b = e0.i(optJSONObject);
                                arrayList.add(c0545a);
                            }
                            if (jSONObject2.has("process_event_name")) {
                                copyOnWriteArraySet.add(key);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
