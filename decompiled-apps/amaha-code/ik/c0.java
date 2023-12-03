package ik;

import android.app.ProgressDialog;
import android.os.Bundle;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.AssessmentResponseAll;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.CourseResetModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ExptInitialAssessmentPlanLoadingFragment.kt */
/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x f20137u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(x xVar) {
        super(0);
        this.f20137u = xVar;
    }

    @Override // ss.a
    public final hs.k invoke() {
        boolean z10;
        HashMap<String, Object> appConfig;
        x xVar = this.f20137u;
        xVar.E = true;
        Utils utils = Utils.INSTANCE;
        if (utils.checkConnectivity(xVar.requireContext())) {
            Course courseByName = FirebasePersistence.getInstance().getCourseByName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            int i6 = 0;
            boolean z11 = xVar.G;
            if (!z11 ? !((courseByName.getAssessments().size() != 1 || courseByName.getPlanV3().size() != 1) && (courseByName.getAssessments().size() != 2 || courseByName.getPlanV3().size() != 16)) : !(courseByName.getAssessments().size() < 1 || !courseByName.getPlanSuggested().isEmpty())) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object obj = null;
            String str = xVar.f20325u;
            if (z10) {
                if (z11) {
                    try {
                        ArrayList<AssessmentResponseAll> assessments = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getAssessments();
                        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                        courseById.setAssessments(new ArrayList<>());
                        courseById.getPlanV3().get(0).setCompleted(false);
                        courseById.getPlanV3().get(0).setStart_date(0L);
                        courseById.getPlanV3().get(0).setLast_accessed_date(0L);
                        ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                        applicationPersistence.setIntValue(courseById.getCourseName() + "CourseSize", 0);
                        FirebasePersistence.getInstance().courseSize = 0;
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        Course courseById2 = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                        courseById2.setAssessments(assessments);
                        courseById2.getPlanV3().get(0).setCompleted(true);
                        courseById2.getPlanV3().get(0).setStart_date(utils.getTodayTimeInSeconds());
                        courseById2.getPlanV3().get(0).setLast_accessed_date(utils.getTodayTimeInSeconds());
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        ((RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                        xVar.K(false);
                        xVar.f20328x = 0;
                        xVar.J(false);
                        ((RobertoButton) xVar._$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
                        ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).setAnimation(R.raw.expt_plan_loading);
                        ((LottieAnimationView) xVar._$_findCachedViewById(R.id.loadingAnimation)).h();
                        xVar.M();
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str, e10);
                    }
                } else {
                    ProgressDialog progressDialog = xVar.B;
                    if (progressDialog != null) {
                        progressDialog.show();
                        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                        kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                        ArrayList k10 = ca.a.k(currentCourseName);
                        String a10 = FirebaseAuth.getInstance().a();
                        kotlin.jvm.internal.i.d(a10);
                        ((or.a) nr.b.a(or.a.class)).a("https://us-central1-gcpinnerhour.cloudfunctions.net/retryFetch", new CourseResetModel(k10, a10)).I(new a0(xVar));
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                }
            } else {
                UtilsKt.logError(str, "Error in plan retry", new b0(xVar));
            }
            if (courseByName.getAssessments().size() != 1) {
                i6 = 15;
            }
            Bundle bundle = new Bundle();
            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            bundle.putInt("day", i6);
            User f = defpackage.b.f(bundle, "source", "assessment");
            if (f != null && (appConfig = f.getAppConfig()) != null) {
                obj = appConfig.get(Constants.ONBOARDING_EXPERIMENT);
            }
            bundle.putString("variant", (String) obj);
            UtilsKt.fireAnalytics("plan_fetch_retry", bundle);
        }
        return hs.k.f19476a;
    }
}
