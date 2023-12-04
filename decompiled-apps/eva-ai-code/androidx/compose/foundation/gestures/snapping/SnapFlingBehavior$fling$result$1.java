package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {}, l = {133, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ Function1<Float, Unit> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapFlingBehavior$fling$result$1(float f, SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, Function1<? super Float, Unit> function1, Continuation<? super SnapFlingBehavior$fling$result$1> continuation) {
        super(2, continuation);
        this.$initialVelocity = f;
        this.this$0 = snapFlingBehavior;
        this.$this_fling = scrollScope;
        this.$onRemainingScrollOffsetUpdate = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SnapFlingBehavior$fling$result$1(this.$initialVelocity, this.this$0, this.$this_fling, this.$onRemainingScrollOffsetUpdate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        return ((SnapFlingBehavior$fling$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (AnimationResult) obj;
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return (AnimationResult) obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        float abs = Math.abs(this.$initialVelocity);
        f = this.this$0.velocityThreshold;
        if (abs <= Math.abs(f)) {
            this.label = 1;
            obj = this.this$0.shortSnap(this.$this_fling, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (AnimationResult) obj;
        }
        this.label = 2;
        obj = this.this$0.longSnap(this.$this_fling, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (AnimationResult) obj;
    }
}
