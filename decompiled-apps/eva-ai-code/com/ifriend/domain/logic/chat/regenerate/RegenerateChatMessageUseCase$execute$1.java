package com.ifriend.domain.logic.chat.regenerate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegenerateChatMessageUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.regenerate.RegenerateChatMessageUseCase", f = "RegenerateChatMessageUseCase.kt", i = {0, 0, 0, 1, 1, 1}, l = {28, 37, 43}, m = "execute", n = {"this", "chatId", "messageId", "this", "chatId", "messageId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class RegenerateChatMessageUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RegenerateChatMessageUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegenerateChatMessageUseCase$execute$1(RegenerateChatMessageUseCase regenerateChatMessageUseCase, Continuation<? super RegenerateChatMessageUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = regenerateChatMessageUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, null, this);
    }
}
