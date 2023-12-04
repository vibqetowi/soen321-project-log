package com.google.android.gms.fido.u2f.api.messagebased;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
@Deprecated
/* loaded from: classes2.dex */
public enum RequestType {
    REGISTER("u2f_register_request"),
    SIGN("u2f_sign_request");
    
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
    /* loaded from: classes2.dex */
    public static class UnsupportedRequestTypeException extends Exception {
        public UnsupportedRequestTypeException(String str) {
            super("Unsupported request type ".concat(String.valueOf(str)));
        }
    }

    RequestType(String str) {
        this.zzb = str;
    }

    public static RequestType fromString(String str) throws UnsupportedRequestTypeException {
        RequestType[] values;
        for (RequestType requestType : values()) {
            if (str.equals(requestType.zzb)) {
                return requestType;
            }
        }
        throw new UnsupportedRequestTypeException(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }
}
