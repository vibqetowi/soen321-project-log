package dl;

import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.utils.V3DashboardUtils;
import com.theinnerhour.b2b.model.GamificationBadgesModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13115u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13116v;

    public /* synthetic */ v(V3DashboardActivity v3DashboardActivity, int i6) {
        this.f13115u = i6;
        this.f13116v = v3DashboardActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e1, code lost:
        if (r5.N0().getPlanV3().size() == 16) goto L59;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i6 = this.f13115u;
        boolean z10 = true;
        V3DashboardActivity this$0 = this.f13116v;
        switch (i6) {
            case 0:
                int i10 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((ScrollView) this$0.n0(R.id.scrollView2)).smoothScrollTo(0, (int) ((FrameLayout) this$0.n0(R.id.flPWAMatchedProvidersContainer)).getY());
                return;
            case 1:
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.L1(false);
                if (this$0.N0().getAssessments().size() != 1 || this$0.N0().getPlanV3().size() != 1) {
                    if (this$0.N0().getAssessments().size() == 2) {
                        break;
                    }
                    z10 = false;
                }
                if (z10) {
                    Extensions extensions = Extensions.INSTANCE;
                    ConstraintLayout retryCl = (ConstraintLayout) this$0.n0(R.id.retryCl);
                    kotlin.jvm.internal.i.f(retryCl, "retryCl");
                    extensions.visible(retryCl);
                    ((RobertoButton) this$0.n0(R.id.btnRetry)).setOnClickListener(DebouncedOnClickListener.wrap(new e0(this$0, 24)));
                    return;
                }
                Extensions extensions2 = Extensions.INSTANCE;
                ConstraintLayout retryCl2 = (ConstraintLayout) this$0.n0(R.id.retryCl);
                kotlin.jvm.internal.i.f(retryCl2, "retryCl");
                extensions2.gone(retryCl2);
                return;
            case 2:
                int i12 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((ScrollView) this$0.n0(R.id.scrollView2)).smoothScrollTo(0, (int) ((FrameLayout) this$0.n0(R.id.flExpertCareContainer)).getY());
                return;
            case 3:
                int i13 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.f10733l0) {
                    this$0.H1("post_assessment", Constants.SCREEN_DASHBOARD);
                    return;
                }
                return;
            case 4:
                int i14 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ((ScrollView) this$0.n0(R.id.scrollView2)).smoothScrollTo(0, (int) this$0.n0(R.id.layoutJournalCard).getY());
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f10748v, e10);
                    return;
                }
            case 5:
                int i15 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((ScrollView) this$0.n0(R.id.scrollView2)).smoothScrollTo(0, ((int) ((FrameLayout) this$0.n0(R.id.containerFrame)).getY()) - 500);
                return;
            case 6:
                int i16 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ((ScrollView) this$0.n0(R.id.scrollView2)).smoothScrollTo(0, ((int) ((FrameLayout) this$0.n0(R.id.containerFrame)).getY()) - 300);
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f10748v, e11);
                    return;
                }
            case 7:
                int i17 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ((ScrollView) this$0.n0(R.id.scrollView2)).smoothScrollTo(0, (int) ((LinearLayout) this$0.n0(R.id.llDashboardProviderEntryPointExperiment)).getY());
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f10748v, e12);
                    return;
                }
            case 8:
                int i18 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                Iterator<GamificationBadgesModel> it = Constants.getGamificationBadgesV3().iterator();
                while (it.hasNext()) {
                    GamificationBadgesModel next = it.next();
                    if (badges.containsKey(next.getId()) && kotlin.jvm.internal.i.b(badges.get(next.getId()), Constants.BADGE_ATTAINED)) {
                        V3DashboardUtils v3DashboardUtils = this$0.B;
                        v3DashboardUtils.getClass();
                        Dialog dialog = UiUtils.Companion.getDialog(R.layout.gamification_badges_popup, v3DashboardUtils.f());
                        View findViewById = dialog.findViewById(R.id.title);
                        kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                        ((RobertoTextView) findViewById).setText(next.getName());
                        View findViewById2 = dialog.findViewById(R.id.desc);
                        kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
                        ((RobertoTextView) findViewById2).setVisibility(8);
                        View findViewById3 = dialog.findViewById(R.id.badgeImage);
                        kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                        ((AppCompatImageView) findViewById3).setImageResource(next.getImage());
                        View findViewById4 = dialog.findViewById(R.id.close);
                        kotlin.jvm.internal.i.e(findViewById4, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                        ((AppCompatImageView) findViewById4).setOnClickListener(new dk.n(dialog, 17));
                        View findViewById5 = dialog.findViewById(R.id.popupBadges);
                        kotlin.jvm.internal.i.e(findViewById5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
                        ((RobertoButton) findViewById5).setOnClickListener(new dk.t(v3DashboardUtils, dialog, next, 18));
                        dialog.show();
                        badges.put(next.getId(), Constants.BADGE_POPUP_DISPLAYED);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                }
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ((ScrollView) this$0.n0(R.id.scrollView2)).smoothScrollTo(0, ((int) ((FrameLayout) this$0.n0(R.id.llCommunitiesExperiment1)).getY()) - 200);
                    RoutingIntentHandler d10 = this$0.P0().X.d();
                    if (d10 != null) {
                        d10.setRoutingCompleted(true);
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$0.f10748v, e13);
                    return;
                }
        }
    }
}
