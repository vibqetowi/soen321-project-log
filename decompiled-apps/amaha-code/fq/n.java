package fq;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T1Activity;
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
/* compiled from: StaticResult3Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/n;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15763w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15765v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15764u = LogHelper.INSTANCE.makeLogTag(n.class);

    /* compiled from: StaticResult3Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends a5.f<Drawable> {
        public a() {
        }

        @Override // a5.h
        public final void f(Object obj) {
            ((ConstraintLayout) n.this._$_findCachedViewById(R.id.constraintLayout)).setBackground((Drawable) obj);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15765v;
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
        return inflater.inflate(R.layout.fragment_static_result3, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15765v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new a());
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            String stringExtra = activity.getIntent().getStringExtra(Constants.API_COURSE_LINK);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
            T1Activity t1Activity = (T1Activity) activity2;
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.text_1)).setText("Time Out");
                ((RobertoTextView) _$_findCachedViewById(R.id.text_2)).setText("In a nutshell...");
                ((RobertoTextView) _$_findCachedViewById(R.id.text_3)).setText("It's important to start somewhere, even if you start small! Engage in this activity when you take your time out.");
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("Edit");
                ((RobertoButton) _$_findCachedViewById(R.id.button)).setText("Next");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.text_1)).setText("Time Out");
                ((RobertoTextView) _$_findCachedViewById(R.id.text_2)).setText("In a nutshell...");
                ((RobertoTextView) _$_findCachedViewById(R.id.text_3)).setText("A short break might be all you need to keep your anger in check! This is the activity you will engage in when you take your time out.");
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("Edit");
                ((RobertoButton) _$_findCachedViewById(R.id.button)).setText("Next");
            }
            Object obj = t1Activity.B.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.d(activity3);
                View inflate = activity3.getLayoutInflater().inflate(R.layout.row_result_3, (ViewGroup) null);
                ((TextView) inflate.findViewById(R.id.textView)).setText((String) it.next());
                ((LinearLayout) _$_findCachedViewById(R.id.ll_list)).addView(inflate);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new j(t1Activity, 1));
            ((RobertoButton) _$_findCachedViewById(R.id.button)).setOnClickListener(new j(t1Activity, 2));
            ((ImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new j(t1Activity, 3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15764u, "exception on view created", e10);
        }
    }
}
