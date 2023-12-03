package cn;

import android.app.Application;
import android.content.pm.PackageInfo;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import jl.t1;
/* compiled from: LibraryResourcesViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryResourcesViewModel$submitAppFeedback$1", f = "LibraryResourcesViewModel.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMinor}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5822u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ w f5823v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5824w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w wVar, String str, ls.d<? super x> dVar) {
        super(2, dVar);
        this.f5823v = wVar;
        this.f5824w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new x(this.f5823v, this.f5824w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((x) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5822u;
        w wVar = this.f5823v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            Application application = wVar.f2382x;
            PackageInfo packageInfo = application.getApplicationContext().getPackageManager().getPackageInfo(application.getApplicationContext().getPackageName(), 0);
            kotlin.jvm.internal.i.f(packageInfo, "getApplication<Applicati…onContext.packageName, 0)");
            this.f5822u = 1;
            obj = ((t1) wVar.F.getValue()).b(this.f5824w, packageInfo, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ((androidx.lifecycle.w) wVar.G.getValue()).i(new SingleUseEvent(wVar.f2382x.getApplicationContext().getString(com.theinnerhour.b2b.R.string.feedback_submit_toast)));
        } else {
            ((androidx.lifecycle.w) wVar.G.getValue()).i(new SingleUseEvent(wVar.f2382x.getApplicationContext().getString(com.theinnerhour.b2b.R.string.feedback_submit_fail_toast)));
        }
        return hs.k.f19476a;
    }
}
