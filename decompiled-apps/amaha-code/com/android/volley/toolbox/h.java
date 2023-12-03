package com.android.volley.toolbox;

import com.android.volley.ParseError;
import e4.l;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: JsonObjectRequest.java */
/* loaded from: classes.dex */
public class h extends i<JSONObject> {
    public h(String str, l.b<JSONObject> bVar, l.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    @Override // com.android.volley.toolbox.i, e4.j
    public e4.l<JSONObject> parseNetworkResponse(e4.i iVar) {
        try {
            return new e4.l<>(new JSONObject(new String(iVar.f13769b, e.b("utf-8", iVar.f13770c))), e.a(iVar));
        } catch (UnsupportedEncodingException e10) {
            return new e4.l<>(new ParseError(e10));
        } catch (JSONException e11) {
            return new e4.l<>(new ParseError(e11));
        }
    }

    @Deprecated
    public h(String str, JSONObject jSONObject, l.b<JSONObject> bVar, l.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    public h(int i6, String str, JSONObject jSONObject, l.b<JSONObject> bVar, l.a aVar) {
        super(i6, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}
