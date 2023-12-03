package xo;

import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import java.util.ArrayList;
import kotlin.jvm.internal.k;
import nn.v0;
import ss.l;
/* compiled from: RecommendedActivitiesExperimentActivity.kt */
/* loaded from: classes2.dex */
public final class b extends k implements l<ArrayList<RecommendedActivityModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ RecommendedActivitiesExperimentActivity f37873u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RecommendedActivitiesExperimentActivity recommendedActivitiesExperimentActivity) {
        super(1);
        this.f37873u = recommendedActivitiesExperimentActivity;
    }

    @Override // ss.l
    public final hs.k invoke(ArrayList<RecommendedActivityModel> arrayList) {
        ArrayList<RecommendedActivityModel> arrayList2 = arrayList;
        RecommendedActivitiesExperimentActivity recommendedActivitiesExperimentActivity = this.f37873u;
        if (arrayList2 != null) {
            int i6 = RecommendedActivitiesExperimentActivity.f11603z;
            ((ConstraintLayout) recommendedActivitiesExperimentActivity.n0(R.id.clRAExperimentLoadingLayout)).setVisibility(8);
            ((AppCompatImageView) recommendedActivitiesExperimentActivity.n0(R.id.planHeaderArrowBack)).setOnClickListener(new v0(20, recommendedActivitiesExperimentActivity));
            ((RecyclerView) recommendedActivitiesExperimentActivity.n0(R.id.rvRecommendedActivities)).setLayoutManager(new GridLayoutManager(recommendedActivitiesExperimentActivity, 2));
            ((RecyclerView) recommendedActivitiesExperimentActivity.n0(R.id.rvRecommendedActivities)).setHasFixedSize(true);
            ((RecyclerView) recommendedActivitiesExperimentActivity.n0(R.id.rvRecommendedActivities)).setItemAnimator(new androidx.recyclerview.widget.c());
            ((RecyclerView) recommendedActivitiesExperimentActivity.n0(R.id.rvRecommendedActivities)).setNestedScrollingEnabled(false);
            ((RecyclerView) recommendedActivitiesExperimentActivity.n0(R.id.rvRecommendedActivities)).setAdapter(new yo.a(recommendedActivitiesExperimentActivity, arrayList2, new a(recommendedActivitiesExperimentActivity)));
        } else {
            Toast.makeText(recommendedActivitiesExperimentActivity, "Error in fetching tools to unwind.", 0).show();
        }
        return hs.k.f19476a;
    }
}
