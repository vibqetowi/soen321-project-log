package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.DelayKt;
/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class StartedWhileSubscribed$command$1 extends SuspendLambda implements Function3<FlowCollector<? super SharingCommand>, Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StartedWhileSubscribed this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, Continuation<? super StartedWhileSubscribed$command$1> continuation) {
        super(3, continuation);
        this.this$0 = startedWhileSubscribed;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super SharingCommand> flowCollector, Integer num, Continuation<? super Unit> continuation) {
        return invoke(flowCollector, num.intValue(), continuation);
    }

    public final Object invoke(FlowCollector<? super SharingCommand> flowCollector, int i, Continuation<? super Unit> continuation) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, continuation);
        startedWhileSubscribed$command$1.L$0 = flowCollector;
        startedWhileSubscribed$command$1.I$0 = i;
        return startedWhileSubscribed$command$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        long j;
        long j2;
        long j3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (this.I$0 <= 0) {
                j = this.this$0.stopTimeout;
                this.L$0 = flowCollector;
                this.label = 2;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j2 = this.this$0.replayExpiration;
                if (j2 > 0) {
                }
                this.L$0 = null;
                this.label = 5;
                if (flowCollector.emit(SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (flowCollector.emit(SharingCommand.START, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i == 2) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                j2 = this.this$0.replayExpiration;
                if (j2 > 0) {
                    this.L$0 = flowCollector;
                    this.label = 3;
                    if (flowCollector.emit(SharingCommand.STOP, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j3 = this.this$0.replayExpiration;
                    this.L$0 = flowCollector;
                    this.label = 4;
                    if (DelayKt.delay(j3, this) == coroutine_suspended) {
                    }
                }
                this.L$0 = null;
                this.label = 5;
                if (flowCollector.emit(SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            } else if (i == 3) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                j3 = this.this$0.replayExpiration;
                this.L$0 = flowCollector;
                this.label = 4;
                if (DelayKt.delay(j3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = null;
                this.label = 5;
                if (flowCollector.emit(SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            } else if (i == 4) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 5;
                if (flowCollector.emit(SharingCommand.STOP_AND_RESET_REPLAY_CACHE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } else if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
