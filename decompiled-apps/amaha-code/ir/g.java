package ir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ThoughtsConditionResultFragment.java */
/* loaded from: classes2.dex */
public class g extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f20603u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f20604v;

    /* renamed from: w  reason: collision with root package name */
    public RobertoTextView f20605w;

    /* compiled from: ThoughtsConditionResultFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((ThoughtsActivity) g.this.getActivity()).o0();
        }
    }

    /* compiled from: ThoughtsConditionResultFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g.this.getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_thoughts_condition_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        try {
            super.onViewCreated(view, bundle);
            ((LinearLayout) view).findViewById(R.id.ll_submit).setOnClickListener(new a());
            ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new b());
            this.f20603u = (RobertoTextView) view.findViewById(R.id.stmt);
            this.f20604v = (RobertoTextView) view.findViewById(R.id.distortion);
            this.f20605w = (RobertoTextView) view.findViewById(R.id.desc);
            this.f20603u.setText(ThoughtsActivity.C);
            if (ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                this.f20604v.setText("Mind Reading");
                this.f20605w.setText("The tendency to assume that others are thinking negatively about you, without any evidence to support this idea. \nExample: You slip up during a presentation and think, \"Everyone thinks I'm stupid now.\"");
            } else if (ThoughtsActivity.C.equals(Constants.THOUGHTS_FORTUNE_TELLING_TEXT)) {
                this.f20604v.setText("Fortune Telling");
                this.f20605w.setText("The tendency to predict a negative outcome without realistic consideration of the odds. \nExample: Around the time of your job appraisal, you think, \"I'll never get a raise this year.\"");
            } else if (ThoughtsActivity.C.equals(Constants.THOUGHTS_BLACK_AND_WHITE_THINKIING_TEXT)) {
                this.f20604v.setText("Black and White thinking");
                this.f20605w.setText("The tendency to see things as extremes and fit them into one of the two categories - either black or white. \nExample: When you do not win a race, you think, \"I am a complete loser.\"");
            } else if (ThoughtsActivity.C.equals(Constants.THOUGHTS_EMOTIONAL_REASONING_TEXT)) {
                this.f20604v.setText("Emotional Reasoning");
                this.f20605w.setText("The tendency to assume that your negative emotions reflect your reality. \nExample: You're feeling anxious about a meeting, and you think, \"This means the meeting will go badly.\"");
            } else {
                if (!ThoughtsActivity.C.equals("Things are always much worse for me than they might seem.") && !ThoughtsActivity.C.equals("Things are always much worse for me than they might seem.")) {
                    if (!ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.") && !ThoughtsActivity.C.equals("I have clear rules for how things should be and I stick to them.")) {
                        if (ThoughtsActivity.C.equals(Constants.THOUGHTS_OVERGENERALISATION_TEXT)) {
                            this.f20604v.setText("Overgeneralisation");
                            this.f20605w.setText("The tendency to draw a broad conclusion based on a single negative instance.\nExample: The book you want to buy is sold out, and you think, \"This always happens to me. I never get what I want!\"");
                        } else if (ThoughtsActivity.C.equals(Constants.THOUGHTS_DISCOUNTING_THE_POSITIVE_TEXT)) {
                            this.f20604v.setText("Discounting the Positive");
                            this.f20605w.setText("The tendency to reject positive experiences, believing that they are not significant enough to be considered.\nExample: Your friends compliment you, and you think, \"They are just being nice. They don't really mean it.\"");
                        } else if (ThoughtsActivity.C.equals(Constants.THOUGHTS_PERSONALISATION_TEXT)) {
                            this.f20604v.setText("Personalisation");
                            this.f20605w.setText("The tendency to hold yourself accountable for something that you cannot entirely control.\nExample: Your child gets hurt at school, and you think, \"If only I had been a better parent, this would not have happened.\"");
                        } else {
                            if (!ThoughtsActivity.C.equals("I usually blame situations and people for my problems.") && !ThoughtsActivity.C.equals("I usually blame situations and people for my problems.")) {
                                if (!ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.") && !ThoughtsActivity.C.equals("I can usually tell what someone is thinking about me.")) {
                                    if (ThoughtsActivity.C.equals(Constants.THOUGHTS_ANGER_LABELLING_TEXT)) {
                                        this.f20604v.setText("Labelling");
                                        this.f20605w.setText("The tendecy to attach a negative label to yourself or others when something undesirable happens. \nExample: When you fail on a test, you think, \"I'm a loser.\"");
                                    }
                                }
                                this.f20604v.setText("Mind Reading");
                                this.f20605w.setText("The tendency to assume that others are thinking negatively about you, without any evidence to support this idea. \nExample: You slip up during a presentation and think, \"Everyone thinks I'm stupid now.\"");
                            }
                            this.f20604v.setText("Blaming");
                            this.f20605w.setText("The tendency to hold other people responsible for a situation, and overlook your own mistakes or shortcomings.\nExample: You have an argument with a friend and you think, \"This is all their fault. They are unreasonable.\"");
                        }
                    }
                    this.f20604v.setText("Should's and Must's");
                    this.f20605w.setText("The tendency to expect that things should/must happen a certain way.\nExample: You feel upset after a disagreement with a friend because you think, \"She should have understood me.\"");
                }
                this.f20604v.setText("Catastrophisation");
                this.f20605w.setText("The tendency to assume that the worst possible outcome will occur and that it will be terrible.\nExample: Before an interview, you think, \"I won't be selected, I will never have a job and I will be a failure all my life.\"");
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }
}
