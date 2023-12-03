package ir;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ThoughtAddGoalFragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b {

    /* compiled from: ThoughtAddGoalFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* compiled from: ThoughtAddGoalFragment.java */
        /* renamed from: ir.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0313a implements Runnable {
            public RunnableC0313a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((ThoughtsActivity) c.this.getActivity()).o0();
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String n10 = defpackage.c.n();
            if (!ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.") && !ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.") && !ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                if (ThoughtsActivity.C.equals(Constants.THOUGHTS_FORTUNE_TELLING_TEXT)) {
                    FirebasePersistence.getInstance().addNewGoal(Constants.THOUGHT_GOAL_ID_FORTUNE_TELLING, n10, true);
                } else if (ThoughtsActivity.C.equals(Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT)) {
                    FirebasePersistence.getInstance().addNewGoal(Constants.THOUGHT_GOAL_ID_BLACK_AND_WHITE_THINKIING, n10, true);
                } else if (ThoughtsActivity.C.equals(Constants.THOUGHTS_EMOTIONAL_REASONING_TEXT)) {
                    FirebasePersistence.getInstance().addNewGoal(Constants.THOUGHT_GOAL_ID_EMOTIONAL_REASONING, n10, true);
                } else if (!ThoughtsActivity.C.equals("Things are always much worse for me than they might seem.") && !ThoughtsActivity.C.equals("Things are always much worse for me than they might seem.")) {
                    if (!ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.") && !ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                        if (ThoughtsActivity.C.equals(Constants.THOUGHTS_OVERGENERALISATION_TEXT)) {
                            FirebasePersistence.getInstance().addNewGoal("overgeneralisation", n10, true);
                        } else if (ThoughtsActivity.C.equals(Constants.THOUGHTS_DISCOUNTING_THE_POSITIVE_TEXT)) {
                            FirebasePersistence.getInstance().addNewGoal("discounting-the-positive", n10, true);
                        } else if (ThoughtsActivity.C.equals(Constants.THOUGHTS_PERSONALISATION_TEXT)) {
                            FirebasePersistence.getInstance().addNewGoal("personalisation", n10, true);
                        } else if (!ThoughtsActivity.C.equals("I usually blame situations and people for my problems.") && !ThoughtsActivity.C.equals("I usually blame situations and people for my problems.")) {
                            if (ThoughtsActivity.C.equals(Constants.THOUGHTS_ANGER_LABELLING_TEXT)) {
                                FirebasePersistence.getInstance().addNewGoal(Constants.THOUGHT_GOAL_ID_LABELLING, n10, true);
                            }
                        } else {
                            FirebasePersistence.getInstance().addNewGoal("blaming", n10, true);
                        }
                    } else {
                        FirebasePersistence.getInstance().addNewGoal(Constants.THOUGHT_GOAL_ID_SHOULD_AND_MUST, n10, true);
                    }
                } else {
                    FirebasePersistence.getInstance().addNewGoal(Constants.THOUGHT_GOAL_ID_CATASTROPHISATION, n10, true);
                }
            } else {
                FirebasePersistence.getInstance().addNewGoal(Constants.THOUGHT_GOAL_ID_MIND_READING, n10, true);
            }
            Toast.makeText(c.this.getActivity(), "Added to goals", 0).show();
            new Handler().postDelayed(new RunnableC0313a(), 200L);
        }
    }

    /* compiled from: ThoughtAddGoalFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {

        /* compiled from: ThoughtAddGoalFragment.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((ThoughtsActivity) c.this.getActivity()).o0();
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            new Handler().postDelayed(new a(), 200L);
        }
    }

    /* compiled from: ThoughtAddGoalFragment.java */
    /* renamed from: ir.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0314c implements View.OnClickListener {
        public View$OnClickListenerC0314c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.activity_yes_no_assessment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoTextView) view.findViewById(R.id.ques)).setText("Do you want to track this thinking pattern?");
        ((RobertoButton) view.findViewById(R.id.ll_right)).setOnClickListener(new a());
        ((RobertoButton) view.findViewById(R.id.ll_wrong)).setOnClickListener(new b());
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new View$OnClickListenerC0314c());
        Bundle bundle2 = new Bundle();
        defpackage.b.s(bundle2, "course", bundle2, "thoughts_add_goal_view");
    }
}
