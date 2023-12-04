package com.ifriend.domain.logic.chat.subscription;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatSubscriptionInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor", f = "ChatSubscriptionInteractor.kt", i = {0}, l = {28}, m = "getChatSubscriptionStateFlow", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatSubscriptionInteractor$getChatSubscriptionStateFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatSubscriptionInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionInteractor$getChatSubscriptionStateFlow$1(ChatSubscriptionInteractor chatSubscriptionInteractor, Continuation<? super ChatSubscriptionInteractor$getChatSubscriptionStateFlow$1> continuation) {
        super(continuation);
        this.this$0 = chatSubscriptionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getChatSubscriptionStateFlow(null, this);
    }
}
