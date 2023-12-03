package jl;

import com.theinnerhour.b2b.utils.CourseApiUtil;
/* compiled from: CustomDashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class n implements CourseApiUtil.MiniCourseFetchUtilInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f22274a;

    public n(e eVar) {
        this.f22274a = eVar;
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.MiniCourseFetchUtilInterface
    public final void miniCourseFetchComplete(boolean z10) {
        this.f22274a.M.i(Boolean.valueOf(z10));
    }
}
