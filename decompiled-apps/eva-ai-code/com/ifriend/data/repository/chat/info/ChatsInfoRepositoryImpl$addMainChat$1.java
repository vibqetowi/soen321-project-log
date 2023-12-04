package com.ifriend.data.repository.chat.info;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsInfoRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl", f = "ChatsInfoRepositoryImpl.kt", i = {0, 0, 0}, l = {83, ModuleDescriptor.MODULE_VERSION}, m = "addMainChat", n = {"this", "chatId", "mainBot"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
public final class ChatsInfoRepositoryImpl$addMainChat$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatsInfoRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsInfoRepositoryImpl$addMainChat$1(ChatsInfoRepositoryImpl chatsInfoRepositoryImpl, Continuation<? super ChatsInfoRepositoryImpl$addMainChat$1> continuation) {
        super(continuation);
        this.this$0 = chatsInfoRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.addMainChat(null, this);
    }
}
