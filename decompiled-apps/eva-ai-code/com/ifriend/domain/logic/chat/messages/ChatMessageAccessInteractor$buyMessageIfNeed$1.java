package com.ifriend.domain.logic.chat.messages;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessageAccessInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor", f = "ChatMessageAccessInteractor.kt", i = {0, 0, 0}, l = {328, 332}, m = "buyMessageIfNeed", n = {"this", "info", "chatId"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class ChatMessageAccessInteractor$buyMessageIfNeed$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessageAccessInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageAccessInteractor$buyMessageIfNeed$1(ChatMessageAccessInteractor chatMessageAccessInteractor, Continuation<? super ChatMessageAccessInteractor$buyMessageIfNeed$1> continuation) {
        super(continuation);
        this.this$0 = chatMessageAccessInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object buyMessageIfNeed;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        buyMessageIfNeed = this.this$0.buyMessageIfNeed(null, false, null, this);
        return buyMessageIfNeed;
    }
}
