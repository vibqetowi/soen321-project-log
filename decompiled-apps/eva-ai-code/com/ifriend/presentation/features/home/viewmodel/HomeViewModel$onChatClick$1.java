package com.ifriend.presentation.features.home.viewmodel;

import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.home.analytics.HomeAnalyticsInteractor;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
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
/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.home.viewmodel.HomeViewModel$onChatClick$1", f = "HomeViewModel.kt", i = {}, l = {118, 121}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class HomeViewModel$onChatClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeChatUi $chat;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onChatClick$1(HomeChatUi homeChatUi, HomeViewModel homeViewModel, Continuation<? super HomeViewModel$onChatClick$1> continuation) {
        super(2, continuation);
        this.$chat = homeChatUi;
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$onChatClick$1(this.$chat, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeViewModel$onChatClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeAnalyticsInteractor homeAnalyticsInteractor;
        HomeAnalyticsInteractor homeAnalyticsInteractor2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String chatId = this.$chat.getChatId();
            if (this.$chat.isCanChatting()) {
                homeAnalyticsInteractor2 = this.this$0.homeAnalytics;
                homeAnalyticsInteractor2.trackChatClick(chatId);
                UiStateDelegate<HomeViewModel.UiState, HomeViewModel.Event> uiStateDelegate = this.this$0;
                this.label = 1;
                if (uiStateDelegate.sendEvent2(uiStateDelegate, (HomeViewModel.Event) new HomeViewModel.Event.GoToChat(chatId), (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                homeAnalyticsInteractor = this.this$0.homeAnalytics;
                homeAnalyticsInteractor.trackInactiveChatClick(chatId);
                UiStateDelegate<HomeViewModel.UiState, HomeViewModel.Event> uiStateDelegate2 = this.this$0;
                this.label = 2;
                if (uiStateDelegate2.sendEvent2(uiStateDelegate2, (HomeViewModel.Event) new HomeViewModel.Event.GoToChatsStore(chatId), (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
