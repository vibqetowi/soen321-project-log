package com.ifriend.chat.data.chat.sending;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessagesRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.data.chat.sending.ChatMessagesRepositoryImpl", f = "ChatMessagesRepositoryImpl.kt", i = {0, 0, 0, 0, 1, 1}, l = {197, 200}, m = "sendTextMessage", n = {"this", FirebaseAnalytics.Param.CONTENT, "chatId", ViewHierarchyConstants.TAG_KEY, "chatId", ViewHierarchyConstants.TAG_KEY}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatMessagesRepositoryImpl$sendTextMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessagesRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagesRepositoryImpl$sendTextMessage$1(ChatMessagesRepositoryImpl chatMessagesRepositoryImpl, Continuation<? super ChatMessagesRepositoryImpl$sendTextMessage$1> continuation) {
        super(continuation);
        this.this$0 = chatMessagesRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendTextMessage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendTextMessage = this.this$0.sendTextMessage(null, null, null, this);
        return sendTextMessage;
    }
}
