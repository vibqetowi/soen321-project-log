package com.ifriend.core;

import android.util.Log;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.infrastucture.Connectivity;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.domain.socket.MessagesSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessagesSourceLifecycleController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.core.MessagesSourceLifecycleController$subscribeOnConnectionAvailability$1", f = "MessagesSourceLifecycleController.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class MessagesSourceLifecycleController$subscribeOnConnectionAvailability$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MessagesSourceLifecycleController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesSourceLifecycleController$subscribeOnConnectionAvailability$1(MessagesSourceLifecycleController messagesSourceLifecycleController, Continuation<? super MessagesSourceLifecycleController$subscribeOnConnectionAvailability$1> continuation) {
        super(2, continuation);
        this.this$0 = messagesSourceLifecycleController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessagesSourceLifecycleController$subscribeOnConnectionAvailability$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessagesSourceLifecycleController$subscribeOnConnectionAvailability$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InternetConnection internetConnection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            internetConnection = this.this$0.connection;
            Flow<Connectivity> connectivityFlow = internetConnection.getConnectivityFlow();
            final MessagesSourceLifecycleController messagesSourceLifecycleController = this.this$0;
            this.label = 1;
            if (connectivityFlow.collect(new FlowCollector() { // from class: com.ifriend.core.MessagesSourceLifecycleController$subscribeOnConnectionAvailability$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Connectivity) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Connectivity connectivity, Continuation<? super Unit> continuation) {
                    boolean z;
                    Logger logger;
                    MessagesSource messagesSource;
                    if (connectivity.isInternetAvailable()) {
                        z = MessagesSourceLifecycleController.this.isResumed;
                        if (z) {
                            Log.i("InternetConnection", "Connection is available, socket can be opened");
                            logger = MessagesSourceLifecycleController.this.logger;
                            logger.log("Connection is available, socket can be opened");
                            messagesSource = MessagesSourceLifecycleController.this.messagesSource;
                            Object start = messagesSource.start(continuation);
                            return start == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? start : Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
