package nq;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionGoodthingsImportanceFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnq/h;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f26732v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f26731u = LogHelper.INSTANCE.makeLogTag(h.class);

    /* compiled from: DepressionGoodthingsImportanceFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            h hVar = h.this;
            ConstraintLayout constraintLayout = (ConstraintLayout) hVar._$_findCachedViewById(R.id.a4Parent);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new f(hVar, 1));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
        }
    }

    public final void J() {
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(0);
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setText(getString(R.string.conditionDetailsWorryButtonText));
        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(8);
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setStartDelay(1000L);
        ofFloat.addListener(new g(this));
        ofFloat.start();
    }

    public final void K() {
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(8);
        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(0);
        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setText(getString(R.string.goodthingsTapContinue));
        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA), "alpha", 0.0f, 0.3f);
        ofFloat.setDuration(600L);
        ofFloat.setStartDelay(1000L);
        ofFloat.addListener(new a());
        ofFloat.start();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26732v;
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
        return inflater.inflate(R.layout.fragment_screen_a4, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f26732v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            AppCompatImageView a4Image = (AppCompatImageView) _$_findCachedViewById(R.id.a4Image);
            kotlin.jvm.internal.i.f(a4Image, "a4Image");
            insetsUtils.addStatusBarHeight(a4Image);
            ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_a4_3gt_lightbulb);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
            int i6 = ((DepressionGoodthingsActivity) activity).f10364w;
            if (i6 != 9) {
                if (i6 == 10) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.goodthingsReflect2Header));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.goodthingsReflect2Subheader));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    J();
                }
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.goodthingsReflect1Header));
                ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.goodthingsReflect1Subheader));
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                K();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26731u, e10);
        }
    }
}
