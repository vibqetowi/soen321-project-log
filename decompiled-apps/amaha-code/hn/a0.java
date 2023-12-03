package hn;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.components.login.model.PasswordResetRequestModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$resetPassword$1", f = "LoginSignupReworkViewModel.kt", l = {1791}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f17786u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f17787v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f17788w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(q qVar, String str, ls.d<? super a0> dVar) {
        super(2, dVar);
        this.f17787v = qVar;
        this.f17788w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new a0(this.f17787v, this.f17788w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((a0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f17786u;
        boolean z10 = true;
        q qVar = this.f17787v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            b bVar = qVar.C;
            this.f17786u = 1;
            bVar.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            ((or.d) nr.b.a(or.d.class)).b("https://api.theinnerhour.com/v1/authenticate/password", new PasswordResetRequestModel(this.f17788w)).I(new k(hVar));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        hs.f fVar = (hs.f) obj;
        boolean booleanValue = ((Boolean) fVar.f19464u).booleanValue();
        Object obj2 = fVar.f19465v;
        if (booleanValue) {
            androidx.lifecycle.w<String> wVar = qVar.H;
            String str = (String) obj2;
            if (str == null) {
                str = qVar.f2382x.getApplicationContext().getString(R.string.resetPasswordSuccess);
                kotlin.jvm.internal.i.f(str, "getApplication<Applicati…ing.resetPasswordSuccess)");
            }
            wVar.i(str);
            qVar.M.i(new SingleUseEvent<>(Boolean.TRUE));
        } else {
            androidx.lifecycle.w<String> wVar2 = qVar.H;
            String str2 = (String) obj2;
            if (str2 != null && !gv.n.B0(str2)) {
                z10 = false;
            }
            if (z10) {
                obj2 = null;
            }
            String str3 = (String) obj2;
            if (str3 == null) {
                str3 = qVar.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong);
                kotlin.jvm.internal.i.f(str3, "getApplication<Applicati….loginSomethingWentWrong)");
            }
            wVar2.i(str3);
        }
        qVar.F.i(LoginLoading.HIDE_LOADING);
        return hs.k.f19476a;
    }
}
