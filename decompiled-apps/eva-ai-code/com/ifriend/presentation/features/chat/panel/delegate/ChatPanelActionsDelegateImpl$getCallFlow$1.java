package com.ifriend.presentation.features.chat.panel.delegate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.http.HttpStatus;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl", f = "ChatPanelActionsDelegate.kt", i = {}, l = {HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE}, m = "getCallFlow", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl$getCallFlow$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$getCallFlow$1(ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, Continuation<? super ChatPanelActionsDelegateImpl$getCallFlow$1> continuation) {
        super(continuation);
        this.this$0 = chatPanelActionsDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object callFlow;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        callFlow = this.this$0.getCallFlow(null, this);
        return callFlow;
    }
}
