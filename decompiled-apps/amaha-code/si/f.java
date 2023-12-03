package si;

import hh.g;
import java.util.Set;
import ni.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Rules.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f31594a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f31595b;

    public f(String str, Set<String> set) {
        this.f31594a = str;
        this.f31595b = set;
    }

    public static JSONObject a(f fVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!di.b.t(fVar.f31594a)) {
                jSONObject.put("screen_name", fVar.f31594a);
            }
            Set<String> set = fVar.f31595b;
            if (set != null && !set.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str : set) {
                    jSONArray.put(str);
                }
                jSONObject.put("contexts", jSONArray);
            }
            return jSONObject;
        } catch (Exception e10) {
            r rVar = new r(12);
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, rVar);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = fVar.f31594a;
        String str2 = this.f31594a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Set<String> set = fVar.f31595b;
        Set<String> set2 = this.f31595b;
        if (set2 != null) {
            return set2.equals(set);
        }
        if (set == null) {
            return true;
        }
        return false;
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
