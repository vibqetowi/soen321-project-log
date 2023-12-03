package w5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AllMiniCoursesActivity;
import com.theinnerhour.b2b.activity.BotPwaActivity;
import com.theinnerhour.b2b.activity.DeepLinkActivationActivity;
import com.theinnerhour.b2b.activity.DeeplinkCodeActivationActivity;
import com.theinnerhour.b2b.activity.DynamicCardsNotificationActivity;
import com.theinnerhour.b2b.activity.FAQActivity;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.components.conditionSelection.activity.ConditionSelectionA3Activity;
import com.theinnerhour.b2b.components.dashboard.activity.SneakPeekForPlanActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4RecentActivity;
import com.theinnerhour.b2b.model.AssessmentResponseAll;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.g1;
import ek.h1;
import ek.l;
import ik.e1;
import ik.n1;
import ik.q1;
import java.io.Serializable;
import java.util.HashMap;
import ol.h;
import ol.i;
import ol.j;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f36474u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f36475v;

    public /* synthetic */ i0(int i6, Object obj) {
        this.f36474u = i6;
        this.f36475v = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        AppCompatImageView appCompatImageView;
        View view2;
        RobertoButton robertoButton;
        RobertoTextView robertoTextView;
        ProgressBar progressBar;
        String str;
        androidx.lifecycle.w<String> wVar;
        l.a aVar;
        Serializable serializable;
        Integer num;
        int i6;
        Object obj;
        HashMap<String, Object> appConfig;
        int i10;
        Object obj2;
        Object obj3;
        Object obj4;
        ConditionSelectionA3Activity conditionSelectionA3Activity;
        Bundle bundle;
        Intent intent;
        Intent intent2;
        boolean z11;
        boolean z12;
        int i11 = this.f36474u;
        String str2 = null;
        r11 = null;
        Bundle bundle2 = null;
        String str3 = null;
        String str4 = null;
        str2 = null;
        Object obj5 = this.f36475v;
        switch (i11) {
            case 0:
                j0 this$0 = (j0) obj5;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.cancel();
                return;
            case 1:
                g6.h this$02 = (g6.h) obj5;
                int i12 = g6.h.F;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                this$02.K();
                return;
            case 2:
            default:
                j.a this_apply = (j.a) obj5;
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                MotionLayout motionLayout = this_apply.f27649u;
                if (motionLayout.getProgress() == 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    motionLayout.m(0.0f);
                    return;
                } else {
                    motionLayout.A();
                    return;
                }
            case 3:
                dc.e eVar = (dc.e) obj5;
                EditText editText = eVar.f12743i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.q();
                    return;
                }
                return;
            case 4:
                ((dc.k) obj5).u();
                return;
            case 5:
                boolean z13 = true;
                dc.s sVar = (dc.s) obj5;
                EditText editText2 = sVar.f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = sVar.f;
                    if ((editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) ? false : false) {
                        sVar.f.setTransformationMethod(null);
                    } else {
                        sVar.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        sVar.f.setSelection(selectionEnd);
                    }
                    sVar.q();
                    return;
                }
                return;
            case 6:
                BotPwaActivity this$03 = (BotPwaActivity) obj5;
                int i13 = BotPwaActivity.f10324y;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$03)) {
                    yp.a aVar2 = this$03.f10326w;
                    if (aVar2 != null && (progressBar = aVar2.f38708e) != null) {
                        Extensions.INSTANCE.visible(progressBar);
                    }
                    yp.a aVar3 = this$03.f10326w;
                    if (aVar3 != null && (robertoTextView = aVar3.f) != null) {
                        Extensions.INSTANCE.gone(robertoTextView);
                    }
                    yp.a aVar4 = this$03.f10326w;
                    if (aVar4 != null && (robertoButton = aVar4.f38706c) != null) {
                        Extensions.INSTANCE.gone(robertoButton);
                    }
                    yp.a aVar5 = this$03.f10326w;
                    if (aVar5 != null && (view2 = aVar5.f38705b) != null) {
                        Extensions.INSTANCE.gone(view2);
                    }
                    yp.a aVar6 = this$03.f10326w;
                    if (aVar6 != null && (appCompatImageView = aVar6.f38707d) != null) {
                        Extensions.INSTANCE.gone(appCompatImageView);
                    }
                    this$03.o0();
                    return;
                }
                return;
            case 7:
                DeepLinkActivationActivity this$04 = (DeepLinkActivationActivity) obj5;
                int i14 = DeepLinkActivationActivity.f10350z;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                this$04.finish();
                return;
            case 8:
                DeeplinkCodeActivationActivity this$05 = (DeeplinkCodeActivationActivity) obj5;
                int i15 = DeeplinkCodeActivationActivity.f10355z;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                this$05.finish();
                return;
            case 9:
                DynamicCardsNotificationActivity this$06 = (DynamicCardsNotificationActivity) obj5;
                int i16 = DynamicCardsNotificationActivity.f10396w;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                this$06.finish();
                return;
            case 10:
                FAQActivity this$07 = (FAQActivity) obj5;
                int i17 = FAQActivity.f10402x;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                this$07.finish();
                return;
            case 11:
                WebviewActivity this$08 = (WebviewActivity) obj5;
                int i18 = WebviewActivity.F;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$08)) {
                    ((ProgressBar) this$08.n0(R.id.pbCommunitiesPwa)).setVisibility(0);
                    ((RobertoTextView) this$08.n0(R.id.tvCommunitiesPwaError)).setVisibility(8);
                    ((RobertoButton) this$08.n0(R.id.btnCommunitiesPwaError)).setVisibility(8);
                    this$08.n0(R.id.bgCommunitiesPwa).setVisibility(8);
                    ((AppCompatImageView) this$08.n0(R.id.ivCommunitiesPwaError)).setVisibility(8);
                    Intent intent3 = this$08.getIntent();
                    if (intent3 != null) {
                        str = intent3.getStringExtra(Constants.NOTIFICATION_URL);
                    } else {
                        str = null;
                    }
                    rp.t tVar = this$08.D;
                    if (tVar != null && (wVar = tVar.A) != null) {
                        str2 = wVar.d();
                    }
                    this$08.r0(str, str2);
                    return;
                }
                return;
            case 12:
                ek.l this$09 = (ek.l) obj5;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                if (view != null && (aVar = this$09.f14198y) != null) {
                    aVar.a(view);
                    return;
                }
                return;
            case 13:
                g1 this$010 = (g1) obj5;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                Activity activity = this$010.f14145x;
                Toast.makeText(activity, activity.getString(R.string.mc_locked_toast_unmonetized), 0).show();
                return;
            case 14:
                h1 this$011 = (h1) obj5;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                Activity activity2 = this$011.f14157x;
                activity2.startActivity(new Intent(activity2, AllMiniCoursesActivity.class));
                Bundle bundle3 = new Bundle();
                bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                gk.a.b(bundle3, "dashboard_view_all_click");
                return;
            case 15:
                ik.m this$012 = (ik.m) obj5;
                int i19 = ik.m.f20237w;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                Bundle arguments = this$012.getArguments();
                if (arguments != null) {
                    serializable = arguments.getSerializable("responseData");
                } else {
                    serializable = null;
                }
                AssessmentResponseAll assessmentResponseAll = (AssessmentResponseAll) serializable;
                if (assessmentResponseAll != null) {
                    Integer score = assessmentResponseAll.getScore();
                    if (score != null) {
                        i10 = score.intValue();
                    } else {
                        i10 = -1;
                    }
                    analyticsBundle.putInt("score", i10);
                    analyticsBundle.putInt("health_score", assessmentResponseAll.getHealth().getScore());
                    analyticsBundle.putInt("symptom_score", assessmentResponseAll.getSymptom().getScore());
                    analyticsBundle.putInt("global_score", assessmentResponseAll.getGlobal().getScore());
                }
                Bundle arguments2 = this$012.getArguments();
                if (arguments2 != null) {
                    num = Integer.valueOf(arguments2.getInt("dayPlanPosition"));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 0) {
                    i6 = 0;
                } else if (num != null && num.intValue() == 15) {
                    i6 = 15;
                } else {
                    i6 = 28;
                }
                analyticsBundle.putInt("day", i6);
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (appConfig = user.getAppConfig()) != null) {
                    obj = appConfig.get(Constants.ONBOARDING_EXPERIMENT);
                } else {
                    obj = null;
                }
                analyticsBundle.putString("variant", (String) obj);
                UtilsKt.fireAnalytics("progragmme_assessment_result", analyticsBundle);
                AssessmentListener assessmentListener = this$012.f20238u;
                if (assessmentListener != null) {
                    AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener, null, 1, null);
                    return;
                }
                return;
            case 16:
                ik.t this$013 = (ik.t) obj5;
                int i20 = ik.t.f20303w;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                ik.o oVar = new ik.o();
                oVar.setArguments(this$013.getArguments());
                AssessmentListener assessmentListener2 = this$013.f20304u;
                if (assessmentListener2 != null) {
                    assessmentListener2.goToNextScreen(oVar);
                }
                FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(50, Constants.GAMIFICATION_COURSE_COMPLETITION_TASK, defpackage.b.g(), defpackage.b.g()));
                return;
            case 17:
                e1 this$014 = (e1) obj5;
                int i21 = e1.f20168v;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                androidx.fragment.app.p activity3 = this$014.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                ((InitialAssessmentActivity) activity3).t0();
                FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(50, Constants.GAMIFICATION_COURSE_COMPLETITION_TASK, defpackage.b.g(), defpackage.b.g()));
                return;
            case 18:
                n1 this$015 = (n1) obj5;
                int i22 = n1.f20255w;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                androidx.fragment.app.p activity4 = this$015.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                ((InitialAssessmentActivity) activity4).x0();
                androidx.fragment.app.p activity5 = this$015.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                ((InitialAssessmentActivity) activity5).t0();
                return;
            case 19:
                q1 this$016 = (q1) obj5;
                int i23 = q1.f20277x;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                this$016.J().t0();
                return;
            case 20:
                zk.g this$017 = (zk.g) obj5;
                int i24 = zk.g.f39434z;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                if (this$017.f39437w) {
                    if (Utils.INSTANCE.checkConnectivity(this$017.requireActivity())) {
                        ProgressBar progressBar2 = (ProgressBar) this$017._$_findCachedViewById(R.id.csaFinishPromptPrimaryCtaProgress);
                        if (progressBar2 != null) {
                            progressBar2.setVisibility(0);
                        }
                        RobertoButton robertoButton2 = (RobertoButton) this$017._$_findCachedViewById(R.id.csaFinishPromptPrimaryCta);
                        if (robertoButton2 != null) {
                            robertoButton2.setText("");
                        }
                        androidx.fragment.app.p requireActivity = this$017.requireActivity();
                        if (requireActivity instanceof ConditionSelectionA3Activity) {
                            conditionSelectionA3Activity = (ConditionSelectionA3Activity) requireActivity;
                        } else {
                            conditionSelectionA3Activity = null;
                        }
                        if (conditionSelectionA3Activity != null) {
                            conditionSelectionA3Activity.w0(this$017.f39435u);
                        }
                    }
                    HashMap<String, Object> appConfig2 = FirebasePersistence.getInstance().getUser().getAppConfig();
                    if (appConfig2 != null) {
                        obj2 = appConfig2.get(Constants.NEW_COURSES_EXPERIMENT);
                    } else {
                        obj2 = null;
                    }
                    if (kotlin.jvm.internal.i.b(obj2, "variant_a")) {
                        if (is.k.Q1(this$017.f39435u, new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                            String str5 = gk.a.f16573a;
                            Bundle bundle4 = new Bundle();
                            bundle4.putString("course", this$017.f39435u);
                            HashMap<String, Object> appConfig3 = FirebasePersistence.getInstance().getUser().getAppConfig();
                            if (appConfig3 != null) {
                                obj4 = appConfig3.get(Constants.NEW_COURSES_EXPERIMENT);
                            } else {
                                obj4 = null;
                            }
                            if (obj4 instanceof String) {
                                str3 = obj4;
                            }
                            bundle4.putString(Constants.NEW_COURSES_EXPERIMENT, str3);
                            bundle4.putString("source", "onboarding");
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(bundle4, "go_to_dashboard");
                            return;
                        }
                    }
                    String str6 = gk.a.f16573a;
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                    bundle5.putString("course", this$017.f39435u);
                    bundle5.putBoolean("reset_flow", false);
                    HashMap<String, Object> appConfig4 = FirebasePersistence.getInstance().getUser().getAppConfig();
                    if (appConfig4 != null) {
                        obj3 = appConfig4.get(Constants.NEW_COURSES_EXPERIMENT);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 instanceof String) {
                        str4 = obj3;
                    }
                    bundle5.putString(Constants.NEW_COURSES_EXPERIMENT, str4);
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle5, "onboarding_selection_assessment");
                    return;
                }
                return;
            case 21:
                zk.h this$018 = (zk.h) obj5;
                int i25 = zk.h.f39441w;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                androidx.fragment.app.p requireActivity2 = this$018.requireActivity();
                kotlin.jvm.internal.i.e(requireActivity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) requireActivity2).t0();
                gk.a.b(null, "onboarding_welcome_click");
                return;
            case 22:
                zk.j this$019 = (zk.j) obj5;
                int i26 = zk.j.D;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                if (this$019.A) {
                    String str7 = gk.a.f16573a;
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                    bundle6.putString("course", this$019.f39450x);
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle6, "onboarding_selection_explore");
                    if (Utils.INSTANCE.checkConnectivity(this$019.requireActivity())) {
                        this$019.J(2, this$019.f39450x);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                zk.l this$020 = (zk.l) obj5;
                int i27 = zk.l.A;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                ll.b bVar = new ll.b();
                androidx.fragment.app.p requireActivity3 = this$020.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity3, "requireActivity()");
                Intent a10 = bVar.a(requireActivity3, false);
                androidx.fragment.app.p activity6 = this$020.getActivity();
                if (activity6 != null && (intent2 = activity6.getIntent()) != null) {
                    bundle = intent2.getExtras();
                } else {
                    bundle = null;
                }
                if (bundle != null) {
                    androidx.fragment.app.p activity7 = this$020.getActivity();
                    if (activity7 != null && (intent = activity7.getIntent()) != null) {
                        bundle2 = intent.getExtras();
                    }
                    kotlin.jvm.internal.i.d(bundle2);
                    a10.putExtras(bundle2);
                }
                this$020.startActivity(a10);
                androidx.fragment.app.p activity8 = this$020.getActivity();
                if (activity8 != null) {
                    activity8.finish();
                    return;
                }
                return;
            case 24:
                bl.q this$021 = (bl.q) obj5;
                int i28 = bl.q.f4402v;
                kotlin.jvm.internal.i.g(this$021, "this$0");
                ApplicationPersistence.getInstance().setBooleanValue(Constants.getKeyForFirstDay(FirebasePersistence.getInstance().getUser().getCurrentCourseName()), false);
                androidx.fragment.app.p activity9 = this$021.getActivity();
                kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity9).t0();
                return;
            case 25:
                SneakPeekForPlanActivity this$022 = (SneakPeekForPlanActivity) obj5;
                int i29 = SneakPeekForPlanActivity.A;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                this$022.onBackPressed();
                return;
            case 26:
                NotV4RecentActivity this$023 = (NotV4RecentActivity) obj5;
                int i30 = NotV4RecentActivity.A;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                gk.a.b(null, "lib_recent_inside_back_click");
                this$023.finish();
                return;
            case 27:
                h.a this_apply2 = (h.a) obj5;
                kotlin.jvm.internal.i.g(this_apply2, "$this_apply");
                MotionLayout motionLayout2 = this_apply2.f27631u;
                if (motionLayout2.getProgress() == 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    motionLayout2.m(0.0f);
                    return;
                } else {
                    motionLayout2.A();
                    return;
                }
            case 28:
                i.a this_apply3 = (i.a) obj5;
                kotlin.jvm.internal.i.g(this_apply3, "$this_apply");
                MotionLayout motionLayout3 = this_apply3.f27640u;
                if (motionLayout3.getProgress() == 1.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    motionLayout3.m(0.0f);
                    return;
                } else {
                    motionLayout3.A();
                    return;
                }
        }
    }
}
