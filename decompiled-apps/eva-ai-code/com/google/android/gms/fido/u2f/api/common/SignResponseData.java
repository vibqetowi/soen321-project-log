package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.fido.zzap;
import com.google.android.gms.internal.fido.zzaq;
import com.google.android.gms.internal.fido.zzbl;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
@Deprecated
/* loaded from: classes2.dex */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new zzl();
    public static final String JSON_RESPONSE_DATA_CLIENT_DATA = "clientData";
    public static final String JSON_RESPONSE_DATA_KEY_HANDLE = "keyHandle";
    public static final String JSON_RESPONSE_DATA_SIGNATURE_DATA = "signatureData";
    private final byte[] zza;
    private final String zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    @Deprecated
    public SignResponseData(byte[] bArr, String str, byte[] bArr2) {
        this(bArr, str, bArr2, new byte[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SignResponseData) {
            SignResponseData signResponseData = (SignResponseData) obj;
            return Arrays.equals(this.zza, signResponseData.zza) && Objects.equal(this.zzb, signResponseData.zzb) && Arrays.equals(this.zzc, signResponseData.zzc) && Arrays.equals(this.zzd, signResponseData.zzd);
        }
        return false;
    }

    public String getClientDataString() {
        return this.zzb;
    }

    public byte[] getKeyHandle() {
        return this.zza;
    }

    public byte[] getSignatureData() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)));
    }

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public JSONObject toJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JSON_RESPONSE_DATA_KEY_HANDLE, Base64.encodeToString(this.zza, 11));
            jSONObject.put(JSON_RESPONSE_DATA_CLIENT_DATA, Base64.encodeToString(this.zzb.getBytes(), 11));
            jSONObject.put(JSON_RESPONSE_DATA_SIGNATURE_DATA, Base64.encodeToString(this.zzc, 11));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        zzap zza = zzaq.zza(this);
        zzbl zzd = zzbl.zzd();
        byte[] bArr = this.zza;
        zza.zzb(JSON_RESPONSE_DATA_KEY_HANDLE, zzd.zze(bArr, 0, bArr.length));
        zza.zzb("clientDataString", this.zzb);
        zzbl zzd2 = zzbl.zzd();
        byte[] bArr2 = this.zzc;
        zza.zzb(JSON_RESPONSE_DATA_SIGNATURE_DATA, zzd2.zze(bArr2, 0, bArr2.length));
        zzbl zzd3 = zzbl.zzd();
        byte[] bArr3 = this.zzd;
        zza.zzb(MimeTypes.BASE_TYPE_APPLICATION, zzd3.zze(bArr3, 0, bArr3.length));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeString(parcel, 3, getClientDataString(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getSignatureData(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (String) Preconditions.checkNotNull(str);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzd = (byte[]) Preconditions.checkNotNull(bArr3);
    }
}
