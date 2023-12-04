package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0000\u001a\u0017\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082\b\u001a\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001an\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 2!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000f0\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&\u001av\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0\u001e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0*2!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000f0\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010+\u001ax\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u001b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00101\u001a\u0002022!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000f0\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u00103\u001a\u0014\u00104\u001a\u00020\b*\u00020\b2\u0006\u00105\u001a\u00020\bH\u0002\u001a(\u00106\u001a\u0002H7\"\u000e\b\u0000\u00107*\b\u0012\u0004\u0012\u0002H708*\b\u0012\u0004\u0012\u0002H709H\u0082\u0002¢\u0006\u0002\u0010:\u001a(\u0010;\u001a\u0002H7\"\u000e\b\u0000\u00107*\b\u0012\u0004\u0012\u0002H708*\b\u0012\u0004\u0012\u0002H709H\u0082\u0002¢\u0006\u0002\u0010:\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {OkHttpClientProviderKt.DEBUG_KEY, "", "MinFlingVelocityDp", "Landroidx/compose/ui/unit/Dp;", "getMinFlingVelocityDp", "()F", "F", "NoDistance", "", "NoVelocity", "calculateFinalOffset", "velocity", "lowerBound", "upperBound", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "animateDecay", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/gestures/ScrollScope;", "targetOffset", "animationState", "Landroidx/compose/animation/core/AnimationState;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "onAnimationStep", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "delta", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateSnap", "cancelOffset", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "approach", "initialTargetOffset", "initialVelocity", "animation", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coerceToTarget", TypedValues.AttributesType.S_TARGET, "component1", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "component2", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = Dp.m5607constructorimpl(400);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    public static final /* synthetic */ Object access$animateDecay(ScrollScope scrollScope, float f, AnimationState animationState, DecayAnimationSpec decayAnimationSpec, Function1 function1, Continuation continuation) {
        return animateDecay(scrollScope, f, animationState, decayAnimationSpec, function1, continuation);
    }

    public static final /* synthetic */ Object access$animateSnap(ScrollScope scrollScope, float f, float f2, AnimationState animationState, AnimationSpec animationSpec, Function1 function1, Continuation continuation) {
        return animateSnap(scrollScope, f, f2, animationState, animationSpec, function1, continuation);
    }

    private static final boolean calculateFinalOffset$isValidDistance(float f) {
        if (!(f == Float.POSITIVE_INFINITY)) {
            if (!(f == Float.NEGATIVE_INFINITY)) {
                return true;
            }
        }
        return false;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    public static final SnapFlingBehavior rememberSnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        composer.startReplaceableGroup(-473984552);
        ComposerKt.sourceInformation(composer, "C(rememberSnapFlingBehavior)273@11475L7,274@11545L26,275@11583L447:SnapFlingBehavior.kt#ppz6w6");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-473984552, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:270)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        DecayAnimationSpec rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(snapLayoutInfoProvider) | composer.changed(rememberSplineBasedDecay) | composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            Object snapFlingBehavior = new SnapFlingBehavior(snapLayoutInfoProvider, AnimationSpecKt.tween$default(0, 0, EasingKt.getLinearEasing(), 3, null), rememberSplineBasedDecay, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), density, 0.0f, 32, null);
            composer.updateRememberedValue(snapFlingBehavior);
            rememberedValue = snapFlingBehavior;
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object approach(ScrollScope scrollScope, float f, float f2, ApproachAnimation<Float, AnimationVector1D> approachAnimation, SnapLayoutInfoProvider snapLayoutInfoProvider, Density density, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        SnapFlingBehaviorKt$approach$1 snapFlingBehaviorKt$approach$1;
        int i;
        if (continuation instanceof SnapFlingBehaviorKt$approach$1) {
            snapFlingBehaviorKt$approach$1 = (SnapFlingBehaviorKt$approach$1) continuation;
            if ((snapFlingBehaviorKt$approach$1.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$approach$1.label -= Integer.MIN_VALUE;
                SnapFlingBehaviorKt$approach$1 snapFlingBehaviorKt$approach$12 = snapFlingBehaviorKt$approach$1;
                Object obj = snapFlingBehaviorKt$approach$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehaviorKt$approach$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Float boxFloat = Boxing.boxFloat(f);
                    Float boxFloat2 = Boxing.boxFloat(f2);
                    snapFlingBehaviorKt$approach$12.L$0 = snapLayoutInfoProvider;
                    snapFlingBehaviorKt$approach$12.L$1 = density;
                    snapFlingBehaviorKt$approach$12.label = 1;
                    obj = approachAnimation.approachAnimation(scrollScope, boxFloat, boxFloat2, function1, snapFlingBehaviorKt$approach$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    density = (Density) snapFlingBehaviorKt$approach$12.L$1;
                    snapLayoutInfoProvider = (SnapLayoutInfoProvider) snapFlingBehaviorKt$approach$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AnimationState component2 = ((AnimationResult) obj).component2();
                return new AnimationResult(Boxing.boxFloat(snapLayoutInfoProvider.calculateSnappingOffset(density, ((Number) component2.getVelocity()).floatValue())), component2);
            }
        }
        snapFlingBehaviorKt$approach$1 = new SnapFlingBehaviorKt$approach$1(continuation);
        SnapFlingBehaviorKt$approach$1 snapFlingBehaviorKt$approach$122 = snapFlingBehaviorKt$approach$1;
        Object obj2 = snapFlingBehaviorKt$approach$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehaviorKt$approach$122.label;
        if (i != 0) {
        }
        AnimationState component22 = ((AnimationResult) obj2).component2();
        return new AnimationResult(Boxing.boxFloat(snapLayoutInfoProvider.calculateSnappingOffset(density, ((Number) component22.getVelocity()).floatValue())), component22);
    }

    private static final <T extends Comparable<? super T>> T component1(ClosedFloatingPointRange<T> closedFloatingPointRange) {
        Intrinsics.checkNotNullParameter(closedFloatingPointRange, "<this>");
        return closedFloatingPointRange.getStart();
    }

    private static final <T extends Comparable<? super T>> T component2(ClosedFloatingPointRange<T> closedFloatingPointRange) {
        Intrinsics.checkNotNullParameter(closedFloatingPointRange, "<this>");
        return closedFloatingPointRange.getEndInclusive();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateDecay(ScrollScope scrollScope, float f, AnimationState<Float, AnimationVector1D> animationState, DecayAnimationSpec<Float> decayAnimationSpec, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        int i;
        Ref.FloatRef floatRef;
        if (continuation instanceof SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (SnapFlingBehaviorKt$animateDecay$1) continuation;
            if ((snapFlingBehaviorKt$animateDecay$1.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateDecay$1.label -= Integer.MIN_VALUE;
                Object obj = snapFlingBehaviorKt$animateDecay$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehaviorKt$animateDecay$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    boolean z = animationState.getVelocity().floatValue() == 0.0f;
                    snapFlingBehaviorKt$animateDecay$1.L$0 = animationState;
                    snapFlingBehaviorKt$animateDecay$1.L$1 = floatRef2;
                    snapFlingBehaviorKt$animateDecay$1.F$0 = f;
                    snapFlingBehaviorKt$animateDecay$1.label = 1;
                    if (SuspendAnimationKt.animateDecay(animationState, decayAnimationSpec, !z, new SnapFlingBehaviorKt$animateDecay$2(f, floatRef2, scrollScope, function1), snapFlingBehaviorKt$animateDecay$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    f = snapFlingBehaviorKt$animateDecay$1.F$0;
                    floatRef = (Ref.FloatRef) snapFlingBehaviorKt$animateDecay$1.L$1;
                    animationState = (AnimationState) snapFlingBehaviorKt$animateDecay$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return new AnimationResult(Boxing.boxFloat(f - floatRef.element), animationState);
            }
        }
        snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(continuation);
        Object obj2 = snapFlingBehaviorKt$animateDecay$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehaviorKt$animateDecay$1.label;
        if (i != 0) {
        }
        return new AnimationResult(Boxing.boxFloat(f - floatRef.element), animationState);
    }

    public static final void animateDecay$consumeDelta(AnimationScope<Float, AnimationVector1D> animationScope, ScrollScope scrollScope, Function1<? super Float, Unit> function1, float f) {
        float scrollBy = scrollScope.scrollBy(f);
        function1.invoke(Float.valueOf(scrollBy));
        if (Math.abs(f - scrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateSnap(ScrollScope scrollScope, float f, float f2, AnimationState<Float, AnimationVector1D> animationState, AnimationSpec<Float> animationSpec, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        SnapFlingBehaviorKt$animateSnap$1 snapFlingBehaviorKt$animateSnap$1;
        int i;
        float f3;
        Ref.FloatRef floatRef;
        float f4;
        AnimationState<Float, AnimationVector1D> animationState2;
        if (continuation instanceof SnapFlingBehaviorKt$animateSnap$1) {
            snapFlingBehaviorKt$animateSnap$1 = (SnapFlingBehaviorKt$animateSnap$1) continuation;
            if ((snapFlingBehaviorKt$animateSnap$1.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateSnap$1.label -= Integer.MIN_VALUE;
                SnapFlingBehaviorKt$animateSnap$1 snapFlingBehaviorKt$animateSnap$12 = snapFlingBehaviorKt$animateSnap$1;
                Object obj = snapFlingBehaviorKt$animateSnap$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehaviorKt$animateSnap$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    float floatValue = animationState.getVelocity().floatValue();
                    Float boxFloat = Boxing.boxFloat(f);
                    boolean z = animationState.getVelocity().floatValue() == 0.0f;
                    snapFlingBehaviorKt$animateSnap$12.L$0 = animationState;
                    snapFlingBehaviorKt$animateSnap$12.L$1 = floatRef2;
                    f3 = f;
                    snapFlingBehaviorKt$animateSnap$12.F$0 = f3;
                    snapFlingBehaviorKt$animateSnap$12.F$1 = floatValue;
                    snapFlingBehaviorKt$animateSnap$12.label = 1;
                    if (SuspendAnimationKt.animateTo(animationState, boxFloat, animationSpec, !z, new SnapFlingBehaviorKt$animateSnap$2(f2, floatRef2, scrollScope, function1), snapFlingBehaviorKt$animateSnap$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                    f4 = floatValue;
                    animationState2 = animationState;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    f4 = snapFlingBehaviorKt$animateSnap$12.F$1;
                    float f5 = snapFlingBehaviorKt$animateSnap$12.F$0;
                    floatRef = (Ref.FloatRef) snapFlingBehaviorKt$animateSnap$12.L$1;
                    ResultKt.throwOnFailure(obj);
                    f3 = f5;
                    animationState2 = (AnimationState) snapFlingBehaviorKt$animateSnap$12.L$0;
                }
                return new AnimationResult(Boxing.boxFloat(f3 - floatRef.element), AnimationStateKt.copy$default((AnimationState) animationState2, 0.0f, coerceToTarget(animationState2.getVelocity().floatValue(), f4), 0L, 0L, false, 29, (Object) null));
            }
        }
        snapFlingBehaviorKt$animateSnap$1 = new SnapFlingBehaviorKt$animateSnap$1(continuation);
        SnapFlingBehaviorKt$animateSnap$1 snapFlingBehaviorKt$animateSnap$122 = snapFlingBehaviorKt$animateSnap$1;
        Object obj2 = snapFlingBehaviorKt$animateSnap$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehaviorKt$animateSnap$122.label;
        if (i != 0) {
        }
        return new AnimationResult(Boxing.boxFloat(f3 - floatRef.element), AnimationStateKt.copy$default((AnimationState) animationState2, 0.0f, coerceToTarget(animationState2.getVelocity().floatValue(), f4), 0L, 0L, false, 29, (Object) null));
    }

    public static final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? RangesKt.coerceAtMost(f, f2) : RangesKt.coerceAtLeast(f, f2);
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x001a, code lost:
        if (java.lang.Math.abs(r6) <= java.lang.Math.abs(r5)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float calculateFinalOffset(float f, float f2, float f3) {
        float signum = Math.signum(f);
        if (!(signum == 0.0f)) {
            if (!(signum == 1.0f)) {
                if (!(signum == -1.0f)) {
                    f2 = 0.0f;
                }
            }
            f2 = f3;
        }
        if (calculateFinalOffset$isValidDistance(f2)) {
            return f2;
        }
        return 0.0f;
    }
}
