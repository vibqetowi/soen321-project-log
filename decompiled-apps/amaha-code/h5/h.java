package h5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AuthenticationTokenManager;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AuthenticationToken.kt */
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public final String f17244u;

    /* renamed from: v  reason: collision with root package name */
    public final String f17245v;

    /* renamed from: w  reason: collision with root package name */
    public final k f17246w;

    /* renamed from: x  reason: collision with root package name */
    public final j f17247x;

    /* renamed from: y  reason: collision with root package name */
    public final String f17248y;

    /* compiled from: AuthenticationToken.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new h(source);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i6) {
            return new h[i6];
        }
    }

    /* compiled from: AuthenticationToken.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(h hVar) {
            AuthenticationTokenManager.a aVar = AuthenticationTokenManager.f6088d;
            AuthenticationTokenManager authenticationTokenManager = AuthenticationTokenManager.f6089e;
            if (authenticationTokenManager == null) {
                synchronized (aVar) {
                    authenticationTokenManager = AuthenticationTokenManager.f6089e;
                    if (authenticationTokenManager == null) {
                        n1.a a10 = n1.a.a(p.a());
                        kotlin.jvm.internal.i.f(a10, "getInstance(applicationContext)");
                        AuthenticationTokenManager authenticationTokenManager2 = new AuthenticationTokenManager(a10, new i());
                        AuthenticationTokenManager.f6089e = authenticationTokenManager2;
                        authenticationTokenManager = authenticationTokenManager2;
                    }
                }
            }
            h hVar2 = authenticationTokenManager.f6092c;
            authenticationTokenManager.f6092c = hVar;
            i iVar = authenticationTokenManager.f6091b;
            if (hVar != null) {
                iVar.getClass();
                try {
                    iVar.f17249a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", hVar.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                iVar.f17249a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
                w5.e0 e0Var = w5.e0.f36453a;
                w5.e0.d(p.a());
            }
            if (!w5.e0.a(hVar2, hVar)) {
                Intent intent = new Intent(p.a(), AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
                intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", hVar2);
                intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", hVar);
                authenticationTokenManager.f6090a.c(intent);
            }
        }
    }

    public h(String str, String expectedNonce) {
        kotlin.jvm.internal.i.g(expectedNonce, "expectedNonce");
        w5.f0.b(str, "token");
        w5.f0.b(expectedNonce, "expectedNonce");
        boolean z10 = false;
        List a12 = gv.r.a1(str, new String[]{"."}, 0, 6);
        if (a12.size() == 3) {
            String str2 = (String) a12.get(0);
            String str3 = (String) a12.get(1);
            String str4 = (String) a12.get(2);
            this.f17244u = str;
            this.f17245v = expectedNonce;
            k kVar = new k(str2);
            this.f17246w = kVar;
            this.f17247x = new j(str3, expectedNonce);
            try {
                String H0 = f6.b.H0(kVar.f17258w);
                if (H0 != null) {
                    PublicKey G0 = f6.b.G0(H0);
                    z10 = f6.b.V0(G0, str2 + '.' + str3, str4);
                }
            } catch (IOException | InvalidKeySpecException unused) {
            }
            if (z10) {
                this.f17248y = str4;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f17244u);
        jSONObject.put("expected_nonce", this.f17245v);
        k kVar = this.f17246w;
        kVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", kVar.f17256u);
        jSONObject2.put("typ", kVar.f17257v);
        jSONObject2.put("kid", kVar.f17258w);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.f17247x.a());
        jSONObject.put("signature", this.f17248y);
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.i.b(this.f17244u, hVar.f17244u) && kotlin.jvm.internal.i.b(this.f17245v, hVar.f17245v) && kotlin.jvm.internal.i.b(this.f17246w, hVar.f17246w) && kotlin.jvm.internal.i.b(this.f17247x, hVar.f17247x) && kotlin.jvm.internal.i.b(this.f17248y, hVar.f17248y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int c10 = pl.a.c(this.f17245v, pl.a.c(this.f17244u, 527, 31), 31);
        int hashCode = this.f17247x.hashCode();
        return this.f17248y.hashCode() + ((hashCode + ((this.f17246w.hashCode() + c10) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.i.g(dest, "dest");
        dest.writeString(this.f17244u);
        dest.writeString(this.f17245v);
        dest.writeParcelable(this.f17246w, i6);
        dest.writeParcelable(this.f17247x, i6);
        dest.writeString(this.f17248y);
    }

    public h(Parcel parcel) {
        kotlin.jvm.internal.i.g(parcel, "parcel");
        String readString = parcel.readString();
        w5.f0.d(readString, "token");
        this.f17244u = readString;
        String readString2 = parcel.readString();
        w5.f0.d(readString2, "expectedNonce");
        this.f17245v = readString2;
        Parcelable readParcelable = parcel.readParcelable(k.class.getClassLoader());
        if (readParcelable != null) {
            this.f17246w = (k) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(j.class.getClassLoader());
            if (readParcelable2 != null) {
                this.f17247x = (j) readParcelable2;
                String readString3 = parcel.readString();
                w5.f0.d(readString3, "signature");
                this.f17248y = readString3;
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
