package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import hc.d;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k9.y0;
import w9.a;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public class CastDevice extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CastDevice> CREATOR = new y0();
    public final int A;
    public final List<u9.a> B;
    public final int C;
    public final int D;
    public final String E;
    public final String F;
    public final int G;
    public final String H;
    public final byte[] I;
    public final String J;
    public final boolean K;

    /* renamed from: u  reason: collision with root package name */
    public final String f7247u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7248v;

    /* renamed from: w  reason: collision with root package name */
    public final InetAddress f7249w;

    /* renamed from: x  reason: collision with root package name */
    public final String f7250x;

    /* renamed from: y  reason: collision with root package name */
    public final String f7251y;

    /* renamed from: z  reason: collision with root package name */
    public final String f7252z;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i6, ArrayList arrayList, int i10, int i11, String str6, String str7, int i12, String str8, byte[] bArr, String str9, boolean z10) {
        this.f7247u = str == null ? "" : str;
        String str10 = str2 == null ? "" : str2;
        this.f7248v = str10;
        if (!TextUtils.isEmpty(str10)) {
            try {
                this.f7249w = InetAddress.getByName(str10);
            } catch (UnknownHostException e10) {
                String str11 = this.f7248v;
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str11).length() + 48 + String.valueOf(message).length());
                sb2.append("Unable to convert host address (");
                sb2.append(str11);
                sb2.append(") to ipaddress: ");
                sb2.append(message);
                Log.i("CastDevice", sb2.toString());
            }
        }
        this.f7250x = str3 == null ? "" : str3;
        this.f7251y = str4 == null ? "" : str4;
        this.f7252z = str5 == null ? "" : str5;
        this.A = i6;
        this.B = arrayList != null ? arrayList : new ArrayList();
        this.C = i10;
        this.D = i11;
        this.E = str6 != null ? str6 : "";
        this.F = str7;
        this.G = i12;
        this.H = str8;
        this.I = bArr;
        this.J = str9;
        this.K = z10;
    }

    @RecentlyNullable
    public static CastDevice f0(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final boolean equals(Object obj) {
        int i6;
        int i10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.f7247u;
        if (str == null) {
            if (castDevice.f7247u == null) {
                return true;
            }
            return false;
        }
        if (p9.a.e(str, castDevice.f7247u) && p9.a.e(this.f7249w, castDevice.f7249w) && p9.a.e(this.f7251y, castDevice.f7251y) && p9.a.e(this.f7250x, castDevice.f7250x)) {
            String str2 = this.f7252z;
            String str3 = castDevice.f7252z;
            if (p9.a.e(str2, str3) && (i6 = this.A) == (i10 = castDevice.A) && p9.a.e(this.B, castDevice.B) && this.C == castDevice.C && this.D == castDevice.D && p9.a.e(this.E, castDevice.E) && p9.a.e(Integer.valueOf(this.G), Integer.valueOf(castDevice.G)) && p9.a.e(this.H, castDevice.H) && p9.a.e(this.F, castDevice.F) && p9.a.e(str2, str3) && i6 == i10) {
                byte[] bArr = castDevice.I;
                byte[] bArr2 = this.I;
                if (((bArr2 == null && bArr == null) || Arrays.equals(bArr2, bArr)) && p9.a.e(this.J, castDevice.J) && this.K == castDevice.K) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g0(int i6) {
        if ((this.C & i6) == i6) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7247u;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @RecentlyNonNull
    public final String toString() {
        return String.format("\"%s\" (%s)", this.f7250x, this.f7247u);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 2, this.f7247u);
        d.x0(parcel, 3, this.f7248v);
        d.x0(parcel, 4, this.f7250x);
        d.x0(parcel, 5, this.f7251y);
        d.x0(parcel, 6, this.f7252z);
        d.s0(parcel, 7, this.A);
        d.A0(parcel, 8, Collections.unmodifiableList(this.B));
        d.s0(parcel, 9, this.C);
        d.s0(parcel, 10, this.D);
        d.x0(parcel, 11, this.E);
        d.x0(parcel, 12, this.F);
        d.s0(parcel, 13, this.G);
        d.x0(parcel, 14, this.H);
        byte[] bArr = this.I;
        if (bArr != null) {
            int B02 = d.B0(parcel, 15);
            parcel.writeByteArray(bArr);
            d.C0(parcel, B02);
        }
        d.x0(parcel, 16, this.J);
        d.o0(parcel, 17, this.K);
        d.C0(parcel, B0);
    }
}
