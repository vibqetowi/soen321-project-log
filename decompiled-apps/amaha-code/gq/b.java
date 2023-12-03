package gq;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.ActivityScheduling;
import com.theinnerhour.b2b.activity.EnduringActivity;
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.activity.ThoughtsActivity;
import com.theinnerhour.b2b.adapter.GoalsAssessmentActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: GoalsAssessmentIntroFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: u  reason: collision with root package name */
    public final String f16683u = LogHelper.INSTANCE.makeLogTag(getClass());

    /* renamed from: v  reason: collision with root package name */
    public String f16684v = Constants.SCREEN_ENDURING_ASSESSMENT;

    /* renamed from: w  reason: collision with root package name */
    public boolean f16685w = false;

    /* renamed from: x  reason: collision with root package name */
    public Course f16686x;

    /* compiled from: GoalsAssessmentIntroFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.getActivity().finish();
        }
    }

    /* compiled from: GoalsAssessmentIntroFragment.java */
    /* renamed from: gq.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0256b implements View.OnClickListener {
        public View$OnClickListenerC0256b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b bVar = b.this;
            if (bVar.f16684v.equals(Constants.SCREEN_ENDURING_ASSESSMENT)) {
                if (bVar.f16685w) {
                    ((GoalsAssessmentActivity) bVar.getActivity()).t0();
                    return;
                }
                Intent intent = new Intent(bVar.getActivity(), EnduringActivity.class);
                intent.setFlags(33554432);
                bVar.startActivity(intent);
                bVar.getActivity().finish();
            } else if (bVar.f16684v.equals(Constants.SCREEN_THOUGHTS_ASSESSMENT)) {
                if (bVar.f16685w) {
                    ((GoalsAssessmentActivity) bVar.getActivity()).t0();
                    return;
                }
                Intent intent2 = new Intent(bVar.getActivity(), ThoughtsActivity.class);
                intent2.setFlags(33554432);
                bVar.startActivity(intent2);
                bVar.getActivity().finish();
            } else if (bVar.f16684v.equals(Constants.SCREEN_REASSESSMENT_1)) {
                if (bVar.f16686x.getCourseName().equals(Constants.COURSE_SLEEP)) {
                    if (bVar.f16685w) {
                        ((GoalsAssessmentActivity) bVar.getActivity()).t0();
                        return;
                    }
                    Intent intent3 = new Intent(bVar.getActivity(), SleepTimeTableActivity.class);
                    intent3.setFlags(33554432);
                    bVar.startActivity(intent3);
                    bVar.getActivity().finish();
                } else if (bVar.f16686x.getCourseName().equals(Constants.COURSE_DEPRESSION) || bVar.f16686x.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                    if (bVar.f16685w) {
                        ((GoalsAssessmentActivity) bVar.getActivity()).t0();
                        return;
                    }
                    Intent intent4 = new Intent(bVar.getActivity(), ActivityScheduling.class);
                    intent4.setFlags(33554432);
                    bVar.startActivity(intent4);
                    bVar.getActivity().finish();
                }
            } else if (bVar.f16684v.equals(Constants.SCREEN_REASSESSMENT_2)) {
                if (bVar.f16686x.getCourseName().equals(Constants.COURSE_SLEEP)) {
                    if (bVar.f16685w) {
                        ((GoalsAssessmentActivity) bVar.getActivity()).t0();
                        return;
                    }
                    Intent intent5 = new Intent(bVar.getActivity(), EnduringActivity.class);
                    intent5.setFlags(33554432);
                    bVar.startActivity(intent5);
                    bVar.getActivity().finish();
                } else if (bVar.f16686x.getCourseName().equals(Constants.COURSE_DEPRESSION) || bVar.f16686x.getCourseName().equals(Constants.COURSE_HAPPINESS) || bVar.f16686x.getCourseName().equals(Constants.COURSE_WORRY) || bVar.f16686x.getCourseName().equals(Constants.COURSE_ANGER)) {
                    if (bVar.f16685w) {
                        ((GoalsAssessmentActivity) bVar.getActivity()).t0();
                        return;
                    }
                    Intent intent6 = new Intent(bVar.getActivity(), EnduringActivity.class);
                    intent6.setFlags(33554432);
                    bVar.startActivity(intent6);
                    bVar.getActivity().finish();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_goals_assessment_intro, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        try {
            ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new a());
            UiUtils.Companion.increaseImageClickArea((ImageView) view.findViewById(R.id.header_arrow_back));
            String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            this.f16686x = FirebasePersistence.getInstance().getCourseById(currentCourse);
            List<Goal> userGoals = FirebasePersistence.getInstance().getUserGoals(currentCourse);
            HashMap<String, GoalType> goalsHashMap = Constants.getGoalsHashMap(currentCourse);
            String string = getActivity().getIntent().getExtras().getString(Constants.API_COURSE_LINK, Constants.SCREEN_ENDURING_ASSESSMENT);
            this.f16684v = string;
            if (string.equals(Constants.SCREEN_ENDURING_ASSESSMENT)) {
                Iterator<Goal> it = userGoals.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Goal next = it.next();
                    GoalType goalType = goalsHashMap.get(next.getGoalId());
                    if (goalType != null && (goalType.getType().equals(Constants.GOAL_TYPE_HABIT) || goalType.getType().equals("physical_activity") || goalType.getType().equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY))) {
                        if (next.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                }
                ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                if (!this.f16685w) {
                    ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time to know more about Your Happiness Goals!");
                } else {
                    ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on goals that prepare you to better deal with stressful situations. Answer the following questions to help us learn more about you and customise your plan.");
                }
            } else if (this.f16684v.equals(Constants.SCREEN_THOUGHTS_ASSESSMENT)) {
                if (this.f16686x.getCourseName().equals(Constants.COURSE_STRESS)) {
                    Iterator<Goal> it2 = userGoals.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Goal next2 = it2.next();
                        GoalType goalType2 = goalsHashMap.get(next2.getGoalId());
                        if (goalType2 != null && goalType2.getType().equals(Constants.GOAL_TYPE_THOUGHT) && next2.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time to learn more about Positive Thinking!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on your negative thinking patterns. Answer these questions to help us learn more about you and customise your plan.");
                    }
                } else if (this.f16686x.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                    Iterator<Goal> it3 = userGoals.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Goal next3 = it3.next();
                        GoalType goalType3 = goalsHashMap.get(next3.getGoalId());
                        if (goalType3 != null && goalType3.getType().equals(Constants.GOAL_TYPE_THOUGHT) && next3.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time learn more about Postive Thinking!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on your negative thinking patterns. Answer these questions to help us learn more about you and customise your plan.");
                    }
                } else if (this.f16686x.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                    Iterator<Goal> it4 = userGoals.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Goal next4 = it4.next();
                        GoalType goalType4 = goalsHashMap.get(next4.getGoalId());
                        if (goalType4 != null && goalType4.getType().equals(Constants.GOAL_TYPE_THOUGHT) && next4.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time learn more about Postive Thinking!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on your negative thinking patterns. Answer these questions to help us learn more about you and customise your plan.");
                    }
                } else if (this.f16686x.getCourseName().equals(Constants.COURSE_WORRY)) {
                    Iterator<Goal> it5 = userGoals.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        Goal next5 = it5.next();
                        GoalType goalType5 = goalsHashMap.get(next5.getGoalId());
                        if (goalType5 != null && goalType5.getType().equals(Constants.GOAL_TYPE_THOUGHT) && next5.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time learn more about Postive Thinking!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on your negative thinking patterns. Answer these questions to help us learn more about you and customise your plan.");
                    }
                } else if (this.f16686x.getCourseName().equals(Constants.COURSE_ANGER)) {
                    Iterator<Goal> it6 = userGoals.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        Goal next6 = it6.next();
                        GoalType goalType6 = goalsHashMap.get(next6.getGoalId());
                        if (goalType6 != null && goalType6.getType().equals(Constants.GOAL_TYPE_THOUGHT) && next6.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time learn more about Postive Thinking!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on your negative thinking patterns. Answer these questions to help us learn more about you and customise your plan.");
                    }
                }
            } else if (this.f16684v.equals(Constants.SCREEN_REASSESSMENT_1)) {
                if (this.f16686x.getCourseName().equals(Constants.COURSE_SLEEP)) {
                    Iterator<Goal> it7 = userGoals.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        Goal next7 = it7.next();
                        GoalType goalType7 = goalsHashMap.get(next7.getGoalId());
                        if (goalType7 != null && goalType7.getType().equals(Constants.GOAL_TYPE_HABIT) && goalType7.getSubtype().contains(Constants.GOAL_SUB_TYPE_TIME_TABLE) && next7.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time to know more about how the activities you engage in before bedtime affect your sleep.");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days on improving your sleep by working on your sleep goals. Answer the following questions to help us learn more about you and customise your plan.");
                    }
                } else if (this.f16686x.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                    Iterator<Goal> it8 = userGoals.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Goal next8 = it8.next();
                        if (next8.getType().equals("activity_scheduling") && next8.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time to know more about Your Happiness Tasks!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days practising activities that contribute to your well-being and improve your mood. Answer these questions to help us learn more about you and customise your plan.");
                    }
                } else if (this.f16686x.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                    Iterator<Goal> it9 = userGoals.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            break;
                        }
                        Goal next9 = it9.next();
                        if (next9.getType().equals("activity_scheduling") && next9.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time to know more about Your Happiness Tasks!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days practising activities that contribute to your well-being and make you happier. Answer these questions to help us learn more about you and customise your plan.");
                    }
                }
            } else if (this.f16684v.equals(Constants.SCREEN_REASSESSMENT_2)) {
                if (this.f16686x.getCourseName().equals(Constants.COURSE_SLEEP)) {
                    Iterator<Goal> it10 = userGoals.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            break;
                        }
                        Goal next10 = it10.next();
                        GoalType goalType8 = goalsHashMap.get(next10.getGoalId());
                        if (goalType8 != null && (goalType8.getType().equals(Constants.GOAL_TYPE_HABIT) || goalType8.getType().equals("physical_activity") || goalType8.getType().equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY))) {
                            if (next10.isVisible()) {
                                this.f16685w = true;
                                break;
                            }
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time to know more about the different factors that contribute to poor sleep.");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on the various factors that hamper your sleep. Answer the following questions to help us learn more about how you are doing, so that we can further customise your plan.");
                    }
                } else if (this.f16686x.getCourseName().equals(Constants.COURSE_DEPRESSION)) {
                    Iterator<Goal> it11 = userGoals.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            break;
                        }
                        Goal next11 = it11.next();
                        GoalType goalType9 = goalsHashMap.get(next11.getGoalId());
                        if (goalType9 != null && (goalType9.getType().equals(Constants.GOAL_TYPE_HABIT) || goalType9.getType().equals("physical_activity") || goalType9.getType().equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY))) {
                            if (next11.isVisible()) {
                                this.f16685w = true;
                                break;
                            }
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time to know more about Your Happiness Goals!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on behaviours that prepare you to deal with negative life circumstances, and to better manage your mood. Answer these questions to help us learn more about you and customise your plan.");
                    }
                } else if (this.f16686x.getCourseName().equals(Constants.COURSE_HAPPINESS)) {
                    Iterator<Goal> it12 = userGoals.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            break;
                        }
                        Goal next12 = it12.next();
                        GoalType goalType10 = goalsHashMap.get(next12.getGoalId());
                        if (goalType10 != null && (goalType10.getType().equals(Constants.GOAL_TYPE_HABIT) || goalType10.getType().equals("physical_activity") || goalType10.getType().equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY))) {
                            if (next12.isVisible()) {
                                this.f16685w = true;
                                break;
                            }
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time to know more about Your Happiness Goals!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on behaviours that make you happier. Answer these questions to help us learn more about you and customise your plan.");
                    }
                } else if (this.f16686x.getCourseName().equals(Constants.COURSE_WORRY)) {
                    Iterator<Goal> it13 = userGoals.iterator();
                    while (true) {
                        if (!it13.hasNext()) {
                            break;
                        }
                        Goal next13 = it13.next();
                        if (next13.getType().equals(Constants.GOAL_TYPE_HABIT) && next13.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time to know more about Your Happiness Tasks!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on behaviours that prepare you to deal with your worry better and in turn feel happier. Answer these questions to help us learn more about you and customise your plan.");
                    }
                } else if (this.f16686x.getCourseName().equals(Constants.COURSE_ANGER)) {
                    Iterator<Goal> it14 = userGoals.iterator();
                    while (true) {
                        if (!it14.hasNext()) {
                            break;
                        }
                        Goal next14 = it14.next();
                        if (next14.getType().equals(Constants.GOAL_TYPE_HABIT) && next14.isVisible()) {
                            this.f16685w = true;
                            break;
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.header)).setText("Let's Assess Your Progress");
                    if (!this.f16685w) {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have not added any goals.\nNow is a good time to know more about Your Happiness Tasks!");
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.desc)).setText("You have spent the last few days working on behaviours that prepare you to manage your anger. Answer these questions to help us learn more about you and further customise your plan.");
                    }
                }
            }
            ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View$OnClickListenerC0256b());
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f16683u, "exception", e10);
        }
    }
}
