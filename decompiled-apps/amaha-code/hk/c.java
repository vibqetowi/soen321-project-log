package hk;

import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import kotlin.jvm.internal.u;
/* compiled from: ExptInitialAssessmentActivity.kt */
/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExptInitialAssessmentActivity f17634u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u f17635v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ExptInitialAssessmentActivity exptInitialAssessmentActivity, u uVar) {
        super(0);
        this.f17634u = exptInitialAssessmentActivity;
        this.f17635v = uVar;
    }

    @Override // ss.a
    public final hs.k invoke() {
        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
        ExptInitialAssessmentActivity exptInitialAssessmentActivity = this.f17634u;
        Course courseByName = firebasePersistence.getCourseByName(exptInitialAssessmentActivity.f10588y);
        if (courseByName != null) {
            int i6 = exptInitialAssessmentActivity.V;
            boolean z10 = true;
            if (i6 == 0 ? courseByName.getPlanV3().size() <= 1 : i6 == 15 && courseByName.getPlanV3().size() <= 16) {
                z10 = false;
            }
            this.f17635v.f23466u = z10;
        }
        return hs.k.f19476a;
    }
}
