package com.ifriend.presentation.features.chatstore.viewmodel;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.zxing.pdf417.PDF417Common;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.balance.UserBalance;
import com.ifriend.domain.logic.chat.buy.BuyChatInteractor;
import com.ifriend.domain.logic.store.GetChatsStoreInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.chatstore.analytics.ChatsStoreAnalyticsInteractor;
import com.ifriend.presentation.features.chatstore.mapper.ChatStoreUiMapper;
import com.ifriend.presentation.features.chatstore.models.ChatStoreUi;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatsStoreViewModel.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002DEBd\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0015\u0010\u000f\u001a\u0011\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0010j\u0002`\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0006\u0010-\u001a\u00020)J\u0006\u0010.\u001a\u00020)J\u0006\u0010/\u001a\u00020)J\u000e\u00100\u001a\u00020)2\u0006\u00101\u001a\u000202J0\u00103\u001a\u00020)*\u0002042!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u000306H\u0097\u0001JD\u0010:\u001a\u00020;*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010<\u001a\u0002042!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u000306H\u0096\u0001JD\u0010>\u001a\u00020)*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u000306H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010?J)\u0010@\u001a\u00020)*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010A\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010BJD\u0010C\u001a\u00020)*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010=\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000306H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010?R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0011\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0010j\u0002`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$Event;", "chatId", "", "userBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "getChatsStoreInteractor", "Lcom/ifriend/domain/logic/store/GetChatsStoreInteractor;", "chatStoreUiMapper", "Lcom/ifriend/presentation/features/chatstore/mapper/ChatStoreUiMapper;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "paymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "buyChatInteractor", "Lcom/ifriend/domain/logic/chat/buy/BuyChatInteractor;", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "chatsStoreAnalyticsInteractor", "Lcom/ifriend/presentation/features/chatstore/analytics/ChatsStoreAnalyticsInteractor;", "(Ljava/lang/String;Lcom/ifriend/domain/data/user/UserBalanceRepository;Lcom/ifriend/domain/logic/store/GetChatsStoreInteractor;Lcom/ifriend/presentation/features/chatstore/mapper/ChatStoreUiMapper;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;Lcom/ifriend/domain/logic/chat/buy/BuyChatInteractor;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/presentation/features/chatstore/analytics/ChatsStoreAnalyticsInteractor;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;", "buyChat", "", "chat", "Lcom/ifriend/presentation/features/chatstore/models/ChatStoreUi;", "buyChatAfterBuyNeurons", "onAddNeuronsClick", "onBuyChat", "onDismissPopup", "onPageChanged", "currentPage", "", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Event", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsStoreViewModel extends ViewModel implements UiStateDelegate<UiState, Event> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_0;
    private final AppEventsEmitter appEventsEmitter;
    private final BuyChatInteractor buyChatInteractor;
    private final ChatStoreUiMapper chatStoreUiMapper;
    private final ChatsStoreAnalyticsInteractor chatsStoreAnalyticsInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final GetChatsStoreInteractor getChatsStoreInteractor;
    private final PaymentResultFlow paymentResultFlow;
    private final ResourceProvider resourceProvider;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Event> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Event> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, event, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation continuation) {
        return sendEvent2(uiStateDelegate, event, (Continuation<? super Unit>) continuation);
    }

    public ChatsStoreViewModel(String chatId, UserBalanceRepository userBalanceRepository, GetChatsStoreInteractor getChatsStoreInteractor, ChatStoreUiMapper chatStoreUiMapper, AppEventsEmitter appEventsEmitter, FlowObserverEmitter<Throwable> exceptionsEmitter, PaymentResultFlow paymentResultFlow, BuyChatInteractor buyChatInteractor, ResourceProvider resourceProvider, ChatsStoreAnalyticsInteractor chatsStoreAnalyticsInteractor) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(userBalanceRepository, "userBalanceRepository");
        Intrinsics.checkNotNullParameter(getChatsStoreInteractor, "getChatsStoreInteractor");
        Intrinsics.checkNotNullParameter(chatStoreUiMapper, "chatStoreUiMapper");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(paymentResultFlow, "paymentResultFlow");
        Intrinsics.checkNotNullParameter(buyChatInteractor, "buyChatInteractor");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatsStoreAnalyticsInteractor, "chatsStoreAnalyticsInteractor");
        this.getChatsStoreInteractor = getChatsStoreInteractor;
        this.chatStoreUiMapper = chatStoreUiMapper;
        this.appEventsEmitter = appEventsEmitter;
        this.exceptionsEmitter = exceptionsEmitter;
        this.paymentResultFlow = paymentResultFlow;
        this.buyChatInteractor = buyChatInteractor;
        this.resourceProvider = resourceProvider;
        this.chatsStoreAnalyticsInteractor = chatsStoreAnalyticsInteractor;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new UiState(false, null, null, 0, 0, null, 0, false, 255, null), 0, null, 6, null);
        ChatsStoreViewModel chatsStoreViewModel = this;
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatsStoreViewModel), null, null, new AnonymousClass1(null), 3, null);
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatsStoreViewModel), null, null, new AnonymousClass2(chatId, null), 3, null);
        FlowKt.launchIn(FlowKt.onEach(userBalanceRepository.getBalanceFlow(), new AnonymousClass3(null)), ViewModelKt.getViewModelScope(chatsStoreViewModel));
    }

    /* compiled from: ChatsStoreViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006("}, d2 = {"Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;", "", "isLoading", "", "chatStores", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/ifriend/presentation/features/chatstore/models/ChatStoreUi;", "currentChat", "initPageIndex", "", "currentPage", "neurons", "", "neuronsValue", "isVisiblePopup", "(ZLkotlinx/collections/immutable/PersistentList;Lcom/ifriend/presentation/features/chatstore/models/ChatStoreUi;IILjava/lang/String;IZ)V", "getChatStores", "()Lkotlinx/collections/immutable/PersistentList;", "getCurrentChat", "()Lcom/ifriend/presentation/features/chatstore/models/ChatStoreUi;", "getCurrentPage", "()I", "getInitPageIndex", "()Z", "getNeurons", "()Ljava/lang/String;", "getNeuronsValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 0;
        private final PersistentList<ChatStoreUi> chatStores;
        private final ChatStoreUi currentChat;
        private final int currentPage;
        private final int initPageIndex;
        private final boolean isLoading;
        private final boolean isVisiblePopup;
        private final String neurons;
        private final int neuronsValue;

        public UiState() {
            this(false, null, null, 0, 0, null, 0, false, 255, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, boolean z, PersistentList persistentList, ChatStoreUi chatStoreUi, int i, int i2, String str, int i3, boolean z2, int i4, Object obj) {
            return uiState.copy((i4 & 1) != 0 ? uiState.isLoading : z, (i4 & 2) != 0 ? uiState.chatStores : persistentList, (i4 & 4) != 0 ? uiState.currentChat : chatStoreUi, (i4 & 8) != 0 ? uiState.initPageIndex : i, (i4 & 16) != 0 ? uiState.currentPage : i2, (i4 & 32) != 0 ? uiState.neurons : str, (i4 & 64) != 0 ? uiState.neuronsValue : i3, (i4 & 128) != 0 ? uiState.isVisiblePopup : z2);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final PersistentList<ChatStoreUi> component2() {
            return this.chatStores;
        }

        public final ChatStoreUi component3() {
            return this.currentChat;
        }

        public final int component4() {
            return this.initPageIndex;
        }

        public final int component5() {
            return this.currentPage;
        }

        public final String component6() {
            return this.neurons;
        }

        public final int component7() {
            return this.neuronsValue;
        }

        public final boolean component8() {
            return this.isVisiblePopup;
        }

        public final UiState copy(boolean z, PersistentList<ChatStoreUi> chatStores, ChatStoreUi chatStoreUi, int i, int i2, String neurons, int i3, boolean z2) {
            Intrinsics.checkNotNullParameter(chatStores, "chatStores");
            Intrinsics.checkNotNullParameter(neurons, "neurons");
            return new UiState(z, chatStores, chatStoreUi, i, i2, neurons, i3, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return this.isLoading == uiState.isLoading && Intrinsics.areEqual(this.chatStores, uiState.chatStores) && Intrinsics.areEqual(this.currentChat, uiState.currentChat) && this.initPageIndex == uiState.initPageIndex && this.currentPage == uiState.currentPage && Intrinsics.areEqual(this.neurons, uiState.neurons) && this.neuronsValue == uiState.neuronsValue && this.isVisiblePopup == uiState.isVisiblePopup;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v17 */
        public int hashCode() {
            boolean z = this.isLoading;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int hashCode = ((r0 * 31) + this.chatStores.hashCode()) * 31;
            ChatStoreUi chatStoreUi = this.currentChat;
            int hashCode2 = (((((((((hashCode + (chatStoreUi == null ? 0 : chatStoreUi.hashCode())) * 31) + this.initPageIndex) * 31) + this.currentPage) * 31) + this.neurons.hashCode()) * 31) + this.neuronsValue) * 31;
            boolean z2 = this.isVisiblePopup;
            return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.isLoading;
            PersistentList<ChatStoreUi> persistentList = this.chatStores;
            ChatStoreUi chatStoreUi = this.currentChat;
            int i = this.initPageIndex;
            int i2 = this.currentPage;
            String str = this.neurons;
            int i3 = this.neuronsValue;
            boolean z2 = this.isVisiblePopup;
            return "UiState(isLoading=" + z + ", chatStores=" + persistentList + ", currentChat=" + chatStoreUi + ", initPageIndex=" + i + ", currentPage=" + i2 + ", neurons=" + str + ", neuronsValue=" + i3 + ", isVisiblePopup=" + z2 + ")";
        }

        public UiState(boolean z, PersistentList<ChatStoreUi> chatStores, ChatStoreUi chatStoreUi, int i, int i2, String neurons, int i3, boolean z2) {
            Intrinsics.checkNotNullParameter(chatStores, "chatStores");
            Intrinsics.checkNotNullParameter(neurons, "neurons");
            this.isLoading = z;
            this.chatStores = chatStores;
            this.currentChat = chatStoreUi;
            this.initPageIndex = i;
            this.currentPage = i2;
            this.neurons = neurons;
            this.neuronsValue = i3;
            this.isVisiblePopup = z2;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public /* synthetic */ UiState(boolean z, PersistentList persistentList, ChatStoreUi chatStoreUi, int i, int i2, String str, int i3, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? ExtensionsKt.persistentListOf() : persistentList, (i4 & 4) != 0 ? null : chatStoreUi, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? "" : str, (i4 & 64) != 0 ? 0 : i3, (i4 & 128) == 0 ? z2 : false);
        }

        public final PersistentList<ChatStoreUi> getChatStores() {
            return this.chatStores;
        }

        public final ChatStoreUi getCurrentChat() {
            return this.currentChat;
        }

        public final int getInitPageIndex() {
            return this.initPageIndex;
        }

        public final int getCurrentPage() {
            return this.currentPage;
        }

        public final String getNeurons() {
            return this.neurons;
        }

        public final int getNeuronsValue() {
            return this.neuronsValue;
        }

        public final boolean isVisiblePopup() {
            return this.isVisiblePopup;
        }
    }

    /* compiled from: ChatsStoreViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$Event;", "", "GoToChat", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$Event$GoToChat;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: ChatsStoreViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$Event$GoToChat;", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$Event;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class GoToChat implements Event {
            public static final int $stable = 0;
            private final String chatId;

            public static /* synthetic */ GoToChat copy$default(GoToChat goToChat, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = goToChat.chatId;
                }
                return goToChat.copy(str);
            }

            public final String component1() {
                return this.chatId;
            }

            public final GoToChat copy(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                return new GoToChat(chatId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToChat) && Intrinsics.areEqual(this.chatId, ((GoToChat) obj).chatId);
            }

            public int hashCode() {
                return this.chatId.hashCode();
            }

            public String toString() {
                String str = this.chatId;
                return "GoToChat(chatId=" + str + ")";
            }

            public GoToChat(String chatId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                this.chatId = chatId;
            }

            public final String getChatId() {
                return this.chatId;
            }
        }
    }

    /* compiled from: ChatsStoreViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$1", f = "ChatsStoreViewModel.kt", i = {1}, l = {TsExtractor.TS_SYNC_BYTE, 72, 76}, m = "invokeSuspend", n = {"isVisible"}, s = {"Z$0"})
    /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean booleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ChatsStoreViewModel.this.getChatsStoreInteractor.shouldShowExplanationPopup(this);
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
                booleanValue = this.Z$0;
                ResultKt.throwOnFailure(obj);
                if (booleanValue) {
                    this.label = 3;
                    if (ChatsStoreViewModel.this.getChatsStoreInteractor.onExplanationPopupShown(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } else {
                ResultKt.throwOnFailure(obj);
            }
            booleanValue = ((Boolean) obj).booleanValue();
            UiStateDelegate<UiState, Event> uiStateDelegate = ChatsStoreViewModel.this;
            this.Z$0 = booleanValue;
            this.label = 2;
            if (uiStateDelegate.updateUiState(uiStateDelegate, new C01591(booleanValue), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (booleanValue) {
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatsStoreViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01591 extends Lambda implements Function1<UiState, UiState> {
            final /* synthetic */ boolean $isVisible;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01591(boolean z) {
                super(1);
                this.$isVisible = z;
            }

            @Override // kotlin.jvm.functions.Function1
            public final UiState invoke(UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return UiState.copy$default(state, false, null, null, 0, 0, null, 0, this.$isVisible, 127, null);
            }
        }
    }

    /* compiled from: ChatsStoreViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2", f = "ChatsStoreViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ChatsStoreViewModel.this.getChatsStoreInteractor.execute(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            final Flow flow = (Flow) obj;
            final ChatsStoreViewModel chatsStoreViewModel = ChatsStoreViewModel.this;
            FlowKt.launchIn(FlowKt.onEach(new Flow<List<? extends ChatStoreUi>>() { // from class: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends ChatStoreUi>> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, chatsStoreViewModel), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ ChatsStoreViewModel this$0;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1$2", f = "ChatsStoreViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, ChatsStoreViewModel chatsStoreViewModel) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = chatsStoreViewModel;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        ChatStoreUiMapper chatStoreUiMapper;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    final Comparator comparator = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: CONSTRUCTOR  (r2v4 'comparator' java.util.Comparator) =  call: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$lambda$2$$inlined$compareBy$1.<init>():void type: CONSTRUCTOR in method: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes6.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:287)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$lambda$2$$inlined$compareBy$1, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:303)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:696)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:395)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
                                        	... 33 more
                                        */
                                    /*
                                        this = this;
                                        boolean r0 = r8 instanceof com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                        if (r0 == 0) goto L14
                                        r0 = r8
                                        com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                        int r1 = r0.label
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r1 = r1 & r2
                                        if (r1 == 0) goto L14
                                        int r8 = r0.label
                                        int r8 = r8 - r2
                                        r0.label = r8
                                        goto L19
                                    L14:
                                        com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1$2$1
                                        r0.<init>(r8)
                                    L19:
                                        java.lang.Object r8 = r0.result
                                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                        int r2 = r0.label
                                        r3 = 1
                                        if (r2 == 0) goto L32
                                        if (r2 != r3) goto L2a
                                        kotlin.ResultKt.throwOnFailure(r8)
                                        goto L88
                                    L2a:
                                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                        r7.<init>(r8)
                                        throw r7
                                    L32:
                                        kotlin.ResultKt.throwOnFailure(r8)
                                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                                        r2 = r0
                                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                                        java.util.List r7 = (java.util.List) r7
                                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                                        com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$lambda$2$$inlined$compareBy$1 r2 = new com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$lambda$2$$inlined$compareBy$1
                                        r2.<init>()
                                        java.util.Comparator r2 = (java.util.Comparator) r2
                                        com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$lambda$2$$inlined$thenBy$1 r4 = new com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$lambda$2$$inlined$thenBy$1
                                        r4.<init>(r2)
                                        java.util.Comparator r4 = (java.util.Comparator) r4
                                        java.util.List r7 = kotlin.collections.CollectionsKt.sortedWith(r7, r4)
                                        java.lang.Iterable r7 = (java.lang.Iterable) r7
                                        com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel r2 = r6.this$0
                                        com.ifriend.presentation.features.chatstore.mapper.ChatStoreUiMapper r2 = com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel.access$getChatStoreUiMapper$p(r2)
                                        java.util.ArrayList r4 = new java.util.ArrayList
                                        r5 = 10
                                        int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r5)
                                        r4.<init>(r5)
                                        java.util.Collection r4 = (java.util.Collection) r4
                                        java.util.Iterator r7 = r7.iterator()
                                    L69:
                                        boolean r5 = r7.hasNext()
                                        if (r5 == 0) goto L7d
                                        java.lang.Object r5 = r7.next()
                                        com.ifriend.domain.logic.chat.configuration.ChatsConfiguration r5 = (com.ifriend.domain.logic.chat.configuration.ChatsConfiguration) r5
                                        com.ifriend.presentation.features.chatstore.models.ChatStoreUi r5 = r2.map(r5)
                                        r4.add(r5)
                                        goto L69
                                    L7d:
                                        java.util.List r4 = (java.util.List) r4
                                        r0.label = r3
                                        java.lang.Object r7 = r8.emit(r4, r0)
                                        if (r7 != r1) goto L88
                                        return r1
                                    L88:
                                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                                        return r7
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                }
                            }
                        }, new C01602(ChatsStoreViewModel.this, this.$chatId, null)), ViewModelKt.getViewModelScope(ChatsStoreViewModel.this));
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: ChatsStoreViewModel.kt */
                    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/presentation/features/chatstore/models/ChatStoreUi;", "chats", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$2", f = "ChatsStoreViewModel.kt", i = {}, l = {PDF417Common.MAX_ROWS_IN_BARCODE, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$2  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes6.dex */
                    public static final class C01602 extends SuspendLambda implements Function2<List<? extends ChatStoreUi>, Continuation<? super Unit>, Object> {
                        final /* synthetic */ String $chatId;
                        /* synthetic */ Object L$0;
                        int label;
                        final /* synthetic */ ChatsStoreViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01602(ChatsStoreViewModel chatsStoreViewModel, String str, Continuation<? super C01602> continuation) {
                            super(2, continuation);
                            this.this$0 = chatsStoreViewModel;
                            this.$chatId = str;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C01602 c01602 = new C01602(this.this$0, this.$chatId, continuation);
                            c01602.L$0 = obj;
                            return c01602;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatStoreUi> list, Continuation<? super Unit> continuation) {
                            return invoke2((List<ChatStoreUi>) list, continuation);
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final Object invoke2(List<ChatStoreUi> list, Continuation<? super Unit> continuation) {
                            return ((C01602) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            int coerceIn;
                            int i;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                List list = (List) this.L$0;
                                if (list.isEmpty()) {
                                    UiStateDelegate<UiState, Event> uiStateDelegate = this.this$0;
                                    this.label = 1;
                                    if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(list), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    UiStateDelegate<UiState, Event> uiStateDelegate2 = this.this$0;
                                    if (uiStateDelegate2.getUiState(uiStateDelegate2).getCurrentChat() == null) {
                                        String str = this.$chatId;
                                        Iterator it = list.iterator();
                                        coerceIn = 0;
                                        int i3 = 0;
                                        while (true) {
                                            i = -1;
                                            if (!it.hasNext()) {
                                                i3 = -1;
                                                break;
                                            } else if (Intrinsics.areEqual(((ChatStoreUi) it.next()).getChatId(), str)) {
                                                break;
                                            } else {
                                                i3++;
                                            }
                                        }
                                        if (i3 != -1) {
                                            String str2 = this.$chatId;
                                            Iterator it2 = list.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    break;
                                                } else if (Intrinsics.areEqual(((ChatStoreUi) it2.next()).getChatId(), str2)) {
                                                    i = coerceIn;
                                                    break;
                                                } else {
                                                    coerceIn++;
                                                }
                                            }
                                            coerceIn = RangesKt.coerceIn(i, (ClosedRange<Integer>) CollectionsKt.getIndices(list));
                                        }
                                    } else {
                                        UiStateDelegate<UiState, Event> uiStateDelegate3 = this.this$0;
                                        coerceIn = RangesKt.coerceIn(uiStateDelegate3.getUiState(uiStateDelegate3).getInitPageIndex(), (ClosedRange<Integer>) CollectionsKt.getIndices(list));
                                    }
                                    UiStateDelegate<UiState, Event> uiStateDelegate4 = this.this$0;
                                    this.label = 2;
                                    if (uiStateDelegate4.updateUiState(uiStateDelegate4, new C01612(list, coerceIn), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else if (i2 != 1 && i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: ChatsStoreViewModel.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$2$1  reason: invalid class name */
                        /* loaded from: classes6.dex */
                        public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
                            final /* synthetic */ List<ChatStoreUi> $chats;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(List<ChatStoreUi> list) {
                                super(1);
                                this.$chats = list;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final UiState invoke(UiState state) {
                                Intrinsics.checkNotNullParameter(state, "state");
                                return UiState.copy$default(state, false, ExtensionsKt.toPersistentList(this.$chats), null, 0, 0, null, 0, false, 241, null);
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: ChatsStoreViewModel.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$2$2$2  reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes6.dex */
                        public static final class C01612 extends Lambda implements Function1<UiState, UiState> {
                            final /* synthetic */ List<ChatStoreUi> $chats;
                            final /* synthetic */ int $initPageIndex;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C01612(List<ChatStoreUi> list, int i) {
                                super(1);
                                this.$chats = list;
                                this.$initPageIndex = i;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final UiState invoke(UiState state) {
                                Intrinsics.checkNotNullParameter(state, "state");
                                return UiState.copy$default(state, false, ExtensionsKt.toPersistentList(this.$chats), (ChatStoreUi) CollectionsKt.getOrNull(this.$chats, this.$initPageIndex), this.$initPageIndex, 0, null, 0, false, 241, null);
                            }
                        }
                    }
                }

                /* compiled from: ChatsStoreViewModel.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/balance/UserBalance;", "balance", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$3", f = "ChatsStoreViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$3  reason: invalid class name */
                /* loaded from: classes6.dex */
                static final class AnonymousClass3 extends SuspendLambda implements Function2<UserBalance, Continuation<? super Unit>, Object> {
                    /* synthetic */ Object L$0;
                    int label;

                    AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                        anonymousClass3.L$0 = obj;
                        return anonymousClass3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(UserBalance userBalance, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass3) create(userBalance, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            int neurons = ((UserBalance) this.L$0).getNeurons();
                            UiStateDelegate<UiState, Event> uiStateDelegate = ChatsStoreViewModel.this;
                            this.label = 1;
                            if (uiStateDelegate.updateUiState(uiStateDelegate, new AnonymousClass1(neurons), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: ChatsStoreViewModel.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel$3$1  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
                        final /* synthetic */ int $neurons;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(int i) {
                            super(1);
                            this.$neurons = i;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final UiState invoke(UiState state) {
                            Intrinsics.checkNotNullParameter(state, "state");
                            return UiState.copy$default(state, false, null, null, 0, 0, String.valueOf(this.$neurons), this.$neurons, false, 159, null);
                        }
                    }
                }

                public final void onBuyChat() {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatsStoreViewModel$onBuyChat$1(this, null), 3, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void buyChatAfterBuyNeurons(ChatStoreUi chatStoreUi) {
                    CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ChatsStoreViewModel$buyChatAfterBuyNeurons$1(this, null), null, new ChatsStoreViewModel$buyChatAfterBuyNeurons$2(this, chatStoreUi, null), 2, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final void buyChat(ChatStoreUi chatStoreUi) {
                    CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ChatsStoreViewModel$buyChat$1(this, null), null, new ChatsStoreViewModel$buyChat$2(this, chatStoreUi, null), 2, null).invokeOnCompletion(new ChatsStoreViewModel$buyChat$3(this));
                }

                public final void onAddNeuronsClick() {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatsStoreViewModel$onAddNeuronsClick$1(this, null), 3, null);
                }

                public final void onPageChanged(int i) {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatsStoreViewModel$onPageChanged$1(this, i, null), 3, null);
                }

                public final void onDismissPopup() {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatsStoreViewModel$onDismissPopup$1(this, null), 3, null);
                }
            }
