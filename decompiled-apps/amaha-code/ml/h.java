package ml;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel", f = "DashboardTelecommunicationsViewModel.kt", l = {451}, m = "fetchNPSStatus")
/* loaded from: classes2.dex */
public final class h extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public p f25467u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f25468v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p f25469w;

    /* renamed from: x  reason: collision with root package name */
    public int f25470x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, ls.d<? super h> dVar) {
        super(dVar);
        this.f25469w = pVar;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f25468v = obj;
        this.f25470x |= LinearLayoutManager.INVALID_OFFSET;
        return p.g(this.f25469w, false, this);
    }
}
