package com.ifriend.presentation.features.profile.menu.delegate;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.toggle.NeuronsToggleQualifier;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.balance.UserBalance;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.toggle.FeatureToggle;
import com.ifriend.presentation.features.email.confirm.EmailConfirmDelegateImpl;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: ProfileMenuDelegate.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001b\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u00020\u0019¢\u0006\u0002\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u00020\u0019¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ifriend/presentation/features/profile/menu/delegate/ProfileMenuDelegateImpl;", "Lcom/ifriend/presentation/features/profile/menu/delegate/ProfileMenuDelegate;", "neuronsToggle", "Lcom/ifriend/domain/toggle/FeatureToggle;", "userBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "logger", "Lcom/ifriend/common_utils/Logger;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "chatInfoUseCase", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "emailConfirmDelegate", "Lcom/ifriend/presentation/features/email/confirm/EmailConfirmDelegateImpl;", "(Lcom/ifriend/domain/toggle/FeatureToggle;Lcom/ifriend/domain/data/user/UserBalanceRepository;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/presentation/features/email/confirm/EmailConfirmDelegateImpl;)V", "profileMenuState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/profile/menu/model/ProfileMenuUiState;", "getProfileMenuState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "hideProfileMenu", "", "initProfileMenuDelegate", "Landroidx/lifecycle/ViewModel;", "chatId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "setupEditBotItem", "showProfileMenu", "updateState", "isNeuronsFeatureEnabled", "", "balance", "Lcom/ifriend/domain/logic/balance/UserBalance;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileMenuDelegateImpl implements ProfileMenuDelegate {
    public static final int $stable = 8;
    private final ChatsInfoInteractor chatInfoUseCase;
    private final EmailConfirmDelegateImpl emailConfirmDelegate;
    private final Logger logger;
    private final FeatureToggle neuronsToggle;
    private final StateFlow<ProfileMenuUiState> profileMenuState;
    private final MutableStateFlow<ProfileMenuUiState> state;
    private final UserBalanceRepository userBalanceRepository;
    private final UserRepository userRepository;

    @Inject
    public ProfileMenuDelegateImpl(@NeuronsToggleQualifier FeatureToggle neuronsToggle, UserBalanceRepository userBalanceRepository, Logger logger, UserRepository userRepository, ChatsInfoInteractor chatInfoUseCase, EmailConfirmDelegateImpl emailConfirmDelegate) {
        Intrinsics.checkNotNullParameter(neuronsToggle, "neuronsToggle");
        Intrinsics.checkNotNullParameter(userBalanceRepository, "userBalanceRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatInfoUseCase, "chatInfoUseCase");
        Intrinsics.checkNotNullParameter(emailConfirmDelegate, "emailConfirmDelegate");
        this.neuronsToggle = neuronsToggle;
        this.userBalanceRepository = userBalanceRepository;
        this.logger = logger;
        this.userRepository = userRepository;
        this.chatInfoUseCase = chatInfoUseCase;
        this.emailConfirmDelegate = emailConfirmDelegate;
        MutableStateFlow<ProfileMenuUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new ProfileMenuUiState(false, false, false, false, false, null, null, 127, null));
        this.state = MutableStateFlow;
        this.profileMenuState = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public StateFlow<ProfileMenuUiState> getProfileMenuState() {
        return this.profileMenuState;
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public void initProfileMenuDelegate(ViewModel context_receiver_0, String str) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), Dispatchers.getIO(), null, new ProfileMenuDelegateImpl$initProfileMenuDelegate$1(this, null), 2, null);
        BuildersKt.launch(ViewModelKt.getViewModelScope(context_receiver_0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ProfileMenuDelegateImpl$initProfileMenuDelegate$$inlined$collectIn$default$1(this.userRepository.getUser(), null, this));
        BuildersKt.launch(ViewModelKt.getViewModelScope(context_receiver_0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ProfileMenuDelegateImpl$initProfileMenuDelegate$$inlined$collectIn$default$2(this.emailConfirmDelegate.getEmailConfirmNeededFlow(context_receiver_0), null, this));
        setupEditBotItem(context_receiver_0, str);
    }

    private final void setupEditBotItem(ViewModel viewModel, String str) {
        ProfileMenuUiState value;
        if (str != null) {
            BuildersKt.launch(ViewModelKt.getViewModelScope(viewModel), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new ProfileMenuDelegateImpl$setupEditBotItem$$inlined$collectIn$default$1(this.chatInfoUseCase.getChatsInfoFlow(str), null, this));
            return;
        }
        MutableStateFlow<ProfileMenuUiState> mutableStateFlow = this.state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ProfileMenuUiState.copy$default(value, false, false, false, false, false, null, null, 111, null)));
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public void showProfileMenu() {
        ProfileMenuUiState value;
        MutableStateFlow<ProfileMenuUiState> mutableStateFlow = this.state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ProfileMenuUiState.copy$default(value, true, false, false, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
    }

    @Override // com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegate
    public void hideProfileMenu() {
        ProfileMenuUiState value;
        MutableStateFlow<ProfileMenuUiState> mutableStateFlow = this.state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ProfileMenuUiState.copy$default(value, false, false, false, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(boolean z, UserBalance userBalance) {
        ProfileMenuUiState value;
        MutableStateFlow<ProfileMenuUiState> mutableStateFlow = this.state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ProfileMenuUiState.copy$default(value, false, false, z, false, false, null, String.valueOf(userBalance.getNeurons()), 59, null)));
    }
}
