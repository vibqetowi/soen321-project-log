package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS86Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/b1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b1 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15669w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15671v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15670u = LogHelper.INSTANCE.makeLogTag(b1.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15671v;
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
        return inflater.inflate(R.layout.fragment_static_s86, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15671v.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0311 A[Catch: Exception -> 0x0369, LOOP:0: B:53:0x030b->B:55:0x0311, LOOP_END, TryCatch #0 {Exception -> 0x0369, blocks: (B:3:0x0012, B:6:0x005f, B:8:0x0065, B:52:0x02f1, B:53:0x030b, B:55:0x0311, B:56:0x0356, B:10:0x0084, B:12:0x008e, B:14:0x0094, B:15:0x00b0, B:18:0x00bc, B:20:0x00c4, B:21:0x0100, B:24:0x011a, B:26:0x0120, B:27:0x0160, B:29:0x016a, B:31:0x0170, B:32:0x01b0, B:34:0x01ba, B:36:0x01c2, B:37:0x0200, B:39:0x020a, B:41:0x0212, B:42:0x0266, B:44:0x0272, B:46:0x027a, B:47:0x02a7, B:49:0x02b3, B:51:0x02bb), top: B:61:0x0012 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        rr.a aVar;
        Iterator it;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            String stringExtra = activity.getIntent().getStringExtra(Constants.API_COURSE_LINK);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
            rr.a aVar2 = (rr.a) activity2;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.titleTextView)).setText("When should you use a time out?");
                arrayList.add("In times of sadness");
                arrayList.add("Every single day");
                arrayList2.add("A time out can be very effective when you are actually feeling low or sad. In such cases, a time out can give you a break from overwhelming thoughts and feelings.");
                arrayList2.add("Taking a time out on a regular basis might also be a good idea. When you take some time to disconnect and relax, you can feel more in control of your emotions. This will make it easier for you to take time outs when you do feel low.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.titleTextView)).setText("When should you use a time out?");
                arrayList.add("In times of anger");
                arrayList.add("Every single day");
                arrayList2.add("The most obvious situation where a time out can help is when you actually feel angry. When anger starts to overpower you, it might be a good idea to give yourself a break and leave the situation for a while.");
                arrayList2.add("A time out can help even when you aren't feeling angry! Practising this activity each day - by taking some time to disconnect and relax - can help you feel more in control of your emotions. This will also make it easier for you to take a time out when you feel angry.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.titleTextView)).setText("How to use the assertiveness formula");
                arrayList.add("Let's imagine a situation");
                arrayList.add("Begin with an \"I feel\" statement");
                arrayList.add("Describe the problematic behaviour");
                arrayList.add("Finally, make a concrete request");
                arrayList.add("Try it yourself");
                arrayList2.add("Your friends keep making plans to meet without asking you for your opinion or preferences. You want this to change, but don't know how to address the problem with them.");
                arrayList2.add("The first step of the formula is to use the phrase \"I feel\". This conveys what you are thinking and feeling, without blaming the other person. For example, you might tell your friends, \"I am feeling really hurt.\"");
                arrayList2.add("The second step of the formula is to precisely state the behaviours or actions that are affecting you. For instance, you might say, \"I am hurt when none of my friends check with me for my preferences before making plans.\"");
                arrayList2.add("For assertiveness to give you what you want, it's important to suggest a solution or alternative. This is the final step of the formula. In this example, you might request your friends to consider each person's ideas when making a plan.");
                arrayList2.add("Now that you know how the assertiveness formula is used, you can apply it in stressful situations in your own life.");
            } else {
                aVar = aVar2;
                if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8B)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.titleTextView)).setText("How you can use the double standard dispute");
                    arrayList.add("Imagine this situation");
                    arrayList.add("How would you feel about it?");
                    arrayList.add("What could you be thinking?");
                    arrayList.add("What would you say to a friend?");
                    arrayList.add("Now say this to yourself...");
                    arrayList.add("Try the technique");
                    arrayList2.add("You had been working very hard on a project, and despite giving it your best, you received negative feedback from your manager at work.");
                    arrayList2.add("You might feel quite dejected and upset. It is possible that you would feel down and hopeless as well.");
                    arrayList2.add("You might think that your hard work always goes to waste. Or you might believe that you are a failure who is not capable of doing good work.");
                    arrayList2.add("If a close friend was in the same situation and had similar thoughts, how would you respond? You might tell them about their good qualities and remind them of their achievements. You might also help them use the feedback to improve their work.");
                    arrayList2.add("If you said these encouraging and supportive things to yourself, you would automatically end up feeling lighter and better. You might even get inspired to do better the next time.");
                    arrayList2.add("Now that you know how the double standard dispute works, you can use it to deal with your negative emotions.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8B)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.titleTextView)).setText("How you can use the double standard dispute");
                    arrayList.add("Imagine this situation");
                    arrayList.add("How would you feel about this?");
                    arrayList.add("What could you be thinking?");
                    arrayList.add("What would you say to a friend?");
                    arrayList.add("Now say this to yourself...");
                    arrayList.add("Try the technique");
                    arrayList2.add("You've had a long and difficult week at work. You were looking forward to relaxing over the weekend, but you suddenly remembered that you have a lot of chores to complete at home.");
                    arrayList2.add("You are likely to feel stressed and even overwhelmed. You might get upset that you won't get to relax like you had originally planned to.");
                    arrayList2.add("You might think that life is full of unwanted and terrible responsibilities. You might also think that you won't be able to enjoy the weekend at all, owing to your pending chores.");
                    arrayList2.add("If you found a friend in a similar situation, you might ask them to take a breather. You might calmly help them plan the weekend so they can still find some time to relax. You might also tell them that they are doing really well managing different parts of their life.");
                    arrayList2.add("If you said these supportive and positive things to yourself, you might end up feeling less stressed than before. You might still not look forward to the chores, but would not feel overwhelmed about the weekend anymore.");
                    arrayList2.add("In times of stress, asking yourself what you would say to a friend can highlight your double standards. Now that you know how this technique works, you can use it to deal with any stressful situation.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8C)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.titleTextView)).setText("How you can use the helicopter perspective");
                    arrayList.add("Imagine this situation");
                    arrayList.add("How would those involved see this?");
                    arrayList.add("What would a neutral observer see?");
                    arrayList.add("What can you do now?");
                    arrayList.add("Try it yourself");
                    arrayList2.add("Your new neighbours play loud music in the middle of the night. This is interfering with your sleep and making you feel angry and agitated. You think they are inconsiderate and selfish people.");
                    arrayList2.add("Pause, and before you react, take a deep breath. Try and put yourself in your neighbours' shoes - what might they be thinking? Maybe they just want to have a good time and don't realise that the music is loud.");
                    arrayList2.add("This is the helicopter perspective - viewing a situation from the lens of an uninvolved person. A neutral observer may think that it is common to have issues with neighbours, and that many others might have experienced such problems before.");
                    arrayList2.add("Identify what you can do to improve the situation. While you might want to pick a fight with your neighbours, a more helpful alternative would be to have a discussion with them and let them know how the situation affects you.");
                    arrayList2.add("The helicopter perspective helps you consider different views on a situation. Now that you know how it works, you can try using it on any situation that is making you feel angry.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8I)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.titleTextView)).setText("How to use the problem solving formula");
                    arrayList.add("Let's consider a problem");
                    arrayList.add("Step 1: Define the problem");
                    arrayList.add("Step 2. Brainstorm solutions");
                    arrayList.add("Step 3. Evaluate each option ");
                    arrayList.add("Step 4: Pick the best alternative");
                    arrayList.add("Step 5: Implement a plan of action");
                    arrayList.add("Try it yourself");
                    arrayList2.add("For the past few weeks, there has been too much work to do. Owing to this, you haven't been able to spend time with your friends.");
                    arrayList2.add("State your problem in one simple, clear sentence. In this case, it would be - \"I don't have time to meet my friends.\"");
                    arrayList2.add("Think of different ways to solve this problem. List as many as you possibly can - doing a video call during lunch break, spending time over the weekend, waking up earlier than usual to meet your friends, and discussing your workload with your manager.");
                    arrayList2.add("This is the step that will help you pick a viable solution. You weigh the pros and cons of each option to find the most feasible one. In some cases, you may realise that none of your ideas will work and that you require a different solution.");
                    arrayList2.add("After assessing each option, you may decide that the best solution is to meet your friends each weekend. This not only keeps your week less hectic, but also helps you spend time with your friends like you want to.");
                    arrayList2.add("Finally, you have to create a plan to try the best option. You might call up your friends and ask them to meet you for dinner this weekend. After implementing the plan, evaluate the action to decide if it worked or not. If not, you can go back to your other options.");
                    arrayList2.add("Now that you have learned the 5 steps of problem solving, you can apply this technique to tackle any problem you might be facing!");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_TAE)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.titleTextView)).setText("Great job! You were mindful for an entire minute.");
                    arrayList.add("Pat yourself on the back");
                    arrayList.add("Check in with yourself");
                    arrayList.add("Gradually increase the duration");
                    arrayList2.add("Being mindful for 60 seconds is not an easy task - but you did it! It's okay if your mind wandered - what matters is that you took the first step to a more mindful you.");
                    arrayList2.add("Take a moment to reflect on how you're feeling. Is your mind calmer? Are you feeling more relaxed? Even if you feel nothing, that's okay! It can take a while to master mindfulness.");
                    arrayList2.add("Practise doing this regularly so you feel comfortable with 1 minute of mindfulness. Over time, you can increase the duration to 3 minutes, and then 5 minutes, and so on.");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T5B)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.titleTextView)).setText("How to use the worry time technique");
                    arrayList.add("Step 1: Schedule a time to worry");
                    arrayList.add("Step 2: Make a note of your worries");
                    arrayList.add("Step 3: Refocus to the present");
                    arrayList.add("Step 4: Worry during worry time");
                    arrayList2.add("Create your worry period by selecting a time in the day to worry. Don't pick a time that is close to when you go to bed - the period before you sleep should be free of worries and tension.");
                    arrayList2.add("Once you've scheduled your worry time, you can start making a note of your worries. As and when worrying thoughts arise in your head, write them down so you can worry about them later.");
                    arrayList2.add("Make a mental agreement with your worry: other than your worry time, your day will be free of worry. If you feel worried during the day, try breathing deeply to feel calmer. You could also engage in an activity to distract yourself.");
                    arrayList2.add("If you still feel worried at your scheduled time, you can worry for 20 minutes. During this time, think of ways to handle the worry. If you don't feel worried at the time - that's great! You can go on with your day.");
                }
                rr.a aVar3 = aVar;
                ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new m0(aVar3, 2));
                it = arrayList.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    View inflate = aVar3.getLayoutInflater().inflate(R.layout.row_screen_s86, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText((String) it.next());
                    ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText((CharSequence) arrayList2.get(i6));
                    ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
                    i6++;
                }
                ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new m0(aVar3, 3));
            }
            aVar = aVar2;
            rr.a aVar32 = aVar;
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new m0(aVar32, 2));
            it = arrayList.iterator();
            int i62 = 0;
            while (it.hasNext()) {
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new m0(aVar32, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15670u, "exception", e10);
        }
    }
}
