package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$handleBuyProductSuccessful$2", f = "ChatBuySubscriptionViewModel.kt", i = {}, l = {146, 148, 151, 153, 155}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel$handleBuyProductSuccessful$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatBuySubscriptionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionViewModel$handleBuyProductSuccessful$2(ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, Continuation<? super ChatBuySubscriptionViewModel$handleBuyProductSuccessful$2> continuation) {
        super(2, continuation);
        this.this$0 = chatBuySubscriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBuySubscriptionViewModel$handleBuyProductSuccessful$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatBuySubscriptionViewModel$handleBuyProductSuccessful$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChatsInfoInteractor chatsInfoInteractor;
        ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase;
        Object mo6875invokegIAlus;
        Object buyProductSuccessful;
        ChatsInfoInteractor chatsInfoInteractor2;
        Object buyProductSuccessful2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsInfoInteractor = this.this$0.chatsInfoInteractor;
            this.label = 1;
            obj = chatsInfoInteractor.getChatInfo(this.this$0.params.getChatId(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    mo6875invokegIAlus = ((Result) obj).m7280unboximpl();
                    ResultKt.throwOnFailure(mo6875invokegIAlus);
                    chatsInfoInteractor2 = this.this$0.chatsInfoInteractor;
                    this.label = 4;
                    obj = chatsInfoInteractor2.getChatInfo(this.this$0.params.getChatId(), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (obj == null) {
                    }
                } else if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    if (obj == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    if (ommonKt.orFalse(Boxing.boxBoolean(((ChatInfo) obj).isSubscriptionActivated()))) {
                        this.label = 5;
                        buyProductSuccessful2 = this.this$0.buyProductSuccessful(this);
                        if (buyProductSuccessful2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                } else if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (ommonKt.orFalse(Boxing.boxBoolean(((ChatInfo) obj).isSubscriptionActivated()))) {
            this.label = 2;
            buyProductSuccessful = this.this$0.buyProductSuccessful(this);
            if (buyProductSuccessful == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        chatsRefreshConfigurationUseCase = this.this$0.refreshConfigurationUseCase;
        this.label = 3;
        mo6875invokegIAlus = chatsRefreshConfigurationUseCase.mo6875invokegIAlus(Unit.INSTANCE, (Continuation<? super Result<? extends Unit>>) this);
        if (mo6875invokegIAlus == coroutine_suspended) {
            return coroutine_suspended;
        }
        ResultKt.throwOnFailure(mo6875invokegIAlus);
        chatsInfoInteractor2 = this.this$0.chatsInfoInteractor;
        this.label = 4;
        obj = chatsInfoInteractor2.getChatInfo(this.this$0.params.getChatId(), this);
        if (obj == coroutine_suspended) {
        }
        if (obj == null) {
        }
    }
}
