package fm;

import android.app.Application;
import android.content.pm.PackageInfo;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$submitAppFeedback$1", f = "FirestoreGoalsViewModel.kt", l = {1030}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f15339u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a f15340v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f15341w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(a aVar, String str, ls.d<? super g0> dVar) {
        super(2, dVar);
        this.f15340v = aVar;
        this.f15341w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g0(this.f15340v, this.f15341w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15339u;
        a aVar2 = this.f15340v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            Application application = aVar2.f2382x;
            PackageInfo packageInfo = application.getApplicationContext().getPackageManager().getPackageInfo(application.getApplicationContext().getPackageName(), 0);
            kotlin.jvm.internal.i.f(packageInfo, "getApplication<Applicati…onContext.packageName, 0)");
            this.f15339u = 1;
            obj = ((jl.t1) aVar2.c0.getValue()).b(this.f15341w, packageInfo, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ((androidx.lifecycle.w) aVar2.U.getValue()).i(new SingleUseEvent(Boolean.TRUE));
            ((androidx.lifecycle.w) aVar2.T.getValue()).i(new SingleUseEvent(aVar2.f2382x.getApplicationContext().getString(R.string.feedback_submit_toast)));
        } else {
            ((androidx.lifecycle.w) aVar2.T.getValue()).i(new SingleUseEvent(aVar2.f2382x.getApplicationContext().getString(R.string.feedback_submit_fail_toast)));
        }
        return hs.k.f19476a;
    }
}
