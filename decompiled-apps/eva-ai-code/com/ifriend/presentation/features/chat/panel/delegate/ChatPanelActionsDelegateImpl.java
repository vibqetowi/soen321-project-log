package com.ifriend.presentation.features.chat.panel.delegate;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.logic.calls.ChatCallsInteractor;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import com.ifriend.presentation.analytics.ChatTopicsAnalytics;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.chat.actions.delegate.ChatPanelActionsEvent;
import com.ifriend.presentation.features.chat.panel.mappers.ChatPremiumTopicMapperUi;
import com.ifriend.presentation.features.chat.panel.mappers.ChatTopicMapperUi;
import com.ifriend.presentation.features.chat.panel.mappers.TopicPopupDataMapperUi;
import com.ifriend.presentation.features.chat.panel.models.ChatCallUi;
import com.ifriend.presentation.features.chat.panel.models.ChatDiaryUi;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.panel.models.ChatPremiumTopicUi;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicUi;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chat.panel.models.TopicPopupDataUi;
import com.ifriend.presentation.features.chatcall.analytics.ChatCallAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0096\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0015\u0010\u000f\u001a\u0011\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0010j\u0002`\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0002\u0010(J\u0019\u0010;\u001a\u00020+2\u0006\u0010=\u001a\u00020>H\u0002R\u00020<¢\u0006\u0002\u0010?J!\u0010@\u001a\u00020+2\u0006\u0010A\u001a\u00020B2\u0006\u0010=\u001a\u00020>H\u0016R\u00020<¢\u0006\u0002\u0010CJ!\u0010D\u001a\u00020+2\u0006\u0010E\u001a\u00020F2\u0006\u0010=\u001a\u00020>H\u0002R\u00020<¢\u0006\u0002\u0010GJ!\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0-2\u0006\u0010=\u001a\u00020>H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010JJ!\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0-2\u0006\u0010=\u001a\u00020>H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010JJ%\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M0-2\u0006\u0010=\u001a\u00020>H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010JJ%\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0M0-2\u0006\u0010=\u001a\u00020>H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u0019\u0010Q\u001a\u00020+2\u0006\u0010R\u001a\u00020PH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010SJ\u0019\u0010T\u001a\u00020+2\u0006\u0010=\u001a\u00020>H\u0016R\u00020<¢\u0006\u0002\u0010?J!\u0010U\u001a\u00020+2\u0006\u0010R\u001a\u00020N2\u0006\u0010=\u001a\u00020>H\u0002R\u00020<¢\u0006\u0002\u0010VJ\u0019\u0010W\u001a\u00020+2\u0006\u0010=\u001a\u00020>H\u0002R\u00020<¢\u0006\u0002\u0010?J\u0011\u0010X\u001a\u00020+H\u0016R\u00020<¢\u0006\u0002\u0010YJ\u0019\u0010Z\u001a\u00020+2\u0006\u0010[\u001a\u00020\\H\u0016R\u00020<¢\u0006\u0002\u0010]J\u0019\u0010^\u001a\u00020+2\u0006\u0010_\u001a\u00020\\H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010`J\u0019\u0010a\u001a\u00020+2\u0006\u0010b\u001a\u00020cH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010dJ\u0019\u0010e\u001a\u00020+2\u0006\u0010=\u001a\u00020>H\u0002R\u00020<¢\u0006\u0002\u0010?J!\u0010f\u001a\u00020+2\u0006\u0010R\u001a\u00020P2\u0006\u0010=\u001a\u00020>H\u0002R\u00020<¢\u0006\u0002\u0010gJ\u0018\u0010h\u001a\u00020+2\u0006\u0010R\u001a\u00020N2\u0006\u0010=\u001a\u00020>H\u0002J\u0018\u0010i\u001a\u00020+2\u0006\u0010R\u001a\u00020P2\u0006\u0010=\u001a\u00020>H\u0002J0\u0010j\u001a\u00020+*\u00020k2!\u0010A\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bm\u0012\b\bn\u0012\u0004\b\b(o\u0012\u0004\u0012\u00020\u00030lH\u0097\u0001JD\u0010p\u001a\u00020q*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010r\u001a\u00020k2!\u0010s\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bm\u0012\b\bn\u0012\u0004\b\b(o\u0012\u0004\u0012\u00020\u00030lH\u0096\u0001JD\u0010t\u001a\u00020+*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010A\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bm\u0012\b\bn\u0012\u0004\b\b(o\u0012\u0004\u0012\u00020\u00030lH\u0097Aø\u0001\u0000¢\u0006\u0002\u0010uJ)\u0010v\u001a\u00020+*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010w\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010xJD\u0010y\u001a\u00020+*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010s\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bm\u0012\b\bn\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00030lH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010uR\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0011\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0010j\u0002`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u0003018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010/R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020\u000301X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00103R\"\u00108\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006z"}, d2 = {"Lcom/ifriend/presentation/features/chat/panel/delegate/ChatPanelActionsDelegateImpl;", "Lcom/ifriend/presentation/features/chat/panel/delegate/ChatPanelActionsDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent;", "chatPanelActionsInteractor", "Lcom/ifriend/domain/logic/topics/ChatPanelActionsInteractor;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "chatTopicMapperUi", "Lcom/ifriend/presentation/features/chat/panel/mappers/ChatTopicMapperUi;", "chatPremiumTopicMapperUi", "Lcom/ifriend/presentation/features/chat/panel/mappers/ChatPremiumTopicMapperUi;", "topicPopupDataMapperUi", "Lcom/ifriend/presentation/features/chat/panel/mappers/TopicPopupDataMapperUi;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "appIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "chatTopicsAnalytics", "Lcom/ifriend/presentation/analytics/ChatTopicsAnalytics;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "chatEventsInteractor", "Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;", "chatCallsInteractor", "Lcom/ifriend/domain/logic/calls/ChatCallsInteractor;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "paymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "chatCallAnalytics", "Lcom/ifriend/presentation/features/chatcall/analytics/ChatCallAnalytics;", "(Lcom/ifriend/domain/logic/topics/ChatPanelActionsInteractor;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/presentation/features/chat/panel/mappers/ChatTopicMapperUi;Lcom/ifriend/presentation/features/chat/panel/mappers/ChatPremiumTopicMapperUi;Lcom/ifriend/presentation/features/chat/panel/mappers/TopicPopupDataMapperUi;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/core/tools/api/AppIdentityConverter;Lcom/ifriend/presentation/analytics/ChatTopicsAnalytics;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;Lcom/ifriend/domain/logic/chat/events/ChatEventsInteractor;Lcom/ifriend/domain/logic/calls/ChatCallsInteractor;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;Lcom/ifriend/presentation/features/chatcall/analytics/ChatCallAnalytics;)V", "activateTopics", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "panelActionsEvents", "Lkotlinx/coroutines/flow/Flow;", "getPanelActionsEvents", "()Lkotlinx/coroutines/flow/Flow;", "panelActionsState", "Lkotlinx/coroutines/flow/StateFlow;", "getPanelActionsState", "()Lkotlinx/coroutines/flow/StateFlow;", "singleEvents", "getSingleEvents", "uiStateFlow", "getUiStateFlow", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "chatCallUi", "Landroidx/lifecycle/ViewModel;", "chatId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "chatTopicClick", NativeProtocol.WEB_DIALOG_ACTION, "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;Ljava/lang/String;)V", "diaryClick", "diary", "Lcom/ifriend/presentation/features/chat/panel/models/ChatDiaryUi;", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/panel/models/ChatDiaryUi;Ljava/lang/String;)V", "getCallFlow", "Lcom/ifriend/presentation/features/chat/panel/models/ChatCallUi;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDiariesFlow", "getPremiumTopicsFlow", "", "Lcom/ifriend/presentation/features/chat/panel/models/ChatPremiumTopicUi;", "getTopicsFlow", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicUi;", "hideTopicLoading", "topic", "(Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicUi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initChatPanelActions", "premiumTopicClick", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/panel/models/ChatPremiumTopicUi;Ljava/lang/String;)V", "refreshActions", "remindButtonClicked", "(Landroidx/lifecycle/ViewModel;)V", "remindPermissionGranted", "granted", "", "(Landroidx/lifecycle/ViewModel;Z)V", "showHideCallLoading", "isLoading", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showPopup", "popup", "Lcom/ifriend/presentation/features/chat/panel/models/TopicPopupDataUi;", "(Lcom/ifriend/presentation/features/chat/panel/models/TopicPopupDataUi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showUpdateSubscription", "topicClick", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicUi;Ljava/lang/String;)V", "trackPremiumTopicClick", "trackTopicClick", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/chat/actions/delegate/ChatPanelActionsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl implements ChatPanelActionsDelegate, UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<ChatTopicsUiState, ChatPanelActionsEvent> $$delegate_0;
    private final MutableSharedFlow<Unit> activateTopics;
    private final AppEventsEmitter appEventsEmitter;
    private final AppIdentityConverter appIdentityConverter;
    private final BotRepository botRepository;
    private final ChatCallAnalytics chatCallAnalytics;
    private final ChatCallsInteractor chatCallsInteractor;
    private final ChatEventsInteractor chatEventsInteractor;
    private final ChatPanelActionsInteractor chatPanelActionsInteractor;
    private final ChatPremiumTopicMapperUi chatPremiumTopicMapperUi;
    private final ChatTopicMapperUi chatTopicMapperUi;
    private final ChatTopicsAnalytics chatTopicsAnalytics;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DispatcherProvider dispatcherProvider;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final InternalNotificationHandler internalNotificationHandler;
    private final PaymentResultFlow paymentResultFlow;
    private final TopicPopupDataMapperUi topicPopupDataMapperUi;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super ChatTopicsUiState, ? extends ChatTopicsUiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super ChatTopicsUiState, ? extends ChatTopicsUiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<ChatPanelActionsEvent> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public ChatTopicsUiState getUiState(UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<ChatTopicsUiState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate, Function1<? super ChatTopicsUiState, ? extends ChatTopicsUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate, ChatPanelActionsEvent chatPanelActionsEvent, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, chatPanelActionsEvent, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate, Function1<? super ChatTopicsUiState, ? extends ChatTopicsUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Inject
    public ChatPanelActionsDelegateImpl(ChatPanelActionsInteractor chatPanelActionsInteractor, DispatcherProvider dispatcherProvider, ChatTopicMapperUi chatTopicMapperUi, ChatPremiumTopicMapperUi chatPremiumTopicMapperUi, TopicPopupDataMapperUi topicPopupDataMapperUi, FlowObserverEmitter<Throwable> exceptionsEmitter, AppIdentityConverter appIdentityConverter, ChatTopicsAnalytics chatTopicsAnalytics, BotRepository botRepository, ChatsInfoInteractor chatsInfoInteractor, InternalNotificationHandler internalNotificationHandler, ChatEventsInteractor chatEventsInteractor, ChatCallsInteractor chatCallsInteractor, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow, ChatCallAnalytics chatCallAnalytics) {
        Intrinsics.checkNotNullParameter(chatPanelActionsInteractor, "chatPanelActionsInteractor");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(chatTopicMapperUi, "chatTopicMapperUi");
        Intrinsics.checkNotNullParameter(chatPremiumTopicMapperUi, "chatPremiumTopicMapperUi");
        Intrinsics.checkNotNullParameter(topicPopupDataMapperUi, "topicPopupDataMapperUi");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(appIdentityConverter, "appIdentityConverter");
        Intrinsics.checkNotNullParameter(chatTopicsAnalytics, "chatTopicsAnalytics");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        Intrinsics.checkNotNullParameter(chatEventsInteractor, "chatEventsInteractor");
        Intrinsics.checkNotNullParameter(chatCallsInteractor, "chatCallsInteractor");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(paymentResultFlow, "paymentResultFlow");
        Intrinsics.checkNotNullParameter(chatCallAnalytics, "chatCallAnalytics");
        this.chatPanelActionsInteractor = chatPanelActionsInteractor;
        this.dispatcherProvider = dispatcherProvider;
        this.chatTopicMapperUi = chatTopicMapperUi;
        this.chatPremiumTopicMapperUi = chatPremiumTopicMapperUi;
        this.topicPopupDataMapperUi = topicPopupDataMapperUi;
        this.exceptionsEmitter = exceptionsEmitter;
        this.appIdentityConverter = appIdentityConverter;
        this.chatTopicsAnalytics = chatTopicsAnalytics;
        this.botRepository = botRepository;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.internalNotificationHandler = internalNotificationHandler;
        this.chatEventsInteractor = chatEventsInteractor;
        this.chatCallsInteractor = chatCallsInteractor;
        this.appEventsEmitter = appEventsEmitter;
        this.paymentResultFlow = paymentResultFlow;
        this.chatCallAnalytics = chatCallAnalytics;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new ChatTopicsUiState(null, false, null, false, false, false, 63, null), 0, null, 6, null);
        this.activateTopics = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate, ChatPanelActionsEvent chatPanelActionsEvent, Continuation continuation) {
        return sendEvent2(uiStateDelegate, chatPanelActionsEvent, (Continuation<? super Unit>) continuation);
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public Flow<ChatPanelActionsEvent> getPanelActionsEvents() {
        return getSingleEvents();
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public StateFlow<ChatTopicsUiState> getPanelActionsState() {
        return getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public void initChatPanelActions(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatPanelActionsDelegateImpl$initChatPanelActions$1(this, context_receiver_0, chatId, null), 3, null);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.debounce(this.activateTopics, 2000L), new ChatPanelActionsDelegateImpl$initChatPanelActions$2(this, null)), ViewModelKt.getViewModelScope(context_receiver_0));
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatPanelActionsDelegateImpl$initChatPanelActions$3(this, context_receiver_0, chatId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshActions(ViewModel viewModel, String str) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatPanelActionsDelegateImpl$refreshActions$1(this.exceptionsEmitter), null, new ChatPanelActionsDelegateImpl$refreshActions$2(this, str, null), 2, null);
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public void chatTopicClick(ViewModel context_receiver_0, ChatPanelActionMarker action, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        if (action instanceof ChatTopicUi) {
            topicClick(context_receiver_0, (ChatTopicUi) action, chatId);
        } else if (action instanceof ChatPremiumTopicUi) {
            premiumTopicClick(context_receiver_0, (ChatPremiumTopicUi) action, chatId);
        } else if (action instanceof ChatDiaryUi) {
            diaryClick(context_receiver_0, (ChatDiaryUi) action, chatId);
        } else if (action instanceof ChatCallUi) {
            chatCallUi(context_receiver_0, chatId);
        }
    }

    private final void topicClick(ViewModel viewModel, ChatTopicUi chatTopicUi, String str) {
        if (getUiState((UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent>) this).isCanClickTopic()) {
            CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatPanelActionsDelegateImpl$topicClick$1(this.exceptionsEmitter), null, new ChatPanelActionsDelegateImpl$topicClick$2(this, chatTopicUi, str, null), 2, null).invokeOnCompletion(new ChatPanelActionsDelegateImpl$topicClick$3(viewModel, this, chatTopicUi));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object hideTopicLoading(ChatTopicUi chatTopicUi, Continuation<? super Unit> continuation) {
        Object updateUiState = updateUiState(this, new ChatPanelActionsDelegateImpl$hideTopicLoading$2(this, chatTopicUi), continuation);
        return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackTopicClick(ChatTopicUi chatTopicUi, String str) {
        int i;
        ChatTopicsAnalytics chatTopicsAnalytics = this.chatTopicsAnalytics;
        String convertToDbId = this.appIdentityConverter.convertToDbId(str);
        ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl = this;
        ArrayList arrayList = new ArrayList();
        for (ChatPanelActionMarker chatPanelActionMarker : getUiState((UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent>) chatPanelActionsDelegateImpl).getTopics()) {
            if (chatPanelActionMarker instanceof ChatTopicUi) {
                arrayList.add(chatPanelActionMarker);
            }
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (Intrinsics.areEqual(((ChatTopicUi) it.next()).getId(), chatTopicUi.getId())) {
                break;
            } else {
                i3++;
            }
        }
        int i4 = i3 + 1;
        Iterator<ChatPanelActionMarker> it2 = getUiState((UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent>) chatPanelActionsDelegateImpl).getTopics().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (Intrinsics.areEqual(it2.next().getId(), chatTopicUi.getId())) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        chatTopicsAnalytics.sendClickTopic(convertToDbId, i4, i + 1, chatTopicUi.getName());
    }

    private final void premiumTopicClick(ViewModel viewModel, ChatPremiumTopicUi chatPremiumTopicUi, String str) {
        if (getUiState((UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent>) this).isCanClickTopic()) {
            CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatPanelActionsDelegateImpl$premiumTopicClick$1(this.exceptionsEmitter), null, new ChatPanelActionsDelegateImpl$premiumTopicClick$2(this, chatPremiumTopicUi, str, null), 2, null).invokeOnCompletion(new ChatPanelActionsDelegateImpl$premiumTopicClick$3(viewModel, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showPopup(TopicPopupDataUi topicPopupDataUi, Continuation<? super Unit> continuation) {
        Object updateUiState = updateUiState(this, new ChatPanelActionsDelegateImpl$showPopup$2(topicPopupDataUi), continuation);
        return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackPremiumTopicClick(ChatPremiumTopicUi chatPremiumTopicUi, String str) {
        this.chatTopicsAnalytics.sendClickPremiumTopic(this.appIdentityConverter.convertToDbId(str), chatPremiumTopicUi.getId(), chatPremiumTopicUi.getName());
    }

    private final void diaryClick(ViewModel viewModel, ChatDiaryUi chatDiaryUi, String str) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new ChatPanelActionsDelegateImpl$diaryClick$1(chatDiaryUi, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void chatCallUi(ViewModel viewModel, String str) {
        if (getUiState((UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent>) this).isCanClickTopic()) {
            CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatPanelActionsDelegateImpl$chatCallUi$1(this.exceptionsEmitter), null, new ChatPanelActionsDelegateImpl$chatCallUi$2(this, str, viewModel, null), 2, null).invokeOnCompletion(new ChatPanelActionsDelegateImpl$chatCallUi$3(viewModel, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showUpdateSubscription(ViewModel viewModel, String str) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), new ChatPanelActionsDelegateImpl$showUpdateSubscription$1(this.exceptionsEmitter), null, new ChatPanelActionsDelegateImpl$showUpdateSubscription$2(this, viewModel, str, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showHideCallLoading(boolean z, Continuation<? super Unit> continuation) {
        Object updateUiState = updateUiState(this, new ChatPanelActionsDelegateImpl$showHideCallLoading$2(this, z), continuation);
        return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public void remindButtonClicked(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatPanelActionsDelegateImpl$remindButtonClicked$1(this, null), 3, null);
    }

    @Override // com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegate
    public void remindPermissionGranted(ViewModel context_receiver_0, boolean z) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatPanelActionsDelegateImpl$remindPermissionGranted$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTopicsFlow(String str, Continuation<? super Flow<? extends List<ChatTopicUi>>> continuation) {
        ChatPanelActionsDelegateImpl$getTopicsFlow$1 chatPanelActionsDelegateImpl$getTopicsFlow$1;
        int i;
        ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl;
        if (continuation instanceof ChatPanelActionsDelegateImpl$getTopicsFlow$1) {
            chatPanelActionsDelegateImpl$getTopicsFlow$1 = (ChatPanelActionsDelegateImpl$getTopicsFlow$1) continuation;
            if ((chatPanelActionsDelegateImpl$getTopicsFlow$1.label & Integer.MIN_VALUE) != 0) {
                chatPanelActionsDelegateImpl$getTopicsFlow$1.label -= Integer.MIN_VALUE;
                Object obj = chatPanelActionsDelegateImpl$getTopicsFlow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatPanelActionsDelegateImpl$getTopicsFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatPanelActionsInteractor chatPanelActionsInteractor = this.chatPanelActionsInteractor;
                    chatPanelActionsDelegateImpl$getTopicsFlow$1.L$0 = this;
                    chatPanelActionsDelegateImpl$getTopicsFlow$1.L$1 = str;
                    chatPanelActionsDelegateImpl$getTopicsFlow$1.label = 1;
                    obj = chatPanelActionsInteractor.isTopicsFeatureAvailable(str, chatPanelActionsDelegateImpl$getTopicsFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatPanelActionsDelegateImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) chatPanelActionsDelegateImpl$getTopicsFlow$1.L$1;
                    chatPanelActionsDelegateImpl = (ChatPanelActionsDelegateImpl) chatPanelActionsDelegateImpl$getTopicsFlow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return FlowKt.transformLatest((Flow) obj, new ChatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1(null, chatPanelActionsDelegateImpl, str));
            }
        }
        chatPanelActionsDelegateImpl$getTopicsFlow$1 = new ChatPanelActionsDelegateImpl$getTopicsFlow$1(this, continuation);
        Object obj2 = chatPanelActionsDelegateImpl$getTopicsFlow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatPanelActionsDelegateImpl$getTopicsFlow$1.label;
        if (i != 0) {
        }
        return FlowKt.transformLatest((Flow) obj2, new ChatPanelActionsDelegateImpl$getTopicsFlow$$inlined$flatMapLatest$1(null, chatPanelActionsDelegateImpl, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPremiumTopicsFlow(String str, Continuation<? super Flow<? extends List<ChatPremiumTopicUi>>> continuation) {
        ChatPanelActionsDelegateImpl$getPremiumTopicsFlow$1 chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1;
        int i;
        ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl;
        if (continuation instanceof ChatPanelActionsDelegateImpl$getPremiumTopicsFlow$1) {
            chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1 = (ChatPanelActionsDelegateImpl$getPremiumTopicsFlow$1) continuation;
            if ((chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.label & Integer.MIN_VALUE) != 0) {
                chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.label -= Integer.MIN_VALUE;
                Object obj = chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatPanelActionsInteractor chatPanelActionsInteractor = this.chatPanelActionsInteractor;
                    chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.L$0 = this;
                    chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.L$1 = str;
                    chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.label = 1;
                    obj = chatPanelActionsInteractor.isPremiumFeatureAvailable(str, chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatPanelActionsDelegateImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.L$1;
                    chatPanelActionsDelegateImpl = (ChatPanelActionsDelegateImpl) chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return FlowKt.transformLatest((Flow) obj, new ChatPanelActionsDelegateImpl$getPremiumTopicsFlow$$inlined$flatMapLatest$1(null, chatPanelActionsDelegateImpl, str));
            }
        }
        chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1 = new ChatPanelActionsDelegateImpl$getPremiumTopicsFlow$1(this, continuation);
        Object obj2 = chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatPanelActionsDelegateImpl$getPremiumTopicsFlow$1.label;
        if (i != 0) {
        }
        return FlowKt.transformLatest((Flow) obj2, new ChatPanelActionsDelegateImpl$getPremiumTopicsFlow$$inlined$flatMapLatest$1(null, chatPanelActionsDelegateImpl, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDiariesFlow(String str, Continuation<? super Flow<ChatDiaryUi>> continuation) {
        ChatPanelActionsDelegateImpl$getDiariesFlow$1 chatPanelActionsDelegateImpl$getDiariesFlow$1;
        int i;
        ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl;
        if (continuation instanceof ChatPanelActionsDelegateImpl$getDiariesFlow$1) {
            chatPanelActionsDelegateImpl$getDiariesFlow$1 = (ChatPanelActionsDelegateImpl$getDiariesFlow$1) continuation;
            if ((chatPanelActionsDelegateImpl$getDiariesFlow$1.label & Integer.MIN_VALUE) != 0) {
                chatPanelActionsDelegateImpl$getDiariesFlow$1.label -= Integer.MIN_VALUE;
                Object obj = chatPanelActionsDelegateImpl$getDiariesFlow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatPanelActionsDelegateImpl$getDiariesFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatPanelActionsInteractor chatPanelActionsInteractor = this.chatPanelActionsInteractor;
                    chatPanelActionsDelegateImpl$getDiariesFlow$1.L$0 = this;
                    chatPanelActionsDelegateImpl$getDiariesFlow$1.L$1 = str;
                    chatPanelActionsDelegateImpl$getDiariesFlow$1.label = 1;
                    obj = chatPanelActionsInteractor.isDiaryFeatureAvailable(str, chatPanelActionsDelegateImpl$getDiariesFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatPanelActionsDelegateImpl = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) chatPanelActionsDelegateImpl$getDiariesFlow$1.L$1;
                    chatPanelActionsDelegateImpl = (ChatPanelActionsDelegateImpl) chatPanelActionsDelegateImpl$getDiariesFlow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return FlowKt.transformLatest((Flow) obj, new ChatPanelActionsDelegateImpl$getDiariesFlow$$inlined$flatMapLatest$1(null, chatPanelActionsDelegateImpl, str));
            }
        }
        chatPanelActionsDelegateImpl$getDiariesFlow$1 = new ChatPanelActionsDelegateImpl$getDiariesFlow$1(this, continuation);
        Object obj2 = chatPanelActionsDelegateImpl$getDiariesFlow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatPanelActionsDelegateImpl$getDiariesFlow$1.label;
        if (i != 0) {
        }
        return FlowKt.transformLatest((Flow) obj2, new ChatPanelActionsDelegateImpl$getDiariesFlow$$inlined$flatMapLatest$1(null, chatPanelActionsDelegateImpl, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCallFlow(String str, Continuation<? super Flow<ChatCallUi>> continuation) {
        ChatPanelActionsDelegateImpl$getCallFlow$1 chatPanelActionsDelegateImpl$getCallFlow$1;
        int i;
        if (continuation instanceof ChatPanelActionsDelegateImpl$getCallFlow$1) {
            chatPanelActionsDelegateImpl$getCallFlow$1 = (ChatPanelActionsDelegateImpl$getCallFlow$1) continuation;
            if ((chatPanelActionsDelegateImpl$getCallFlow$1.label & Integer.MIN_VALUE) != 0) {
                chatPanelActionsDelegateImpl$getCallFlow$1.label -= Integer.MIN_VALUE;
                Object obj = chatPanelActionsDelegateImpl$getCallFlow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatPanelActionsDelegateImpl$getCallFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatCallsInteractor chatCallsInteractor = this.chatCallsInteractor;
                    chatPanelActionsDelegateImpl$getCallFlow$1.label = 1;
                    obj = chatCallsInteractor.isCallFeatureAvailable(str, chatPanelActionsDelegateImpl$getCallFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return FlowKt.mapLatest((Flow) obj, new ChatPanelActionsDelegateImpl$getCallFlow$2(null));
            }
        }
        chatPanelActionsDelegateImpl$getCallFlow$1 = new ChatPanelActionsDelegateImpl$getCallFlow$1(this, continuation);
        Object obj2 = chatPanelActionsDelegateImpl$getCallFlow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatPanelActionsDelegateImpl$getCallFlow$1.label;
        if (i != 0) {
        }
        return FlowKt.mapLatest((Flow) obj2, new ChatPanelActionsDelegateImpl$getCallFlow$2(null));
    }
}
