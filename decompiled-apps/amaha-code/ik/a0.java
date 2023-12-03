package ik;

import android.app.ProgressDialog;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.network.model.CourseResetResult;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
/* loaded from: classes2.dex */
public final class a0 implements CustomRetrofitCallback<CourseResetResult> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x f20116u;

    /* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ x f20117u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar) {
            super(0);
            this.f20117u = xVar;
        }

        @Override // ss.a
        public final hs.k invoke() {
            x xVar = this.f20117u;
            ProgressDialog progressDialog = xVar.B;
            if (progressDialog != null) {
                progressDialog.dismiss();
                AssessmentListener assessmentListener = xVar.f20326v;
                if (assessmentListener != null) {
                    String string = xVar.getString(R.string.toastRetryErrorBuilding);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.toastRetryErrorBuilding)");
                    assessmentListener.onError(string);
                }
                return hs.k.f19476a;
            }
            kotlin.jvm.internal.i.q("progressDialog");
            throw null;
        }
    }

    /* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ dw.b<CourseResetResult> f20119v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ dw.z<CourseResetResult> f20120w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x f20121x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dw.b<CourseResetResult> bVar, dw.z<CourseResetResult> zVar, x xVar) {
            super(0);
            this.f20119v = bVar;
            this.f20120w = zVar;
            this.f20121x = xVar;
        }

        @Override // ss.a
        public final hs.k invoke() {
            a0 a0Var = a0.this;
            dw.b<CourseResetResult> bVar = this.f20119v;
            dw.z<CourseResetResult> zVar = this.f20120w;
            CustomRetrofitCallback.DefaultImpls.onResponse(a0Var, bVar, zVar);
            boolean a10 = zVar.a();
            x xVar = this.f20121x;
            if (a10) {
                ((RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                xVar.K(false);
                xVar.f20328x = 0;
                xVar.J(false);
                ProgressDialog progressDialog = xVar.B;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    ((RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                    ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).setAnimation(R.raw.expt_plan_loading);
                    ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).h();
                    xVar.M();
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            } else {
                ProgressDialog progressDialog2 = xVar.B;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                    AssessmentListener assessmentListener = xVar.f20326v;
                    if (assessmentListener != null) {
                        String string = xVar.getString(R.string.toastRetryErrorBuilding);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.toastRetryErrorBuilding)");
                        assessmentListener.onError(string);
                    }
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    public a0(x xVar) {
        this.f20116u = xVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<CourseResetResult> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        x xVar = this.f20116u;
        UtilsKt.logError(xVar.f20325u, "Error in plan retry", new a(xVar));
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<CourseResetResult> call, dw.z<CourseResetResult> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        x xVar = this.f20116u;
        UtilsKt.logError(xVar.f20325u, "Error in plan retry", new b(call, response, xVar));
    }
}
