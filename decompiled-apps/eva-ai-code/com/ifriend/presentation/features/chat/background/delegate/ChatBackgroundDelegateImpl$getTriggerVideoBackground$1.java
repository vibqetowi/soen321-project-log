package com.ifriend.presentation.features.chat.background.delegate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBackgroundDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegateImpl", f = "ChatBackgroundDelegate.kt", i = {0}, l = {186}, m = "getTriggerVideoBackground", n = {"trigger"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatBackgroundDelegateImpl$getTriggerVideoBackground$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatBackgroundDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundDelegateImpl$getTriggerVideoBackground$1(ChatBackgroundDelegateImpl chatBackgroundDelegateImpl, Continuation<? super ChatBackgroundDelegateImpl$getTriggerVideoBackground$1> continuation) {
        super(continuation);
        this.this$0 = chatBackgroundDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object triggerVideoBackground;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        triggerVideoBackground = this.this$0.getTriggerVideoBackground(null, null, this);
        return triggerVideoBackground;
    }
}
