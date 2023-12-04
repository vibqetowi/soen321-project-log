package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ForEachGesture.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {LocationRequestCompat.QUALITY_LOW_POWER, 107, 112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ CoroutineContext $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ForEachGestureKt$awaitEachGesture$2(CoroutineContext coroutineContext, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super ForEachGestureKt$awaitEachGesture$2> continuation) {
        super(2, continuation);
        this.$currentContext = coroutineContext;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, continuation);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0066 -> B:20:0x0040). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x008a -> B:20:0x0040). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2;
        AwaitPointerEventScope awaitPointerEventScope2;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        if (r1 != 0) {
            try {
            } catch (CancellationException e) {
                e = e;
                awaitPointerEventScope = r1;
                forEachGestureKt$awaitEachGesture$2 = this;
                if (JobKt.isActive(forEachGestureKt$awaitEachGesture$2.$currentContext)) {
                }
            }
            if (r1 != 1) {
                if (r1 == 2) {
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (r1 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                awaitPointerEventScope3 = awaitPointerEventScope2;
            } else {
                AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$22 = this;
                try {
                } catch (CancellationException e2) {
                    AwaitPointerEventScope awaitPointerEventScope5 = awaitPointerEventScope4;
                    forEachGestureKt$awaitEachGesture$2 = forEachGestureKt$awaitEachGesture$22;
                    e = e2;
                    awaitPointerEventScope = awaitPointerEventScope5;
                    if (JobKt.isActive(forEachGestureKt$awaitEachGesture$2.$currentContext)) {
                    }
                }
                forEachGestureKt$awaitEachGesture$22.L$0 = awaitPointerEventScope4;
                forEachGestureKt$awaitEachGesture$22.label = 2;
                if (ForEachGestureKt.awaitAllPointersUp(awaitPointerEventScope4, forEachGestureKt$awaitEachGesture$22) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                AwaitPointerEventScope awaitPointerEventScope6 = awaitPointerEventScope4;
                forEachGestureKt$awaitEachGesture$2 = forEachGestureKt$awaitEachGesture$22;
                awaitPointerEventScope3 = awaitPointerEventScope6;
                if (JobKt.isActive(forEachGestureKt$awaitEachGesture$2.$currentContext)) {
                    try {
                    } catch (CancellationException e3) {
                        awaitPointerEventScope = awaitPointerEventScope3;
                        e = e3;
                        if (JobKt.isActive(forEachGestureKt$awaitEachGesture$2.$currentContext)) {
                            forEachGestureKt$awaitEachGesture$2.L$0 = awaitPointerEventScope;
                            forEachGestureKt$awaitEachGesture$2.label = 3;
                            if (ForEachGestureKt.awaitAllPointersUp(awaitPointerEventScope, forEachGestureKt$awaitEachGesture$2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            awaitPointerEventScope3 = awaitPointerEventScope;
                            if (JobKt.isActive(forEachGestureKt$awaitEachGesture$2.$currentContext)) {
                            }
                        } else {
                            throw e;
                        }
                    }
                    Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = forEachGestureKt$awaitEachGesture$2.$block;
                    forEachGestureKt$awaitEachGesture$2.L$0 = awaitPointerEventScope3;
                    forEachGestureKt$awaitEachGesture$2.label = 1;
                    if (function2.invoke(awaitPointerEventScope3, forEachGestureKt$awaitEachGesture$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$23 = forEachGestureKt$awaitEachGesture$2;
                    awaitPointerEventScope4 = awaitPointerEventScope3;
                    forEachGestureKt$awaitEachGesture$22 = forEachGestureKt$awaitEachGesture$23;
                    forEachGestureKt$awaitEachGesture$22.L$0 = awaitPointerEventScope4;
                    forEachGestureKt$awaitEachGesture$22.label = 2;
                    if (ForEachGestureKt.awaitAllPointersUp(awaitPointerEventScope4, forEachGestureKt$awaitEachGesture$22) != coroutine_suspended) {
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
        }
        forEachGestureKt$awaitEachGesture$2 = this;
        if (JobKt.isActive(forEachGestureKt$awaitEachGesture$2.$currentContext)) {
        }
    }
}
