package y3;

import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: Response.kt */
/* loaded from: classes.dex */
public final class o implements l {
    public o(JSONObject jSONObject) {
        sc.b.L("error", jSONObject);
        jSONObject.getInt("eps_threshold");
        if (jSONObject.has("exceeded_daily_quota_users")) {
            kotlin.jvm.internal.i.f(jSONObject.getJSONObject("exceeded_daily_quota_users").keySet(), "response.getJSONObject(\"…ly_quota_users\").keySet()");
        }
        if (jSONObject.has("exceeded_daily_quota_devices")) {
            kotlin.jvm.internal.i.f(jSONObject.getJSONObject("exceeded_daily_quota_devices").keySet(), "response.getJSONObject(\"…_quota_devices\").keySet()");
        }
        if (jSONObject.has("throttled_events")) {
            JSONArray jSONArray = jSONObject.getJSONArray("throttled_events");
            kotlin.jvm.internal.i.f(jSONArray, "response.getJSONArray(\"throttled_events\")");
            is.k.j2(sc.b.g0(jSONArray));
        }
        if (jSONObject.has("throttled_users")) {
            kotlin.jvm.internal.i.f(jSONObject.getJSONObject("throttled_users").keySet(), "response.getJSONObject(\"throttled_users\").keySet()");
        }
        if (jSONObject.has("throttled_devices")) {
            kotlin.jvm.internal.i.f(jSONObject.getJSONObject("throttled_devices").keySet(), "response.getJSONObject(\"…ottled_devices\").keySet()");
        }
    }
}
