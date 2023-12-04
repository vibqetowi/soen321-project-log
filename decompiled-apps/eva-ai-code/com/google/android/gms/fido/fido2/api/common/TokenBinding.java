package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public class TokenBinding extends AbstractSafeParcelable {
    private final TokenBindingStatus zza;
    private final String zzb;
    public static final Parcelable.Creator<TokenBinding> CREATOR = new zzap();
    public static final TokenBinding SUPPORTED = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);
    public static final TokenBinding NOT_SUPPORTED = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
    /* loaded from: classes2.dex */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");
        
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new zzao();
        private final String zzb;

        TokenBindingStatus(String str) {
            this.zzb = str;
        }

        public static TokenBindingStatus fromString(String str) throws UnsupportedTokenBindingStatusException {
            TokenBindingStatus[] values;
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.zzb;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
    /* loaded from: classes2.dex */
    public static class UnsupportedTokenBindingStatusException extends Exception {
        public UnsupportedTokenBindingStatusException(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    public TokenBinding(String str) {
        this(TokenBindingStatus.PRESENT.toString(), (String) Preconditions.checkNotNull(str));
    }

    public boolean equals(Object obj) {
        if (obj instanceof TokenBinding) {
            TokenBinding tokenBinding = (TokenBinding) obj;
            return com.google.android.gms.internal.fido.zzar.zza(this.zza, tokenBinding.zza) && com.google.android.gms.internal.fido.zzar.zza(this.zzb, tokenBinding.zzb);
        }
        return false;
    }

    public String getTokenBindingId() {
        return this.zzb;
    }

    public String getTokenBindingStatusAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public JSONObject toJsonObject() throws JSONException {
        try {
            return new JSONObject().put("status", this.zza).put("id", this.zzb);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTokenBindingStatusAsString(), false);
        SafeParcelWriter.writeString(parcel, 3, getTokenBindingId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TokenBinding(String str, String str2) {
        Preconditions.checkNotNull(str);
        try {
            this.zza = TokenBindingStatus.fromString(str);
            this.zzb = str2;
        } catch (UnsupportedTokenBindingStatusException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
