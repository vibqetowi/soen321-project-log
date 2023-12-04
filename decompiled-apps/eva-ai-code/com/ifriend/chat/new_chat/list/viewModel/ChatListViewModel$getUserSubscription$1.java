package com.ifriend.chat.new_chat.list.viewModel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatListViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel", f = "ChatListViewModel.kt", i = {}, l = {118}, m = "getUserSubscription", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatListViewModel$getUserSubscription$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatListViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListViewModel$getUserSubscription$1(ChatListViewModel chatListViewModel, Continuation<? super ChatListViewModel$getUserSubscription$1> continuation) {
        super(continuation);
        this.this$0 = chatListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object userSubscription;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        userSubscription = this.this$0.getUserSubscription(this);
        return userSubscription;
    }
}
