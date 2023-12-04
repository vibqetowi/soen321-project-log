package com.ifriend.data.networking.datasources.chat;

import com.ifriend.data.networking.api.chat.ChatsApi;
import com.ifriend.data.networking.api.chat.models.response.benefits.ChatRootSubscriptionBenefitRemote;
import com.ifriend.data.networking.api.chat.models.response.benefits.ChatSubscriptionBenefitRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsRemoteDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/data/networking/api/chat/models/response/benefits/ChatSubscriptionBenefitRemote;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource$getSubscriptionBenefits$2", f = "ChatsRemoteDataSource.kt", i = {}, l = {38, 37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatsRemoteDataSource$getSubscriptionBenefits$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends ChatSubscriptionBenefitRemote>>, Object> {
    final /* synthetic */ String $chatId;
    Object L$0;
    int label;
    final /* synthetic */ ChatsRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsRemoteDataSource$getSubscriptionBenefits$2(ChatsRemoteDataSource chatsRemoteDataSource, String str, Continuation<? super ChatsRemoteDataSource$getSubscriptionBenefits$2> continuation) {
        super(1, continuation);
        this.this$0 = chatsRemoteDataSource;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChatsRemoteDataSource$getSubscriptionBenefits$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends ChatSubscriptionBenefitRemote>> continuation) {
        return invoke2((Continuation<? super List<ChatSubscriptionBenefitRemote>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<ChatSubscriptionBenefitRemote>> continuation) {
        return ((ChatsRemoteDataSource$getSubscriptionBenefits$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatsApi chatsApi;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsApi = this.this$0.chatsApi;
            this.L$0 = chatsApi;
            this.label = 1;
            obj = this.this$0.getUserId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return ((ChatRootSubscriptionBenefitRemote) obj).getBenefits();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            chatsApi = (ChatsApi) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        obj = chatsApi.getChatSubscriptionBenefits((String) obj, this.$chatId, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return ((ChatRootSubscriptionBenefitRemote) obj).getBenefits();
    }
}
