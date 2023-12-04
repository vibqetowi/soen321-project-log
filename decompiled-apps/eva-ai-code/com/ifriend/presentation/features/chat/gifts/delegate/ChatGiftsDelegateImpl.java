package com.ifriend.presentation.features.chat.gifts.delegate;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.data.toggle.ChatGiftsStoreToggle;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.logic.chat.gifts.ChatGiftsUseCase;
import com.ifriend.domain.logic.chat.permissions.CheckChatPermissionsUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.chat.gifts.analytics.ChatGiftAnalytics;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatGiftsDelegate.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B?\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J!\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016R\u00020#¢\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0016R\u00020#¢\u0006\u0002\u0010*J\u0011\u0010+\u001a\u00020\"H\u0016R\u00020#¢\u0006\u0002\u0010,J\u0019\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0002\u00100J\u0019\u00101\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0016R\u00020#¢\u0006\u0002\u0010*J\u0019\u00102\u001a\u00020\"2\u0006\u0010&\u001a\u00020'H\u0002R\u00020#¢\u0006\u0002\u0010*J0\u00103\u001a\u00020\"*\u0002042!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u000306H\u0097\u0001JD\u0010:\u001a\u00020;*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010<\u001a\u0002042!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u000306H\u0096\u0001JD\u0010>\u001a\u00020\"*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u000306H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010?J)\u0010@\u001a\u00020\"*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010A\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010BJD\u0010C\u001a\u00020\"*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000306H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010?R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/ifriend/presentation/features/chat/gifts/delegate/ChatGiftsDelegateImpl;", "Lcom/ifriend/presentation/features/chat/gifts/delegate/ChatGiftsDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;", "", "chatGiftsStoreToggle", "Lcom/ifriend/data/toggle/ChatGiftsStoreToggle;", "chatGiftsUseCase", "Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase;", "chatGiftsMapper", "Lcom/ifriend/presentation/features/chat/gifts/delegate/ChatGiftsMapper;", "chatGiftAnalytics", "Lcom/ifriend/presentation/features/chat/gifts/analytics/ChatGiftAnalytics;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "checkChatPermissionsUseCase", "Lcom/ifriend/domain/logic/chat/permissions/CheckChatPermissionsUseCase;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "(Lcom/ifriend/data/toggle/ChatGiftsStoreToggle;Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase;Lcom/ifriend/presentation/features/chat/gifts/delegate/ChatGiftsMapper;Lcom/ifriend/presentation/features/chat/gifts/analytics/ChatGiftAnalytics;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/domain/logic/chat/permissions/CheckChatPermissionsUseCase;Lcom/ifriend/domain/data/BotRepository;)V", "chatGiftsUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getChatGiftsUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "getUiStateFlow", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftsUiState;", "giftClick", "", "Landroidx/lifecycle/ViewModel;", "gift", "Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;", "chatId", "", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/gifts/model/ChatGiftUi;Ljava/lang/String;)V", "giftsClick", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "giftsCloseClick", "(Landroidx/lifecycle/ViewModel;)V", "handleSendGiftResult", "result", "Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult;", "(Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initChatGifts", "refresh", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsDelegateImpl implements ChatGiftsDelegate, UiStateDelegate<ChatGiftsUiState, Object> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<ChatGiftsUiState, Object> $$delegate_0;
    private final AppEventsEmitter appEventsEmitter;
    private final BotRepository botRepository;
    private final ChatGiftAnalytics chatGiftAnalytics;
    private final ChatGiftsMapper chatGiftsMapper;
    private final ChatGiftsStoreToggle chatGiftsStoreToggle;
    private final ChatGiftsUseCase chatGiftsUseCase;
    private final CheckChatPermissionsUseCase checkChatPermissionsUseCase;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super ChatGiftsUiState, ? extends ChatGiftsUiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<ChatGiftsUiState, Object> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super ChatGiftsUiState, ? extends ChatGiftsUiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Object> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public ChatGiftsUiState getUiState(UiStateDelegate<ChatGiftsUiState, Object> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<ChatGiftsUiState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<ChatGiftsUiState, Object> uiStateDelegate, Function1<? super ChatGiftsUiState, ? extends ChatGiftsUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object sendEvent(UiStateDelegate<ChatGiftsUiState, Object> uiStateDelegate, Object obj, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, obj, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<ChatGiftsUiState, Object> uiStateDelegate, Function1<? super ChatGiftsUiState, ? extends ChatGiftsUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Inject
    public ChatGiftsDelegateImpl(ChatGiftsStoreToggle chatGiftsStoreToggle, ChatGiftsUseCase chatGiftsUseCase, ChatGiftsMapper chatGiftsMapper, ChatGiftAnalytics chatGiftAnalytics, AppEventsEmitter appEventsEmitter, CheckChatPermissionsUseCase checkChatPermissionsUseCase, BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(chatGiftsStoreToggle, "chatGiftsStoreToggle");
        Intrinsics.checkNotNullParameter(chatGiftsUseCase, "chatGiftsUseCase");
        Intrinsics.checkNotNullParameter(chatGiftsMapper, "chatGiftsMapper");
        Intrinsics.checkNotNullParameter(chatGiftAnalytics, "chatGiftAnalytics");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(checkChatPermissionsUseCase, "checkChatPermissionsUseCase");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        this.chatGiftsStoreToggle = chatGiftsStoreToggle;
        this.chatGiftsUseCase = chatGiftsUseCase;
        this.chatGiftsMapper = chatGiftsMapper;
        this.chatGiftAnalytics = chatGiftAnalytics;
        this.appEventsEmitter = appEventsEmitter;
        this.checkChatPermissionsUseCase = checkChatPermissionsUseCase;
        this.botRepository = botRepository;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new ChatGiftsUiState(false, false, null, false, null, 31, null), 0, null, 6, null);
    }

    @Override // com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate
    public StateFlow<ChatGiftsUiState> getChatGiftsUiState() {
        return getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate
    public void initChatGifts(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatGiftsDelegateImpl$initChatGifts$1(this, chatId, context_receiver_0, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatGiftsDelegateImpl$initChatGifts$2(this, chatId, context_receiver_0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh(ViewModel viewModel, String str) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatGiftsDelegateImpl$refresh$1(this, null), null, new ChatGiftsDelegateImpl$refresh$2(this, str, null), 2, null);
    }

    @Override // com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate
    public void giftClick(ViewModel context_receiver_0, ChatGiftUi gift, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(gift, "gift");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new ChatGiftsDelegateImpl$giftClick$1(null), null, new ChatGiftsDelegateImpl$giftClick$2(this, chatId, gift, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSendGiftResult(ChatGiftsUseCase.SendGiftResult sendGiftResult, Continuation<? super Unit> continuation) {
        if (!(sendGiftResult instanceof ChatGiftsUseCase.SendGiftResult.Successful) && !Intrinsics.areEqual(sendGiftResult, ChatGiftsUseCase.SendGiftResult.NotInCache.INSTANCE) && Intrinsics.areEqual(sendGiftResult, ChatGiftsUseCase.SendGiftResult.NotEnoughNeurons.INSTANCE)) {
            this.appEventsEmitter.emit(new AppEvents.Billing.BuyNeurons(new BuyNeuronsBillingUiParams(false, null, PurchaseSource.GIFT_STORE, null, 10, null)));
        }
        return Unit.INSTANCE;
    }

    @Override // com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate
    public void giftsClick(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatGiftsDelegateImpl$giftsClick$1(this, context_receiver_0, chatId, null), 3, null);
    }

    @Override // com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegate
    public void giftsCloseClick(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        asyncReduce(ViewModelKt.getViewModelScope(context_receiver_0), ChatGiftsDelegateImpl$giftsCloseClick$1.INSTANCE);
    }
}
