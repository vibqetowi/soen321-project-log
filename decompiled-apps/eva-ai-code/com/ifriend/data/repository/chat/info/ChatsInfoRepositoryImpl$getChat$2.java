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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsInfoRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$getChat$2", f = "ChatsInfoRepositoryImpl.kt", i = {}, l = {44, 44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatsInfoRepositoryImpl$getChat$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChatInfo>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatsInfoRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsInfoRepositoryImpl$getChat$2(ChatsInfoRepositoryImpl chatsInfoRepositoryImpl, String str, Continuation<? super ChatsInfoRepositoryImpl$getChat$2> continuation) {
        super(2, continuation);
        this.this$0 = chatsInfoRepositoryImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatsInfoRepositoryImpl$getChat$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChatInfo> continuation) {
        return ((ChatsInfoRepositoryImpl$getChat$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InMemoryCachedSource cachedSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cachedSource = this.this$0.getCachedSource();
            this.label = 1;
            obj = cachedSource.get(this.$chatId, InMemoryCachedSource.Strategy.CACHE_ONLY, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        obj = FlowKt.firstOrNull((Flow) obj, this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
