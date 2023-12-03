package gd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.ef;
import com.google.android.gms.internal.p000firebaseauthapi.zzqx;
import com.theinnerhour.b2b.utils.SessionManager;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class h0 extends w9.a implements fd.q {
    public static final Parcelable.Creator<h0> CREATOR = new i0();
    public final boolean A;
    public final String B;

    /* renamed from: u  reason: collision with root package name */
    public final String f16415u;

    /* renamed from: v  reason: collision with root package name */
    public final String f16416v;

    /* renamed from: w  reason: collision with root package name */
    public final String f16417w;

    /* renamed from: x  reason: collision with root package name */
    public final String f16418x;

    /* renamed from: y  reason: collision with root package name */
    public final String f16419y;

    /* renamed from: z  reason: collision with root package name */
    public final String f16420z;

    public h0(ef efVar) {
        v9.o.h(efVar);
        v9.o.e("firebase");
        String str = efVar.f7826u;
        v9.o.e(str);
        this.f16415u = str;
        this.f16416v = "firebase";
        this.f16419y = efVar.f7827v;
        this.f16417w = efVar.f7829x;
        Uri parse = !TextUtils.isEmpty(efVar.f7830y) ? Uri.parse(efVar.f7830y) : null;
        if (parse != null) {
            this.f16418x = parse.toString();
        }
        this.A = efVar.f7828w;
        this.B = null;
        this.f16420z = efVar.B;
    }

    @Override // fd.q
    public final String J() {
        return this.f16416v;
    }

    public final String f0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(SessionManager.KEY_USERID, this.f16415u);
            jSONObject.putOpt("providerId", this.f16416v);
            jSONObject.putOpt("displayName", this.f16417w);
            jSONObject.putOpt("photoUrl", this.f16418x);
            jSONObject.putOpt(SessionManager.KEY_EMAIL, this.f16419y);
            jSONObject.putOpt("phoneNumber", this.f16420z);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.A));
            jSONObject.putOpt("rawUserInfo", this.B);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzqx(e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.x0(parcel, 1, this.f16415u);
        hc.d.x0(parcel, 2, this.f16416v);
        hc.d.x0(parcel, 3, this.f16417w);
        hc.d.x0(parcel, 4, this.f16418x);
        hc.d.x0(parcel, 5, this.f16419y);
        hc.d.x0(parcel, 6, this.f16420z);
        hc.d.o0(parcel, 7, this.A);
        hc.d.x0(parcel, 8, this.B);
        hc.d.C0(parcel, B0);
    }

    public h0(com.google.android.gms.internal.p000firebaseauthapi.c cVar) {
        v9.o.h(cVar);
        this.f16415u = cVar.f7740u;
        String str = cVar.f7743x;
        v9.o.e(str);
        this.f16416v = str;
        this.f16417w = cVar.f7741v;
        String str2 = cVar.f7742w;
        Uri parse = !TextUtils.isEmpty(str2) ? Uri.parse(str2) : null;
        if (parse != null) {
            this.f16418x = parse.toString();
        }
        this.f16419y = cVar.A;
        this.f16420z = cVar.f7745z;
        this.A = false;
        this.B = cVar.f7744y;
    }

    public h0(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f16415u = str;
        this.f16416v = str2;
        this.f16419y = str3;
        this.f16420z = str4;
        this.f16417w = str5;
        this.f16418x = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.A = z10;
        this.B = str7;
    }
}
