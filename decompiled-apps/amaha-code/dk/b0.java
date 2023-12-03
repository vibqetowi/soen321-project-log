package dk;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: SurveyActivity.kt */
/* loaded from: classes2.dex */
public final class b0 extends com.android.volley.toolbox.h {
    public b0(JSONObject jSONObject, z zVar, a0 a0Var) {
        super(1, "https://api.theinnerhour.com/v1/appsurvey", jSONObject, zVar, a0Var);
    }

    @Override // e4.j
    public final Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        return hashMap;
    }
}
