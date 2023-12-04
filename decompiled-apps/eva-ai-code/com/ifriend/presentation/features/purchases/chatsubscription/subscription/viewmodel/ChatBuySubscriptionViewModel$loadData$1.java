package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$loadData$1", f = "ChatBuySubscriptionViewModel.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel$loadData$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatBuySubscriptionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionViewModel$loadData$1(ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, Continuation<? super ChatBuySubscriptionViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = chatBuySubscriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatBuySubscriptionViewModel$loadData$1 chatBuySubscriptionViewModel$loadData$1 = new ChatBuySubscriptionViewModel$loadData$1(this.this$0, continuation);
        chatBuySubscriptionViewModel$loadData$1.L$0 = obj;
        return chatBuySubscriptionViewModel$loadData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((ChatBuySubscriptionViewModel$loadData$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsInteractor analyticsInteractor;
        FlowObserverEmitter flowObserverEmitter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            analyticsInteractor = this.this$0.analyticsInteractor;
            analyticsInteractor.trackException("load products", th);
            flowObserverEmitter = this.this$0.exceptionsEmitter;
            this.label = 1;
            if (flowObserverEmitter.emit(th, this) == coroutine_suspended) {
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
