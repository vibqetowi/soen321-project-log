package pq;

import android.animation.Animator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionMasteryPlanSeparatorFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpq/p;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class p extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f28809w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f28811v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28810u = LogHelper.INSTANCE.makeLogTag(p.class);

    /* compiled from: DepressionMasteryPlanSeparatorFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            ConstraintLayout constraintLayout = (ConstraintLayout) p.this._$_findCachedViewById(R.id.a21parent);
            if (constraintLayout != null) {
                constraintLayout.setEnabled(true);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    public final void J(RobertoTextView robertoTextView, long j10) {
        robertoTextView.setTranslationY(-20.0f);
        robertoTextView.animate().translationY(20.0f).alpha(1.0f).setDuration(1000L).setStartDelay(j10).start();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f28811v;
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
        return inflater.inflate(R.layout.fragment_screen_a21, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f28811v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
        kotlin.jvm.internal.i.f(header, "header");
        insetsUtils.addStatusBarHeight(header);
        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setAlpha(0.0f);
        ((RobertoTextView) _$_findCachedViewById(R.id.goalName)).setAlpha(0.0f);
        ((RobertoTextView) _$_findCachedViewById(R.id.subtitle)).setAlpha(0.0f);
        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionMasteryStartHeader));
        ((RobertoTextView) _$_findCachedViewById(R.id.goalName)).setText(getString(R.string.depressionMasteryStartTitle));
        ((RobertoTextView) _$_findCachedViewById(R.id.subtitle)).setText(getString(R.string.depressionMasteryStartSubheader));
        ((ConstraintLayout) _$_findCachedViewById(R.id.a21parent)).setOnClickListener(new fq.x(21, this));
        ((ConstraintLayout) _$_findCachedViewById(R.id.a21parent)).setEnabled(false);
        try {
            RobertoTextView header2 = (RobertoTextView) _$_findCachedViewById(R.id.header);
            kotlin.jvm.internal.i.f(header2, "header");
            J(header2, 600L);
            RobertoTextView goalName = (RobertoTextView) _$_findCachedViewById(R.id.goalName);
            kotlin.jvm.internal.i.f(goalName, "goalName");
            J(goalName, 600L);
            RobertoTextView subtitle = (RobertoTextView) _$_findCachedViewById(R.id.subtitle);
            kotlin.jvm.internal.i.f(subtitle, "subtitle");
            J(subtitle, 2000L);
            ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setAlpha(0.0f);
            ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).animate().alpha(0.34f).setStartDelay(3000L).setListener(new a()).start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28810u, e10);
        }
    }
}
