package com.google.android.gms.fido.u2f.api.messagebased;

import com.google.android.gms.fido.u2f.api.messagebased.RequestType;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
@Deprecated
/* loaded from: classes2.dex */
public enum ResponseType {
    REGISTER("u2f_register_response"),
    SIGN("u2f_sign_response");
    
    private final String zzb;

    ResponseType(String str) {
        this.zzb = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }

    public static ResponseType getResponseTypeForRequestType(RequestType requestType) throws RequestType.UnsupportedRequestTypeException {
        if (requestType == null) {
            throw new RequestType.UnsupportedRequestTypeException(null);
        }
        int ordinal = requestType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return SIGN;
            }
            throw new RequestType.UnsupportedRequestTypeException(requestType.toString());
        }
        return REGISTER;
    }
}
