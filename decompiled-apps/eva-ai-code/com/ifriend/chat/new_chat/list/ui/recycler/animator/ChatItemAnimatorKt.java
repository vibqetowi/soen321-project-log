package com.ifriend.chat.new_chat.list.ui.recycler.animator;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.compose.material3.TooltipKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatItemAnimator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"playExperienceAnimation", "", "Landroid/view/View;", "hideAnimatorDelay", "", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatItemAnimatorKt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void playExperienceAnimation$default(View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = TooltipKt.TooltipDuration;
        }
        playExperienceAnimation(view, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playExperienceAnimation(final View view, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(duration, "setDuration(...)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationY", 40.0f, 0.0f).setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(duration2, "setDuration(...)");
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration, duration2);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.ifriend.chat.new_chat.list.ui.recycler.animator.ChatItemAnimatorKt$playExperienceAnimation$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                view.setAlpha(0.0f);
                view.setTranslationY(40.0f);
                view.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                view.setAlpha(1.0f);
                view.setTranslationY(0.0f);
            }
        });
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(500L);
        Intrinsics.checkNotNullExpressionValue(duration3, "setDuration(...)");
        duration3.setStartDelay(j);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(duration3);
        animatorSet3.addListener(new Animator.AnimatorListener() { // from class: com.ifriend.chat.new_chat.list.ui.recycler.animator.ChatItemAnimatorKt$playExperienceAnimation$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                view.setVisibility(8);
            }
        });
        animatorSet.playSequentially(animatorSet2, animatorSet3);
        animatorSet.start();
    }
}
