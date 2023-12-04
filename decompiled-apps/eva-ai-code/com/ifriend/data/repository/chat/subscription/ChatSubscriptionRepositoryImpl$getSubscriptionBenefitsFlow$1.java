package com.ifriend.data.repository.chat.subscription;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatSubscriptionRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.chat.subscription.ChatSubscriptionRepositoryImpl", f = "ChatSubscriptionRepositoryImpl.kt", i = {}, l = {33}, m = "getSubscriptionBenefitsFlow", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatSubscriptionRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1(ChatSubscriptionRepositoryImpl chatSubscriptionRepositoryImpl, Continuation<? super ChatSubscriptionRepositoryImpl$getSubscriptionBenefitsFlow$1> continuation) {
        super(continuation);
        this.this$0 = chatSubscriptionRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getSubscriptionBenefitsFlow(null, this);
    }
}
