package com.ifriend.domain.infrastucture;

import com.ifriend.internal_notifications.notification.HandlingStrategy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InternetConnectionDialogsManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/ifriend/domain/infrastucture/Connectivity;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.infrastucture.InternetConnectionDialogsManager$flow$1$1", f = "InternetConnectionDialogsManager.kt", i = {0}, l = {19, 20}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class InternetConnectionDialogsManager$flow$1$1 extends SuspendLambda implements Function2<FlowCollector<? super Connectivity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Connectivity $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternetConnectionDialogsManager$flow$1$1(Connectivity connectivity, Continuation<? super InternetConnectionDialogsManager$flow$1$1> continuation) {
        super(2, continuation);
        this.$it = connectivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternetConnectionDialogsManager$flow$1$1 internetConnectionDialogsManager$flow$1$1 = new InternetConnectionDialogsManager$flow$1$1(this.$it, continuation);
        internetConnectionDialogsManager$flow$1$1.L$0 = obj;
        return internetConnectionDialogsManager$flow$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Connectivity> flowCollector, Continuation<? super Unit> continuation) {
        return ((InternetConnectionDialogsManager$flow$1$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            this.L$0 = flowCollector;
            this.label = 1;
            if (DelayKt.delay(HandlingStrategy.DEFAULT_TTL, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(this.$it, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
