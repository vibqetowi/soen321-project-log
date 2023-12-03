package er;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: SleepGoalsResultFragment.java */
/* loaded from: classes2.dex */
public class k extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f14514u;

    /* renamed from: v  reason: collision with root package name */
    public HashMap<String, Boolean> f14515v;

    /* renamed from: x  reason: collision with root package name */
    public String f14517x;

    /* renamed from: w  reason: collision with root package name */
    public final HashSet<String> f14516w = new HashSet<>();

    /* renamed from: y  reason: collision with root package name */
    public int f14518y = 0;

    /* compiled from: SleepGoalsResultFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((SleepTimeTableActivity) k.this.getActivity()).t0();
        }
    }

    /* compiled from: SleepGoalsResultFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_enduring, viewGroup, false);
        this.f14515v = ((SleepTimeTableActivity) getActivity()).A;
        this.f14517x = defpackage.c.n();
        ((RobertoButton) inflate.findViewById(R.id.ll_submit)).setOnClickListener(new a());
        this.f14514u = (LinearLayout) inflate.findViewById(R.id.ll_goalsLinear);
        List<GoalType> goals = Constants.getGoals(FirebasePersistence.getInstance().getUser().getCurrentCourse(), true, Constants.GOAL_TYPE_HABIT, Constants.GOAL_SUB_TYPE_TIME_TABLE);
        LayoutInflater layoutInflater2 = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        for (GoalType goalType : goals) {
            if (this.f14515v.containsKey(goalType.getGoalId()) && this.f14515v.get(goalType.getGoalId()).booleanValue()) {
                ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater2.inflate(R.layout.row_enduring_result_v1, (ViewGroup) null);
                ((RobertoTextView) constraintLayout.findViewById(R.id.goalText)).setText(goalType.getGoalName());
                CheckBox checkBox = (CheckBox) constraintLayout.findViewById(R.id.checkbox);
                if (this.f14516w.contains(goalType.getGoalId())) {
                    checkBox.setChecked(true);
                }
                constraintLayout.setOnClickListener(new l(this, goalType, checkBox));
                this.f14514u.addView(constraintLayout);
                checkBox.setEnabled(false);
            }
        }
        if (this.f14514u.getChildCount() < 1) {
            ((SleepTimeTableActivity) getActivity()).t0();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoTextView) view.findViewById(R.id.header)).setText("Select up to two goals you’d like to work on first and we’ll help you track them.\n(You can always add more goals later)");
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
        UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
    }
}
