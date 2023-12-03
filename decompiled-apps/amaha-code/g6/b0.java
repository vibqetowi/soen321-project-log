package g6;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import g6.p;
import g6.y;
import java.util.ArrayList;
import java.util.List;
import w5.e0;
/* compiled from: NativeAppLoginMethodHandler.kt */
/* loaded from: classes.dex */
public abstract class b0 extends y {

    /* renamed from: w  reason: collision with root package name */
    public final h5.g f16234w;

    public b0(p pVar) {
        super(pVar);
        this.f16234w = h5.g.FACEBOOK_APPLICATION_WEB;
    }

    @Override // g6.y
    public final boolean h(int i6, int i10, Intent intent) {
        String string;
        String str;
        String string2;
        Object obj;
        p.d dVar = d().A;
        p.e.a aVar = p.e.a.CANCEL;
        if (intent == null) {
            l(new p.e(dVar, aVar, null, "Operation canceled", null));
        } else {
            p.e.a aVar2 = p.e.a.ERROR;
            String str2 = null;
            if (i10 == 0) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    string = null;
                } else {
                    string = extras.getString("error");
                }
                if (string == null) {
                    if (extras == null) {
                        string = null;
                    } else {
                        string = extras.getString("error_type");
                    }
                }
                if (extras == null || (obj = extras.get("error_code")) == null) {
                    str = null;
                } else {
                    str = obj.toString();
                }
                int i11 = w5.a0.f36434a;
                if (kotlin.jvm.internal.i.b("CONNECTION_FAILURE", str)) {
                    if (extras == null) {
                        string2 = null;
                    } else {
                        string2 = extras.getString("error_message");
                    }
                    if (string2 == null) {
                        if (extras != null) {
                            str2 = extras.getString("error_description");
                        }
                    } else {
                        str2 = string2;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (string != null) {
                        arrayList.add(string);
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    l(new p.e(dVar, aVar2, null, TextUtils.join(": ", arrayList), str));
                } else {
                    l(new p.e(dVar, aVar, null, string, null));
                }
            } else if (i10 != -1) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("Unexpected resultCode from authorization.");
                l(new p.e(dVar, aVar2, null, TextUtils.join(": ", arrayList2), null));
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("Unexpected null from returned authorization data.");
                    l(new p.e(dVar, aVar2, null, TextUtils.join(": ", arrayList3), null));
                    return true;
                }
                String string3 = extras2.getString("error");
                if (string3 == null) {
                    string3 = extras2.getString("error_type");
                }
                Object obj2 = extras2.get("error_code");
                if (obj2 != null) {
                    str2 = obj2.toString();
                }
                String string4 = extras2.getString("error_message");
                if (string4 == null) {
                    string4 = extras2.getString("error_description");
                }
                String string5 = extras2.getString("e2e");
                if (!e0.A(string5)) {
                    g(string5);
                }
                if (string3 == null && str2 == null && string4 == null && dVar != null) {
                    if (extras2.containsKey("code") && !e0.A(extras2.getString("code"))) {
                        h5.p.c().execute(new androidx.emoji2.text.g(4, this, dVar, extras2));
                    } else {
                        o(extras2, dVar);
                    }
                } else {
                    n(dVar, string3, string4, str2);
                }
            }
        }
        return true;
    }

    public final void l(p.e eVar) {
        if (eVar != null) {
            d().d(eVar);
        } else {
            d().j();
        }
    }

    public h5.g m() {
        return this.f16234w;
    }

    public final void n(p.d dVar, String str, String str2, String str3) {
        if (str != null && kotlin.jvm.internal.i.b(str, "logged_out")) {
            b.C = true;
            l(null);
            return;
        }
        int i6 = w5.a0.f36434a;
        if (is.u.Z1(ca.a.P0("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            l(null);
        } else if (is.u.Z1(ca.a.P0("access_denied", "OAuthAccessDeniedException"), str)) {
            l(new p.e(dVar, p.e.a.CANCEL, null, null, null));
        } else {
            ArrayList arrayList = new ArrayList();
            if (str != null) {
                arrayList.add(str);
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            l(new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), str3));
        }
    }

    public final void o(Bundle bundle, p.d dVar) {
        try {
            l(new p.e(dVar, p.e.a.SUCCESS, y.a.b(dVar.f16303v, bundle, m(), dVar.f16305x), y.a.c(bundle, dVar.I), null, null));
        } catch (FacebookException e10) {
            String message = e10.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            l(new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    public final boolean p(Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        r rVar;
        if (intent != null) {
            kotlin.jvm.internal.i.f(h5.p.a().getPackageManager().queryIntentActivities(intent, 65536), "FacebookSdk.getApplicationContext()\n            .packageManager\n            .queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            if (!queryIntentActivities.isEmpty()) {
                Fragment fragment = d().f16298w;
                hs.k kVar = null;
                if (fragment instanceof r) {
                    rVar = (r) fragment;
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    androidx.activity.result.c<Intent> cVar = rVar.f16325x;
                    if (cVar != null) {
                        cVar.a(intent);
                        kVar = hs.k.f19476a;
                    } else {
                        kotlin.jvm.internal.i.q("launcher");
                        throw null;
                    }
                }
                if (kVar == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Parcel source) {
        super(source);
        kotlin.jvm.internal.i.g(source, "source");
        this.f16234w = h5.g.FACEBOOK_APPLICATION_WEB;
    }
}
