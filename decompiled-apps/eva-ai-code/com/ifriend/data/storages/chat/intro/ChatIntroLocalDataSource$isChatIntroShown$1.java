package com.ifriend.data.storages.chat.intro;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatIntroLocalDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource", f = "ChatIntroLocalDataSource.kt", i = {}, l = {27}, m = "isChatIntroShown", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatIntroLocalDataSource$isChatIntroShown$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatIntroLocalDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroLocalDataSource$isChatIntroShown$1(ChatIntroLocalDataSource chatIntroLocalDataSource, Continuation<? super ChatIntroLocalDataSource$isChatIntroShown$1> continuation) {
        super(continuation);
        this.this$0 = chatIntroLocalDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isChatIntroShown(null, this);
    }
}
