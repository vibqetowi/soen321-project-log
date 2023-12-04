package com.ifriend.domain.logic.chat.avatart;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneratedChatAvatarInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor", f = "GeneratedChatAvatarInteractor.kt", i = {0, 0, 1, 1}, l = {34, 35}, m = "getGeneratedChatAvatarFlow", n = {"this", "chatId", "this", "chatId"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GeneratedChatAvatarInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$1(GeneratedChatAvatarInteractor generatedChatAvatarInteractor, Continuation<? super GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$1> continuation) {
        super(continuation);
        this.this$0 = generatedChatAvatarInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getGeneratedChatAvatarFlow(null, this);
    }
}
