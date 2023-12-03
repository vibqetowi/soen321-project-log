package hk;

import android.view.View;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17642u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ExptInitialAssessmentActivity f17643v;

    public /* synthetic */ g(ExptInitialAssessmentActivity exptInitialAssessmentActivity, int i6) {
        this.f17642u = i6;
        this.f17643v = exptInitialAssessmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f17642u;
        ExptInitialAssessmentActivity this$0 = this.f17643v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(20, Constants.GAMIFICATION_COMPLETING_INITIAL_ASSESSMENT_TASK, FirebasePersistence.getInstance().getUser().getCurrentCourseName(), FirebasePersistence.getInstance().getUser().getCurrentCourseName()));
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10586w, e10);
                    return;
                }
            case 1:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                UiUtils.Companion.hideViews$default(UiUtils.Companion, new View[]{(RobertoTextView) this$0.u0(R.id.initialAssessmentCounter), (LinearLayout) this$0.u0(R.id.initialAssessmentIcons)}, false, 2, null);
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                UiUtils.Companion.hideViews(new View[]{(RobertoTextView) this$0.u0(R.id.initialAssessmentCounter), (LinearLayout) this$0.u0(R.id.initialAssessmentIcons)}, true);
                return;
        }
    }
}
