package jp;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.splash.models.AppUpdateResponse;
import hs.k;
import kotlinx.coroutines.d0;
import ls.h;
import ns.i;
import or.l;
import ss.p;
/* compiled from: SplashScreenViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.splash.viewModel.SplashScreenViewModel$getObsoletionDataFromServer$1", f = "SplashScreenViewModel.kt", l = {R.styleable.AppCompatTheme_selectableItemBackground}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22559u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f22560v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f22561w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, int i6, ls.d<? super e> dVar2) {
        super(2, dVar2);
        this.f22560v = dVar;
        this.f22561w = i6;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new e(this.f22560v, this.f22561w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((e) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22559u;
        d dVar = this.f22560v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            a aVar2 = dVar.f22547z;
            this.f22559u = 1;
            aVar2.getClass();
            h hVar = new h(ca.a.G0(this));
            ((l) nr.b.a(l.class)).a("https://api.theinnerhour.com/v1/obsolete").I(new b(hVar, this.f22561w, aVar2));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        AppUpdateResponse appUpdateResponse = (AppUpdateResponse) obj;
        if (appUpdateResponse != AppUpdateResponse.NO_UPDATE) {
            dVar.M.i(appUpdateResponse);
        } else {
            dVar.C = true;
            dVar.g();
        }
        return k.f19476a;
    }
}
