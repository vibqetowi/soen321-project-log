package wo;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: ExperimentProfileActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel", f = "ExperimentProfileActivityViewModel.kt", l = {186}, m = "checkAndRefreshProfileAssetUpdate")
/* loaded from: classes2.dex */
public final class f0 extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public n0 f36886u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f36887v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f36888w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ n0 f36889x;

    /* renamed from: y  reason: collision with root package name */
    public int f36890y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(n0 n0Var, ls.d<? super f0> dVar) {
        super(dVar);
        this.f36889x = n0Var;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f36888w = obj;
        this.f36890y |= LinearLayoutManager.INVALID_OFFSET;
        return n0.e(this.f36889x, false, this);
    }
}
