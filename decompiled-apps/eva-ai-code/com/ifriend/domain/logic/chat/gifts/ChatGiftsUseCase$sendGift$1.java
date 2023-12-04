package com.ifriend.domain.logic.chat.gifts;

import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatGiftsUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.gifts.ChatGiftsUseCase", f = "ChatGiftsUseCase.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {50, 57, SSL.SSL_PROTOCOL_TLS, 74, 83}, m = "sendGift", n = {"this", "chatId", "giftId", "this", "chatId", "giftId", "gift", "isFree", "this", "chatId", "giftId", "isFree"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes6.dex */
public final class ChatGiftsUseCase$sendGift$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatGiftsUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsUseCase$sendGift$1(ChatGiftsUseCase chatGiftsUseCase, Continuation<? super ChatGiftsUseCase$sendGift$1> continuation) {
        super(continuation);
        this.this$0 = chatGiftsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendGift(null, null, this);
    }
}
