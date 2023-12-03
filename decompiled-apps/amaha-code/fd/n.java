package fd;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.zzqx;
import com.theinnerhour.b2b.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new u();

    /* renamed from: u  reason: collision with root package name */
    public final String f14965u;

    /* renamed from: v  reason: collision with root package name */
    public final String f14966v;

    /* renamed from: w  reason: collision with root package name */
    public final long f14967w;

    /* renamed from: x  reason: collision with root package name */
    public final String f14968x;

    public n(long j10, String str, String str2, String str3) {
        v9.o.e(str);
        this.f14965u = str;
        this.f14966v = str2;
        this.f14967w = j10;
        v9.o.e(str3);
        this.f14968x = str3;
    }

    @Override // fd.j
    public final JSONObject f0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt(SessionManager.KEY_UID, this.f14965u);
            jSONObject.putOpt("displayName", this.f14966v);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f14967w));
            jSONObject.putOpt("phoneNumber", this.f14968x);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzqx(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f14965u);
        hc.d.x0(parcel, 2, this.f14966v);
        hc.d.u0(parcel, 3, this.f14967w);
        hc.d.x0(parcel, 4, this.f14968x);
        hc.d.C0(parcel, B0);
    }
}
