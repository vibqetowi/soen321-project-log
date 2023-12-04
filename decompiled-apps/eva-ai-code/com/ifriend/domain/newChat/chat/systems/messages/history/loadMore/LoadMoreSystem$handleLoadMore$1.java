package com.ifriend.domain.newChat.chat.systems.messages.history.loadMore;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadMoreSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.messages.history.loadMore.LoadMoreSystem", f = "LoadMoreSystem.kt", i = {0}, l = {43}, m = "handleLoadMore", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class LoadMoreSystem$handleLoadMore$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoadMoreSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMoreSystem$handleLoadMore$1(LoadMoreSystem loadMoreSystem, Continuation<? super LoadMoreSystem$handleLoadMore$1> continuation) {
        super(continuation);
        this.this$0 = loadMoreSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleLoadMore;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleLoadMore = this.this$0.handleLoadMore(this);
        return handleLoadMore;
    }
}
