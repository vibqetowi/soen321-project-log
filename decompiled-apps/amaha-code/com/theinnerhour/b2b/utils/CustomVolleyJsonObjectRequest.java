package com.theinnerhour.b2b.utils;

import e4.l;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class CustomVolleyJsonObjectRequest extends com.android.volley.toolbox.h {
    public CustomVolleyJsonObjectRequest(int i6, String str, JSONObject jSONObject, l.b<JSONObject> bVar, l.a aVar) {
        super(i6, str, jSONObject, bVar, aVar);
        setShouldCache(false);
        setRetryPolicy();
    }

    private void setRetryPolicy() {
        setRetryPolicy(new e4.d(Constants.TIMEOUT_MS, 1));
    }

    @Override // e4.j
    public Map<String, String> getHeaders() {
        return SessionManager.getInstance().fetchHeaders();
    }

    @Override // com.android.volley.toolbox.h, com.android.volley.toolbox.i, e4.j
    public e4.l<JSONObject> parseNetworkResponse(e4.i iVar) {
        Map<String, String> map = iVar.f13770c;
        SessionManager.getInstance().saveHeaders(map.get("access-token"), map.get(SessionManager.KEY_CLIENT), map.get("Content-Type"), map.get(SessionManager.KEY_EXPIRY), map.get(SessionManager.KEY_UID), map.get("fb-token"));
        return super.parseNetworkResponse(iVar);
    }

    public CustomVolleyJsonObjectRequest(String str, JSONObject jSONObject, l.b<JSONObject> bVar, l.a aVar) {
        super(str, jSONObject, bVar, aVar);
        setShouldCache(false);
        setRetryPolicy();
    }
}
