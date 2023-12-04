package com.ifriend.domain.logic.chat.gifts;

import com.google.zxing.pdf417.PDF417Common;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatGiftsUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.gifts.ChatGiftsUseCase", f = "ChatGiftsUseCase.kt", i = {}, l = {PDF417Common.MAX_ROWS_IN_BARCODE}, m = "safeRefresh", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatGiftsUseCase$safeRefresh$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatGiftsUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsUseCase$safeRefresh$1(ChatGiftsUseCase chatGiftsUseCase, Continuation<? super ChatGiftsUseCase$safeRefresh$1> continuation) {
        super(continuation);
        this.this$0 = chatGiftsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.safeRefresh(null, this);
    }
}
