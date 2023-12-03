package dl;

import android.app.Dialog;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class c2 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f12992u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f12992u = v3DashboardActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    @Override // ss.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke(Boolean bool) {
        ConstraintLayout topicalView;
        boolean z10;
        ArrayList<MiniCourse> topicalCourseList;
        boolean z11;
        if (kotlin.jvm.internal.i.b(bool, Boolean.TRUE)) {
            V3DashboardActivity v3DashboardActivity = this.f12992u;
            v3DashboardActivity.getClass();
            if (ApplicationPersistence.getInstance().containsKey("2022_topical_fetch_end") && ApplicationPersistence.getInstance().containsKey("2022_topical_plan_end")) {
                if (!defpackage.b.u(SessionManager.KEY_USERTYPE, "patient") && LocationPersistence.INSTANCE.isIndianUser()) {
                    topicalView = (ConstraintLayout) v3DashboardActivity.n0(R.id.clTopicalCardContainerB2B);
                } else {
                    topicalView = (ConstraintLayout) v3DashboardActivity.n0(R.id.clTopicalCardContainer);
                }
                if (Calendar.getInstance().getTimeInMillis() < ApplicationPersistence.getInstance().getLongValue("2022_topical_fetch_end")) {
                    boolean z12 = true;
                    if (ApplicationPersistence.getInstance().getBooleanValue("topical_2022_intro", true) && !ApplicationPersistence.getInstance().getBooleanValue("new_user", false)) {
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null && (topicalCourseList = user.getTopicalCourseList()) != null) {
                            if (!topicalCourseList.isEmpty()) {
                                for (MiniCourse miniCourse : topicalCourseList) {
                                    if (is.k.Q1(miniCourse.getDomain(), new String[]{Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID})) {
                                        z11 = false;
                                        break;
                                    }
                                }
                            }
                            z11 = true;
                            if (z11) {
                                z10 = true;
                                if (z10) {
                                    ApplicationPersistence.getInstance().setBooleanValue("topical_2022_intro", false);
                                    Dialog dialog = UiUtils.Companion.getDialog(R.layout.dialog_topical_entry, v3DashboardActivity);
                                    Window window = dialog.getWindow();
                                    kotlin.jvm.internal.i.d(window);
                                    window.getAttributes().windowAnimations = R.style.DialogGrowInAndSlideOut;
                                    ((RobertoTextView) dialog.findViewById(R.id.btnTopicalEntryDialogCancelCTA)).setOnClickListener(new dk.n(dialog, 13));
                                    ((RobertoButton) dialog.findViewById(R.id.btnTopicalEntryDialogStartCTA)).setOnClickListener(new k0(v3DashboardActivity, dialog, 2));
                                    dialog.setCancelable(false);
                                    dialog.show();
                                }
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                    }
                    z12 = (kotlin.jvm.internal.i.b(LocationPersistence.INSTANCE.getCurrentCountry(), "IN") || kotlin.jvm.internal.i.b(v3DashboardActivity.L0, "default") || !defpackage.b.u(SessionManager.KEY_USERTYPE, "patient")) ? false : false;
                    if (kotlin.jvm.internal.i.b(v3DashboardActivity.L0, "default") && !z12) {
                        ApplicationPersistence.getInstance().setBooleanValue("2022_topical_card_remove", false);
                        Extensions extensions = Extensions.INSTANCE;
                        kotlin.jvm.internal.i.f(topicalView, "topicalView");
                        extensions.visible(topicalView);
                    }
                } else if (FirebasePersistence.getInstance().getUser().getTopicalCourseList() == null) {
                    topicalView.setVisibility(8);
                } else if (Calendar.getInstance().getTimeInMillis() < ApplicationPersistence.getInstance().getLongValue("2022_topical_plan_end") && kotlin.jvm.internal.i.b(v3DashboardActivity.L0, "default")) {
                    topicalView.setVisibility(0);
                }
            }
        }
        return hs.k.f19476a;
    }
}
