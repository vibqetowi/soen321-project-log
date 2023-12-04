package com.ifriend.presentation.features.chat.deeplinks;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.domain.data.deeplinks.DeepLink;
import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatHandleDeepLinksDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.deeplinks.ChatHandleDeepLinksDelegateImpl$handleDeepLinks$2", f = "ChatHandleDeepLinksDelegate.kt", i = {0}, l = {34, 41, 43}, m = "invokeSuspend", n = {"deepLink"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class ChatHandleDeepLinksDelegateImpl$handleDeepLinks$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatViewModel $$context_receiver_0;
    final /* synthetic */ String $chatId;
    Object L$0;
    int label;
    final /* synthetic */ ChatHandleDeepLinksDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHandleDeepLinksDelegateImpl$handleDeepLinks$2(ChatHandleDeepLinksDelegateImpl chatHandleDeepLinksDelegateImpl, String str, ChatViewModel chatViewModel, Continuation<? super ChatHandleDeepLinksDelegateImpl$handleDeepLinks$2> continuation) {
        super(2, continuation);
        this.this$0 = chatHandleDeepLinksDelegateImpl;
        this.$chatId = str;
        this.$$context_receiver_0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatHandleDeepLinksDelegateImpl$handleDeepLinks$2(this.this$0, this.$chatId, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatHandleDeepLinksDelegateImpl$handleDeepLinks$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DeepLinksRepository deepLinksRepository;
        DeepLink deepLink;
        ChatsInfoInteractor chatsInfoInteractor;
        AppEventsEmitter appEventsEmitter;
        AppEventsEmitter appEventsEmitter2;
        Object navigateToMainChat;
        Object handleMainChatDeepLinks;
        DeepLinksRepository deepLinksRepository2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            deepLinksRepository = this.this$0.deepLinksRepository;
            deepLink = deepLinksRepository.getDeepLink();
            if (deepLink == null) {
                return Unit.INSTANCE;
            }
            chatsInfoInteractor = this.this$0.chatsInfoInteractor;
            this.L$0 = deepLink;
            this.label = 1;
            obj = chatsInfoInteractor.getChatInfo(this.$chatId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            deepLinksRepository2 = this.this$0.deepLinksRepository;
            deepLinksRepository2.clear();
            return Unit.INSTANCE;
        } else {
            deepLink = (DeepLink) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ChatInfo chatInfo = (ChatInfo) obj;
        if (chatInfo == null) {
            return Unit.INSTANCE;
        }
        if (deepLink instanceof DeepLink.OpenChat ? true : deepLink instanceof DeepLink.OpenGenerateAvatar ? true : deepLink instanceof DeepLink.OpenDiary) {
            if (chatInfo.isMain()) {
                this.L$0 = null;
                this.label = 2;
                handleMainChatDeepLinks = this.this$0.handleMainChatDeepLinks(this.$$context_receiver_0, deepLink, this);
                if (handleMainChatDeepLinks == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.L$0 = null;
                this.label = 3;
                navigateToMainChat = this.this$0.navigateToMainChat(this.$$context_receiver_0, this);
                if (navigateToMainChat == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else if (deepLink instanceof DeepLink.OpenNeurons) {
            appEventsEmitter2 = this.this$0.appEventsEmitter;
            appEventsEmitter2.emit(new AppEvents.Billing.BuyNeurons(new BuyNeuronsBillingUiParams(false, null, PurchaseSource.DEEPLINK, null, 11, null)));
        } else if (deepLink instanceof DeepLink.OpenSubscription) {
            appEventsEmitter = this.this$0.appEventsEmitter;
            appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(new BuySubscriptionBillingUiParams(null, false, UpgradeType.DEEPLINK, null, 11, null)));
        }
        deepLinksRepository2 = this.this$0.deepLinksRepository;
        deepLinksRepository2.clear();
        return Unit.INSTANCE;
    }
}
