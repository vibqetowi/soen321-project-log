package wo;

import android.app.Application;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: ExperimentProfileActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$checkAndRefreshProfileAssetUpdate$2", f = "ExperimentProfileActivityViewModel.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Object>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36895u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f36896v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ n0 f36897w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f36898x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0 n0Var, boolean z10, ls.d<? super g0> dVar) {
        super(2, dVar);
        this.f36897w = n0Var;
        this.f36898x = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        g0 g0Var = new g0(this.f36897w, this.f36898x, dVar);
        g0Var.f36896v = obj;
        return g0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Object> dVar) {
        return ((g0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.d0 d0Var;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36895u;
        if (i6 != 0) {
            if (i6 == 1) {
                d0Var = (kotlinx.coroutines.d0) this.f36896v;
                try {
                    sp.b.d0(obj);
                    return obj;
                } catch (Exception unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f36896v;
            try {
                Utils utils = Utils.INSTANCE;
                Application application = this.f36897w.f2382x;
                kotlin.jvm.internal.i.f(application, "getApplication<Application>()");
                boolean z10 = this.f36898x;
                this.f36896v = d0Var2;
                this.f36895u = 1;
                Object checkForUpdatedProfileAssets = utils.checkForUpdatedProfileAssets(application, z10, this);
                if (checkForUpdatedProfileAssets == aVar) {
                    return aVar;
                }
                return checkForUpdatedProfileAssets;
            } catch (Exception unused2) {
                d0Var = d0Var2;
            }
        }
        return LogHelper.INSTANCE.makeLogTag(d0Var.getClass());
    }
}
