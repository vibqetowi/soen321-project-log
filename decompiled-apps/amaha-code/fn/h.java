package fn;

import a3.t;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.fragment.NavHostFragment;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.login.model.NavigationScreenName;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hn.q;
import ik.z;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: LoginSignupReworkActivity.kt */
/* loaded from: classes2.dex */
public final class h extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ LoginSignupReworkActivity f15633u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LoginSignupReworkActivity loginSignupReworkActivity) {
        super(1);
        this.f15633u = loginSignupReworkActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Window window;
        boolean z10;
        if (kotlin.jvm.internal.i.b(bool, Boolean.TRUE)) {
            int i6 = LoginSignupReworkActivity.C;
            final LoginSignupReworkActivity loginSignupReworkActivity = this.f15633u;
            WindowManager.LayoutParams layoutParams = null;
            View inflate = loginSignupReworkActivity.getLayoutInflater().inflate(R.layout.activity_login_signup_rework, (ViewGroup) null, false);
            int i10 = R.id.btnIntroGetStarted;
            RobertoButton robertoButton = (RobertoButton) hc.d.w(R.id.btnIntroGetStarted, inflate);
            if (robertoButton != null) {
                i10 = R.id.btnIntroHaveAccount;
                RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.btnIntroHaveAccount, inflate);
                if (robertoTextView != null) {
                    i10 = R.id.clParentContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.clParentContainer, inflate);
                    if (constraintLayout != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                        i10 = R.id.fcvNavContainer;
                        FragmentContainerView fragmentContainerView = (FragmentContainerView) hc.d.w(R.id.fcvNavContainer, inflate);
                        if (fragmentContainerView != null) {
                            i10 = R.id.ivIntroLottie;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) hc.d.w(R.id.ivIntroLottie, inflate);
                            if (lottieAnimationView != null) {
                                i10 = R.id.tvIntroTitle;
                                RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.tvIntroTitle, inflate);
                                if (robertoTextView2 != null) {
                                    i10 = R.id.tvIntroUserCount;
                                    RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.tvIntroUserCount, inflate);
                                    if (robertoTextView3 != null) {
                                        j7.k kVar = new j7.k(coordinatorLayout, robertoButton, robertoTextView, constraintLayout, coordinatorLayout, fragmentContainerView, lottieAnimationView, robertoTextView2, robertoTextView3);
                                        loginSignupReworkActivity.f11312y = kVar;
                                        loginSignupReworkActivity.setContentView((CoordinatorLayout) kVar.f21732u);
                                        j7.k kVar2 = loginSignupReworkActivity.f11312y;
                                        if (kVar2 != null) {
                                            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) kVar2.f21737z;
                                            Fragment E = loginSignupReworkActivity.getSupportFragmentManager().E(fragmentContainerView2.getId());
                                            kotlin.jvm.internal.i.e(E, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                                            loginSignupReworkActivity.A = ((NavHostFragment) E).F();
                                            BottomSheetBehavior<FragmentContainerView> from = BottomSheetBehavior.from(fragmentContainerView2);
                                            kotlin.jvm.internal.i.f(from, "from(it)");
                                            loginSignupReworkActivity.f11313z = from;
                                            int i11 = Build.VERSION.SDK_INT;
                                            Object obj = kVar2.A;
                                            if (i11 < 25) {
                                                ((LottieAnimationView) obj).setRenderMode(t.SOFTWARE);
                                            } else {
                                                ((LottieAnimationView) obj).setRenderMode(t.HARDWARE);
                                            }
                                            q qVar = loginSignupReworkActivity.f11310w;
                                            if (qVar != null && qVar.Q) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                ((RobertoTextView) kVar2.f21734w).setVisibility(8);
                                            }
                                        }
                                        if (LocationPersistence.INSTANCE.isIndianUser()) {
                                            a3.d.f(loginSignupReworkActivity, a3.d.h(R.raw.intro_animation_experiment, loginSignupReworkActivity), R.raw.intro_animation_experiment).b(new z(2, loginSignupReworkActivity));
                                        }
                                        j7.k kVar3 = loginSignupReworkActivity.f11312y;
                                        if (kVar3 != null) {
                                            ((RobertoButton) kVar3.f21733v).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener() { // from class: fn.a
                                                /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
                                                    if (r10.Q == true) goto L13;
                                                 */
                                                @Override // android.view.View.OnClickListener
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final void onClick(View view) {
                                                    String str;
                                                    boolean z11;
                                                    int i12 = 6;
                                                    int i13 = r2;
                                                    String str2 = null;
                                                    LoginSignupReworkActivity this$0 = loginSignupReworkActivity;
                                                    switch (i13) {
                                                        case 0:
                                                            int i14 = LoginSignupReworkActivity.C;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            String str3 = gk.a.f16573a;
                                                            Bundle bundle = new Bundle();
                                                            bundle.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle, "intro_signup_click");
                                                            q qVar2 = this$0.f11310w;
                                                            if (qVar2 != null) {
                                                                str = qVar2.f17890b0;
                                                            } else {
                                                                str = null;
                                                            }
                                                            if (kotlin.jvm.internal.i.b(str, "default")) {
                                                                i12 = 3;
                                                            }
                                                            this$0.q0(i12);
                                                            q qVar3 = this$0.f11310w;
                                                            if (qVar3 != null) {
                                                                z11 = true;
                                                                break;
                                                            }
                                                            z11 = false;
                                                            if (z11) {
                                                                LoginSignupReworkActivity.p0(this$0, NavigationScreenName.SIGNUP_TO_LOGIN, null, 4);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            int i15 = LoginSignupReworkActivity.C;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            String str4 = gk.a.f16573a;
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                                                            hs.k kVar5 = hs.k.f19476a;
                                                            gk.a.b(bundle2, "intro_login_click");
                                                            LoginSignupReworkActivity.p0(this$0, NavigationScreenName.SIGNUP_TO_LOGIN, null, 4);
                                                            q qVar4 = this$0.f11310w;
                                                            if (qVar4 != null) {
                                                                str2 = qVar4.f17890b0;
                                                            }
                                                            if (kotlin.jvm.internal.i.b(str2, "default")) {
                                                                i12 = 3;
                                                            }
                                                            this$0.q0(i12);
                                                            return;
                                                    }
                                                }
                                            }));
                                            ((RobertoTextView) kVar3.f21734w).setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener() { // from class: fn.a
                                                /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
                                                    if (r10.Q == true) goto L13;
                                                 */
                                                @Override // android.view.View.OnClickListener
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final void onClick(View view) {
                                                    String str;
                                                    boolean z11;
                                                    int i12 = 6;
                                                    int i13 = r2;
                                                    String str2 = null;
                                                    LoginSignupReworkActivity this$0 = loginSignupReworkActivity;
                                                    switch (i13) {
                                                        case 0:
                                                            int i14 = LoginSignupReworkActivity.C;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            String str3 = gk.a.f16573a;
                                                            Bundle bundle = new Bundle();
                                                            bundle.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle, "intro_signup_click");
                                                            q qVar2 = this$0.f11310w;
                                                            if (qVar2 != null) {
                                                                str = qVar2.f17890b0;
                                                            } else {
                                                                str = null;
                                                            }
                                                            if (kotlin.jvm.internal.i.b(str, "default")) {
                                                                i12 = 3;
                                                            }
                                                            this$0.q0(i12);
                                                            q qVar3 = this$0.f11310w;
                                                            if (qVar3 != null) {
                                                                z11 = true;
                                                                break;
                                                            }
                                                            z11 = false;
                                                            if (z11) {
                                                                LoginSignupReworkActivity.p0(this$0, NavigationScreenName.SIGNUP_TO_LOGIN, null, 4);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            int i15 = LoginSignupReworkActivity.C;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            String str4 = gk.a.f16573a;
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putString("variant", ApplicationPersistence.getInstance().getStringValue(Constants.ONBOARDING_EXPERIMENT));
                                                            hs.k kVar5 = hs.k.f19476a;
                                                            gk.a.b(bundle2, "intro_login_click");
                                                            LoginSignupReworkActivity.p0(this$0, NavigationScreenName.SIGNUP_TO_LOGIN, null, 4);
                                                            q qVar4 = this$0.f11310w;
                                                            if (qVar4 != null) {
                                                                str2 = qVar4.f17890b0;
                                                            }
                                                            if (kotlin.jvm.internal.i.b(str2, "default")) {
                                                                i12 = 3;
                                                            }
                                                            this$0.q0(i12);
                                                            return;
                                                    }
                                                }
                                            }));
                                        }
                                        try {
                                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_loading, loginSignupReworkActivity, R.style.Theme_Dialog);
                                            loginSignupReworkActivity.f11311x = styledDialog;
                                            if (styledDialog != null && (window = styledDialog.getWindow()) != null) {
                                                layoutParams = window.getAttributes();
                                            }
                                            if (layoutParams != null) {
                                                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                                            }
                                            Dialog dialog = loginSignupReworkActivity.f11311x;
                                            if (dialog != null) {
                                                dialog.setCancelable(false);
                                            }
                                        } catch (Exception e10) {
                                            LogHelper.INSTANCE.e(loginSignupReworkActivity.f11309v, e10);
                                        }
                                        if (loginSignupReworkActivity.getIntent().hasExtra("showLogoutDialog")) {
                                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, loginSignupReworkActivity, R.style.Theme_Dialog_Fullscreen);
                                            Window window2 = styledDialog2.getWindow();
                                            if (window2 != null) {
                                                window2.setLayout(-1, -1);
                                            }
                                            View findViewById = styledDialog2.findViewById(R.id.tvDeleteDialogTitle);
                                            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                            ((RobertoTextView) findViewById).setText(loginSignupReworkActivity.getString(R.string.something_went_wrong));
                                            View findViewById2 = styledDialog2.findViewById(R.id.tvDeleteDialogQuestion);
                                            kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                                            ((RobertoTextView) findViewById2).setText(loginSignupReworkActivity.getString(R.string.accidentalLogoutDialogDescription));
                                            View findViewById3 = styledDialog2.findViewById(R.id.btnDeleteDialogNegative);
                                            kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
                                            ((RobertoButton) findViewById3).setText(loginSignupReworkActivity.getString(R.string.depressionPleasurableCompletionCTA));
                                            View findViewById4 = styledDialog2.findViewById(R.id.btnDeleteDialogNegative);
                                            kotlin.jvm.internal.i.e(findViewById4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
                                            ((RobertoButton) findViewById4).setOnClickListener(new lm.f(styledDialog2, 3));
                                            View findViewById5 = styledDialog2.findViewById(R.id.btnDeleteDialogPositive);
                                            kotlin.jvm.internal.i.e(findViewById5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
                                            ((RobertoButton) findViewById5).setVisibility(8);
                                            styledDialog2.show();
                                            SessionManager.getInstance().clearData();
                                            FirebasePersistence.getInstance().logout();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
        }
        return hs.k.f19476a;
    }
}
