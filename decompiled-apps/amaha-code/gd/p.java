package gd;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.p2;
import com.google.android.gms.internal.p000firebaseauthapi.q8;
import com.google.android.gms.internal.p000firebaseauthapi.zzqx;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final y9.a f16440a = new y9.a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            Object obj = jSONArray.get(i6);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        byte[] decode;
        v9.o.e(str);
        List d10 = new p2(new g.x(13, new q8())).d(str);
        int size = d10.size();
        y9.a aVar = f16440a;
        if (size < 2) {
            aVar.c("Invalid idToken ".concat(str), new Object[0]);
            return new HashMap();
        }
        String str2 = (String) d10.get(1);
        try {
            if (str2 == null) {
                decode = null;
            } else {
                decode = Base64.decode(str2, 11);
            }
            t.b c10 = c(new String(decode, "UTF-8"));
            if (c10 == null) {
                return new HashMap();
            }
            return c10;
        } catch (UnsupportedEncodingException e10) {
            aVar.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    public static t.b c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject == JSONObject.NULL) {
                return null;
            }
            return d(jSONObject);
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzqx(e10);
        }
    }

    public static t.b d(JSONObject jSONObject) {
        t.b bVar = new t.b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            bVar.put(next, obj);
        }
        return bVar;
    }
}
