package com.ifriend.presentation.features.chat.input.delegate;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.common_utils.extensions.CoroutinesKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.services.audio.recording.AudioRecorderController;
import com.ifriend.domain.services.audio.recording.AudioRecorderState;
import com.ifriend.domain.services.audio.recording.AudioRecordingStateProvider;
import com.ifriend.keychain.KeychainModule;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.chat.input.analytics.VoiceRecordingAnalytics;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatInputDelegate.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 I2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001IBV\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0015\u0010\u000f\u001a\u0011\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0010j\u0002`\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\u0019\u0010*\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u001aH\u0016R\u00020+¢\u0006\u0002\u0010-J\u0011\u0010.\u001a\u00020\u0004H\u0016R\u00020+¢\u0006\u0002\u0010/J\u0011\u00100\u001a\u00020\u0004H\u0016R\u00020+¢\u0006\u0002\u0010/J\u0019\u00101\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u00020+¢\u0006\u0002\u0010-J\u0019\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u000204H\u0002R\u00020+¢\u0006\u0002\u00105J\u0011\u00106\u001a\u00020\u0004H\u0016R\u00020+¢\u0006\u0002\u0010/J\u0011\u00107\u001a\u00020\u0004H\u0016R\u00020+¢\u0006\u0002\u0010/J\u0019\u00108\u001a\u00020\u00042\u0006\u00103\u001a\u000204H\u0016R\u00020+¢\u0006\u0002\u00105J0\u00109\u001a\u00020\u0004*\u00020:2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00030<H\u0097\u0001JD\u0010@\u001a\u00020 *\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010A\u001a\u00020:2!\u0010B\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00030<H\u0096\u0001JD\u0010C\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b(?\u0012\u0004\u0012\u00020\u00030<H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010DJ)\u0010E\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010F\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010GJD\u0010H\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010B\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b=\u0012\b\b>\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00030<H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010DR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0011\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u00120\u0010j\u0002`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010'\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"Lcom/ifriend/presentation/features/chat/input/delegate/ChatInputDelegateImpl;", "Lcom/ifriend/presentation/features/chat/input/delegate/ChatInputDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;", "", "resources", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "recorderController", "Lcom/ifriend/domain/services/audio/recording/AudioRecorderController;", "recorderStateProvider", "Lcom/ifriend/domain/services/audio/recording/AudioRecordingStateProvider;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "voiceRecordingAnalytics", "Lcom/ifriend/presentation/features/chat/input/analytics/VoiceRecordingAnalytics;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/services/audio/recording/AudioRecorderController;Lcom/ifriend/domain/services/audio/recording/AudioRecordingStateProvider;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/presentation/features/chat/input/analytics/VoiceRecordingAnalytics;)V", "chatId", "", "chatInputState", "Lkotlinx/coroutines/flow/StateFlow;", "getChatInputState", "()Lkotlinx/coroutines/flow/StateFlow;", "sendJob", "Lkotlinx/coroutines/Job;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "getUiStateFlow", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;", "changeInputMessage", "Landroidx/lifecycle/ViewModel;", "new", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "clearChatInputDelegate", "(Landroidx/lifecycle/ViewModel;)V", "clearInputMessage", "initChatInputDelegate", "internalStopRecording", KeychainModule.AuthPromptOptions.CANCEL, "", "(Landroidx/lifecycle/ViewModel;Z)V", "sendInputMessage", "startAudioRecording", "stopRecordAudio", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputDelegateImpl implements ChatInputDelegate, UiStateDelegate<ChatInputState, Unit> {
    private static final int MAX_TEXT_MESSAGE_LENGTH = 140;
    private static final long MIN_AUDIO_DURATION;
    private final /* synthetic */ UiStateDelegateImpl<ChatInputState, Unit> $$delegate_0;
    private final ChatClientInteractor chatClientInteractor;
    private String chatId;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DispatcherProvider dispatchers;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final AudioRecorderController recorderController;
    private final AudioRecordingStateProvider recorderStateProvider;
    private final ResourceProvider resources;
    private Job sendJob;
    private final VoiceRecordingAnalytics voiceRecordingAnalytics;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super ChatInputState, ? extends ChatInputState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<ChatInputState, Unit> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super ChatInputState, ? extends ChatInputState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Unit> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public ChatInputState getUiState(UiStateDelegate<ChatInputState, Unit> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<ChatInputState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<ChatInputState, Unit> uiStateDelegate, Function1<? super ChatInputState, ? extends ChatInputState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<ChatInputState, Unit> uiStateDelegate, Unit unit, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, unit, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<ChatInputState, Unit> uiStateDelegate, Function1<? super ChatInputState, ? extends ChatInputState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Inject
    public ChatInputDelegateImpl(ResourceProvider resources, ChatsInfoInteractor chatsInfoInteractor, AudioRecorderController recorderController, AudioRecordingStateProvider recorderStateProvider, DispatcherProvider dispatchers, FlowObserverEmitter<Throwable> exceptionsEmitter, ChatClientInteractor chatClientInteractor, VoiceRecordingAnalytics voiceRecordingAnalytics) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(recorderController, "recorderController");
        Intrinsics.checkNotNullParameter(recorderStateProvider, "recorderStateProvider");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(voiceRecordingAnalytics, "voiceRecordingAnalytics");
        this.resources = resources;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.recorderController = recorderController;
        this.recorderStateProvider = recorderStateProvider;
        this.dispatchers = dispatchers;
        this.exceptionsEmitter = exceptionsEmitter;
        this.chatClientInteractor = chatClientInteractor;
        this.voiceRecordingAnalytics = voiceRecordingAnalytics;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new ChatInputState(null, null, false, false, null, 0.0f, 63, null), 0, null, 6, null);
        this.chatId = "";
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<ChatInputState, Unit> uiStateDelegate, Unit unit, Continuation continuation) {
        return sendEvent2(uiStateDelegate, unit, (Continuation<? super Unit>) continuation);
    }

    /* compiled from: ChatInputDelegate.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Lcom/ifriend/presentation/features/chat/input/delegate/ChatInputDelegateImpl$Companion;", "", "()V", "MAX_TEXT_MESSAGE_LENGTH", "", "MIN_AUDIO_DURATION", "Lkotlin/time/Duration;", "J", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        MIN_AUDIO_DURATION = DurationKt.toDuration(1, DurationUnit.SECONDS);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public StateFlow<ChatInputState> getChatInputState() {
        return getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void initChatInputDelegate(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.chatId = chatId;
        BuildersKt.launch(ViewModelKt.getViewModelScope(context_receiver_0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatInputDelegateImpl$initChatInputDelegate$$inlined$collectIn$default$1(this.chatsInfoInteractor.getChatsInfoFlow(chatId), null, this));
        BuildersKt.launch(ViewModelKt.getViewModelScope(context_receiver_0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatInputDelegateImpl$initChatInputDelegate$$inlined$collectIn$default$2(this.recorderStateProvider.stateFlow(), null, this));
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void changeInputMessage(ViewModel context_receiver_0, String str) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(str, "new");
        if (getUiState((UiStateDelegate<ChatInputState, Unit>) this).isRecording()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatInputDelegateImpl$changeInputMessage$1(this, str, null), 3, null);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void sendInputMessage(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        ChatInputDelegateImpl chatInputDelegateImpl = this;
        if (getUiState((UiStateDelegate<ChatInputState, Unit>) chatInputDelegateImpl).isAudioReadyToSend()) {
            internalStopRecording(context_receiver_0, false);
            return;
        }
        String message = getUiState((UiStateDelegate<ChatInputState, Unit>) chatInputDelegateImpl).getMessage();
        if (CoroutinesKt.isActive(this.sendJob) || StringsKt.isBlank(message) || getUiState((UiStateDelegate<ChatInputState, Unit>) chatInputDelegateImpl).isRecording()) {
            return;
        }
        clearInputMessage(context_receiver_0);
        this.sendJob = com.ifriend.core.utils.CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new ChatInputDelegateImpl$sendInputMessage$1(this.exceptionsEmitter), null, new ChatInputDelegateImpl$sendInputMessage$2(this, message, null), 2, null);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void clearInputMessage(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        if (!getUiState((UiStateDelegate<ChatInputState, Unit>) this).isAudioReadyToSend()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatInputDelegateImpl$clearInputMessage$1(this, null), 3, null);
            return;
        }
        internalStopRecording(context_receiver_0, true);
        this.voiceRecordingAnalytics.trackUserDeleteRecording(this.chatId);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void startAudioRecording(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        if (this.recorderStateProvider.current() instanceof AudioRecorderState.Recording) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), this.dispatchers.background(), null, new ChatInputDelegateImpl$startAudioRecording$2(this, null), 2, null);
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void stopRecordAudio(ViewModel context_receiver_0, boolean z) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        if (getUiState((UiStateDelegate<ChatInputState, Unit>) this).isRecording()) {
            internalStopRecording(context_receiver_0, z);
            if (z) {
                this.voiceRecordingAnalytics.trackUserCancelRecording(this.chatId);
            }
        }
    }

    private final void internalStopRecording(ViewModel viewModel, boolean z) {
        com.ifriend.core.utils.CoroutinesKt.safeLaunch(ViewModelKt.getViewModelScope(viewModel), new ChatInputDelegateImpl$internalStopRecording$1(this.exceptionsEmitter), this.dispatchers.background(), new ChatInputDelegateImpl$internalStopRecording$2(z, this, viewModel, null));
    }

    @Override // com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegate
    public void clearChatInputDelegate(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        com.ifriend.core.utils.CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatInputDelegateImpl$clearChatInputDelegate$1(this, null), 3, null);
    }
}
