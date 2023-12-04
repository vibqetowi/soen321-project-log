package com.ifriend.data.repository.chat.subscription;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.mappers.subscription.ChatSubscriptionBenefitsMapper;
import com.ifriend.data.networking.api.chat.models.response.benefits.ChatSubscriptionBenefitRemote;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatSubscriptionRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.subscription.ChatSubscriptionRepositoryImpl$refreshSubscriptionBenefits$2", f = "ChatSubscriptionRepositoryImpl.kt", i = {}, l = {40, 41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatSubscriptionRepositoryImpl$refreshSubscriptionBenefits$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatSubscriptionRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionRepositoryImpl$refreshSubscriptionBenefits$2(ChatSubscriptionRepositoryImpl chatSubscriptionRepositoryImpl, String str, Continuation<? super ChatSubscriptionRepositoryImpl$refreshSubscriptionBenefits$2> continuation) {
        super(2, continuation);
        this.this$0 = chatSubscriptionRepositoryImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatSubscriptionRepositoryImpl$refreshSubscriptionBenefits$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatSubscriptionRepositoryImpl$refreshSubscriptionBenefits$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatSubscriptionBenefitsMapper chatSubscriptionBenefitsMapper;
        InMemoryCachedSource cachedSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getBenefitsFromRemote(this.$chatId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        Iterable<ChatSubscriptionBenefitRemote> iterable = (Iterable) obj;
        chatSubscriptionBenefitsMapper = this.this$0.chatSubscriptionBenefitsMapper;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ChatSubscriptionBenefitRemote chatSubscriptionBenefitRemote : iterable) {
            arrayList.add(chatSubscriptionBenefitsMapper.map(chatSubscriptionBenefitRemote));
        }
        cachedSource = this.this$0.getCachedSource();
        String str = this.$chatId;
        this.label = 2;
        if (cachedSource.replace(str, arrayList, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
