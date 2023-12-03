package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.theinnerhour.b2b.utils.SessionManager;
import i9.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import v9.o;
import w9.a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d();
    public String A;
    public final long B;
    public final String C;
    public final List<Scope> D;
    public final String E;
    public final String F;
    public final HashSet G = new HashSet();

    /* renamed from: u  reason: collision with root package name */
    public final int f7216u;

    /* renamed from: v  reason: collision with root package name */
    public final String f7217v;

    /* renamed from: w  reason: collision with root package name */
    public final String f7218w;

    /* renamed from: x  reason: collision with root package name */
    public final String f7219x;

    /* renamed from: y  reason: collision with root package name */
    public final String f7220y;

    /* renamed from: z  reason: collision with root package name */
    public final Uri f7221z;

    public GoogleSignInAccount(int i6, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f7216u = i6;
        this.f7217v = str;
        this.f7218w = str2;
        this.f7219x = str3;
        this.f7220y = str4;
        this.f7221z = uri;
        this.A = str5;
        this.B = j10;
        this.C = str6;
        this.D = arrayList;
        this.E = str7;
        this.F = str8;
    }

    public static GoogleSignInAccount g0(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i6 = 0; i6 < length; i6++) {
            hashSet.add(new Scope(1, jSONArray.getString(i6)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has(SessionManager.KEY_EMAIL)) {
            str3 = jSONObject.optString(SessionManager.KEY_EMAIL);
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        o.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, longValue, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        } else {
            str7 = null;
        }
        googleSignInAccount.A = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.C.equals(this.C) || !googleSignInAccount.f0().equals(f0())) {
            return false;
        }
        return true;
    }

    public final HashSet f0() {
        HashSet hashSet = new HashSet(this.D);
        hashSet.addAll(this.G);
        return hashSet;
    }

    public final int hashCode() {
        return f0().hashCode() + pl.a.c(this.C, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int B0 = hc.d.B0(parcel, 20293);
        hc.d.s0(parcel, 1, this.f7216u);
        hc.d.x0(parcel, 2, this.f7217v);
        hc.d.x0(parcel, 3, this.f7218w);
        hc.d.x0(parcel, 4, this.f7219x);
        hc.d.x0(parcel, 5, this.f7220y);
        hc.d.w0(parcel, 6, this.f7221z, i6);
        hc.d.x0(parcel, 7, this.A);
        hc.d.u0(parcel, 8, this.B);
        hc.d.x0(parcel, 9, this.C);
        hc.d.A0(parcel, 10, this.D);
        hc.d.x0(parcel, 11, this.E);
        hc.d.x0(parcel, 12, this.F);
        hc.d.C0(parcel, B0);
    }
}
