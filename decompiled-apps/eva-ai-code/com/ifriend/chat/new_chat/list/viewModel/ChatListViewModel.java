package com.ifriend.chat.new_chat.list.viewModel;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.list.delegate.OnAudioMessageClickDelegate;
import com.ifriend.chat.new_chat.list.delegate.PresentationChatSystemsDelegate;
import com.ifriend.chat.new_chat.list.mapper.ChatEntityToUiModelMapper;
import com.ifriend.chat.new_chat.list.presentationSystems.scroll.ScrollBottomComponent;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.ChatPhotoMessageUi;
import com.ifriend.chat.new_chat.list.ui.model.RegenerateMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TagHolder;
import com.ifriend.chat.new_chat.list.viewModel.analytics.ChatListAnalytics;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.models.profile.user.Subscription;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.newChat.chat.models.MessageIds;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegate;
import com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegateImpl;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatListViewModel.kt */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u00062\u00020\u0007:\u0001eB|\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0015\u0010\u0014\u001a\u0011\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\u00170\u0015j\u0002`\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$¢\u0006\u0002\u0010%J\b\u00101\u001a\u000202H\u0002J\u0019\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040'H\u0082@ø\u0001\u0000¢\u0006\u0002\u00105J\u0016\u00106\u001a\u0002022\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0002J\u001a\u0010:\u001a\u0002022\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u00020\u0001¢\u0006\u0002\u0010;J\u0010\u0010<\u001a\u0002022\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u0002022\u0006\u0010=\u001a\u00020>H\u0016J\u0006\u0010@\u001a\u000202J\u0010\u0010A\u001a\u0002022\u0006\u0010=\u001a\u00020>H\u0016J\u000e\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020DJ\b\u0010E\u001a\u000202H\u0016J\u0010\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020\tH\u0016J\u0010\u0010H\u001a\u0002022\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u0002022\u0006\u0010=\u001a\u00020LH\u0016J\u0010\u0010M\u001a\u0002022\u0006\u0010=\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u0002022\u0006\u0010I\u001a\u00020JH\u0016J\u0006\u0010P\u001a\u000202J\"\u0010Q\u001a\u0002022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010G\u001a\u00020\tH\u0096\u0001R\u00020\u0001¢\u0006\u0002\u0010RJ\u0006\u0010S\u001a\u000202J0\u0010T\u001a\u000202*\u00020U2!\u0010V\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020\u00040WH\u0097\u0001JD\u0010[\u001a\u00020\\*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010]\u001a\u00020U2!\u0010^\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020\u00040WH\u0096\u0001JD\u0010_\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010V\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020\u00040WH\u0097Aø\u0001\u0000¢\u0006\u0002\u0010`J)\u0010a\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010b\u001a\u00020\u0005H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010cJD\u0010d\u001a\u000202*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032!\u0010^\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bX\u0012\b\bY\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00040WH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010`R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0011\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\u00170\u0015j\u0002`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050'X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040+X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006f"}, d2 = {"Lcom/ifriend/chat/new_chat/list/viewModel/ChatListViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/chat/new_chat/list/viewModel/ChatListViewModel$UiState;", "", "Lcom/ifriend/presentation/features/chat/regeneration/MessageRegenerationDelegate;", "Lcom/ifriend/chat/new_chat/list/viewModel/ListItemsClick;", "chatId", "", "audioMessagesDelegate", "Lcom/ifriend/chat/new_chat/list/delegate/OnAudioMessageClickDelegate;", "chatSystemsDelegate", "Lcom/ifriend/chat/new_chat/list/delegate/PresentationChatSystemsDelegate;", "mapper", "Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToUiModelMapper;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "chatEventsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "Lcom/ifriend/presentation/features/chat/common/ChatEvents;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/features/chat/common/ChatEventsEmitter;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "featureToggleRepository", "Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;", "messageRegenerationDelegate", "Lcom/ifriend/presentation/features/chat/regeneration/MessageRegenerationDelegateImpl;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "chatListAnalytics", "Lcom/ifriend/chat/new_chat/list/viewModel/analytics/ChatListAnalytics;", "(Ljava/lang/String;Lcom/ifriend/chat/new_chat/list/delegate/OnAudioMessageClickDelegate;Lcom/ifriend/chat/new_chat/list/delegate/PresentationChatSystemsDelegate;Lcom/ifriend/chat/new_chat/list/mapper/ChatEntityToUiModelMapper;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;Lcom/ifriend/presentation/features/chat/regeneration/MessageRegenerationDelegateImpl;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/chat/new_chat/list/viewModel/analytics/ChatListAnalytics;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/chat/new_chat/list/viewModel/ChatListViewModel$UiState;", "collectChatState", "", "getUserSubscription", "Lcom/ifriend/domain/models/profile/user/Subscription;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleEvents", "consumableComponents", "", "Lcom/ifriend/common_entities_engine/Component;", "initRegenerationMessage", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "onAudioClick", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUiModel;", "onAudioDecodeClick", "onBackPressed", "onChangeVoiceClick", "onItemShown", "item", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "onLoadMoreClick", "onPaidTextMessageClick", "messageId", "onPause", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onPhotoClick", "Lcom/ifriend/chat/new_chat/list/ui/model/ChatPhotoMessageUi;", "onRegenerateMessageClick", "Lcom/ifriend/chat/new_chat/list/ui/model/RegenerateMessageUiModel;", "onResume", "refresh", "regenerateMessage", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;Ljava/lang/String;)V", "showKeyboard", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "UiState", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatListViewModel extends ViewModel implements DefaultLifecycleObserver, UiStateDelegate<UiState, Object>, MessageRegenerationDelegate, ListItemsClick {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Object> $$delegate_0;
    private final OnAudioMessageClickDelegate audioMessagesDelegate;
    private final ChatClientInteractor chatClientInteractor;
    private final FlowObserverEmitter<ChatEvents> chatEventsEmitter;
    private final String chatId;
    private final ChatListAnalytics chatListAnalytics;
    private final PresentationChatSystemsDelegate chatSystemsDelegate;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DispatcherProvider dispatcherProvider;
    private final FeatureToggleRepository featureToggleRepository;
    private final GetBotUseCase getBotUseCase;
    private final GetUserUseCase getUserUseCase;
    private final ChatEntityToUiModelMapper mapper;
    private final MessageRegenerationDelegateImpl messageRegenerationDelegate;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Object> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
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
    public UiState getUiState(UiStateDelegate<UiState, Object> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegate
    public void initRegenerationMessage(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.messageRegenerationDelegate.initRegenerationMessage(context_receiver_0, chatId);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Object> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.features.chat.regeneration.MessageRegenerationDelegate
    public void regenerateMessage(ViewModel context_receiver_0, String chatId, String messageId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageRegenerationDelegate.regenerateMessage(context_receiver_0, chatId, messageId);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object sendEvent(UiStateDelegate<UiState, Object> uiStateDelegate, Object obj, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, obj, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Object> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    public ChatListViewModel(String chatId, OnAudioMessageClickDelegate audioMessagesDelegate, PresentationChatSystemsDelegate chatSystemsDelegate, ChatEntityToUiModelMapper mapper, ChatClientInteractor chatClientInteractor, GetBotUseCase getBotUseCase, FlowObserverEmitter<ChatEvents> chatEventsEmitter, ChatsInfoInteractor chatsInfoInteractor, FeatureToggleRepository featureToggleRepository, MessageRegenerationDelegateImpl messageRegenerationDelegate, DispatcherProvider dispatcherProvider, GetUserUseCase getUserUseCase, ChatListAnalytics chatListAnalytics) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(audioMessagesDelegate, "audioMessagesDelegate");
        Intrinsics.checkNotNullParameter(chatSystemsDelegate, "chatSystemsDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        Intrinsics.checkNotNullParameter(chatEventsEmitter, "chatEventsEmitter");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(featureToggleRepository, "featureToggleRepository");
        Intrinsics.checkNotNullParameter(messageRegenerationDelegate, "messageRegenerationDelegate");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(chatListAnalytics, "chatListAnalytics");
        this.chatId = chatId;
        this.audioMessagesDelegate = audioMessagesDelegate;
        this.chatSystemsDelegate = chatSystemsDelegate;
        this.mapper = mapper;
        this.chatClientInteractor = chatClientInteractor;
        this.getBotUseCase = getBotUseCase;
        this.chatEventsEmitter = chatEventsEmitter;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.featureToggleRepository = featureToggleRepository;
        this.messageRegenerationDelegate = messageRegenerationDelegate;
        this.dispatcherProvider = dispatcherProvider;
        this.getUserUseCase = getUserUseCase;
        this.chatListAnalytics = chatListAnalytics;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new UiState(null, 1, null), 0, null, 6, null);
        initRegenerationMessage(this, chatId);
        collectChatState();
    }

    /* compiled from: ChatListViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ifriend/chat/new_chat/list/viewModel/ChatListViewModel$UiState;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 8;
        private final List<TagHolder> items;

        public UiState() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = uiState.items;
            }
            return uiState.copy(list);
        }

        public final List<TagHolder> component1() {
            return this.items;
        }

        public final UiState copy(List<? extends TagHolder> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new UiState(items);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UiState) && Intrinsics.areEqual(this.items, ((UiState) obj).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            List<TagHolder> list = this.items;
            return "UiState(items=" + list + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UiState(List<? extends TagHolder> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        public /* synthetic */ UiState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<TagHolder> getItems() {
            return this.items;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$onPause$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$onResume$1(this, null), 3, null);
    }

    public final void refresh() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcherProvider.background(), null, new ChatListViewModel$refresh$1(this, null), 2, null);
    }

    private final void collectChatState() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$collectChatState$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUserSubscription(Continuation<? super Flow<? extends Subscription>> continuation) {
        ChatListViewModel$getUserSubscription$1 chatListViewModel$getUserSubscription$1;
        int i;
        if (continuation instanceof ChatListViewModel$getUserSubscription$1) {
            chatListViewModel$getUserSubscription$1 = (ChatListViewModel$getUserSubscription$1) continuation;
            if ((chatListViewModel$getUserSubscription$1.label & Integer.MIN_VALUE) != 0) {
                chatListViewModel$getUserSubscription$1.label -= Integer.MIN_VALUE;
                Object obj = chatListViewModel$getUserSubscription$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatListViewModel$getUserSubscription$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    GetUserUseCase getUserUseCase = this.getUserUseCase;
                    chatListViewModel$getUserSubscription$1.label = 1;
                    obj = getUserUseCase.flow(chatListViewModel$getUserSubscription$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                final Flow flow = (Flow) obj;
                return FlowKt.distinctUntilChanged(new Flow<Subscription>() { // from class: com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$getUserSubscription$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Subscription> flowCollector, Continuation continuation2) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$getUserSubscription$$inlined$map$1$2  reason: invalid class name */
                    /* loaded from: classes6.dex */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$getUserSubscription$$inlined$map$1$2", f = "ChatListViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        /* renamed from: com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$getUserSubscription$$inlined$map$1$2$1  reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                        User user = (User) obj;
                                        Subscription subscription = user != null ? user.getSubscription() : null;
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(subscription, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    } else {
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                });
            }
        }
        chatListViewModel$getUserSubscription$1 = new ChatListViewModel$getUserSubscription$1(this, continuation);
        Object obj2 = chatListViewModel$getUserSubscription$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatListViewModel$getUserSubscription$1.label;
        if (i != 0) {
        }
        final Flow flow2 = (Flow) obj2;
        return FlowKt.distinctUntilChanged(new Flow<Subscription>() { // from class: com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$getUserSubscription$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Subscription> flowCollector, Continuation continuation2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$getUserSubscription$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$getUserSubscription$$inlined$map$1$2", f = "ChatListViewModel.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.ifriend.chat.new_chat.list.viewModel.ChatListViewModel$getUserSubscription$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj22);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                User user = (User) obj;
                                Subscription subscription = user != null ? user.getSubscription() : null;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(subscription, anonymousClass1) == coroutine_suspended2) {
                                    return coroutine_suspended2;
                                }
                            } else if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            } else {
                                ResultKt.throwOnFailure(obj22);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj222 = anonymousClass1.result;
                    Object coroutine_suspended22 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    @Override // com.ifriend.chat.new_chat.list.viewModel.ListItemsClick
    public void onPaidTextMessageClick(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$onPaidTextMessageClick$1(this, messageId, null), 3, null);
    }

    @Override // com.ifriend.chat.new_chat.list.viewModel.ListItemsClick
    public void onPhotoClick(ChatPhotoMessageUi model) {
        Intrinsics.checkNotNullParameter(model, "model");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$onPhotoClick$1(this, model, null), 3, null);
    }

    @Override // com.ifriend.chat.new_chat.list.viewModel.RegenerationMessageItemClick
    public void onRegenerateMessageClick(RegenerateMessageUiModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.chatListAnalytics.trackRegenerationButtonClick();
        Object payload = model.getPayload();
        MessageIds messageIds = payload instanceof MessageIds ? (MessageIds) payload : null;
        if (messageIds == null) {
            return;
        }
        regenerateMessage(this, this.chatId, messageIds.getMessageId());
    }

    @Override // com.ifriend.chat.new_chat.list.viewModel.LoadMoreItemClick
    public void onLoadMoreClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcherProvider.background(), null, new ChatListViewModel$onLoadMoreClick$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvents(List<? extends Component> list) {
        for (Component component : list) {
            if (component instanceof ScrollBottomComponent) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$handleEvents$1$1(this, component, null), 3, null);
            }
        }
    }

    public final void onItemShown(TagHolder item) {
        Intrinsics.checkNotNullParameter(item, "item");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcherProvider.background(), null, new ChatListViewModel$onItemShown$1(this, item, null), 2, null);
    }

    @Override // com.ifriend.chat.new_chat.list.viewModel.AudioItemClick
    public void onAudioDecodeClick(AudioMessageUiModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$onAudioDecodeClick$1(this, model, null), 3, null);
    }

    @Override // com.ifriend.chat.new_chat.list.viewModel.AudioItemClick
    public void onAudioClick(AudioMessageUiModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$onAudioClick$1(this, model, null), 3, null);
    }

    @Override // com.ifriend.chat.new_chat.list.viewModel.AudioItemClick
    public void onChangeVoiceClick(AudioMessageUiModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$onChangeVoiceClick$1(this, null), 3, null);
    }

    public final void onBackPressed() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$onBackPressed$1(this, null), 3, null);
    }

    public final void showKeyboard() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ChatListViewModel$showKeyboard$1(this, null), 3, null);
    }
}
