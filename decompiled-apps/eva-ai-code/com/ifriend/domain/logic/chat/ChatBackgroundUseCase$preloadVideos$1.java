package com.ifriend.domain.logic.chat;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBackgroundUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.ChatBackgroundUseCase", f = "ChatBackgroundUseCase.kt", i = {0, 0}, l = {21, 23}, m = "preloadVideos", n = {"this", "chatId"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatBackgroundUseCase$preloadVideos$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatBackgroundUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundUseCase$preloadVideos$1(ChatBackgroundUseCase chatBackgroundUseCase, Continuation<? super ChatBackgroundUseCase$preloadVideos$1> continuation) {
        super(continuation);
        this.this$0 = chatBackgroundUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.preloadVideos(null, this);
    }
}