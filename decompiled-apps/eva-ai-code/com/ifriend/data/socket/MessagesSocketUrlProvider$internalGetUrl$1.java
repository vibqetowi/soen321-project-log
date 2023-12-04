package com.ifriend.data.socket;

import com.ifriend.analytics.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessagesSocketUrlProvider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.socket.MessagesSocketUrlProvider", f = "MessagesSocketUrlProvider.kt", i = {0, 0, 1, 1, 1}, l = {20, 25}, m = "internalGetUrl", n = {"this", AnalyticsConstants.TIMESTAMP, "this", AnalyticsConstants.TIMESTAMP, "userId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class MessagesSocketUrlProvider$internalGetUrl$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessagesSocketUrlProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesSocketUrlProvider$internalGetUrl$1(MessagesSocketUrlProvider messagesSocketUrlProvider, Continuation<? super MessagesSocketUrlProvider$internalGetUrl$1> continuation) {
        super(continuation);
        this.this$0 = messagesSocketUrlProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object internalGetUrl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        internalGetUrl = this.this$0.internalGetUrl(null, this);
        return internalGetUrl;
    }
}
