package kq;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import com.google.android.exoplayer2.a0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ActivitiesInfoActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.fragment.coping.a;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.GoalNotificationContent;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.AudioHelper;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import kotlin.jvm.internal.x;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23794u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ com.theinnerhour.b2b.fragment.coping.a f23795v;

    public /* synthetic */ d(com.theinnerhour.b2b.fragment.coping.a aVar, int i6) {
        this.f23794u = i6;
        this.f23795v = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        String string;
        Intent intent;
        Intent intent2;
        String text1;
        a0 a0Var;
        boolean z11;
        int i6 = this.f23794u;
        boolean z12 = true;
        com.theinnerhour.b2b.fragment.coping.a this$0 = this.f23795v;
        switch (i6) {
            case 0:
                int i10 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                p activity = this$0.getActivity();
                if (((activity == null || (intent2 = activity.getIntent()) == null || !intent2.hasExtra("source")) ? false : false) && (this$0.getActivity() instanceof ActivitiesInfoActivity)) {
                    p activity2 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.ActivitiesInfoActivity");
                    ((ActivitiesInfoActivity) activity2).o0();
                    return;
                }
                p activity3 = this$0.getActivity();
                if (activity3 != null) {
                    activity3.onBackPressed();
                    return;
                }
                return;
            case 1:
                int i11 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (this$0.isAdded()) {
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.activity_dialog, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                        Window window = styledDialog.getWindow();
                        kotlin.jvm.internal.i.d(window);
                        window.setLayout(-1, -1);
                        Window window2 = styledDialog.getWindow();
                        kotlin.jvm.internal.i.d(window2);
                        window2.getAttributes().windowAnimations = R.style.DialogSlideInAndSlideBackOut;
                        GoalType goalType = this$0.f11699z;
                        kotlin.jvm.internal.i.d(goalType);
                        ((RobertoTextView) styledDialog.findViewById(R.id.txt_title)).setText(goalType.getGoalName());
                        RobertoTextView robertoTextView = (RobertoTextView) styledDialog.findViewById(R.id.txt_desc);
                        GoalType goalType2 = this$0.f11699z;
                        kotlin.jvm.internal.i.d(goalType2);
                        if (goalType2.getText3() != null) {
                            GoalType goalType3 = this$0.f11699z;
                            kotlin.jvm.internal.i.d(goalType3);
                            text1 = goalType3.getText3();
                        } else {
                            GoalType goalType4 = this$0.f11699z;
                            kotlin.jvm.internal.i.d(goalType4);
                            text1 = goalType4.getText1();
                        }
                        robertoTextView.setText(text1);
                        GoalType goalType5 = this$0.f11699z;
                        kotlin.jvm.internal.i.d(goalType5);
                        if (kotlin.jvm.internal.i.b(goalType5.getType(), "physical_activity")) {
                            Utils utils = Utils.INSTANCE;
                            Context requireContext = this$0.requireContext();
                            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                            ((RelativeLayout) styledDialog.findViewById(R.id.rl_main)).setBackgroundColor(utils.checkBuildBeforesetColor(R.color.white, requireContext));
                        }
                        ((ImageView) styledDialog.findViewById(R.id.cancel)).setOnClickListener(new lm.f(styledDialog, 27));
                        styledDialog.show();
                        Bundle bundle = new Bundle();
                        if (FirebasePersistence.getInstance().getUser() != null && FirebasePersistence.getInstance().getUser().getCurrentCourseName() != null) {
                            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        }
                        GoalType goalType6 = this$0.f11699z;
                        if (goalType6 != null) {
                            bundle.putString(Constants.GOAL_ID, goalType6.getGoalId());
                            bundle.putString(Constants.GOAL_NAME, goalType6.getGoalName());
                            bundle.putString(Constants.GOAL_TYPE, goalType6.getType());
                        }
                        gk.a.b(bundle, "activity_learn_more_click");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e10);
                    return;
                }
            case 2:
                int i12 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.I && (((a0Var = this$0.X) == null || !a0Var.isPlaying()) && (!ConnectionStatusReceiver.isConnected() || this$0.Q))) {
                    if (!ConnectionStatusReceiver.isConnected()) {
                        if (!this$0.J) {
                            this$0.w0(true);
                            return;
                        }
                        return;
                    } else if (ConnectionStatusReceiver.isConnected()) {
                        this$0.w0(false);
                        this$0.a0(false);
                        return;
                    } else {
                        return;
                    }
                }
                this$0.h0(true);
                return;
            case 3:
                int i13 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (ConnectionStatusReceiver.isConnected() && !this$0.R) {
                    ProgressBar progressBar = (ProgressBar) this$0._$_findCachedViewById(R.id.downloadBtnProgress);
                    if (progressBar != null) {
                        progressBar.setProgress(0);
                    }
                    a.i iVar = new a.i();
                    AudioHelper audioHelper = this$0.O;
                    if (audioHelper != null) {
                        String str = this$0.A;
                        kotlin.jvm.internal.i.d(str);
                        audioHelper.downloadAudioFile(str, iVar);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        String str2 = this$0.A;
                        kotlin.jvm.internal.i.d(str2);
                        analyticsBundle.putString(Constants.NOTIFICATION_URL, str2);
                        gk.a.b(analyticsBundle, "activity_audio_download_start");
                        return;
                    }
                    kotlin.jvm.internal.i.q("audioHelper");
                    throw null;
                } else if (!ConnectionStatusReceiver.isConnected()) {
                    Utils utils2 = Utils.INSTANCE;
                    p requireActivity = this$0.requireActivity();
                    String string2 = this$0.getString(R.string.no_internet_msg);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.no_internet_msg)");
                    utils2.showCustomToast(requireActivity, string2);
                    return;
                } else {
                    return;
                }
            case 4:
                int i14 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    UtilsKt.fireAnalytics("ra_play_store_feedback_show", UtilsKt.getAnalyticsBundle());
                    Animation loadAnimation = AnimationUtils.loadAnimation(this$0.requireContext(), R.anim.slide_fade_out_left);
                    loadAnimation.setAnimationListener(new j(this$0, AnimationUtils.loadAnimation(this$0.requireContext(), R.anim.slide_fade_in_right)));
                    ((ConstraintLayout) this$0._$_findCachedViewById(R.id.feedbackQuestionLayout)).startAnimation(loadAnimation);
                    ((RobertoButton) this$0._$_findCachedViewById(R.id.feedbackPlayStoreNoButton)).setOnClickListener(new d(this$0, 6));
                    ((RobertoButton) this$0._$_findCachedViewById(R.id.feedbackPlayStoreYesButton)).setOnClickListener(new d(this$0, 7));
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f11694u, "exception", e11);
                    return;
                }
            case 5:
                int i15 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    UtilsKt.fireAnalytics("ra_negative_feedback_show", UtilsKt.getAnalyticsBundle());
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this$0.requireContext(), R.anim.slide_fade_out_left);
                    loadAnimation2.setAnimationListener(new i(this$0, AnimationUtils.loadAnimation(this$0.requireContext(), R.anim.slide_fade_in_right)));
                    ((ConstraintLayout) this$0._$_findCachedViewById(R.id.feedbackQuestionLayout)).startAnimation(loadAnimation2);
                    ((RobertoTextView) this$0._$_findCachedViewById(R.id.feedbackNegativeSubmit)).setOnClickListener(new d(this$0, 8));
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f11694u, "exception", e12);
                    return;
                }
            case 6:
                int i16 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                UtilsKt.fireAnalytics("ra_play_store_feedback_cancel", UtilsKt.getAnalyticsBundle());
                Utils utils3 = Utils.INSTANCE;
                p requireActivity2 = this$0.requireActivity();
                String string3 = this$0.getString(R.string.recommended_activity_feedback_negative_toast);
                kotlin.jvm.internal.i.f(string3, "getString(R.string.recom…_feedback_negative_toast)");
                utils3.showCustomToast(requireActivity2, string3);
                this$0.requireActivity().finish();
                return;
            case 7:
                int i17 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                    Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.requireActivity().getPackageName()));
                    intent3.addFlags(1208483840);
                    try {
                        this$0.requireActivity().startActivity(intent3);
                        this$0.requireActivity().finish();
                    } catch (Exception e13) {
                        LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e13);
                        p requireActivity3 = this$0.requireActivity();
                        requireActivity3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.requireActivity().getPackageName())));
                        this$0.requireActivity().finish();
                    }
                    UtilsKt.fireAnalytics("ra_play_store_feedback_submit", UtilsKt.getAnalyticsBundle());
                    return;
                } catch (Exception e14) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in creating intent for play store rating", e14);
                    return;
                }
            case 8:
                int i18 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Editable text = ((RobertoEditText) this$0._$_findCachedViewById(R.id.feedbackNegativeEditText)).getText();
                kotlin.jvm.internal.i.d(text);
                String obj = text.toString();
                if (n.F0(obj, " ", "").length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    try {
                        ProgressDialog progressDialog = new ProgressDialog(this$0.getActivity());
                        progressDialog.setMessage("Loading...");
                        progressDialog.setCancelable(false);
                        PackageInfo packageInfo = this$0.requireActivity().getPackageManager().getPackageInfo(this$0.requireActivity().getPackageName(), 0);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("feedbackDetails", "feedback: " + obj + " \n rating: " + FirebasePersistence.getInstance().getUser().getAppFeedback().getTopMenuFeedback());
                        jSONObject.put("userName", SessionManager.getInstance().getStringValue(SessionManager.KEY_UID));
                        jSONObject.put("versionName", packageInfo.versionName);
                        jSONObject.put("versionCode", String.valueOf(h0.a.a(packageInfo)));
                        jSONObject.put("device", Build.DEVICE);
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("product", Build.PRODUCT);
                        progressDialog.show();
                        h hVar = new h(jSONObject, new qk.a(this$0, 4, progressDialog), new dd.a(this$0, 3, progressDialog));
                        hVar.setRetryPolicy(new e4.d(0, 1));
                        VolleySingleton.getInstance().add(hVar);
                    } catch (Exception e15) {
                        LogHelper.INSTANCE.e("dashboardactivity", "error in send", e15);
                    }
                    UtilsKt.fireAnalytics("ra_negative_feedback_submit", UtilsKt.getAnalyticsBundle());
                    return;
                }
                Utils utils4 = Utils.INSTANCE;
                Context requireContext2 = this$0.requireContext();
                String string4 = this$0.getString(R.string.feedback_input_error);
                kotlin.jvm.internal.i.f(string4, "getString(R.string.feedback_input_error)");
                utils4.showCustomToast(requireContext2, string4);
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.C) {
                    p activity4 = this$0.getActivity();
                    if (activity4 != null && (intent = activity4.getIntent()) != null && intent.hasExtra("source")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        p activity5 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity5).n0();
                        return;
                    } else if (!this$0.e0) {
                        String X = this$0.X();
                        String str3 = this$0.f11695v;
                        String courseName = Constants.getCourseName(this$0.X());
                        String goalName = Constants.getGoalName(this$0.f11695v);
                        CustomDate customDate = new CustomDate();
                        Utils utils5 = Utils.INSTANCE;
                        utils5.getTodayTimeInSeconds();
                        hs.k kVar = hs.k.f19476a;
                        CustomDate customDate2 = new CustomDate();
                        utils5.getTodayTimeInSeconds();
                        FirestoreGoal firestoreGoal = new FirestoreGoal(X, str3, courseName, goalName, null, customDate, null, customDate2, null, false, null, Constants.getGoalType(this$0.f11695v).getType(), true, null, 1344, null);
                        yn.a aVar = this$0.f11688d0;
                        aVar.getClass();
                        if (yn.a.b()) {
                            this$0.r0(firestoreGoal, null);
                        } else {
                            x xVar = new x();
                            ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("ra_audio", aVar.a(true), "goals", this$0.f11688d0, new com.theinnerhour.b2b.fragment.coping.b(this$0, firestoreGoal, xVar));
                            xVar.f23469u = notificationPermissionBottomSheet;
                            notificationPermissionBottomSheet.show(this$0.requireActivity().getSupportFragmentManager(), "permission");
                        }
                        Bundle bundle2 = new Bundle();
                        defpackage.d.m(bundle2, "course");
                        bundle2.putString(Constants.GOAL_ID, this$0.f11695v);
                        GoalType goalType7 = this$0.f11699z;
                        if (goalType7 != null) {
                            bundle2.putString(Constants.GOAL_NAME, goalType7.getGoalName());
                            bundle2.putString(Constants.GOAL_TYPE, goalType7.getType());
                        }
                        GoalNotificationContent goalNotificationContent = this$0.K;
                        if (goalNotificationContent != null) {
                            bundle2.putString("experiment_type", Constants.SCREEN_ACTIVITY);
                            bundle2.putString("experiment", goalNotificationContent.getExperiment());
                            bundle2.putString("experiment_key", goalNotificationContent.getKey());
                        }
                        bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                        Bundle arguments = this$0.getArguments();
                        if (arguments != null && (string = arguments.getString("exp_source")) != null) {
                            bundle2.putString("source", string);
                        }
                        gk.a.b(bundle2, "activity_remind_click");
                        return;
                    } else if (this$0.T && this$0.U) {
                        a0 a0Var2 = this$0.X;
                        if (a0Var2 != null && a0Var2.isPlaying()) {
                            a0 a0Var3 = this$0.X;
                            if (a0Var3 != null) {
                                a0Var3.z(false);
                                this$0.g0(true);
                                this$0.u0(false);
                            } else {
                                kotlin.jvm.internal.i.q("simpleExoplayer");
                                throw null;
                            }
                        }
                        this$0.q0();
                        return;
                    } else {
                        p activity6 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity6).t0();
                        return;
                    }
                }
                return;
        }
    }
}
