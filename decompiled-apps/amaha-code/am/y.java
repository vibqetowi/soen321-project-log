package am;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: V2GoalsActivity.kt */
/* loaded from: classes2.dex */
public final class y extends com.android.volley.toolbox.h {
    public y(JSONObject jSONObject, w wVar, dk.a0 a0Var) {
        super(1, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", jSONObject, wVar, a0Var);
    }

    @Override // e4.j
    public final Map<String, String> getHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        return hashMap;
    }
}
