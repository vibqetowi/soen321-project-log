package ik;

import android.app.ProgressDialog;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x f20127u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(x xVar) {
        super(0);
        this.f20127u = xVar;
    }

    @Override // ss.a
    public final hs.k invoke() {
        x xVar = this.f20127u;
        ProgressDialog progressDialog = xVar.B;
        if (progressDialog != null) {
            progressDialog.dismiss();
            ((RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
            xVar.f20328x = 0;
            ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).setAnimation(R.raw.expt_plan_loading);
            ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).h();
            xVar.M();
            return hs.k.f19476a;
        }
        kotlin.jvm.internal.i.q("progressDialog");
        throw null;
    }
}
