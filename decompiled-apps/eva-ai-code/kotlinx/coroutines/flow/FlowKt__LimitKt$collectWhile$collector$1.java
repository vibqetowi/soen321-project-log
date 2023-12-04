package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.flow.internal.AbortFlowException;
/* compiled from: Limit.kt */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1 implements FlowCollector<T> {
    final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> $predicate;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$collectWhile$collector$1(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        this.$predicate = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(T t, Continuation<? super Unit> continuation) {
        FlowKt__LimitKt$collectWhile$collector$1$emit$1 flowKt__LimitKt$collectWhile$collector$1$emit$1;
        Object obj;
        int i;
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1;
        if (continuation instanceof FlowKt__LimitKt$collectWhile$collector$1$emit$1) {
            flowKt__LimitKt$collectWhile$collector$1$emit$1 = (FlowKt__LimitKt$collectWhile$collector$1$emit$1) continuation;
            if ((flowKt__LimitKt$collectWhile$collector$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$collector$1$emit$1.label -= Integer.MIN_VALUE;
                obj = flowKt__LimitKt$collectWhile$collector$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2<T, Continuation<? super Boolean>, Object> function2 = this.$predicate;
                    flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0 = this;
                    flowKt__LimitKt$collectWhile$collector$1$emit$1.label = 1;
                    obj = function2.invoke(t, flowKt__LimitKt$collectWhile$collector$1$emit$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__LimitKt$collectWhile$collector$1 = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    flowKt__LimitKt$collectWhile$collector$1 = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$collector$1$emit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new AbortFlowException(flowKt__LimitKt$collectWhile$collector$1);
                }
                return Unit.INSTANCE;
            }
        }
        flowKt__LimitKt$collectWhile$collector$1$emit$1 = new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
        obj = flowKt__LimitKt$collectWhile$collector$1$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LimitKt$collectWhile$collector$1$emit$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public Object emit$$forInline(T t, Continuation<? super Unit> continuation) {
        InlineMarker.mark(4);
        new FlowKt__LimitKt$collectWhile$collector$1$emit$1(this, continuation);
        InlineMarker.mark(5);
        if (!((Boolean) this.$predicate.invoke(t, continuation)).booleanValue()) {
            throw new AbortFlowException(this);
        }
        return Unit.INSTANCE;
    }
}
