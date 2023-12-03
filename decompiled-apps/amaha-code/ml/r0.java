package ml;

import com.theinnerhour.b2b.utils.CourseApiUtil;
/* compiled from: V3DashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class r0 implements CourseApiUtil.MiniCourseFetchUtilInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f25576a;

    public r0(c0 c0Var) {
        this.f25576a = c0Var;
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.MiniCourseFetchUtilInterface
    public final void miniCourseFetchComplete(boolean z10) {
        ss.l<? super Boolean, hs.k> lVar;
        if (z10) {
            c0 c0Var = this.f25576a;
            c0Var.R = true;
            if (c0Var.S && (lVar = c0Var.V) != null) {
                lVar.invoke(Boolean.TRUE);
            }
        }
    }
}
