package com.ifriend.data.repository.chat.messages.mappers.images;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatImageUrlMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.chat.messages.mappers.images.ChatImageUrlMapper", f = "ChatImageUrlMapper.kt", i = {0, 0, 0, 0, 0}, l = {21}, m = "map", n = {"this", "reference", "contentReference", "type", "referenceContent"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes6.dex */
public final class ChatImageUrlMapper$map$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatImageUrlMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatImageUrlMapper$map$1(ChatImageUrlMapper chatImageUrlMapper, Continuation<? super ChatImageUrlMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = chatImageUrlMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map(null, this);
    }
}
