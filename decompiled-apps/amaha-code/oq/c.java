package oq;

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
import fq.x;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionHopeGoalFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq/c;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f27716w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f27718v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f27717u = LogHelper.INSTANCE.makeLogTag(c.class);

    /* compiled from: DepressionHopeGoalFragment.kt */
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
            ConstraintLayout constraintLayout = (ConstraintLayout) c.this._$_findCachedViewById(R.id.a21parent);
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

    public final void J(String str, String str2, String str3) {
        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setAlpha(0.0f);
        ((RobertoTextView) _$_findCachedViewById(R.id.goalName)).setAlpha(0.0f);
        ((RobertoTextView) _$_findCachedViewById(R.id.subtitle)).setAlpha(0.0f);
        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(str);
        ((RobertoTextView) _$_findCachedViewById(R.id.goalName)).setText(str2);
        ((RobertoTextView) _$_findCachedViewById(R.id.subtitle)).setText(str3);
        RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
        kotlin.jvm.internal.i.f(header, "header");
        K(header, 600L);
        RobertoTextView goalName = (RobertoTextView) _$_findCachedViewById(R.id.goalName);
        kotlin.jvm.internal.i.f(goalName, "goalName");
        K(goalName, 600L);
        RobertoTextView subtitle = (RobertoTextView) _$_findCachedViewById(R.id.subtitle);
        kotlin.jvm.internal.i.f(subtitle, "subtitle");
        K(subtitle, 2000L);
        ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setAlpha(0.0f);
        ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).animate().alpha(0.34f).setStartDelay(3000L).setListener(new a()).start();
    }

    public final void K(RobertoTextView robertoTextView, long j10) {
        robertoTextView.setTranslationY(-20.0f);
        robertoTextView.animate().translationY(20.0f).alpha(1.0f).setDuration(1000L).setStartDelay(j10).start();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f27718v;
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
        this.f27718v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((ConstraintLayout) _$_findCachedViewById(R.id.a21parent)).setEnabled(false);
            String string = getString(R.string.depressionHopeGoalHead);
            kotlin.jvm.internal.i.f(string, "getString(R.string.depressionHopeGoalHead)");
            String string2 = getString(R.string.depressionHopeGoalSubHead);
            kotlin.jvm.internal.i.f(string2, "getString(R.string.depressionHopeGoalSubHead)");
            String string3 = getString(R.string.depressionHopeGoalDescription);
            kotlin.jvm.internal.i.f(string3, "getString(R.string.depressionHopeGoalDescription)");
            J(string, string2, string3);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a21parent)).setOnClickListener(new x(14, this));
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
            kotlin.jvm.internal.i.f(header, "header");
            insetsUtils.addStatusBarHeight(header);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f27717u, e10);
        }
    }
}
