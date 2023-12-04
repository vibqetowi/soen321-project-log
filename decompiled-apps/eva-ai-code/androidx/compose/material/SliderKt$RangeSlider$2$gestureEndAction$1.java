package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isStart", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$gestureEndAction$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    final /* synthetic */ MutableFloatState $rawOffsetEnd;
    final /* synthetic */ MutableFloatState $rawOffsetStart;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$gestureEndAction$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, List<Float> list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Function0<Unit> function0, CoroutineScope coroutineScope, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        super(1);
        this.$rawOffsetStart = mutableFloatState;
        this.$rawOffsetEnd = mutableFloatState2;
        this.$tickFractions = list;
        this.$minPx = floatRef;
        this.$maxPx = floatRef2;
        this.$onValueChangeFinished = function0;
        this.$scope = coroutineScope;
        this.$onValueChangeState = state;
        this.$valueRange = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        float snapValueToTick;
        float floatValue = (z ? this.$rawOffsetStart : this.$rawOffsetEnd).getFloatValue();
        snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx.element, this.$maxPx.element);
        if (!(floatValue == snapValueToTick)) {
            BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass1(floatValue, snapValueToTick, this.$onValueChangeFinished, z, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, null), 3, null);
            return;
        }
        Function0<Unit> function0 = this.$onValueChangeFinished;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {361}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ boolean $isStart;
        final /* synthetic */ Ref.FloatRef $maxPx;
        final /* synthetic */ Ref.FloatRef $minPx;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
        final /* synthetic */ MutableFloatState $rawOffsetEnd;
        final /* synthetic */ MutableFloatState $rawOffsetStart;
        final /* synthetic */ float $target;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(float f, float f2, Function0<Unit> function0, boolean z, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$current = f;
            this.$target = f2;
            this.$onValueChangeFinished = function0;
            this.$isStart = z;
            this.$rawOffsetStart = mutableFloatState;
            this.$rawOffsetEnd = mutableFloatState2;
            this.$onValueChangeState = state;
            this.$minPx = floatRef;
            this.$maxPx = floatRef2;
            this.$valueRange = closedFloatingPointRange;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Slider.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00381 extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {
            final /* synthetic */ boolean $isStart;
            final /* synthetic */ Ref.FloatRef $maxPx;
            final /* synthetic */ Ref.FloatRef $minPx;
            final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
            final /* synthetic */ MutableFloatState $rawOffsetEnd;
            final /* synthetic */ MutableFloatState $rawOffsetStart;
            final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00381(boolean z, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
                super(1);
                this.$isStart = z;
                this.$rawOffsetStart = mutableFloatState;
                this.$rawOffsetEnd = mutableFloatState2;
                this.$onValueChangeState = state;
                this.$minPx = floatRef;
                this.$maxPx = floatRef2;
                this.$valueRange = closedFloatingPointRange;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                invoke2(animatable);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Animatable<Float, AnimationVector1D> animateTo) {
                ClosedFloatingPointRange<Float> invoke$scaleToUserValue;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                (this.$isStart ? this.$rawOffsetStart : this.$rawOffsetEnd).setFloatValue(animateTo.getValue().floatValue());
                invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, RangesKt.rangeTo(this.$rawOffsetStart.getFloatValue(), this.$rawOffsetEnd.getFloatValue()));
                this.$onValueChangeState.getValue().invoke(invoke$scaleToUserValue);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TweenSpec tweenSpec;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable Animatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                Float boxFloat = Boxing.boxFloat(this.$target);
                tweenSpec = SliderKt.SliderToTickAnimation;
                this.label = 1;
                if (Animatable$default.animateTo(boxFloat, tweenSpec, Boxing.boxFloat(0.0f), new C00381(this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            Function0<Unit> function0 = this.$onValueChangeFinished;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }
}
