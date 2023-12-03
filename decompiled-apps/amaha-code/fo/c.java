package fo;

import com.theinnerhour.b2b.components.pro.assessment.activity.ProAssessmentListingActivity;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: ProAssessmentListingActivity.kt */
/* loaded from: classes2.dex */
public final class c extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ProAssessmentListingActivity f15638u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ProAssessmentListingActivity proAssessmentListingActivity) {
        super(1);
        this.f15638u = proAssessmentListingActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            bool2.booleanValue();
            if (bool2.booleanValue()) {
                this.f15638u.finish();
            }
        }
        return hs.k.f19476a;
    }
}
