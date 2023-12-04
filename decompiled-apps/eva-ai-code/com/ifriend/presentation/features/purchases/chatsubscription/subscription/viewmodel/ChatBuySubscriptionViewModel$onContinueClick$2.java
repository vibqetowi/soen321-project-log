package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import com.android.billingclient.api.BillingFlowParams;
import com.ifriend.presentation.analytics.ChatAnalyticsInteractor;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferUi;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$onContinueClick$2", f = "ChatBuySubscriptionViewModel.kt", i = {}, l = {310, 320, 321}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel$onContinueClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChatBuySubscriptionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionViewModel$onContinueClick$2(ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, Continuation<? super ChatBuySubscriptionViewModel$onContinueClick$2> continuation) {
        super(2, continuation);
        this.this$0 = chatBuySubscriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBuySubscriptionViewModel$onContinueClick$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatBuySubscriptionViewModel$onContinueClick$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBuySubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$onContinueClick$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatBuySubscriptionViewModel.UiState invoke(ChatBuySubscriptionViewModel.UiState state) {
            ChatBuySubscriptionViewModel.UiState m6983copypAZo6Ak;
            Intrinsics.checkNotNullParameter(state, "state");
            m6983copypAZo6Ak = state.m6983copypAZo6Ak((r26 & 1) != 0 ? state.isLoading : true, (r26 & 2) != 0 ? state.isPurchased : false, (r26 & 4) != 0 ? state.gradientColor : 0L, (r26 & 8) != 0 ? state.gradientDarkerColor : 0L, (r26 & 16) != 0 ? state.interestsLabels : null, (r26 & 32) != 0 ? state.chatName : null, (r26 & 64) != 0 ? state.screenTitleLabel : null, (r26 & 128) != 0 ? state.screenDescriptionLabel : null, (r26 & 256) != 0 ? state.actionLabel : null, (r26 & 512) != 0 ? state.offers : null);
            return m6983copypAZo6Ak;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChatSubscriptionOfferUi chatSubscriptionOfferUi;
        ChatAnalyticsInteractor chatAnalyticsInteractor;
        UiStateDelegate<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.Event> uiStateDelegate;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.Event> uiStateDelegate2 = this.this$0;
            this.label = 1;
            if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
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
            uiStateDelegate = this.this$0;
            this.label = 3;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (ChatBuySubscriptionViewModel.Event) new ChatBuySubscriptionViewModel.Event.LaunchBillingFlow((BillingFlowParams) obj), (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        UiStateDelegate<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.Event> uiStateDelegate3 = this.this$0;
        Iterator<ChatSubscriptionOfferUi> it = uiStateDelegate3.getUiState(uiStateDelegate3).getOffers().iterator();
        while (true) {
            if (!it.hasNext()) {
                chatSubscriptionOfferUi = null;
                break;
            }
            chatSubscriptionOfferUi = it.next();
            if (chatSubscriptionOfferUi.isSelected()) {
                break;
            }
        }
        ChatSubscriptionOfferUi chatSubscriptionOfferUi2 = chatSubscriptionOfferUi;
        if (chatSubscriptionOfferUi2 != null) {
            chatAnalyticsInteractor = this.this$0.chatAnalyticsInteractor;
            String chatId = this.this$0.params.getChatId();
            UiStateDelegate<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.Event> uiStateDelegate4 = this.this$0;
            chatAnalyticsInteractor.trackBuySubscriptionClick(chatId, uiStateDelegate4.getUiState(uiStateDelegate4).getChatName());
            this.label = 2;
            obj = this.this$0.getBillingFlowParams(chatSubscriptionOfferUi2.getProductId(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            uiStateDelegate = this.this$0;
            this.label = 3;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (ChatBuySubscriptionViewModel.Event) new ChatBuySubscriptionViewModel.Event.LaunchBillingFlow((BillingFlowParams) obj), (Continuation<? super Unit>) this) == coroutine_suspended) {
            }
        }
        return Unit.INSTANCE;
    }
}
