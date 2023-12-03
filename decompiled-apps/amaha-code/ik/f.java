package ik;

import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.network.model.CourseResetResult;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.LoadingDots;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: ExptInitialAssessmentA3VarBSelfCareFragment.kt */
/* loaded from: classes2.dex */
public final class f implements CustomRetrofitCallback<CourseResetResult> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f20170u;

    /* compiled from: ExptInitialAssessmentA3VarBSelfCareFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ d f20171u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(0);
            this.f20171u = dVar;
        }

        @Override // ss.a
        public final hs.k invoke() {
            d dVar = this.f20171u;
            LoadingDots loadingDots = (LoadingDots) dVar._$_findCachedViewById(R.id.ldCsaA3OfferingSelfCareRetryLoading);
            if (loadingDots != null) {
                loadingDots.setVisibility(8);
            }
            RobertoButton robertoButton = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareFailureButton);
            if (robertoButton != null) {
                robertoButton.setText("TRY AGAIN");
            }
            Toast.makeText(dVar.requireActivity(), dVar.getString(R.string.toastRetryErrorBuilding), 0).show();
            dVar.f20146x = false;
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExptInitialAssessmentA3VarBSelfCareFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ dw.b<CourseResetResult> f20173v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ dw.z<CourseResetResult> f20174w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d f20175x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dw.b<CourseResetResult> bVar, dw.z<CourseResetResult> zVar, d dVar) {
            super(0);
            this.f20173v = bVar;
            this.f20174w = zVar;
            this.f20175x = dVar;
        }

        @Override // ss.a
        public final hs.k invoke() {
            f fVar = f.this;
            dw.b<CourseResetResult> bVar = this.f20173v;
            dw.z<CourseResetResult> zVar = this.f20174w;
            CustomRetrofitCallback.DefaultImpls.onResponse(fVar, bVar, zVar);
            d dVar = this.f20175x;
            dVar.f20146x = false;
            if (zVar.a()) {
                LoadingDots loadingDots = (LoadingDots) dVar._$_findCachedViewById(R.id.ldCsaA3OfferingSelfCareRetryLoading);
                if (loadingDots != null) {
                    loadingDots.setVisibility(8);
                }
                RobertoButton robertoButton = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareFailureButton);
                if (robertoButton != null) {
                    robertoButton.setText("TRY AGAIN");
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clCsaA3OfferingSelfCareLoaderContainer);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                    constraintLayout.setAlpha(1.0f);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clCsaA3OfferingSelfCarePostLoadContainer);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(4);
                }
                dVar.f20145w = true;
                dVar.f20144v = 0;
                RobertoButton robertoButton2 = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareSuccessButton);
                if (robertoButton2 != null) {
                    robertoButton2.setOnClickListener(null);
                }
                RobertoButton robertoButton3 = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareFailureButton);
                if (robertoButton3 != null) {
                    robertoButton3.setOnClickListener(null);
                }
                LottieAnimationView lottieAnimationView = (LottieAnimationView) dVar._$_findCachedViewById(R.id.lottieCsaA3OfferingSelfCareAnim);
                if (lottieAnimationView != null) {
                    lottieAnimationView.c(dVar.f20147y);
                    lottieAnimationView.h();
                }
            } else {
                LoadingDots loadingDots2 = (LoadingDots) dVar._$_findCachedViewById(R.id.ldCsaA3OfferingSelfCareRetryLoading);
                if (loadingDots2 != null) {
                    loadingDots2.setVisibility(8);
                }
                RobertoButton robertoButton4 = (RobertoButton) dVar._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareFailureButton);
                if (robertoButton4 != null) {
                    robertoButton4.setText("TRY AGAIN");
                }
                Toast.makeText(dVar.requireActivity(), dVar.getString(R.string.toastRetryErrorBuilding), 0).show();
            }
            return hs.k.f19476a;
        }
    }

    public f(d dVar) {
        this.f20170u = dVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<CourseResetResult> call, Throwable t3) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(t3, "t");
        d dVar = this.f20170u;
        UtilsKt.logError(dVar.f20143u, "Error in plan retry", new a(dVar));
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<CourseResetResult> call, dw.z<CourseResetResult> response) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(response, "response");
        d dVar = this.f20170u;
        UtilsKt.logError(dVar.f20143u, "Error in plan retry", new b(call, response, dVar));
    }
}
