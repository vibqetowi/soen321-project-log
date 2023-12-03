package si;

import hh.g;
import ni.r;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: TriggerCondition.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f31597a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f31598b;

    public h(JSONObject jSONObject, String str) {
        this.f31597a = str;
        this.f31598b = jSONObject;
    }

    public static JSONObject a(h hVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action_name", hVar.f31597a);
            JSONObject jSONObject2 = hVar.f31598b;
            if (jSONObject2 != null) {
                jSONObject.put("attributes", jSONObject2);
            } else {
                jSONObject.put("attributes", new JSONObject());
            }
            return jSONObject;
        } catch (Exception e10) {
            r rVar = new r(14);
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, rVar);
            return null;
        }
    }

    public final String toString() {
        try {
            JSONObject a10 = a(this);
            if (a10 != null) {
                return a10.toString(4);
            }
        } catch (JSONException unused) {
        }
        return super.toString();
    }
}
