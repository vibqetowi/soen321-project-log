package xo;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: RecommendedActivitiesExperimentActivity.kt */
/* loaded from: classes2.dex */
public final class a extends k implements l<RecommendedActivityModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ RecommendedActivitiesExperimentActivity f37872u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RecommendedActivitiesExperimentActivity recommendedActivitiesExperimentActivity) {
        super(1);
        this.f37872u = recommendedActivitiesExperimentActivity;
    }

    @Override // ss.l
    public final hs.k invoke(RecommendedActivityModel recommendedActivityModel) {
        RecommendedActivityModel raExperimentModel = recommendedActivityModel;
        i.g(raExperimentModel, "raExperimentModel");
        int i6 = RecommendedActivitiesExperimentActivity.f11603z;
        RecommendedActivitiesExperimentActivity recommendedActivitiesExperimentActivity = this.f37872u;
        recommendedActivitiesExperimentActivity.getClass();
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString("activity_id", raExperimentModel.getGoalId());
        bundle.putString("activity_name", raExperimentModel.getTitle());
        String lowerCase = raExperimentModel.getTemplateType().toLowerCase();
        i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        bundle.putString("type", lowerCase);
        bundle.putString("source", "view_all_screen");
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "activity_card_click");
        recommendedActivitiesExperimentActivity.f11606x.a(new Intent(recommendedActivitiesExperimentActivity, RecommendedActivitiesPlaybackActivity.class).putExtra("model", raExperimentModel).putExtra("source", "view_all_screen"));
        return hs.k.f19476a;
    }
}
