package er;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
/* compiled from: SleepGoalFragment.java */
/* loaded from: classes2.dex */
public class j extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public boolean f14505u = false;

    /* renamed from: v  reason: collision with root package name */
    public GoalType f14506v = null;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f14507w;

    /* renamed from: x  reason: collision with root package name */
    public RobertoTextView f14508x;

    /* renamed from: y  reason: collision with root package name */
    public RobertoTextView f14509y;

    /* compiled from: SleepGoalFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SleepTimeTableActivity) j.this.getActivity()).t0();
        }
    }

    /* compiled from: SleepGoalFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            j.this.getActivity().finish();
        }
    }

    /* compiled from: SleepGoalFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f14512u;

        public c(String str) {
            this.f14512u = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            j jVar = j.this;
            if (jVar.f14506v != null) {
                RobertoButton robertoButton = (RobertoButton) view;
                boolean z10 = jVar.f14505u;
                String str = this.f14512u;
                if (!z10) {
                    jVar.f14505u = true;
                    Toast.makeText(jVar.getActivity(), "Added to goals", 0).show();
                    FirebasePersistence.getInstance().addNewGoal(jVar.f14506v.getGoalId(), str, true);
                    robertoButton.setText("Remove from Goals");
                } else {
                    jVar.f14505u = false;
                    Toast.makeText(jVar.getActivity(), "Removed from goals", 0).show();
                    FirebasePersistence.getInstance().removeGoalById(jVar.f14506v.getGoalId(), str);
                    robertoButton.setText("Add this Goal");
                }
            }
            ((SleepTimeTableActivity) jVar.getActivity()).t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int parseInt;
        View inflate = layoutInflater.inflate(R.layout.fragment_sleep_goal, viewGroup, false);
        RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.idealSleep);
        this.f14507w = (RobertoTextView) inflate.findViewById(R.id.currentSleep);
        this.f14508x = (RobertoTextView) inflate.findViewById(R.id.timeSleep);
        this.f14509y = (RobertoTextView) inflate.findViewById(R.id.wakeTime);
        ((RobertoButton) inflate.findViewById(R.id.tap)).setOnClickListener(new a());
        ((ImageView) inflate.findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
        List<GoalType> goals = Constants.getGoals(FirebasePersistence.getInstance().getUser().getCurrentCourse(), true, Constants.GOAL_TYPE_HABIT, Constants.GOAL_SUB_TYPE_TIME_TABLE_MAIN);
        String n10 = defpackage.c.n();
        if (goals.size() > 0) {
            this.f14506v = goals.get(0);
            for (Goal goal : FirebasePersistence.getInstance().getUserGoals(n10)) {
                if (goal.getGoalId().equals(this.f14506v.getGoalId()) && goal.getCourseId().equals(n10) && goal.isVisible()) {
                    this.f14505u = true;
                }
            }
        }
        try {
            String sleepTime = FirebasePersistence.getInstance().getUser().getSleep().getSleepTime();
            String[] split = sleepTime.split(":");
            String wakeUpTime = FirebasePersistence.getInstance().getUser().getSleep().getWakeUpTime();
            String[] split2 = wakeUpTime.split(":");
            if (Integer.parseInt(split2[0]) >= Integer.parseInt(split[0])) {
                parseInt = Integer.parseInt(split2[0]) - Integer.parseInt(split[0]);
            } else {
                parseInt = Integer.parseInt(split2[0]) + (24 - Integer.parseInt(split[0]));
            }
            RobertoTextView robertoTextView2 = this.f14507w;
            robertoTextView2.setText(String.valueOf(parseInt) + " Hours");
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                this.f14508x.setText(new SimpleDateFormat("hh:mm a").format(simpleDateFormat.parse(sleepTime)));
                this.f14509y.setText(new SimpleDateFormat("hh:mm a").format(simpleDateFormat.parse(wakeUpTime)));
            } catch (ParseException e10) {
                LogHelper.INSTANCE.e(e10);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e("sleepgoalfragment", "exception in update sleept goal time", e11);
        }
        RobertoButton robertoButton = (RobertoButton) inflate.findViewById(R.id.sleepGoalBtn);
        if (this.f14505u) {
            robertoButton.setText("Remove from Goals");
        } else {
            robertoButton.setText("Add this Goal");
        }
        robertoButton.setOnClickListener(new c(n10));
        Bundle bundle2 = new Bundle();
        defpackage.b.s(bundle2, "course", bundle2, "sleep_goal_view");
        return inflate;
    }
}
