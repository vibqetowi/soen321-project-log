package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel", f = "ChatBuySubscriptionViewModel.kt", i = {0}, l = {166, 167}, m = "buyProductSuccessful", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel$buyProductSuccessful$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatBuySubscriptionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionViewModel$buyProductSuccessful$1(ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, Continuation<? super ChatBuySubscriptionViewModel$buyProductSuccessful$1> continuation) {
        super(continuation);
        this.this$0 = chatBuySubscriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object buyProductSuccessful;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        buyProductSuccessful = this.this$0.buyProductSuccessful(this);
        return buyProductSuccessful;
    }
}
