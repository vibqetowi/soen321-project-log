package dl;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.lock.activity.LockScreenOptionsActivity;
import com.theinnerhour.b2b.model.CustomCoachMark;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class w0 extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends String>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13121u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13121u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends String> singleUseEvent) {
        String contentIfNotHandled;
        boolean z10;
        SingleUseEvent<? extends String> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            int hashCode = contentIfNotHandled.hashCode();
            final V3DashboardActivity v3DashboardActivity = this.f13121u;
            switch (hashCode) {
                case -2017583384:
                    if (contentIfNotHandled.equals("b2b_verification")) {
                        int i6 = V3DashboardActivity.f10714r1;
                        v3DashboardActivity.getClass();
                        ApplicationPersistence.getInstance().setLongValue(Constants.VERIFY_EMAIL_POPUP_TIME, Utils.INSTANCE.getTodayTimeInSeconds());
                        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_verify_b2b_email, v3DashboardActivity, R.style.Theme_Dialog);
                        Window window = styledDialog.getWindow();
                        kotlin.jvm.internal.i.d(window);
                        window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        Window window2 = styledDialog.getWindow();
                        if (window2 != null) {
                            window2.setLayout(-1, -2);
                        }
                        ((RobertoButton) styledDialog.findViewById(R.id.ctaVerifyEmailYes)).setOnClickListener(new k0(styledDialog, v3DashboardActivity, 0));
                        ((RobertoTextView) styledDialog.findViewById(R.id.ctaVerifyEmailNo)).setOnClickListener(new dk.n(styledDialog, 11));
                        styledDialog.setCancelable(false);
                        if (!v3DashboardActivity.isFinishing()) {
                            styledDialog.show();
                            gk.a.b(null, "b2b_resend_verification_pop_up_show");
                            break;
                        }
                    }
                    break;
                case -1950174326:
                    if (contentIfNotHandled.equals("feedback_card")) {
                        int i10 = V3DashboardActivity.f10714r1;
                        v3DashboardActivity.getClass();
                        ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                        v3DashboardActivity.H.setupDashboardFeedback();
                        NpsPersistence.INSTANCE.updateNpsSlot(true);
                        break;
                    }
                    break;
                case -1072796013:
                    if (contentIfNotHandled.equals("badge_earned")) {
                        int i11 = V3DashboardActivity.f10714r1;
                        v3DashboardActivity.getClass();
                        new Handler(Looper.getMainLooper()).postDelayed(new v(v3DashboardActivity, 8), 500L);
                        break;
                    }
                    break;
                case -313440398:
                    if (contentIfNotHandled.equals("feedback_popup")) {
                        Dialog showFeedbackPopup = v3DashboardActivity.H.showFeedbackPopup(Constants.FEEDBACK_TOP_MENU);
                        if (showFeedbackPopup != null) {
                            showFeedbackPopup.show();
                        }
                        ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_APP_FEEDBACK_POPUP, false);
                        ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DATE, Utils.INSTANCE.getTodayCalendar().getTimeInMillis());
                        ApplicationPersistence.getInstance().setBooleanValue("app_feedback_day_three", false);
                        NpsPersistence.INSTANCE.updateNpsSlot(true);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("trigger", ApplicationPersistence.getInstance().getStringValue(Constants.APP_FEEDBACK_TRIGGER));
                        gk.a.b(analyticsBundle, "show_app_feedback");
                        break;
                    }
                    break;
                case 109297:
                    if (contentIfNotHandled.equals("nps")) {
                        int i12 = V3DashboardActivity.f10714r1;
                        ConstraintLayout constraintLayout = (ConstraintLayout) v3DashboardActivity.n0(R.id.clNPSBottomSheet);
                        if (constraintLayout != null) {
                            constraintLayout.setOnTouchListener(new w5.h0(4));
                        }
                        RobertoEditText robertoEditText = (RobertoEditText) v3DashboardActivity.n0(R.id.etNPSBottomSheetFeedback);
                        if (robertoEditText != null) {
                            robertoEditText.setOnEditorActionListener(new w(0, v3DashboardActivity));
                        }
                        View n02 = v3DashboardActivity.n0(R.id.viewDashboardBlanketForeground);
                        if (n02 != null) {
                            n02.setVisibility(0);
                        }
                        BottomSheetBehavior.from((ConstraintLayout) v3DashboardActivity.n0(R.id.clNPSBottomSheet)).addBottomSheetCallback(new g2(v3DashboardActivity));
                        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                        vVar.f23467u = -1;
                        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) v3DashboardActivity.n0(R.id.sbNPSSelector);
                        if (appCompatSeekBar != null) {
                            appCompatSeekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(v3DashboardActivity, R.color.transparent)));
                        }
                        AppCompatImageView appCompatImageView = (AppCompatImageView) v3DashboardActivity.n0(R.id.ivNPSRatingImage);
                        if (appCompatImageView != null) {
                            appCompatImageView.setImageTintList(ColorStateList.valueOf(g0.a.b(v3DashboardActivity, R.color.login_grey_background)));
                        }
                        AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) v3DashboardActivity.n0(R.id.sbNPSSelector);
                        if (appCompatSeekBar2 != null) {
                            appCompatSeekBar2.setOnSeekBarChangeListener(new h2(v3DashboardActivity, vVar));
                        }
                        Animation loadAnimation = AnimationUtils.loadAnimation(v3DashboardActivity, R.anim.slide_fade_out_left);
                        loadAnimation.setAnimationListener(new i2(v3DashboardActivity, vVar));
                        RobertoButton robertoButton = (RobertoButton) v3DashboardActivity.n0(R.id.rbNPSSubmit1);
                        if (robertoButton != null) {
                            robertoButton.setOnClickListener(new dk.t(10, vVar, v3DashboardActivity, loadAnimation));
                        }
                        View n03 = v3DashboardActivity.n0(R.id.viewDashboardBlanketForeground);
                        if (n03 != null) {
                            n03.setVisibility(0);
                        }
                        BottomSheetBehavior.from((ConstraintLayout) v3DashboardActivity.n0(R.id.clNPSBottomSheet)).setState(3);
                        j0 j0Var = new j0(v3DashboardActivity, 9);
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) v3DashboardActivity.n0(R.id.ivNPSBottomSheetClose);
                        if (appCompatImageView2 != null) {
                            appCompatImageView2.setOnClickListener(j0Var);
                        }
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) v3DashboardActivity.n0(R.id.ivNPSBottomSheetFeedbackClose);
                        if (appCompatImageView3 != null) {
                            appCompatImageView3.setOnClickListener(j0Var);
                        }
                        RobertoTextView robertoTextView = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel0);
                        if (robertoTextView != null) {
                            robertoTextView.setOnClickListener(new j0(v3DashboardActivity, 10));
                        }
                        RobertoTextView robertoTextView2 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel1);
                        if (robertoTextView2 != null) {
                            robertoTextView2.setOnClickListener(new j0(v3DashboardActivity, 11));
                        }
                        RobertoTextView robertoTextView3 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel2);
                        if (robertoTextView3 != null) {
                            robertoTextView3.setOnClickListener(new j0(v3DashboardActivity, 12));
                        }
                        RobertoTextView robertoTextView4 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel3);
                        if (robertoTextView4 != null) {
                            robertoTextView4.setOnClickListener(new j0(v3DashboardActivity, 13));
                        }
                        RobertoTextView robertoTextView5 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel4);
                        if (robertoTextView5 != null) {
                            robertoTextView5.setOnClickListener(new j0(v3DashboardActivity, 14));
                        }
                        RobertoTextView robertoTextView6 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel5);
                        if (robertoTextView6 != null) {
                            robertoTextView6.setOnClickListener(new j0(v3DashboardActivity, 15));
                        }
                        RobertoTextView robertoTextView7 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel6);
                        if (robertoTextView7 != null) {
                            robertoTextView7.setOnClickListener(new j0(v3DashboardActivity, 4));
                        }
                        RobertoTextView robertoTextView8 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel7);
                        if (robertoTextView8 != null) {
                            robertoTextView8.setOnClickListener(new j0(v3DashboardActivity, 5));
                        }
                        RobertoTextView robertoTextView9 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel8);
                        if (robertoTextView9 != null) {
                            robertoTextView9.setOnClickListener(new j0(v3DashboardActivity, 6));
                        }
                        RobertoTextView robertoTextView10 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel9);
                        if (robertoTextView10 != null) {
                            robertoTextView10.setOnClickListener(new j0(v3DashboardActivity, 7));
                        }
                        RobertoTextView robertoTextView11 = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSSeekLevel10);
                        if (robertoTextView11 != null) {
                            robertoTextView11.setOnClickListener(new j0(v3DashboardActivity, 8));
                        }
                        String str = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        defpackage.e.s(bundle, "course", "type", "overall");
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle, "self_care_nps_display");
                        break;
                    }
                    break;
                case 1070287277:
                    if (contentIfNotHandled.equals("setup_lock")) {
                        v3DashboardActivity.getClass();
                        try {
                            ApplicationPersistence.getInstance().setBooleanValue("show_lock_cm", false);
                            String stringValue = ApplicationPersistence.getInstance().getStringValue("user_lock_code");
                            kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…ivity.USER_LOCK_CODE_KEY)");
                            if (stringValue.length() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && ca.a.k("v2.2", "v2.21", "v2.3", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                                View viewLockCM = v3DashboardActivity.n0(R.id.viewLockCM);
                                kotlin.jvm.internal.i.f(viewLockCM, "viewLockCM");
                                View viewLockCM2 = v3DashboardActivity.n0(R.id.viewLockCM);
                                kotlin.jvm.internal.i.f(viewLockCM2, "viewLockCM");
                                ConstraintLayout lockCMLayout = (ConstraintLayout) v3DashboardActivity.n0(R.id.lockCMLayout);
                                kotlin.jvm.internal.i.f(lockCMLayout, "lockCMLayout");
                                final CustomCoachMark customCoachMark = new CustomCoachMark(ca.a.k(viewLockCM, viewLockCM2, lockCMLayout), new g1(v3DashboardActivity));
                                v3DashboardActivity.e0.add(customCoachMark);
                                ((RobertoTextView) v3DashboardActivity.n0(R.id.lockCMYesText)).setOnClickListener(new View.OnClickListener() { // from class: dl.c0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i13 = r3;
                                        CustomCoachMark coachMark = customCoachMark;
                                        V3DashboardActivity this$0 = v3DashboardActivity;
                                        switch (i13) {
                                            case 0:
                                                int i14 = V3DashboardActivity.f10714r1;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(coachMark, "$coachMark");
                                                this$0.startActivityForResult(new Intent(this$0, LockScreenOptionsActivity.class), this$0.N);
                                                coachMark.setVisibility(8);
                                                return;
                                            default:
                                                int i15 = V3DashboardActivity.f10714r1;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(coachMark, "$coachMark");
                                                Snackbar.h((CoordinatorLayout) this$0.n0(R.id.mainContainer), "No problem. You can always access this feature later, from the Menu bar in the top left corner.", 0).i();
                                                coachMark.setVisibility(8);
                                                return;
                                        }
                                    }
                                });
                                ((RobertoTextView) v3DashboardActivity.n0(R.id.lockCMNoText)).setOnClickListener(new View.OnClickListener() { // from class: dl.c0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i13 = r3;
                                        CustomCoachMark coachMark = customCoachMark;
                                        V3DashboardActivity this$0 = v3DashboardActivity;
                                        switch (i13) {
                                            case 0:
                                                int i14 = V3DashboardActivity.f10714r1;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(coachMark, "$coachMark");
                                                this$0.startActivityForResult(new Intent(this$0, LockScreenOptionsActivity.class), this$0.N);
                                                coachMark.setVisibility(8);
                                                return;
                                            default:
                                                int i15 = V3DashboardActivity.f10714r1;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                kotlin.jvm.internal.i.g(coachMark, "$coachMark");
                                                Snackbar.h((CoordinatorLayout) this$0.n0(R.id.mainContainer), "No problem. You can always access this feature later, from the Menu bar in the top left corner.", 0).i();
                                                coachMark.setVisibility(8);
                                                return;
                                        }
                                    }
                                });
                                v3DashboardActivity.I0();
                                break;
                            }
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, "exception", e10);
                            break;
                        }
                    }
                    break;
            }
        }
        return hs.k.f19476a;
    }
}
