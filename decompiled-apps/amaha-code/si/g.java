package si;

import hh.g;
import ni.r;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Trigger.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final h f31596a;

    public g(h hVar) {
        this.f31596a = hVar;
    }

    public static JSONObject a(g gVar) {
        if (gVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("primary_condition", h.a(gVar.f31596a));
            return jSONObject;
        } catch (Exception e10) {
            r rVar = new r(13);
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
