package h5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AuthenticationTokenHeader.kt */
/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final String f17256u;

    /* renamed from: v  reason: collision with root package name */
    public final String f17257v;

    /* renamed from: w  reason: collision with root package name */
    public final String f17258w;

    /* compiled from: AuthenticationTokenHeader.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new k(source);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i6) {
            return new k[i6];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r4 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(String encodedHeaderString) {
        boolean z10;
        kotlin.jvm.internal.i.g(encodedHeaderString, "encodedHeaderString");
        w5.f0.b(encodedHeaderString, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        kotlin.jvm.internal.i.f(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, gv.a.f16927b));
            String alg = jSONObject.optString("alg");
            kotlin.jvm.internal.i.f(alg, "alg");
            z10 = true;
            boolean z11 = (alg.length() > 0) && kotlin.jvm.internal.i.b(alg, "RS256");
            String optString = jSONObject.optString("kid");
            kotlin.jvm.internal.i.f(optString, "jsonObj.optString(\"kid\")");
            boolean z12 = optString.length() > 0;
            String optString2 = jSONObject.optString("typ");
            kotlin.jvm.internal.i.f(optString2, "jsonObj.optString(\"typ\")");
            boolean z13 = optString2.length() > 0;
            if (z11) {
                if (z12) {
                }
            }
        } catch (JSONException unused) {
        }
        z10 = false;
        if (z10) {
            byte[] decodedBytes2 = Base64.decode(encodedHeaderString, 0);
            kotlin.jvm.internal.i.f(decodedBytes2, "decodedBytes");
            JSONObject jSONObject2 = new JSONObject(new String(decodedBytes2, gv.a.f16927b));
            String string = jSONObject2.getString("alg");
            kotlin.jvm.internal.i.f(string, "jsonObj.getString(\"alg\")");
            this.f17256u = string;
            String string2 = jSONObject2.getString("typ");
            kotlin.jvm.internal.i.f(string2, "jsonObj.getString(\"typ\")");
            this.f17257v = string2;
            String string3 = jSONObject2.getString("kid");
            kotlin.jvm.internal.i.f(string3, "jsonObj.getString(\"kid\")");
            this.f17258w = string3;
            return;
        }
        throw new IllegalArgumentException("Invalid Header".toString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kotlin.jvm.internal.i.b(this.f17256u, kVar.f17256u) && kotlin.jvm.internal.i.b(this.f17257v, kVar.f17257v) && kotlin.jvm.internal.i.b(this.f17258w, kVar.f17258w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17258w.hashCode() + pl.a.c(this.f17257v, pl.a.c(this.f17256u, 527, 31), 31);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f17256u);
        jSONObject.put("typ", this.f17257v);
        jSONObject.put("kid", this.f17258w);
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "headerJsonObject.toString()");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.i.g(dest, "dest");
        dest.writeString(this.f17256u);
        dest.writeString(this.f17257v);
        dest.writeString(this.f17258w);
    }

    public k(Parcel parcel) {
        kotlin.jvm.internal.i.g(parcel, "parcel");
        String readString = parcel.readString();
        w5.f0.d(readString, "alg");
        this.f17256u = readString;
        String readString2 = parcel.readString();
        w5.f0.d(readString2, "typ");
        this.f17257v = readString2;
        String readString3 = parcel.readString();
        w5.f0.d(readString3, "kid");
        this.f17258w = readString3;
    }
}
