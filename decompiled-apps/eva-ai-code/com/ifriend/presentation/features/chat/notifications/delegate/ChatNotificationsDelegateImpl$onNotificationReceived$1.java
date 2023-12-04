package com.ifriend.presentation.features.chat.notifications.delegate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatNotificationsDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl", f = "ChatNotificationsDelegate.kt", i = {0, 0, 0, 0, 0, 0}, l = {171}, m = "onNotificationReceived", n = {"this", "$context_receiver_0", "new", "$this$withLock_u24default$iv", "notificationsLimit", "hideDelay"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0"})
/* loaded from: classes6.dex */
public final class ChatNotificationsDelegateImpl$onNotificationReceived$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatNotificationsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNotificationsDelegateImpl$onNotificationReceived$1(ChatNotificationsDelegateImpl chatNotificationsDelegateImpl, Continuation<? super ChatNotificationsDelegateImpl$onNotificationReceived$1> continuation) {
        super(continuation);
        this.this$0 = chatNotificationsDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object onNotificationReceived;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        onNotificationReceived = this.this$0.onNotificationReceived(null, null, 0, 0L, this);
        return onNotificationReceived;
    }
}
