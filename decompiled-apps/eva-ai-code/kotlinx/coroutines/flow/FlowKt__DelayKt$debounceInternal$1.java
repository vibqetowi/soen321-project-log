package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Delay.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {221, 416}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
public final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow<T> $this_debounceInternal;
    final /* synthetic */ Function1<T, Long> $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1(Function1<? super T, Long> function1, Flow<? extends T> flow, Continuation<? super FlowKt__DelayKt$debounceInternal$1> continuation) {
        super(3, continuation);
        this.$timeoutMillisSelector = function1;
        this.$this_debounceInternal = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, continuation);
        flowKt__DelayKt$debounceInternal$1.L$0 = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.L$1 = flowCollector;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x012d -> B:55:0x0132). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1;
        ReceiveChannel receiveChannel;
        Ref.ObjectRef objectRef;
        Ref.LongRef longRef;
        Ref.ObjectRef objectRef2;
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$12;
        SelectImplementation selectImplementation;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        long j = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ReceiveChannel produce$default = ProduceKt.produce$default((CoroutineScope) this.L$0, null, 0, new FlowKt__DelayKt$debounceInternal$1$values$1(this.$this_debounceInternal, null), 3, null);
            flowCollector = (FlowCollector) this.L$1;
            flowKt__DelayKt$debounceInternal$1 = this;
            receiveChannel = produce$default;
            objectRef = new Ref.ObjectRef();
            if (objectRef.element != NullSurrogateKt.DONE) {
            }
        } else if (i == 1) {
            objectRef = (Ref.ObjectRef) this.L$2;
            receiveChannel = (ReceiveChannel) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            longRef = (Ref.LongRef) this.L$3;
            flowKt__DelayKt$debounceInternal$1 = this;
            objectRef.element = null;
            objectRef2 = objectRef;
            flowKt__DelayKt$debounceInternal$12 = flowKt__DelayKt$debounceInternal$1;
            if (DebugKt.getASSERTIONS_ENABLED()) {
            }
            selectImplementation = new SelectImplementation(flowKt__DelayKt$debounceInternal$12.getContext());
            SelectImplementation selectImplementation2 = selectImplementation;
            if (objectRef2.element != 0) {
            }
            selectImplementation2.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, flowCollector, null));
            flowKt__DelayKt$debounceInternal$12.L$0 = flowCollector;
            flowKt__DelayKt$debounceInternal$12.L$1 = receiveChannel;
            flowKt__DelayKt$debounceInternal$12.L$2 = objectRef2;
            flowKt__DelayKt$debounceInternal$12.L$3 = null;
            flowKt__DelayKt$debounceInternal$12.label = 2;
            if (selectImplementation.doSelect(flowKt__DelayKt$debounceInternal$12) != coroutine_suspended) {
            }
        } else if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            receiveChannel = (ReceiveChannel) this.L$1;
            objectRef = (Ref.ObjectRef) this.L$2;
            flowKt__DelayKt$debounceInternal$1 = this;
            j = 0;
            if (objectRef.element != NullSurrogateKt.DONE) {
                longRef = new Ref.LongRef();
                if (objectRef.element != 0) {
                    Function1<T, Long> function1 = flowKt__DelayKt$debounceInternal$1.$timeoutMillisSelector;
                    Symbol symbol = NullSurrogateKt.NULL;
                    Object obj2 = objectRef.element;
                    if (obj2 == symbol) {
                        obj2 = null;
                    }
                    longRef.element = function1.invoke(obj2).longValue();
                    if (!(longRef.element >= j)) {
                        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
                    }
                    if (longRef.element == j) {
                        Symbol symbol2 = NullSurrogateKt.NULL;
                        Object obj3 = objectRef.element;
                        if (obj3 == symbol2) {
                            obj3 = null;
                        }
                        flowKt__DelayKt$debounceInternal$1.L$0 = flowCollector;
                        flowKt__DelayKt$debounceInternal$1.L$1 = receiveChannel;
                        flowKt__DelayKt$debounceInternal$1.L$2 = objectRef;
                        flowKt__DelayKt$debounceInternal$1.L$3 = longRef;
                        flowKt__DelayKt$debounceInternal$1.label = 1;
                        if (flowCollector.emit(obj3, flowKt__DelayKt$debounceInternal$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef.element = null;
                    }
                }
                objectRef2 = objectRef;
                flowKt__DelayKt$debounceInternal$12 = flowKt__DelayKt$debounceInternal$1;
                if (DebugKt.getASSERTIONS_ENABLED()) {
                    if (!(objectRef2.element == 0 || longRef.element > j)) {
                        throw new AssertionError();
                    }
                }
                selectImplementation = new SelectImplementation(flowKt__DelayKt$debounceInternal$12.getContext());
                SelectImplementation selectImplementation22 = selectImplementation;
                if (objectRef2.element != 0) {
                    OnTimeoutKt.onTimeout(selectImplementation22, longRef.element, new FlowKt__DelayKt$debounceInternal$1$3$1(flowCollector, objectRef2, null));
                }
                selectImplementation22.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$debounceInternal$1$3$2(objectRef2, flowCollector, null));
                flowKt__DelayKt$debounceInternal$12.L$0 = flowCollector;
                flowKt__DelayKt$debounceInternal$12.L$1 = receiveChannel;
                flowKt__DelayKt$debounceInternal$12.L$2 = objectRef2;
                flowKt__DelayKt$debounceInternal$12.L$3 = null;
                flowKt__DelayKt$debounceInternal$12.label = 2;
                if (selectImplementation.doSelect(flowKt__DelayKt$debounceInternal$12) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                flowKt__DelayKt$debounceInternal$1 = flowKt__DelayKt$debounceInternal$12;
                j = 0;
                if (objectRef.element != NullSurrogateKt.DONE) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
