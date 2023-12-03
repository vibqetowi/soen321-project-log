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
/* compiled from: StaticS1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/e0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e0 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f15696v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15697u = new LinkedHashMap();

    /* compiled from: StaticS1Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends a5.f<Drawable> {
        public a() {
        }

        @Override // a5.h
        public final void f(Object obj) {
            ((ConstraintLayout) e0.this._$_findCachedViewById(R.id.constraintLayout)).setBackground((Drawable) obj);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15697u;
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
        return inflater.inflate(R.layout.fragment_static_s1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15697u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        CharSequence charSequence;
        Object obj2;
        CharSequence charSequence2;
        Object obj3;
        Object obj4;
        CharSequence charSequence3;
        Object obj5;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Object obj6;
        CharSequence charSequence6;
        Object obj7;
        Object obj8;
        CharSequence charSequence7;
        Object obj9;
        CharSequence charSequence8;
        Object obj10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        ((RobertoButton) _$_findCachedViewById(R.id.tap)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.d0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ e0 f15691v;

            {
                this.f15691v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                e0 this$0 = this.f15691v;
                switch (i6) {
                    case 0:
                        int i10 = e0.f15696v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity).t0();
                        return;
                    default:
                        int i11 = e0.f15696v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity2).o0();
                        return;
                }
            }
        });
        UiUtils.Companion companion = UiUtils.Companion;
        ImageView header_arrow_back = (ImageView) _$_findCachedViewById(R.id.header_arrow_back);
        kotlin.jvm.internal.i.f(header_arrow_back, "header_arrow_back");
        companion.increaseImageClickArea(header_arrow_back);
        ((ImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.d0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ e0 f15691v;

            {
                this.f15691v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                e0 this$0 = this.f15691v;
                switch (i6) {
                    case 0:
                        int i10 = e0.f15696v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity).t0();
                        return;
                    default:
                        int i11 = e0.f15696v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity2).o0();
                        return;
                }
            }
        });
        Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
        Bundle arguments = getArguments();
        kotlin.jvm.internal.i.d(arguments);
        String string = arguments.getString(Constants.API_COURSE_LINK);
        Bundle arguments2 = getArguments();
        kotlin.jvm.internal.i.d(arguments2);
        int i6 = arguments2.getInt(Constants.DAYMODEL_POSITION);
        Bundle arguments3 = getArguments();
        kotlin.jvm.internal.i.d(arguments3);
        kotlin.jvm.internal.i.f(arguments3.getString(Constants.TEMPLATE_TITLE_KEY, ""), "arguments!!.getString(TEMPLATE_TITLE_KEY,\"\")");
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new a());
        if (i6 != 0) {
            switch (i6) {
                case 2:
                    if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Happy Place");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Choose a place");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Take a moment to think of a place where you feel safe and happy. This place could be real or imaginary. It could be a place you have been to before, or somewhere you want to go.");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Safe Space");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Choose your place");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Find a comfortable spot and spend a minute thinking of a place where you feel safe, secure, and at ease. This place could be indoors or oudoors, real or imaginary. Here, nothing can bother you.");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Imagine a calm place");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Take a minute to think of a place that makes you feel calm and relaxed. It could be real or imaginary. This will be your safe space, where you will be free from your worry.");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Imagine a calm place");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Take a minute to think of a place that makes you feel calm and relaxed. It could be real or imaginary. This will be your safe space, where nothing can bother you.");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1H)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Acceptance Affirmations");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("About affirmations");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Affirmations are positive coping statements that you can repeat to yourself, either out loud or in your mind. By practising affirmations that focus on acceptance, you can manage your worry better.");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1K)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("The 20 Minute Rule");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Try this technique");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Whenever you find yourself lying awake for over 20 minutes, get out of bed. Instead of trying hard to get some sleep, engage in a simple and calming activity until you begin to feel sleepy again.");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_TAE)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Mindfulness Minute");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("How to do this");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Mindfulness is a difficult skill to develop, but this activity will break it down for you. You will see a screen with a 1 minute timer that will start counting down. Spend this time being mindful!");
                        return;
                    } else {
                        return;
                    }
                case 3:
                    if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8A)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("The Assertiveness Formula");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("What's next?");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Practise saying the statements you have noted in your assertiveness formula. This will help you feel more confident and relaxed when you express yourself. Pat yourself on the back for trying!");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8B)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Double Standard Dispute");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("What's next?");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Try telling yourself what you would say to a friend if they were in a similar situation. Just the simple act of speaking more kindly to yourself can give your mood a much-needed boost.");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8B)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Double Standard Dispute");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("What's next?");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Now that you know what you would tell a friend, try saying these things to yourself. It might feel awkward at first, but keep at it. Remember - being kind to yourself can help you feel less stressed.");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8C)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Helicopter Perspective");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Keep in mind...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Getting fresh perspectives on a situation might not help you feel better immediately, but this activity is a good start to managing anger. Over time, you will start thinking in a more balanced way.");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8I)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Problem Solving Formula");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("What's next?");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Implement the action you have decided to take. Evaluate how effective it was, and keep updating your plan if required. A bit of trial and error might be involved, so be patient with yourself!");
                        return;
                    } else {
                        if (!kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION)) {
                            charSequence4 = "In a nutshell...";
                            charSequence5 = "Focussed Meditation";
                            obj6 = Constants.SCREEN_T2A;
                        } else {
                            obj6 = Constants.SCREEN_T2A;
                            if (!kotlin.jvm.internal.i.b(string, obj6)) {
                                charSequence4 = "In a nutshell...";
                                charSequence5 = "Focussed Meditation";
                            } else {
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Focussed Meditation");
                                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("You can practise this activity to manage your attention better. It might take you a while to master this technique - so be patient with yourself if you get distracted at first!");
                                return;
                            }
                        }
                        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, obj6)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Alternate Breathing");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(charSequence4);
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("A relaxed life is a happy life. This activity enables you to regulate the way you breathe to help you feel happier. The best part? You can easily use this technique anytime and anywhere!");
                            return;
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.GROUNDING)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Grounding");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(charSequence4);
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Grounding is a useful technique to refocus and feel calmer in times of stress. The best part? It can be done anytime, anywhere!");
                            return;
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.THREE_MINUTE_BREATHING_SPACE)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Breathing Space");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(charSequence4);
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Sometimes, all you need is a safe space where you can feel calm, relaxed, and at ease. This activity will help you experience a few minutes of peace, even in the middle of a busy day.");
                            return;
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.HUMMING)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Humming Meditation");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(charSequence4);
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("You don't need a song to practise humming! This audio exercise will allow your mind and body to enter a state of calm - thus preparing you for bed.");
                            return;
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.TOE_TENSING)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Toe Tensing");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(charSequence4);
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Tensing and relaxing your toes can prepare you for a night of restful sleep. You could incorporate this exercise into your bedtime routine to start sleeping better!");
                            return;
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.GROUNDING_LOWER_BODY)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Lower Body Grounding");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(charSequence4);
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("In times of anxiety, tune your attention to the lower parts of your body! This technique empowers you to disconnect from your anxiety. The more you practise, the more effective this technique will be.");
                            return;
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.FOCUSSED_ATTENTION_MEDITATION)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence5);
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(charSequence4);
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("You can use this activity to manage your attention in times of anxiety. With a bit of practise, you will be able to master this technique.");
                            return;
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8G)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Three Good Things");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(charSequence4);
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("It can be very hard to write down 3 good things, especially on bad days. But remember - even small good things count. The more you look for the good in your day, the better your days will start to be!");
                            return;
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T5A)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText(charSequence4);
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("At the scheduled time, you will get a reminder to worry for 20 minutes - not more. Till then, take a break from your worries. You can use this tool whenever your worry stops you from sleeping!");
                            return;
                        } else {
                            return;
                        }
                    }
                case 4:
                    if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Happy Place");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Your mind is all you need to get rid of your stress. You can visit this chosen place whenever you feel overwhelmed. Think of this activity as taking a mental vacation!");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Safe Space");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Use the power of imagination to relax your mind and body. Remember that your safe space is accessible to you in your mind always!");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Your imagination can help you escape your worries. This technique can give you a safe space free from any negative thoughts or emotions. Moreover, it can be used anytime, anywhere!");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("You can use the power of your imagination to let go of anger. Whenever you find yourself getting angry, take a mental break by visiting your chosen place.");
                        return;
                    } else {
                        if (!kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS)) {
                            charSequence6 = "Positive Affirmations";
                            obj7 = Constants.SCREEN_T1G;
                        } else {
                            obj7 = Constants.SCREEN_T1G;
                            if (!kotlin.jvm.internal.i.b(string, obj7)) {
                                charSequence6 = "Positive Affirmations";
                            } else {
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Affirm yourself! By simply talking to yourself in a positive, supportive, and encouraging way, you can channelise your inner strength to tackle stress.");
                                return;
                            }
                        }
                        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, obj7)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence6);
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Give yourself a night of good sleep with the simple tool of affirmations. By repeating these positive statements to yourself, you can enter a state of deep relaxation.");
                            return;
                        }
                        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER)) {
                            obj8 = Constants.SCREEN_T1I;
                            if (kotlin.jvm.internal.i.b(string, obj8)) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence6);
                                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("In times of anger, use affirmations. Even a few minutes to talk to yourself in a positive and encouraging manner can strengthen your mind with inner peace.");
                                return;
                            }
                        } else {
                            obj8 = Constants.SCREEN_T1I;
                        }
                        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, obj8)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence6);
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Affirm yourself for happiness! A few words is all it will take to be kind to yourself. Affirmations will give you a happiness boost that can get you through each day.");
                            return;
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T11A)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Gratitude Object");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Try pairing gratitude with an everyday object so you can remind yourself to be thankful. You might be surprised to realise how much you have to be grateful for!");
                            return;
                        } else {
                            if (!kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                charSequence7 = "Attention Chunking";
                                obj9 = Constants.SCREEN_T6A;
                            } else {
                                obj9 = Constants.SCREEN_T6A;
                                if (!kotlin.jvm.internal.i.b(string, obj9)) {
                                    charSequence7 = "Attention Chunking";
                                } else {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Attention Chunking");
                                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                    ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("You can come back to this activity whenever you want to focus on a task that seems difficult or overwhelming. Remember to increase the duration of your focus period with regular practise.");
                                    return;
                                }
                            }
                            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, obj9)) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence7);
                                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("When you have a task to do but are feeling too stressed about it, try attention chunking. The more you practise, the more effective it will be! With time, increase the duration of your focus period.");
                                return;
                            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, obj9)) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence7);
                                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Keep anxiety at bay by focussing on a task at hand. Whenever you need to concentrate, come back to this activity. Remember - practise it regularly and gradually increase your focus period over time!");
                                return;
                            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T5B)) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("At the scheduled time, you will get a reminder to worry for 20 minutes, along with some recommendations to manage your worry. Until then, you can forget about your worries!");
                                return;
                            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8A)) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("The Assertiveness Formula");
                                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("The Assertiveness Formula is a simple, step-by-step guide that can help you express your needs and desire to others. Use it whenever you are feeling overextended and need to say \"no\".");
                                return;
                            } else {
                                if (!kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                    charSequence8 = "Double Standard Dispute";
                                    obj10 = Constants.SCREEN_T8B;
                                } else {
                                    obj10 = Constants.SCREEN_T8B;
                                    if (!kotlin.jvm.internal.i.b(string, obj10)) {
                                        charSequence8 = "Double Standard Dispute";
                                    } else {
                                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Double Standard Dispute");
                                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("In difficult situations, ditch your double standards! Take a break and ask yourself what you would tell a friend or loved one. Show the same kindness to yourself.");
                                        return;
                                    }
                                }
                                if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, obj10)) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence8);
                                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                    ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Be a good friend to yourself! In stressful situations, pause and check to see if you are being self-critical. Turn things around by using the double standard dispute!");
                                    return;
                                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8C)) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Helicopter Perspective");
                                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                    ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Changing your thoughts can change the way you feel. Looking at a situation from a big-picture lens can help you re-assess what's happening and ultimately feel better.");
                                    return;
                                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8I)) {
                                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Problem Solving Formula");
                                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                                    ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Use this formula when you find yourself stressing over a problem. This technique will help you identify what you can do. Remember that problems are solved by taking action!");
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                case 5:
                    if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1H)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Acceptance Affirmations");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("To accept a difficult or uncontrollable situation, use positive and calming affirmations. Even a few encouraging words can empower you with peace.");
                        return;
                    }
                    return;
                case 6:
                    if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_TAE)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Mindfulness Minute");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("You don't need a special place or time to practise mindfulness. Even one minute of mindful awareness at any time and in any place can help you feel centered and grounded.");
                        return;
                    }
                    return;
                case 7:
                    if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1J)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Self-Compassion Pause");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Whenever anger takes over you, pause. Spend a few minutes to acknowledge your pain, recognise universality, and express self-kindness. You can pick new statements by coming back to this activity!");
                        return;
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1J)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Self-Compassion Pause");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("In a nutshell...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Show yourself some love from time to time - especially in difficult situations. Spend a few minutes repeating your self-compassion statements. You can always come back here to do this activity!");
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Happy Place");
            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Today you will learn about a simple yet powerful tool that can help you beat stress: your imagination.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Safe Space");
            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("When thoughts keep you up at night, there is a place you can visit to feel safe and at ease. And you can do this without even getting up from your bed! Your mind is all you need for this exercise.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Do you sometimes find yourself unable to let go of your worry? This activity will teach you one simple trick to defeat negative, worrying thoughts.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("If you struggle to cool off in times of anger, this activity is what you need. All it requires is for you to use your imagination!");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1F)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Time Out");
            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Sometimes, all you might need is some time for yourself. But how can you do that without compromising on your tasks? This simple activity will make things easier for you.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1F)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Time Out");
            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Have you ever said or done something in a fit of anger that you later regretted? This simple activity is just what you need to ensure this doesn't happen again.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1G)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("What if you could beat stress just by talking to yourself more positively? This activity will empower you with a simple yet effective tool to keep stress away: affirmations.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1G)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("What if you could talk your way to restful, good sleep? With this technique, you can learn how to make the most of your self-talk.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1H)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Acceptance Affirmations");
            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Do you find it hard to accept things that are out of your control? This activity will help you take the first step to developing acceptance.");
        } else {
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER)) {
                obj = Constants.SCREEN_T1I;
                if (kotlin.jvm.internal.i.b(string, obj)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                    ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("If you talked to yourself differently, would you be able to manage your anger better? Research shows that you would! This activity will give you a simple strategy for feeling calm: affirmations.");
                    return;
                }
            } else {
                obj = Constants.SCREEN_T1I;
            }
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, obj)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("When was the last time someone said something nice about you? Didn't it feel good? This technique will help you say something positive to yourself, so you can experience happiness.");
                return;
            }
            if (!kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION)) {
                charSequence = "Focussed Meditation";
                obj2 = Constants.SCREEN_T2A;
            } else {
                obj2 = Constants.SCREEN_T2A;
                if (!kotlin.jvm.internal.i.b(string, obj2)) {
                    charSequence = "Focussed Meditation";
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Focussed Meditation");
                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                    ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Have you ever struggled to focus on your tasks when you are feeling low? This guided audio exercise will not only boost your focus, but also lift your mood.");
                    return;
                }
            }
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.GROUNDING)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Grounding");
                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("This activity will help you de-stress and relax in a matter of minutes. All it requires is for you to use your 5 senses!");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.THREE_MINUTE_BREATHING_SPACE)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Breathing Space");
                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Want to let go of your anger? All you need to do is carve out some space for you to breathe. Today's activity will guide you through this technique.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.HUMMING)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Humming Meditation");
                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Isn't it amazing that something as simple and easy as humming can help you fall asleep? Today's activity will guide you through this technique.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.TOE_TENSING)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Toe Tensing");
                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Who would have thought that the key to sleeping better lay in one of the tiniest parts of your body - your toes? Today's guided audio exercise will help you achieve your sleep goals!");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.GROUNDING_LOWER_BODY)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Lower Body Grounding");
                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("In times of anxiety, do you feel out of control? This simple mindfulness exercise will guide you to feel steady by grounding you in the present moment.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.FOCUSSED_ATTENTION_MEDITATION)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence);
                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Has anxiety ever affected your ability to focus on a task? This guided audio exercise will strengthen your attention muscles and help you let go of anxiety.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, obj2)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Alternate Breathing");
                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("All life depends on breathing. Did you know that your happiness depends on your breathing, too? This guided relaxation activity will help you regulate your breath, so you can feel happier.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("The Assertiveness Formula");
                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Assertiveness is an important tool in your stress-management kit. But it can also be hard to use and practise! This simple formula will get you started.");
            } else {
                if (!kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION)) {
                    charSequence2 = "Double Standard Dispute";
                    obj3 = Constants.SCREEN_T8B;
                } else {
                    obj3 = Constants.SCREEN_T8B;
                    if (!kotlin.jvm.internal.i.b(string, obj3)) {
                        charSequence2 = "Double Standard Dispute";
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Double Standard Dispute");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("If you are like most people, you are kinder to others than you are to yourself. These double standards might actually be harmful for you! A simple disputation technique can turn things around.");
                        return;
                    }
                }
                if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, obj3)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence2);
                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                    ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Do you tend to put yourself down or emphasise your flaws when times are tough? If you do, stress might be your friend. At the end of today's activity, you will get a better, new friend - you!");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8C)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Helicopter Perspective");
                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                    ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Sometimes, you need to zoom out to see a distressing situation for what it really is. The helicopter perspective is a technique to do just that.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8G)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Three Good Things");
                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                    ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("This activity combines two of the most powerful strategies to combat depression: gratitude and journalling.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T8I)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Problem Solving Formula");
                    ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                    ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Is your life filled with problems you don't know how to manage? This activity will present a 5-step formula to help you discover and implement solutions.");
                } else {
                    if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER)) {
                        obj4 = Constants.SCREEN_T1J;
                        if (kotlin.jvm.internal.i.b(string, obj4)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Self-Compassion Pause");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Sometimes, all you need to manage anger is to show yourself some kindness. This activity will get you started with a simple technique for self-compassion.");
                            return;
                        }
                    } else {
                        obj4 = Constants.SCREEN_T1J;
                    }
                    if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, obj4)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Self-Compassion Pause");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Do you become self-critical in difficult situations? Research shows that doing this might actually be harmful for your health and happiness. Today's activity will give you a healthier alternative!");
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T1K)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("The 20 Minute Rule");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Do you find yourself lying in bed, unable to sleep? Follow one rule in times like these: if you've spent over 20 minutes in bed without falling asleep, get out of bed and do something else!");
                    } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T11A)) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Gratitude Object");
                        ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                        ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("If you want to incorporate gratitude in everyday life, all you might need is a simple reminder. Using a physical object to do this might be the perfect solution for you.");
                    } else {
                        if (!kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION)) {
                            charSequence3 = "Attention Chunking";
                            obj5 = Constants.SCREEN_T6A;
                        } else {
                            obj5 = Constants.SCREEN_T6A;
                            if (!kotlin.jvm.internal.i.b(string, obj5)) {
                                charSequence3 = "Attention Chunking";
                            } else {
                                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Attention Chunking");
                                ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                                ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Do you frequently feel demotivated to get things done or overwhelmed by all that you have to do? Today's activity will help you chunk your attention to maximise your focus and lift your mood.");
                                return;
                            }
                        }
                        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, obj5)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence3);
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Did you know that after 20 minutes of sustained focus on a task, your productivity starts to dip? Attention chunking is a technique that makes most of your capacity to focus.");
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, obj5)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(charSequence3);
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Anxiety can negatively affect your attention capacity. But did you know that you could use your attention to beat anxiety? This activity will break it down for you.");
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_TAE)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Mindfulness Minute");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("If you want to incorporate mindfulness in your everyday life but feel that you have no time for it, this activity is just what you need.");
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T5B)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Does worry seem to take over your entire day? Today's activity will ensure this doesn't happen again. All you need to do is schedule a time to worry each day.");
                        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T5A)) {
                            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                            ((RobertoTextView) _$_findCachedViewById(R.id.title)).setText("Getting started...");
                            ((RobertoTextView) _$_findCachedViewById(R.id.desc)).setText("Worry time is a technique in which you devote a time for you to worry. If thoughts and worries keep you up at night, this simple strategy might just do the trick.");
                        }
                    }
                }
            }
        }
    }
}
