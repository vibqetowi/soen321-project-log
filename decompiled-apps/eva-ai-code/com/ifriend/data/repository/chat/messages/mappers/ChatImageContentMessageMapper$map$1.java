package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatImageContentMessageMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.chat.messages.mappers.ChatImageContentMessageMapper", f = "ChatImageContentMessageMapper.kt", i = {0, 0}, l = {18}, m = "map", n = {"this", "from"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatImageContentMessageMapper$map$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatImageContentMessageMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatImageContentMessageMapper$map$1(ChatImageContentMessageMapper chatImageContentMessageMapper, Continuation<? super ChatImageContentMessageMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = chatImageContentMessageMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map((ChatMessageRemote) null, (Continuation<? super MessageContent.Image>) this);
    }
}
