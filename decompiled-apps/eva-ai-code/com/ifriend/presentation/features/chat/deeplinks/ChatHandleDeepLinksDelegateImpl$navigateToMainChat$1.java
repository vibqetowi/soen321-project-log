package com.ifriend.presentation.features.chat.deeplinks;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatHandleDeepLinksDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.deeplinks.ChatHandleDeepLinksDelegateImpl", f = "ChatHandleDeepLinksDelegate.kt", i = {0}, l = {84, 85}, m = "navigateToMainChat", n = {"$context_receiver_0"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatHandleDeepLinksDelegateImpl$navigateToMainChat$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatHandleDeepLinksDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHandleDeepLinksDelegateImpl$navigateToMainChat$1(ChatHandleDeepLinksDelegateImpl chatHandleDeepLinksDelegateImpl, Continuation<? super ChatHandleDeepLinksDelegateImpl$navigateToMainChat$1> continuation) {
        super(continuation);
        this.this$0 = chatHandleDeepLinksDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object navigateToMainChat;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        navigateToMainChat = this.this$0.navigateToMainChat(null, this);
        return navigateToMainChat;
    }
}
