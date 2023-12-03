package com.theinnerhour.b2b.utils;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import kotlin.Metadata;
import org.json.JSONObject;
/* compiled from: TherapistDataCacheUtil.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/theinnerhour/b2b/utils/TherapistDataCacheUtil;", "", "Lkotlin/Function1;", "Lcom/theinnerhour/b2b/components/telecommunications/model/TherapistPackagesModel;", "Lhs/k;", "therapistObjCallback", "getTherapist", "Lorg/json/JSONObject;", "response", "parseResponse", "", "TAG", "Ljava/lang/String;", "sharedPreferenceTag", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TherapistDataCacheUtil {
    private final String TAG = LogHelper.INSTANCE.makeLogTag(TherapistDataCacheUtil.class);
    private final String sharedPreferenceTag = "therapist_data_cache";

    public static final void getTherapist$lambda$0(TherapistDataCacheUtil this$0, ss.l therapistObjCallback, JSONObject jSONObject) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(therapistObjCallback, "$therapistObjCallback");
        try {
            ApplicationPersistence.getInstance().setStringValue(this$0.sharedPreferenceTag, jSONObject.toString());
            therapistObjCallback.invoke(this$0.parseResponse(jSONObject));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.TAG, "exception in my therapist response", e10);
            therapistObjCallback.invoke(null);
        }
    }

    public final void getTherapist(final ss.l<? super TherapistPackagesModel, hs.k> therapistObjCallback) {
        boolean z10;
        kotlin.jvm.internal.i.g(therapistObjCallback, "therapistObjCallback");
        String stringValue = ApplicationPersistence.getInstance().getStringValue(this.sharedPreferenceTag);
        if (stringValue != null && stringValue.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            therapistObjCallback.invoke(parseResponse(new JSONObject(stringValue)));
        }
        VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/mytherapistsummary", null, new qk.a(this, 5, therapistObjCallback), new CustomVolleyErrorListener() { // from class: com.theinnerhour.b2b.utils.TherapistDataCacheUtil$getTherapist$jsonObjectRequest$2
            @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
            public void onErrorResponse(VolleyError error) {
                String str;
                String str2;
                kotlin.jvm.internal.i.g(error, "error");
                try {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    str2 = TherapistDataCacheUtil.this.TAG;
                    logHelper.e(str2, "https://api.theinnerhour.com/v1/mytherapistsummary", error);
                    super.onErrorResponse(error);
                } catch (Exception e10) {
                    LogHelper logHelper2 = LogHelper.INSTANCE;
                    str = TherapistDataCacheUtil.this.TAG;
                    logHelper2.e(str, "https://api.theinnerhour.com/v1/mytherapistsummary", e10);
                }
                therapistObjCallback.invoke(null);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x004c A[Catch: Exception -> 0x0083, TRY_ENTER, TryCatch #2 {Exception -> 0x0083, blocks: (B:55:0x000a, B:58:0x0014, B:60:0x001a, B:66:0x0026, B:68:0x0030, B:75:0x004c, B:77:0x0052, B:79:0x0058, B:83:0x0061, B:85:0x006b), top: B:97:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TherapistPackagesModel parseResponse(JSONObject response) {
        boolean z10;
        boolean z11;
        TherapistPackagesModel therapistPackagesModel;
        kotlin.jvm.internal.i.g(response, "response");
        TherapistPackagesModel therapistPackagesModel2 = null;
        try {
            boolean z12 = false;
            if (response.has("therapist")) {
                String string = response.getString("therapist");
                if (string != null && string.length() != 0) {
                    z11 = false;
                    if (!z11 && !kotlin.jvm.internal.i.b(response.getString("therapist"), "null")) {
                        therapistPackagesModel = new TherapistPackagesModel();
                        try {
                            Utils utils = Utils.INSTANCE;
                            JSONObject jSONObject = response.getJSONObject("therapist");
                            kotlin.jvm.internal.i.f(jSONObject, "response.getJSONObject(\"therapist\")");
                            utils.parseTherapistObject(therapistPackagesModel, jSONObject);
                            therapistPackagesModel2 = therapistPackagesModel;
                            z10 = false;
                            if (z10 && response.has("couplestherapist")) {
                                String string2 = response.getString("couplestherapist");
                                if (!((string2 == null || string2.length() == 0) ? true : true) && !kotlin.jvm.internal.i.b(response.getString("couplestherapist"), "null")) {
                                    TherapistPackagesModel therapistPackagesModel3 = new TherapistPackagesModel();
                                    try {
                                        Utils utils2 = Utils.INSTANCE;
                                        JSONObject jSONObject2 = response.getJSONObject("couplestherapist");
                                        kotlin.jvm.internal.i.f(jSONObject2, "response.getJSONObject(\"couplestherapist\")");
                                        utils2.parseTherapistObject(therapistPackagesModel3, jSONObject2);
                                        return therapistPackagesModel3;
                                    } catch (Exception e10) {
                                        e = e10;
                                        therapistPackagesModel2 = therapistPackagesModel3;
                                        LogHelper.INSTANCE.e(this.TAG, "exception", e);
                                        return therapistPackagesModel2;
                                    }
                                }
                                return therapistPackagesModel2;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            therapistPackagesModel2 = therapistPackagesModel;
                            LogHelper.INSTANCE.e(this.TAG, "exception", e);
                            return therapistPackagesModel2;
                        }
                    }
                }
                z11 = true;
                if (!z11) {
                    therapistPackagesModel = new TherapistPackagesModel();
                    Utils utils3 = Utils.INSTANCE;
                    JSONObject jSONObject3 = response.getJSONObject("therapist");
                    kotlin.jvm.internal.i.f(jSONObject3, "response.getJSONObject(\"therapist\")");
                    utils3.parseTherapistObject(therapistPackagesModel, jSONObject3);
                    therapistPackagesModel2 = therapistPackagesModel;
                    z10 = false;
                    return z10 ? therapistPackagesModel2 : therapistPackagesModel2;
                }
            }
            z10 = true;
            if (z10) {
            }
        } catch (Exception e12) {
            e = e12;
        }
    }
}
