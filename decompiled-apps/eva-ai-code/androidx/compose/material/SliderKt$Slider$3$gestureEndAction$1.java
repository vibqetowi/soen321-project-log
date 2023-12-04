package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "velocity", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$Slider$3$gestureEndAction$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    final /* synthetic */ MutableFloatState $rawOffset;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ List<Float> $tickFractions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3$gestureEndAction$1(MutableFloatState mutableFloatState, List<Float> list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, CoroutineScope coroutineScope, SliderDraggableState sliderDraggableState, Function0<Unit> function0) {
        super(1);
        this.$rawOffset = mutableFloatState;
        this.$tickFractions = list;
        this.$minPx = floatRef;
        this.$maxPx = floatRef2;
        this.$scope = coroutineScope;
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        float snapValueToTick;
        Function0<Unit> function0;
        float floatValue = this.$rawOffset.getFloatValue();
        snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx.element, this.$maxPx.element);
        if (!(floatValue == snapValueToTick)) {
            BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new AnonymousClass1(this.$draggableState, floatValue, snapValueToTick, f, this.$onValueChangeFinished, null), 3, null);
        } else if (this.$draggableState.isDragging() || (function0 = this.$onValueChangeFinished) == null) {
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $current;
        final /* synthetic */ SliderDraggableState $draggableState;
        final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        final /* synthetic */ float $target;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SliderDraggableState sliderDraggableState, float f, float f2, float f3, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$draggableState = sliderDraggableState;
            this.$current = f;
            this.$target = f2;
            this.$velocity = f3;
            this.$onValueChangeFinished = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object animateToTarget;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                animateToTarget = SliderKt.animateToTarget(this.$draggableState, this.$current, this.$target, this.$velocity, this);
                if (animateToTarget == coroutine_suspended) {
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
