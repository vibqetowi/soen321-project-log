package com.ifriend.domain.logic.chat.messages;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessageAccessInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor", f = "ChatMessageAccessInteractor.kt", i = {0, 1, 1, 2, 3, 4, 4, 5}, l = {203, 208, 214, 223, 228, 234}, m = "requestPhotoAccess", n = {"messageContent", "this", "messageContent", "messageContent", "messageContent", "this", "messageContent", "messageContent"}, s = {"L$0", "L$0", "L$1", "L$0", "L$0", "L$0", "L$1", "L$0"})
/* loaded from: classes6.dex */
public final class ChatMessageAccessInteractor$requestPhotoAccess$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessageAccessInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageAccessInteractor$requestPhotoAccess$1(ChatMessageAccessInteractor chatMessageAccessInteractor, Continuation<? super ChatMessageAccessInteractor$requestPhotoAccess$1> continuation) {
        super(continuation);
        this.this$0 = chatMessageAccessInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object requestPhotoAccess;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        requestPhotoAccess = this.this$0.requestPhotoAccess(null, null, false, false, this);
        return requestPhotoAccess;
    }
}
