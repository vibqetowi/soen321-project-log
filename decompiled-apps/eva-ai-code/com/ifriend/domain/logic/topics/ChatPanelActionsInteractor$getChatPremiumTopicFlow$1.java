package com.ifriend.domain.logic.topics;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPanelActionsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.logic.topics.ChatPanelActionsInteractor", f = "ChatPanelActionsInteractor.kt", i = {}, l = {69}, m = "getChatPremiumTopicFlow", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPanelActionsInteractor$getChatPremiumTopicFlow$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatPanelActionsInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsInteractor$getChatPremiumTopicFlow$1(ChatPanelActionsInteractor chatPanelActionsInteractor, Continuation<? super ChatPanelActionsInteractor$getChatPremiumTopicFlow$1> continuation) {
        super(continuation);
        this.this$0 = chatPanelActionsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getChatPremiumTopicFlow(null, this);
    }
}
