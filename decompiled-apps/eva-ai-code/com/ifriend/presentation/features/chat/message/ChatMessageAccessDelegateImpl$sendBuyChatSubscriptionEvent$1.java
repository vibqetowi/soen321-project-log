package com.ifriend.presentation.features.chat.message;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessageAccessDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegateImpl", f = "ChatMessageAccessDelegate.kt", i = {0, 0}, l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m = "sendBuyChatSubscriptionEvent", n = {"this", "requestId"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessageAccessDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1(ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl, Continuation<? super ChatMessageAccessDelegateImpl$sendBuyChatSubscriptionEvent$1> continuation) {
        super(continuation);
        this.this$0 = chatMessageAccessDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendBuyChatSubscriptionEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendBuyChatSubscriptionEvent = this.this$0.sendBuyChatSubscriptionEvent(null, null, null, this);
        return sendBuyChatSubscriptionEvent;
    }
}
