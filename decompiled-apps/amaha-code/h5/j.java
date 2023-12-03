package h5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.theinnerhour.b2b.utils.SessionManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: AuthenticationTokenClaims.kt */
/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final Set<String> H;
    public final String I;
    public final Map<String, Integer> J;
    public final Map<String, String> K;
    public final Map<String, String> L;
    public final String M;
    public final String N;

    /* renamed from: u  reason: collision with root package name */
    public final String f17250u;

    /* renamed from: v  reason: collision with root package name */
    public final String f17251v;

    /* renamed from: w  reason: collision with root package name */
    public final String f17252w;

    /* renamed from: x  reason: collision with root package name */
    public final String f17253x;

    /* renamed from: y  reason: collision with root package name */
    public final long f17254y;

    /* renamed from: z  reason: collision with root package name */
    public final long f17255z;

    /* compiled from: AuthenticationTokenClaims.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new j(source);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i6) {
            return new j[i6];
        }
    }

    /* compiled from: AuthenticationTokenClaims.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static String a(JSONObject jSONObject, String str) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (kotlin.jvm.internal.i.b(new java.net.URL(r4).getHost(), "www.facebook.com") == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(String encodedClaims, String expectedNonce) {
        String iss;
        boolean z10;
        Set<String> unmodifiableSet;
        kotlin.jvm.internal.i.g(encodedClaims, "encodedClaims");
        kotlin.jvm.internal.i.g(expectedNonce, "expectedNonce");
        w5.f0.b(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        kotlin.jvm.internal.i.f(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, gv.a.f16927b));
        String jti = jSONObject.optString("jti");
        kotlin.jvm.internal.i.f(jti, "jti");
        if (!(jti.length() == 0)) {
            try {
                iss = jSONObject.optString("iss");
                kotlin.jvm.internal.i.f(iss, "iss");
            } catch (MalformedURLException unused) {
            }
            if (!(iss.length() == 0)) {
                if (!kotlin.jvm.internal.i.b(new URL(iss).getHost(), "facebook.com")) {
                }
                String aud = jSONObject.optString("aud");
                kotlin.jvm.internal.i.f(aud, "aud");
                if (!(aud.length() == 0) && kotlin.jvm.internal.i.b(aud, p.b())) {
                    long j10 = 1000;
                    if (!new Date().after(new Date(jSONObject.optLong("exp") * j10))) {
                        if (!new Date().after(new Date((jSONObject.optLong("iat") * j10) + 600000))) {
                            String sub = jSONObject.optString("sub");
                            kotlin.jvm.internal.i.f(sub, "sub");
                            if (!(sub.length() == 0)) {
                                String nonce = jSONObject.optString("nonce");
                                kotlin.jvm.internal.i.f(nonce, "nonce");
                                if (!(nonce.length() == 0) && kotlin.jvm.internal.i.b(nonce, expectedNonce)) {
                                    z10 = true;
                                    if (!z10) {
                                        String string = jSONObject.getString("jti");
                                        kotlin.jvm.internal.i.f(string, "jsonObj.getString(JSON_KEY_JIT)");
                                        this.f17250u = string;
                                        String string2 = jSONObject.getString("iss");
                                        kotlin.jvm.internal.i.f(string2, "jsonObj.getString(JSON_KEY_ISS)");
                                        this.f17251v = string2;
                                        String string3 = jSONObject.getString("aud");
                                        kotlin.jvm.internal.i.f(string3, "jsonObj.getString(JSON_KEY_AUD)");
                                        this.f17252w = string3;
                                        String string4 = jSONObject.getString("nonce");
                                        kotlin.jvm.internal.i.f(string4, "jsonObj.getString(JSON_KEY_NONCE)");
                                        this.f17253x = string4;
                                        this.f17254y = jSONObject.getLong("exp");
                                        this.f17255z = jSONObject.getLong("iat");
                                        String string5 = jSONObject.getString("sub");
                                        kotlin.jvm.internal.i.f(string5, "jsonObj.getString(JSON_KEY_SUB)");
                                        this.A = string5;
                                        this.B = b.a(jSONObject, SessionManager.KEY_NAME);
                                        this.C = b.a(jSONObject, "given_name");
                                        this.D = b.a(jSONObject, "middle_name");
                                        this.E = b.a(jSONObject, "family_name");
                                        this.F = b.a(jSONObject, SessionManager.KEY_EMAIL);
                                        this.G = b.a(jSONObject, "picture");
                                        JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
                                        if (optJSONArray == null) {
                                            unmodifiableSet = null;
                                        } else {
                                            w5.e0 e0Var = w5.e0.f36453a;
                                            HashSet hashSet = new HashSet();
                                            int length = optJSONArray.length();
                                            if (length > 0) {
                                                int i6 = 0;
                                                while (true) {
                                                    int i10 = i6 + 1;
                                                    String string6 = optJSONArray.getString(i6);
                                                    kotlin.jvm.internal.i.f(string6, "jsonArray.getString(i)");
                                                    hashSet.add(string6);
                                                    if (i10 >= length) {
                                                        break;
                                                    }
                                                    i6 = i10;
                                                }
                                            }
                                            unmodifiableSet = Collections.unmodifiableSet(hashSet);
                                        }
                                        this.H = unmodifiableSet;
                                        this.I = b.a(jSONObject, "user_birthday");
                                        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
                                        this.J = optJSONObject == null ? null : Collections.unmodifiableMap(w5.e0.h(optJSONObject));
                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
                                        this.K = optJSONObject2 == null ? null : Collections.unmodifiableMap(w5.e0.i(optJSONObject2));
                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
                                        this.L = optJSONObject3 != null ? Collections.unmodifiableMap(w5.e0.i(optJSONObject3)) : null;
                                        this.M = b.a(jSONObject, "user_gender");
                                        this.N = b.a(jSONObject, "user_link");
                                        return;
                                    }
                                    throw new IllegalArgumentException("Invalid claims".toString());
                                }
                            }
                        }
                    }
                }
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f17250u);
        jSONObject.put("iss", this.f17251v);
        jSONObject.put("aud", this.f17252w);
        jSONObject.put("nonce", this.f17253x);
        jSONObject.put("exp", this.f17254y);
        jSONObject.put("iat", this.f17255z);
        String str = this.A;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.B;
        if (str2 != null) {
            jSONObject.put(SessionManager.KEY_NAME, str2);
        }
        String str3 = this.C;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.D;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.E;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.F;
        if (str6 != null) {
            jSONObject.put(SessionManager.KEY_EMAIL, str6);
        }
        String str7 = this.G;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set<String> set = this.H;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.I;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map<String, Integer> map = this.J;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map<String, String> map2 = this.K;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map<String, String> map3 = this.L;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.M;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.N;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (kotlin.jvm.internal.i.b(this.f17250u, jVar.f17250u) && kotlin.jvm.internal.i.b(this.f17251v, jVar.f17251v) && kotlin.jvm.internal.i.b(this.f17252w, jVar.f17252w) && kotlin.jvm.internal.i.b(this.f17253x, jVar.f17253x) && this.f17254y == jVar.f17254y && this.f17255z == jVar.f17255z && kotlin.jvm.internal.i.b(this.A, jVar.A) && kotlin.jvm.internal.i.b(this.B, jVar.B) && kotlin.jvm.internal.i.b(this.C, jVar.C) && kotlin.jvm.internal.i.b(this.D, jVar.D) && kotlin.jvm.internal.i.b(this.E, jVar.E) && kotlin.jvm.internal.i.b(this.F, jVar.F) && kotlin.jvm.internal.i.b(this.G, jVar.G) && kotlin.jvm.internal.i.b(this.H, jVar.H) && kotlin.jvm.internal.i.b(this.I, jVar.I) && kotlin.jvm.internal.i.b(this.J, jVar.J) && kotlin.jvm.internal.i.b(this.K, jVar.K) && kotlin.jvm.internal.i.b(this.L, jVar.L) && kotlin.jvm.internal.i.b(this.M, jVar.M) && kotlin.jvm.internal.i.b(this.N, jVar.N)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int c10 = pl.a.c(this.f17253x, pl.a.c(this.f17252w, pl.a.c(this.f17251v, pl.a.c(this.f17250u, 527, 31), 31), 31), 31);
        long j10 = this.f17254y;
        long j11 = this.f17255z;
        int c11 = pl.a.c(this.A, (((c10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31);
        int i6 = 0;
        String str = this.B;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (c11 + hashCode) * 31;
        String str2 = this.C;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.D;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.E;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.F;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str6 = this.G;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        Set<String> set = this.H;
        if (set == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = set.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str7 = this.I;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        Map<String, Integer> map = this.J;
        if (map == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = map.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        Map<String, String> map2 = this.K;
        if (map2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map2.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        Map<String, String> map3 = this.L;
        if (map3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = map3.hashCode();
        }
        int i20 = (i19 + hashCode11) * 31;
        String str8 = this.M;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i21 = (i20 + hashCode12) * 31;
        String str9 = this.N;
        if (str9 != null) {
            i6 = str9.hashCode();
        }
        return i21 + i6;
    }

    public final String toString() {
        String jSONObject = a().toString();
        kotlin.jvm.internal.i.f(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.i.g(dest, "dest");
        dest.writeString(this.f17250u);
        dest.writeString(this.f17251v);
        dest.writeString(this.f17252w);
        dest.writeString(this.f17253x);
        dest.writeLong(this.f17254y);
        dest.writeLong(this.f17255z);
        dest.writeString(this.A);
        dest.writeString(this.B);
        dest.writeString(this.C);
        dest.writeString(this.D);
        dest.writeString(this.E);
        dest.writeString(this.F);
        dest.writeString(this.G);
        Set<String> set = this.H;
        if (set == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(set));
        }
        dest.writeString(this.I);
        dest.writeMap(this.J);
        dest.writeMap(this.K);
        dest.writeMap(this.L);
        dest.writeString(this.M);
        dest.writeString(this.N);
    }

    public j(Parcel parcel) {
        kotlin.jvm.internal.i.g(parcel, "parcel");
        String readString = parcel.readString();
        w5.f0.d(readString, "jti");
        this.f17250u = readString;
        String readString2 = parcel.readString();
        w5.f0.d(readString2, "iss");
        this.f17251v = readString2;
        String readString3 = parcel.readString();
        w5.f0.d(readString3, "aud");
        this.f17252w = readString3;
        String readString4 = parcel.readString();
        w5.f0.d(readString4, "nonce");
        this.f17253x = readString4;
        this.f17254y = parcel.readLong();
        this.f17255z = parcel.readLong();
        String readString5 = parcel.readString();
        w5.f0.d(readString5, "sub");
        this.A = readString5;
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.H = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.I = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(kotlin.jvm.internal.h.class.getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.J = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(kotlin.jvm.internal.b0.class.getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.K = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(kotlin.jvm.internal.b0.class.getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.L = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.M = parcel.readString();
        this.N = parcel.readString();
    }
}
