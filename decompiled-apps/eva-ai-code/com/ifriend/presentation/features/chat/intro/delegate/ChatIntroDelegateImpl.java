package com.ifriend.presentation.features.chat.intro.delegate;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.intro.GetChatIntroSlidesUseCase;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.chat.intro.analytics.ChatIntroAnalyticsInteractor;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroCardUiParams;
import com.ifriend.presentation.features.chat.intro.model.ChatIntroUiState;
import java.util.ArrayList;
import java.util.List;
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
/* compiled from: ChatIntroDelegate.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u001e\u001a\u00020\u0004H\u0016R\u00020\u001f¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#H\u0016R\u00020\u001f¢\u0006\u0002\u0010$J\u0011\u0010%\u001a\u00020\u0004H\u0016R\u00020\u001f¢\u0006\u0002\u0010 J0\u0010&\u001a\u00020\u0004*\u00020'2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030)H\u0097\u0001JD\u0010-\u001a\u00020.*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010/\u001a\u00020'2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030)H\u0096\u0001JD\u00101\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00030)H\u0097Aø\u0001\u0000¢\u0006\u0002\u00102J)\u00103\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u00104\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u00105JD\u00106\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u00100\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00030)H\u0096Aø\u0001\u0000¢\u0006\u0002\u00102R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\"\u0010\u001b\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/ifriend/presentation/features/chat/intro/delegate/ChatIntroDelegateImpl;", "Lcom/ifriend/presentation/features/chat/intro/delegate/ChatIntroDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroUiState;", "", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "chatsIntroSlidesUseCase", "Lcom/ifriend/domain/logic/chat/intro/GetChatIntroSlidesUseCase;", "chatIntroAnalyticsInteractor", "Lcom/ifriend/presentation/features/chat/intro/analytics/ChatIntroAnalyticsInteractor;", "(Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;Lcom/ifriend/domain/logic/chat/intro/GetChatIntroSlidesUseCase;Lcom/ifriend/presentation/features/chat/intro/analytics/ChatIntroAnalyticsInteractor;)V", "chatIntroState", "Lkotlinx/coroutines/flow/StateFlow;", "getChatIntroState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentIndex", "", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "slides", "", "Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroCardUiParams;", "uiStateFlow", "getUiStateFlow", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/chat/intro/model/ChatIntroUiState;", "closeChatIntro", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;)V", "initChatIntroDelegate", "chatId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "showNextChatIntroCard", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroDelegateImpl implements ChatIntroDelegate, UiStateDelegate<ChatIntroUiState, Unit> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<ChatIntroUiState, Unit> $$delegate_0;
    private final ChatIntroAnalyticsInteractor chatIntroAnalyticsInteractor;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final GetChatIntroSlidesUseCase chatsIntroSlidesUseCase;
    private int currentIndex;
    private final List<ChatIntroCardUiParams> slides;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super ChatIntroUiState, ? extends ChatIntroUiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<ChatIntroUiState, Unit> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super ChatIntroUiState, ? extends ChatIntroUiState> transform) {
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
    public ChatIntroUiState getUiState(UiStateDelegate<ChatIntroUiState, Unit> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<ChatIntroUiState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<ChatIntroUiState, Unit> uiStateDelegate, Function1<? super ChatIntroUiState, ? extends ChatIntroUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<ChatIntroUiState, Unit> uiStateDelegate, Unit unit, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, unit, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<ChatIntroUiState, Unit> uiStateDelegate, Function1<? super ChatIntroUiState, ? extends ChatIntroUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Inject
    public ChatIntroDelegateImpl(ChatsConfigurationInteractor chatsConfigurationInteractor, GetChatIntroSlidesUseCase chatsIntroSlidesUseCase, ChatIntroAnalyticsInteractor chatIntroAnalyticsInteractor) {
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        Intrinsics.checkNotNullParameter(chatsIntroSlidesUseCase, "chatsIntroSlidesUseCase");
        Intrinsics.checkNotNullParameter(chatIntroAnalyticsInteractor, "chatIntroAnalyticsInteractor");
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
        this.chatsIntroSlidesUseCase = chatsIntroSlidesUseCase;
        this.chatIntroAnalyticsInteractor = chatIntroAnalyticsInteractor;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new ChatIntroUiState(false, null, null, null, null, null, 63, null), 0, null, 6, null);
        this.slides = new ArrayList();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<ChatIntroUiState, Unit> uiStateDelegate, Unit unit, Continuation continuation) {
        return sendEvent2(uiStateDelegate, unit, (Continuation<? super Unit>) continuation);
    }

    @Override // com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegate
    public StateFlow<ChatIntroUiState> getChatIntroState() {
        return getUiStateFlow();
    }

    @Override // com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegate
    public void initChatIntroDelegate(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatIntroDelegateImpl$initChatIntroDelegate$1(this, chatId, null), 3, null);
    }

    @Override // com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegate
    public void showNextChatIntroCard(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatIntroDelegateImpl$showNextChatIntroCard$1(this, null), 3, null);
    }

    @Override // com.ifriend.presentation.features.chat.intro.delegate.ChatIntroDelegate
    public void closeChatIntro(ViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatIntroDelegateImpl$closeChatIntro$1(this, null), 3, null);
    }
}
