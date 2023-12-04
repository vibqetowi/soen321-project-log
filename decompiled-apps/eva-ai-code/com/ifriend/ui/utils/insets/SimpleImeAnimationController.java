package com.ifriend.ui.utils.insets;

import android.os.CancellationSignal;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationControllerCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.DynamicAnimationKt;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.keychain.KeychainModule;
import com.ifriend.ui.utils.insets.SimpleImeAnimationController$animationControlListener$2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* compiled from: SimpleImeAnimationController.kt */
@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0013J\u0006\u0010\u001c\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u000eJ\u0006\u0010#\u001a\u00020\u000eJ\u0006\u0010$\u001a\u00020\u000eJ\u0010\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\fH\u0002J\b\u0010'\u001a\u00020\u0013H\u0002J\u0016\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u0017J&\u0010+\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ifriend/ui/utils/insets/SimpleImeAnimationController;", "", "()V", "animationControlListener", "com/ifriend/ui/utils/insets/SimpleImeAnimationController$animationControlListener$2$1", "getAnimationControlListener", "()Lcom/ifriend/ui/utils/insets/SimpleImeAnimationController$animationControlListener$2$1;", "animationControlListener$delegate", "Lkotlin/Lazy;", "currentSpringAnimation", "Landroidx/dynamicanimation/animation/SpringAnimation;", "insetsAnimationController", "Landroidx/core/view/WindowInsetsAnimationControllerCompat;", "isImeShownAtStart", "", "pendingRequestCancellationSignal", "Landroid/os/CancellationSignal;", "pendingRequestOnReady", "Lkotlin/Function1;", "", "animateImeToVisibility", "visible", "velocityY", "", "(ZLjava/lang/Float;)V", "animateToFinish", "(Ljava/lang/Float;)V", KeychainModule.AuthPromptOptions.CANCEL, "finish", "insetBy", "", "dy", "insetTo", "inset", "isInsetAnimationFinishing", "isInsetAnimationInProgress", "isInsetAnimationRequestPending", "onRequestReady", "controller", "reset", "startAndFling", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "startControlRequest", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SimpleImeAnimationController {
    private final Lazy animationControlListener$delegate = LazyKt.lazy(new SimpleImeAnimationController$animationControlListener$2(this));
    private SpringAnimation currentSpringAnimation;
    private WindowInsetsAnimationControllerCompat insetsAnimationController;
    private boolean isImeShownAtStart;
    private CancellationSignal pendingRequestCancellationSignal;
    private Function1<? super WindowInsetsAnimationControllerCompat, Unit> pendingRequestOnReady;

    private final SimpleImeAnimationController$animationControlListener$2.AnonymousClass1 getAnimationControlListener() {
        return (SimpleImeAnimationController$animationControlListener$2.AnonymousClass1) this.animationControlListener$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startControlRequest$default(SimpleImeAnimationController simpleImeAnimationController, View view, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        simpleImeAnimationController.startControlRequest(view, function1);
    }

    public final void startControlRequest(View view, Function1<? super WindowInsetsAnimationControllerCompat, Unit> function1) {
        LinearInterpolator linearInterpolator;
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z = true;
        if (!(!isInsetAnimationInProgress())) {
            throw new IllegalStateException("Animation in progress. Can not start a new request to controlWindowInsetsAnimation()".toString());
        }
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
        if (rootWindowInsets == null || !rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime())) {
            z = false;
        }
        this.isImeShownAtStart = z;
        this.pendingRequestCancellationSignal = new CancellationSignal();
        this.pendingRequestOnReady = function1;
        WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(view);
        if (windowInsetsController != null) {
            int ime = WindowInsetsCompat.Type.ime();
            linearInterpolator = SimpleImeAnimationControllerKt.linearInterpolator;
            windowInsetsController.controlWindowInsetsAnimation(ime, -1L, linearInterpolator, this.pendingRequestCancellationSignal, getAnimationControlListener());
        }
    }

    public final void startAndFling(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        startControlRequest(view, new SimpleImeAnimationController$startAndFling$1(this, f));
    }

    public final int insetBy(int i) {
        WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = this.insetsAnimationController;
        if (windowInsetsAnimationControllerCompat == null) {
            return 0;
        }
        return insetTo(windowInsetsAnimationControllerCompat.getCurrentInsets().bottom - i);
    }

    public final int insetTo(int i) {
        WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = this.insetsAnimationController;
        if (windowInsetsAnimationControllerCompat == null) {
            return 0;
        }
        int i2 = windowInsetsAnimationControllerCompat.getHiddenStateInsets().bottom;
        int i3 = windowInsetsAnimationControllerCompat.getShownStateInsets().bottom;
        boolean z = this.isImeShownAtStart;
        int i4 = z ? i3 : i2;
        int i5 = z ? i2 : i3;
        int coerceIn = RangesKt.coerceIn(i, i2, i3);
        int i6 = windowInsetsAnimationControllerCompat.getCurrentInsets().bottom - coerceIn;
        windowInsetsAnimationControllerCompat.setInsetsAndAlpha(Insets.of(0, 0, 0, coerceIn), 1.0f, (coerceIn - i4) / (i5 - i4));
        return i6;
    }

    public final boolean isInsetAnimationInProgress() {
        return this.insetsAnimationController != null;
    }

    public final boolean isInsetAnimationFinishing() {
        return this.currentSpringAnimation != null;
    }

    public final boolean isInsetAnimationRequestPending() {
        return this.pendingRequestCancellationSignal != null;
    }

    public final void cancel() {
        WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = this.insetsAnimationController;
        if (windowInsetsAnimationControllerCompat != null) {
            windowInsetsAnimationControllerCompat.finish(this.isImeShownAtStart);
        }
        CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        SpringAnimation springAnimation = this.currentSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        reset();
    }

    public final void finish() {
        WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = this.insetsAnimationController;
        if (windowInsetsAnimationControllerCompat == null) {
            CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        int i = windowInsetsAnimationControllerCompat.getCurrentInsets().bottom;
        int i2 = windowInsetsAnimationControllerCompat.getShownStateInsets().bottom;
        int i3 = windowInsetsAnimationControllerCompat.getHiddenStateInsets().bottom;
        if (i == i2) {
            windowInsetsAnimationControllerCompat.finish(true);
        } else if (i == i3) {
            windowInsetsAnimationControllerCompat.finish(false);
        } else if (windowInsetsAnimationControllerCompat.getCurrentFraction() >= 0.15f) {
            windowInsetsAnimationControllerCompat.finish(!this.isImeShownAtStart);
        } else {
            windowInsetsAnimationControllerCompat.finish(this.isImeShownAtStart);
        }
    }

    public static /* synthetic */ void animateToFinish$default(SimpleImeAnimationController simpleImeAnimationController, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        simpleImeAnimationController.animateToFinish(f);
    }

    public final void animateToFinish(Float f) {
        WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = this.insetsAnimationController;
        if (windowInsetsAnimationControllerCompat == null) {
            CancellationSignal cancellationSignal = this.pendingRequestCancellationSignal;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
                return;
            }
            return;
        }
        int i = windowInsetsAnimationControllerCompat.getCurrentInsets().bottom;
        int i2 = windowInsetsAnimationControllerCompat.getShownStateInsets().bottom;
        int i3 = windowInsetsAnimationControllerCompat.getHiddenStateInsets().bottom;
        if (f != null) {
            animateImeToVisibility(f.floatValue() > 0.0f, f);
        } else if (i == i2) {
            windowInsetsAnimationControllerCompat.finish(true);
        } else if (i == i3) {
            windowInsetsAnimationControllerCompat.finish(false);
        } else if (windowInsetsAnimationControllerCompat.getCurrentFraction() >= 0.15f) {
            animateImeToVisibility$default(this, !this.isImeShownAtStart, null, 2, null);
        } else {
            animateImeToVisibility$default(this, this.isImeShownAtStart, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequestReady(WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat) {
        this.pendingRequestCancellationSignal = null;
        this.insetsAnimationController = windowInsetsAnimationControllerCompat;
        Function1<? super WindowInsetsAnimationControllerCompat, Unit> function1 = this.pendingRequestOnReady;
        if (function1 != null) {
            function1.invoke(windowInsetsAnimationControllerCompat);
        }
        this.pendingRequestOnReady = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reset() {
        this.insetsAnimationController = null;
        this.pendingRequestCancellationSignal = null;
        this.isImeShownAtStart = false;
        SpringAnimation springAnimation = this.currentSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        this.currentSpringAnimation = null;
        this.pendingRequestOnReady = null;
    }

    static /* synthetic */ void animateImeToVisibility$default(SimpleImeAnimationController simpleImeAnimationController, boolean z, Float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = null;
        }
        simpleImeAnimationController.animateImeToVisibility(z, f);
    }

    private final void animateImeToVisibility(boolean z, Float f) {
        int i;
        WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = this.insetsAnimationController;
        if (windowInsetsAnimationControllerCompat == null) {
            return;
        }
        SimpleImeAnimationController$animateImeToVisibility$1 simpleImeAnimationController$animateImeToVisibility$1 = new SimpleImeAnimationController$animateImeToVisibility$1(this);
        SimpleImeAnimationController$animateImeToVisibility$2 simpleImeAnimationController$animateImeToVisibility$2 = new SimpleImeAnimationController$animateImeToVisibility$2(windowInsetsAnimationControllerCompat);
        if (z) {
            i = windowInsetsAnimationControllerCompat.getShownStateInsets().bottom;
        } else {
            i = windowInsetsAnimationControllerCompat.getHiddenStateInsets().bottom;
        }
        SpringAnimation springAnimationOf = DynamicAnimationKt.springAnimationOf(simpleImeAnimationController$animateImeToVisibility$1, simpleImeAnimationController$animateImeToVisibility$2, i);
        if (springAnimationOf.getSpring() == null) {
            springAnimationOf.setSpring(new SpringForce());
        }
        SpringForce spring = springAnimationOf.getSpring();
        Intrinsics.checkExpressionValueIsNotNull(spring, "spring");
        spring.setDampingRatio(1.0f);
        spring.setStiffness(1500.0f);
        if (f != null) {
            springAnimationOf.setStartVelocity(f.floatValue());
        }
        springAnimationOf.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: com.ifriend.ui.utils.insets.SimpleImeAnimationController$$ExternalSyntheticLambda0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f2, float f3) {
                SimpleImeAnimationController.animateImeToVisibility$lambda$3$lambda$2(SimpleImeAnimationController.this, dynamicAnimation, z2, f2, f3);
            }
        });
        springAnimationOf.start();
        this.currentSpringAnimation = springAnimationOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateImeToVisibility$lambda$3$lambda$2(SimpleImeAnimationController this$0, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(dynamicAnimation, this$0.currentSpringAnimation)) {
            this$0.currentSpringAnimation = null;
        }
        this$0.finish();
    }
}
