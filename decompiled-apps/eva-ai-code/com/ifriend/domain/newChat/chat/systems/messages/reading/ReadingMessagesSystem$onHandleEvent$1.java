package com.ifriend.domain.newChat.chat.systems.messages.reading;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReadingMessagesSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.messages.reading.ReadingMessagesSystem", f = "ReadingMessagesSystem.kt", i = {0, 0, 0, 1, 1}, l = {88, 44, 50}, m = "onHandleEvent", n = {"this", NotificationCompat.CATEGORY_EVENT, "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ReadingMessagesSystem$onHandleEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReadingMessagesSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadingMessagesSystem$onHandleEvent$1(ReadingMessagesSystem readingMessagesSystem, Continuation<? super ReadingMessagesSystem$onHandleEvent$1> continuation) {
        super(continuation);
        this.this$0 = readingMessagesSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onHandleEvent(null, this);
    }
}
