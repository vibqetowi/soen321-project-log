package hk;

import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: ExptInitialAssessmentActivity.kt */
/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExptInitialAssessmentActivity f17633u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ExptInitialAssessmentActivity exptInitialAssessmentActivity) {
        super(0);
        this.f17633u = exptInitialAssessmentActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r6 <= r7.intValue()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        if (r6 > r2.intValue()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
        if (r2 <= r6.intValue()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00df, code lost:
        if (r6.intValue() > r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
        r1.P = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
        if (r3 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
        r1.R = r0.getAssessments().get(r5);
     */
    @Override // ss.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke() {
        int i6;
        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
        ExptInitialAssessmentActivity exptInitialAssessmentActivity = this.f17633u;
        Course courseByName = firebasePersistence.getCourseByName(exptInitialAssessmentActivity.f10588y);
        int i10 = exptInitialAssessmentActivity.V;
        if (i10 != 0) {
            exptInitialAssessmentActivity.f10585d0.getClass();
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 != 15) {
                    if (i10 != 30) {
                        i6 = -1;
                    } else {
                        i6 = 2;
                    }
                } else {
                    i6 = 1;
                }
            } else {
                i6 = 0;
            }
            int i11 = i6 - 1;
            if (i11 >= 0 && i6 >= 0) {
                if (exptInitialAssessmentActivity.O) {
                    if (kotlin.jvm.internal.i.b(exptInitialAssessmentActivity.f10588y, Constants.COURSE_HAPPINESS)) {
                        Integer score = courseByName.getAssessments().get(i6).getScore();
                        kotlin.jvm.internal.i.d(score);
                        int intValue = score.intValue();
                        Integer score2 = courseByName.getAssessments().get(i11).getScore();
                        kotlin.jvm.internal.i.d(score2);
                    }
                    Integer score3 = courseByName.getAssessments().get(i11).getScore();
                    kotlin.jvm.internal.i.d(score3);
                    int intValue2 = score3.intValue();
                    Integer score4 = courseByName.getAssessments().get(i6).getScore();
                    kotlin.jvm.internal.i.d(score4);
                } else {
                    int score5 = exptInitialAssessmentActivity.U.getScore() + exptInitialAssessmentActivity.T.getScore() + exptInitialAssessmentActivity.S.getScore();
                    if (kotlin.jvm.internal.i.b(exptInitialAssessmentActivity.f10588y, Constants.COURSE_HAPPINESS)) {
                        Integer score6 = courseByName.getAssessments().get(i11).getScore();
                        kotlin.jvm.internal.i.d(score6);
                    }
                    Integer score7 = courseByName.getAssessments().get(i11).getScore();
                    kotlin.jvm.internal.i.d(score7);
                }
            }
        }
        return hs.k.f19476a;
    }
}
