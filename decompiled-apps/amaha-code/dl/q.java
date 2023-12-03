package dl;

import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.utils.CourseApiUtil;
/* compiled from: V2DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class q implements CourseApiUtil.CourseApiUtilInterface {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13092u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ CourseApiUtil f13093v;

    public q(V2DashboardActivity v2DashboardActivity, CourseApiUtil courseApiUtil) {
        this.f13092u = v2DashboardActivity;
        this.f13093v = courseApiUtil;
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void courseApiComplete(boolean z10) {
        int i6 = V2DashboardActivity.F0;
        V2DashboardActivity v2DashboardActivity = this.f13092u;
        v2DashboardActivity.getClass();
        ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new n(v2DashboardActivity, null), 3);
        this.f13093v.fetchNotificationData();
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void errorLoadingData(Exception error) {
        kotlin.jvm.internal.i.g(error, "error");
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void audioDownloadComplete() {
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void notificationFetchComplete(boolean z10) {
    }
}
