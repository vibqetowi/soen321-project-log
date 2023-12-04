package com.ifriend.data.repository.chat.buy;

import com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BuyChatMessagesRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.buy.BuyChatMessagesRepositoryImpl$buyMessage$2", f = "BuyChatMessagesRepositoryImpl.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class BuyChatMessagesRepositoryImpl$buyMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $messageId;
    final /* synthetic */ String $recipientId;
    final /* synthetic */ String $senderId;
    int label;
    final /* synthetic */ BuyChatMessagesRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyChatMessagesRepositoryImpl$buyMessage$2(BuyChatMessagesRepositoryImpl buyChatMessagesRepositoryImpl, String str, String str2, String str3, Continuation<? super BuyChatMessagesRepositoryImpl$buyMessage$2> continuation) {
        super(2, continuation);
        this.this$0 = buyChatMessagesRepositoryImpl;
        this.$messageId = str;
        this.$senderId = str2;
        this.$recipientId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyChatMessagesRepositoryImpl$buyMessage$2(this.this$0, this.$messageId, this.$senderId, this.$recipientId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((BuyChatMessagesRepositoryImpl$buyMessage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatMessagesRemoteDataSource chatMessagesRemoteDataSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatMessagesRemoteDataSource = this.this$0.chatMessagesRemoteDataSource;
            this.label = 1;
            obj = chatMessagesRemoteDataSource.buyMessage(this.$messageId, this.$senderId, this.$recipientId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
