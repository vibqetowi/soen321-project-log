package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T4CActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticResult4Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/p;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f15777v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15778u = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15778u;
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
        return inflater.inflate(R.layout.fragment_result4, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15778u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T4CActivity");
        T4CActivity t4CActivity = (T4CActivity) activity;
        Course courseById = FirebasePersistence.getInstance().getCourseById(defpackage.c.n());
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        String stringExtra = activity2.getIntent().getStringExtra(Constants.API_COURSE_LINK);
        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("You are ready to use your imagination!");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your happy place is");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("It's time for you to visualise this place. Spend 10 minutes focussing on as many details as possible. Breathe in and out while you imagine yourself here. Allow yourself to relax and unwind.");
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("Edit");
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("Next");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("Your safe space is ready for you!");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("The place you have chosen is");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Now, spend some time visualising this place. Imagine yourself there, and focus on the details of the place. Take in all that the place is offering. You could also try deep breathing alongside.");
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("Edit");
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("Next");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("You are ready to visualise!");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your peaceful place is");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Now, visualise this place. Focus on as many details as you can - pay attention to your senses. Spend at least 10 minutes visiting this place. You can also try deep breathing alongside.");
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("Edit");
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("Next");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("You are ready to visualise!");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your peaceful place is");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView4)).setText("Close your eyes and imagine that you are in this place. Focus on as many details as you can. Spend at least 10 minutes thinking about it. You can also try breathing deeply to feel calm.");
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("Edit");
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("Next");
        }
        if (t4CActivity.C.get("list") != null) {
            Object obj = t4CActivity.C.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText((CharSequence) ((ArrayList) obj).get(0));
        }
        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.o

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f15771v;

            {
                this.f15771v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                p this$0 = this.f15771v;
                switch (i6) {
                    case 0:
                        int i10 = p.f15777v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        kotlin.jvm.internal.i.d(activity3);
                        activity3.onBackPressed();
                        return;
                    case 1:
                        int i11 = p.f15777v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity4 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity4).t0();
                        return;
                    default:
                        int i12 = p.f15777v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity5 = this$0.getActivity();
                        if (activity5 != null) {
                            activity5.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.o

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f15771v;

            {
                this.f15771v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                p this$0 = this.f15771v;
                switch (i6) {
                    case 0:
                        int i10 = p.f15777v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        kotlin.jvm.internal.i.d(activity3);
                        activity3.onBackPressed();
                        return;
                    case 1:
                        int i11 = p.f15777v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity4 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity4).t0();
                        return;
                    default:
                        int i12 = p.f15777v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity5 = this$0.getActivity();
                        if (activity5 != null) {
                            activity5.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.o

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ p f15771v;

            {
                this.f15771v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                p this$0 = this.f15771v;
                switch (i6) {
                    case 0:
                        int i10 = p.f15777v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        kotlin.jvm.internal.i.d(activity3);
                        activity3.onBackPressed();
                        return;
                    case 1:
                        int i11 = p.f15777v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity4 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity4).t0();
                        return;
                    default:
                        int i12 = p.f15777v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity5 = this$0.getActivity();
                        if (activity5 != null) {
                            activity5.onBackPressed();
                            return;
                        }
                        return;
                }
            }
        });
    }
}
