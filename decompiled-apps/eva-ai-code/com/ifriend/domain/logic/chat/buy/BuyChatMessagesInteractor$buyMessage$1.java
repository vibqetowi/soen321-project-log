package com.ifriend.domain.logic.chat.buy;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyChatMessagesInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.buy.BuyChatMessagesInteractor", f = "BuyChatMessagesInteractor.kt", i = {}, l = {21}, m = "buyMessage", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BuyChatMessagesInteractor$buyMessage$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BuyChatMessagesInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyChatMessagesInteractor$buyMessage$1(BuyChatMessagesInteractor buyChatMessagesInteractor, Continuation<? super BuyChatMessagesInteractor$buyMessage$1> continuation) {
        super(continuation);
        this.this$0 = buyChatMessagesInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.buyMessage(null, null, null, this);
    }
}
