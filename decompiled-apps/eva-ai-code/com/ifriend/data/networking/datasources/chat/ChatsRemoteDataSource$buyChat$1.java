package com.ifriend.data.networking.datasources.chat;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsRemoteDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource", f = "ChatsRemoteDataSource.kt", i = {0, 0}, l = {30, 29}, m = "buyChat", n = {"chatId", "paymentType"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatsRemoteDataSource$buyChat$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatsRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsRemoteDataSource$buyChat$1(ChatsRemoteDataSource chatsRemoteDataSource, Continuation<? super ChatsRemoteDataSource$buyChat$1> continuation) {
        super(continuation);
        this.this$0 = chatsRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.buyChat(null, null, this);
    }
}
