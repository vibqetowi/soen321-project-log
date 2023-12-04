package com.ifriend.presentation.features.home.delegates;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.domain.logic.chat.chats.GetUnavailableChatsUseCase;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.presentation.features.home.mappers.ChatUnlockLabelMapperUi;
import com.ifriend.presentation.features.home.mappers.HomeActiveChatMapper;
import com.ifriend.presentation.features.home.mappers.HomeUnavailableChatMapper;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeChatsDelegate.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0014H\u0016R\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0014H\u0002R\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0018\u001a\u00020\u0014H\u0002R\u00020\u0015¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ifriend/presentation/features/home/delegates/HomeChatsDelegateImpl;", "Lcom/ifriend/presentation/features/home/delegates/HomeChatsDelegate;", "activeChatMapper", "Lcom/ifriend/presentation/features/home/mappers/HomeActiveChatMapper;", "unavailableChatMapper", "Lcom/ifriend/presentation/features/home/mappers/HomeUnavailableChatMapper;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "getUnavailableChatsUseCase", "Lcom/ifriend/domain/logic/chat/chats/GetUnavailableChatsUseCase;", "chatUnlockLabelMapper", "Lcom/ifriend/presentation/features/home/mappers/ChatUnlockLabelMapperUi;", "generatedChatAvatarInteractor", "Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;", "(Lcom/ifriend/presentation/features/home/mappers/HomeActiveChatMapper;Lcom/ifriend/presentation/features/home/mappers/HomeUnavailableChatMapper;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/logic/chat/chats/GetUnavailableChatsUseCase;Lcom/ifriend/presentation/features/home/mappers/ChatUnlockLabelMapperUi;Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatarInteractor;)V", "initChatConnections", "", "Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel;", "(Lcom/ifriend/presentation/features/home/viewmodel/HomeViewModel;)V", "subscribeOnAvailableChats", "subscribeOnUnavailableChats", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeChatsDelegateImpl implements HomeChatsDelegate {
    public static final int $stable = 8;
    private final HomeActiveChatMapper activeChatMapper;
    private final ChatClientInteractor chatClientInteractor;
    private final ChatUnlockLabelMapperUi chatUnlockLabelMapper;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DispatcherProvider dispatcherProvider;
    private final GeneratedChatAvatarInteractor generatedChatAvatarInteractor;
    private final GetUnavailableChatsUseCase getUnavailableChatsUseCase;
    private final HomeUnavailableChatMapper unavailableChatMapper;

    @Inject
    public HomeChatsDelegateImpl(HomeActiveChatMapper activeChatMapper, HomeUnavailableChatMapper unavailableChatMapper, ChatsInfoInteractor chatsInfoInteractor, ChatClientInteractor chatClientInteractor, DispatcherProvider dispatcherProvider, GetUnavailableChatsUseCase getUnavailableChatsUseCase, ChatUnlockLabelMapperUi chatUnlockLabelMapper, GeneratedChatAvatarInteractor generatedChatAvatarInteractor) {
        Intrinsics.checkNotNullParameter(activeChatMapper, "activeChatMapper");
        Intrinsics.checkNotNullParameter(unavailableChatMapper, "unavailableChatMapper");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(getUnavailableChatsUseCase, "getUnavailableChatsUseCase");
        Intrinsics.checkNotNullParameter(chatUnlockLabelMapper, "chatUnlockLabelMapper");
        Intrinsics.checkNotNullParameter(generatedChatAvatarInteractor, "generatedChatAvatarInteractor");
        this.activeChatMapper = activeChatMapper;
        this.unavailableChatMapper = unavailableChatMapper;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.chatClientInteractor = chatClientInteractor;
        this.dispatcherProvider = dispatcherProvider;
        this.getUnavailableChatsUseCase = getUnavailableChatsUseCase;
        this.chatUnlockLabelMapper = chatUnlockLabelMapper;
        this.generatedChatAvatarInteractor = generatedChatAvatarInteractor;
    }

    @Override // com.ifriend.presentation.features.home.delegates.HomeChatsDelegate
    public void initChatConnections(HomeViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        subscribeOnAvailableChats(context_receiver_0);
        subscribeOnUnavailableChats(context_receiver_0);
    }

    private final void subscribeOnAvailableChats(HomeViewModel homeViewModel) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(homeViewModel), null, null, new HomeChatsDelegateImpl$subscribeOnAvailableChats$1(this, homeViewModel, null), 3, null);
    }

    private final void subscribeOnUnavailableChats(HomeViewModel homeViewModel) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(homeViewModel), null, null, new HomeChatsDelegateImpl$subscribeOnUnavailableChats$1(this, homeViewModel, null), 3, null);
    }
}
