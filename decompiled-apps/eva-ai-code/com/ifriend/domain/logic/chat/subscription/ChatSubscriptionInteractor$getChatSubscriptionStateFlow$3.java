package com.ifriend.domain.logic.chat.subscription;

import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatPaymentStatus;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatSubscriptionInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chatInfo", "", "countOfUserMessages", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor$getChatSubscriptionStateFlow$3", f = "ChatSubscriptionInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatSubscriptionInteractor$getChatSubscriptionStateFlow$3 extends SuspendLambda implements Function3<ChatInfo, Integer, Continuation<? super ChatSubscriptionState>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatSubscriptionInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionInteractor$getChatSubscriptionStateFlow$3(ChatSubscriptionInteractor chatSubscriptionInteractor, Continuation<? super ChatSubscriptionInteractor$getChatSubscriptionStateFlow$3> continuation) {
        super(3, continuation);
        this.this$0 = chatSubscriptionInteractor;
    }

    public final Object invoke(ChatInfo chatInfo, int i, Continuation<? super ChatSubscriptionState> continuation) {
        ChatSubscriptionInteractor$getChatSubscriptionStateFlow$3 chatSubscriptionInteractor$getChatSubscriptionStateFlow$3 = new ChatSubscriptionInteractor$getChatSubscriptionStateFlow$3(this.this$0, continuation);
        chatSubscriptionInteractor$getChatSubscriptionStateFlow$3.L$0 = chatInfo;
        chatSubscriptionInteractor$getChatSubscriptionStateFlow$3.I$0 = i;
        return chatSubscriptionInteractor$getChatSubscriptionStateFlow$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(ChatInfo chatInfo, Integer num, Continuation<? super ChatSubscriptionState> continuation) {
        return invoke(chatInfo, num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatSubscriptionState chatSubscriptionState;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ChatInfo chatInfo = (ChatInfo) this.L$0;
            int i = this.I$0;
            chatSubscriptionState = this.this$0.getChatSubscriptionState(chatInfo);
            if (chatSubscriptionState instanceof ChatSubscriptionState.TrialPeriod) {
                ChatPaymentStatus paymentStatus = chatInfo.getPaymentStatus();
                ChatPaymentStatus.TrialPeriod trialPeriod = paymentStatus instanceof ChatPaymentStatus.TrialPeriod ? (ChatPaymentStatus.TrialPeriod) paymentStatus : null;
                return i > ommonKt.orZero(trialPeriod != null ? Boxing.boxInt(ChatoptionsKt.getMaxMessageCount(trialPeriod)) : null) ? ChatSubscriptionState.SubscriptionUnactivated.INSTANCE : chatSubscriptionState;
            }
            return chatSubscriptionState;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
