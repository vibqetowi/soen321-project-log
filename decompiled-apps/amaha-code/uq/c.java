package uq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.EnduringActivity;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashSet;
import java.util.List;
/* compiled from: EnduringResultFragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f34459u;

    /* renamed from: v  reason: collision with root package name */
    public HashSet<String> f34460v;

    /* renamed from: w  reason: collision with root package name */
    public String f34461w;

    /* renamed from: x  reason: collision with root package name */
    public int f34462x = 0;

    /* renamed from: y  reason: collision with root package name */
    public final HashSet<String> f34463y = new HashSet<>();

    /* compiled from: EnduringResultFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((EnduringActivity) c.this.getActivity()).t0();
        }
    }

    /* compiled from: EnduringResultFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_enduring, viewGroup, false);
        this.f34460v = ((EnduringActivity) getActivity()).A;
        this.f34461w = defpackage.c.n();
        ((RobertoButton) inflate.findViewById(R.id.ll_submit)).setOnClickListener(new a());
        this.f34459u = (LinearLayout) inflate.findViewById(R.id.ll_goalsLinear);
        List<GoalType> goals = Constants.getGoals(this.f34461w);
        LayoutInflater layoutInflater2 = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        for (GoalType goalType : goals) {
            if (this.f34460v.contains(goalType.getGoalId())) {
                CardView cardView = (CardView) layoutInflater2.inflate(R.layout.row_enduring_result, (ViewGroup) null);
                RobertoTextView robertoTextView = (RobertoTextView) cardView.findViewById(R.id.goalText);
                TextView textView = (TextView) cardView.findViewById(R.id.tvDivider);
                robertoTextView.setText(goalType.getGoalName());
                Utils utils = Utils.INSTANCE;
                robertoTextView.setTextColor(utils.checkBuildBeforesetColor(R.color.colorDarkGrey, getActivity()));
                AppCompatImageView appCompatImageView = (AppCompatImageView) cardView.findViewById(R.id.goalArrow);
                if (this.f34463y.contains(goalType.getGoalId())) {
                    cardView.setCardBackgroundColor(utils.checkBuildBeforesetColor(R.color.seaSerpent, getActivity()));
                    robertoTextView.setTextColor(utils.checkBuildBeforesetColor(R.color.white, getActivity()));
                    appCompatImageView.setBackground(utils.checkBuildBeforesetDrawable(R.drawable.circle_hollow_white, getContext()));
                    appCompatImageView.setImageDrawable(utils.checkBuildBeforesetDrawable(R.drawable.ic_check_normal_light, getContext()));
                }
                cardView.setOnClickListener(new d(this, goalType, robertoTextView, appCompatImageView));
                this.f34459u.addView(cardView);
            }
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoTextView) view.findViewById(R.id.header)).setText("Now, select any two habits you want to start working on first.");
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
    }
}
