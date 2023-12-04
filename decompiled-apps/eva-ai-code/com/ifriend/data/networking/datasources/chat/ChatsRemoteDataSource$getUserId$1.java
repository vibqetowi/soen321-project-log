package com.ifriend.data.networking.datasources.chat;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsRemoteDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource", f = "ChatsRemoteDataSource.kt", i = {}, l = {17}, m = "getUserId", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatsRemoteDataSource$getUserId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatsRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsRemoteDataSource$getUserId$1(ChatsRemoteDataSource chatsRemoteDataSource, Continuation<? super ChatsRemoteDataSource$getUserId$1> continuation) {
        super(continuation);
        this.this$0 = chatsRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object userId;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        userId = this.this$0.getUserId(this);
        return userId;
    }
}
