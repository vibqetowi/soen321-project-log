package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$getFirstName$1", f = "NotV4DashboardViewModel.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public androidx.lifecycle.w f22200u;

    /* renamed from: v  reason: collision with root package name */
    public int f22201v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22202w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super g1> dVar) {
        super(2, dVar);
        this.f22202w = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g1(this.f22202w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.w wVar;
        String str;
        String str2;
        String firstName;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22201v;
        boolean z10 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                wVar = this.f22200u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            NotV4DashboardViewModel notV4DashboardViewModel = this.f22202w;
            androidx.lifecycle.w wVar2 = (androidx.lifecycle.w) notV4DashboardViewModel.G.getValue();
            this.f22200u = wVar2;
            this.f22201v = 1;
            notV4DashboardViewModel.f10867y.getClass();
            kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
            kVar.u();
            try {
                User user = FirebasePersistence.getInstance().getUser();
                str = null;
                if (user != null) {
                    str2 = user.getFirstName();
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    z10 = false;
                }
            } catch (Exception unused) {
                kVar.resumeWith("");
            }
            if (!z10) {
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null && (firstName = user2.getFirstName()) != null) {
                    str = gv.r.i1(firstName).toString();
                }
                if (!kotlin.jvm.internal.i.b(str, "null")) {
                    kVar.resumeWith(FirebasePersistence.getInstance().getUser().getFirstName());
                    obj = kVar.s();
                    if (obj != aVar) {
                        return aVar;
                    }
                    wVar = wVar2;
                }
            }
            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
            kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…ionManager.KEY_FIRSTNAME)");
            if (!kotlin.jvm.internal.i.b(gv.r.i1(stringValue).toString(), "null")) {
                kVar.resumeWith(SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME));
            } else {
                kVar.resumeWith("");
            }
            obj = kVar.s();
            if (obj != aVar) {
            }
        }
        wVar.i(obj);
        return hs.k.f19476a;
    }
}
