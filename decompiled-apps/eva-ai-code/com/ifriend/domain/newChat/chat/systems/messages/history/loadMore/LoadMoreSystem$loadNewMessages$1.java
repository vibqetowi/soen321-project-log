package com.ifriend.domain.newChat.chat.systems.messages.history.loadMore;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadMoreSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.messages.history.loadMore.LoadMoreSystem", f = "LoadMoreSystem.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF}, m = "loadNewMessages", n = {}, s = {})
/* loaded from: classes6.dex */
public final class LoadMoreSystem$loadNewMessages$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoadMoreSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMoreSystem$loadNewMessages$1(LoadMoreSystem loadMoreSystem, Continuation<? super LoadMoreSystem$loadNewMessages$1> continuation) {
        super(continuation);
        this.this$0 = loadMoreSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadNewMessages;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadNewMessages = this.this$0.loadNewMessages(null, this);
        return loadNewMessages;
    }
}
