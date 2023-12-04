package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transform.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlowKt__TransformKt$runningFold$1$1<T> implements FlowCollector {
    final /* synthetic */ Ref.ObjectRef<R> $accumulator;
    final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;
    final /* synthetic */ FlowCollector<R> $this_unsafeFlow;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningFold$1$1(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, FlowCollector<? super R> flowCollector) {
        this.$accumulator = objectRef;
        this.$operation = function3;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        Object coroutine_suspended;
        int i;
        FlowKt__TransformKt$runningFold$1$1<T> flowKt__TransformKt$runningFold$1$1;
        Ref.ObjectRef objectRef;
        FlowCollector<R> flowCollector;
        T t2;
        if (continuation instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) {
            flowKt__TransformKt$runningFold$1$1$emit$1 = (FlowKt__TransformKt$runningFold$1$1$emit$1) continuation;
            if ((flowKt__TransformKt$runningFold$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$1$1$emit$1.label -= Integer.MIN_VALUE;
                T t3 = (T) flowKt__TransformKt$runningFold$1$1$emit$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__TransformKt$runningFold$1$1$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(t3);
                    Ref.ObjectRef objectRef2 = this.$accumulator;
                    Function3<R, T, Continuation<? super R>, Object> function3 = this.$operation;
                    T t4 = objectRef2.element;
                    flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = this;
                    flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = objectRef2;
                    flowKt__TransformKt$runningFold$1$1$emit$1.label = 1;
                    Object invoke = function3.invoke(t4, t, flowKt__TransformKt$runningFold$1$1$emit$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__TransformKt$runningFold$1$1 = this;
                    t3 = (T) invoke;
                    objectRef = objectRef2;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(t3);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    objectRef = (Ref.ObjectRef) flowKt__TransformKt$runningFold$1$1$emit$1.L$1;
                    flowKt__TransformKt$runningFold$1$1 = (FlowKt__TransformKt$runningFold$1$1) flowKt__TransformKt$runningFold$1$1$emit$1.L$0;
                    ResultKt.throwOnFailure(t3);
                }
                objectRef.element = t3;
                flowCollector = flowKt__TransformKt$runningFold$1$1.$this_unsafeFlow;
                t2 = flowKt__TransformKt$runningFold$1$1.$accumulator.element;
                flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
                if (flowCollector.emit(t2, flowKt__TransformKt$runningFold$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
        T t32 = (T) flowKt__TransformKt$runningFold$1$1$emit$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__TransformKt$runningFold$1$1$emit$1.label;
        if (i != 0) {
        }
        objectRef.element = t32;
        flowCollector = flowKt__TransformKt$runningFold$1$1.$this_unsafeFlow;
        t2 = flowKt__TransformKt$runningFold$1$1.$accumulator.element;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningFold$1$1$emit$1.label = 2;
        if (flowCollector.emit(t2, flowKt__TransformKt$runningFold$1$1$emit$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
