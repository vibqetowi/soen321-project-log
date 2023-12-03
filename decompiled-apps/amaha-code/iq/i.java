package iq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.CausesActivity;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashSet;
import java.util.List;
/* compiled from: LifestyleCauseFragment.java */
/* loaded from: classes2.dex */
public class i extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f20544u;

    /* renamed from: v  reason: collision with root package name */
    public HashSet<String> f20545v;

    /* compiled from: LifestyleCauseFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((CausesActivity) i.this.getActivity()).t0();
        }
    }

    /* compiled from: LifestyleCauseFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            i.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sleep_cause, viewGroup, false);
        this.f20545v = ((CausesActivity) getActivity()).C;
        ((RobertoButton) inflate.findViewById(R.id.ll_submit)).setOnClickListener(new a());
        this.f20544u = (LinearLayout) inflate.findViewById(R.id.ll_goalsLinear);
        List<GoalType> goals = Constants.getGoals(FirebasePersistence.getInstance().getUser().getCurrentCourse(), true, Constants.GOAL_TYPE_CAUSES, Constants.GOAL_SUB_TYPE_LIFESTYLE);
        LayoutInflater layoutInflater2 = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        for (GoalType goalType : goals) {
            CardView cardView = (CardView) layoutInflater2.inflate(R.layout.row_text_tick, (ViewGroup) null);
            TextView textView = (TextView) cardView.findViewById(R.id.tvDivider);
            ((RobertoTextView) cardView.findViewById(R.id.goalText)).setText(goalType.getGoalName());
            ImageView imageView = (ImageView) cardView.findViewById(R.id.goalsCheck);
            if (this.f20545v.contains(goalType.getGoalId())) {
                imageView.setBackground(getContext().getResources().getDrawable(R.drawable.concentric_circle_green));
                textView.setVisibility(0);
            }
            cardView.setOnClickListener(new j(this, goalType, imageView, textView));
            this.f20544u.addView(cardView);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoTextView) view.findViewById(R.id.txtCount)).setText("1/3");
        ((RobertoTextView) view.findViewById(R.id.txtCauses)).setText("Your Lifestyle");
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
    }
}
