package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyLayoutAnimateItemModifierNode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1", f = "LazyLayoutAnimateItemModifierNode.kt", i = {0}, l = {97, 103}, m = "invokeSuspend", n = {"spec"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutAnimateItemModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, long j, Continuation<? super LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1> continuation) {
        super(2, continuation);
        this.this$0 = lazyLayoutAnimateItemModifierNode;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(this.this$0, this.$totalDelta, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        SpringSpec placementAnimationSpec;
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec;
        Animatable animatable2;
        Animatable animatable3;
        SpringSpec springSpec;
        Animatable animatable4;
        Animatable animatable5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            animatable = this.this$0.placementDeltaAnimation;
            if (animatable.isRunning()) {
                if (!(this.this$0.getPlacementAnimationSpec() instanceof SpringSpec)) {
                    springSpec = LazyLayoutAnimateItemModifierNodeKt.InterruptionSpec;
                    placementAnimationSpec = springSpec;
                } else {
                    placementAnimationSpec = this.this$0.getPlacementAnimationSpec();
                }
            } else {
                placementAnimationSpec = this.this$0.getPlacementAnimationSpec();
            }
            finiteAnimationSpec = placementAnimationSpec;
            animatable2 = this.this$0.placementDeltaAnimation;
            if (!animatable2.isRunning()) {
                animatable3 = this.this$0.placementDeltaAnimation;
                this.L$0 = finiteAnimationSpec;
                this.label = 1;
                if (animatable3.snapTo(IntOffset.m5716boximpl(this.$totalDelta), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setAnimationInProgress(false);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            finiteAnimationSpec = (FiniteAnimationSpec) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        animatable4 = this.this$0.placementDeltaAnimation;
        long m5734unboximpl = ((IntOffset) animatable4.getValue()).m5734unboximpl();
        long j = this.$totalDelta;
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(m5734unboximpl) - IntOffset.m5725getXimpl(j), IntOffset.m5726getYimpl(m5734unboximpl) - IntOffset.m5726getYimpl(j));
        animatable5 = this.this$0.placementDeltaAnimation;
        this.L$0 = null;
        this.label = 2;
        if (Animatable.animateTo$default(animatable5, IntOffset.m5716boximpl(IntOffset), finiteAnimationSpec, null, new AnonymousClass1(this.this$0, IntOffset), this, 4, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.this$0.setAnimationInProgress(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayoutAnimateItemModifierNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Animatable<IntOffset, AnimationVector2D>, Unit> {
        final /* synthetic */ long $animationTarget;
        final /* synthetic */ LazyLayoutAnimateItemModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, long j) {
            super(1);
            this.this$0 = lazyLayoutAnimateItemModifierNode;
            this.$animationTarget = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animatable<IntOffset, AnimationVector2D> animatable) {
            invoke2(animatable);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Animatable<IntOffset, AnimationVector2D> animateTo) {
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = this.this$0;
            long m5734unboximpl = animateTo.getValue().m5734unboximpl();
            long j = this.$animationTarget;
            lazyLayoutAnimateItemModifierNode.m891setPlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(m5734unboximpl) - IntOffset.m5725getXimpl(j), IntOffset.m5726getYimpl(m5734unboximpl) - IntOffset.m5726getYimpl(j)));
        }
    }
}
