package ml;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import org.json.JSONObject;
/* compiled from: B2BDashboardRepository.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f25334a = LogHelper.INSTANCE.makeLogTag("B2BDashboardRepository");

    /* compiled from: B2BDashboardRepository.kt */
    /* renamed from: ml.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0409a implements CustomRetrofitCallback<sf.m> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ls.d<String> f25336v;

        public C0409a(ls.h hVar) {
            this.f25336v = hVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<sf.m> call, Throwable t3) {
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(t3, "t");
            LogHelper.INSTANCE.e(a.this.f25334a, t3);
            this.f25336v.resumeWith(null);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
            hs.k kVar;
            String mVar;
            boolean z10;
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(response, "response");
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            if (response.a()) {
                sf.m mVar2 = response.f13696b;
                ls.d<String> dVar = this.f25336v;
                if (mVar2 != null && (mVar = mVar2.toString()) != null) {
                    JSONObject jSONObject = new JSONObject(mVar);
                    SessionManager.getInstance().setStringValue(SessionManager.KEY_ORGANISATION_NAME, jSONObject.getJSONObject("data").optString("org_name", ""));
                    String tt2 = jSONObject.getJSONObject("data").optString("org_logo", "");
                    kotlin.jvm.internal.i.f(tt2, "tt");
                    if (tt2.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        tt2 = null;
                    }
                    dVar.resumeWith(tt2);
                    kVar = hs.k.f19476a;
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    dVar.resumeWith(null);
                }
            }
        }
    }

    public final Object a(String str, ls.d<? super String> dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            ((or.k) nr.b.a(or.k.class)).c("https://api.theinnerhour.com/v1/appvisibilityandorgpackages", str).I(new C0409a(hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25334a, e10);
            hVar.resumeWith(null);
        }
        return hVar.b();
    }
}
