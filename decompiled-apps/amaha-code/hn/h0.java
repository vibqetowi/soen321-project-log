package hn;

import android.net.Uri;
import android.util.Base64;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.utils.SessionManager;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$validateToken$1", f = "LoginSignupReworkViewModel.kt", l = {1714}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public q f17870u;

    /* renamed from: v  reason: collision with root package name */
    public int f17871v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f17872w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f17873x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q f17874y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(q qVar, String str, ls.d dVar) {
        super(2, dVar);
        this.f17873x = str;
        this.f17874y = qVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        h0 h0Var = new h0(this.f17874y, this.f17873x, dVar);
        h0Var.f17872w = obj;
        return h0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hs.k kVar;
        q qVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f17871v;
        q qVar2 = this.f17874y;
        if (i6 != 0) {
            if (i6 == 1) {
                qVar = this.f17870u;
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f17872w;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f17872w;
            String str = this.f17873x;
            if (str != null) {
                byte[] byteArray = Base64.decode(str, 0);
                kotlin.jvm.internal.i.f(byteArray, "byteArray");
                JSONObject jSONObject = new JSONObject(Uri.decode(new String(byteArray, gv.a.f16927b)));
                SessionManager.getInstance().saveHeaders(jSONObject.optString("access-token", ""), jSONObject.optString(SessionManager.KEY_CLIENT, ""), "application/json", jSONObject.optString(SessionManager.KEY_EXPIRY, ""), jSONObject.optString(SessionManager.KEY_UID, ""), "");
                this.f17872w = d0Var2;
                this.f17870u = qVar2;
                this.f17871v = 1;
                obj = ((jp.a) qVar2.E.getValue()).d(this);
                if (obj == aVar) {
                    return aVar;
                }
                qVar = qVar2;
            } else {
                kVar = null;
                if (kVar == null) {
                    qVar2.F.i(LoginLoading.HIDE_LOADING);
                }
                return hs.k.f19476a;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FB_TOKEN);
            kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…sionManager.KEY_FB_TOKEN)");
            q.g(qVar, stringValue, SessionManager.getInstance().getStringValue(SessionManager.KEY_UID), qVar.Z);
        } else {
            qVar.F.i(LoginLoading.HIDE_LOADING);
        }
        kVar = hs.k.f19476a;
        if (kVar == null) {
        }
        return hs.k.f19476a;
    }
}
