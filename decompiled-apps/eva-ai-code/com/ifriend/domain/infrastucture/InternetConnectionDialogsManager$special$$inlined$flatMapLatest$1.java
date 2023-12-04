package com.ifriend.domain.infrastucture;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.infrastucture.InternetConnectionDialogsManager$special$$inlined$flatMapLatest$1", f = "InternetConnectionDialogsManager.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InternetConnectionDialogsManager$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Connectivity>, Connectivity, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public InternetConnectionDialogsManager$special$$inlined$flatMapLatest$1(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Connectivity> flowCollector, Connectivity connectivity, Continuation<? super Unit> continuation) {
        InternetConnectionDialogsManager$special$$inlined$flatMapLatest$1 internetConnectionDialogsManager$special$$inlined$flatMapLatest$1 = new InternetConnectionDialogsManager$special$$inlined$flatMapLatest$1(continuation);
        internetConnectionDialogsManager$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        internetConnectionDialogsManager$special$$inlined$flatMapLatest$1.L$1 = connectivity;
        return internetConnectionDialogsManager$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            InternetConnectionDialogsManager$special$$inlined$flatMapLatest$1 internetConnectionDialogsManager$special$$inlined$flatMapLatest$1 = this;
            Connectivity connectivity = (Connectivity) this.L$1;
            if (connectivity.isFullyConnected()) {
                flow = FlowKt.flowOf(connectivity);
            } else {
                flow = FlowKt.flow(new InternetConnectionDialogsManager$flow$1$1(connectivity, null));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, internetConnectionDialogsManager$special$$inlined$flatMapLatest$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
