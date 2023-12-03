package hn;

import android.os.Bundle;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.theinnerhour.b2b.components.login.model.SignupModel;
import com.theinnerhour.b2b.components.login.model.SignupResponse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import e4.l;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
/* compiled from: LoginSignupReworkRepository.kt */
/* loaded from: classes2.dex */
public final class n implements l.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ SignupModel f17882u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<SignupResponse> f17883v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ b f17884w;

    public n(SignupModel signupModel, kotlinx.coroutines.k kVar, b bVar) {
        this.f17882u = signupModel;
        this.f17883v = kVar;
        this.f17884w = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: Exception -> 0x020e, TryCatch #0 {Exception -> 0x020e, blocks: (B:3:0x000d, B:5:0x0015, B:12:0x0031, B:14:0x004c, B:16:0x005b, B:18:0x006e, B:20:0x0077, B:21:0x007c, B:23:0x0097, B:26:0x00b2, B:28:0x00b6), top: B:114:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097 A[Catch: Exception -> 0x020e, TryCatch #0 {Exception -> 0x020e, blocks: (B:3:0x000d, B:5:0x0015, B:12:0x0031, B:14:0x004c, B:16:0x005b, B:18:0x006e, B:20:0x0077, B:21:0x007c, B:23:0x0097, B:26:0x00b2, B:28:0x00b6), top: B:114:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c3 A[Catch: Exception -> 0x020c, TryCatch #2 {Exception -> 0x020c, blocks: (B:83:0x01bd, B:85:0x01c3, B:90:0x01d2, B:92:0x01d9, B:93:0x01e9, B:95:0x01f2, B:96:0x01f7, B:47:0x0131, B:58:0x016e, B:62:0x0180, B:65:0x0188, B:68:0x018f, B:71:0x0196, B:74:0x019d, B:77:0x01a4, B:80:0x01ab), top: B:115:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f2 A[Catch: Exception -> 0x020c, TryCatch #2 {Exception -> 0x020c, blocks: (B:83:0x01bd, B:85:0x01c3, B:90:0x01d2, B:92:0x01d9, B:93:0x01e9, B:95:0x01f2, B:96:0x01f7, B:47:0x0131, B:58:0x016e, B:62:0x0180, B:65:0x0188, B:68:0x018f, B:71:0x0196, B:74:0x019d, B:77:0x01a4, B:80:0x01ab), top: B:115:0x00b4 }] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    @Override // e4.l.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onErrorResponse(VolleyError volleyError) {
        SignupModel signupModel;
        Boolean bool;
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z11;
        e4.i iVar;
        String str5;
        Boolean bool2;
        boolean z12;
        String str6;
        e4.i iVar2;
        String str7 = "full_messages";
        SignupModel signupModel2 = this.f17882u;
        kotlinx.coroutines.j<SignupResponse> jVar = this.f17883v;
        try {
            String str8 = "SignUp failed. Please try again";
            String phone = signupModel2.getPhone();
            if (phone != null && (!gv.n.B0(phone))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                byte[] bArr = volleyError.f5870u.f13769b;
                kotlin.jvm.internal.i.f(bArr, "error.networkResponse.data");
                String str9 = new String(bArr, gv.a.f16927b);
                if (new JSONTokener(str9).nextValue() instanceof JSONObject) {
                    JSONObject jSONObject = new JSONObject(str9);
                    if (jSONObject.getJSONArray("errors").length() > 0) {
                        str8 = jSONObject.getJSONArray("errors").getString(0);
                        kotlin.jvm.internal.i.f(str8, "jsonObject.getJSONArray(\"errors\").getString(0)");
                        str6 = str8;
                        Bundle bundle = new Bundle();
                        iVar2 = volleyError.f5870u;
                        if (iVar2 != null) {
                            bundle.putInt("error_code", iVar2.f13768a);
                        }
                        bundle.putBoolean("email_exists", false);
                        bundle.putString("error_msg", str8);
                        bundle.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                        gk.a.b(bundle, "signup_error");
                        if (!jVar.a()) {
                            jVar.resumeWith(new SignupResponse(false, null, null, null, Boolean.FALSE, str6));
                            return;
                        }
                        return;
                    }
                }
                str6 = null;
                Bundle bundle2 = new Bundle();
                iVar2 = volleyError.f5870u;
                if (iVar2 != null) {
                }
                bundle2.putBoolean("email_exists", false);
                bundle2.putString("error_msg", str8);
                bundle2.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                gk.a.b(bundle2, "signup_error");
                if (!jVar.a()) {
                }
            } else {
                e4.i iVar3 = volleyError.f5870u;
                try {
                    try {
                        if (iVar3 != null) {
                            str = "SignUp failed. Please try again";
                            signupModel = signupModel2;
                            if (iVar3.f13768a == 422) {
                                byte[] bArr2 = iVar3.f13769b;
                                kotlin.jvm.internal.i.f(bArr2, "error.networkResponse.data");
                                String str10 = new String(bArr2, gv.a.f16927b);
                                if (new JSONTokener(str10).nextValue() instanceof JSONObject) {
                                    JSONObject jSONObject2 = new JSONObject(str10);
                                    if (jSONObject2.getJSONObject("errors").getJSONArray("full_messages").length() > 0) {
                                        str3 = jSONObject2.getJSONObject("errors").getJSONArray("full_messages").getString(0);
                                        kotlin.jvm.internal.i.f(str3, "jsonObject.getJSONObject…l_messages\").getString(0)");
                                    } else {
                                        str3 = str;
                                    }
                                    if (jSONObject2.getJSONObject("errors").has(SessionManager.KEY_EMAIL)) {
                                        JSONArray jSONArray = jSONObject2.getJSONObject("errors").getJSONArray(SessionManager.KEY_EMAIL);
                                        int length = jSONArray.length();
                                        for (int i6 = 0; i6 < length; i6++) {
                                            if (kotlin.jvm.internal.i.b(jSONArray.getString(i6), "has already been taken")) {
                                                z12 = true;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    str3 = new JSONArray(str10).getString(0);
                                    kotlin.jvm.internal.i.f(str3, "JSONArray(responseStr).getString(0)");
                                }
                                z12 = false;
                                z11 = z12;
                                str7 = null;
                                if (jVar.a()) {
                                    if (z11) {
                                        str5 = null;
                                    } else {
                                        str5 = str3;
                                    }
                                    if (z11) {
                                        bool2 = Boolean.TRUE;
                                    } else {
                                        bool2 = null;
                                    }
                                    jVar.resumeWith(new SignupResponse(false, null, str5, bool2, null, null, 48, null));
                                }
                                Bundle bundle3 = new Bundle();
                                iVar = volleyError.f5870u;
                                if (iVar != null) {
                                    bundle3.putInt("error_code", iVar.f13768a);
                                }
                                bundle3.putBoolean("email_exists", z11);
                                bundle3.putString("error_msg", str3);
                                bundle3.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                                gk.a.b(bundle3, "signup_error");
                            }
                        } else {
                            signupModel = signupModel2;
                            str = "SignUp failed. Please try again";
                        }
                        if (iVar3 != null && iVar3.f13768a == 300) {
                            byte[] bArr3 = iVar3.f13769b;
                            kotlin.jvm.internal.i.f(bArr3, "error.networkResponse.data");
                            Object obj = new JSONObject(new String(bArr3, gv.a.f16927b)).get("errors");
                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type org.json.JSONArray");
                            JSONArray jSONArray2 = (JSONArray) obj;
                            if (jSONArray2.length() > 0) {
                                str4 = null;
                                Object obj2 = jSONArray2.get(0);
                                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                                str3 = (String) obj2;
                                z11 = false;
                                str7 = str4;
                                if (jVar.a()) {
                                }
                                Bundle bundle32 = new Bundle();
                                iVar = volleyError.f5870u;
                                if (iVar != null) {
                                }
                                bundle32.putBoolean("email_exists", z11);
                                bundle32.putString("error_msg", str3);
                                bundle32.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                                gk.a.b(bundle32, "signup_error");
                            }
                            str2 = null;
                            str3 = str;
                            str4 = str2;
                            z11 = false;
                            str7 = str4;
                            if (jVar.a()) {
                            }
                            Bundle bundle322 = new Bundle();
                            iVar = volleyError.f5870u;
                            if (iVar != null) {
                            }
                            bundle322.putBoolean("email_exists", z11);
                            bundle322.putString("error_msg", str3);
                            bundle322.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                            gk.a.b(bundle322, "signup_error");
                        }
                        str2 = null;
                        str4 = null;
                        str4 = null;
                        str4 = null;
                        str4 = null;
                        str4 = null;
                        str4 = null;
                        if (volleyError instanceof NetworkError) {
                            str3 = "Cannot connect to internet!Please check your connection";
                        } else if (volleyError instanceof AuthFailureError) {
                            str3 = "Authentication Failure! Please try again after some time";
                        } else if (volleyError instanceof ParseError) {
                            str3 = "Parsing error! Please try again after some time";
                        } else if (volleyError instanceof NoConnectionError) {
                            str3 = "Could not connect! Please check your connection and try again.";
                        } else if (volleyError instanceof TimeoutError) {
                            str3 = "Connection TimeOut! Please check your internet connection.";
                        } else if (volleyError instanceof ServerError) {
                            str3 = "The server could not be found! Please try again after some time.";
                        } else {
                            LogHelper.INSTANCE.e("SignUpError", String.valueOf(volleyError.getMessage()));
                            str3 = str;
                            str4 = str2;
                        }
                        z11 = false;
                        str7 = str4;
                        if (jVar.a()) {
                        }
                        Bundle bundle3222 = new Bundle();
                        iVar = volleyError.f5870u;
                        if (iVar != null) {
                        }
                        bundle3222.putBoolean("email_exists", z11);
                        bundle3222.putString("error_msg", str3);
                        bundle3222.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                        gk.a.b(bundle3222, "signup_error");
                    } catch (Exception e10) {
                        e = e10;
                        str7 = null;
                        LogHelper.INSTANCE.e(this.f17884w.f17789a, "exception in error response", e);
                        if (!jVar.a()) {
                            String phone2 = signupModel.getPhone();
                            ?? r32 = str7;
                            if (phone2 != null) {
                                r32 = str7;
                                if (!gv.n.B0(phone2)) {
                                    r32 = 1;
                                }
                            }
                            if (r32 != 0) {
                                bool = Boolean.FALSE;
                            } else {
                                bool = null;
                            }
                            jVar.resumeWith(new SignupResponse(false, null, null, null, bool, null, 32, null));
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    LogHelper.INSTANCE.e(this.f17884w.f17789a, "exception in error response", e);
                    if (!jVar.a()) {
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
            signupModel = signupModel2;
        }
    }
}
