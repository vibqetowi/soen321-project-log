package hk;

import android.os.Handler;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.model.AssessmentResponseAll;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import java.util.Calendar;
/* compiled from: ExptInitialAssessmentActivity.kt */
/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExptInitialAssessmentActivity f17644u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ExptInitialAssessmentActivity exptInitialAssessmentActivity) {
        super(0);
        this.f17644u = exptInitialAssessmentActivity;
    }

    @Override // ss.a
    public final hs.k invoke() {
        ExptInitialAssessmentActivity exptInitialAssessmentActivity = this.f17644u;
        int intExtra = exptInitialAssessmentActivity.getIntent().getIntExtra(Constants.DAYMODEL_POSITION, -1);
        Course courseById = FirebasePersistence.getInstance().getCourseById(exptInitialAssessmentActivity.p0());
        int score = exptInitialAssessmentActivity.U.getScore() + exptInitialAssessmentActivity.T.getScore() + exptInitialAssessmentActivity.S.getScore();
        courseById.getAssessments().add(new AssessmentResponseAll(exptInitialAssessmentActivity.S, exptInitialAssessmentActivity.T, exptInitialAssessmentActivity.U, score, intExtra));
        if (intExtra != 0) {
            if (intExtra == 30) {
                courseById.setFinalAssessmentScore(score);
            }
        } else {
            courseById.setInitialAssessmentScore(score);
        }
        if (courseById.getPlanV3().get(intExtra).getStart_date() == 0) {
            courseById.getPlanV3().get(intExtra).setStart_date(Utils.INSTANCE.getTodayTimeInSeconds());
        }
        courseById.getPlanV3().get(intExtra).setCompleted(true);
        FirebasePersistence.getInstance().updateUserOnFirebase();
        new Handler().postDelayed(new g(exptInitialAssessmentActivity, 0), 500L);
        ApplicationPersistence.getInstance().setLongValue("asst_request_sent", Calendar.getInstance().getTimeInMillis());
        return hs.k.f19476a;
    }
}
