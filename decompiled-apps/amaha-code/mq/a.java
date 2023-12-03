package mq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.x;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionExerciseBreathingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/a;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f25669w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f25671v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f25670u = LogHelper.INSTANCE.makeLogTag(a.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f25671v;
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
        return inflater.inflate(R.layout.fragment_screen_a2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f25671v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView a2header = (RobertoTextView) _$_findCachedViewById(R.id.a2header);
            kotlin.jvm.internal.i.f(a2header, "a2header");
            insetsUtils.addStatusBarHeight(a2header);
            switch (requireArguments().getInt("breathing")) {
                case 1:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionExercisesBreathingHeader1));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                    break;
                case 2:
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                    if (((DepressionExerciseActivity) activity).B) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionExercisesBreathingSkipHeader2));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                        androidx.fragment.app.p activity2 = getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                        ((DepressionExerciseActivity) activity2).B = false;
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionExercisesBreathingHeader2));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                        break;
                    }
                case 3:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionExercisesBreathingHeader3));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                    break;
                case 4:
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                    if (((DepressionExerciseActivity) activity3).B) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionExercisesBreathingSkipHeader4));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                        androidx.fragment.app.p activity4 = getActivity();
                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                        ((DepressionExerciseActivity) activity4).B = false;
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionExercisesBreathingHeader4));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                        break;
                    }
                case 5:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionExercisesBreathingHeader5));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                    break;
                case 6:
                    androidx.fragment.app.p activity5 = getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                    if (((DepressionExerciseActivity) activity5).B) {
                        ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionExercisesBreathingSkipHeader6));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                        androidx.fragment.app.p activity6 = getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                        ((DepressionExerciseActivity) activity6).B = false;
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionExercisesBreathingHeader6));
                        ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                        break;
                    }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a2parent)).setOnClickListener(new x(5, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25670u, e10);
        }
    }
}
