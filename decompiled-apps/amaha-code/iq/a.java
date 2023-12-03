package iq;

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
import com.theinnerhour.b2b.activity.CausesActivity;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: CausesSummaryFragment.java */
/* loaded from: classes2.dex */
public class a extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f20509u;

    /* renamed from: v  reason: collision with root package name */
    public HashSet<String> f20510v;

    /* renamed from: w  reason: collision with root package name */
    public String f20511w;

    /* renamed from: x  reason: collision with root package name */
    public int f20512x = 0;

    /* renamed from: y  reason: collision with root package name */
    public final HashMap f20513y = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    public final HashSet<String> f20514z = new HashSet<>();

    /* compiled from: CausesSummaryFragment.java */
    /* renamed from: iq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0311a implements View.OnClickListener {
        public View$OnClickListenerC0311a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((CausesActivity) a.this.getActivity()).t0();
        }
    }

    /* compiled from: CausesSummaryFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.getActivity().finish();
        }
    }

    public static void J(a aVar, String str, String str2, boolean z10) {
        HashMap hashMap = aVar.f20513y;
        try {
            GoalType goalType = (GoalType) hashMap.get(str);
            if (goalType != null) {
                Iterator<String> it = goalType.getLinkedGoals().iterator();
                while (it.hasNext()) {
                    GoalType goalType2 = (GoalType) hashMap.get(it.next());
                    if (goalType2 != null && goalType2.getType().equals(Constants.GOAL_TYPE_HABIT)) {
                        if (z10) {
                            FirebasePersistence.getInstance().addNewGoal(goalType2.getGoalId(), str2, true);
                        } else {
                            FirebasePersistence.getInstance().removeGoalById(goalType2.getGoalId(), str2);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sleep_cause, viewGroup, false);
        this.f20510v = ((CausesActivity) getActivity()).C;
        this.f20511w = defpackage.c.n();
        ((RobertoButton) inflate.findViewById(R.id.ll_submit)).setOnClickListener(new View$OnClickListenerC0311a());
        this.f20509u = (LinearLayout) inflate.findViewById(R.id.ll_goalsLinear);
        List<GoalType> goals = Constants.getGoals(this.f20511w);
        LayoutInflater layoutInflater2 = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        HashSet hashSet = new HashSet();
        for (GoalType goalType : goals) {
            this.f20513y.put(goalType.getGoalId(), goalType);
            if (this.f20510v.contains(goalType.getGoalId())) {
                hashSet.add(goalType.getGoalName());
                CardView cardView = (CardView) layoutInflater2.inflate(R.layout.row_enduring_result, (ViewGroup) null);
                RobertoTextView robertoTextView = (RobertoTextView) cardView.findViewById(R.id.goalText);
                TextView textView = (TextView) cardView.findViewById(R.id.tvDivider);
                robertoTextView.setText(goalType.getGoalName());
                Utils utils = Utils.INSTANCE;
                robertoTextView.setTextColor(utils.checkBuildBeforesetColor(R.color.colorDarkGrey, getActivity()));
                AppCompatImageView appCompatImageView = (AppCompatImageView) cardView.findViewById(R.id.goalArrow);
                if (this.f20514z.contains(goalType.getGoalId())) {
                    cardView.setCardBackgroundColor(utils.checkBuildBeforesetColor(R.color.seaSerpent, getActivity()));
                    robertoTextView.setTextColor(utils.checkBuildBeforesetColor(R.color.white, getActivity()));
                    appCompatImageView.setBackground(utils.checkBuildBeforesetDrawable(R.drawable.circle_hollow_white, getContext()));
                    appCompatImageView.setImageDrawable(utils.checkBuildBeforesetDrawable(R.drawable.ic_check_normal_light, getContext()));
                }
                cardView.setOnClickListener(new iq.b(this, goalType, robertoTextView, appCompatImageView));
                this.f20509u.addView(cardView);
            }
        }
        if (FirebasePersistence.getInstance().getCourseById(this.f20511w).getCourseName().equals(Constants.COURSE_SLEEP)) {
            hashSet.addAll(FirebasePersistence.getInstance().getUser().getSleep().getSleepSymptoms());
            FirebasePersistence.getInstance().getUser().getSleep().getSleepSymptoms().clear();
            FirebasePersistence.getInstance().getUser().getSleep().getSleepSymptoms().addAll(hashSet);
            FirebasePersistence.getInstance().updateUserOnFirebase();
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoTextView) view.findViewById(R.id.txtCauses)).setText("To bring about long-term improvement in your sleep, select up to two goals that you would like to work on, and we’ll help you track them.");
        ((RobertoTextView) view.findViewById(R.id.txt)).setText("You can always add other goals later.");
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
        HashSet hashSet = new HashSet(this.f20510v);
        hashSet.addAll(FirebasePersistence.getInstance().getUser().getSleep().getSleepCauses());
        FirebasePersistence.getInstance().getUser().getSleep().getSleepCauses().clear();
        FirebasePersistence.getInstance().getUser().getSleep().getSleepCauses().addAll(hashSet);
        FirebasePersistence.getInstance().updateUserOnFirebase();
    }
}
