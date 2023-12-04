package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnapperFlingBehavior$performDecayFling$2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
    final /* synthetic */ boolean $canSpringThenFling;
    final /* synthetic */ Ref.FloatRef $lastValue;
    final /* synthetic */ int $targetIndex;
    final /* synthetic */ ScrollScope $this_performDecayFling;
    final /* synthetic */ Ref.FloatRef $velocityLeft;
    final /* synthetic */ SnapperFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior$performDecayFling$2(Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.FloatRef floatRef2, SnapperFlingBehavior snapperFlingBehavior, boolean z, int i) {
        super(1);
        this.$lastValue = floatRef;
        this.$this_performDecayFling = scrollScope;
        this.$velocityLeft = floatRef2;
        this.this$0 = snapperFlingBehavior;
        this.$canSpringThenFling = z;
        this.$targetIndex = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        invoke2(animationScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AnimationScope<Float, AnimationVector1D> animateDecay) {
        SnapperLayoutInfo snapperLayoutInfo;
        boolean performSnapBackIfNeeded;
        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
        float floatValue = animateDecay.getValue().floatValue() - this.$lastValue.element;
        float scrollBy = this.$this_performDecayFling.scrollBy(floatValue);
        this.$lastValue.element = animateDecay.getValue().floatValue();
        this.$velocityLeft.element = animateDecay.getVelocity().floatValue();
        if (Math.abs(floatValue - scrollBy) > 0.5f) {
            animateDecay.cancelAnimation();
        }
        snapperLayoutInfo = this.this$0.layoutInfo;
        SnapperLayoutItemInfo currentItem = snapperLayoutInfo.getCurrentItem();
        if (currentItem == null) {
            animateDecay.cancelAnimation();
            return;
        }
        if (animateDecay.isRunning() && this.$canSpringThenFling) {
            if (animateDecay.getVelocity().floatValue() > 0.0f && currentItem.getIndex() == this.$targetIndex - 1) {
                animateDecay.cancelAnimation();
            } else if (animateDecay.getVelocity().floatValue() < 0.0f && currentItem.getIndex() == this.$targetIndex) {
                animateDecay.cancelAnimation();
            }
        }
        if (animateDecay.isRunning()) {
            performSnapBackIfNeeded = this.this$0.performSnapBackIfNeeded(animateDecay, currentItem, this.$targetIndex, new AnonymousClass1(this.$this_performDecayFling));
            if (performSnapBackIfNeeded) {
                animateDecay.cancelAnimation();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapperFlingBehavior.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.view.common.SnapperFlingBehavior$performDecayFling$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Float, Float> {
        AnonymousClass1(Object obj) {
            super(1, obj, ScrollScope.class, "scrollBy", "scrollBy(F)F", 0);
        }

        public final Float invoke(float f) {
            return Float.valueOf(((ScrollScope) this.receiver).scrollBy(f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }
}
