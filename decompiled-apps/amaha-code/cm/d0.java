package cm;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
/* compiled from: V3GoalsRegularFragment.kt */
/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.k implements ss.l<RecommendedActivityModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c0 f5330u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var) {
        super(1);
        this.f5330u = c0Var;
    }

    @Override // ss.l
    public final hs.k invoke(RecommendedActivityModel recommendedActivityModel) {
        RecommendedActivityModel raExperimentModel = recommendedActivityModel;
        kotlin.jvm.internal.i.g(raExperimentModel, "raExperimentModel");
        int i6 = c0.J;
        c0 c0Var = this.f5330u;
        c0Var.getClass();
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString("activity_id", raExperimentModel.getGoalId());
        bundle.putString("activity_name", raExperimentModel.getTitle());
        String lowerCase = raExperimentModel.getTemplateType().toLowerCase();
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
        bundle.putString("type", lowerCase);
        bundle.putString("source", "goals");
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "activity_card_click");
        c0Var.H.a(new Intent(c0Var.requireActivity(), RecommendedActivitiesPlaybackActivity.class).putExtra("model", raExperimentModel).putExtra("source", "view_all_screen"));
        return hs.k.f19476a;
    }
}
