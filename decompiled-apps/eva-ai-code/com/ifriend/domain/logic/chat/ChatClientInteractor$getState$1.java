package com.ifriend.domain.logic.chat;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatClientInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.ChatClientInteractor", f = "ChatClientInteractor.kt", i = {}, l = {22}, m = "getState", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatClientInteractor$getState$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatClientInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatClientInteractor$getState$1(ChatClientInteractor chatClientInteractor, Continuation<? super ChatClientInteractor$getState$1> continuation) {
        super(continuation);
        this.this$0 = chatClientInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getState(null, this);
    }
}
