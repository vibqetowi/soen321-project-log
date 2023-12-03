package tp;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalGoalsActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import java.util.ArrayList;
/* compiled from: TopicalGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.k implements ss.l<ArrayList<Goal>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TopicalGoalsActivity f33414u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TopicalGoalsActivity topicalGoalsActivity) {
        super(1);
        this.f33414u = topicalGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(ArrayList<Goal> arrayList) {
        ArrayList<Goal> it = arrayList;
        TopicalGoalsActivity topicalGoalsActivity = this.f33414u;
        topicalGoalsActivity.D.clear();
        topicalGoalsActivity.D.addAll(it);
        topicalGoalsActivity.o0();
        kotlin.jvm.internal.i.f(it, "it");
        if ((!it.isEmpty()) && !ApplicationPersistence.getInstance().getBooleanValue("topical_clickable_goal_info", false)) {
            if (((ConstraintLayout) topicalGoalsActivity.n0(R.id.goalInfoLayout)).getVisibility() == 8) {
                ((ConstraintLayout) topicalGoalsActivity.n0(R.id.goalInfoLayout)).setVisibility(0);
                topicalGoalsActivity.r0();
            }
        } else if (((ConstraintLayout) topicalGoalsActivity.n0(R.id.goalInfoLayout)).getVisibility() == 0) {
            ((ConstraintLayout) topicalGoalsActivity.n0(R.id.goalInfoLayout)).setVisibility(8);
            BottomSheetBehavior from = BottomSheetBehavior.from((ConstraintLayout) topicalGoalsActivity.n0(R.id.bottom_sheet));
            from.setPeekHeight(from.getPeekHeight() + 175);
        }
        up.c cVar = topicalGoalsActivity.F;
        kotlin.jvm.internal.i.d(cVar);
        cVar.i();
        topicalGoalsActivity.t0(null);
        return hs.k.f19476a;
    }
}
