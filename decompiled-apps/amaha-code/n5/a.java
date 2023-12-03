package n5;

import i5.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import w5.e0;
import w5.o;
import w5.p;
/* compiled from: EventDeactivationManager.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f25886b;

    /* renamed from: a  reason: collision with root package name */
    public static final a f25885a = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f25887c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final HashSet f25888d = new HashSet();

    /* compiled from: EventDeactivationManager.kt */
    /* renamed from: n5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0423a {

        /* renamed from: a  reason: collision with root package name */
        public final String f25889a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f25890b;

        public C0423a(String str, ArrayList arrayList) {
            this.f25889a = str;
            this.f25890b = arrayList;
        }
    }

    public static final void b(ArrayList events) {
        if (b6.a.b(a.class)) {
            return;
        }
        try {
            i.g(events, "events");
            if (!f25886b) {
                return;
            }
            Iterator it = events.iterator();
            while (it.hasNext()) {
                if (f25888d.contains(((d) it.next()).f19845x)) {
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            b6.a.a(a.class, th2);
        }
    }

    public final synchronized void a() {
        boolean z10;
        o f;
        if (b6.a.b(this)) {
            return;
        }
        try {
            p pVar = p.f36526a;
            z10 = false;
            f = p.f(h5.p.b(), false);
        } catch (Exception unused) {
        }
        if (f == null) {
            return;
        }
        String str = f.f36523m;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            }
            if (z10) {
                JSONObject jSONObject = new JSONObject(str);
                f25887c.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            HashSet hashSet = f25888d;
                            i.f(key, "key");
                            hashSet.add(key);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            i.f(key, "key");
                            C0423a c0423a = new C0423a(key, new ArrayList());
                            if (optJSONArray != null) {
                                c0423a.f25890b = e0.g(optJSONArray);
                            }
                            f25887c.add(c0423a);
                        }
                    }
                }
            }
        }
    }
}
