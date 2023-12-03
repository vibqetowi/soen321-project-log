package dl;

import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.model.CustomCoachMark;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class g1 implements CustomCoachMark.OnVisibilityChange {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13025a;

    public g1(V3DashboardActivity v3DashboardActivity) {
        this.f13025a = v3DashboardActivity;
    }

    @Override // com.theinnerhour.b2b.model.CustomCoachMark.OnVisibilityChange
    public final void onChange(boolean z10) {
        if (!z10) {
            V3DashboardActivity v3DashboardActivity = this.f13025a;
            v3DashboardActivity.getClass();
            try {
                v3DashboardActivity.e0.remove(0);
                v3DashboardActivity.I0();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, "exception in hideCoachMark", e10);
            }
        }
    }
}
