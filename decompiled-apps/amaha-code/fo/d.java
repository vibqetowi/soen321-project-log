package fo;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProAssessmentListingActivity;
import kotlin.jvm.internal.k;
import org.json.JSONObject;
import ss.l;
/* compiled from: ProAssessmentListingActivity.kt */
/* loaded from: classes2.dex */
public final class d extends k implements l<JSONObject, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ProAssessmentListingActivity f15639u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ProAssessmentListingActivity proAssessmentListingActivity) {
        super(1);
        this.f15639u = proAssessmentListingActivity;
    }

    @Override // ss.l
    public final hs.k invoke(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 != null && jSONObject2.length() > 0) {
            ProAssessmentListingActivity proAssessmentListingActivity = this.f15639u;
            ((ConstraintLayout) proAssessmentListingActivity.n0(R.id.clAssessmentListingRowProAssessment)).setVisibility(0);
            proAssessmentListingActivity.f11513w = jSONObject2;
        }
        return hs.k.f19476a;
    }
}
