package com.ifriend.presentation.features.chat.message;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessageAccessDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegateImpl", f = "ChatMessageAccessDelegate.kt", i = {0, 0, 0}, l = {TsExtractor.TS_PACKET_SIZE}, m = "sendBuyMessageEvent", n = {"this", "requestId", "accessActionType"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class ChatMessageAccessDelegateImpl$sendBuyMessageEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessageAccessDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageAccessDelegateImpl$sendBuyMessageEvent$1(ChatMessageAccessDelegateImpl chatMessageAccessDelegateImpl, Continuation<? super ChatMessageAccessDelegateImpl$sendBuyMessageEvent$1> continuation) {
        super(continuation);
        this.this$0 = chatMessageAccessDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendBuyMessageEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendBuyMessageEvent = this.this$0.sendBuyMessageEvent(null, null, null, this);
        return sendBuyMessageEvent;
    }
}
