package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS3Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/s0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class s0 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15795w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15797v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<String> f15796u = new ArrayList<>();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15797v;
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
        return inflater.inflate(R.layout.fragment_static_s3, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15797v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            String string = arguments.getString(Constants.API_COURSE_LINK);
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.d(arguments2);
            arguments2.getInt(Constants.DAYMODEL_POSITION, 0);
            boolean b10 = kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION);
            ArrayList<String> arrayList = this.f15796u;
            if (b10 && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T6A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("How to engage in attention chunking");
                arrayList.add("Pick a task you want to work on, and break it up into smaller components.");
                arrayList.add("Now, plan to split your attention between focus periods and break periods.");
                arrayList.add("When you start this exercise, your focus period should be 20 minutes long.");
                arrayList.add("In each 20-minute focus period, you should aim to complete a small part of your task.");
                arrayList.add("After 20 minutes, you can give yourself a 5 minute break where you do something else.");
                arrayList.add("This makes 1 cycle of attention chunking: 20 minutes of focus, 5 minutes of break.");
                arrayList.add("Keep repeating this cycle. In each focus period, pick up a small part of your task.");
                arrayList.add("After 3 such cycles, you should take a longer break of around 25 minutes.");
                arrayList.add("With regular practise, you can gradually increase the duration of your focus periods.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T6A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("How to engage in attention chunking");
                arrayList.add("Pick a task you want to work on, and break it up into smaller components.");
                arrayList.add("Now, plan to split your attention between focus periods and break periods.");
                arrayList.add("When you start this exercise, your focus period should be 20 minutes long.");
                arrayList.add("In each 20-minute focus period, you should aim to complete a small part of your task.");
                arrayList.add("After 20 minutes, you can give yourself a 5 minute break where you do something else.");
                arrayList.add("This makes 1 cycle of attention chunking: 20 minutes of focus, 5 minutes of break.");
                arrayList.add("Keep repeating this cycle. In each focus period, pick up a small part of your task.");
                arrayList.add("After 3 such cycles, you should take a longer break of around 25 minutes.");
                arrayList.add("With regular practise, you can gradually increase the duration of your focus periods.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T6A)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("How to engage in attention chunking");
                arrayList.add("Pick a task you want to work on, and break it up into smaller components.");
                arrayList.add("Now, plan to split your attention between focus periods and break periods.");
                arrayList.add("When you start this exercise, your focus period should be 20 minutes long.");
                arrayList.add("In each 20-minute focus period, you should aim to complete a small part of your task.");
                arrayList.add("After 20 minutes, you can give yourself a 5 minute break where you do something else.");
                arrayList.add("This makes 1 cycle of attention chunking: 20 minutes of focus, 5 minutes of break.");
                arrayList.add("Keep repeating this cycle. In each focus period, pick up a small part of your task.");
                arrayList.add("After 3 such cycles, you should take a longer break of around 25 minutes.");
                arrayList.add("With regular practise, you can gradually increase the duration of your focus periods.");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_TAE)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("Here are some guidelines that can help you be mindful");
                arrayList.add("Bring your attention to the present moment and become aware of what is going on.");
                arrayList.add("You could focus on your breathing for 1 minute - notice how you inhale and exhale.");
                arrayList.add("You could also shift your attention to your body and notice any sensations.");
                arrayList.add("You can even spend your 1 minute of mindfulness observing the time ticking away.");
                arrayList.add("If your mind begins to wander, gently bring it back to what is happening right now.");
                arrayList.add("If a thought arises in your head - just acknowledge it, and let it be.");
                arrayList.add("Remember - mindfulness is about acceptance. You don't have to change anything!");
            }
            Iterator<String> it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                i6++;
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                View inflate = activity.getLayoutInflater().inflate(R.layout.row_screen_s3, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)), false);
                ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText(String.valueOf(i6));
                ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText(it.next());
                ((LinearLayout) _$_findCachedViewById(R.id.linearLayout)).addView(inflate);
            }
            ((Button) _$_findCachedViewById(R.id.button1)).setText("START");
            ((Button) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.r0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ s0 f15792v;

                {
                    this.f15792v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    s0 this$0 = this.f15792v;
                    switch (i10) {
                        case 0:
                            int i11 = s0.f15795w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        default:
                            int i12 = s0.f15795w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            if (activity3 != null) {
                                activity3.onBackPressed();
                                return;
                            }
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.imageView1)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.r0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ s0 f15792v;

                {
                    this.f15792v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    s0 this$0 = this.f15792v;
                    switch (i10) {
                        case 0:
                            int i11 = s0.f15795w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity2).t0();
                            return;
                        default:
                            int i12 = s0.f15795w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            if (activity3 != null) {
                                activity3.onBackPressed();
                                return;
                            }
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
