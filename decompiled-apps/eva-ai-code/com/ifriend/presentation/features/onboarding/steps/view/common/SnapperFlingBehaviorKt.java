package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0087\b¢\u0006\u0002\u0010\t\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0002\u0010\f\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2<\u0010\r\u001a8\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"rememberSnapperFlingBehavior", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperFlingBehavior;", "layoutInfo", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "springAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperFlingBehavior;", "maximumFlingDistance", "Lkotlin/Function1;", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperFlingBehavior;", "snapIndex", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperFlingBehavior;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnapperFlingBehaviorKt {
    public static final SnapperFlingBehavior rememberSnapperFlingBehavior(SnapperLayoutInfo layoutInfo, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Function3<? super SnapperLayoutInfo, ? super Integer, ? super Integer, Integer> snapIndex, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
        composer.startReplaceableGroup(-752303351);
        ComposerKt.sourceInformation(composer, "C(rememberSnapperFlingBehavior)P(1!1,3)");
        if ((i2 & 2) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i2 & 4) != 0) {
            animationSpec = SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-752303351, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.rememberSnapperFlingBehavior (SnapperFlingBehavior.kt:74)");
        }
        Object[] objArr = {layoutInfo, decayAnimationSpec, animationSpec, snapIndex};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnapperFlingBehavior(layoutInfo, decayAnimationSpec, animationSpec, snapIndex);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapperFlingBehavior snapperFlingBehavior = (SnapperFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapperFlingBehavior;
    }

    public static final SnapperFlingBehavior rememberSnapperFlingBehavior(SnapperLayoutInfo layoutInfo, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        composer.startReplaceableGroup(1376896632);
        ComposerKt.sourceInformation(composer, "CC(rememberSnapperFlingBehavior)P(1)");
        if ((i2 & 2) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        DecayAnimationSpec<Float> decayAnimationSpec2 = decayAnimationSpec;
        if ((i2 & 4) != 0) {
            animationSpec = SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        }
        SnapperFlingBehavior rememberSnapperFlingBehavior = rememberSnapperFlingBehavior(layoutInfo, decayAnimationSpec2, animationSpec, SnapperFlingBehaviorDefaults.INSTANCE.getSnapIndex(), composer, (i & 14) | 576, 0);
        composer.endReplaceableGroup();
        return rememberSnapperFlingBehavior;
    }

    @Deprecated(message = "The maximumFlingDistance parameter has been replaced with snapIndex")
    public static final SnapperFlingBehavior rememberSnapperFlingBehavior(SnapperLayoutInfo layoutInfo, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Function1<? super SnapperLayoutInfo, Float> function1, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        composer.startReplaceableGroup(1090172363);
        ComposerKt.sourceInformation(composer, "C(rememberSnapperFlingBehavior)P(1!1,3)");
        if ((i2 & 2) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i2 & 4) != 0) {
            animationSpec = SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec();
        }
        if ((i2 & 8) != 0) {
            function1 = SnapperFlingBehaviorDefaults.INSTANCE.getMaximumFlingDistance();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1090172363, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.rememberSnapperFlingBehavior (SnapperFlingBehavior.kt:134)");
        }
        Object[] objArr = {layoutInfo, decayAnimationSpec, animationSpec, function1};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnapperFlingBehavior(layoutInfo, decayAnimationSpec, animationSpec, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapperFlingBehavior snapperFlingBehavior = (SnapperFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapperFlingBehavior;
    }
}
