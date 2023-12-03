package nn;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFragmentListener;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener;
import com.theinnerhour.b2b.components.onboarding.activity.NewOnBoardingInfoScreenActivity;
import com.theinnerhour.b2b.components.onboarding.activity.OnboardingFlowActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProAssessmentDetailActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26629u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f26630v;

    public /* synthetic */ v0(int i6, Object obj) {
        this.f26629u = i6;
        this.f26630v = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        androidx.fragment.app.p activity;
        MultiTrackerActivity multiTrackerActivity;
        String str;
        androidx.fragment.app.y supportFragmentManager;
        NewOnBoardingInfoScreenActivity newOnBoardingInfoScreenActivity;
        Object obj;
        HashMap<String, Object> appConfig;
        OnBackPressedDispatcher onBackPressedDispatcher;
        View view2;
        RobertoEditText robertoEditText;
        Editable editable;
        boolean z10;
        View view3;
        RobertoEditText robertoEditText2;
        View view4;
        RobertoEditText robertoEditText3;
        ep.d dVar;
        String str2;
        pp.c cVar;
        String str3;
        HashMap<String, Object> appConfig2;
        String str4;
        String str5;
        androidx.lifecycle.w<String> wVar;
        AppCompatImageView appCompatImageView;
        View view5;
        RobertoButton robertoButton;
        RobertoTextView robertoTextView;
        ProgressBar progressBar;
        int i6 = this.f26629u;
        boolean z11 = false;
        MultiTrackerFragmentListener multiTrackerFragmentListener = null;
        r11 = null;
        Object obj2 = null;
        r11 = null;
        Editable editable2 = null;
        r11 = null;
        Editable editable3 = null;
        Editable editable4 = null;
        Editable editable5 = null;
        r11 = null;
        Editable editable6 = null;
        OnboardingFlowActivity onboardingFlowActivity = null;
        String str6 = null;
        MultiTrackerActivity multiTrackerActivity2 = null;
        Object obj3 = this.f26630v;
        switch (i6) {
            case 0:
                w0 this$0 = (w0) obj3;
                int i10 = w0.J;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.F().F();
                return;
            case 1:
                x0 this$02 = (x0) obj3;
                int i11 = x0.f26651w;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                try {
                    if (Utils.INSTANCE.checkConnectivity(this$02.requireActivity())) {
                        gk.a.b(null, "dynamic_campaign_card_click");
                        androidx.fragment.app.p requireActivity = this$02.requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                        this$02.startActivity(tr.r.s(requireActivity, false).putExtra("source", "dynamic_campaign_card"));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$02.f26652u, e10);
                    return;
                }
            case 2:
                m1 this$03 = (m1) obj3;
                int i12 = m1.K;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                try {
                    if (this$03.isAdded() && (activity = this$03.getActivity()) != null) {
                        activity.finish();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$03.f26549v, e11);
                    return;
                }
            case 3:
                MultiTrackerActivity this$04 = (MultiTrackerActivity) obj3;
                int i13 = MultiTrackerActivity.J;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                Fragment E = this$04.getSupportFragmentManager().E(R.id.multiTrackerBottomSheetFragmentContainer);
                if (E instanceof MultiTrackerFragmentListener) {
                    multiTrackerFragmentListener = (MultiTrackerFragmentListener) E;
                }
                if (multiTrackerFragmentListener != null) {
                    multiTrackerFragmentListener.onButtonClick();
                    return;
                }
                return;
            case 4:
                tn.e this$05 = (tn.e) obj3;
                int i14 = tn.e.f33338z;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                Bundle bundle = new Bundle();
                androidx.fragment.app.p activity2 = this$05.getActivity();
                if (activity2 instanceof MultiTrackerActivity) {
                    multiTrackerActivity = (MultiTrackerActivity) activity2;
                } else {
                    multiTrackerActivity = null;
                }
                if (multiTrackerActivity != null) {
                    str = multiTrackerActivity.H;
                } else {
                    str = null;
                }
                bundle.putString("source", str);
                androidx.fragment.app.p activity3 = this$05.getActivity();
                if (activity3 instanceof MultiTrackerActivity) {
                    multiTrackerActivity2 = (MultiTrackerActivity) activity3;
                }
                if (multiTrackerActivity2 != null) {
                    bundle.putInt("mood", multiTrackerActivity2.B);
                }
                UtilsKt.fireAnalytics("new_tracker_add_notes_click", bundle);
                MultiTrackerListener multiTrackerListener = this$05.f33341w;
                if (multiTrackerListener != null) {
                    multiTrackerListener.setActivities(this$05.f33340v);
                }
                androidx.fragment.app.p activity4 = this$05.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity");
                ((MultiTrackerActivity) activity4).r0(new tn.l());
                return;
            case 5:
                tn.k this$06 = (tn.k) obj3;
                int i15 = tn.k.f33369z;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                Bundle arguments = this$06.getArguments();
                if (arguments != null && arguments.getBoolean("show_logs")) {
                    z11 = true;
                }
                if (z11) {
                    androidx.fragment.app.p activity5 = this$06.getActivity();
                    if (activity5 != null) {
                        activity5.finish();
                        return;
                    }
                    return;
                }
                androidx.fragment.app.p activity6 = this$06.getActivity();
                if (activity6 != null && (supportFragmentManager = activity6.getSupportFragmentManager()) != null) {
                    supportFragmentManager.W();
                    return;
                }
                return;
            case 6:
                bo.f this$07 = (bo.f) obj3;
                int i16 = bo.f.f4578w;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                androidx.fragment.app.p requireActivity2 = this$07.requireActivity();
                if (requireActivity2 instanceof NewOnBoardingInfoScreenActivity) {
                    newOnBoardingInfoScreenActivity = (NewOnBoardingInfoScreenActivity) requireActivity2;
                } else {
                    newOnBoardingInfoScreenActivity = null;
                }
                if (newOnBoardingInfoScreenActivity != null) {
                    try {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((FrameLayout) newOnBoardingInfoScreenActivity.n0(R.id.flInfoScreenWelcomeContainer), "alpha", 1.0f, 0.0f);
                        ofFloat.setDuration(250L);
                        ofFloat.start();
                        ofFloat.addListener(new zn.b(newOnBoardingInfoScreenActivity, ofFloat));
                        ofFloat.start();
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(newOnBoardingInfoScreenActivity.f11489v, e12);
                    }
                }
                String str7 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (appConfig = user.getAppConfig()) != null) {
                    obj = appConfig.get(Constants.NEW_COURSES_EXPERIMENT);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str6 = obj;
                }
                bundle2.putString(Constants.NEW_COURSES_EXPERIMENT, str6);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle2, "onboarding_welcome_click");
                return;
            case 7:
                bo.i this$08 = (bo.i) obj3;
                int i17 = bo.i.f4591x;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                androidx.fragment.app.p requireActivity3 = this$08.requireActivity();
                if (requireActivity3 instanceof OnboardingFlowActivity) {
                    onboardingFlowActivity = (OnboardingFlowActivity) requireActivity3;
                }
                if (onboardingFlowActivity != null && (onBackPressedDispatcher = onboardingFlowActivity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.b();
                    return;
                }
                return;
            case 8:
                ProAssessmentDetailActivity this$09 = (ProAssessmentDetailActivity) obj3;
                int i18 = ProAssessmentDetailActivity.f11507y;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                this$09.finish();
                return;
            case 9:
                ho.c this$010 = (ho.c) obj3;
                int i19 = ho.c.f17972y;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                boolean z12 = this$010.f17975w;
                ArrayList<String> arrayList = this$010.f17974v;
                if (z12) {
                    LinearLayout linearLayout = (LinearLayout) this$010._$_findCachedViewById(R.id.addressConcernsOptionsLL);
                    if (linearLayout != null) {
                        view2 = linearLayout.getChildAt(((LinearLayout) this$010._$_findCachedViewById(R.id.addressConcernsOptionsLL)).getChildCount() - 1);
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && (robertoEditText = (RobertoEditText) view2.findViewById(R.id.optionEditText)) != null) {
                        editable6 = robertoEditText.getText();
                    }
                    arrayList.add(gv.r.i1(String.valueOf(editable6)).toString());
                }
                if (!arrayList.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("question", this$010.getString(R.string.paAddressConcernsQues));
                    jSONObject.put("type", "multiselect");
                    jSONObject.put("options", new JSONArray((Collection) arrayList));
                    androidx.fragment.app.p activity7 = this$010.getActivity();
                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                    ((ProInitialAssessmentActivity) activity7).v0(jSONObject);
                    return;
                }
                return;
            case 10:
                ho.d this$011 = (ho.d) obj3;
                int i20 = ho.d.f17986w;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                RobertoEditText robertoEditText4 = (RobertoEditText) this$011._$_findCachedViewById(R.id.paAssessmentAgeText);
                if (robertoEditText4 != null) {
                    editable = robertoEditText4.getText();
                } else {
                    editable = null;
                }
                if (editable != null && !gv.n.B0(editable)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    if (Integer.parseInt(editable.toString()) > 120) {
                        Utils utils = Utils.INSTANCE;
                        Context requireContext = this$011.requireContext();
                        String string = this$011.getString(R.string.paAgeErrorMsg);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.paAgeErrorMsg)");
                        utils.showCustomToast(requireContext, string);
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("question", this$011.getString(R.string.paAgeQues));
                    jSONObject2.put("type", "textinput");
                    String[] strArr = new String[1];
                    RobertoEditText robertoEditText5 = (RobertoEditText) this$011._$_findCachedViewById(R.id.paAssessmentAgeText);
                    if (robertoEditText5 != null) {
                        editable5 = robertoEditText5.getText();
                    }
                    strArr[0] = String.valueOf(editable5);
                    jSONObject2.put("options", new JSONArray(strArr));
                    androidx.fragment.app.p activity8 = this$011.getActivity();
                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                    ((ProInitialAssessmentActivity) activity8).v0(jSONObject2);
                    return;
                }
                return;
            case 11:
                ho.g this$012 = (ho.g) obj3;
                int i21 = ho.g.f18000x;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                ArrayList<String> arrayList2 = this$012.f18002v;
                if (!arrayList2.isEmpty()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("question", this$012.getString(R.string.paFocusQues));
                    jSONObject3.put("type", "multiselect");
                    jSONObject3.put("options", new JSONArray((Collection) arrayList2));
                    androidx.fragment.app.p activity9 = this$012.getActivity();
                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                    ((ProInitialAssessmentActivity) activity9).v0(jSONObject3);
                    return;
                }
                return;
            case 12:
                ho.j this$013 = (ho.j) obj3;
                int i22 = ho.j.f18010w;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                gk.a.b(null, "pro_assessment_start");
                androidx.fragment.app.p activity10 = this$013.getActivity();
                kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                ((ProInitialAssessmentActivity) activity10).t0();
                return;
            case 13:
                ho.k this$014 = (ho.k) obj3;
                int i23 = ho.k.f18013w;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("question", this$014.getString(R.string.paNameQues));
                jSONObject4.put("type", "textinput");
                String[] strArr2 = new String[1];
                RobertoEditText robertoEditText6 = (RobertoEditText) this$014._$_findCachedViewById(R.id.paAssessmentNameText);
                if (robertoEditText6 != null) {
                    editable4 = robertoEditText6.getText();
                }
                strArr2[0] = gv.r.i1(String.valueOf(editable4)).toString();
                jSONObject4.put("options", new JSONArray(strArr2));
                androidx.fragment.app.p activity11 = this$014.getActivity();
                kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                ((ProInitialAssessmentActivity) activity11).v0(jSONObject4);
                return;
            case 14:
                ho.n this$015 = (ho.n) obj3;
                int i24 = ho.n.f18024z;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                boolean z13 = this$015.f18028x;
                ArrayList<String> arrayList3 = this$015.f18027w;
                if (z13) {
                    if (!arrayList3.isEmpty()) {
                        this$015.K(false);
                        return;
                    }
                    return;
                }
                String obj4 = gv.r.i1(String.valueOf(((RobertoEditText) this$015._$_findCachedViewById(R.id.presentConcernTellUsMoreEditText)).getText())).toString();
                if (!gv.n.B0(obj4)) {
                    arrayList3.add(obj4);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("question", this$015.getString(R.string.paPresentConcernsQues));
                    jSONObject5.put("type", "multiselect");
                    jSONObject5.put("options", new JSONArray((Collection) arrayList3));
                    androidx.fragment.app.p activity12 = this$015.getActivity();
                    kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                    ((ProInitialAssessmentActivity) activity12).v0(jSONObject5);
                    return;
                }
                return;
            case 15:
                ho.p this$016 = (ho.p) obj3;
                int i25 = ho.p.f18036y;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                if (this$016.f18039w) {
                    LinearLayout linearLayout2 = (LinearLayout) this$016._$_findCachedViewById(R.id.proactiveOptionsLL);
                    if (linearLayout2 != null) {
                        view3 = linearLayout2.getChildAt(((LinearLayout) this$016._$_findCachedViewById(R.id.proactiveOptionsLL)).getChildCount() - 1);
                    } else {
                        view3 = null;
                    }
                    if (view3 != null && (robertoEditText2 = (RobertoEditText) view3.findViewById(R.id.optionEditText)) != null) {
                        editable3 = robertoEditText2.getText();
                    }
                    this$016.f18038v = gv.r.i1(String.valueOf(editable3)).toString();
                }
                if (!gv.n.B0(this$016.f18038v)) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("question", this$016.getString(R.string.paProactiveQues));
                    jSONObject6.put("type", "singleselect");
                    jSONObject6.put("options", new JSONArray(new String[]{this$016.f18038v}));
                    androidx.fragment.app.p activity13 = this$016.getActivity();
                    kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                    ((ProInitialAssessmentActivity) activity13).v0(jSONObject6);
                    return;
                }
                return;
            case 16:
                ho.s this$017 = (ho.s) obj3;
                int i26 = ho.s.f18048y;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                boolean z14 = this$017.f18051w;
                ArrayList<String> arrayList4 = this$017.f18050v;
                if (z14) {
                    LinearLayout linearLayout3 = (LinearLayout) this$017._$_findCachedViewById(R.id.supportKindOptionsLL);
                    if (linearLayout3 != null) {
                        view4 = linearLayout3.getChildAt(((LinearLayout) this$017._$_findCachedViewById(R.id.supportKindOptionsLL)).getChildCount() - 1);
                    } else {
                        view4 = null;
                    }
                    if (view4 != null && (robertoEditText3 = (RobertoEditText) view4.findViewById(R.id.optionEditText)) != null) {
                        editable2 = robertoEditText3.getText();
                    }
                    arrayList4.add(gv.r.i1(String.valueOf(editable2)).toString());
                }
                if (!arrayList4.isEmpty()) {
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("question", this$017.getString(R.string.paSupportKindQues));
                    jSONObject7.put("type", "multiselect");
                    jSONObject7.put("options", new JSONArray((Collection) arrayList4));
                    androidx.fragment.app.p activity14 = this$017.getActivity();
                    kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                    ((ProInitialAssessmentActivity) activity14).v0(jSONObject7);
                    return;
                }
                return;
            case 17:
                ho.v this$018 = (ho.v) obj3;
                int i27 = ho.v.f18061x;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                ProTakeAssessmentActivity proTakeAssessmentActivity = this$018.f18063v;
                if (proTakeAssessmentActivity != null) {
                    proTakeAssessmentActivity.finish();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 18:
                ho.d0 this$019 = (ho.d0) obj3;
                int i28 = ho.d0.f17990w;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                gk.a.b(null, "pro_assessment_coach_match_cta");
                androidx.fragment.app.p requireActivity4 = this$019.requireActivity();
                kotlin.jvm.internal.i.e(requireActivity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) requireActivity4).t0();
                return;
            case 19:
                po.a this$020 = (po.a) obj3;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                this$020.f28726z.U();
                return;
            case 20:
                RecommendedActivitiesExperimentActivity this$021 = (RecommendedActivitiesExperimentActivity) obj3;
                int i29 = RecommendedActivitiesExperimentActivity.f11603z;
                kotlin.jvm.internal.i.g(this$021, "this$0");
                this$021.onBackPressed();
                return;
            case 21:
                zo.n this$022 = (zo.n) obj3;
                int i30 = zo.n.f39751w;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                Dialog dialog = this$022.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 22:
                ep.b this$023 = (ep.b) obj3;
                int i31 = ep.b.f14447z;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                androidx.fragment.app.p requireActivity5 = this$023.requireActivity();
                kotlin.jvm.internal.i.e(requireActivity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity");
                CustomDashboardActivity customDashboardActivity = (CustomDashboardActivity) requireActivity5;
                Bundle a10 = r1.b0.a("source", Constants.SCREEN_DASHBOARD);
                hs.k kVar2 = hs.k.f19476a;
                if (kotlin.jvm.internal.i.b("resources", "resources")) {
                    dVar = new ep.d();
                } else {
                    dVar = new ep.d();
                }
                if (Utils.INSTANCE.checkConnectivity(customDashboardActivity)) {
                    androidx.fragment.app.y supportFragmentManager2 = customDashboardActivity.getSupportFragmentManager();
                    androidx.fragment.app.a l2 = defpackage.e.l(supportFragmentManager2, supportFragmentManager2);
                    l2.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
                    dVar.setArguments(a10);
                    l2.e(R.id.flCustomDashboardMain, dVar, null, 1);
                    l2.d("resources");
                    l2.j();
                    return;
                }
                return;
            case 23:
                ep.d this$024 = (ep.d) obj3;
                int i32 = ep.d.f14454z;
                kotlin.jvm.internal.i.g(this$024, "this$0");
                il.b bVar = this$024.f14457w;
                if (bVar != null) {
                    bVar.O();
                    return;
                }
                return;
            case 24:
                op.a this$025 = (op.a) obj3;
                int i33 = op.a.D;
                kotlin.jvm.internal.i.g(this$025, "this$0");
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str2 = user2.getCurrentCourseName();
                } else {
                    str2 = null;
                }
                boolean b10 = kotlin.jvm.internal.i.b(str2, Constants.COURSE_GENERIC);
                pp.c cVar2 = pp.c.DB_FILTER_APPLIED;
                if (b10) {
                    if (this$025.f27697x) {
                        cVar = pp.c.THERAPIST_LISTING;
                    } else {
                        cVar = pp.c.PSYCHIATRIST_LISTING;
                    }
                } else {
                    cVar = cVar2;
                }
                Intent putExtra = new Intent(this$025.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar);
                kotlin.jvm.internal.i.f(putExtra, "Intent(requireActivity()…ectionValue\n            )");
                if (cVar == cVar2) {
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null) {
                        str4 = user3.getCurrentCourseName();
                    } else {
                        str4 = null;
                    }
                    putExtra.putExtra("db_filter", Constants.getDbEntryPointDomainAreaForCourse(str4));
                }
                this$025.B.a(putExtra);
                String str8 = gk.a.f16573a;
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                User user4 = FirebasePersistence.getInstance().getUser();
                if (user4 != null) {
                    str3 = user4.getCurrentCourseName();
                } else {
                    str3 = null;
                }
                User f = defpackage.b.f(analyticsBundle, "course", str3);
                if (f != null && (appConfig2 = f.getAppConfig()) != null) {
                    obj2 = appConfig2.get(Constants.TELE_ENTRY_POINT_EXPERIMENT);
                }
                analyticsBundle.putString("variant", String.valueOf(obj2));
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(analyticsBundle, "therapy_psychiatry_db_card_click");
                return;
            case 25:
                TelecommunicationsPWAActivity this$026 = (TelecommunicationsPWAActivity) obj3;
                int i34 = TelecommunicationsPWAActivity.L;
                kotlin.jvm.internal.i.g(this$026, "this$0");
                try {
                    if (Utils.INSTANCE.checkConnectivity(this$026)) {
                        yp.a aVar = this$026.f11649w;
                        if (aVar != null && (progressBar = aVar.f38708e) != null) {
                            Extensions.INSTANCE.visible(progressBar);
                        }
                        yp.a aVar2 = this$026.f11649w;
                        if (aVar2 != null && (robertoTextView = aVar2.f) != null) {
                            Extensions.INSTANCE.gone(robertoTextView);
                        }
                        yp.a aVar3 = this$026.f11649w;
                        if (aVar3 != null && (robertoButton = aVar3.f38706c) != null) {
                            Extensions.INSTANCE.gone(robertoButton);
                        }
                        yp.a aVar4 = this$026.f11649w;
                        if (aVar4 != null && (view5 = aVar4.f38705b) != null) {
                            Extensions.INSTANCE.gone(view5);
                        }
                        yp.a aVar5 = this$026.f11649w;
                        if (aVar5 != null && (appCompatImageView = aVar5.f38707d) != null) {
                            Extensions.INSTANCE.gone(appCompatImageView);
                        }
                        rp.t tVar = this$026.f11652z;
                        if (tVar != null && (wVar = tVar.A) != null) {
                            str5 = wVar.d();
                        } else {
                            str5 = null;
                        }
                        this$026.q0(str5, null);
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$026.f11648v, e13);
                    return;
                }
            case 26:
                wp.b this$027 = (wp.b) obj3;
                int i35 = wp.b.f37025z;
                kotlin.jvm.internal.i.g(this$027, "this$0");
                androidx.fragment.app.p activity15 = this$027.getActivity();
                kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity15).onBackPressed();
                return;
            case 27:
                int i36 = cq.b.f11891x;
                ((cq.b) obj3).requireActivity().finish();
                return;
            case 28:
                fq.u this$028 = (fq.u) obj3;
                int i37 = fq.u.f15804v;
                kotlin.jvm.internal.i.g(this$028, "this$0");
                androidx.fragment.app.p activity16 = this$028.getActivity();
                kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity16).t0();
                return;
            default:
                fq.v this$029 = (fq.v) obj3;
                int i38 = fq.v.f15807w;
                kotlin.jvm.internal.i.g(this$029, "this$0");
                androidx.fragment.app.p activity17 = this$029.getActivity();
                if (activity17 != null) {
                    activity17.finish();
                    return;
                }
                return;
        }
    }
}
