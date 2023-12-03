package wo;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: ExperimentProfileActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel", f = "ExperimentProfileActivityViewModel.kt", l = {252}, m = "fetchTherapistInfo")
/* loaded from: classes2.dex */
public final class l0 extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public n0 f36949u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f36950v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ n0 f36951w;

    /* renamed from: x  reason: collision with root package name */
    public int f36952x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, ls.d<? super l0> dVar) {
        super(dVar);
        this.f36951w = n0Var;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f36950v = obj;
        this.f36952x |= LinearLayoutManager.INVALID_OFFSET;
        return n0.f(this.f36951w, false, this);
    }
}
