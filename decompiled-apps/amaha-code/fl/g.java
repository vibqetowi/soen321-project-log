package fl;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
/* compiled from: CustomDashboardActivity.kt */
/* loaded from: classes2.dex */
public final class g extends BottomSheetBehavior.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CustomDashboardActivity f15138a;

    public g(CustomDashboardActivity customDashboardActivity) {
        this.f15138a = customDashboardActivity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void c(int i6, View view) {
        yp.c cVar;
        yp.c cVar2;
        View view2 = null;
        CustomDashboardActivity customDashboardActivity = this.f15138a;
        if (i6 != 1 && i6 != 3) {
            if (i6 == 4) {
                v.c cVar3 = customDashboardActivity.A;
                if (cVar3 != null && (cVar2 = (yp.c) cVar3.f34632w) != null) {
                    view2 = cVar2.f38755x;
                }
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        v.c cVar4 = customDashboardActivity.A;
        if (cVar4 != null && (cVar = (yp.c) cVar4.f34632w) != null) {
            view2 = cVar.f38755x;
        }
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void b(View view) {
    }
}
