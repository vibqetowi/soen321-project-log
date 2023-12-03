package jl;

import android.app.Application;
import android.content.pm.PackageInfo;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$submitAppFeedback$1", f = "NotV4DashboardViewModel.kt", l = {814}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22278u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22279v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f22280w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(NotV4DashboardViewModel notV4DashboardViewModel, String str, ls.d<? super o1> dVar) {
        super(2, dVar);
        this.f22279v = notV4DashboardViewModel;
        this.f22280w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new o1(this.f22279v, this.f22280w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((o1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22278u;
        NotV4DashboardViewModel notV4DashboardViewModel = this.f22279v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            Application application = notV4DashboardViewModel.f2382x;
            PackageInfo packageInfo = application.getApplicationContext().getPackageManager().getPackageInfo(application.getApplicationContext().getPackageName(), 0);
            kotlin.jvm.internal.i.f(packageInfo, "getApplication<Applicati…onContext.packageName, 0)");
            this.f22278u = 1;
            obj = ((t1) notV4DashboardViewModel.Y.getValue()).b(this.f22280w, packageInfo, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ((androidx.lifecycle.w) notV4DashboardViewModel.Z.getValue()).i(new SingleUseEvent(notV4DashboardViewModel.f2382x.getApplicationContext().getString(R.string.feedback_submit_toast)));
        } else {
            ((androidx.lifecycle.w) notV4DashboardViewModel.Z.getValue()).i(new SingleUseEvent(notV4DashboardViewModel.f2382x.getApplicationContext().getString(R.string.feedback_submit_fail_toast)));
        }
        return hs.k.f19476a;
    }
}
