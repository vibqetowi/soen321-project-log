package hk;

import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: ExptInitialAssessmentActivity.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExptInitialAssessmentActivity f17636u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ExptInitialAssessmentActivity exptInitialAssessmentActivity) {
        super(0);
        this.f17636u = exptInitialAssessmentActivity;
    }

    @Override // ss.a
    public final hs.k invoke() {
        boolean z10;
        ExptInitialAssessmentActivity exptInitialAssessmentActivity = this.f17636u;
        exptInitialAssessmentActivity.V = exptInitialAssessmentActivity.getIntent().getIntExtra(Constants.DAYMODEL_POSITION, -1);
        Course courseById = FirebasePersistence.getInstance().getCourseById(exptInitialAssessmentActivity.p0());
        int i6 = exptInitialAssessmentActivity.V;
        int i10 = 0;
        if (i6 == 0 ? !(courseById.getPlanV3().size() < 1 || !courseById.getPlanV3().get(0).isCompleted()) : !(i6 == 15 ? courseById.getPlanV3().size() < 16 || !courseById.getPlanV3().get(15).isCompleted() : i6 != 30 || courseById.getPlanV3().size() < 31 || !courseById.getPlanV3().get(30).isCompleted())) {
            z10 = true;
        } else {
            z10 = false;
        }
        exptInitialAssessmentActivity.O = z10;
        if (z10) {
            int i11 = exptInitialAssessmentActivity.V;
            exptInitialAssessmentActivity.f10585d0.getClass();
            if (i11 != 0) {
                if (i11 != 15) {
                    if (i11 != 30) {
                        i10 = -1;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 1;
                }
            }
            if (i10 != -1 && courseById.getAssessments().size() > i10) {
                exptInitialAssessmentActivity.Q = courseById.getAssessments().get(i10);
                exptInitialAssessmentActivity.I = 1;
            }
        }
        return hs.k.f19476a;
    }
}
