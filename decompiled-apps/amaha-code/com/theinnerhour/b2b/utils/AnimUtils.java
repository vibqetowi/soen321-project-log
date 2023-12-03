package com.theinnerhour.b2b.utils;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.Metadata;
/* compiled from: AnimUtils.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tJ\u0018\u0010\u0011\u001a\u00020\r*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0018\u0010\u0011\u001a\u00020\u0012*\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/utils/AnimUtils;", "", "Landroid/view/View;", "view", "", "duration", "", "scaleX", "scaleY", "", "repeatCount", "Landroid/animation/AnimatorSet;", "showPulseEffect", "Landroid/view/ViewPropertyAnimator;", "Lkotlin/Function0;", "Lhs/k;", "doThis", "onEnd", "Landroid/animation/ObjectAnimator;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AnimUtils {
    public static final AnimUtils INSTANCE = new AnimUtils();

    private AnimUtils() {
    }

    public static /* synthetic */ AnimatorSet showPulseEffect$default(AnimUtils animUtils, View view, long j10, float f, float f2, int i6, int i10, Object obj) {
        float f10;
        float f11;
        int i11;
        if ((i10 & 4) != 0) {
            f10 = 1.2f;
        } else {
            f10 = f;
        }
        if ((i10 & 8) != 0) {
            f11 = 1.2f;
        } else {
            f11 = f2;
        }
        if ((i10 & 16) != 0) {
            i11 = -1;
        } else {
            i11 = i6;
        }
        return animUtils.showPulseEffect(view, j10, f10, f11, i11);
    }

    public final ViewPropertyAnimator onEnd(ViewPropertyAnimator viewPropertyAnimator, final ss.a<hs.k> doThis) {
        kotlin.jvm.internal.i.g(viewPropertyAnimator, "<this>");
        kotlin.jvm.internal.i.g(doThis, "doThis");
        viewPropertyAnimator.setListener(new Animator.AnimatorListener() { // from class: com.theinnerhour.b2b.utils.AnimUtils$onEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                kotlin.jvm.internal.i.g(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                kotlin.jvm.internal.i.g(animation, "animation");
                doThis.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                kotlin.jvm.internal.i.g(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                kotlin.jvm.internal.i.g(animation, "animation");
            }
        });
        return viewPropertyAnimator;
    }

    public final AnimatorSet showPulseEffect(View view, long j10, float f, float f2, int i6) {
        kotlin.jvm.internal.i.g(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 0.0f);
        ofFloat.setDuration(j10);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, f);
        ofFloat2.setDuration(j10);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, f2);
        ofFloat3.setDuration(j10);
        AnimatorSet animatorSet = new AnimatorSet();
        ofFloat.setRepeatCount(i6);
        ofFloat2.setRepeatCount(i6);
        ofFloat3.setRepeatCount(i6);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.start();
        return animatorSet;
    }

    public final ObjectAnimator onEnd(ObjectAnimator objectAnimator, final ss.a<hs.k> doThis) {
        kotlin.jvm.internal.i.g(objectAnimator, "<this>");
        kotlin.jvm.internal.i.g(doThis, "doThis");
        objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.theinnerhour.b2b.utils.AnimUtils$onEnd$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                kotlin.jvm.internal.i.g(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                kotlin.jvm.internal.i.g(animation, "animation");
                doThis.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                kotlin.jvm.internal.i.g(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                kotlin.jvm.internal.i.g(animation, "animation");
            }
        });
        return objectAnimator;
    }
}
