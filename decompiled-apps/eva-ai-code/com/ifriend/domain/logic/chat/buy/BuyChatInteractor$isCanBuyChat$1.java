package com.ifriend.domain.logic.chat.buy;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyChatInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.buy.BuyChatInteractor", f = "BuyChatInteractor.kt", i = {0, 0, 1}, l = {27, 28}, m = "isCanBuyChat", n = {"this", "chatId", "neurons"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes6.dex */
public final class BuyChatInteractor$isCanBuyChat$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BuyChatInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyChatInteractor$isCanBuyChat$1(BuyChatInteractor buyChatInteractor, Continuation<? super BuyChatInteractor$isCanBuyChat$1> continuation) {
        super(continuation);
        this.this$0 = buyChatInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isCanBuyChat(null, this);
    }
}
