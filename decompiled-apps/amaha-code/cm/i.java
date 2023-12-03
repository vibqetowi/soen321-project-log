package cm;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import bm.b;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AddCustomGoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.TrackCustomGoalActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
/* compiled from: FirestoreCustomGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class i implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f5351a;

    public i(l lVar) {
        this.f5351a = lVar;
    }

    @Override // bm.b.c
    public final void a() {
        WindowManager.LayoutParams layoutParams;
        int i6 = l.B;
        l lVar = this.f5351a;
        yp.d a10 = yp.d.a(lVar.getLayoutInflater());
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_course, lVar.requireContext(), R.style.Theme_Dialog);
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
        ((RobertoTextView) a10.f38758c).setText(lVar.getString(R.string.weeklyGoalTrackedHeader));
        ((RobertoTextView) a10.f38760e).setText(lVar.getString(R.string.weeklyGoalTrackedBody));
        ((RobertoTextView) a10.f38757b).setVisibility(4);
        RobertoTextView robertoTextView = (RobertoTextView) a10.f;
        robertoTextView.setOnClickListener(new dk.n(styledDialog, 27));
        robertoTextView.setText(lVar.getString(R.string.got_it));
        styledDialog.show();
        String str = gk.a.f16573a;
        gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_tracked_popup");
    }

    @Override // bm.b.c
    public final void b() {
        l lVar = this.f5351a;
        fm.a aVar = lVar.f5357w;
        if (aVar != null) {
            Intent putExtra = new Intent(lVar.requireActivity(), AddCustomGoalsActivity.class).putExtra("isFirestoreGoalsExperiment", true);
            kotlin.jvm.internal.i.f(putExtra, "Intent(requireActivity()…reGoalsExperiment\", true)");
            aVar.z(putExtra);
        }
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("subscription_status", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "custom_goal_add_goal_click");
    }

    @Override // bm.b.c
    public final void c(FirestoreGoal firestoreGoal) {
        fm.a aVar = this.f5351a.f5357w;
        if (aVar != null) {
            aVar.B(firestoreGoal, false, null);
        }
    }

    @Override // bm.b.c
    public final void d(FirestoreGoal firestoreGoal) {
        l lVar = this.f5351a;
        b.a aVar = new b.a(lVar.requireContext());
        aVar.setTitle("Are you sure you want to remove this goal?");
        aVar.b("Yes", new h(lVar, 0, firestoreGoal));
        aVar.a("Cancel", new yi.d(12));
        androidx.appcompat.app.b create = aVar.create();
        kotlin.jvm.internal.i.f(create, "builder.create()");
        create.show();
    }

    @Override // bm.b.c
    public final void e(FirestoreGoal firestoreGoal) {
        l lVar = this.f5351a;
        lVar.f5359y = firestoreGoal;
        lVar.f5360z.a(new Intent(lVar.requireContext(), TrackCustomGoalActivity.class).putExtra("goalName", firestoreGoal.getGoalName()));
    }

    @Override // bm.b.c
    public final void f() {
        l lVar = this.f5351a;
        fm.a aVar = lVar.f5357w;
        if (aVar != null) {
            androidx.fragment.app.p requireActivity = lVar.requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            Intent putExtra = tr.r.s(requireActivity, false).putExtra("source", "goals_custom_goal");
            kotlin.jvm.internal.i.f(putExtra, "SellingScreenSelectionUt…ce\", \"goals_custom_goal\")");
            ((androidx.lifecycle.w) aVar.J.getValue()).i(new SingleUseEvent(putExtra));
        }
        gk.a.b(null, "custom_goal_subscription_click");
    }

    @Override // bm.b.c
    public final void g(long j10, FirestoreGoal firestoreGoal) {
        WindowManager.LayoutParams layoutParams;
        l lVar = this.f5351a;
        lVar.getClass();
        try {
            long j11 = 1000;
            CharSequence format = DateFormat.format("EEEE", firestoreGoal.getScheduledDate().getTime() * j11);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(firestoreGoal.getScheduledDate().getTime() * j11);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j10);
            calendar2.set(11, calendar.get(11));
            calendar2.set(12, calendar.get(12));
            yp.d a10 = yp.d.a(lVar.getLayoutInflater());
            Object obj = a10.f;
            Object obj2 = a10.f38757b;
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_reschedule_goal, lVar.requireContext(), R.style.Theme_Dialog);
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
            ((RobertoTextView) a10.f38758c).setText(lVar.getString(R.string.weeklyGoalHeader, format));
            ((RobertoTextView) a10.f38760e).setText(lVar.getString(R.string.weeklyGoalBody, format));
            ((RobertoTextView) obj2).setText(lVar.getString(R.string.cancel));
            ((RobertoTextView) obj).setText(lVar.getString(R.string.weeklyGoalReschedule));
            ((RobertoTextView) obj).setOnClickListener(new tk.q(firestoreGoal, calendar2, lVar, styledDialog, 5));
            ((RobertoTextView) obj2).setOnClickListener(new dk.n(styledDialog, 26));
            styledDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(lVar.f5355u, e10);
        }
    }
}
