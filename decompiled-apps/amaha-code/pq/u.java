package pq;

import android.animation.Animator;
import android.animation.ObjectAnimator;
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
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionMasterySeparatorPromptFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpq/u;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f28824w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f28826v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28825u = LogHelper.INSTANCE.makeLogTag(u.class);

    /* compiled from: DepressionMasterySeparatorPromptFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            u uVar = u.this;
            RobertoButton robertoButton = (RobertoButton) uVar._$_findCachedViewById(R.id.a4ButtonCTA);
            if (robertoButton != null) {
                robertoButton.setAlpha(1.0f);
            }
            RobertoButton robertoButton2 = (RobertoButton) uVar._$_findCachedViewById(R.id.a4ButtonCTA);
            if (robertoButton2 != null) {
                robertoButton2.setOnClickListener(new t(uVar, 3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            u uVar = u.this;
            RobertoButton robertoButton = (RobertoButton) uVar._$_findCachedViewById(R.id.a4ButtonCTA);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new t(uVar, 2));
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

    public final void J() {
        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(0);
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(8);
        ((ConstraintLayout) _$_findCachedViewById(R.id.a4Parent)).setOnClickListener(new t(this, 1));
        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setOnClickListener(null);
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f28826v;
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
        this.f28826v.clear();
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
            int i6 = requireArguments().getInt("prompt");
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setVisibility(0);
                            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                            ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_mastery_brain_bulb);
                            ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionMasteryBrHeader4));
                            ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionMasteryBrSubheader4));
                            ((ConstraintLayout) _$_findCachedViewById(R.id.a4Parent)).setOnClickListener(null);
                            ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(8);
                            ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(0);
                            ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(8);
                            ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(0);
                            ((ConstraintLayout) _$_findCachedViewById(R.id.a4Parent)).setOnClickListener(null);
                            ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setText(getString(R.string.depressionMasteryBrCTA4));
                            ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA), "alpha", 0.0f, 1.0f);
                            ofFloat.setDuration(600L);
                            ofFloat.setStartDelay(500L);
                            ofFloat.addListener(new a());
                            ofFloat.start();
                        }
                    } else {
                        ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.depressionMasteryBrPrompt3));
                        ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_mastery_brain_bulb);
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionMasteryBrHeader3));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionMasteryBrText3));
                        ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(0);
                        ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(8);
                        J();
                    }
                } else {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_mastery_brain_bulb);
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionMasteryBrHeader2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionMasteryBrText2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(0);
                    ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(8);
                    J();
                }
            } else {
                ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                ((AppCompatImageView) _$_findCachedViewById(R.id.a4Image)).setImageResource(R.drawable.ic_mastery_star_shooting);
                ((RobertoTextView) _$_findCachedViewById(R.id.a4Title)).setText(getString(R.string.depressionMasteryBrHeader1));
                ((RobertoTextView) _$_findCachedViewById(R.id.a4description)).setText(getString(R.string.depressionMasteryBrText1));
                ((RobertoTextView) _$_findCachedViewById(R.id.a4BottomCTA)).setVisibility(0);
                ((RobertoButton) _$_findCachedViewById(R.id.a4ButtonCTA)).setVisibility(8);
                J();
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.prompt)).getPaintFlags() | 8);
            ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setOnClickListener(new t(this, 0));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28825u, e10);
        }
    }
}
