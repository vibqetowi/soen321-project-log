package fq;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS34Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/o0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o0 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f15772x = 0;

    /* renamed from: u  reason: collision with root package name */
    public String f15773u;

    /* renamed from: v  reason: collision with root package name */
    public String f15774v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f15775w = new LinkedHashMap();

    /* compiled from: StaticS34Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends a5.f<Drawable> {
        public a() {
        }

        @Override // a5.h
        public final void f(Object obj) {
            ((ConstraintLayout) o0.this._$_findCachedViewById(R.id.constraintLayout)).setBackground((Drawable) obj);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15775w;
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
        return inflater.inflate(R.layout.fragment_static_s34, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15775w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new a());
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
        rr.a aVar = (rr.a) activity;
        String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
        kotlin.jvm.internal.i.f(currentCourse, "getInstance().user.currentCourse");
        this.f15774v = currentCourse;
        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
        String str = this.f15774v;
        if (str != null) {
            Course courseById = firebasePersistence.getCourseById(str);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            String stringExtra = activity2.getIntent().getStringExtra(Constants.API_COURSE_LINK);
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            kotlin.jvm.internal.i.f(arguments.getString(Constants.TEMPLATE_TITLE_KEY, ""), "arguments!!.getString(TEMPLATE_TITLE_KEY,\"\")");
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setText("Next");
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Happy Place");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("By visualising your happy place each day, you can use this technique more easily in stressful times.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_HAPPY_PLACE;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Safe Space");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("By visiting your happy place when you go to bed each night, you can get a good night's rest easily.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_HAPPY_PLACE;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Visualising this place daily can help you use this technique more easily in times of worry.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_HAPPY_PLACE;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Visualising your place each day can allow you to use this technique more easily in times of anger.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_VISUALISATION;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Time Out");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Taking a time out every day can give your mind a much-needed break to feel calm and refreshed.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_TIME_OUT;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Time Out");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Taking a time out each day can make it easier for you to use this technique in times of anger.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_TIME_OUT;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Repeating your chosen statements on a daily basis can build your resources to overcome stress.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_AFFIRMATIONS;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Building a habit of practising affirmations each day can help you feel better and sleep better.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_AFFIRMATIONS;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1H)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Acceptance Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Practising these affirmations every day will infuse you with a sense of calm and strength.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_AFFIRMATIONS;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("By incorporating affirmations in your everyday routine, you can keep your anger at bay.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_AFFIRMATIONS;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Practising these affirmations every day can deepen your belief in yourself, making you happier.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_HAPPINESS_AFFIRMATIONS;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T2A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Focussed Meditation");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Practising focussed meditation daily can enhance your focus and improve your mood over time.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_FOCUSSED_MEDITATION;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T2A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Alternate Breathing");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("By practising this activity each day, you can cultivate a calmer and happier life for yourself.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_HAPPINESS_ALTERNATE_BREATHING;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.GROUNDING)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Grounding");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Practise grounding each day to experience a sense of calm and peace.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_GROUNDING;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.THREE_MINUTE_BREATHING_SPACE)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Breathing Space");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Doing this exercise each day can help you engage in this activity more easily in times of anger.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_THREE_MINUTE_BREATHING;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.HUMMING)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Humming Meditation");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Practising humming meditation each night before bed can help you get more restful sleep.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_HUMMING;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.TOE_TENSING)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Toe Tensing");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Engaging in this exercise every night before bed can improve sleep quality over time.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_TOE_TENSING;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.GROUNDING_LOWER_BODY)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Lower Body Grounding");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Engaging in this exercise each day will shield you from the physical symptoms of anxiety.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_GROUNDING_LOWER_BODY;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.FOCUSSED_ATTENTION_MEDITATION)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Focussed Meditation");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Practising focussed meditation each day can boost your focus and lower anxiety levels over time.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_FOCUSSED_ATTENTION_MEDITATION;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8G)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Three Good Things");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Noting down 3 good things that happen each day can infuse you with a sense of happiness and hope.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THREE_GOOD_THINGS;
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_TAE)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Mindfulness Minutes");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Practising this technique each day can infuse you with a mindful sense of happiness.");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Track this goal daily");
                this.f15773u = Constants.DAILY_ACTIVITY_GOAL_ID_HAPPINESS_ONE_MINUTE_MINDFULNESS;
            }
            FirebasePersistence firebasePersistence2 = FirebasePersistence.getInstance();
            String str2 = this.f15773u;
            String str3 = this.f15774v;
            if (str3 != null) {
                Goal goalById = firebasePersistence2.getGoalById(str2, str3);
                SwitchCompat switchCompat = (SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal);
                if (goalById != null && goalById.isVisible()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                switchCompat.setChecked(z10);
                ((SwitchCompat) _$_findCachedViewById(R.id.switch_add_goal)).setOnCheckedChangeListener(new ib.a(3, this));
                ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new x(3, this));
                ((ImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new m0(aVar, 1));
                return;
            }
            kotlin.jvm.internal.i.q("courseId");
            throw null;
        }
        kotlin.jvm.internal.i.q("courseId");
        throw null;
    }
}
