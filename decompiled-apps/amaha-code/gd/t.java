package gd;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.jf;
import com.google.android.gms.internal.p000firebaseauthapi.zzqx;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f16444a;

    /* renamed from: b  reason: collision with root package name */
    public final y9.a f16445b;

    public t(Context context, String str) {
        v9.o.h(context);
        v9.o.e(str);
        this.f16444a = context.getApplicationContext().getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", str), 0);
        this.f16445b = new y9.a("StorageHelpers", new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb A[Catch: zzqx -> 0x012f, IllegalArgumentException -> 0x0131, ArrayIndexOutOfBoundsException -> 0x0133, JSONException -> 0x0135, TRY_ENTER, TryCatch #1 {JSONException -> 0x0135, blocks: (B:3:0x0008, B:6:0x0025, B:10:0x003b, B:12:0x0077, B:14:0x007e, B:15:0x008a, B:16:0x008b, B:18:0x009a, B:20:0x00a2, B:21:0x00a6, B:23:0x00ae, B:31:0x00cb, B:32:0x00cd, B:34:0x00d3, B:36:0x00d9, B:37:0x00df, B:39:0x00e5, B:41:0x00fc, B:43:0x0102, B:47:0x0125, B:44:0x011c, B:45:0x0123, B:48:0x012b), top: B:59:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k0 a(JSONObject jSONObject) {
        JSONArray jSONArray;
        fd.n nVar;
        m0 m0Var;
        try {
            try {
                String string = jSONObject.getString("cachedTokenState");
                String string2 = jSONObject.getString("applicationName");
                boolean z10 = jSONObject.getBoolean("anonymous");
                String str = "2";
                String string3 = jSONObject.getString("version");
                if (string3 != null) {
                    str = string3;
                }
                JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
                int length = jSONArray2.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i6));
                        arrayList.add(new h0(jSONObject2.optString(SessionManager.KEY_USERID), jSONObject2.optString("providerId"), jSONObject2.optString(SessionManager.KEY_EMAIL), jSONObject2.optString("phoneNumber"), jSONObject2.optString("displayName"), jSONObject2.optString("photoUrl"), jSONObject2.optBoolean("isEmailVerified"), jSONObject2.optString("rawUserInfo")));
                    } catch (JSONException e10) {
                        Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
                        throw new zzqx(e10);
                    }
                }
                k0 k0Var = new k0(sc.e.f(string2), arrayList);
                if (!TextUtils.isEmpty(string)) {
                    k0Var.f16425u = jf.f0(string);
                }
                if (!z10) {
                    k0Var.B = Boolean.FALSE;
                }
                k0Var.A = str;
                if (jSONObject.has("userMetadata")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("userMetadata");
                    if (jSONObject3 != null) {
                        try {
                            m0Var = new m0(jSONObject3.getLong("lastSignInTimestamp"), jSONObject3.getLong("creationTimestamp"));
                        } catch (JSONException unused) {
                        }
                        if (m0Var != null) {
                            k0Var.C = m0Var;
                        }
                    }
                    m0Var = null;
                    if (m0Var != null) {
                    }
                }
                if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject4 = new JSONObject(jSONArray.getString(i10));
                        if ("phone".equals(jSONObject4.optString("factorIdKey"))) {
                            if (jSONObject4.has("enrollmentTimestamp")) {
                                nVar = new fd.n(jSONObject4.optLong("enrollmentTimestamp"), jSONObject4.optString(SessionManager.KEY_UID), jSONObject4.optString("displayName"), jSONObject4.optString("phoneNumber"));
                            } else {
                                throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
                            }
                        } else {
                            nVar = null;
                        }
                        arrayList2.add(nVar);
                    }
                    k0Var.u0(arrayList2);
                }
                return k0Var;
            } catch (JSONException e11) {
                e = e11;
                Log.wtf(this.f16445b.f38388a, e);
                return null;
            }
        } catch (zzqx e12) {
            e = e12;
            Log.wtf(this.f16445b.f38388a, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e13) {
            e = e13;
            Log.wtf(this.f16445b.f38388a, e);
            return null;
        } catch (IllegalArgumentException e14) {
            e = e14;
            Log.wtf(this.f16445b.f38388a, e);
            return null;
        }
    }
}
