package cm;

import android.app.Dialog;
import android.content.Intent;
import android.text.format.DateFormat;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import bm.d;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
/* compiled from: FirestoreGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class q implements d.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f5377a;

    public q(p pVar) {
        this.f5377a = pVar;
    }

    @Override // bm.d.b
    public final void a() {
        WindowManager.LayoutParams layoutParams;
        int i6 = p.G;
        p pVar = this.f5377a;
        yp.d a10 = yp.d.a(pVar.getLayoutInflater());
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_course, pVar.requireContext(), R.style.Theme_Dialog);
        styledDialog.setContentView((CardView) a10.f38759d);
        Window window = styledDialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
        }
        ((AppCompatImageView) a10.f38756a).setImageResource(R.drawable.ic_weekly_goal_banner);
        ((RobertoTextView) a10.f38758c).setText(pVar.getString(R.string.weeklyGoalTrackedHeader));
        ((RobertoTextView) a10.f38760e).setText(pVar.getString(R.string.weeklyGoalTrackedBody));
        ((RobertoTextView) a10.f38757b).setVisibility(4);
        RobertoTextView robertoTextView = (RobertoTextView) a10.f;
        robertoTextView.setOnClickListener(new dk.n(styledDialog, 29));
        robertoTextView.setText(pVar.getString(R.string.got_it));
        styledDialog.show();
        String str = gk.a.f16573a;
        gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_tracked_popup");
    }

    @Override // bm.d.b
    public final void b() {
        p pVar = this.f5377a;
        fm.a aVar = pVar.f5373y;
        if (aVar != null) {
            aVar.z(new Intent(pVar.requireActivity(), RecommendedActivitiesExperimentActivity.class));
        }
    }

    @Override // bm.d.b
    public final void c(FirestoreGoal firestoreGoal) {
        fm.a aVar = this.f5377a.f5373y;
        if (aVar != null) {
            aVar.B(firestoreGoal, false, null);
        }
    }

    @Override // bm.d.b
    public final void d(FirestoreGoal firestoreGoal) {
        p pVar = this.f5377a;
        b.a aVar = new b.a(pVar.requireContext());
        aVar.setTitle("Are you sure you want to remove this goal?");
        aVar.b("Yes", new h(pVar, 1, firestoreGoal));
        aVar.a("Cancel", new yi.d(13));
        androidx.appcompat.app.b create = aVar.create();
        kotlin.jvm.internal.i.f(create, "builder.create()");
        create.show();
    }

    @Override // bm.d.b
    public final void e(FirestoreGoal firestoreGoal) {
        fm.a aVar;
        String goalId;
        p pVar = this.f5377a;
        pVar.B = firestoreGoal;
        if (kotlin.jvm.internal.i.b(firestoreGoal.getDynamicVariant(), "dynamicV1")) {
            Intent intent = new Intent(pVar.requireContext(), NewDynamicParentActivity.class);
            intent.putExtra("activity_id", firestoreGoal.getGoalId());
            intent.putExtra("activity_name", firestoreGoal.getGoalName());
            intent.putExtra(Constants.COURSE_NAME, firestoreGoal.getCourseName());
            intent.putExtra("isGoalsClickabilityFlow", true);
            pVar.C.a(intent);
            return;
        }
        boolean b10 = kotlin.jvm.internal.i.b(firestoreGoal.getGoalId(), "wRiML8ebB1zu56mdNwmN");
        androidx.activity.result.c<Intent> cVar = pVar.D;
        if (b10) {
            Intent intent2 = new Intent(pVar.requireContext(), T5Activity.class);
            intent2.putExtra(Constants.API_COURSE_LINK, Constants.NOTIFICATION_WORRY);
            intent2.putExtra("source", "goals");
            cVar.a(intent2);
            return;
        }
        String type = firestoreGoal.getType();
        if (type != null) {
            switch (type.hashCode()) {
                case -2070778647:
                    if (!type.equals(Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                        return;
                    }
                    cVar.a(new Intent(pVar.requireContext(), TemplateActivity.class).putExtra("source", "goals").putExtra("goalId", firestoreGoal.getGoalId()).putExtra("type", "daily"));
                    return;
                case -1408757131:
                    if (!type.equals(Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                        return;
                    }
                    cVar.a(new Intent(pVar.requireContext(), TemplateActivity.class).putExtra("source", "goals").putExtra("goalId", firestoreGoal.getGoalId()).putExtra("type", "daily"));
                    return;
                case -1142639703:
                    if (!type.equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                        return;
                    }
                    aVar = pVar.f5373y;
                    if (aVar == null && (goalId = firestoreGoal.getGoalId()) != null) {
                        ta.v.H(kc.f.H(aVar), null, 0, new fm.o(aVar, goalId, null), 3);
                        return;
                    }
                    return;
                case -1036290639:
                    if (!type.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                        return;
                    }
                    cVar.a(new Intent(pVar.requireContext(), TemplateActivity.class).putExtra("source", "goals").putExtra("goalId", firestoreGoal.getGoalId()).putExtra("type", "daily"));
                    return;
                case -961591945:
                    if (!type.equals("physical_activity")) {
                        return;
                    }
                    aVar = pVar.f5373y;
                    if (aVar == null) {
                        return;
                    }
                    return;
                case 99033460:
                    if (!type.equals(Constants.GOAL_TYPE_HABIT)) {
                        return;
                    }
                    cVar.a(new Intent(pVar.requireContext(), TemplateActivity.class).putExtra("source", "goals").putExtra("goalId", firestoreGoal.getGoalId()).putExtra("type", "daily"));
                    return;
                case 777898929:
                    if (!type.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                        return;
                    }
                    cVar.a(new Intent(pVar.requireContext(), TemplateActivity.class).putExtra("source", "goals").putExtra("goalId", firestoreGoal.getGoalId()).putExtra("type", "daily"));
                    return;
                default:
                    return;
            }
        }
    }

    @Override // bm.d.b
    public final void f(FirestoreGoal firestoreGoal, long j10) {
        WindowManager.LayoutParams layoutParams;
        p pVar = this.f5377a;
        pVar.getClass();
        try {
            long j11 = 1000;
            CharSequence format = DateFormat.format("EEEE", firestoreGoal.getScheduledDate().getTime() * j11);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(firestoreGoal.getScheduledDate().getTime() * j11);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            calendar2.set(11, calendar.get(11));
            calendar2.set(12, calendar.get(12));
            yp.d a10 = yp.d.a(pVar.getLayoutInflater());
            Object obj = a10.f;
            Object obj2 = a10.f38757b;
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_reschedule_goal, pVar.requireContext(), R.style.Theme_Dialog);
            styledDialog.setContentView((CardView) a10.f38759d);
            Window window = styledDialog.getWindow();
            if (window != null) {
                layoutParams = window.getAttributes();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
            }
            ((AppCompatImageView) a10.f38756a).setImageResource(R.drawable.ic_weekly_goal_banner);
            ((RobertoTextView) a10.f38758c).setText(pVar.getString(R.string.weeklyGoalHeader, format));
            ((RobertoTextView) a10.f38760e).setText(pVar.getString(R.string.weeklyGoalBody, format));
            ((RobertoTextView) obj2).setText(pVar.getString(R.string.cancel));
            ((RobertoTextView) obj).setText(pVar.getString(R.string.weeklyGoalReschedule));
            ((RobertoTextView) obj).setOnClickListener(new tk.q(firestoreGoal, calendar2, pVar, styledDialog, 6));
            ((RobertoTextView) obj2).setOnClickListener(new dk.n(styledDialog, 28));
            styledDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(pVar.f5369u, e10);
        }
    }
}
