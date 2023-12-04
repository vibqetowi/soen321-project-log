package com.ifriend.presentation.features.chat.photo.delegate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPhotoDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.photo.delegate.ChatPhotoDelegateImpl", f = "ChatPhotoDelegate.kt", i = {}, l = {96}, m = "getChatMessage", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPhotoDelegateImpl$getChatMessage$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatPhotoDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPhotoDelegateImpl$getChatMessage$1(ChatPhotoDelegateImpl chatPhotoDelegateImpl, Continuation<? super ChatPhotoDelegateImpl$getChatMessage$1> continuation) {
        super(continuation);
        this.this$0 = chatPhotoDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object chatMessage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        chatMessage = this.this$0.getChatMessage(null, null, this);
        return chatMessage;
    }
}
