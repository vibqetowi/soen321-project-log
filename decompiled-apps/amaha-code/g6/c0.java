package g6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import g6.p;
import g6.y;
import h5.a;
import h5.g0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import w5.e0;
/* compiled from: WebLoginMethodHandler.kt */
/* loaded from: classes.dex */
public abstract class c0 extends y {

    /* renamed from: w  reason: collision with root package name */
    public String f16238w;

    public c0(p pVar) {
        super(pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle l(p.d dVar) {
        boolean z10;
        String str;
        Bundle bundle = new Bundle();
        e0 e0Var = e0.f36453a;
        Set<String> set = dVar.f16303v;
        if (set != null && !set.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            String join = TextUtils.join(",", dVar.f16303v);
            bundle.putString("scope", join);
            a(join, "scope");
        }
        d dVar2 = dVar.f16304w;
        if (dVar2 == null) {
            dVar2 = d.NONE;
        }
        bundle.putString("default_audience", dVar2.f16242u);
        bundle.putString("state", c(dVar.f16306y));
        Date date = h5.a.F;
        h5.a b10 = a.b.b();
        if (b10 == null) {
            str = null;
        } else {
            str = b10.f17180y;
        }
        String str2 = "0";
        if (str != null) {
            Context e10 = d().e();
            if (e10 == null) {
                e10 = h5.p.a();
            }
            if (kotlin.jvm.internal.i.b(str, e10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
                bundle.putString("access_token", str);
                a("1", "access_token");
                bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
                h5.p pVar = h5.p.f17269a;
                if (g0.b()) {
                    str2 = "1";
                }
                bundle.putString("ies", str2);
                return bundle;
            }
        }
        androidx.fragment.app.p e11 = d().e();
        if (e11 != null) {
            e0.d(e11);
        }
        a("0", "access_token");
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        h5.p pVar2 = h5.p.f17269a;
        if (g0.b()) {
        }
        bundle.putString("ies", str2);
        return bundle;
    }

    public abstract h5.g m();

    public final void n(p.d dVar, Bundle bundle, FacebookException facebookException) {
        String message;
        p.e eVar;
        p d10 = d();
        String str = null;
        this.f16238w = null;
        p.e.a aVar = p.e.a.ERROR;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f16238w = bundle.getString("e2e");
            }
            try {
                h5.a b10 = y.a.b(dVar.f16303v, bundle, m(), dVar.f16305x);
                eVar = new p.e(d10.A, p.e.a.SUCCESS, b10, y.a.c(bundle, dVar.I), null, null);
                if (d10.e() != null) {
                    try {
                        CookieSyncManager.createInstance(d10.e()).sync();
                    } catch (Exception unused) {
                    }
                    if (b10 != null) {
                        String str2 = b10.f17180y;
                        Context e10 = d().e();
                        if (e10 == null) {
                            e10 = h5.p.a();
                        }
                        e10.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str2).apply();
                    }
                }
            } catch (FacebookException e11) {
                p.d dVar2 = d10.A;
                String message2 = e11.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message2 != null) {
                    arrayList.add(message2);
                }
                eVar = new p.e(dVar2, aVar, null, TextUtils.join(": ", arrayList), null);
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            eVar = new p.e(d10.A, p.e.a.CANCEL, null, "User canceled log in.", null);
        } else {
            this.f16238w = null;
            if (facebookException == null) {
                message = null;
            } else {
                message = facebookException.getMessage();
            }
            if (facebookException instanceof FacebookServiceException) {
                h5.n nVar = ((FacebookServiceException) facebookException).f6110v;
                str = String.valueOf(nVar.f17260v);
                message = nVar.toString();
            }
            String str3 = str;
            p.d dVar3 = d10.A;
            ArrayList arrayList2 = new ArrayList();
            if (message != null) {
                arrayList2.add(message);
            }
            eVar = new p.e(dVar3, aVar, null, TextUtils.join(": ", arrayList2), str3);
        }
        e0 e0Var = e0.f36453a;
        if (!e0.A(this.f16238w)) {
            g(this.f16238w);
        }
        d10.d(eVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Parcel source) {
        super(source);
        kotlin.jvm.internal.i.g(source, "source");
    }
}
