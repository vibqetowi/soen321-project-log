package cm;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.Locale;
/* compiled from: FirestoreGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.k implements ss.l<RecommendedActivityModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f5378u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar) {
        super(1);
        this.f5378u = pVar;
    }

    @Override // ss.l
    public final hs.k invoke(RecommendedActivityModel recommendedActivityModel) {
        RecommendedActivityModel raExperimentModel = recommendedActivityModel;
        kotlin.jvm.internal.i.g(raExperimentModel, "raExperimentModel");
        int i6 = p.G;
        p pVar = this.f5378u;
        pVar.getClass();
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
        bundle.putString("activity_id", raExperimentModel.getGoalId());
        bundle.putString("activity_name", raExperimentModel.getTitle());
        String templateType = raExperimentModel.getTemplateType();
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.i.f(ENGLISH, "ENGLISH");
        String lowerCase = templateType.toLowerCase(ENGLISH);
        kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        bundle.putString("type", lowerCase);
        bundle.putString("source", "goals");
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "activity_card_click");
        fm.a aVar = pVar.f5373y;
        if (aVar != null) {
            Intent putExtra = new Intent(pVar.requireContext(), RecommendedActivitiesPlaybackActivity.class).putExtra("model", raExperimentModel).putExtra("source", "view_all_screen");
            kotlin.jvm.internal.i.f(putExtra, "Intent(requireContext(),…urce\", \"view_all_screen\")");
            aVar.z(putExtra);
        }
        return hs.k.f19476a;
    }
}
