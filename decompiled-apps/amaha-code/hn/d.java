package hn;

import android.net.Uri;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkRepository$checkForDeepLink$2", f = "LoginSignupReworkRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ss.p<Boolean, JSONObject, Object> f17842u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b f17843v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(ss.p<? super Boolean, ? super JSONObject, ? extends Object> pVar, b bVar, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f17842u = pVar;
        this.f17843v = bVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f17842u, this.f17843v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        b bVar = this.f17843v;
        ss.p<Boolean, JSONObject, Object> pVar = this.f17842u;
        sp.b.d0(obj);
        try {
            Uri parse = Uri.parse(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", parse.getPathSegments().get(1));
            com.android.volley.toolbox.h hVar = new com.android.volley.toolbox.h(1, "https://api.theinnerhour.com/v1/deeplinkinit", jSONObject, new qk.a(pVar, 1, bVar), new dd.a(pVar, 0, bVar));
            hVar.setRetryPolicy(new e4.d(Constants.TIMEOUT_MS, 0));
            VolleySingleton.getInstance().add(hVar);
        } catch (Exception e10) {
            pVar.invoke(Boolean.FALSE, null);
            LogHelper.INSTANCE.e(bVar.f17789a, "exception in checkForDeepLink", e10);
        }
        return hs.k.f19476a;
    }
}
