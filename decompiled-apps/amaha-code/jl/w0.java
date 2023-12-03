package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.utils.CourseApiUtil;
/* compiled from: NotV4DashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class w0 implements CourseApiUtil.MiniCourseApiUtilInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22378a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f22379b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f22380c;

    public w0(NotV4DashboardViewModel notV4DashboardViewModel, String str, int i6) {
        this.f22378a = notV4DashboardViewModel;
        this.f22379b = str;
        this.f22380c = i6;
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.MiniCourseApiUtilInterface
    public final void miniCourseApiComplete(boolean z10, String slug) {
        kotlin.jvm.internal.i.g(slug, "slug");
        NotV4DashboardViewModel notV4DashboardViewModel = this.f22378a;
        if (!z10) {
            notV4DashboardViewModel.S++;
        } else {
            notV4DashboardViewModel.S = 0;
            ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new y0(notV4DashboardViewModel, slug, null), 3);
        }
        if (notV4DashboardViewModel.S < 3) {
            int i6 = this.f22380c;
            if (z10) {
                i6++;
            }
            notV4DashboardViewModel.i(i6, this.f22379b);
        }
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.MiniCourseApiUtilInterface
    public final void miniNotificationFetchComplete(boolean z10) {
    }
}
