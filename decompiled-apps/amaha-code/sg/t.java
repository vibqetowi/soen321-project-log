package sg;

import com.theinnerhour.b2b.utils.Constants;
import hh.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: AnalyticsParser.kt */
/* loaded from: classes.dex */
public final class t {

    /* compiled from: AnalyticsParser.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f31562u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_AnalyticsParser trafficSourceToJson() : ";
        }
    }

    /* compiled from: AnalyticsParser.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f31563u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_AnalyticsParser userSessionToJson() : ";
        }
    }

    public static final jh.a a(JSONObject jSONObject) {
        if (!jSONObject.has("source_array")) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONArray("source_array").getJSONObject(0);
        kotlin.jvm.internal.i.f(jSONObject2, "sessionJson.getJSONArray…E_ARRAY).getJSONObject(0)");
        try {
            HashMap hashMap = new HashMap();
            if (jSONObject2.has("extras")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("extras");
                Iterator<String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    String value = jSONObject3.getString(key);
                    kotlin.jvm.internal.i.f(key, "key");
                    kotlin.jvm.internal.i.f(value, "value");
                    hashMap.put(key, value);
                }
            }
            return new jh.a(jSONObject2.optString("source", null), jSONObject2.optString("medium", null), jSONObject2.optString("campaign_name", null), jSONObject2.optString(Constants.CAMPAIGN_ID, null), jSONObject2.optString("content", null), jSONObject2.optString("term", null), jSONObject2.optString("source_url", null), hashMap);
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, s.f31561u);
            return null;
        }
    }

    public static final JSONObject b(jh.a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String str = aVar.f22023a;
            if (str != null) {
                jSONObject.put("source", str);
            }
            String str2 = aVar.f22024b;
            if (str2 != null) {
                jSONObject.put("medium", str2);
            }
            String str3 = aVar.f22025c;
            if (str3 != null) {
                jSONObject.put("campaign_name", str3);
            }
            String str4 = aVar.f22026d;
            if (str4 != null) {
                jSONObject.put(Constants.CAMPAIGN_ID, str4);
            }
            String str5 = aVar.f22027e;
            if (str5 != null) {
                jSONObject.put("source_url", str5);
            }
            String str6 = aVar.f;
            if (str6 != null) {
                jSONObject.put("content", str6);
            }
            String str7 = aVar.f22028g;
            if (str7 != null) {
                jSONObject.put("term", str7);
            }
            JSONObject jSONObject2 = new JSONObject();
            Set<Map.Entry<String, String>> entrySet = aVar.f22029h.entrySet();
            kotlin.jvm.internal.i.f(entrySet, "source.extras.entries");
            for (Map.Entry<String, String> entry : entrySet) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("extras", jSONObject2);
            }
            return jSONObject;
        } catch (Exception e10) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, e10, a.f31562u);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:3:0x0006, B:5:0x002d, B:11:0x0039, B:12:0x003c, B:14:0x0042), top: B:19:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[Catch: Exception -> 0x0048, TRY_LEAVE, TryCatch #0 {Exception -> 0x0048, blocks: (B:3:0x0006, B:5:0x002d, B:11:0x0039, B:12:0x003c, B:14:0x0042), top: B:19:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JSONObject c(jh.b session) {
        boolean z10;
        kotlin.jvm.internal.i.g(session, "session");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("session_id", session.f22030a);
            jSONObject.put("start_time", session.f22031b);
            jSONObject.put("last_interaction_time", session.f22033d);
            JSONArray jSONArray = new JSONArray();
            JSONObject b10 = b(session.f22032c);
            if (b10 != null && b10.length() != 0) {
                z10 = false;
                if (!z10) {
                    jSONArray.put(b10);
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("source_array", jSONArray);
                }
                return jSONObject;
            }
            z10 = true;
            if (!z10) {
            }
            if (jSONArray.length() > 0) {
            }
            return jSONObject;
        } catch (Exception e10) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, b.f31563u);
            return null;
        }
    }
}
