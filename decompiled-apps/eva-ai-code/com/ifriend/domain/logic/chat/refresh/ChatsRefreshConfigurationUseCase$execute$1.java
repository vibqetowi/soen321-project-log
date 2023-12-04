package com.ifriend.domain.logic.chat.refresh;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsRefreshConfigurationUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase", f = "ChatsRefreshConfigurationUseCase.kt", i = {0, 1}, l = {20, 22, 25}, m = "execute", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
public final class ChatsRefreshConfigurationUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatsRefreshConfigurationUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsRefreshConfigurationUseCase$execute$1(ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase, Continuation<? super ChatsRefreshConfigurationUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = chatsRefreshConfigurationUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute((Unit) null, (Continuation<? super Unit>) this);
    }
}
