package com.ifriend.domain.logic.chat.messages;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessageAccessInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor", f = "ChatMessageAccessInteractor.kt", i = {}, l = {44}, m = "getBalance", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatMessageAccessInteractor$getBalance$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessageAccessInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageAccessInteractor$getBalance$1(ChatMessageAccessInteractor chatMessageAccessInteractor, Continuation<? super ChatMessageAccessInteractor$getBalance$1> continuation) {
        super(continuation);
        this.this$0 = chatMessageAccessInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object balance;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        balance = this.this$0.getBalance(this);
        return balance;
    }
}
