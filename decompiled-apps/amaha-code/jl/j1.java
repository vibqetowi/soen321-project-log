package jl;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel", f = "NotV4DashboardViewModel.kt", l = {718}, m = "preLoadWebViews")
/* loaded from: classes2.dex */
public final class j1 extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public NotV4DashboardViewModel f22252u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f22253v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22254w;

    /* renamed from: x  reason: collision with root package name */
    public int f22255x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super j1> dVar) {
        super(dVar);
        this.f22254w = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f22253v = obj;
        this.f22255x |= LinearLayoutManager.INVALID_OFFSET;
        return NotV4DashboardViewModel.g(this.f22254w, this);
    }
}
