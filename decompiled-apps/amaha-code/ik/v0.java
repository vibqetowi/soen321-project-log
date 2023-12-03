package ik;

import android.app.ProgressDialog;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.network.model.CourseResetResult;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: InitialAssessmentBuildingNewFragment.kt */
/* loaded from: classes2.dex */
public final class v0 implements CustomRetrofitCallback<CourseResetResult> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s0 f20318u;

    public v0(s0 s0Var) {
        this.f20318u = s0Var;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<CourseResetResult> call, Throwable t3) {
        s0 s0Var = this.f20318u;
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        try {
            ProgressDialog progressDialog = s0Var.f20299x;
            if (progressDialog != null) {
                progressDialog.dismiss();
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity = s0Var.getActivity();
                String string = s0Var.getString(R.string.toastRetryErrorBuilding);
                kotlin.jvm.internal.i.f(string, "getString(R.string.toastRetryErrorBuilding)");
                utils.showCustomToast(activity, string, 1);
                androidx.fragment.app.p activity2 = s0Var.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                ((InitialAssessmentActivity) activity2).n0();
                return;
            }
            kotlin.jvm.internal.i.q("progressDialog");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(s0Var.f20298w, e10);
        }
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<CourseResetResult> call, dw.z<CourseResetResult> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        s0 s0Var = this.f20318u;
        if (a10) {
            try {
                ((RobertoButton) s0Var._$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                s0.M(s0Var, false);
                s0.K(s0Var, false);
                ProgressDialog progressDialog = s0Var.f20299x;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    ((RobertoButton) s0Var._$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                    s0Var.f20296u = 0;
                    ((LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation)).setAnimation(R.raw.plan_loading_loop);
                    ((LottieAnimationView) s0Var._$_findCachedViewById(R.id.loadingAnimation)).h();
                    s0Var.P();
                    return;
                }
                kotlin.jvm.internal.i.q("progressDialog");
                throw null;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(s0Var.f20298w, e10);
                return;
            }
        }
        try {
            ProgressDialog progressDialog2 = s0Var.f20299x;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity = s0Var.getActivity();
                String string = s0Var.getString(R.string.toastRetryErrorBuilding);
                kotlin.jvm.internal.i.f(string, "getString(R.string.toastRetryErrorBuilding)");
                utils.showCustomToast(activity, string, 1);
                androidx.fragment.app.p activity2 = s0Var.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                ((InitialAssessmentActivity) activity2).n0();
                return;
            }
            kotlin.jvm.internal.i.q("progressDialog");
            throw null;
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(s0Var.f20298w, e11);
        }
    }
}
