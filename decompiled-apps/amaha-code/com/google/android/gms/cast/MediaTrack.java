package com.google.android.gms.cast;

import aa.f;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import hc.d;
import java.util.Arrays;
import java.util.List;
import k9.q0;
import org.json.JSONObject;
import w9.a;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class MediaTrack extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MediaTrack> CREATOR = new q0();
    public final int A;
    public final List<String> B;
    public String C;
    public final JSONObject D;

    /* renamed from: u  reason: collision with root package name */
    public final long f7265u;

    /* renamed from: v  reason: collision with root package name */
    public final int f7266v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7267w;

    /* renamed from: x  reason: collision with root package name */
    public final String f7268x;

    /* renamed from: y  reason: collision with root package name */
    public final String f7269y;

    /* renamed from: z  reason: collision with root package name */
    public final String f7270z;

    public MediaTrack(long j10, int i6, String str, String str2, String str3, String str4, int i10, List<String> list, JSONObject jSONObject) {
        this.f7265u = j10;
        this.f7266v = i6;
        this.f7267w = str;
        this.f7268x = str2;
        this.f7269y = str3;
        this.f7270z = str4;
        this.A = i10;
        this.B = list;
        this.D = jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.D;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = mediaTrack.D;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || f.a(jSONObject, jSONObject2)) && this.f7265u == mediaTrack.f7265u && this.f7266v == mediaTrack.f7266v && p9.a.e(this.f7267w, mediaTrack.f7267w) && p9.a.e(this.f7268x, mediaTrack.f7268x) && p9.a.e(this.f7269y, mediaTrack.f7269y) && p9.a.e(this.f7270z, mediaTrack.f7270z) && this.A == mediaTrack.A && p9.a.e(this.B, mediaTrack.B)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7265u), Integer.valueOf(this.f7266v), this.f7267w, this.f7268x, this.f7269y, this.f7270z, Integer.valueOf(this.A), this.B, String.valueOf(this.D)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i6) {
        String jSONObject;
        JSONObject jSONObject2 = this.D;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.C = jSONObject;
        int B0 = d.B0(parcel, 20293);
        d.u0(parcel, 2, this.f7265u);
        d.s0(parcel, 3, this.f7266v);
        d.x0(parcel, 4, this.f7267w);
        d.x0(parcel, 5, this.f7268x);
        d.x0(parcel, 6, this.f7269y);
        d.x0(parcel, 7, this.f7270z);
        d.s0(parcel, 8, this.A);
        d.y0(parcel, 9, this.B);
        d.x0(parcel, 10, this.C);
        d.C0(parcel, B0);
    }
}
