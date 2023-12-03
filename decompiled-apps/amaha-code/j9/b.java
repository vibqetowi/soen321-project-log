package j9;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f21753c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public static b f21754d;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f21755a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f21756b;

    public b(Context context) {
        this.f21756b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        v9.o.h(context);
        ReentrantLock reentrantLock = f21753c;
        reentrantLock.lock();
        try {
            if (f21754d == null) {
                f21754d = new b(context.getApplicationContext());
            }
            return f21754d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String g(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    public final GoogleSignInAccount b() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e11) && (e10 = e(g("googleSignInAccount", e11))) != null) {
            try {
                return GoogleSignInAccount.g0(e10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions c() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = e(g("googleSignInOptions", e11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.f0(e10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        v9.o.h(googleSignInOptions);
        String str = googleSignInAccount.C;
        f("defaultGoogleSignInAccount", str);
        String g5 = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f7217v;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f7218w;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f7219x;
            if (str4 != null) {
                jSONObject.put(SessionManager.KEY_EMAIL, str4);
            }
            String str5 = googleSignInAccount.f7220y;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.E;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.F;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f7221z;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.A;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.B);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = googleSignInAccount.D;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, i9.c.f19919u);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f7295v);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g5, jSONObject.toString());
            String g10 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.B;
            String str10 = googleSignInOptions.A;
            ArrayList<Scope> arrayList = googleSignInOptions.f7223v;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.K);
                Iterator<Scope> it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().f7295v);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f7224w;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f7225x);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f7227z);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f7226y);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(g10, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f21755a;
        reentrantLock.lock();
        try {
            return this.f21756b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f21755a;
        reentrantLock.lock();
        try {
            this.f21756b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
