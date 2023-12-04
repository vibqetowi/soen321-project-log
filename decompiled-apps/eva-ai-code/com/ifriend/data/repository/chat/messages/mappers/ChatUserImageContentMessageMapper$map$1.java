package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatUserImageContentMessageMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.chat.messages.mappers.ChatUserImageContentMessageMapper", f = "ChatUserImageContentMessageMapper.kt", i = {}, l = {16}, m = "map", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatUserImageContentMessageMapper$map$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatUserImageContentMessageMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatUserImageContentMessageMapper$map$1(ChatUserImageContentMessageMapper chatUserImageContentMessageMapper, Continuation<? super ChatUserImageContentMessageMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = chatUserImageContentMessageMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map((ChatMessageRemote) null, (Continuation<? super MessageContent.Image>) this);
    }
}
