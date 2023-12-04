package com.ifriend.data.repository.chat.subscription;

import com.ifriend.data.networking.api.chat.models.response.benefits.ChatSubscriptionBenefitRemote;
import com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource;
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
/* compiled from: ChatSubscriptionRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/ifriend/data/networking/api/chat/models/response/benefits/ChatSubscriptionBenefitRemote;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.subscription.ChatSubscriptionRepositoryImpl$getBenefitsFromRemote$2", f = "ChatSubscriptionRepositoryImpl.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatSubscriptionRepositoryImpl$getBenefitsFromRemote$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ChatSubscriptionBenefitRemote>>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatSubscriptionRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionRepositoryImpl$getBenefitsFromRemote$2(ChatSubscriptionRepositoryImpl chatSubscriptionRepositoryImpl, String str, Continuation<? super ChatSubscriptionRepositoryImpl$getBenefitsFromRemote$2> continuation) {
        super(2, continuation);
        this.this$0 = chatSubscriptionRepositoryImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatSubscriptionRepositoryImpl$getBenefitsFromRemote$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ChatSubscriptionBenefitRemote>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ChatSubscriptionBenefitRemote>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ChatSubscriptionBenefitRemote>> continuation) {
        return ((ChatSubscriptionRepositoryImpl$getBenefitsFromRemote$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatsRemoteDataSource chatsRemoteDataSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsRemoteDataSource = this.this$0.chatsRemoteDataSource;
            this.label = 1;
            obj = chatsRemoteDataSource.getSubscriptionBenefits(this.$chatId, this);
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
