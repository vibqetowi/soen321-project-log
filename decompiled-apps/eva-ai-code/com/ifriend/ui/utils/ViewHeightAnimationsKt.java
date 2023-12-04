package com.ifriend.ui.utils;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ViewHeightAnimations.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u001aG\u0010\n\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"animateIncreasing", "Landroid/animation/ValueAnimator;", "Landroid/view/View;", "targetHeight", "", "duration", "", "onFinish", "Lkotlin/Function0;", "", "animateReducingAndGone", "fromHeight", "restoreSizeAfterAnimation", "", "(Landroid/view/View;Ljava/lang/Integer;IJZLkotlin/jvm/functions/Function0;)Landroid/animation/ValueAnimator;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewHeightAnimationsKt {
    public static final ValueAnimator animateReducingAndGone(final View view, Integer num, final int i, long j, final boolean z, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        final int intValue = num != null ? num.intValue() : view.getMeasuredHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(intValue, i);
        Intrinsics.checkNotNull(ofInt);
        ValueAnimator valueAnimator = ofInt;
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ifriend.ui.utils.ViewHeightAnimationsKt$animateReducingAndGone$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i;
                    view2.setLayoutParams(layoutParams);
                    Function0 function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        });
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ifriend.ui.utils.ViewHeightAnimationsKt$animateReducingAndGone$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                view.setVisibility(8);
                if (z) {
                    View view2 = view;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = intValue;
                    view2.setLayoutParams(layoutParams);
                }
                Function0 function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.ifriend.ui.utils.ViewHeightAnimationsKt$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ViewHeightAnimationsKt.animateReducingAndGone$lambda$5(view, valueAnimator2);
            }
        });
        ofInt.setDuration(j);
        ofInt.start();
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateReducingAndGone$lambda$5(View this_animateReducingAndGone, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this_animateReducingAndGone, "$this_animateReducingAndGone");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = this_animateReducingAndGone.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = intValue;
            this_animateReducingAndGone.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static /* synthetic */ ValueAnimator animateIncreasing$default(View view, int i, long j, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        return animateIncreasing(view, i, j, function0);
    }

    public static final ValueAnimator animateIncreasing(final View view, final int i, long j, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getMeasuredHeight(), i);
        Intrinsics.checkNotNull(ofInt);
        ValueAnimator valueAnimator = ofInt;
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ifriend.ui.utils.ViewHeightAnimationsKt$animateIncreasing$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                Function0 function02 = Function0.this;
                if (function02 != null) {
                    function02.invoke();
                }
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i;
                    view2.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        });
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ifriend.ui.utils.ViewHeightAnimationsKt$animateIncreasing$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                Function0 function02 = Function0.this;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.ifriend.ui.utils.ViewHeightAnimationsKt$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ViewHeightAnimationsKt.animateIncreasing$lambda$10(view, valueAnimator2);
            }
        });
        ofInt.setDuration(j);
        ofInt.start();
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateIncreasing$lambda$10(View this_animateIncreasing, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this_animateIncreasing, "$this_animateIncreasing");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = this_animateIncreasing.getLayoutParams();
        layoutParams.height = intValue;
        this_animateIncreasing.setLayoutParams(layoutParams);
    }
}
