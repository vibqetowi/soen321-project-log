package ml;

import android.app.Application;
import android.widget.Toast;
import com.theinnerhour.b2b.network.model.ResendVerifyEmailModel;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$resendVerifyEmail$1", f = "V3DashboardViewModel.kt", l = {557}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25572u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c0 f25573v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ResendVerifyEmailModel f25574w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(c0 c0Var, ResendVerifyEmailModel resendVerifyEmailModel, ls.d<? super q0> dVar) {
        super(2, dVar);
        this.f25573v = c0Var;
        this.f25574w = resendVerifyEmailModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new q0(this.f25573v, this.f25574w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((q0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25572u;
        c0 c0Var = this.f25573v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            c0Var.B.i(Boolean.TRUE);
            this.f25572u = 1;
            u uVar = c0Var.f25368y;
            uVar.getClass();
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar.u();
            ((or.j) nr.b.a(or.j.class)).a("https://api.theinnerhour.com/v1/b2b/email/resend", this.f25574w).I(new w(uVar, kVar));
            obj = kVar.s();
            if (obj == aVar) {
                return aVar;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c0Var.getClass();
        try {
            c0Var.B.i(Boolean.FALSE);
            Application application = c0Var.f2382x;
            if (booleanValue) {
                Toast.makeText(application, "Verification mail has been sent to your email ID ", 1).show();
            } else {
                Toast.makeText(application, "Something went wrong", 0).show();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(c0Var.A, e10);
        }
        return hs.k.f19476a;
    }
}
