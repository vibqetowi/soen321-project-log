package dl;

import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13047a;

    @Override // ya.e
    public final void onFailure(Exception it) {
        switch (this.f13047a) {
            case 0:
                int i6 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(it, "it");
                return;
            case 1:
                int i10 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(it, "it");
                return;
            case 2:
                kotlin.jvm.internal.i.g(it, "it");
                return;
            default:
                kotlin.jvm.internal.i.g(it, "it");
                return;
        }
    }
}
