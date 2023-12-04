package com.ifriend.data.socket.mapper;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessageMapHelperImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.socket.mapper.ChatMessageMapHelperImpl", f = "ChatMessageMapHelperImpl.kt", i = {0, 0}, l = {35}, m = "buildChatPhotoContent", n = {"referenceContent", "apiUrl"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatMessageMapHelperImpl$buildChatPhotoContent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessageMapHelperImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageMapHelperImpl$buildChatPhotoContent$1(ChatMessageMapHelperImpl chatMessageMapHelperImpl, Continuation<? super ChatMessageMapHelperImpl$buildChatPhotoContent$1> continuation) {
        super(continuation);
        this.this$0 = chatMessageMapHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.buildChatPhotoContent(null, null, this);
    }
}
