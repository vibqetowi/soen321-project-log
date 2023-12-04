package com.ifriend.domain.logic.chat.configuration;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsConfigurationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor", f = "ChatsConfigurationInteractor.kt", i = {}, l = {17}, m = "getChatConfigurationFlow", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatsConfigurationInteractor$getChatConfigurationFlow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatsConfigurationInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsConfigurationInteractor$getChatConfigurationFlow$1(ChatsConfigurationInteractor chatsConfigurationInteractor, Continuation<? super ChatsConfigurationInteractor$getChatConfigurationFlow$1> continuation) {
        super(continuation);
        this.this$0 = chatsConfigurationInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getChatConfigurationFlow(null, this);
    }
}
