package fo;

import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProAssessmentListingActivity;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: ProAssessmentListingActivity.kt */
/* loaded from: classes2.dex */
public final class b extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ProAssessmentListingActivity f15637u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ProAssessmentListingActivity proAssessmentListingActivity) {
        super(1);
        this.f15637u = proAssessmentListingActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        int i6;
        Boolean bool2 = bool;
        if (bool2 != null) {
            boolean booleanValue = bool2.booleanValue();
            int i10 = ProAssessmentListingActivity.f11511z;
            ProAssessmentListingActivity proAssessmentListingActivity = this.f15637u;
            ProgressBar progressBar = (ProgressBar) proAssessmentListingActivity.n0(R.id.pbAssessmentListingProgress);
            int i11 = 8;
            if (booleanValue) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            progressBar.setVisibility(i6);
            NestedScrollView nestedScrollView = (NestedScrollView) proAssessmentListingActivity.n0(R.id.svAssessmentListContainer);
            if (!booleanValue) {
                i11 = 0;
            }
            nestedScrollView.setVisibility(i11);
        }
        return hs.k.f19476a;
    }
}
