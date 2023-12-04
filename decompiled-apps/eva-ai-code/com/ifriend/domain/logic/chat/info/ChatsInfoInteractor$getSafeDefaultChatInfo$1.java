package com.ifriend.domain.logic.chat.info;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsInfoInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.info.ChatsInfoInteractor", f = "ChatsInfoInteractor.kt", i = {0, 1}, l = {106, 111, 112}, m = "getSafeDefaultChatInfo", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
public final class ChatsInfoInteractor$getSafeDefaultChatInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatsInfoInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsInfoInteractor$getSafeDefaultChatInfo$1(ChatsInfoInteractor chatsInfoInteractor, Continuation<? super ChatsInfoInteractor$getSafeDefaultChatInfo$1> continuation) {
        super(continuation);
        this.this$0 = chatsInfoInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getSafeDefaultChatInfo(this);
    }
}
