package com.ifriend.presentation.features.chat.message;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessageAccessDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegateImpl", f = "ChatMessageAccessDelegate.kt", i = {}, l = {327}, m = "getBuyMessagePurchaseReason", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessageAccessDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1(ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl, Continuation<? super ChatMessageAccessDelegateImpl$getBuyMessagePurchaseReason$1> continuation) {
        super(continuation);
        this.this$0 = chatMessageAccessDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object buyMessagePurchaseReason;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        buyMessagePurchaseReason = this.this$0.getBuyMessagePurchaseReason(null, this);
        return buyMessagePurchaseReason;
    }
}
