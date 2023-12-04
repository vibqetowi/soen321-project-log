package com.google.android.gms.fido.u2f.api.common;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
@Deprecated
/* loaded from: classes2.dex */
public class Error {
    public static final String JSON_ERROR_CODE = "errorCode";
    public static final String JSON_ERROR_MESSAGE = "errorMessage";
    private final ErrorCode zza;
    private final String zzb;

    public Error(ErrorCode errorCode) {
        this.zza = errorCode;
        this.zzb = null;
    }

    public Error(ErrorCode errorCode, String str) {
        this.zza = errorCode;
        this.zzb = str;
    }

    public ErrorCode getErrorCode() {
        return this.zza;
    }

    public String getErrorMessage() {
        return this.zzb;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.zza.getCode());
            String str = this.zzb;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.zzb == null ? String.format(Locale.ENGLISH, "{errorCode: %d}", Integer.valueOf(this.zza.getCode())) : String.format(Locale.ENGLISH, "{errorCode: %d, errorMessage: %s}", Integer.valueOf(this.zza.getCode()), this.zzb);
    }
}
