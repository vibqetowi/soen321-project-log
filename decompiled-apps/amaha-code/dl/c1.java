package dl;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class c1 extends BottomSheetBehavior.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f12991a;

    public c1(V3DashboardActivity v3DashboardActivity) {
        this.f12991a = v3DashboardActivity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void c(int i6, View view) {
        View n02;
        V3DashboardActivity v3DashboardActivity = this.f12991a;
        if (i6 != 1 && i6 != 3) {
            if (i6 == 4 && (n02 = v3DashboardActivity.n0(R.id.viewDashboardBlanketForeground)) != null) {
                n02.setVisibility(8);
                return;
            }
            return;
        }
        View n03 = v3DashboardActivity.n0(R.id.viewDashboardBlanketForeground);
        if (n03 != null) {
            n03.setVisibility(0);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void b(View view) {
    }
}
