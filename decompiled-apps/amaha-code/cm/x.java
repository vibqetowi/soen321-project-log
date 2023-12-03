package cm;

import android.content.Intent;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: FirestoreGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends RecommendedActivityModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f5387u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p pVar) {
        super(1);
        this.f5387u = pVar;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends RecommendedActivityModel> singleUseEvent) {
        RecommendedActivityModel contentIfNotHandled;
        SingleUseEvent<? extends RecommendedActivityModel> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            p pVar = this.f5387u;
            pVar.E.a(new Intent(pVar.requireContext(), RecommendedActivitiesPlaybackActivity.class).putExtra("model", contentIfNotHandled).putExtra("source", "goals"));
        }
        return hs.k.f19476a;
    }
}
