package fq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T4CActivity;
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
/* compiled from: StaticS18Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/c0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c0 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f15674v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15675u = new LinkedHashMap();

    public final void J(String str, ArrayList<String> arrayList) {
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llSubHeading)), false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            View view = (ConstraintLayout) inflate;
            ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).setText("Think of a place that is");
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.card_heading_margin_bottom);
            ViewGroup.LayoutParams layoutParams = ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            aVar.setMargins(0, 0, 0, 0);
            ((RobertoTextView) view.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            kotlin.jvm.internal.i.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
            view.setLayoutParams(layoutParams3);
            ((LinearLayout) _$_findCachedViewById(R.id.llSubHeading)).addView(view);
            Iterator<String> it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                i6++;
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate2 = activity2.getLayoutInflater().inflate(R.layout.row_single_text, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llSubHeading)), false);
                kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                View view2 = (ConstraintLayout) inflate2;
                ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).setText(i6 + ". " + it.next());
                ViewGroup.LayoutParams layoutParams4 = ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams4;
                aVar2.setMargins(0, 0, 0, 0);
                ((RobertoTextView) view2.findViewById(R.id.tvSingleLine)).setLayoutParams(aVar2);
                ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                kotlin.jvm.internal.i.e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                layoutParams6.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                view2.setLayoutParams(layoutParams6);
                ((LinearLayout) _$_findCachedViewById(R.id.llSubHeading)).addView(view2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15675u;
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
        return inflater.inflate(R.layout.fragment_static_s18, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15675u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T4CActivity");
        T4CActivity t4CActivity = (T4CActivity) activity;
        t4CActivity.getWindow().setSoftInputMode(32);
        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new x(1, this));
        ArrayList<String> arrayList = new ArrayList<>();
        Course courseById = FirebasePersistence.getInstance().getCourseById(defpackage.c.n());
        Bundle arguments = getArguments();
        kotlin.jvm.internal.i.d(arguments);
        String string = arguments.getString(Constants.API_COURSE_LINK);
        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
            defpackage.d.p(arrayList, "Special for you", "Serene and beautiful", "Free from distractions or noise", "Preferably in nature");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView32)).setText("Here are some guidelines that can help you choose a place");
            J("Think of a place that is", arrayList);
            ((EditText) _$_findCachedViewById(R.id.editText)).setHint("Note down the place here");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
            defpackage.d.p(arrayList, "Special for you", "Calm, quiet, and comfortable", "Full of people or objects you love", "Free from distractions or noise");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView32)).setText("Here are some guidelines that can help you choose a place");
            J("Think of a place that is", arrayList);
            ((EditText) _$_findCachedViewById(R.id.editText)).setHint("Note down the place here");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
            defpackage.c.B(arrayList, "Serene and beautiful", "Clean and cool", "Free from distractions or noise");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView32)).setText("Here are some guidelines that can help you choose a place");
            J("Think of a place that is", arrayList);
            ((EditText) _$_findCachedViewById(R.id.editText)).setHint("Note down the place here");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T4C)) {
            defpackage.c.B(arrayList, "Serene and beautiful", "Quiet and clean", "Free from distractions ");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView32)).setText("Here are some guidelines that can help you choose a place");
            J("Think of a place that is", arrayList);
            ((EditText) _$_findCachedViewById(R.id.editText)).setHint("Note down the place here");
        }
        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new x(2, t4CActivity));
        ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new ho.o(this, 15, t4CActivity));
    }
}
