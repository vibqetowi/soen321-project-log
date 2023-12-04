package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\rø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J=\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0!*\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0&H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(JL\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0!*\u00020#2\u0006\u0010$\u001a\u00020\u00062!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020'0&H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\u001d\u0010.\u001a\u00020\u0006*\u00020#2\u0006\u0010$\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010/J1\u0010.\u001a\u00020\u0006*\u00020#2\u0006\u0010$\u001a\u00020\u00062\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0&H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010(JT\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0!*\u00020#2\u0006\u00102\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020'0&H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J=\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0!*\u00020#2\u0006\u0010\u001f\u001a\u00020\u00062\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'0&H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0019\u0010\f\u001a\u00020\rX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "highVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "density", "Landroidx/compose/ui/unit/Density;", "shortSnapVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/unit/Density;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "motionScaleDuration", "Landroidx/compose/ui/MotionDurationScale;", "getMotionScaleDuration$foundation_release", "()Landroidx/compose/ui/MotionDurationScale;", "setMotionScaleDuration$foundation_release", "(Landroidx/compose/ui/MotionDurationScale;)V", "F", "velocityThreshold", "equals", "", "other", "", "hashCode", "", "isDecayApproachPossible", TypedValues.CycleType.S_WAVE_OFFSET, "velocity", "fling", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "onRemainingScrollOffsetUpdate", "Lkotlin/Function1;", "", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "longSnap", "onAnimationStep", "Lkotlin/ParameterName;", "name", "remainingScrollOffset", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSettlingDistanceUpdated", "runApproach", "initialTargetOffset", "delta", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shortSnap", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;
    private final Density density;
    private final DecayAnimationSpec<Float> highVelocityAnimationSpec;
    private final AnimationSpec<Float> lowVelocityAnimationSpec;
    private MotionDurationScale motionScaleDuration;
    private final float shortSnapVelocityThreshold;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final SnapLayoutInfoProvider snapLayoutInfoProvider;
    private final float velocityThreshold;

    public /* synthetic */ SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec2, Density density, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(snapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2, density, f);
    }

    private SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec<Float> lowVelocityAnimationSpec, DecayAnimationSpec<Float> highVelocityAnimationSpec, AnimationSpec<Float> snapAnimationSpec, Density density, float f) {
        Intrinsics.checkNotNullParameter(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        Intrinsics.checkNotNullParameter(lowVelocityAnimationSpec, "lowVelocityAnimationSpec");
        Intrinsics.checkNotNullParameter(highVelocityAnimationSpec, "highVelocityAnimationSpec");
        Intrinsics.checkNotNullParameter(snapAnimationSpec, "snapAnimationSpec");
        Intrinsics.checkNotNullParameter(density, "density");
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.lowVelocityAnimationSpec = lowVelocityAnimationSpec;
        this.highVelocityAnimationSpec = highVelocityAnimationSpec;
        this.snapAnimationSpec = snapAnimationSpec;
        this.density = density;
        this.shortSnapVelocityThreshold = f;
        this.velocityThreshold = density.mo588toPx0680j_4(f);
        this.motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();
    }

    public /* synthetic */ SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, AnimationSpec animationSpec2, Density density, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(snapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2, density, (i & 32) != 0 ? SnapFlingBehaviorKt.getMinFlingVelocityDp() : f, null);
    }

    public final MotionDurationScale getMotionScaleDuration$foundation_release() {
        return this.motionScaleDuration;
    }

    public final void setMotionScaleDuration$foundation_release(MotionDurationScale motionDurationScale) {
        Intrinsics.checkNotNullParameter(motionDurationScale, "<set-?>");
        this.motionScaleDuration = motionDurationScale;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f, Continuation<? super Float> continuation) {
        return performFling(scrollScope, f, SnapFlingBehavior$performFling$2.INSTANCE, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performFling(ScrollScope scrollScope, float f, Function1<? super Float, Unit> function1, Continuation<? super Float> continuation) {
        SnapFlingBehavior$performFling$3 snapFlingBehavior$performFling$3;
        int i;
        if (continuation instanceof SnapFlingBehavior$performFling$3) {
            snapFlingBehavior$performFling$3 = (SnapFlingBehavior$performFling$3) continuation;
            if ((snapFlingBehavior$performFling$3.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$performFling$3.label -= Integer.MIN_VALUE;
                Object obj = snapFlingBehavior$performFling$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehavior$performFling$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    snapFlingBehavior$performFling$3.label = 1;
                    obj = fling(scrollScope, f, function1, snapFlingBehavior$performFling$3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                AnimationResult animationResult = (AnimationResult) obj;
                return Boxing.boxFloat(((Number) animationResult.component1()).floatValue() == 0.0f ? 0.0f : ((Number) animationResult.component2().getVelocity()).floatValue());
            }
        }
        snapFlingBehavior$performFling$3 = new SnapFlingBehavior$performFling$3(this, continuation);
        Object obj2 = snapFlingBehavior$performFling$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehavior$performFling$3.label;
        if (i != 0) {
        }
        AnimationResult animationResult2 = (AnimationResult) obj2;
        return Boxing.boxFloat(((Number) animationResult2.component1()).floatValue() == 0.0f ? 0.0f : ((Number) animationResult2.component2().getVelocity()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fling(ScrollScope scrollScope, float f, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        SnapFlingBehavior$fling$1 snapFlingBehavior$fling$1;
        int i;
        if (continuation instanceof SnapFlingBehavior$fling$1) {
            snapFlingBehavior$fling$1 = (SnapFlingBehavior$fling$1) continuation;
            if ((snapFlingBehavior$fling$1.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$fling$1.label -= Integer.MIN_VALUE;
                Object obj = snapFlingBehavior$fling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehavior$fling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    snapFlingBehavior$fling$1.L$0 = function1;
                    snapFlingBehavior$fling$1.label = 1;
                    obj = BuildersKt.withContext(this.motionScaleDuration, new SnapFlingBehavior$fling$result$1(f, this, scrollScope, function1, null), snapFlingBehavior$fling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    function1 = (Function1) snapFlingBehavior$fling$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AnimationResult animationResult = (AnimationResult) obj;
                function1.invoke(Boxing.boxFloat(0.0f));
                return animationResult;
            }
        }
        snapFlingBehavior$fling$1 = new SnapFlingBehavior$fling$1(this, continuation);
        Object obj2 = snapFlingBehavior$fling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehavior$fling$1.label;
        if (i != 0) {
        }
        AnimationResult animationResult2 = (AnimationResult) obj2;
        function1.invoke(Boxing.boxFloat(0.0f));
        return animationResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object shortSnap(ScrollScope scrollScope, float f, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        float calculateSnappingOffset = this.snapLayoutInfoProvider.calculateSnappingOffset(this.density, 0.0f);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = calculateSnappingOffset;
        return SnapFlingBehaviorKt.access$animateSnap(scrollScope, calculateSnappingOffset, calculateSnappingOffset, AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null), this.snapAnimationSpec, new SnapFlingBehavior$shortSnap$3(floatRef, function1), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1 A[PHI: r0 
      PHI: (r0v15 java.lang.Object) = (r0v14 java.lang.Object), (r0v1 java.lang.Object) binds: [B:21:0x00de, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object longSnap(ScrollScope scrollScope, float f, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        SnapFlingBehavior$longSnap$1 snapFlingBehavior$longSnap$1;
        int i;
        SnapFlingBehavior snapFlingBehavior;
        Function1<? super Float, Unit> function12;
        Ref.FloatRef floatRef;
        ScrollScope scrollScope2;
        if (continuation instanceof SnapFlingBehavior$longSnap$1) {
            snapFlingBehavior$longSnap$1 = (SnapFlingBehavior$longSnap$1) continuation;
            if ((snapFlingBehavior$longSnap$1.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$longSnap$1.label -= Integer.MIN_VALUE;
                SnapFlingBehavior$longSnap$1 snapFlingBehavior$longSnap$12 = snapFlingBehavior$longSnap$1;
                Object obj = snapFlingBehavior$longSnap$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehavior$longSnap$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    float abs = Math.abs(this.snapLayoutInfoProvider.calculateApproachOffset(this.density, f)) * Math.signum(f);
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.element = abs;
                    function1.invoke(Boxing.boxFloat(floatRef2.element));
                    snapFlingBehavior$longSnap$12.L$0 = this;
                    snapFlingBehavior$longSnap$12.L$1 = scrollScope;
                    snapFlingBehavior$longSnap$12.L$2 = function1;
                    snapFlingBehavior$longSnap$12.L$3 = floatRef2;
                    snapFlingBehavior$longSnap$12.label = 1;
                    obj = runApproach(scrollScope, abs, f, new SnapFlingBehavior$longSnap$3(floatRef2, function1), snapFlingBehavior$longSnap$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    snapFlingBehavior = this;
                    function12 = function1;
                    floatRef = floatRef2;
                    scrollScope2 = scrollScope;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    floatRef = (Ref.FloatRef) snapFlingBehavior$longSnap$12.L$3;
                    function12 = (Function1) snapFlingBehavior$longSnap$12.L$2;
                    snapFlingBehavior = (SnapFlingBehavior) snapFlingBehavior$longSnap$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    scrollScope2 = (ScrollScope) snapFlingBehavior$longSnap$12.L$1;
                }
                AnimationResult animationResult = (AnimationResult) obj;
                float floatValue = ((Number) animationResult.component1()).floatValue();
                AnimationState component2 = animationResult.component2();
                floatRef.element = floatValue;
                snapFlingBehavior$longSnap$12.L$0 = null;
                snapFlingBehavior$longSnap$12.L$1 = null;
                snapFlingBehavior$longSnap$12.L$2 = null;
                snapFlingBehavior$longSnap$12.L$3 = null;
                snapFlingBehavior$longSnap$12.label = 2;
                obj = SnapFlingBehaviorKt.access$animateSnap(scrollScope2, floatValue, floatValue, AnimationStateKt.copy$default(component2, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null), snapFlingBehavior.snapAnimationSpec, new SnapFlingBehavior$longSnap$5(floatRef, function12), snapFlingBehavior$longSnap$12);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        snapFlingBehavior$longSnap$1 = new SnapFlingBehavior$longSnap$1(this, continuation);
        SnapFlingBehavior$longSnap$1 snapFlingBehavior$longSnap$122 = snapFlingBehavior$longSnap$1;
        Object obj2 = snapFlingBehavior$longSnap$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehavior$longSnap$122.label;
        if (i != 0) {
        }
        AnimationResult animationResult2 = (AnimationResult) obj2;
        float floatValue2 = ((Number) animationResult2.component1()).floatValue();
        AnimationState component22 = animationResult2.component2();
        floatRef.element = floatValue2;
        snapFlingBehavior$longSnap$122.L$0 = null;
        snapFlingBehavior$longSnap$122.L$1 = null;
        snapFlingBehavior$longSnap$122.L$2 = null;
        snapFlingBehavior$longSnap$122.L$3 = null;
        snapFlingBehavior$longSnap$122.label = 2;
        obj2 = SnapFlingBehaviorKt.access$animateSnap(scrollScope2, floatValue2, floatValue2, AnimationStateKt.copy$default(component22, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null), snapFlingBehavior.snapAnimationSpec, new SnapFlingBehavior$longSnap$5(floatRef, function12), snapFlingBehavior$longSnap$122);
        if (obj2 != coroutine_suspended2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runApproach(ScrollScope scrollScope, float f, float f2, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        LowVelocityApproachAnimation lowVelocityApproachAnimation;
        if (isDecayApproachPossible(f, f2)) {
            lowVelocityApproachAnimation = new HighVelocityApproachAnimation(this.highVelocityAnimationSpec);
        } else {
            lowVelocityApproachAnimation = new LowVelocityApproachAnimation(this.lowVelocityAnimationSpec, this.snapLayoutInfoProvider, this.density);
        }
        return SnapFlingBehaviorKt.access$approach(scrollScope, f, f2, lowVelocityApproachAnimation, this.snapLayoutInfoProvider, this.density, function1, continuation);
    }

    private final boolean isDecayApproachPossible(float f, float f2) {
        return Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.highVelocityAnimationSpec, 0.0f, f2)) >= Math.abs(f) + this.snapLayoutInfoProvider.calculateSnapStepSize(this.density);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SnapFlingBehavior) {
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
            return Intrinsics.areEqual(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && Intrinsics.areEqual(snapFlingBehavior.highVelocityAnimationSpec, this.highVelocityAnimationSpec) && Intrinsics.areEqual(snapFlingBehavior.lowVelocityAnimationSpec, this.lowVelocityAnimationSpec) && Intrinsics.areEqual(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider) && Intrinsics.areEqual(snapFlingBehavior.density, this.density) && Dp.m5612equalsimpl0(snapFlingBehavior.shortSnapVelocityThreshold, this.shortSnapVelocityThreshold);
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((0 + this.snapAnimationSpec.hashCode()) * 31) + this.highVelocityAnimationSpec.hashCode()) * 31) + this.lowVelocityAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode()) * 31) + this.density.hashCode()) * 31) + Dp.m5613hashCodeimpl(this.shortSnapVelocityThreshold);
    }
}
