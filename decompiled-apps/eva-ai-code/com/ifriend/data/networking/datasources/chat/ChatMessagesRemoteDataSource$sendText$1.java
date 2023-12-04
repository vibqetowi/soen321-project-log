package com.ifriend.data.networking.datasources.chat;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.domain.config.ConfigKeys;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessagesRemoteDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource", f = "ChatMessagesRemoteDataSource.kt", i = {0, 0, 0, 0}, l = {73, 74}, m = "sendText", n = {"this", ConfigKeys.CLIENT_ID, ViewHierarchyConstants.TAG_KEY, FirebaseAnalytics.Param.CONTENT}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class ChatMessagesRemoteDataSource$sendText$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessagesRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagesRemoteDataSource$sendText$1(ChatMessagesRemoteDataSource chatMessagesRemoteDataSource, Continuation<? super ChatMessagesRemoteDataSource$sendText$1> continuation) {
        super(continuation);
        this.this$0 = chatMessagesRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendText(null, null, null, this);
    }
}
