package com.ifriend.domain.newChat.chat.systems.messages.reading;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReadingMessagesSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.messages.reading.ReadingMessagesSystem", f = "ReadingMessagesSystem.kt", i = {0, 0}, l = {69}, m = "readMessage", n = {"this", NotificationCompat.CATEGORY_EVENT}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ReadingMessagesSystem$readMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReadingMessagesSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadingMessagesSystem$readMessage$1(ReadingMessagesSystem readingMessagesSystem, Continuation<? super ReadingMessagesSystem$readMessage$1> continuation) {
        super(continuation);
        this.this$0 = readingMessagesSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readMessage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readMessage = this.this$0.readMessage(null, this);
        return readMessage;
    }
}
