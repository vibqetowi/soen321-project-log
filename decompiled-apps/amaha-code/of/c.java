package of;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ConfigContainer.java */
/* loaded from: classes.dex */
public final class c {
    public static final Date f = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f27443a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f27444b;

    /* renamed from: c  reason: collision with root package name */
    public final Date f27445c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONArray f27446d;

    /* renamed from: e  reason: collision with root package name */
    public final JSONObject f27447e;

    public c(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f27444b = jSONObject;
        this.f27445c = date;
        this.f27446d = jSONArray;
        this.f27447e = jSONObject2;
        this.f27443a = jSONObject3;
    }

    public static c a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new c(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f27443a.toString().equals(((c) obj).toString());
    }

    public final int hashCode() {
        return this.f27443a.hashCode();
    }

    public final String toString() {
        return this.f27443a.toString();
    }
}
