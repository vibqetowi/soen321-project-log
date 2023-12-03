package rq;

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
/* compiled from: DepressionThoughtsReflectionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/i;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f30946x = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f30947u;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f30949w = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f30948v = LogHelper.INSTANCE.makeLogTag(i.class);

    /* compiled from: DepressionThoughtsReflectionFragment.kt */
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
            ConstraintLayout constraintLayout = (ConstraintLayout) i.this._$_findCachedViewById(R.id.a21parent);
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
        try {
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
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30948v, "Thoughts Reflection", e10);
        }
    }

    public final void K(RobertoTextView robertoTextView, long j10) {
        robertoTextView.setTranslationY(-20.0f);
        robertoTextView.animate().translationY(20.0f).alpha(1.0f).setDuration(1000L).setStartDelay(j10).start();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30949w;
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
        this.f30949w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            this.f30947u = requireArguments().getInt("Reflection");
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
            kotlin.jvm.internal.i.f(header, "header");
            insetsUtils.addStatusBarHeight(header);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a21parent)).setEnabled(false);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a21parent)).setOnClickListener(new qq.n(this, 9));
            int i6 = this.f30947u;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        String string = getString(R.string.depressionThoughtsReflectionHead3);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.depre…nThoughtsReflectionHead3)");
                        String string2 = getString(R.string.depressionThoughtsReflectionGoal3);
                        kotlin.jvm.internal.i.f(string2, "getString(R.string.depre…nThoughtsReflectionGoal3)");
                        String string3 = getString(R.string.depressionThoughtsRelectionSubtitle3);
                        kotlin.jvm.internal.i.f(string3, "getString(R.string.depre…oughtsRelectionSubtitle3)");
                        J(string, string2, string3);
                    }
                } else {
                    String string4 = getString(R.string.depressionThoughtsReflectionHead2);
                    kotlin.jvm.internal.i.f(string4, "getString(R.string.depre…nThoughtsReflectionHead2)");
                    String string5 = getString(R.string.depressionThoughtsReflectionGoal2);
                    kotlin.jvm.internal.i.f(string5, "getString(R.string.depre…nThoughtsReflectionGoal2)");
                    String string6 = getString(R.string.depressionThoughtsRelectionSubtitle2);
                    kotlin.jvm.internal.i.f(string6, "getString(R.string.depre…oughtsRelectionSubtitle2)");
                    J(string4, string5, string6);
                }
            } else {
                String string7 = getString(R.string.depressionThoughtsReflectionHead1);
                kotlin.jvm.internal.i.f(string7, "getString(R.string.depre…nThoughtsReflectionHead1)");
                String string8 = getString(R.string.depressionThoughtsReflectionGoal1);
                kotlin.jvm.internal.i.f(string8, "getString(R.string.depre…nThoughtsReflectionGoal1)");
                String string9 = getString(R.string.depressionThoughtsRelectionSubtitle1);
                kotlin.jvm.internal.i.f(string9, "getString(R.string.depre…oughtsRelectionSubtitle1)");
                J(string7, string8, string9);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30948v, "Thoughts Reflection", e10);
        }
    }
}
