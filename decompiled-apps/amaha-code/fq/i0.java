package fq;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS2Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/i0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i0 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f15726v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15727u = new LinkedHashMap();

    /* compiled from: StaticS2Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends a5.f<Drawable> {
        public a() {
        }

        @Override // a5.h
        public final void f(Object obj) {
            ((ConstraintLayout) i0.this._$_findCachedViewById(R.id.constraintLayout)).setBackground((Drawable) obj);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15727u;
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
        return inflater.inflate(R.layout.fragment_static_s2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15727u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((RobertoButton) _$_findCachedViewById(R.id.tap)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.h0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i0 f15720v;

                {
                    this.f15720v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    i0 this$0 = this.f15720v;
                    switch (i6) {
                        case 0:
                            int i10 = i0.f15726v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity).t0();
                            return;
                        case 1:
                            int i11 = i0.f15726v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).o0();
                            return;
                        default:
                            int i12 = i0.f15726v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).s0(new i());
                            return;
                    }
                }
            });
            Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new a());
            UiUtils.Companion companion = UiUtils.Companion;
            ImageView header_arrow_back = (ImageView) _$_findCachedViewById(R.id.header_arrow_back);
            kotlin.jvm.internal.i.f(header_arrow_back, "header_arrow_back");
            companion.increaseImageClickArea(header_arrow_back);
            ((ImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.h0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i0 f15720v;

                {
                    this.f15720v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    i0 this$0 = this.f15720v;
                    switch (i6) {
                        case 0:
                            int i10 = i0.f15726v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity).t0();
                            return;
                        case 1:
                            int i11 = i0.f15726v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).o0();
                            return;
                        default:
                            int i12 = i0.f15726v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).s0(new i());
                            return;
                    }
                }
            });
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            String stringExtra = activity.getIntent().getStringExtra(Constants.API_COURSE_LINK);
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            kotlin.jvm.internal.i.f(arguments.getString(Constants.TEMPLATE_TITLE_KEY, ""), "arguments!!.getString(TEMPLATE_TITLE_KEY,\"\")");
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Happy Place");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("When stress soars high, you might find it hard to think clearly. With the help of this activity, you can shift your focus away from stressful thoughts by creating a positive image in your mind.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Safe Space");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Using your imagination to think of a safe and happy place can make you feel calm. It can turn your attention away from negative thoughts by creating a positive image for your mind can focus on.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Worry makes your mind focus on the negative aspects of a situation. This activity gives you a more positive focus by helping you imagine a calm, peaceful place.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Anger can make you focus on negative thoughts and experiences. This activity shifts your focus towards a positive target, thus setting off a sense of peace and calm.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Time Out");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("In a hectic and busy world, things can get overwhelming very quickly. When this happens, carving some time out for yourself might give you the space to feel better.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Time Out");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("At times, removing yourself from a situation is the best way to manage anger. A time out is a short break that can give you the space and time to do this. It can help you cool down and feel calmer.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Affirmations are positive statements that can help you cope with a difficult situation. In times of stress, they can help you recognise your strengths and can motivate you to tackle your problems.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Affirmations are positive statements that you can say to yourself to feel calm and relaxed. Using them before going to bed can remove negative thoughts from your mind, helping you sleep better.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1H)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Acceptance Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Trying to change a situation that is out of your control can make you feel helpless and can worsen your worry. By building a sense of acceptance, you can feel calm, centered and at ease.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Affirmations are simple positive statements that you can say to yourself in times of anger. They can keep you centered and relaxed, and can shift your attention away from the negative.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Affirmations are simple positive statements that you can say to yourself. These statements focus on your strengths and abilities, so you can feel confident, empowered, and happy.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T2A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Focussed Meditation");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("When your mood is low, negative thoughts might interfere with your ability to focus. Through this meditation, you can train your mind to focus on your tasks and ultimately experience a sense of calm.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T2A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Alternate Breathing");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("This activity helps you alternate your breathing between your nostrils, so that both sides of your brain get enough oxygen. This way, your mind becomes relaxed and balanced.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.GROUNDING)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Grounding");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Grounding is a technique that involves drawing your attention to the present moment. It uses your senses to help you disengage from what's stressing you out. This way, you end up feeling relaxed.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.THREE_MINUTE_BREATHING_SPACE)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Breathing Space");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Breathing space is a simple relaxation tool that can help you disengage from an anger-causing situation. By giving you a safe space to relax and be mindful, it will help you let go of angry thoughts.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.HUMMING)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Humming Meditation");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Humming has a calming effect on your nervous system, which can help you relax physically. It can also infuse your mind with a sense of peace - thus making good sleep more likely.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.TOE_TENSING)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Toe Tensing");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Toe tensing is a technique that can help your whole body relax. Studies show that it not only helps you fall asleep more quickly, but also improves the quality of your sleep.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.GROUNDING_LOWER_BODY)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Lower Body Grounding");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("This science-backed technique triggers the relaxation response in your body. By guiding you to focus on the lower regions of your body, it counteracts the negative effects of anxiety.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.FOCUSSED_ATTENTION_MEDITATION)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Focussed Meditation");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Anxiety is often accompanied by negative thoughts that keep playing on your mind. Through this meditation, you can train your mind to deal with distractions and focus on your task calmly.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("The Assertiveness Formula");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Assertiveness is a non-confrontational and respectful way of asking for what you want. It reduces the conflict that you may face in your relationships - and thus helps reduce stress.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8B)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Double Standard Dispute");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Double standard dispute is a technique in which you talk to yourself the way you would speak to a friend. By allowing you to think in a healthier and more balanced way, it can help combat low mood.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8B)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Double Standard Dispute");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Double standard dispute is a technique that involves talking to yourself the way you talk to a friend. Using it in stressful situations can help you feel calm and in control.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8C)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Helicopter Perspective");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("In times of anger, it's hard to disconnect from negative thoughts. The helicopter perspective helps you pull back and see the bigger picture. This can help you change your perspective and feel better.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8G)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Three Good Things");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Gratitude can train your mind to look at the positives in life. Thinking about even the smallest of things going well for you can make you feel hopeful about the future and better about yourself.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8I)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Problem Solving Formula");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Taking a step-by-step approach to problems can help address them effectively. This technique will allow you to carefully think about each aspect of a problem, so you can easily find the best solution.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1J)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Self-Compassion Pause");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Self-compassion involves relating to yourself in a kind, friendly way. It can reduce feelings of threat that accompany anger. It also shifts your attention from negative thoughts to positive ones.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1J)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Self-Compassion Pause");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Self-compassion involves relating to yourself in a kind and friendly way. Research shows that it not only helps you feel better about yourself, but also leads to lasting improvement in happiness!");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1K)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("The 20 Minute Rule");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("If your mind links your bed to the act of sleeping, you are likely to sleep better. You can strengthen this link by engaging in another activity if you are unable to fall asleep for over 20 minutes.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T11A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Gratitude Object");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How does this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Studies show that people who practise gratitude have better health and higher levels of happiness. In fact, the more regularly it is practised, the stronger its benefits are!");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Attention Chunking");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Low mood can affect your ability to focus on tasks. Attention chunking is a technique to alternate your attention between focus and break periods, so you can complete your tasks and feel better.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Attention Chunking");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("When a task seems overwhelming or stressful, you might struggle to focus and get it done. Alternating your attention between focus and break periods can help you complete your tasks and tackle stress.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Attention Chunking");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("When you feel anxious, negative thoughts might distract you from your tasks. Attention chunking involves alternating between focus and break periods, so you can concentrate better and tackle anxiety.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_TAE)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Mindfulness Minute");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Mindfulness allows you to become aware of what is going on, in and around you. It also helps you accept your experiences without judgement. As a result, you are likely to feel calmer and happier.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T5B)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Though it sounds counterproductive, scheduling a time to worry can limit the amount of time you spend worrying. It also allows you to focus and get things done, which can help you feel better.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T5A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("How will this help?");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView5)).setText("Studies show that by mentally postponing your worries for later, you can relax and ease your mind. This will help you fall asleep more quickly, too. You can try it yourself and see if it works!");
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.textView6)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.h0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i0 f15720v;

                {
                    this.f15720v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    i0 this$0 = this.f15720v;
                    switch (i6) {
                        case 0:
                            int i10 = i0.f15726v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        case 1:
                            int i11 = i0.f15726v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity22 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity22).o0();
                            return;
                        default:
                            int i12 = i0.f15726v;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity3).s0(new i());
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
