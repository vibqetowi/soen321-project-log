package com.ifriend.presentation.features.chat.panel.delegate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl", f = "ChatPanelActionsDelegate.kt", i = {0, 0}, l = {368}, m = "getTopicsFlow", n = {"this", "chatId"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl$getTopicsFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$getTopicsFlow$1(ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, Continuation<? super ChatPanelActionsDelegateImpl$getTopicsFlow$1> continuation) {
        super(continuation);
        this.this$0 = chatPanelActionsDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object topicsFlow;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        topicsFlow = this.this$0.getTopicsFlow(null, this);
        return topicsFlow;
    }
}
