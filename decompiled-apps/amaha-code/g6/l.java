package g6;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import g6.p;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
/* compiled from: GetTokenLoginMethodHandler.kt */
/* loaded from: classes.dex */
public final class l implements e0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f16284a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f16285b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.d f16286c;

    public l(Bundle bundle, k kVar, p.d dVar) {
        this.f16284a = bundle;
        this.f16285b = kVar;
        this.f16286c = dVar;
    }

    @Override // w5.e0.a
    public final void a(FacebookException facebookException) {
        String message;
        k kVar = this.f16285b;
        p d10 = kVar.d();
        p.d dVar = kVar.d().A;
        if (facebookException == null) {
            message = null;
        } else {
            message = facebookException.getMessage();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        d10.c(new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
    }

    @Override // w5.e0.a
    public final void onSuccess(JSONObject jSONObject) {
        String string;
        Bundle bundle = this.f16284a;
        k kVar = this.f16285b;
        if (jSONObject == null) {
            string = null;
        } else {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e10) {
                p d10 = kVar.d();
                p.d dVar = kVar.d().A;
                String message = e10.getMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Caught exception");
                if (message != null) {
                    arrayList.add(message);
                }
                d10.c(new p.e(dVar, p.e.a.ERROR, null, TextUtils.join(": ", arrayList), null));
                return;
            }
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        kVar.l(bundle, this.f16286c);
    }
}
