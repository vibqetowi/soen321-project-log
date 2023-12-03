package pr;

import com.theinnerhour.b2b.network.model.DeeplinkCodeResponse;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.b;
import dw.z;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import ls.d;
import ls.h;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: DeeplinkCodeActivationRepository.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f28843a = LogHelper.INSTANCE.makeLogTag("DeepLinkRepository");

    /* compiled from: DeeplinkCodeActivationRepository.kt */
    /* renamed from: pr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0486a implements CustomRetrofitCallback<DeeplinkCodeResponse> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ d<DeeplinkCodeResponse> f28844u;

        public C0486a(h hVar) {
            this.f28844u = hVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(b<DeeplinkCodeResponse> call, Throwable t3) {
            i.g(call, "call");
            i.g(t3, "t");
            this.f28844u.resumeWith(null);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(b<DeeplinkCodeResponse> call, z<DeeplinkCodeResponse> response) {
            i.g(call, "call");
            i.g(response, "response");
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            boolean a10 = response.a();
            d<DeeplinkCodeResponse> dVar = this.f28844u;
            if (a10) {
                dVar.resumeWith(response.f13696b);
            } else {
                dVar.resumeWith(null);
            }
        }
    }

    public final Object a(String str, d<? super DeeplinkCodeResponse> dVar) {
        h hVar = new h(ca.a.G0(dVar));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", str);
            jSONObject.put("platform", "android");
            String jSONObject2 = jSONObject.toString();
            i.f(jSONObject2, "payload.toString()");
            Pattern pattern = v.f24702d;
            ((co.a) nr.b.a(co.a.class)).a("https://api.theinnerhour.com/v1/deeplinkhandle", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new C0486a(hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28843a, e10);
            hVar.resumeWith(null);
        }
        return hVar.b();
    }
}
