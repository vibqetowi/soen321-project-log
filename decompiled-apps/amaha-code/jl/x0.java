package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.utils.CourseApiUtil;
/* compiled from: NotV4DashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class x0 implements CourseApiUtil.MiniCourseApiInitUtilInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22386a;

    public x0(NotV4DashboardViewModel notV4DashboardViewModel) {
        this.f22386a = notV4DashboardViewModel;
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.MiniCourseApiInitUtilInterface
    public final void miniCourseApiInitComplete(boolean z10) {
        NotV4DashboardViewModel notV4DashboardViewModel = this.f22386a;
        notV4DashboardViewModel.getClass();
        ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new y0(notV4DashboardViewModel, null, null), 3);
    }
}
