package fo;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProAssessmentListingActivity;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlin.jvm.internal.k;
import org.json.JSONArray;
import ss.l;
/* compiled from: ProAssessmentListingActivity.kt */
/* loaded from: classes2.dex */
public final class e extends k implements l<JSONArray, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ProAssessmentListingActivity f15640u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ProAssessmentListingActivity proAssessmentListingActivity) {
        super(1);
        this.f15640u = proAssessmentListingActivity;
    }

    @Override // ss.l
    public final hs.k invoke(JSONArray jSONArray) {
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2 != null && jSONArray2.length() > 0) {
            ProAssessmentListingActivity proAssessmentListingActivity = this.f15640u;
            ((RobertoTextView) proAssessmentListingActivity.n0(R.id.tvAssessmentListingB2CTitle)).setVisibility(0);
            ((RecyclerView) proAssessmentListingActivity.n0(R.id.rvAssessmentListingB2CRecycler)).setVisibility(0);
            go.b bVar = new go.b(proAssessmentListingActivity, jSONArray2, new f(proAssessmentListingActivity));
            ((RecyclerView) proAssessmentListingActivity.n0(R.id.rvAssessmentListingB2CRecycler)).setLayoutManager(new LinearLayoutManager(proAssessmentListingActivity, 1, false));
            ((RecyclerView) proAssessmentListingActivity.n0(R.id.rvAssessmentListingB2CRecycler)).setAdapter(bVar);
        }
        return hs.k.f19476a;
    }
}
