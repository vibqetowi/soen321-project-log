package com.ifriend.ui.utils;

import android.animation.Animator;
import android.view.View;
import android.view.animation.Animation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Animations.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\n\u0010\b\u001a\u00020\u0004*\u00020\u0005J\n\u0010\t\u001a\u00020\u0004*\u00020\u0005J\n\u0010\n\u001a\u00020\u0004*\u00020\u0005J\n\u0010\u000b\u001a\u00020\u0004*\u00020\u0005J\n\u0010\f\u001a\u00020\u0004*\u00020\u0005J\n\u0010\r\u001a\u00020\u0004*\u00020\u0005J\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u0004*\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0010J\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010¨\u0006\u0015"}, d2 = {"Lcom/ifriend/ui/utils/Animations;", "", "()V", "changeAlphaTo", "", "Landroid/view/View;", "targetAlpha", "", "enterFromBottom", "enterFromTop", "exitToBottom", "exitToTop", "fadeIn", "fadeOut", "hideWithAnimation", "duration", "", "infiniteRotate", "iterationDuration", "showWithAnimation", "ToFinalStateListener", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Animations {
    public static final int $stable = 0;
    public static final Animations INSTANCE = new Animations();

    private Animations() {
    }

    public final void enterFromTop(final View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getParent() == null) {
            view.post(new Runnable() { // from class: com.ifriend.ui.utils.Animations$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Animations.enterFromTop$lambda$0(view);
                }
            });
            return;
        }
        view.setVisibility(0);
        view.setTranslationY(view.getTranslationY() - 300);
        view.clearAnimation();
        view.animate().translationY(0.0f).alpha(1.0f).setListener(new ToFinalStateListener(new Animations$enterFromTop$2(view))).setDuration(500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enterFromTop$lambda$0(View this_enterFromTop) {
        Intrinsics.checkNotNullParameter(this_enterFromTop, "$this_enterFromTop");
        INSTANCE.enterFromTop(this_enterFromTop);
    }

    public final void exitToTop(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().translationY(-300.0f).alpha(0.0f).setDuration(1000L);
    }

    public final void enterFromBottom(final View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.post(new Runnable() { // from class: com.ifriend.ui.utils.Animations$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Animations.enterFromBottom$lambda$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enterFromBottom$lambda$1(View this_enterFromBottom) {
        Intrinsics.checkNotNullParameter(this_enterFromBottom, "$this_enterFromBottom");
        this_enterFromBottom.setY(this_enterFromBottom.getY() + 300);
        this_enterFromBottom.animate().translationY(0.0f).alpha(1.0f).setDuration(1000L);
    }

    public final void exitToBottom(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().translationY(300.0f).alpha(0.0f).setDuration(1000L);
    }

    public final void fadeIn(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        changeAlphaTo(view, 1.0f);
    }

    public final void fadeOut(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        changeAlphaTo(view, 0.0f);
    }

    public final void changeAlphaTo(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        view.animate().alpha(f).setListener(new ToFinalStateListener(new Animations$changeAlphaTo$1(view, f))).setDuration(1000L);
    }

    public static /* synthetic */ void hideWithAnimation$default(Animations animations, View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        animations.hideWithAnimation(view, j);
    }

    public final void hideWithAnimation(final View view, long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.animate().alpha(0.0f).setListener(new Animator.AnimatorListener() { // from class: com.ifriend.ui.utils.Animations$hideWithAnimation$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                view.setVisibility(8);
            }
        }).setDuration(j);
    }

    public static /* synthetic */ void showWithAnimation$default(Animations animations, View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        animations.showWithAnimation(view, j);
    }

    public final void showWithAnimation(View view, long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(j).setListener(new ToFinalStateListener(new Animations$showWithAnimation$1(view))).start();
        view.setVisibility(0);
    }

    public static /* synthetic */ void infiniteRotate$default(Animations animations, View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 2000;
        }
        animations.infiniteRotate(view, j);
    }

    public final void infiniteRotate(final View view, final long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setRotation(0.0f);
        view.animate().rotation(-360.0f).setDuration(j).setListener(new Animator.AnimatorListener() { // from class: com.ifriend.ui.utils.Animations$infiniteRotate$1
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
                Animations.INSTANCE.infiniteRotate(view, j);
            }
        }).start();
    }

    /* compiled from: Animations.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/ui/utils/Animations$ToFinalStateListener;", "Landroid/animation/Animator$AnimatorListener;", "toFinalState", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onAnimationCancel", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ToFinalStateListener implements Animator.AnimatorListener {
        public static final int $stable = 0;
        private final Function0<Unit> toFinalState;

        public ToFinalStateListener() {
            this(null, 1, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Animations.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.ui.utils.Animations$ToFinalStateListener$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        public ToFinalStateListener(Function0<Unit> toFinalState) {
            Intrinsics.checkNotNullParameter(toFinalState, "toFinalState");
            this.toFinalState = toFinalState;
        }

        public /* synthetic */ ToFinalStateListener(AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.toFinalState.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.toFinalState.invoke();
        }
    }
}
