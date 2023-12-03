package g6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import g6.p;
import h5.g0;
import h5.q;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
/* compiled from: LoginMethodHandler.kt */
/* loaded from: classes.dex */
public abstract class y implements Parcelable {

    /* renamed from: u  reason: collision with root package name */
    public HashMap f16347u;

    /* renamed from: v  reason: collision with root package name */
    public p f16348v;

    /* compiled from: LoginMethodHandler.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static h5.a a(Bundle bundle, String applicationId) {
            boolean z10;
            String string;
            h5.g gVar = h5.g.FACEBOOK_APPLICATION_SERVICE;
            kotlin.jvm.internal.i.g(bundle, "bundle");
            kotlin.jvm.internal.i.g(applicationId, "applicationId");
            e0 e0Var = e0.f36453a;
            Date n10 = e0.n(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
            Date n11 = e0.n(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
            if (string2 != null) {
                boolean z11 = false;
                if (string2.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                    if (string.length() == 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        return new h5.a(string2, applicationId, string, stringArrayList, null, null, gVar, n10, new Date(), n11, bundle.getString("graph_domain"));
                    }
                    return null;
                }
                return null;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00e4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
        /* JADX WARN: Type inference failed for: r2v36, types: [java.util.ArrayList] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static h5.a b(Set set, Bundle bundle, h5.g gVar, String applicationId) {
            Set set2;
            String string;
            ArrayList arrayList;
            String string2;
            ArrayList arrayList2;
            boolean z10;
            Object[] array;
            boolean z11;
            boolean z12;
            boolean z13;
            kotlin.jvm.internal.i.g(bundle, "bundle");
            kotlin.jvm.internal.i.g(applicationId, "applicationId");
            e0 e0Var = e0.f36453a;
            Date n10 = e0.n(bundle, "expires_in", new Date());
            String string3 = bundle.getString("access_token");
            if (string3 == null) {
                return null;
            }
            Date n11 = e0.n(bundle, "data_access_expiration_time", new Date(0L));
            String string4 = bundle.getString("granted_scopes");
            if (string4 != null) {
                if (string4.length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    Object[] array2 = gv.r.a1(string4, new String[]{","}, 0, 6).toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr = (String[]) array2;
                        set2 = ca.a.k(Arrays.copyOf(strArr, strArr.length));
                        string = bundle.getString("denied_scopes");
                        if (string != null) {
                            if (string.length() > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                Object[] array3 = gv.r.a1(string, new String[]{","}, 0, 6).toArray(new String[0]);
                                if (array3 != null) {
                                    String[] strArr2 = (String[]) array3;
                                    arrayList = ca.a.k(Arrays.copyOf(strArr2, strArr2.length));
                                    string2 = bundle.getString("expired_scopes");
                                    if (string2 != null) {
                                        if (string2.length() > 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            Object[] array4 = gv.r.a1(string2, new String[]{","}, 0, 6).toArray(new String[0]);
                                            if (array4 != null) {
                                                String[] strArr3 = (String[]) array4;
                                                arrayList2 = ca.a.k(Arrays.copyOf(strArr3, strArr3.length));
                                                if (!e0.A(string3)) {
                                                    return null;
                                                }
                                                String string5 = bundle.getString("graph_domain");
                                                String string6 = bundle.getString("signed_request");
                                                if (string6 != null) {
                                                    if (string6.length() == 0) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (!z10) {
                                                        try {
                                                            array = gv.r.a1(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
                                                        } catch (UnsupportedEncodingException | JSONException unused) {
                                                        }
                                                        if (array != null) {
                                                            String[] strArr4 = (String[]) array;
                                                            if (strArr4.length == 2) {
                                                                byte[] data = Base64.decode(strArr4[1], 0);
                                                                kotlin.jvm.internal.i.f(data, "data");
                                                                String string7 = new JSONObject(new String(data, gv.a.f16927b)).getString("user_id");
                                                                kotlin.jvm.internal.i.f(string7, "jsonObject.getString(\"user_id\")");
                                                                return new h5.a(string3, applicationId, string7, set2, arrayList, arrayList2, gVar, n10, new Date(), n11, string5);
                                                            }
                                                            throw new FacebookException("Failed to retrieve user_id from signed_request");
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                                    }
                                                }
                                                throw new FacebookException("Authorization response does not contain the signed_request");
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                        }
                                    }
                                    arrayList2 = null;
                                    if (!e0.A(string3)) {
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        }
                        arrayList = null;
                        string2 = bundle.getString("expired_scopes");
                        if (string2 != null) {
                        }
                        arrayList2 = null;
                        if (!e0.A(string3)) {
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
            }
            set2 = set;
            string = bundle.getString("denied_scopes");
            if (string != null) {
            }
            arrayList = null;
            string2 = bundle.getString("expired_scopes");
            if (string2 != null) {
            }
            arrayList2 = null;
            if (!e0.A(string3)) {
            }
        }

        public static h5.h c(Bundle bundle, String str) {
            boolean z10;
            kotlin.jvm.internal.i.g(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                boolean z11 = false;
                if (string.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && str != null) {
                    if (str.length() == 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        try {
                            return new h5.h(string, str);
                        } catch (Exception e10) {
                            throw new FacebookException(e10.getMessage(), e10);
                        }
                    }
                }
            }
            return null;
        }
    }

    public y(p pVar) {
        this.f16348v = pVar;
    }

    public final void a(String str, String str2) {
        String obj;
        if (this.f16347u == null) {
            this.f16347u = new HashMap();
        }
        HashMap hashMap = this.f16347u;
        if (hashMap != null) {
            if (str == null) {
                obj = null;
            } else {
                obj = str.toString();
            }
            String str3 = (String) hashMap.put(str2, obj);
        }
    }

    public final String c(String authId) {
        kotlin.jvm.internal.i.g(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", e());
            j(jSONObject);
        } catch (JSONException e10) {
            Log.w("LoginMethodHandler", kotlin.jvm.internal.i.n(e10.getMessage(), "Error creating client state json: "));
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    public final p d() {
        p pVar = this.f16348v;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.i.q("loginClient");
        throw null;
    }

    public abstract String e();

    public String f() {
        return "fb" + h5.p.b() + "://authorize/";
    }

    public final void g(String str) {
        String str2;
        p.d dVar = d().A;
        if (dVar == null) {
            str2 = null;
        } else {
            str2 = dVar.f16305x;
        }
        if (str2 == null) {
            str2 = h5.p.b();
        }
        i5.i iVar = new i5.i(d().e(), str2);
        Bundle a10 = r1.b0.a("fb_web_login_e2e", str);
        a10.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        a10.putString("app_id", str2);
        h5.p pVar = h5.p.f17269a;
        if (g0.b()) {
            iVar.f("fb_dialogs_web_login_dialog_complete", a10);
        }
    }

    public boolean h(int i6, int i10, Intent intent) {
        return false;
    }

    public final void i(Bundle bundle, p.d dVar) {
        h5.q g5;
        String string = bundle.getString("code");
        if (!e0.A(string)) {
            String str = null;
            if (string == null) {
                g5 = null;
            } else {
                String redirectUri = f();
                String str2 = dVar.J;
                if (str2 == null) {
                    str2 = "";
                }
                kotlin.jvm.internal.i.g(redirectUri, "redirectUri");
                Bundle bundle2 = new Bundle();
                bundle2.putString("code", string);
                bundle2.putString("client_id", h5.p.b());
                bundle2.putString("redirect_uri", redirectUri);
                bundle2.putString("code_verifier", str2);
                String str3 = h5.q.f17287j;
                g5 = q.c.g(null, "oauth/access_token", null);
                g5.k(h5.v.GET);
                g5.f17293d = bundle2;
            }
            if (g5 != null) {
                h5.u c10 = g5.c();
                h5.n nVar = c10.f17318c;
                if (nVar == null) {
                    try {
                        JSONObject jSONObject = c10.f17317b;
                        if (jSONObject != null) {
                            str = jSONObject.getString("access_token");
                        }
                        if (jSONObject != null && !e0.A(str)) {
                            bundle.putString("access_token", str);
                            if (jSONObject.has("id_token")) {
                                bundle.putString("id_token", jSONObject.getString("id_token"));
                                return;
                            }
                            return;
                        }
                        throw new FacebookException("No access token found from result");
                    } catch (JSONException e10) {
                        throw new FacebookException(kotlin.jvm.internal.i.n(e10.getMessage(), "Fail to process code exchange response: "));
                    }
                }
                throw new FacebookServiceException(nVar, nVar.a());
            }
            throw new FacebookException("Failed to create code exchange request");
        }
        throw new FacebookException("No code param found from the request");
    }

    public abstract int k(p.d dVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.i.g(dest, "dest");
        e0 e0Var = e0.f36453a;
        HashMap hashMap = this.f16347u;
        if (hashMap == null) {
            dest.writeInt(-1);
            return;
        }
        dest.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    public y(Parcel source) {
        HashMap hashMap;
        kotlin.jvm.internal.i.g(source, "source");
        e0 e0Var = e0.f36453a;
        int readInt = source.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            if (readInt > 0) {
                int i6 = 0;
                do {
                    i6++;
                    hashMap.put(source.readString(), source.readString());
                } while (i6 < readInt);
            }
        }
        this.f16347u = hashMap != null ? is.e0.z0(hashMap) : null;
    }

    public void b() {
    }

    public void j(JSONObject jSONObject) {
    }
}
