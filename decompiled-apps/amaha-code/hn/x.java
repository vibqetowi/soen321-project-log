package hn;

import android.net.Uri;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.regex.Pattern;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$loginSSO$1", f = "LoginSignupReworkViewModel.kt", l = {1418, 1420}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f17949u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f17950v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ q f17951w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f17952x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q qVar, String str, ls.d<? super x> dVar) {
        super(2, dVar);
        this.f17951w = qVar;
        this.f17952x = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        x xVar = new x(this.f17951w, this.f17952x, dVar);
        xVar.f17950v = obj;
        return xVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((x) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.d0 d0Var;
        String str;
        hs.k kVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f17949u;
        String str2 = this.f17952x;
        q qVar = this.f17951w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f17950v;
                    sp.b.d0(obj);
                    str = (String) obj;
                    if (str == null) {
                        if (!gv.n.B0(str)) {
                            qVar.J.i(new SingleUseEvent<>(str));
                        } else {
                            qVar.H.i("Email ID not valid!");
                            qVar.F.i(LoginLoading.HIDE_LOADING);
                        }
                        kVar = hs.k.f19476a;
                    } else {
                        kVar = null;
                    }
                    if (kVar == null) {
                        qVar.H.i("Email ID not valid!");
                        qVar.F.i(LoginLoading.HIDE_LOADING);
                    }
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0Var = (kotlinx.coroutines.d0) this.f17950v;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            d0Var = (kotlinx.coroutines.d0) this.f17950v;
            b bVar = qVar.C;
            this.f17950v = d0Var;
            this.f17949u = 1;
            bVar.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SessionManager.KEY_EMAIL, str2);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.i.f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
            Pattern pattern = lv.v.f24702d;
            ((or.d) nr.b.a(or.d.class)).c("https://api.theinnerhour.com/v1/consent", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new o(bVar, hVar));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            b bVar2 = qVar.C;
            this.f17950v = d0Var;
            this.f17949u = 2;
            bVar2.getClass();
            ls.h hVar2 = new ls.h(ca.a.G0(this));
            ((or.d) nr.b.a(or.d.class)).e("application/json", "https://api.theinnerhour.com/users/saml/sign_in?email=" + Uri.encode(str2)).I(new p(bVar2, hVar2));
            obj = hVar2.b();
            if (obj == aVar) {
                return aVar;
            }
            str = (String) obj;
            if (str == null) {
            }
            if (kVar == null) {
            }
            return hs.k.f19476a;
        }
        qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.something_went_wrong));
        qVar.F.i(LoginLoading.HIDE_LOADING);
        return hs.k.f19476a;
    }
}
