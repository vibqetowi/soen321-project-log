package fo;

import android.content.Intent;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProAssessmentListingActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import org.json.JSONObject;
import ss.p;
/* compiled from: ProAssessmentListingActivity.kt */
/* loaded from: classes2.dex */
public final class f extends k implements p<JSONObject, Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ProAssessmentListingActivity f15641u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ProAssessmentListingActivity proAssessmentListingActivity) {
        super(2);
        this.f15641u = proAssessmentListingActivity;
    }

    @Override // ss.p
    public final hs.k invoke(JSONObject jSONObject, Boolean bool) {
        JSONObject assessment = jSONObject;
        boolean booleanValue = bool.booleanValue();
        i.g(assessment, "assessment");
        ProAssessmentListingActivity proAssessmentListingActivity = this.f15641u;
        proAssessmentListingActivity.startActivityForResult(new Intent(proAssessmentListingActivity, ProTakeAssessmentActivity.class).putExtra("assessment", assessment.toString()).putExtra("assessmentComplete", booleanValue), proAssessmentListingActivity.f11514x);
        return hs.k.f19476a;
    }
}
