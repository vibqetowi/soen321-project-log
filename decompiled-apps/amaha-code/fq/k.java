package fq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T1Activity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticResult15Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/k;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f15738z = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f15740v;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f15743y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15739u = LogHelper.INSTANCE.makeLogTag(k.class);

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<String> f15741w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f15742x = new ArrayList<>();

    @Override // rr.b
    public final boolean I() {
        int i6 = this.f15740v;
        if (i6 > 0) {
            this.f15740v = i6 - 1;
            J();
            return false;
        }
        return true;
    }

    public final void J() {
        String str;
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Text)).setVisibility(4);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Header)).setVisibility(4);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvR15Text);
            String str2 = "";
            if (this.f15740v >= this.f15741w.size()) {
                str = "";
            } else {
                str = this.f15741w.get(this.f15740v);
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvR15Header);
            int i6 = this.f15740v;
            ArrayList<String> arrayList = this.f15742x;
            if (i6 < arrayList.size()) {
                str2 = arrayList.get(this.f15740v);
            }
            robertoTextView2.setText(str2);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Text)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR15Header)).setVisibility(0);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15739u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15743y;
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
        return inflater.inflate(R.layout.fragment_static_result15, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15743y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            String stringExtra = activity.getIntent().getStringExtra(Constants.API_COURSE_LINK);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
            T1Activity t1Activity = (T1Activity) activity2;
            Object obj = t1Activity.B.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            this.f15741w = (ArrayList) obj;
            boolean b10 = kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS);
            ArrayList<String> arrayList = this.f15742x;
            if (b10 && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
                arrayList.add("Say the first affirmation 5 times, either out loud or in your mind");
                arrayList.add("Now, repeat this affirmation 5 times");
                arrayList.add("Finally, slowly repeat the last affirmation 5 times");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
                arrayList.add("Say this affirmation to yourself 5 times, with calm and ease");
                arrayList.add("Now, repeat this one 5 times - either out loud or in your mind");
                arrayList.add("Finally, slowly repeat this affirmation 5 times");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1H)) {
                arrayList.add("Say this affirmation to yourself 5 times");
                arrayList.add("Now, repeat this one 5 times - either out loud or in your mind");
                arrayList.add("Finally, slowly repeat this affirmation 5 times");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
                arrayList.add("Say this affirmation to yourself 5 times, with calm and ease");
                arrayList.add("Now, repeat this one 5 times - either out loud or in your mind");
                arrayList.add("Finally, slowly repeat this affirmation 5 times");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
                arrayList.add("Repeat this affirmation 5 times - either out loud or in your mind");
                arrayList.add("Now, repeat this one 5 times, with calm and ease");
                arrayList.add("Finally, slowly repeat this affirmation 5 times");
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setText("Next");
            ((RobertoButton) _$_findCachedViewById(R.id.btnR15Button)).setOnClickListener(new ho.o(this, 12, t1Activity));
            J();
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new j(t1Activity, 0));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15739u, "exception in on view created", e10);
        }
    }
}
