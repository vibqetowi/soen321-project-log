package com.ifriend.data.repository.chatgifts;

import com.ifriend.data.networking.api.chatgifts.models.response.ChatGiftsRemote;
import com.ifriend.data.networking.datasources.gifts.ChatGiftsRemoteDataSource;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatGiftsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/ifriend/data/networking/api/chatgifts/models/response/ChatGiftsRemote;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chatgifts.ChatGiftsRepositoryImpl$getGiftsFromRemote$2", f = "ChatGiftsRepositoryImpl.kt", i = {}, l = {SSL.SSL_PROTOCOL_TLS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatGiftsRepositoryImpl$getGiftsFromRemote$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ChatGiftsRemote>>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ ChatGiftsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsRepositoryImpl$getGiftsFromRemote$2(ChatGiftsRepositoryImpl chatGiftsRepositoryImpl, String str, String str2, Continuation<? super ChatGiftsRepositoryImpl$getGiftsFromRemote$2> continuation) {
        super(2, continuation);
        this.this$0 = chatGiftsRepositoryImpl;
        this.$userId = str;
        this.$chatId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatGiftsRepositoryImpl$getGiftsFromRemote$2(this.this$0, this.$userId, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ChatGiftsRemote>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ChatGiftsRemote>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ChatGiftsRemote>> continuation) {
        return ((ChatGiftsRepositoryImpl$getGiftsFromRemote$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatGiftsRemoteDataSource chatGiftsRemoteDataSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatGiftsRemoteDataSource = this.this$0.chatGiftsRemoteDataSource;
            this.label = 1;
            obj = chatGiftsRemoteDataSource.getGifts(this.$userId, this.$chatId, this);
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
