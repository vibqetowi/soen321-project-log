package com.ifriend.data.repository.chat.info;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatsInfoRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$updateChatName$2", f = "ChatsInfoRepositoryImpl.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatsInfoRepositoryImpl$updateChatName$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $newName;
    int label;
    final /* synthetic */ ChatsInfoRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsInfoRepositoryImpl$updateChatName$2(ChatsInfoRepositoryImpl chatsInfoRepositoryImpl, String str, String str2, Continuation<? super ChatsInfoRepositoryImpl$updateChatName$2> continuation) {
        super(2, continuation);
        this.this$0 = chatsInfoRepositoryImpl;
        this.$chatId = str;
        this.$newName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatsInfoRepositoryImpl$updateChatName$2(this.this$0, this.$chatId, this.$newName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatsInfoRepositoryImpl$updateChatName$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InMemoryCachedSource cachedSource;
        InMemoryCachedSource cachedSource2;
        ChatInfo copy;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cachedSource = this.this$0.getCachedSource();
            ChatInfo chatInfo = (ChatInfo) cachedSource.getFromCache(this.$chatId);
            if (chatInfo != null) {
                cachedSource2 = this.this$0.getCachedSource();
                String str = this.$chatId;
                copy = chatInfo.copy((r20 & 1) != 0 ? chatInfo.uId : null, (r20 & 2) != 0 ? chatInfo.chatId : null, (r20 & 4) != 0 ? chatInfo.chatType : null, (r20 & 8) != 0 ? chatInfo.name : this.$newName, (r20 & 16) != 0 ? chatInfo.roundAvatarUrl : null, (r20 & 32) != 0 ? chatInfo.paymentStatus : null, (r20 & 64) != 0 ? chatInfo.paymentOptions : null, (r20 & 128) != 0 ? chatInfo.tags : null, (r20 & 256) != 0 ? chatInfo.promote : null);
                this.label = 1;
                if (cachedSource2.replace(str, copy, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
