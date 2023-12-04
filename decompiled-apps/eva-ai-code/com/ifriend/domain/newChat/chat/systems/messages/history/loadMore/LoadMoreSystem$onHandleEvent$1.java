package com.ifriend.domain.newChat.chat.systems.messages.history.loadMore;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadMoreSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.messages.history.loadMore.LoadMoreSystem", f = "LoadMoreSystem.kt", i = {}, l = {35, 37}, m = "onHandleEvent", n = {}, s = {})
/* loaded from: classes6.dex */
public final class LoadMoreSystem$onHandleEvent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoadMoreSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMoreSystem$onHandleEvent$1(LoadMoreSystem loadMoreSystem, Continuation<? super LoadMoreSystem$onHandleEvent$1> continuation) {
        super(continuation);
        this.this$0 = loadMoreSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onHandleEvent(null, this);
    }
}
