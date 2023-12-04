package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;
import org.apache.http.HttpStatus;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/FlowCollector;", "downStream", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {HttpStatus.SC_REQUEST_URI_TOO_LONG}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$timeoutInternal$1(long j, Flow<? extends T> flow, Continuation<? super FlowKt__DelayKt$timeoutInternal$1> continuation) {
        super(3, continuation);
        this.$timeout = j;
        this.$this_timeoutInternal = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, continuation);
        flowKt__DelayKt$timeoutInternal$1.L$0 = coroutineScope;
        flowKt__DelayKt$timeoutInternal$1.L$1 = flowCollector;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0085 -> B:15:0x008c). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Flow buffer$default;
        long j;
        FlowCollector flowCollector;
        ReceiveChannel receiveChannel;
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1;
        Object doSelect;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FlowCollector flowCollector2 = (FlowCollector) this.L$1;
            if (Duration.m8639compareToLRDsOJo(this.$timeout, Duration.Companion.m8743getZEROUwyO8pc()) > 0) {
                buffer$default = FlowKt__ContextKt.buffer$default(this.$this_timeoutInternal, 0, null, 2, null);
                ReceiveChannel produceIn = FlowKt.produceIn(buffer$default, coroutineScope);
                j = this.$timeout;
                flowCollector = flowCollector2;
                receiveChannel = produceIn;
                flowKt__DelayKt$timeoutInternal$1 = this;
                SelectImplementation selectImplementation = new SelectImplementation(flowKt__DelayKt$timeoutInternal$1.getContext());
                SelectImplementation selectImplementation2 = selectImplementation;
                selectImplementation2.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$timeoutInternal$1$1$1(flowCollector, null));
                OnTimeoutKt.m8882onTimeout8Mi8wO0(selectImplementation2, j, new FlowKt__DelayKt$timeoutInternal$1$1$2(j, null));
                flowKt__DelayKt$timeoutInternal$1.L$0 = flowCollector;
                flowKt__DelayKt$timeoutInternal$1.L$1 = receiveChannel;
                flowKt__DelayKt$timeoutInternal$1.J$0 = j;
                flowKt__DelayKt$timeoutInternal$1.label = 1;
                doSelect = selectImplementation.doSelect(flowKt__DelayKt$timeoutInternal$1);
                if (doSelect != coroutine_suspended) {
                }
            } else {
                throw new TimeoutCancellationException("Timed out immediately");
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            long j2 = this.J$0;
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            long j3 = j2;
            ReceiveChannel receiveChannel2 = (ReceiveChannel) this.L$1;
            Object obj2 = coroutine_suspended;
            FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$12 = this;
            if (((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            flowKt__DelayKt$timeoutInternal$1 = flowKt__DelayKt$timeoutInternal$12;
            coroutine_suspended = obj2;
            receiveChannel = receiveChannel2;
            j = j3;
            flowCollector = flowCollector3;
            SelectImplementation selectImplementation3 = new SelectImplementation(flowKt__DelayKt$timeoutInternal$1.getContext());
            SelectImplementation selectImplementation22 = selectImplementation3;
            selectImplementation22.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$timeoutInternal$1$1$1(flowCollector, null));
            OnTimeoutKt.m8882onTimeout8Mi8wO0(selectImplementation22, j, new FlowKt__DelayKt$timeoutInternal$1$1$2(j, null));
            flowKt__DelayKt$timeoutInternal$1.L$0 = flowCollector;
            flowKt__DelayKt$timeoutInternal$1.L$1 = receiveChannel;
            flowKt__DelayKt$timeoutInternal$1.J$0 = j;
            flowKt__DelayKt$timeoutInternal$1.label = 1;
            doSelect = selectImplementation3.doSelect(flowKt__DelayKt$timeoutInternal$1);
            if (doSelect != coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj3 = coroutine_suspended;
            flowKt__DelayKt$timeoutInternal$12 = flowKt__DelayKt$timeoutInternal$1;
            obj = doSelect;
            flowCollector3 = flowCollector;
            j3 = j;
            receiveChannel2 = receiveChannel;
            obj2 = obj3;
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }
}
