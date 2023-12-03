package cn;

import android.app.Application;
import android.content.pm.PackageInfo;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import jl.t1;
/* compiled from: LibraryViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$submitAppFeedback$1", f = "LibraryViewModel.kt", l = {523}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5825u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k0 f5826v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5827w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(k0 k0Var, String str, ls.d<? super x0> dVar) {
        super(2, dVar);
        this.f5826v = k0Var;
        this.f5827w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new x0(this.f5826v, this.f5827w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((x0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5825u;
        k0 k0Var = this.f5826v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            Application application = k0Var.f2382x;
            PackageInfo packageInfo = application.getApplicationContext().getPackageManager().getPackageInfo(application.getApplicationContext().getPackageName(), 0);
            kotlin.jvm.internal.i.f(packageInfo, "getApplication<Applicati…onContext.packageName, 0)");
            this.f5825u = 1;
            obj = ((t1) k0Var.S.getValue()).b(this.f5827w, packageInfo, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ((androidx.lifecycle.w) k0Var.T.getValue()).i(new SingleUseEvent(k0Var.f2382x.getApplicationContext().getString(R.string.feedback_submit_toast)));
        } else {
            ((androidx.lifecycle.w) k0Var.T.getValue()).i(new SingleUseEvent(k0Var.f2382x.getApplicationContext().getString(R.string.feedback_submit_fail_toast)));
        }
        return hs.k.f19476a;
    }
}
