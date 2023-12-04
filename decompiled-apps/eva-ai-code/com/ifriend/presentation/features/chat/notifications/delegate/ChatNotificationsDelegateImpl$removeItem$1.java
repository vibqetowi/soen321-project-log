package com.ifriend.presentation.features.chat.notifications.delegate;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatNotificationsDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.chat.notifications.delegate.ChatNotificationsDelegateImpl", f = "ChatNotificationsDelegate.kt", i = {0, 0, 0}, l = {171}, m = "removeItem", n = {"this", "id", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class ChatNotificationsDelegateImpl$removeItem$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatNotificationsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNotificationsDelegateImpl$removeItem$1(ChatNotificationsDelegateImpl chatNotificationsDelegateImpl, Continuation<? super ChatNotificationsDelegateImpl$removeItem$1> continuation) {
        super(continuation);
        this.this$0 = chatNotificationsDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object removeItem;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        removeItem = this.this$0.removeItem(null, this);
        return removeItem;
    }
}
