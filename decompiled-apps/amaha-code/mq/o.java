package mq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.x;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionExerciseResult1Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/o;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f25710w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f25712v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f25711u = LogHelper.INSTANCE.makeLogTag(o.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f25712v;
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
        return inflater.inflate(R.layout.fragment_screen_a_result1_new, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f25712v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView result1Title = (RobertoTextView) _$_findCachedViewById(R.id.result1Title);
            kotlin.jvm.internal.i.f(result1Title, "result1Title");
            insetsUtils.addStatusBarHeight(result1Title);
            ((ConstraintLayout) _$_findCachedViewById(R.id.result1Background)).setBackgroundColor(g0.a.b(requireContext(), R.color.depression_mastery_purple));
            ((AppCompatImageView) _$_findCachedViewById(R.id.result1Image)).setImageResource(R.drawable.ir_exercise_shoe);
            ((RobertoTextView) _$_findCachedViewById(R.id.result1Title)).setText(getString(R.string.depressionExercisesResult1Head));
            ((RobertoTextView) _$_findCachedViewById(R.id.result1Subtitle)).setText(getString(R.string.depressionExercisesResult1SubHead));
            ((RobertoButton) _$_findCachedViewById(R.id.result1ButtonCTA)).setText(getString(R.string.depressionExercisesResult1CTA));
            ((RobertoButton) _$_findCachedViewById(R.id.result1ButtonCTA)).setOnClickListener(new x(7, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25711u, e10);
        }
    }
}
