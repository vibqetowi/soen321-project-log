package so;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31790u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ExperimentProfileActivity f31791v;

    public /* synthetic */ a0(ExperimentProfileActivity experimentProfileActivity, int i6) {
        this.f31790u = i6;
        this.f31791v = experimentProfileActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WindowManager.LayoutParams layoutParams;
        int i6 = this.f31790u;
        ExperimentProfileActivity this$0 = this.f31791v;
        switch (i6) {
            case 0:
                int i10 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (Utils.INSTANCE.checkConnectivity(this$0)) {
                        this$0.startActivityForResult(new Intent(this$0, ExperimentEditProfileActivity.class), this$0.D);
                        this$0.overridePendingTransition(R.anim.fade_in_activity, R.anim.fade_out_activity);
                    }
                    String str = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putString("variant", "new");
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "profile_edit_click");
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e10);
                    return;
                }
            case 1:
                int i11 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(4);
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e11);
                    return;
                }
            case 2:
                int i12 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    FrameLayout frameLayout = (FrameLayout) this$0.u0(R.id.notificationsContainer);
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                    androidx.fragment.app.y supportFragmentManager = this$0.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.h(R.anim.fade_in, R.anim.fade_out, 0, 0);
                    aVar.f(R.id.notificationsContainer, new uo.k(), "notifFrag");
                    aVar.j();
                    this$0.I = true;
                    gk.a.b(null, "new_profile_bell_icon_click");
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e12);
                    return;
                }
            case 3:
                int i13 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.E) {
                    this$0.setResult(-1, new Intent());
                }
                this$0.finish();
                return;
            case 4:
                int i14 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    BottomSheetBehavior.from((ConstraintLayout) this$0.u0(R.id.profileBottomSheet)).setState(4);
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e13);
                    return;
                }
            case 5:
                int i15 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    gk.a.b(null, "profile_unlock_click");
                    this$0.startActivityForResult(tr.r.s(this$0, false).putExtra("source", "profile_new"), this$0.C);
                    return;
                } catch (Exception e14) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e14);
                    return;
                }
            case 6:
                int i16 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    String str2 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("variant", "new");
                    bundle2.putBoolean("therapist_present", false);
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle2, "profile_session_click");
                    if (ConnectionStatusReceiver.isConnected()) {
                        boolean z10 = this$0.Q;
                        androidx.activity.result.c<Intent> cVar = this$0.O;
                        if (z10) {
                            cVar.a(new Intent(this$0, ExpertCareInfoActivity.class).putExtra("source", Constants.SCREEN_PROFILE));
                        } else {
                            cVar.a(new Intent(this$0, TelecommunicationsPWAActivity.class));
                        }
                    } else {
                        Utils utils = Utils.INSTANCE;
                        String string = this$0.getString(R.string.no_internet_msg);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.no_internet_msg)");
                        utils.showCustomToast(this$0, string);
                    }
                    return;
                } catch (Exception e15) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e15);
                    return;
                }
            case 7:
                int i17 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    String str3 = gk.a.f16573a;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("variant", "new");
                    bundle3.putBoolean("therapist_present", true);
                    bundle3.putString("flow", "therapy");
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle3, "profile_session_click");
                    if (ConnectionStatusReceiver.isConnected()) {
                        this$0.O.a(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY));
                    } else {
                        Utils utils2 = Utils.INSTANCE;
                        String string2 = this$0.getString(R.string.no_internet_msg);
                        kotlin.jvm.internal.i.f(string2, "getString(R.string.no_internet_msg)");
                        utils2.showCustomToast(this$0, string2);
                    }
                    return;
                } catch (Exception e16) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e16);
                    return;
                }
            case 8:
                int i18 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    String str4 = gk.a.f16573a;
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("variant", "new");
                    bundle4.putBoolean("therapist_present", true);
                    bundle4.putString("flow", "couples");
                    hs.k kVar4 = hs.k.f19476a;
                    gk.a.b(bundle4, "profile_session_click");
                    if (ConnectionStatusReceiver.isConnected()) {
                        this$0.O.a(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_THERAPY_COUPLES));
                    } else {
                        Utils utils3 = Utils.INSTANCE;
                        String string3 = this$0.getString(R.string.no_internet_msg);
                        kotlin.jvm.internal.i.f(string3, "getString(R.string.no_internet_msg)");
                        utils3.showCustomToast(this$0, string3);
                    }
                    return;
                } catch (Exception e17) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e17);
                    return;
                }
            case 9:
                int i19 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    String str5 = gk.a.f16573a;
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("variant", "new");
                    bundle5.putBoolean("psychiatrist_present", true);
                    bundle5.putString("flow", "psychiatry");
                    hs.k kVar5 = hs.k.f19476a;
                    gk.a.b(bundle5, "profile_session_click");
                    if (ConnectionStatusReceiver.isConnected()) {
                        this$0.O.a(new Intent(this$0, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FLOW_PSYCHIATRY));
                    } else {
                        Utils utils4 = Utils.INSTANCE;
                        String string4 = this$0.getString(R.string.no_internet_msg);
                        kotlin.jvm.internal.i.f(string4, "getString(R.string.no_internet_msg)");
                        utils4.showCustomToast(this$0, string4);
                    }
                    return;
                } catch (Exception e18) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e18);
                    return;
                }
            case 10:
                int i20 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    gk.a.b(null, "profile_hp_info_click");
                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_profile_new_points, this$0, R.style.Theme_Dialog);
                    Window window = styledDialog.getWindow();
                    if (window != null) {
                        layoutParams = window.getAttributes();
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams != null) {
                        layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                    }
                    AppCompatImageView appCompatImageView = (AppCompatImageView) styledDialog.findViewById(R.id.profilePointsDialogClose);
                    if (appCompatImageView != null) {
                        appCompatImageView.setOnClickListener(new ho.o(styledDialog, 3, this$0));
                    }
                    styledDialog.show();
                    return;
                } catch (Exception e19) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e19);
                    return;
                }
            case 11:
                int i21 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (Utils.INSTANCE.checkConnectivity(this$0)) {
                        this$0.startActivityForResult(new Intent(this$0, ExperimentEditProfileActivity.class), this$0.D);
                        this$0.overridePendingTransition(R.anim.fade_in_activity, R.anim.fade_out_activity);
                    }
                    String str6 = gk.a.f16573a;
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("variant", "new");
                    hs.k kVar6 = hs.k.f19476a;
                    gk.a.b(bundle6, "profile_edit_click");
                    return;
                } catch (Exception e20) {
                    LogHelper.INSTANCE.e(this$0.f11575w, e20);
                    return;
                }
            case 12:
                int i22 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.setResult(-1, new Intent().putExtra("launch_today_plan", true));
                this$0.finish();
                return;
            default:
                int i23 = ExperimentProfileActivity.S;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.M.a(new Intent(this$0, BookmarkingActivity.class).putExtra("source", Constants.SCREEN_PROFILE));
                return;
        }
    }
}
