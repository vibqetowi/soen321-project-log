package kotlinx.coroutines.stream;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Stream.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "stream", "Ljava/util/stream/Stream;", "(Ljava/util/stream/Stream;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StreamFlow<T> implements Flow<T> {
    private static final AtomicIntegerFieldUpdater consumed$FU = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed");
    @Volatile
    private volatile int consumed = 0;
    private final Stream<T> stream;

    public StreamFlow(Stream<T> stream) {
        this.stream = stream;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0032, B:22:0x0057, B:24:0x005d), top: B:35:0x0032 }] */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        StreamFlow$collect$1 streamFlow$collect$1;
        int i;
        StreamFlow<T> streamFlow;
        Iterator it;
        FlowCollector<? super T> flowCollector2;
        Iterator it2;
        if (continuation instanceof StreamFlow$collect$1) {
            streamFlow$collect$1 = (StreamFlow$collect$1) continuation;
            if ((streamFlow$collect$1.label & Integer.MIN_VALUE) != 0) {
                streamFlow$collect$1.label -= Integer.MIN_VALUE;
                Object obj = streamFlow$collect$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = streamFlow$collect$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!consumed$FU.compareAndSet(this, 0, 1)) {
                        throw new IllegalStateException("Stream.consumeAsFlow can be collected only once".toString());
                    }
                    try {
                        it = this.stream.iterator();
                        streamFlow = this;
                        flowCollector2 = flowCollector;
                        it2 = it;
                    } catch (Throwable th) {
                        th = th;
                        streamFlow = this;
                        streamFlow.stream.close();
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it2 = (Iterator) streamFlow$collect$1.L$2;
                    FlowCollector<? super T> flowCollector3 = (FlowCollector) streamFlow$collect$1.L$1;
                    streamFlow = (StreamFlow) streamFlow$collect$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        flowCollector2 = flowCollector3;
                    } catch (Throwable th2) {
                        th = th2;
                        streamFlow.stream.close();
                        throw th;
                    }
                }
                while (it2.hasNext()) {
                    streamFlow$collect$1.L$0 = streamFlow;
                    streamFlow$collect$1.L$1 = flowCollector2;
                    streamFlow$collect$1.L$2 = it2;
                    streamFlow$collect$1.label = 1;
                    if (flowCollector2.emit((Object) it2.next(), streamFlow$collect$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                streamFlow.stream.close();
                return Unit.INSTANCE;
            }
        }
        streamFlow$collect$1 = new StreamFlow$collect$1(this, continuation);
        Object obj2 = streamFlow$collect$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = streamFlow$collect$1.label;
        if (i != 0) {
        }
        while (it2.hasNext()) {
        }
        streamFlow.stream.close();
        return Unit.INSTANCE;
    }
}
