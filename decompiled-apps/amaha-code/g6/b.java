package g6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import g6.c;
import g6.p;
import java.math.BigInteger;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
/* compiled from: CustomTabLoginMethodHandler.kt */
/* loaded from: classes.dex */
public final class b extends c0 {
    public static boolean C;
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final String A;
    public final h5.g B;

    /* renamed from: x  reason: collision with root package name */
    public String f16231x;

    /* renamed from: y  reason: collision with root package name */
    public final String f16232y;

    /* renamed from: z  reason: collision with root package name */
    public final String f16233z;

    /* compiled from: CustomTabLoginMethodHandler.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new b(source);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i6) {
            return new b[i6];
        }
    }

    public b(p pVar) {
        super(pVar);
        this.A = "custom_tab";
        this.B = h5.g.CHROME_CUSTOM_TAB;
        e0 e0Var = e0.f36453a;
        String bigInteger = new BigInteger(100, new Random()).toString(32);
        kotlin.jvm.internal.i.f(bigInteger, "BigInteger(length * 5, r).toString(32)");
        this.f16232y = bigInteger;
        C = false;
        String[] strArr = w5.f.f36460a;
        this.f16233z = w5.f.c(super.f());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // g6.y
    public final String e() {
        return this.A;
    }

    @Override // g6.y
    public final String f() {
        return this.f16233z;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    @Override // g6.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i6, int i10, Intent intent) {
        p.d dVar;
        String str;
        int parseInt;
        boolean z10 = false;
        if ((intent != null && intent.getBooleanExtra(CustomTabMainActivity.C, false)) || i6 != 1 || (dVar = d().A) == null) {
            return false;
        }
        if (i10 == -1) {
            if (intent != null) {
                str = intent.getStringExtra(CustomTabMainActivity.f6100z);
            } else {
                str = null;
            }
            if (str != null && (gv.n.H0(str, "fbconnect://cct.") || gv.n.H0(str, super.f()))) {
                Uri parse = Uri.parse(str);
                e0 e0Var = e0.f36453a;
                Bundle F = e0.F(parse.getQuery());
                F.putAll(e0.F(parse.getFragment()));
                try {
                    String string = F.getString("state");
                    if (string != null) {
                        z10 = kotlin.jvm.internal.i.b(new JSONObject(string).getString("7_challenge"), this.f16232y);
                    }
                } catch (JSONException unused) {
                }
                if (!z10) {
                    n(dVar, null, new FacebookException("Invalid state parameter"));
                } else {
                    String string2 = F.getString("error");
                    if (string2 == null) {
                        string2 = F.getString("error_type");
                    }
                    String string3 = F.getString("error_msg");
                    if (string3 == null) {
                        string3 = F.getString("error_message");
                    }
                    if (string3 == null) {
                        string3 = F.getString("error_description");
                    }
                    String string4 = F.getString("error_code");
                    if (string4 != null) {
                        try {
                            parseInt = Integer.parseInt(string4);
                        } catch (NumberFormatException unused2) {
                        }
                        if (!e0.A(string2) && e0.A(string3) && parseInt == -1) {
                            if (F.containsKey("access_token")) {
                                n(dVar, F, null);
                            } else {
                                h5.p.c().execute(new androidx.emoji2.text.g(3, this, dVar, F));
                            }
                        } else if (string2 == null && (kotlin.jvm.internal.i.b(string2, "access_denied") || kotlin.jvm.internal.i.b(string2, "OAuthAccessDeniedException"))) {
                            n(dVar, null, new FacebookOperationCanceledException());
                        } else if (parseInt != 4201) {
                            n(dVar, null, new FacebookOperationCanceledException());
                        } else {
                            n(dVar, null, new FacebookServiceException(new h5.n(parseInt, string2, string3), string3));
                        }
                    }
                    parseInt = -1;
                    if (!e0.A(string2)) {
                    }
                    if (string2 == null) {
                    }
                    if (parseInt != 4201) {
                    }
                }
            }
            return true;
        }
        n(dVar, null, new FacebookOperationCanceledException());
        return false;
    }

    @Override // g6.y
    public final void j(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f16232y);
    }

    @Override // g6.y
    public final int k(p.d dVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        String name;
        String str;
        boolean z13;
        Uri b10;
        p d10 = d();
        String str2 = this.f16233z;
        if (str2.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return 0;
        }
        Bundle l2 = l(dVar);
        l2.putString("redirect_uri", str2);
        a0 a0Var = a0.INSTAGRAM;
        a0 a0Var2 = dVar.F;
        if (a0Var2 == a0Var) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str3 = dVar.f16305x;
        if (z11) {
            l2.putString("app_id", str3);
        } else {
            l2.putString("client_id", str3);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "e2e.toString()");
        l2.putString("e2e", jSONObject2);
        if (a0Var2 == a0Var) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            l2.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (dVar.f16303v.contains("openid")) {
                l2.putString("nonce", dVar.I);
            }
            l2.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        l2.putString("code_challenge", dVar.K);
        g6.a aVar = dVar.L;
        if (aVar == null) {
            name = null;
        } else {
            name = aVar.name();
        }
        l2.putString("code_challenge_method", name);
        l2.putString("return_scopes", "true");
        l2.putString("auth_type", dVar.B);
        l2.putString("login_behavior", dVar.f16302u.name());
        h5.p pVar = h5.p.f17269a;
        l2.putString("sdk", kotlin.jvm.internal.i.n("16.0.1", "android-"));
        l2.putString("sso", "chrome_custom_tab");
        String str4 = "0";
        if (h5.p.f17280m) {
            str = "1";
        } else {
            str = "0";
        }
        l2.putString("cct_prefetching", str);
        if (dVar.G) {
            l2.putString("fx_app", a0Var2.f16230u);
        }
        if (dVar.H) {
            l2.putString("skip_dedupe", "true");
        }
        String str5 = dVar.D;
        if (str5 != null) {
            l2.putString("messenger_page_id", str5);
            if (dVar.E) {
                str4 = "1";
            }
            l2.putString("reset_messenger_state", str4);
        }
        if (C) {
            l2.putString("cct_over_app_switch", "1");
        }
        if (h5.p.f17280m) {
            if (a0Var2 == a0Var) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                q.c cVar = c.f16235v;
                if (kotlin.jvm.internal.i.b("oauth", "oauth")) {
                    e0 e0Var = e0.f36453a;
                    b10 = e0.b(w5.a0.b(), "oauth/authorize", l2);
                } else {
                    e0 e0Var2 = e0.f36453a;
                    String b11 = w5.a0.b();
                    b10 = e0.b(b11, h5.p.d() + "/dialog/oauth", l2);
                }
                c.a.a(b10);
            } else {
                q.c cVar2 = c.f16235v;
                e0 e0Var3 = e0.f36453a;
                String a10 = w5.a0.a();
                c.a.a(e0.b(a10, h5.p.d() + "/dialog/oauth", l2));
            }
        }
        androidx.fragment.app.p e10 = d10.e();
        if (e10 == null) {
            return 0;
        }
        Intent intent = new Intent(e10, CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f6097w, "oauth");
        intent.putExtra(CustomTabMainActivity.f6098x, l2);
        String str6 = CustomTabMainActivity.f6099y;
        String str7 = this.f16231x;
        if (str7 == null) {
            str7 = w5.f.a();
            this.f16231x = str7;
        }
        intent.putExtra(str6, str7);
        intent.putExtra(CustomTabMainActivity.A, a0Var2.f16230u);
        Fragment fragment = d10.f16298w;
        if (fragment != null) {
            fragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // g6.c0
    public final h5.g m() {
        return this.B;
    }

    @Override // g6.y, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.i.g(dest, "dest");
        super.writeToParcel(dest, i6);
        dest.writeString(this.f16232y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Parcel source) {
        super(source);
        kotlin.jvm.internal.i.g(source, "source");
        this.A = "custom_tab";
        this.B = h5.g.CHROME_CUSTOM_TAB;
        this.f16232y = source.readString();
        String[] strArr = w5.f.f36460a;
        this.f16233z = w5.f.c(super.f());
    }
}
