package com.ifriend.presentation.features.profile.header.delegate;

import android.content.res.Resources;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.useCases.bot.BotHaveUpdateUseCase;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl;
import com.ifriend.presentation.features.profile.header.mappers.ChatAvatarMapper;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatHeaderDelegate.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002BW\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u0019\u0010'\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002R\u00020(¢\u0006\u0002\u0010+J\u0019\u0010,\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0016R\u00020(¢\u0006\u0002\u0010+J\u0019\u0010-\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002R\u00020(¢\u0006\u0002\u0010+J\u0011\u0010.\u001a\u00020\u0004H\u0002R\u00020(¢\u0006\u0002\u0010/J\u0011\u00100\u001a\u00020\u0004H\u0002R\u00020(¢\u0006\u0002\u0010/J0\u00101\u001a\u00020\u0004*\u0002022!\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u000304H\u0097\u0001JD\u00108\u001a\u000209*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010:\u001a\u0002022!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u000304H\u0096\u0001JD\u0010<\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u000304H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010=J)\u0010>\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010?\u001a\u00020\u0004H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010@JD\u0010A\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000304H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010=R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010$\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegateImpl;", "Lcom/ifriend/presentation/features/profile/header/delegate/ChatHeaderDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "", "resources", "Landroid/content/res/Resources;", "getLevelInfoUseCase", "Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;", "botHaveUpdateUseCase", "Lcom/ifriend/domain/useCases/bot/BotHaveUpdateUseCase;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "userBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "emailConfirmDelegate", "Lcom/ifriend/presentation/features/email/confirm/EmailConfirmDelegateImpl;", "featureToggleRepository", "Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "chatAvatarMapper", "Lcom/ifriend/presentation/features/profile/header/mappers/ChatAvatarMapper;", "generatedChatAvatarInteractor", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;", "(Landroid/content/res/Resources;Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;Lcom/ifriend/domain/useCases/bot/BotHaveUpdateUseCase;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/data/user/UserBalanceRepository;Lcom/ifriend/presentation/features/email/confirm/EmailConfirmDelegateImpl;Lcom/ifriend/domain/data/experiments/FeatureToggleRepository;Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;Lcom/ifriend/presentation/features/profile/header/mappers/ChatAvatarMapper;Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;)V", "chatHeaderState", "Lkotlinx/coroutines/flow/StateFlow;", "getChatHeaderState", "()Lkotlinx/coroutines/flow/StateFlow;", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "getUiStateFlow", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "initBotInfoObserver", "Landroidx/lifecycle/ViewModel;", "chatId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "initChatHeader", "initChatInfoObserver", "initProfileInfoObserver", "(Landroidx/lifecycle/ViewModel;)V", "reloadAvatars", "asyncReduce", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatHeaderDelegateImpl implements ChatHeaderDelegate, UiStateDelegate<ChatHeaderUiState, Unit> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<ChatHeaderUiState, Unit> $$delegate_0;
    private final BotHaveUpdateUseCase botHaveUpdateUseCase;
    private final ChatAvatarMapper chatAvatarMapper;
    private final StateFlow<ChatHeaderUiState> chatHeaderState;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final EmailConfirmDelegateImpl emailConfirmDelegate;
    private final FeatureToggleRepository featureToggleRepository;
    private final GenerateBotAvatarRepository generateBotAvatarRepository;
    private final GeneratedChatAvatarInteractor generatedChatAvatarInteractor;
    private final GetLevelInfoUseCase getLevelInfoUseCase;
    private final Resources resources;
    private final UserBalanceRepository userBalanceRepository;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super ChatHeaderUiState, ? extends ChatHeaderUiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super ChatHeaderUiState, ? extends ChatHeaderUiState> transform) {
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
    public ChatHeaderUiState getUiState(UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<ChatHeaderUiState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate, Function1<? super ChatHeaderUiState, ? extends ChatHeaderUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    /* renamed from: sendEvent  reason: avoid collision after fix types in other method */
    public Object sendEvent2(UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate, Unit unit, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, unit, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate, Function1<? super ChatHeaderUiState, ? extends ChatHeaderUiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    @Inject
    public ChatHeaderDelegateImpl(Resources resources, GetLevelInfoUseCase getLevelInfoUseCase, BotHaveUpdateUseCase botHaveUpdateUseCase, ChatsInfoInteractor chatsInfoInteractor, UserBalanceRepository userBalanceRepository, EmailConfirmDelegateImpl emailConfirmDelegate, FeatureToggleRepository featureToggleRepository, GenerateBotAvatarRepository generateBotAvatarRepository, ChatAvatarMapper chatAvatarMapper, GeneratedChatAvatarInteractor generatedChatAvatarInteractor) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(getLevelInfoUseCase, "getLevelInfoUseCase");
        Intrinsics.checkNotNullParameter(botHaveUpdateUseCase, "botHaveUpdateUseCase");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(userBalanceRepository, "userBalanceRepository");
        Intrinsics.checkNotNullParameter(emailConfirmDelegate, "emailConfirmDelegate");
        Intrinsics.checkNotNullParameter(featureToggleRepository, "featureToggleRepository");
        Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
        Intrinsics.checkNotNullParameter(chatAvatarMapper, "chatAvatarMapper");
        Intrinsics.checkNotNullParameter(generatedChatAvatarInteractor, "generatedChatAvatarInteractor");
        this.resources = resources;
        this.getLevelInfoUseCase = getLevelInfoUseCase;
        this.botHaveUpdateUseCase = botHaveUpdateUseCase;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.userBalanceRepository = userBalanceRepository;
        this.emailConfirmDelegate = emailConfirmDelegate;
        this.featureToggleRepository = featureToggleRepository;
        this.generateBotAvatarRepository = generateBotAvatarRepository;
        this.chatAvatarMapper = chatAvatarMapper;
        this.generatedChatAvatarInteractor = generatedChatAvatarInteractor;
        this.$$delegate_0 = new UiStateDelegateImpl<>(new ChatHeaderUiState(null, null, 0, 0.0f, null, false, null, false, false, false, false, false, 4095, null), 0, null, 6, null);
        this.chatHeaderState = getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public /* bridge */ /* synthetic */ Object sendEvent(UiStateDelegate<ChatHeaderUiState, Unit> uiStateDelegate, Unit unit, Continuation continuation) {
        return sendEvent2(uiStateDelegate, unit, (Continuation<? super Unit>) continuation);
    }

    @Override // com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegate
    public StateFlow<ChatHeaderUiState> getChatHeaderState() {
        return this.chatHeaderState;
    }

    @Override // com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegate
    public void initChatHeader(ViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        initProfileInfoObserver(context_receiver_0);
        initBotInfoObserver(context_receiver_0, chatId);
        initChatInfoObserver(context_receiver_0, chatId);
        reloadAvatars(context_receiver_0);
    }

    private final void initProfileInfoObserver(ViewModel viewModel) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new ChatHeaderDelegateImpl$initProfileInfoObserver$1(this, null), 3, null);
        BuildersKt.launch(ViewModelKt.getViewModelScope(viewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatHeaderDelegateImpl$initProfileInfoObserver$$inlined$collectIn$default$1(this.userBalanceRepository.getBalanceFlow(), null, this));
        BuildersKt.launch(ViewModelKt.getViewModelScope(viewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatHeaderDelegateImpl$initProfileInfoObserver$$inlined$collectIn$default$2(this.emailConfirmDelegate.getEmailConfirmNeededFlow(viewModel), null, this));
    }

    private final void initBotInfoObserver(ViewModel viewModel, String str) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(viewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatHeaderDelegateImpl$initBotInfoObserver$$inlined$collectIn$default$1(this.botHaveUpdateUseCase.haveUpdateFlow(), null, this));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new ChatHeaderDelegateImpl$initBotInfoObserver$2(this, str, null), 3, null);
    }

    private final void initChatInfoObserver(ViewModel viewModel, String str) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(viewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ChatHeaderDelegateImpl$initChatInfoObserver$$inlined$collectIn$default$1(this.chatsInfoInteractor.getChatsInfoFlow(str), null, this));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new ChatHeaderDelegateImpl$initChatInfoObserver$2(this, str, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new ChatHeaderDelegateImpl$initChatInfoObserver$3(this, null), 3, null);
    }

    private final void reloadAvatars(ViewModel viewModel) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new ChatHeaderDelegateImpl$reloadAvatars$1(this, null), 3, null);
    }
}
