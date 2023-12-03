package so;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentAddFamilyMemberActivity;
/* compiled from: ExperimentAddFamilyMemberActivity.kt */
/* loaded from: classes2.dex */
public final class b extends BottomSheetBehavior.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExperimentAddFamilyMemberActivity f31792a;

    public b(ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity) {
        this.f31792a = experimentAddFamilyMemberActivity;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void c(int i6, View view) {
        ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity = this.f31792a;
        if (i6 != 3) {
            if (i6 == 4) {
                experimentAddFamilyMemberActivity.n0(R.id.viewBottomSheetTint).setVisibility(8);
                return;
            }
            return;
        }
        experimentAddFamilyMemberActivity.n0(R.id.viewBottomSheetTint).setVisibility(0);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
    public final void b(View view) {
    }
}
