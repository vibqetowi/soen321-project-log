package ko;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.chat.activity.CoachChatActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProAssessmentListingActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.components.pro.dashboard.activity.ProDashboardActivity;
import com.theinnerhour.b2b.components.pro.goal.activity.ProGoalsActivity;
import com.theinnerhour.b2b.components.pro.tracker.activity.ProMultiTrackerActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23441u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ProDashboardActivity f23442v;

    public /* synthetic */ a(ProDashboardActivity proDashboardActivity, int i6) {
        this.f23441u = i6;
        this.f23442v = proDashboardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i6 = this.f23441u;
        ProDashboardActivity this$0 = this.f23442v;
        switch (i6) {
            case 0:
                int i10 = ProDashboardActivity.F;
                i.g(this$0, "this$0");
                View u02 = this$0.u0(R.id.proDbTherapistInfoDivider);
                if (u02 != null && u02.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) this$0.u0(R.id.proDbTherapistInfoCta);
                    if (appCompatImageView != null) {
                        appCompatImageView.setImageResource(R.drawable.ic_keyboard_arrow_down);
                    }
                    View u03 = this$0.u0(R.id.proDbTherapistInfoDivider);
                    if (u03 != null) {
                        u03.setVisibility(4);
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) this$0.u0(R.id.proDbTherapistInfoPoint1);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) this$0.u0(R.id.proDbTherapistInfoPoint2);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setVisibility(8);
                    }
                    RobertoTextView robertoTextView3 = (RobertoTextView) this$0.u0(R.id.proDbTherapistInfoPoint3);
                    if (robertoTextView3 != null) {
                        robertoTextView3.setVisibility(8);
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0.u0(R.id.proDbTherapistInfoPointImage1);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setVisibility(8);
                    }
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$0.u0(R.id.proDbTherapistInfoPointImage2);
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setVisibility(8);
                    }
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) this$0.u0(R.id.proDbTherapistInfoPointImage3);
                    if (appCompatImageView4 != null) {
                        appCompatImageView4.setVisibility(8);
                    }
                    View u04 = this$0.u0(R.id.emptyView);
                    if (u04 != null) {
                        u04.setVisibility(8);
                        return;
                    }
                    return;
                }
                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0.u0(R.id.proDbTherapistInfoCta);
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setImageResource(R.drawable.ic_keyboard_arrow_up);
                }
                View u05 = this$0.u0(R.id.proDbTherapistInfoDivider);
                if (u05 != null) {
                    u05.setVisibility(0);
                }
                RobertoTextView robertoTextView4 = (RobertoTextView) this$0.u0(R.id.proDbTherapistInfoPoint1);
                if (robertoTextView4 != null) {
                    robertoTextView4.setVisibility(0);
                }
                RobertoTextView robertoTextView5 = (RobertoTextView) this$0.u0(R.id.proDbTherapistInfoPoint2);
                if (robertoTextView5 != null) {
                    robertoTextView5.setVisibility(0);
                }
                RobertoTextView robertoTextView6 = (RobertoTextView) this$0.u0(R.id.proDbTherapistInfoPoint3);
                if (robertoTextView6 != null) {
                    robertoTextView6.setVisibility(0);
                }
                AppCompatImageView appCompatImageView6 = (AppCompatImageView) this$0.u0(R.id.proDbTherapistInfoPointImage1);
                if (appCompatImageView6 != null) {
                    appCompatImageView6.setVisibility(0);
                }
                AppCompatImageView appCompatImageView7 = (AppCompatImageView) this$0.u0(R.id.proDbTherapistInfoPointImage2);
                if (appCompatImageView7 != null) {
                    appCompatImageView7.setVisibility(0);
                }
                AppCompatImageView appCompatImageView8 = (AppCompatImageView) this$0.u0(R.id.proDbTherapistInfoPointImage3);
                if (appCompatImageView8 != null) {
                    appCompatImageView8.setVisibility(0);
                }
                View u06 = this$0.u0(R.id.emptyView);
                if (u06 != null) {
                    u06.setVisibility(0);
                    return;
                }
                return;
            case 1:
                int i11 = ProDashboardActivity.F;
                i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().setBooleanValue("pro_db_goals_info_show", false);
                ApplicationPersistence.getInstance().setBooleanValue("pro_db_new_goals", false);
                this$0.startActivityForResult(new Intent(this$0, ProGoalsActivity.class).putExtra("coach_assigned_goals", this$0.f11527y), Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
                gk.a.b(null, "pro_goals_click");
                return;
            case 2:
                int i12 = ProDashboardActivity.F;
                i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().setBooleanValue("pro_db_tracker_info_show", false);
                ApplicationPersistence.getInstance().setBooleanValue("pro_db_new_multi_trackers", false);
                this$0.startActivityForResult(new Intent(this$0, ProMultiTrackerActivity.class).putExtra("isMultiTrackerAssigned", this$0.B), 8192);
                gk.a.b(null, "pro_tracker_click");
                return;
            case 3:
                int i13 = ProDashboardActivity.F;
                i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    ApplicationPersistence.getInstance().setBooleanValue("pro_db_assessment_info_show", false);
                    this$0.startActivityForResult(new Intent(this$0, ProAssessmentListingActivity.class), 4096);
                    gk.a.b(null, "pro_assessment_click");
                }
                Integer num = this$0.D;
                if (num != null) {
                    ApplicationPersistence.getInstance().setIntValue("pro_db_assessment_latest_id", num.intValue());
                    return;
                }
                return;
            case 4:
                int i14 = ProDashboardActivity.F;
                i.g(this$0, "this$0");
                if (this$0.C != null) {
                    gk.a.b(null, "pro_assessment_video_db");
                    this$0.startActivityForResult(new Intent(this$0, ProInitialAssessmentActivity.class).putExtra("show_coach_video", this$0.C), 512);
                    return;
                }
                return;
            default:
                i.g(this$0, "this$0");
                if (Utils.INSTANCE.checkConnectivity(this$0)) {
                    ApplicationPersistence.getInstance().setBooleanValue("pro_db_message_info_show", false);
                    this$0.startActivityForResult(new Intent(this$0, CoachChatActivity.class).putExtra("friend", this$0.f11528z), Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
                    gk.a.b(null, "pro_messages_click");
                    return;
                }
                return;
        }
    }
}
