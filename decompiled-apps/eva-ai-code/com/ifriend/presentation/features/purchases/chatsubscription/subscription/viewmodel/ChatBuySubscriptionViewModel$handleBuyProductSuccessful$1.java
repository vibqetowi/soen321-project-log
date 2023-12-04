package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
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
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$handleBuyProductSuccessful$1", f = "ChatBuySubscriptionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel$handleBuyProductSuccessful$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatBuySubscriptionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionViewModel$handleBuyProductSuccessful$1(ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, Continuation<? super ChatBuySubscriptionViewModel$handleBuyProductSuccessful$1> continuation) {
        super(2, continuation);
        this.this$0 = chatBuySubscriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatBuySubscriptionViewModel$handleBuyProductSuccessful$1 chatBuySubscriptionViewModel$handleBuyProductSuccessful$1 = new ChatBuySubscriptionViewModel$handleBuyProductSuccessful$1(this.this$0, continuation);
        chatBuySubscriptionViewModel$handleBuyProductSuccessful$1.L$0 = obj;
        return chatBuySubscriptionViewModel$handleBuyProductSuccessful$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((ChatBuySubscriptionViewModel$handleBuyProductSuccessful$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsInteractor analyticsInteractor;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            analyticsInteractor = this.this$0.analyticsInteractor;
            analyticsInteractor.trackException("ChatBuySubscription:refresh chat configuration", (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
