package com.ifriend.domain.newChat.chat.systems.messages.history.initialLoading;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitialMessagesLoadingSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.messages.history.initialLoading.InitialMessagesLoadingSystem", f = "InitialMessagesLoadingSystem.kt", i = {}, l = {25}, m = "loadFirstMessages", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InitialMessagesLoadingSystem$loadFirstMessages$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitialMessagesLoadingSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialMessagesLoadingSystem$loadFirstMessages$1(InitialMessagesLoadingSystem initialMessagesLoadingSystem, Continuation<? super InitialMessagesLoadingSystem$loadFirstMessages$1> continuation) {
        super(continuation);
        this.this$0 = initialMessagesLoadingSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadFirstMessages;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadFirstMessages = this.this$0.loadFirstMessages(this);
        return loadFirstMessages;
    }
}
