package w5;

import android.view.MotionEvent;
import android.view.View;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4Activity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14CScreenFragment;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import fq.q0;
import hr.o8;
import hr.s4;
import hr.s7;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements View.OnTouchListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f36467u;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f36467u) {
            case 0:
                if (!view.hasFocus()) {
                    view.requestFocus();
                    return false;
                }
                return false;
            case 1:
                int i6 = MiniCourseActivity.O;
                return true;
            case 2:
                int i10 = V2DashboardActivity.F0;
                return true;
            case 3:
                int i11 = V3DashboardActivity.f10714r1;
                return true;
            case 4:
                int i12 = V3DashboardActivity.f10714r1;
                return true;
            case 5:
                int i13 = V3DashboardActivity.f10714r1;
                return true;
            case 6:
                int i14 = CustomDashboardActivity.C;
                return true;
            case 7:
                int i15 = NotV4Activity.G;
                return true;
            case 8:
                int i16 = N14CScreenFragment.S;
                return true;
            case 9:
                int i17 = FirestoreGoalsActivity.E;
                return true;
            case 10:
                int i18 = V3GoalsActivity.X;
                return true;
            case 11:
                int i19 = nm.d.F;
                return true;
            case 12:
                int i20 = LearningHubExperimentActivity.F;
                if (motionEvent.getAction() == 1) {
                    view.performClick();
                }
                return true;
            case 13:
                int i21 = q0.K;
                kotlin.jvm.internal.i.g(view, "<anonymous parameter 0>");
                kotlin.jvm.internal.i.g(motionEvent, "<anonymous parameter 1>");
                return true;
            case 14:
                int i22 = s4.f19143z;
                kotlin.jvm.internal.i.g(view, "<anonymous parameter 0>");
                kotlin.jvm.internal.i.g(motionEvent, "<anonymous parameter 1>");
                return true;
            case 15:
                int i23 = s7.M;
                kotlin.jvm.internal.i.g(view, "<anonymous parameter 0>");
                kotlin.jvm.internal.i.g(motionEvent, "<anonymous parameter 1>");
                return true;
            default:
                int i24 = o8.H;
                kotlin.jvm.internal.i.g(view, "<anonymous parameter 0>");
                kotlin.jvm.internal.i.g(motionEvent, "<anonymous parameter 1>");
                return true;
        }
    }
}
