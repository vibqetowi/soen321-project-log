package com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatPaymentStatus;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.navigation.destination.ChatSubscriptionDestination;
import com.ifriend.ui.components.ext.StringKt;
import com.ifriend.ui.theme.AppColors;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatFlowSubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002./B4\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0015\u0010\t\u001a\u0011\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nj\u0002`\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J0\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030 H\u0097\u0001JD\u0010$\u001a\u00020%*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010&\u001a\u00020\u001e2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030 H\u0096\u0001JD\u0010(\u001a\u00020\u001d*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030 H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010)J)\u0010*\u001a\u00020\u001d*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010+\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010,JD\u0010-\u001a\u00020\u001d*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00030 H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010)R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0011\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\nj\u0002`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$UiState;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$Event;", "chatId", "", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$UiState;", "asyncReduce", "", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "Event", "UiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatFlowSubscriptionViewModel extends ViewModel implements UiStateDelegate<UiState, Event> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_0;
    private final String chatId;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;

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

    public ChatFlowSubscriptionViewModel(String chatId, ChatsInfoInteractor chatsInfoInteractor, FlowObserverEmitter<Throwable> exceptionsEmitter, ChatsConfigurationInteractor chatsConfigurationInteractor) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        this.chatId = chatId;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.exceptionsEmitter = exceptionsEmitter;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new UiState(null, null, 0L, 7, null), 0, null, 6, null);
        ChatFlowSubscriptionViewModel chatFlowSubscriptionViewModel = this;
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatFlowSubscriptionViewModel), new AnonymousClass1(null), null, new AnonymousClass2(null), 2, null);
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatFlowSubscriptionViewModel), null, null, new AnonymousClass3(null), 3, null);
    }

    /* compiled from: ChatFlowSubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B(\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0012\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\nJ6\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$UiState;", "", "startDestination", "Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination;", "screenBackgroundUrl", "", "gradientColor", "Landroidx/compose/ui/graphics/Color;", "(Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGradientColor-0d7_KjU", "()J", "J", "getScreenBackgroundUrl", "()Ljava/lang/String;", "getStartDestination", "()Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination;", "component1", "component2", "component3", "component3-0d7_KjU", "copy", "copy-mxwnekA", "(Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination;Ljava/lang/String;J)Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$UiState;", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UiState {
        public static final int $stable = 0;
        private final long gradientColor;
        private final String screenBackgroundUrl;
        private final ChatSubscriptionDestination startDestination;

        public /* synthetic */ UiState(ChatSubscriptionDestination chatSubscriptionDestination, String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(chatSubscriptionDestination, str, j);
        }

        /* renamed from: copy-mxwnekA$default  reason: not valid java name */
        public static /* synthetic */ UiState m6963copymxwnekA$default(UiState uiState, ChatSubscriptionDestination chatSubscriptionDestination, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                chatSubscriptionDestination = uiState.startDestination;
            }
            if ((i & 2) != 0) {
                str = uiState.screenBackgroundUrl;
            }
            if ((i & 4) != 0) {
                j = uiState.gradientColor;
            }
            return uiState.m6965copymxwnekA(chatSubscriptionDestination, str, j);
        }

        public final ChatSubscriptionDestination component1() {
            return this.startDestination;
        }

        public final String component2() {
            return this.screenBackgroundUrl;
        }

        /* renamed from: component3-0d7_KjU  reason: not valid java name */
        public final long m6964component30d7_KjU() {
            return this.gradientColor;
        }

        /* renamed from: copy-mxwnekA  reason: not valid java name */
        public final UiState m6965copymxwnekA(ChatSubscriptionDestination chatSubscriptionDestination, String screenBackgroundUrl, long j) {
            Intrinsics.checkNotNullParameter(screenBackgroundUrl, "screenBackgroundUrl");
            return new UiState(chatSubscriptionDestination, screenBackgroundUrl, j, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UiState) {
                UiState uiState = (UiState) obj;
                return Intrinsics.areEqual(this.startDestination, uiState.startDestination) && Intrinsics.areEqual(this.screenBackgroundUrl, uiState.screenBackgroundUrl) && Color.m3292equalsimpl0(this.gradientColor, uiState.gradientColor);
            }
            return false;
        }

        public int hashCode() {
            ChatSubscriptionDestination chatSubscriptionDestination = this.startDestination;
            return ((((chatSubscriptionDestination == null ? 0 : chatSubscriptionDestination.hashCode()) * 31) + this.screenBackgroundUrl.hashCode()) * 31) + Color.m3298hashCodeimpl(this.gradientColor);
        }

        public String toString() {
            ChatSubscriptionDestination chatSubscriptionDestination = this.startDestination;
            String str = this.screenBackgroundUrl;
            String m3299toStringimpl = Color.m3299toStringimpl(this.gradientColor);
            return "UiState(startDestination=" + chatSubscriptionDestination + ", screenBackgroundUrl=" + str + ", gradientColor=" + m3299toStringimpl + ")";
        }

        private UiState(ChatSubscriptionDestination chatSubscriptionDestination, String screenBackgroundUrl, long j) {
            Intrinsics.checkNotNullParameter(screenBackgroundUrl, "screenBackgroundUrl");
            this.startDestination = chatSubscriptionDestination;
            this.screenBackgroundUrl = screenBackgroundUrl;
            this.gradientColor = j;
        }

        public final ChatSubscriptionDestination getStartDestination() {
            return this.startDestination;
        }

        public final String getScreenBackgroundUrl() {
            return this.screenBackgroundUrl;
        }

        public /* synthetic */ UiState(ChatSubscriptionDestination chatSubscriptionDestination, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : chatSubscriptionDestination, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j, null);
        }

        /* renamed from: getGradientColor-0d7_KjU  reason: not valid java name */
        public final long m6966getGradientColor0d7_KjU() {
            return this.gradientColor;
        }
    }

    /* compiled from: ChatFlowSubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$Event;", "", "CloseFeature", "Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$Event$CloseFeature;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Event {

        /* compiled from: ChatFlowSubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$Event$CloseFeature;", "Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$Event;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class CloseFeature implements Event {
            public static final int $stable = 0;
            public static final CloseFeature INSTANCE = new CloseFeature();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof CloseFeature) {
                    CloseFeature closeFeature = (CloseFeature) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -538042499;
            }

            public String toString() {
                return "CloseFeature";
            }

            private CloseFeature() {
            }
        }
    }

    /* compiled from: ChatFlowSubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$1", f = "ChatFlowSubscriptionViewModel.kt", i = {}, l = {41, 42}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowObserverEmitter flowObserverEmitter = ChatFlowSubscriptionViewModel.this.exceptionsEmitter;
                this.label = 1;
                if (flowObserverEmitter.emit((Throwable) this.L$0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            UiStateDelegate<UiState, Event> uiStateDelegate = ChatFlowSubscriptionViewModel.this;
            this.label = 2;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (Event) Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ChatFlowSubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$2", f = "ChatFlowSubscriptionViewModel.kt", i = {}, l = {44, 48, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG, 65}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChatSubscriptionDestination.Subscription subscription;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ChatFlowSubscriptionViewModel.this.chatsInfoInteractor.getChatInfo(ChatFlowSubscriptionViewModel.this.chatId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            ChatPaymentStatus paymentStatus = ((ChatInfo) obj).getPaymentStatus();
            if (Intrinsics.areEqual(paymentStatus, ChatPaymentStatus.Purchase.INSTANCE) ? true : Intrinsics.areEqual(paymentStatus, ChatPaymentStatus.Free.INSTANCE) ? true : Intrinsics.areEqual(paymentStatus, ChatPaymentStatus.Paid.INSTANCE)) {
                UiStateDelegate<UiState, Event> uiStateDelegate = ChatFlowSubscriptionViewModel.this;
                this.label = 2;
                if (uiStateDelegate.sendEvent2(uiStateDelegate, (Event) Event.CloseFeature.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (paymentStatus instanceof ChatPaymentStatus.TrialPeriod) {
                UiStateDelegate<UiState, Event> uiStateDelegate2 = ChatFlowSubscriptionViewModel.this;
                this.label = 3;
                if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (paymentStatus instanceof ChatPaymentStatus.Subscription) {
                if (((ChatPaymentStatus.Subscription) paymentStatus).getHasSubscription()) {
                    subscription = ChatSubscriptionDestination.ActiveSubscription.INSTANCE;
                } else {
                    subscription = ChatSubscriptionDestination.Subscription.INSTANCE;
                }
                UiStateDelegate<UiState, Event> uiStateDelegate3 = ChatFlowSubscriptionViewModel.this;
                this.label = 4;
                if (uiStateDelegate3.updateUiState(uiStateDelegate3, new C01812(subscription), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatFlowSubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<UiState, UiState> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final UiState invoke(UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return UiState.m6963copymxwnekA$default(state, ChatSubscriptionDestination.Subscription.INSTANCE, null, 0L, 6, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatFlowSubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$2$2  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01812 extends Lambda implements Function1<UiState, UiState> {
            final /* synthetic */ ChatSubscriptionDestination $startDestination;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01812(ChatSubscriptionDestination chatSubscriptionDestination) {
                super(1);
                this.$startDestination = chatSubscriptionDestination;
            }

            @Override // kotlin.jvm.functions.Function1
            public final UiState invoke(UiState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return UiState.m6963copymxwnekA$default(state, this.$startDestination, null, 0L, 6, null);
            }
        }
    }

    /* compiled from: ChatFlowSubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$3", f = "ChatFlowSubscriptionViewModel.kt", i = {}, l = {TsExtractor.TS_SYNC_BYTE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = ChatFlowSubscriptionViewModel.this.chatsConfigurationInteractor.getChatConfigurationFlow(ChatFlowSubscriptionViewModel.this.chatId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            FlowKt.launchIn(FlowKt.onEach((Flow) obj, new AnonymousClass1(ChatFlowSubscriptionViewModel.this, null)), ViewModelKt.getViewModelScope(ChatFlowSubscriptionViewModel.this));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatFlowSubscriptionViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "chat", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$3$1", f = "ChatFlowSubscriptionViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$3$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ChatsConfiguration, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ChatFlowSubscriptionViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ChatFlowSubscriptionViewModel chatFlowSubscriptionViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = chatFlowSubscriptionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ChatsConfiguration chatsConfiguration, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(chatsConfiguration, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ChatConfig.SubscriptionInfo.Style style;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatsConfiguration chatsConfiguration = (ChatsConfiguration) this.L$0;
                    ChatConfig chatConfig = chatsConfiguration.getChatConfig();
                    ChatConfig chatConfig2 = chatsConfiguration.getChatConfig();
                    String str = null;
                    ChatConfig.SubscriptionInfo subscriptionInfo = chatConfig2 != null ? chatConfig2.getSubscriptionInfo() : null;
                    if (subscriptionInfo != null && (style = subscriptionInfo.getStyle()) != null) {
                        str = style.getHexBackgroundGradient();
                    }
                    if (str == null) {
                        str = "";
                    }
                    long m7040hexToColorSafe4WTKRHQ = StringKt.m7040hexToColorSafe4WTKRHQ(str, AppColors.Companion.m7133getAppVioletGradient0d7_KjU());
                    UiStateDelegate<UiState, Event> uiStateDelegate = this.this$0;
                    this.label = 1;
                    if (uiStateDelegate.updateUiState(uiStateDelegate, new C01821(chatConfig, m7040hexToColorSafe4WTKRHQ), this) == coroutine_suspended) {
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
            /* compiled from: ChatFlowSubscriptionViewModel.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/flow/viewmodel/ChatFlowSubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModel$3$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01821 extends Lambda implements Function1<UiState, UiState> {
                final /* synthetic */ ChatConfig $chatConfig;
                final /* synthetic */ long $gradientColor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01821(ChatConfig chatConfig, long j) {
                    super(1);
                    this.$chatConfig = chatConfig;
                    this.$gradientColor = j;
                }

                @Override // kotlin.jvm.functions.Function1
                public final UiState invoke(UiState state) {
                    ChatConfig.Images images;
                    Intrinsics.checkNotNullParameter(state, "state");
                    ChatConfig chatConfig = this.$chatConfig;
                    String subscriptionBackgroundUrl = (chatConfig == null || (images = chatConfig.getImages()) == null) ? null : images.getSubscriptionBackgroundUrl();
                    if (subscriptionBackgroundUrl == null) {
                        subscriptionBackgroundUrl = "";
                    }
                    return UiState.m6963copymxwnekA$default(state, null, subscriptionBackgroundUrl, this.$gradientColor, 1, null);
                }
            }
        }
    }
}
