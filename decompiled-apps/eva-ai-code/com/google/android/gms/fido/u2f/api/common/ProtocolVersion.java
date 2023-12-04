package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.io.UnsupportedEncodingException;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
@Deprecated
/* loaded from: classes2.dex */
public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");
    
    public static final Parcelable.Creator<ProtocolVersion> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.u2f.api.common.zzf
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return ProtocolVersion.fromString(parcel.readString());
            } catch (ProtocolVersion.UnsupportedProtocolException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new ProtocolVersion[i];
        }
    };
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
    /* loaded from: classes2.dex */
    public static class UnsupportedProtocolException extends Exception {
        public UnsupportedProtocolException(String str) {
            super(String.format("Protocol version %s not supported", str));
        }
    }

    ProtocolVersion(String str) {
        this.zzb = str;
    }

    public static ProtocolVersion fromBytes(byte[] bArr) throws UnsupportedProtocolException {
        try {
            return fromString(new String(bArr, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static ProtocolVersion fromString(String str) throws UnsupportedProtocolException {
        ProtocolVersion[] values;
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.zzb)) {
                return protocolVersion;
            }
        }
        throw new UnsupportedProtocolException(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isCompatible(ProtocolVersion protocolVersion) {
        ProtocolVersion protocolVersion2 = UNKNOWN;
        if (equals(protocolVersion2) || protocolVersion.equals(protocolVersion2)) {
            return true;
        }
        return equals(protocolVersion);
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
