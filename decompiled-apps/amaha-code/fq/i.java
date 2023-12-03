package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticPopUpFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/i;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15723w = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f15724u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15725v = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15725v;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_pop_up, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15725v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.h

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ i f15718v;

            {
                this.f15718v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                i this$0 = this.f15718v;
                switch (i6) {
                    case 0:
                        int i10 = i.f15723w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity = this$0.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                            return;
                        }
                        return;
                    default:
                        int i11 = i.f15723w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        if (activity2 != null) {
                            activity2.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.h

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ i f15718v;

            {
                this.f15718v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                i this$0 = this.f15718v;
                switch (i6) {
                    case 0:
                        int i10 = i.f15723w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity = this$0.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                            return;
                        }
                        return;
                    default:
                        int i11 = i.f15723w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        if (activity2 != null) {
                            activity2.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        String stringExtra = activity.getIntent().getStringExtra(Constants.API_COURSE_LINK);
        ArrayList arrayList = new ArrayList();
        if (kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T2A)) {
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            kotlin.jvm.internal.i.f(arguments.getString(Constants.TEMPLATE_TITLE_KEY, ""), "arguments!!.getString(Co…ts.TEMPLATE_TITLE_KEY,\"\")");
        }
        if (kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.d(arguments2);
            this.f15724u = arguments2.getInt(Constants.DAYMODEL_POSITION);
        }
        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at your happy place", arrayList, "When you experience stress, your body releases hormones to cope with the situation.", "These hormones can put your body in a state of alert, making you feel restless and tired.");
            defpackage.c.B(arrayList, "With the power of positive visualisation, you can disengage from stressful thoughts.", "Imagining a happy place can take you away from your stress and can build positivity.", "As a result, you are likely to feel more peaceful, relaxed, and in control.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at your safe space", arrayList, "Negative thoughts about the past or future can keep your mind active and restless.", "This might make it hard for you to fall asleep, as you might feel tense or upset.");
            defpackage.d.p(arrayList, "Through positive visualisation, you can give your mind a calming picture to focus on.", "This can enable you to take a mental break from your thoughts.", "Thinking of a safe space can also make you feel positive, relaxed, and happy.", "As a result, once you are done with this activity, you can fall asleep more quickly.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at your peaceful place", arrayList, "Worry can be an overwhelming and tiring experience.", "It can shift your attention to the negatives, making you irritable and tense.");
            defpackage.d.p(arrayList, "Imagining a peaceful place is a form of positive visualisation.", "Such positive visualisation can help you disengage from your worry.", "In fact, studies show that this technique can reduce stress hormones in your body.", "It can also help you experience positive emotions, like happiness, calm, and hope.");
            arrayList.add("Ultimately, with this exercise, you can feel better - physically and mentally.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at your peaceful place", arrayList, "Anger can affect you physically, by creating tension in your body.", "It can also lead you to ruminate or repeatedly think angry thoughts.");
            defpackage.d.p(arrayList, "Imagining a peaceful place is a form of positive visualisation.", "Such visualisation can lower arousal in your body - thus making you relaxed.", "It can also help you disconnect from negative and angry thoughts.", "This technique can help you think more clearly and respond calmly to a situation.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at time outs", arrayList, "When you feel low or sad, you might sometimes struggle to take steps to feel better.", "Staying in this state can further worsen your mood and intensify your sadness.");
            defpackage.d.p(arrayList, "When this happens, your commitments of everyday life can feel like a burden.", "Taking a short break is a good way to recharge and refuel yourself.", "It can give you a more balanced view on a situation that might be bothering you.", "Even 5 minutes can give you the chance to do something refreshing and energising.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at time outs", arrayList, "Anger is an intense and overwhelming emotion that can have negative consequences.", "In a heated moment, you might struggle to take a step back and think clearly.");
            defpackage.d.p(arrayList, "Taking a time out can allow you to disconnect from this intense emotion.", "By engaging in a calming or distracting activity, you can let yourself cool down.", "In fact, a time out can also give you a chance to think about the situation clearly.", "Instead of reacting rashly, time outs can empower you to respond in a healthy way.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at positive affirmations", arrayList, "When stress levels rise, you might feel incapable of managing a difficult situation.", "As a result, you might think negatively about yourself and also doubt your abilities.");
            defpackage.d.p(arrayList, "Such thoughts can further increase you stress and make you feel upset.", "Affirmations can break this negative chain by helping you focus on your positives.", "Repeating positive statements can make you believe in yourself and can energise you.", "Ultimately, this technique can make you feel ready to face life's challenges.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at positive affirmations", arrayList, "On difficult days, negative and distressing thoughts can play on your mind.", "Such thoughts might be hard to let go of, and can interfere with your sleep.");
            defpackage.d.p(arrayList, "An effective way to combat these thoughts is to override them with positive ones.", "With affimations, you can change how you talk to yourself and feel more in control.", "Repeating affirmations can instill a sense of calm and peace in your body and mind.", "By making you experience positive emotions, affirmations can help you sleep better.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1H)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at acceptance affirmations", arrayList, "You are likely to worry when you are in a difficult situation.", "Sometimes, your worry can motivate you to take action and to solve problems.");
            defpackage.d.p(arrayList, "However, when a situation is hard to control, worrying might make you feel worse.", "In such cases, accepting the situation might be the best way to manage your worry.", "Acceptance involves acknowleding a difficult situation without judging it.", "Affirmations can guide you to a sense of acceptance, even in tough situations.");
            arrayList.add("By practising them, you can let go of worry and experience a sense of peace.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T2A)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at focussed meditation", arrayList, "In difficult times, you might get occupied with negative thoughts.", "This might make it hard for you to focus on your tasks and get things done.");
            defpackage.d.p(arrayList, "When you are unable to complete your tasks, you might end up feeling worse.", "Focussed meditation is a technique to train your mind to pay attention and to focus.", "It will enable you to focus on a sensation or object without interruption.", "By boosting your focus, you will be able to get things done and improve your mood.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T2A)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at alternate breathing", arrayList, "This technique can activate the part of your nervous system that helps you relax.", "When this happens, a holistic sense of calm takes over your entire body and mind.");
            arrayList.add("Owing to these changes, you are likely to focus better and can feel more positive.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.GROUNDING)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at grounding", arrayList, "When you feel stressed or overwhelmed, you might be unable to relax yourself.", "Negative thoughts might play on your mind and further intensify your stress.");
            defpackage.c.B(arrayList, "By using your senses, grounding helps you anchor yourself to the present moment.", "This technique can also give your mind a much-needed mental break in times of stress.", "In fact, studies show that grounding can help you focus better as well.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.THREE_MINUTE_BREATHING_SPACE)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at breathing space", arrayList, "Anger can make you feel overwhelmed and out of control.", "You might find it hard to disconnect from a situation that's making you feel angry.");
            defpackage.c.B(arrayList, "This activity will help you enter a breathing space that is filled with calm and peace.", "It can also allow you to get some distance from your angry and negative thoughts.", "This might give you insight into your mind and a fresh perspective on the situation.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.HUMMING)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at humming", arrayList, "The act of humming ends up massaging different muscles in your upper body.", "This can ease out the tension from your face, shoulder, neck and other areas.");
            defpackage.c.B(arrayList, "As a result, your body can end up feeling relaxed and at ease. ", "Moreover, humming can also quieten your mind by clearing out your thoughts.", "Doing this activity can help you fall asleep quickly and also improve sleep quality.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.TOE_TENSING)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at toe tensing", arrayList, "The stress of everyday life can create tension in different parts of your body.", "This, in turn, makes it difficult for you to relax and get a good night's rest.");
            defpackage.c.B(arrayList, "Toe tensing involves tensing and relaxing your toes in a guided manner.", "It drains tension away - not just from your toes, but from the rest of your body too.", "When your body is free of tension, you are more likely to sleep better.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.GROUNDING_LOWER_BODY)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at lower body grounding", arrayList, "To prepare you to face threats, anxiety triggers the alarm response in your body.", "This response activates different parts of your body by creating tension in them.");
            defpackage.d.p(arrayList, "Your body's upper regions, including the chest, are especially affected by anxiety.", "For instance, you might find that your breathing has become shallow and rapid.", "Lower body grounding is a mindfulness technique that can help you feel anchored.", "It literally helps keep your feet on the ground by focussing on your lower body.");
            arrayList.add("By shifting attention away from anxiety's physical symptoms, it can help you relax.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.FOCUSSED_ATTENTION_MEDITATION)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at focussed meditation", arrayList, "In times of anxiety, you might get overwhelmed with negative, unhelpful thoughts.", "This might make it hard for you to focus and get things done.");
            defpackage.d.p(arrayList, "Not completing your tasks, in turn, can make you feel even more anxious.", "Focussed meditation can help you break this vicious cycle.", "This technique guides you to zoom your attention in on a single object.", "This way, it can take your mind off your negative, anxious thoughts.");
            arrayList.add("By improving focus, it can enable you to carry out your tasks and thus feel better.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at affirmations", arrayList, "Affirmations are a simple tool that can fill your mind with positivity and peace.", "These kind and compassionate statements can replace your negative thoughts.");
            defpackage.c.B(arrayList, "By drawing attention to strengths and capabilities, they can boost your self-esteem.", "In fact, affirmations can motivate you and cheer you up when things get difficult.", "Research shows that when repeated daily, this activity can improve your well-being.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at positive affirmations", arrayList, "Angry thoughts might play on your mind and can often be hard to let go of.", "Even if you try, it might be hard to not focus on these negative thoughts.");
            defpackage.d.p(arrayList, "Affirmations can help replace these negative thoughts with more positive ones.", "By saying calming statements to yourself, you are likely to feel calm and relaxed.", "Affirmations can also help you feel empowered and in control of the situation.", "Repeating affirmations can make you believe in them and experience their benefits.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T11A)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at gratitude object", arrayList, "Gratitude involves being thankful for what you have or get in life. ", "Research shows that being grateful can make you experience more positive emotions.");
            defpackage.d.p(arrayList, "Appreciating the good in your life can also help you become more optimistic.", "In difficult times, gratitude can help you cope better by making you more resilient. ", "In fact, it can also make you kinder to others - which in turn boosts your happiness!", "But in the chaos of everyday life, it might be hard to find the time to be grateful.");
            arrayList.add("Having an object that reminds you to be thankful can make gratitude easy to practise.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A) && this.f15724u == 3) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "Here are a few tips to get the most out of this technique", arrayList, "Avoid trying to do too much in a focus period. Pick only 1 small part at a time.", "If you get distracted, remind yourself you have a break at the end of 20 minutes.");
            arrayList.add("When your break period arrives, do something to mentally disconnect from the task.");
            arrayList.add("You can take a walk, drink a glass of water or have a conversation with someone.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at attention chunking", arrayList, "When you feel low or depressed, even the smallest of tasks might seem overwhelming.", "This can demotivate you and make you feel disinterested in carrying out your tasks.");
            defpackage.d.p(arrayList, "Not getting things done can add to your distress and intensify your low mood.", "Attention chunking ends this negative spiral by making most of your focus capacity.", "According to research, you can focus on a task without interruption for 20 minutes.", "After 20 minutes, you might begin to get distracted and may become unproductive.");
            defpackage.c.B(arrayList, "This strategy helps you take regular breaks at the right intervals to maximise focus.", "Using this technique can motivate you by making your tasks seem more achievable.", "It allows you to complete your tasks, which can give your mood a much-needed boost.");
        } else {
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
                int i6 = this.f15724u;
                obj = Constants.COURSE_ANGER;
                if (i6 == 3) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "Here are a few tips to get the most out of this technique", arrayList, "Avoid trying to do too much in a focus period. Pick only 1 small part at a time.", "If you get distracted, remind yourself you have a break at the end of 20 minutes.");
                    arrayList.add("When your break period arrives, do something to mentally disconnect from the task.");
                    arrayList.add("You can take a walk, drink a glass of water or have a conversation with someone.");
                }
            } else {
                obj = Constants.COURSE_ANGER;
            }
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
                defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at attention chunking", arrayList, "Stress affects your ability to think clearly or to concentrate on a task.", "This makes it difficult to get things done, which can further intensify your stress.");
                defpackage.d.p(arrayList, "Attention chunking is a practical solution that can be used in times like these.", "Research shows that after focussing for 20 minutes, you begin to get distracted.", "This strategy helps you take regular breaks at the right intervals to maximise focus.", "By using your attention wisely, you can become more productive and let go of stress.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A) && this.f15724u == 3) {
                defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "Here are a few tips to get the most out of this technique", arrayList, "Avoid trying to do too much in a focus period. Pick only 1 small part at a time.", "If you get distracted, remind yourself you have a break at the end of 20 minutes.");
                arrayList.add("When your break period arrives, do something to mentally disconnect from the task.");
                arrayList.add("You can take a walk, drink a glass of water or have a conversation with someone.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
                defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at attention chunking", arrayList, "Anxiety is often accompanied by worrying thoughts that might occupy your mind.", "As a result, you might feel too distressed and anxious to carry out your tasks.");
                defpackage.d.p(arrayList, "When you don't complete your tasks, your anxiety might get even worse.", "Attention chunking ends this negative spiral by making most of your focus capacity.", "According to research, you can focus on a task without interruption for 20 minutes.", "After 20 minutes, you might begin to get distracted and may become unproductive.");
                defpackage.c.B(arrayList, "This strategy helps you take regular breaks at the right intervals to maximise focus.", "Using this technique can help you approach your tasks in a calm and strategic manner.", "Focussing on a task can also take your mind off of anxiety, making you feel better.");
            } else {
                Object obj2 = obj;
                if (kotlin.jvm.internal.i.b(courseById.getCourseName(), obj2) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1J)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at Self-Compassion Pause", arrayList, "Anger can be a bitter emotion that is accompanied by negative, harsh thoughts.", "It can trigger you to react to a situation in an impulsive and unhealthy way.");
                    defpackage.d.p(arrayList, "Pausing for self-compassion can help you experience a sense of calm and peace.", "It can also enable you to take a mental break and distance yourself from your anger.", "This prevents you from spinning into a negative spiral of angry thoughts.", "In fact, with just 10 minutes of practice, this exercise can elevate your mood!");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1J)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at Self-Compassion Pause", arrayList, "In difficult times, you may experience negative thoughts that make you feel worse.", "Using this technique can help you get a mental break from your negative thoughts.");
                    defpackage.d.p(arrayList, "Pausing for self-compassion can thus help you better adjust to a difficult situation.", "It can also help you feel more emotionally stable and in control.", "Studies show that using this technique can improve your overall emotional well-being.", "In fact, being kind to yourself can make you kinder to other people, too!");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1K)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at the 20 minute rule", arrayList, "It should ideally take 15-20 minutes for you to fall asleep once you go to bed.", "If you take lesser time to fall asleep, it means your body is sleep-deprived.");
                    defpackage.d.p(arrayList, "If you take longer than 20 minutes, it means your body is not ready to sleep yet.", "When you don't get sleep but stay in bed, your mind links your bed with being awake.", "As a result, each time you go to bed, your mind might think it's time to be awake.", "An easy way to stop this from happening is to not lie awake in bed beyond 20 minutes.");
                    arrayList.add("Getting out of your bed and doing some other activity is a much better alternative.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8A)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at the assertiveness formula", arrayList, "Stress is experienced when you feel overburdened with demands and responsibilities.", "Sometimes, saying \"no\" is important - it can keep a check on all that you have to do.");
                    defpackage.c.B(arrayList, "Assertiveness allows you to say \"no\" without being aggressive or uncooperative. ", "In fact, studies show that it can improve your relationship with others around you.", "Standing up for your needs can also make you feel more confident in yourself.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8B)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at double standard dispute", arrayList, "It is often believed that low mood is caused by certain types of situations.", "In reality, it is the way you think about a situation that can trigger depression.");
                    defpackage.d.p(arrayList, "This is because the way you think directly impacts the way you feel.", "For example, thinking that nobody cares about you can make you feel low and dejected.", "Recognising your negative thoughts is the first step in overcoming depression.", "Once you are aware of your thoughts, you can replace them with more positive ones.");
                    arrayList.add("This activity will help you let go of your double standards, so you can feel better.");
                    arrayList.add("It teaches you to replace self-critical thoughts with more supportive ones.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8B)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at double standard dispute", arrayList, "It is often believed that stress is the result of difficult situations.", "In reality, it's the way you think about a situation that leads you to feel stressed.");
                    defpackage.d.p(arrayList, "For example, thinking that a task is too tough to complete in time can cause stress.", "Since thoughts affect the way you feel, you can change your thoughts to feel better.", "Double standard dispute is a technique to change the way you think to yourself.", "It can help you adopt a more positive, helpful and objective view of a situation.");
                    arrayList.add("By speaking to yourself in a friendly manner, your stress is bound to reduce.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), obj2) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8C)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at helicopter perspective", arrayList, "It is often believed that anger is caused by certain types of situations.", "In reality, it is the way you think about a situation that causes feelings of anger.");
                    defpackage.d.p(arrayList, "For example, thinking that a loved one is avoiding you can make you feel angry.", "Recognising your thoughts is the first step in dealing with negative emotions.", "Once you become aware of your thoughts, you can take action to change them.", "The helicopter perspective helps you get distance from intense thoughts and emotions.");
                    arrayList.add("By giving you the space to think more rationally, it can help you let go of anger.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8I)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at the problem solving formula", arrayList, "Stress is experienced when you are faced with problems that challenge you.", "In such times of stress, you might feel that things are out of your control.");
                    defpackage.d.p(arrayList, "The problem solving formula can help you take charge of a situation.", "It pushes you to adopt a proactive approach to overcoming your challenges.", "It can also help you gain insight and awareness into a problem you are facing.", "In fact, this technique can help you figure out how to best deal with your problem.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8G)) {
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
                    if (kotlin.jvm.internal.i.b(((T8Activity) activity2).C, "s25")) {
                        defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "Need help? Here are a few things that can add goodness to each day!", arrayList, "Spending quality time with a loved one", "Eating a nice meal in the day");
                        defpackage.d.p(arrayList, "Connecting with a friend after a long time", "Having a relatively easy commute to and from work", "Getting complimented by a colleague or friend", "Getting the chance to play with your pet");
                        arrayList.add("Taking the time to exercise");
                        arrayList.add("Experiencing pleasant weather that made the day better");
                    } else {
                        defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at three good things", arrayList, "When you feel sad and low, you might struggle to recognise the good in your life.", "In fact, you might end up paying more attention to your negative experiences.");
                        defpackage.d.p(arrayList, "Gratitude is a simple yet powerful tool to turn things around when you feel low.", "Another potent technique in combating depression is writing in a journal.", "By combining the 2 strategies, this activity gives you all you need to feel better.", "Research shows that writing down 3 good things each day can lift your spirits!");
                    }
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_TAE)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at mindfulness minute", arrayList, "At times, you might find yourself stuck in a loop of negative thoughts.", "These thoughts might cause you to experience emotional and even physical distress.");
                    defpackage.c.B(arrayList, "Mindfulness can make you more aware of the thoughts you are experiencing.", "This gives you the opportunity to change the way you think, so you can feel better.", "Practising mindfulness - even for a minute - can help you feel calm and centered.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T5B)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at worry time", arrayList, "Anxiety can overwhelm you - it can affect you mentally, physically, and emotionally.", "You might find yourself occupied with worrying thoughts that make you feel worse.");
                    defpackage.d.p(arrayList, "As a result, you may struggle to focus on tasks or to go about your daily routine.", "This technique ensures that your worry doesn't interfere with everyday activities.", "It gives you a sense of control - not just over your mind, but also over your day.", "Postponing your worries to another time can help you feel calm in the present moment.");
                    arrayList.add("In fact, when your worry time arrives, you might not even be feeling worried anymore!");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T5A)) {
                    defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.textView1), "A closer look at worry time", arrayList, "Good sleep can be hard to attain - especially when your mind is racing or active.", "You might find yourself worrying about the next day or problems you need to manage.");
                    defpackage.d.p(arrayList, "The more you dwell on these thoughts, the less likely you will be to fall asleep.", "Not sleeping can further intensify your worry and make you feel agitated.", "Worry time can help you break this vicious cycle in a matter of minutes.", "It can clear your mind of your worries by scheduling them for a later time.");
                    arrayList.add("This can help you feel calm and in control, thus allowing you to sleep better.");
                }
            }
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.d(activity3);
            View inflate = activity3.getLayoutInflater().inflate(R.layout.row_text_points, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
            ((RobertoTextView) inflate.findViewById(R.id.textViewNumbers)).setText(String.valueOf(i10));
            ((RobertoTextView) inflate.findViewById(R.id.textViewText)).setText((String) it.next());
            ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
        }
    }
}
