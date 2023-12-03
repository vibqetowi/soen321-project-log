package mq;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.x;
import g0.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionExercisePlanSelectFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/k;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f25699z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f25694u = LogHelper.INSTANCE.makeLogTag(k.class);

    /* renamed from: v  reason: collision with root package name */
    public final Integer[] f25695v = {Integer.valueOf((int) R.drawable.ic_exercise_beginner), Integer.valueOf((int) R.drawable.ic_exercise_moderate), Integer.valueOf((int) R.drawable.ic_exercise_advanced)};

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f25696w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public String f25697x = "";

    /* renamed from: y  reason: collision with root package name */
    public int f25698y = -1;

    public final void J() {
        ArrayList<String> arrayList = this.f25696w;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View inflate = getLayoutInflater().inflate(R.layout.row_screen_a6_radio_img, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            inflate.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(activity, R.color.white)));
            ((AppCompatImageView) inflate.findViewById(R.id.rowImage)).setImageResource(this.f25695v[i6].intValue());
            ((RobertoTextView) inflate.findViewById(R.id.rowText)).setText(arrayList.get(i6));
            ((RadioButton) inflate.findViewById(R.id.radioToggle)).setVisibility(0);
            ((RadioButton) inflate.findViewById(R.id.radioToggle)).setClickable(false);
            ((ConstraintLayout) inflate.findViewById(R.id.parentLayout)).setOnClickListener(new to.b(inflate, this, i6, 3));
            ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f25699z;
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
        return inflater.inflate(R.layout.fragment_screen_a6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f25699z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a6ScrollView = (ScrollView) _$_findCachedViewById(R.id.a6ScrollView);
            kotlin.jvm.internal.i.f(a6ScrollView, "a6ScrollView");
            insetsUtils.addStatusBarHeight(a6ScrollView);
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesPlanSelectHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionExercisesPlanSelectSubHead));
            ArrayList<String> arrayList = this.f25696w;
            arrayList.add(getString(R.string.depressionExercisesPlanSelectOption1));
            arrayList.add(getString(R.string.depressionExercisesPlanSelectOption2));
            arrayList.add(getString(R.string.depressionExercisesPlanSelectOption3));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionExercisesPlanSelectCTA));
            J();
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            Object obj = g0.a.f16164a;
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(context, R.drawable.button_border_gray));
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new x(6, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25694u, e10);
        }
    }
}
