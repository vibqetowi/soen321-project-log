package com.ifriend.data.networking.datasources.chat;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessagesRemoteDataSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource", f = "ChatMessagesRemoteDataSource.kt", i = {0, 0}, l = {93, ModuleDescriptor.MODULE_VERSION}, m = "sendFile", n = {"chatId", "fileBodyPart"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatMessagesRemoteDataSource$sendFile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessagesRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagesRemoteDataSource$sendFile$1(ChatMessagesRemoteDataSource chatMessagesRemoteDataSource, Continuation<? super ChatMessagesRemoteDataSource$sendFile$1> continuation) {
        super(continuation);
        this.this$0 = chatMessagesRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendFile(null, null, null, this);
    }
}
