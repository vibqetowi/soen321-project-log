package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlowKt__ErrorsKt$catchImpl$2<T> implements FlowCollector {
    final /* synthetic */ FlowCollector<T> $collector;
    final /* synthetic */ Ref.ObjectRef<Throwable> $fromDownstream;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ErrorsKt$catchImpl$2(FlowCollector<? super T> flowCollector, Ref.ObjectRef<Throwable> objectRef) {
        this.$collector = flowCollector;
        this.$fromDownstream = objectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        int i;
        FlowKt__ErrorsKt$catchImpl$2<T> flowKt__ErrorsKt$catchImpl$2;
        if (continuation instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
            if ((flowKt__ErrorsKt$catchImpl$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$2$emit$1.label -= Integer.MIN_VALUE;
                Object obj = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        FlowCollector<T> flowCollector = this.$collector;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.L$0 = this;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.label = 1;
                        if (flowCollector.emit(t, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable t2) {
                        t2 = th;
                        flowKt__ErrorsKt$catchImpl$2 = this;
                        flowKt__ErrorsKt$catchImpl$2.$fromDownstream.element = t2;
                        throw ((Throwable) t2);
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    flowKt__ErrorsKt$catchImpl$2 = (FlowKt__ErrorsKt$catchImpl$2) flowKt__ErrorsKt$catchImpl$2$emit$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable t22) {
                        t22 = th;
                        flowKt__ErrorsKt$catchImpl$2.$fromDownstream.element = t22;
                        throw ((Throwable) t22);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
        Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
