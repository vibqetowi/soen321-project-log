package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: SnapperFlingBehavior.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Bm\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012>\b\u0002\u0010\t\u001a8\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\u0010BC\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\u0010\u0013B}\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012<\u0010\t\u001a8\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\u0010\u0014J \u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002J\"\u0010#\u001a\u00020$*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 H\u0002J%\u0010%\u001a\u00020\u0006*\u00020&2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J7\u0010)\u001a\u00020\u0006*\u00020&2\u0006\u0010*\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010,J\u001d\u0010-\u001a\u00020\u0006*\u00020&2\u0006\u0010\u001e\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010.JK\u0010/\u001a\u00020$*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u000201002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000b2!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u00060\u0012H\u0002J/\u00104\u001a\u00020\u0006*\u00020&2\u0006\u0010*\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u00105R/\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0012X\u0082\u0004¢\u0006\u0002\n\u0000RD\u0010\t\u001a8\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "layoutInfo", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "springAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapIndex", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;)V", "maximumFlingDistance", "Lkotlin/Function1;", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "animationTarget", "getAnimationTarget", "()Ljava/lang/Integer;", "setAnimationTarget", "(Ljava/lang/Integer;)V", "animationTarget$delegate", "Landroidx/compose/runtime/MutableState;", "calculateSnapBack", "initialVelocity", "currentItem", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;", "consumeVelocityIfNotAtScrollEdge", "velocity", "canDecayBeyondCurrentItem", "", "flingToIndex", "Landroidx/compose/foundation/gestures/ScrollScope;", FirebaseAnalytics.Param.INDEX, "(Landroidx/compose/foundation/gestures/ScrollScope;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performDecayFling", "initialItem", "flingThenSpring", "(Landroidx/compose/foundation/gestures/ScrollScope;Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;IFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performSnapBackIfNeeded", "Landroidx/compose/animation/core/AnimationScope;", "Landroidx/compose/animation/core/AnimationVector1D;", "scrollBy", "pixels", "performSpringFling", "(Landroidx/compose/foundation/gestures/ScrollScope;Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnapperFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;
    private final MutableState animationTarget$delegate;
    private final DecayAnimationSpec<Float> decayAnimationSpec;
    private final SnapperLayoutInfo layoutInfo;
    private final Function1<SnapperLayoutInfo, Float> maximumFlingDistance;
    private final Function3<SnapperLayoutInfo, Integer, Integer, Integer> snapIndex;
    private final AnimationSpec<Float> springAnimationSpec;

    /* JADX WARN: Multi-variable type inference failed */
    private SnapperFlingBehavior(SnapperLayoutInfo snapperLayoutInfo, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Function3<? super SnapperLayoutInfo, ? super Integer, ? super Integer, Integer> function3, Function1<? super SnapperLayoutInfo, Float> function1) {
        MutableState mutableStateOf$default;
        this.layoutInfo = snapperLayoutInfo;
        this.decayAnimationSpec = decayAnimationSpec;
        this.springAnimationSpec = animationSpec;
        this.snapIndex = function3;
        this.maximumFlingDistance = function1;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animationTarget$delegate = mutableStateOf$default;
    }

    public /* synthetic */ SnapperFlingBehavior(SnapperLayoutInfo snapperLayoutInfo, DecayAnimationSpec decayAnimationSpec, AnimationSpec<Float> animationSpec, Function3<SnapperLayoutInfo, Integer, Integer, Integer> function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(snapperLayoutInfo, decayAnimationSpec, (i & 4) != 0 ? SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec() : animationSpec, (i & 8) != 0 ? SnapperFlingBehaviorDefaults.INSTANCE.getSnapIndex() : function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnapperFlingBehavior(SnapperLayoutInfo layoutInfo, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> springAnimationSpec, Function3<? super SnapperLayoutInfo, ? super Integer, ? super Integer, Integer> snapIndex) {
        this(layoutInfo, decayAnimationSpec, springAnimationSpec, snapIndex, SnapperFlingBehaviorDefaults.INSTANCE.getMaximumFlingDistance());
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(springAnimationSpec, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(snapIndex, "snapIndex");
    }

    public /* synthetic */ SnapperFlingBehavior(SnapperLayoutInfo snapperLayoutInfo, DecayAnimationSpec decayAnimationSpec, AnimationSpec<Float> animationSpec, Function1<SnapperLayoutInfo, Float> function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(snapperLayoutInfo, decayAnimationSpec, (i & 4) != 0 ? SnapperFlingBehaviorDefaults.INSTANCE.getSpringAnimationSpec() : animationSpec, (i & 8) != 0 ? SnapperFlingBehaviorDefaults.INSTANCE.getMaximumFlingDistance() : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "The maximumFlingDistance parameter has been replaced with snapIndex")
    public SnapperFlingBehavior(SnapperLayoutInfo layoutInfo, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> springAnimationSpec, Function1<? super SnapperLayoutInfo, Float> maximumFlingDistance) {
        this(layoutInfo, decayAnimationSpec, springAnimationSpec, SnapperFlingBehaviorDefaults.INSTANCE.getSnapIndex(), maximumFlingDistance);
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        Intrinsics.checkNotNullParameter(springAnimationSpec, "springAnimationSpec");
        Intrinsics.checkNotNullParameter(maximumFlingDistance, "maximumFlingDistance");
    }

    private final Integer getAnimationTarget() {
        return (Integer) this.animationTarget$delegate.getValue();
    }

    private final void setAnimationTarget(Integer num) {
        this.animationTarget$delegate.setValue(num);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f, Continuation<? super Float> continuation) {
        if (!this.layoutInfo.canScrollTowardsStart() || !this.layoutInfo.canScrollTowardsEnd()) {
            return Boxing.boxFloat(f);
        }
        float floatValue = this.maximumFlingDistance.invoke(this.layoutInfo).floatValue();
        boolean z = true;
        if (!(floatValue > 0.0f)) {
            throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0".toString());
        }
        SnapperLayoutItemInfo currentItem = this.layoutInfo.getCurrentItem();
        if (currentItem == null) {
            return Boxing.boxFloat(f);
        }
        int intValue = this.snapIndex.invoke(this.layoutInfo, Boxing.boxInt(f < 0.0f ? currentItem.getIndex() + 1 : currentItem.getIndex()), Boxing.boxInt(this.layoutInfo.determineTargetIndex(f, this.decayAnimationSpec, floatValue))).intValue();
        if (intValue < 0 || intValue >= this.layoutInfo.getTotalItemsCount()) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return flingToIndex(scrollScope, intValue, f, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object flingToIndex(ScrollScope scrollScope, int i, float f, Continuation<? super Float> continuation) {
        SnapperFlingBehavior$flingToIndex$1 snapperFlingBehavior$flingToIndex$1;
        int i2;
        ScrollScope scrollScope2;
        SnapperFlingBehavior snapperFlingBehavior;
        int i3;
        float f2;
        SnapperFlingBehavior snapperFlingBehavior2;
        int i4;
        SnapperLayoutItemInfo currentItem;
        float f3 = f;
        if (continuation instanceof SnapperFlingBehavior$flingToIndex$1) {
            snapperFlingBehavior$flingToIndex$1 = (SnapperFlingBehavior$flingToIndex$1) continuation;
            if ((snapperFlingBehavior$flingToIndex$1.label & Integer.MIN_VALUE) != 0) {
                snapperFlingBehavior$flingToIndex$1.label -= Integer.MIN_VALUE;
                SnapperFlingBehavior$flingToIndex$1 snapperFlingBehavior$flingToIndex$12 = snapperFlingBehavior$flingToIndex$1;
                Object obj = snapperFlingBehavior$flingToIndex$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = snapperFlingBehavior$flingToIndex$12.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    SnapperLayoutItemInfo currentItem2 = this.layoutInfo.getCurrentItem();
                    if (currentItem2 == null) {
                        return Boxing.boxFloat(f);
                    }
                    if (currentItem2.getIndex() == i && this.layoutInfo.distanceToIndexSnap(currentItem2.getIndex()) == 0) {
                        return Boxing.boxFloat(consumeVelocityIfNotAtScrollEdge(f3));
                    }
                    if (canDecayBeyondCurrentItem(this.decayAnimationSpec, f3, currentItem2)) {
                        snapperFlingBehavior$flingToIndex$12.L$0 = this;
                        scrollScope2 = scrollScope;
                        snapperFlingBehavior$flingToIndex$12.L$1 = scrollScope2;
                        snapperFlingBehavior$flingToIndex$12.I$0 = i;
                        snapperFlingBehavior$flingToIndex$12.F$0 = f3;
                        snapperFlingBehavior$flingToIndex$12.label = 1;
                        obj = performDecayFling$default(this, scrollScope, currentItem2, i, f, false, snapperFlingBehavior$flingToIndex$12, 8, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        snapperFlingBehavior2 = this;
                        i4 = i;
                    } else {
                        scrollScope2 = scrollScope;
                        snapperFlingBehavior = this;
                        i3 = i;
                        f2 = f3;
                        ScrollScope scrollScope3 = scrollScope2;
                        currentItem = snapperFlingBehavior.layoutInfo.getCurrentItem();
                        if (currentItem == null) {
                            return Boxing.boxFloat(f3);
                        }
                        if (currentItem.getIndex() != i3 || snapperFlingBehavior.layoutInfo.distanceToIndexSnap(i3) != 0) {
                            snapperFlingBehavior$flingToIndex$12.L$0 = snapperFlingBehavior;
                            snapperFlingBehavior$flingToIndex$12.L$1 = null;
                            snapperFlingBehavior$flingToIndex$12.label = 2;
                            obj = snapperFlingBehavior.performSpringFling(scrollScope3, currentItem, i3, f2, snapperFlingBehavior$flingToIndex$12);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            f2 = ((Number) obj).floatValue();
                        }
                        return Boxing.boxFloat(snapperFlingBehavior.consumeVelocityIfNotAtScrollEdge(f2));
                    }
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        snapperFlingBehavior = (SnapperFlingBehavior) snapperFlingBehavior$flingToIndex$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        f2 = ((Number) obj).floatValue();
                        return Boxing.boxFloat(snapperFlingBehavior.consumeVelocityIfNotAtScrollEdge(f2));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    float f4 = snapperFlingBehavior$flingToIndex$12.F$0;
                    i4 = snapperFlingBehavior$flingToIndex$12.I$0;
                    snapperFlingBehavior2 = (SnapperFlingBehavior) snapperFlingBehavior$flingToIndex$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    f3 = f4;
                    scrollScope2 = (ScrollScope) snapperFlingBehavior$flingToIndex$12.L$1;
                }
                f2 = ((Number) obj).floatValue();
                i3 = i4;
                snapperFlingBehavior = snapperFlingBehavior2;
                ScrollScope scrollScope32 = scrollScope2;
                currentItem = snapperFlingBehavior.layoutInfo.getCurrentItem();
                if (currentItem == null) {
                }
            }
        }
        snapperFlingBehavior$flingToIndex$1 = new SnapperFlingBehavior$flingToIndex$1(this, continuation);
        SnapperFlingBehavior$flingToIndex$1 snapperFlingBehavior$flingToIndex$122 = snapperFlingBehavior$flingToIndex$1;
        Object obj2 = snapperFlingBehavior$flingToIndex$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = snapperFlingBehavior$flingToIndex$122.label;
        if (i2 != 0) {
        }
        f2 = ((Number) obj2).floatValue();
        i3 = i4;
        snapperFlingBehavior = snapperFlingBehavior2;
        ScrollScope scrollScope322 = scrollScope2;
        currentItem = snapperFlingBehavior.layoutInfo.getCurrentItem();
        if (currentItem == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performDecayFling(ScrollScope scrollScope, SnapperLayoutItemInfo snapperLayoutItemInfo, int i, float f, boolean z, Continuation<? super Float> continuation) {
        SnapperFlingBehavior$performDecayFling$1 snapperFlingBehavior$performDecayFling$1;
        int i2;
        Integer num;
        SnapperFlingBehavior snapperFlingBehavior;
        Ref.FloatRef floatRef;
        if (continuation instanceof SnapperFlingBehavior$performDecayFling$1) {
            snapperFlingBehavior$performDecayFling$1 = (SnapperFlingBehavior$performDecayFling$1) continuation;
            if ((snapperFlingBehavior$performDecayFling$1.label & Integer.MIN_VALUE) != 0) {
                snapperFlingBehavior$performDecayFling$1.label -= Integer.MIN_VALUE;
                SnapperFlingBehavior$performDecayFling$1 snapperFlingBehavior$performDecayFling$12 = snapperFlingBehavior$performDecayFling$1;
                Object obj = snapperFlingBehavior$performDecayFling$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = snapperFlingBehavior$performDecayFling$12.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (snapperLayoutItemInfo.getIndex() == i && this.layoutInfo.distanceToIndexSnap(snapperLayoutItemInfo.getIndex()) == 0) {
                        return Boxing.boxFloat(consumeVelocityIfNotAtScrollEdge(f));
                    }
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    floatRef2.element = f;
                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    boolean z2 = z && Math.abs(i - snapperLayoutItemInfo.getIndex()) >= 2;
                    try {
                        setAnimationTarget(Boxing.boxInt(i));
                        AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        DecayAnimationSpec<Float> decayAnimationSpec = this.decayAnimationSpec;
                        try {
                            SnapperFlingBehavior$performDecayFling$2 snapperFlingBehavior$performDecayFling$2 = new SnapperFlingBehavior$performDecayFling$2(floatRef3, scrollScope, floatRef2, this, z2, i);
                            snapperFlingBehavior$performDecayFling$12.L$0 = this;
                            snapperFlingBehavior$performDecayFling$12.L$1 = floatRef2;
                            snapperFlingBehavior$performDecayFling$12.label = 1;
                            num = null;
                            floatRef = floatRef2;
                            try {
                                if (SuspendAnimationKt.animateDecay$default(AnimationState$default, decayAnimationSpec, false, snapperFlingBehavior$performDecayFling$2, snapperFlingBehavior$performDecayFling$12, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                snapperFlingBehavior = this;
                            } catch (Throwable th) {
                                th = th;
                                snapperFlingBehavior = this;
                                snapperFlingBehavior.setAnimationTarget(num);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            num = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        num = null;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    floatRef = (Ref.FloatRef) snapperFlingBehavior$performDecayFling$12.L$1;
                    snapperFlingBehavior = (SnapperFlingBehavior) snapperFlingBehavior$performDecayFling$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        num = null;
                    } catch (Throwable th4) {
                        th = th4;
                        num = null;
                        snapperFlingBehavior.setAnimationTarget(num);
                        throw th;
                    }
                }
                snapperFlingBehavior.setAnimationTarget(num);
                return Boxing.boxFloat(floatRef.element);
            }
        }
        snapperFlingBehavior$performDecayFling$1 = new SnapperFlingBehavior$performDecayFling$1(this, continuation);
        SnapperFlingBehavior$performDecayFling$1 snapperFlingBehavior$performDecayFling$122 = snapperFlingBehavior$performDecayFling$1;
        Object obj2 = snapperFlingBehavior$performDecayFling$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = snapperFlingBehavior$performDecayFling$122.label;
        if (i2 != 0) {
        }
        snapperFlingBehavior.setAnimationTarget(num);
        return Boxing.boxFloat(floatRef.element);
    }

    static /* synthetic */ Object performDecayFling$default(SnapperFlingBehavior snapperFlingBehavior, ScrollScope scrollScope, SnapperLayoutItemInfo snapperLayoutItemInfo, int i, float f, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return snapperFlingBehavior.performDecayFling(scrollScope, snapperLayoutItemInfo, i, f, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performSpringFling(ScrollScope scrollScope, SnapperLayoutItemInfo snapperLayoutItemInfo, int i, float f, Continuation<? super Float> continuation) {
        SnapperFlingBehavior$performSpringFling$1 snapperFlingBehavior$performSpringFling$1;
        int i2;
        Integer num;
        SnapperFlingBehavior snapperFlingBehavior;
        Ref.FloatRef floatRef;
        if (continuation instanceof SnapperFlingBehavior$performSpringFling$1) {
            snapperFlingBehavior$performSpringFling$1 = (SnapperFlingBehavior$performSpringFling$1) continuation;
            if ((snapperFlingBehavior$performSpringFling$1.label & Integer.MIN_VALUE) != 0) {
                snapperFlingBehavior$performSpringFling$1.label -= Integer.MIN_VALUE;
                SnapperFlingBehavior$performSpringFling$1 snapperFlingBehavior$performSpringFling$12 = snapperFlingBehavior$performSpringFling$1;
                Object obj = snapperFlingBehavior$performSpringFling$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = snapperFlingBehavior$performSpringFling$12.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    float f2 = 0.0f;
                    if ((i > snapperLayoutItemInfo.getIndex() && f > 0.0f) || (i <= snapperLayoutItemInfo.getIndex() && f < 0.0f)) {
                        f2 = f;
                    }
                    floatRef2.element = f2;
                    Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    try {
                        setAnimationTarget(Boxing.boxInt(i));
                        AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(floatRef3.element, floatRef2.element, 0L, 0L, false, 28, null);
                        Float boxFloat = Boxing.boxFloat(this.layoutInfo.distanceToIndexSnap(i));
                        AnimationSpec<Float> animationSpec = this.springAnimationSpec;
                        SnapperFlingBehavior$performSpringFling$2 snapperFlingBehavior$performSpringFling$2 = new SnapperFlingBehavior$performSpringFling$2(floatRef3, scrollScope, floatRef2, this, i);
                        snapperFlingBehavior$performSpringFling$12.L$0 = this;
                        snapperFlingBehavior$performSpringFling$12.L$1 = floatRef2;
                        snapperFlingBehavior$performSpringFling$12.label = 1;
                        num = null;
                        try {
                            if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec, false, snapperFlingBehavior$performSpringFling$2, snapperFlingBehavior$performSpringFling$12, 4, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            floatRef = floatRef2;
                            snapperFlingBehavior = this;
                        } catch (Throwable th) {
                            th = th;
                            snapperFlingBehavior = this;
                            snapperFlingBehavior.setAnimationTarget(num);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        num = null;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    floatRef = (Ref.FloatRef) snapperFlingBehavior$performSpringFling$12.L$1;
                    snapperFlingBehavior = (SnapperFlingBehavior) snapperFlingBehavior$performSpringFling$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        num = null;
                    } catch (Throwable th3) {
                        th = th3;
                        num = null;
                        snapperFlingBehavior.setAnimationTarget(num);
                        throw th;
                    }
                }
                snapperFlingBehavior.setAnimationTarget(num);
                return Boxing.boxFloat(floatRef.element);
            }
        }
        snapperFlingBehavior$performSpringFling$1 = new SnapperFlingBehavior$performSpringFling$1(this, continuation);
        SnapperFlingBehavior$performSpringFling$1 snapperFlingBehavior$performSpringFling$122 = snapperFlingBehavior$performSpringFling$1;
        Object obj2 = snapperFlingBehavior$performSpringFling$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = snapperFlingBehavior$performSpringFling$122.label;
        if (i2 != 0) {
        }
        snapperFlingBehavior.setAnimationTarget(num);
        return Boxing.boxFloat(floatRef.element);
    }

    static /* synthetic */ Object performSpringFling$default(SnapperFlingBehavior snapperFlingBehavior, ScrollScope scrollScope, SnapperLayoutItemInfo snapperLayoutItemInfo, int i, float f, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.0f;
        }
        return snapperFlingBehavior.performSpringFling(scrollScope, snapperLayoutItemInfo, i, f, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean performSnapBackIfNeeded(AnimationScope<Float, AnimationVector1D> animationScope, SnapperLayoutItemInfo snapperLayoutItemInfo, int i, Function1<? super Float, Float> function1) {
        int calculateSnapBack = calculateSnapBack(animationScope.getVelocity().floatValue(), snapperLayoutItemInfo, i);
        if (calculateSnapBack != 0) {
            function1.invoke(Float.valueOf(calculateSnapBack));
            return true;
        }
        return false;
    }

    private final boolean canDecayBeyondCurrentItem(DecayAnimationSpec<Float> decayAnimationSpec, float f, SnapperLayoutItemInfo snapperLayoutItemInfo) {
        if (Math.abs(f) < 0.5f) {
            return false;
        }
        float calculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f);
        if (f < 0.0f) {
            if (calculateTargetValue > this.layoutInfo.distanceToIndexSnap(snapperLayoutItemInfo.getIndex())) {
                return false;
            }
        } else if (calculateTargetValue < this.layoutInfo.distanceToIndexSnap(snapperLayoutItemInfo.getIndex() + 1)) {
            return false;
        }
        return true;
    }

    private final int calculateSnapBack(float f, SnapperLayoutItemInfo snapperLayoutItemInfo, int i) {
        if (f > 0.0f && snapperLayoutItemInfo.getIndex() >= i) {
            return this.layoutInfo.distanceToIndexSnap(snapperLayoutItemInfo.getIndex());
        }
        if (f >= 0.0f || snapperLayoutItemInfo.getIndex() > i - 1) {
            return 0;
        }
        return this.layoutInfo.distanceToIndexSnap(snapperLayoutItemInfo.getIndex() + 1);
    }

    private final float consumeVelocityIfNotAtScrollEdge(float f) {
        if (f >= 0.0f || this.layoutInfo.canScrollTowardsStart()) {
            if (f <= 0.0f || this.layoutInfo.canScrollTowardsEnd()) {
                return 0.0f;
            }
            return f;
        }
        return f;
    }
}
