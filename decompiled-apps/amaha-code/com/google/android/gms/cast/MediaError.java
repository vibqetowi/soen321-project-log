package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import hc.d;
import k9.h0;
import org.json.JSONObject;
import w9.a;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public class MediaError extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaError> CREATOR = new h0();

    /* renamed from: u  reason: collision with root package name */
    public final String f7253u;

    /* renamed from: v  reason: collision with root package name */
    public final long f7254v;

    /* renamed from: w  reason: collision with root package name */
    public final Integer f7255w;

    /* renamed from: x  reason: collision with root package name */
    public final String f7256x;

    /* renamed from: y  reason: collision with root package name */
    public String f7257y;

    /* renamed from: z  reason: collision with root package name */
    public final JSONObject f7258z;

    public MediaError(String str, long j10, Integer num, String str2, JSONObject jSONObject) {
        this.f7253u = str;
        this.f7254v = j10;
        this.f7255w = num;
        this.f7256x = str2;
        this.f7258z = jSONObject;
    }

    @RecentlyNonNull
    public static MediaError f0(@RecentlyNonNull JSONObject jSONObject) {
        Integer num;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type", "ERROR");
        long optLong = jSONObject.optLong("requestId");
        if (jSONObject.has("detailedErrorCode")) {
            num = Integer.valueOf(jSONObject.optInt("detailedErrorCode"));
        } else {
            num = null;
        }
        String b10 = p9.a.b(jSONObject, "reason");
        if (jSONObject.has("customData")) {
            jSONObject2 = jSONObject.optJSONObject("customData");
        } else {
            jSONObject2 = null;
        }
        return new MediaError(optString, optLong, num, b10, jSONObject2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        String jSONObject;
        JSONObject jSONObject2 = this.f7258z;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f7257y = jSONObject;
        int B0 = d.B0(parcel, 20293);
        d.x0(parcel, 2, this.f7253u);
        d.u0(parcel, 3, this.f7254v);
        Integer num = this.f7255w;
        if (num != null) {
            parcel.writeInt(262148);
            parcel.writeInt(num.intValue());
        }
        d.x0(parcel, 5, this.f7256x);
        d.x0(parcel, 6, this.f7257y);
        d.C0(parcel, B0);
    }
}
