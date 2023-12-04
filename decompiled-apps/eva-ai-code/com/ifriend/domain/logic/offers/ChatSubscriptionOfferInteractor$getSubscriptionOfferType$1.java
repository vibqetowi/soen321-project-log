package com.ifriend.domain.logic.offers;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatSubscriptionOfferInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.offers.ChatSubscriptionOfferInteractor", f = "ChatSubscriptionOfferInteractor.kt", i = {0, 0, 1, 1}, l = {28, 32}, m = "getSubscriptionOfferType", n = {"this", "user", "this", "user"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatSubscriptionOfferInteractor$getSubscriptionOfferType$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatSubscriptionOfferInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionOfferInteractor$getSubscriptionOfferType$1(ChatSubscriptionOfferInteractor chatSubscriptionOfferInteractor, Continuation<? super ChatSubscriptionOfferInteractor$getSubscriptionOfferType$1> continuation) {
        super(continuation);
        this.this$0 = chatSubscriptionOfferInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getSubscriptionOfferType(this);
    }
}
