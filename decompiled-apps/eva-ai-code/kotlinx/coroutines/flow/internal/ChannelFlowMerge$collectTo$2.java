package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Semaphore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "inner", "Lkotlinx/coroutines/flow/Flow;", "emit", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChannelFlowMerge$collectTo$2<T> implements FlowCollector {
    final /* synthetic */ SendingCollector<T> $collector;
    final /* synthetic */ Job $job;
    final /* synthetic */ ProducerScope<T> $scope;
    final /* synthetic */ Semaphore $semaphore;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2(Job job, Semaphore semaphore, ProducerScope<? super T> producerScope, SendingCollector<T> sendingCollector) {
        this.$job = job;
        this.$semaphore = semaphore;
        this.$scope = producerScope;
        this.$collector = sendingCollector;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit((Flow) ((Flow) obj), (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Flow<? extends T> flow, Continuation<? super Unit> continuation) {
        ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
        int i;
        ChannelFlowMerge$collectTo$2<T> channelFlowMerge$collectTo$2;
        if (continuation instanceof ChannelFlowMerge$collectTo$2$emit$1) {
            channelFlowMerge$collectTo$2$emit$1 = (ChannelFlowMerge$collectTo$2$emit$1) continuation;
            if ((channelFlowMerge$collectTo$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                channelFlowMerge$collectTo$2$emit$1.label -= Integer.MIN_VALUE;
                Object obj = channelFlowMerge$collectTo$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelFlowMerge$collectTo$2$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Job job = this.$job;
                    if (job != null) {
                        JobKt.ensureActive(job);
                    }
                    Semaphore semaphore = this.$semaphore;
                    channelFlowMerge$collectTo$2$emit$1.L$0 = this;
                    channelFlowMerge$collectTo$2$emit$1.L$1 = flow;
                    channelFlowMerge$collectTo$2$emit$1.label = 1;
                    if (semaphore.acquire(channelFlowMerge$collectTo$2$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channelFlowMerge$collectTo$2 = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    flow = (Flow) channelFlowMerge$collectTo$2$emit$1.L$1;
                    channelFlowMerge$collectTo$2 = (ChannelFlowMerge$collectTo$2) channelFlowMerge$collectTo$2$emit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                BuildersKt__Builders_commonKt.launch$default(channelFlowMerge$collectTo$2.$scope, null, null, new AnonymousClass1(flow, channelFlowMerge$collectTo$2.$collector, channelFlowMerge$collectTo$2.$semaphore, null), 3, null);
                return Unit.INSTANCE;
            }
        }
        channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, continuation);
        Object obj2 = channelFlowMerge$collectTo$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelFlowMerge$collectTo$2$emit$1.label;
        if (i != 0) {
        }
        BuildersKt__Builders_commonKt.launch$default(channelFlowMerge$collectTo$2.$scope, null, null, new AnonymousClass1(flow, channelFlowMerge$collectTo$2.$collector, channelFlowMerge$collectTo$2.$semaphore, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SendingCollector<T> $collector;
        final /* synthetic */ Flow<T> $inner;
        final /* synthetic */ Semaphore $semaphore;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Flow<? extends T> flow, SendingCollector<T> sendingCollector, Semaphore semaphore, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$inner = flow;
            this.$collector = sendingCollector;
            this.$semaphore = semaphore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$inner, this.$collector, this.$semaphore, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$inner.collect(this.$collector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                this.$semaphore.release();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.$semaphore.release();
                throw th;
            }
        }
    }
}
