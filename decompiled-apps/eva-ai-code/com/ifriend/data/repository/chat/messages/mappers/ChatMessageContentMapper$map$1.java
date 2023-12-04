package com.ifriend.data.repository.chat.messages.mappers;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessageContentMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.chat.messages.mappers.ChatMessageContentMapper", f = "ChatMessageContentMapper.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {35, 36, 37, 38}, m = "map", n = {"this", "from", "this", "from", "this", "from", "this", "from"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatMessageContentMapper$map$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessageContentMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageContentMapper$map$1(ChatMessageContentMapper chatMessageContentMapper, Continuation<? super ChatMessageContentMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = chatMessageContentMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map(null, false, this);
    }
}
