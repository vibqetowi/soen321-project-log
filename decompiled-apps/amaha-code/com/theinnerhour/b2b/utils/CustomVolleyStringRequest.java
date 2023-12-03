package com.theinnerhour.b2b.utils;

import e4.l;
import java.util.Map;
/* loaded from: classes2.dex */
public class CustomVolleyStringRequest extends com.android.volley.toolbox.l {
    public CustomVolleyStringRequest(int i6, String str, l.b<String> bVar, l.a aVar) {
        super(i6, str, bVar, aVar);
        setShouldCache(false);
        setRetryPolicy();
    }

    private void setRetryPolicy() {
        setRetryPolicy(new e4.d(Constants.TIMEOUT_MS, 0));
    }

    @Override // e4.j
    public Map<String, String> getHeaders() {
        return SessionManager.getInstance().fetchHeaders();
    }

    @Override // com.android.volley.toolbox.l, e4.j
    public e4.l<String> parseNetworkResponse(e4.i iVar) {
        Map<String, String> map = iVar.f13770c;
        SessionManager.getInstance().saveHeaders(map.get("access-token"), map.get(SessionManager.KEY_CLIENT), map.get("Content-Type"), map.get(SessionManager.KEY_EXPIRY), map.get(SessionManager.KEY_UID), map.get("fb-token"));
        return super.parseNetworkResponse(iVar);
    }
}
