package ud;

import org.json.JSONObject;
import tr.r;
import ud.b;
/* compiled from: SettingsV3JsonTransform.java */
/* loaded from: classes.dex */
public final class h implements e {
    @Override // ud.e
    public final b a(r rVar, JSONObject jSONObject) {
        b.C0568b c0568b;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            c0568b = new b.C0568b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            c0568b = new b.C0568b(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        b.C0568b c0568b2 = c0568b;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        b.a aVar = new b.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            rVar.getClass();
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new b(currentTimeMillis, c0568b2, aVar, optDouble, optDouble2, optInt2);
    }
}
