package com.ifriend.common_utils.data;

import com.ifriend.common_utils.data.Resource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: NetworkBoundResource.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@"}, d2 = {"ResultType", "RequestType", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/ifriend/common_utils/data/Resource;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.common_utils.data.NetworkBoundResourceKt$networkBoundResource$2", f = "NetworkBoundResource.kt", i = {0, 1, 2, 3}, l = {11, 14, 17, 17, 26}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class NetworkBoundResourceKt$networkBoundResource$2 extends SuspendLambda implements Function2<FlowCollector<? super Resource<ResultType>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super RequestType>, Object> $fetch;
    final /* synthetic */ Function0<Flow<ResultType>> $query;
    final /* synthetic */ Function2<RequestType, Continuation<? super Unit>, Object> $saveFetchResult;
    final /* synthetic */ Function1<ResultType, Boolean> $shouldFetch;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NetworkBoundResourceKt$networkBoundResource$2(Function0<? extends Flow<? extends ResultType>> function0, Function1<? super ResultType, Boolean> function1, Function2<? super RequestType, ? super Continuation<? super Unit>, ? extends Object> function2, Function1<? super Continuation<? super RequestType>, ? extends Object> function12, Continuation<? super NetworkBoundResourceKt$networkBoundResource$2> continuation) {
        super(2, continuation);
        this.$query = function0;
        this.$shouldFetch = function1;
        this.$saveFetchResult = function2;
        this.$fetch = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetworkBoundResourceKt$networkBoundResource$2 networkBoundResourceKt$networkBoundResource$2 = new NetworkBoundResourceKt$networkBoundResource$2(this.$query, this.$shouldFetch, this.$saveFetchResult, this.$fetch, continuation);
        networkBoundResourceKt$networkBoundResource$2.L$0 = obj;
        return networkBoundResourceKt$networkBoundResource$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Resource<ResultType>> flowCollector, Continuation<? super Unit> continuation) {
        return ((NetworkBoundResourceKt$networkBoundResource$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3 networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2;
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        FlowCollector flowCollector3;
        Object invoke;
        Function2 function2;
        FlowCollector flowCollector4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        FlowCollector flowCollector5 = this.label;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (flowCollector5 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector6 = (FlowCollector) this.L$0;
            this.L$0 = flowCollector6;
            this.label = 1;
            obj = FlowKt.first((Flow) this.$query.invoke(), this);
            flowCollector2 = flowCollector6;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (flowCollector5 == 1) {
            ResultKt.throwOnFailure(obj);
            flowCollector2 = (FlowCollector) this.L$0;
        } else if (flowCollector5 != 2) {
            if (flowCollector5 != 3) {
                if (flowCollector5 != 4) {
                    if (flowCollector5 == 5) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FlowCollector flowCollector7 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                flowCollector5 = flowCollector7;
                networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2 = new NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$1((Flow) this.$query.invoke());
                flowCollector = flowCollector5;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 5;
                if (FlowKt.emitAll(flowCollector, networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            function2 = (Function2) this.L$1;
            flowCollector4 = (FlowCollector) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                this.L$0 = flowCollector4;
                this.L$1 = null;
                this.label = 4;
            } catch (Throwable th2) {
                th = th2;
                flowCollector5 = flowCollector4;
                networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2 = new NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2((Flow) this.$query.invoke(), th);
                flowCollector = flowCollector5;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 5;
                if (FlowKt.emitAll(flowCollector, networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
            if (function2.invoke(obj, this) != coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector5 = flowCollector4;
            networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2 = new NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$1((Flow) this.$query.invoke());
            flowCollector = flowCollector5;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 5;
            if (FlowKt.emitAll(flowCollector, networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2, this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
            flowCollector3 = (FlowCollector) this.L$0;
            Function2 function22 = this.$saveFetchResult;
            Function1 function1 = this.$fetch;
            this.L$0 = flowCollector3;
            this.L$1 = function22;
            this.label = 3;
            invoke = function1.invoke(this);
            if (invoke != coroutine_suspended) {
                return coroutine_suspended;
            }
            FlowCollector flowCollector8 = flowCollector3;
            function2 = function22;
            obj = invoke;
            flowCollector4 = flowCollector8;
            this.L$0 = flowCollector4;
            this.L$1 = null;
            this.label = 4;
            if (function2.invoke(obj, this) != coroutine_suspended) {
            }
        }
        if (((Boolean) this.$shouldFetch.invoke(obj)).booleanValue()) {
            this.L$0 = flowCollector2;
            this.label = 2;
            Object emit = flowCollector2.emit(new Resource.Loading(obj), this);
            flowCollector3 = flowCollector2;
            if (emit == coroutine_suspended) {
                return coroutine_suspended;
            }
            Function2 function222 = this.$saveFetchResult;
            Function1 function12 = this.$fetch;
            this.L$0 = flowCollector3;
            this.L$1 = function222;
            this.label = 3;
            invoke = function12.invoke(this);
            if (invoke != coroutine_suspended) {
            }
        } else {
            networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2 = new NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3((Flow) this.$query.invoke());
            flowCollector = flowCollector2;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 5;
            if (FlowKt.emitAll(flowCollector, networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2, this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3 networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        NetworkBoundResourceKt$networkBoundResource$2 networkBoundResourceKt$networkBoundResource$2 = this;
        InlineMarker.mark(0);
        Object first = FlowKt.first((Flow) this.$query.invoke(), networkBoundResourceKt$networkBoundResource$2);
        InlineMarker.mark(1);
        if (this.$shouldFetch.invoke(first).booleanValue()) {
            Resource.Loading loading = new Resource.Loading(first);
            InlineMarker.mark(0);
            flowCollector.emit(loading, networkBoundResourceKt$networkBoundResource$2);
            InlineMarker.mark(1);
            try {
                this.$saveFetchResult.invoke(this.$fetch.invoke(this), this);
                networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3 = new NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$1((Flow) this.$query.invoke());
            } catch (Throwable th) {
                networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3 = new NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$2((Flow) this.$query.invoke(), th);
            }
        } else {
            networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3 = new NetworkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3((Flow) this.$query.invoke());
        }
        InlineMarker.mark(0);
        FlowKt.emitAll(flowCollector, networkBoundResourceKt$networkBoundResource$2$invokeSuspend$$inlined$map$3, networkBoundResourceKt$networkBoundResource$2);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
