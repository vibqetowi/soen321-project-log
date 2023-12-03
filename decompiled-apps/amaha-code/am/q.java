package am;

import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f659u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(1);
        this.f659u = firestoreGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            contentIfNotHandled.booleanValue();
            ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
            int i6 = FirestoreGoalsActivity.E;
            this.f659u.o0(true, false);
            UtilsKt.fireAnalytics("goal_negative_feedback_submit", UtilsKt.getAnalyticsBundle());
        }
        return hs.k.f19476a;
    }
}
