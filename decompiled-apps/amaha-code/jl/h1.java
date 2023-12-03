package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$getUserProfileAvatar$1", f = "NotV4DashboardViewModel.kt", l = {214}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public androidx.lifecycle.w f22219u;

    /* renamed from: v  reason: collision with root package name */
    public int f22220v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22221w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super h1> dVar) {
        super(2, dVar);
        this.f22221w = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h1(this.f22221w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        r5.resumeWith(com.theinnerhour.b2b.persistence.FirebasePersistence.getInstance().getUser().getProfile_path());
     */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.w wVar;
        String str;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22220v;
        boolean z10 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                wVar = this.f22219u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            NotV4DashboardViewModel notV4DashboardViewModel = this.f22221w;
            androidx.lifecycle.w wVar2 = (androidx.lifecycle.w) notV4DashboardViewModel.H.getValue();
            this.f22219u = wVar2;
            this.f22220v = 1;
            notV4DashboardViewModel.f10867y.getClass();
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar.u();
            try {
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getProfile_path();
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    z10 = false;
                }
                kVar.resumeWith("https://assets.theinnerhour.com/avatar/avatar_flower_1.png");
            } catch (Exception unused) {
                kVar.resumeWith("");
            }
            obj = kVar.s();
            if (obj == aVar) {
                return aVar;
            }
            wVar = wVar2;
        }
        wVar.i(obj);
        return hs.k.f19476a;
    }
}
