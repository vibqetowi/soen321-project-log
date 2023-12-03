package wo;

import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: ExperimentProfileActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$checkForProfileAssetUpdate$1", f = "ExperimentProfileActivityViewModel.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36904u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f36905v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ n0 f36906w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f36907x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, boolean z10, ls.d<? super h0> dVar) {
        super(2, dVar);
        this.f36906w = n0Var;
        this.f36907x = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        h0 h0Var = new h0(this.f36906w, this.f36907x, dVar);
        h0Var.f36905v = obj;
        return h0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.d0 d0Var;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36904u;
        if (i6 != 0) {
            if (i6 == 1) {
                d0Var = (kotlinx.coroutines.d0) this.f36905v;
                try {
                    sp.b.d0(obj);
                } catch (Exception unused) {
                    LogHelper.INSTANCE.makeLogTag(d0Var.getClass());
                    return hs.k.f19476a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f36905v;
            try {
                n0 n0Var = this.f36906w;
                boolean z10 = this.f36907x;
                this.f36905v = d0Var2;
                this.f36904u = 1;
                if (n0.e(n0Var, z10, this) == aVar) {
                    return aVar;
                }
            } catch (Exception unused2) {
                d0Var = d0Var2;
                LogHelper.INSTANCE.makeLogTag(d0Var.getClass());
                return hs.k.f19476a;
            }
        }
        return hs.k.f19476a;
    }
}
