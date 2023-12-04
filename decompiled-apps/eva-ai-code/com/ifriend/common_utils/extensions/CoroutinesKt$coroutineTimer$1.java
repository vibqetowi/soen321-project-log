package com.ifriend.common_utils.extensions;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: coroutines.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.common_utils.extensions.CoroutinesKt$coroutineTimer$1", f = "coroutines.kt", i = {0, 1}, l = {9, 10}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
final class CoroutinesKt$coroutineTimer$1 extends SuspendLambda implements Function2<FlowCollector<? super Long>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $period;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesKt$coroutineTimer$1(long j, Continuation<? super CoroutinesKt$coroutineTimer$1> continuation) {
        super(2, continuation);
        this.$period = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoroutinesKt$coroutineTimer$1 coroutinesKt$coroutineTimer$1 = new CoroutinesKt$coroutineTimer$1(this.$period, continuation);
        coroutinesKt$coroutineTimer$1.L$0 = obj;
        return coroutinesKt$coroutineTimer$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Long> flowCollector, Continuation<? super Unit> continuation) {
        return ((CoroutinesKt$coroutineTimer$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:12:0x0030). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        CoroutinesKt$coroutineTimer$1 coroutinesKt$coroutineTimer$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
        } else if (i == 1) {
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            CoroutinesKt$coroutineTimer$1 coroutinesKt$coroutineTimer$12 = this;
            coroutinesKt$coroutineTimer$12.L$0 = flowCollector2;
            coroutinesKt$coroutineTimer$12.label = 2;
            if (flowCollector2.emit(Boxing.boxLong(coroutinesKt$coroutineTimer$12.$period), coroutinesKt$coroutineTimer$12) != coroutine_suspended) {
                return coroutine_suspended;
            }
            FlowCollector flowCollector3 = flowCollector2;
            coroutinesKt$coroutineTimer$1 = coroutinesKt$coroutineTimer$12;
            flowCollector = flowCollector3;
            coroutinesKt$coroutineTimer$1.L$0 = flowCollector;
            coroutinesKt$coroutineTimer$1.label = 1;
            if (DelayKt.delay(coroutinesKt$coroutineTimer$1.$period, coroutinesKt$coroutineTimer$1) != coroutine_suspended) {
                return coroutine_suspended;
            }
            CoroutinesKt$coroutineTimer$1 coroutinesKt$coroutineTimer$13 = coroutinesKt$coroutineTimer$1;
            flowCollector2 = flowCollector;
            coroutinesKt$coroutineTimer$12 = coroutinesKt$coroutineTimer$13;
            coroutinesKt$coroutineTimer$12.L$0 = flowCollector2;
            coroutinesKt$coroutineTimer$12.label = 2;
            if (flowCollector2.emit(Boxing.boxLong(coroutinesKt$coroutineTimer$12.$period), coroutinesKt$coroutineTimer$12) != coroutine_suspended) {
            }
        } else if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
        }
        coroutinesKt$coroutineTimer$1 = this;
        coroutinesKt$coroutineTimer$1.L$0 = flowCollector;
        coroutinesKt$coroutineTimer$1.label = 1;
        if (DelayKt.delay(coroutinesKt$coroutineTimer$1.$period, coroutinesKt$coroutineTimer$1) != coroutine_suspended) {
        }
    }
}
