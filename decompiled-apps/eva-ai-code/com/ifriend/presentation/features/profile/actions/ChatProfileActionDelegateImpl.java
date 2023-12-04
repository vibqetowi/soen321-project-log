package com.ifriend.presentation.features.profile.actions;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.useCases.bot.BotHaveUpdateUseCase;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatProfileActionDelegate.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0016R\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\bH\u0016R\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\f\u001a\u00020\bH\u0002R\u00020\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/presentation/features/profile/actions/ChatProfileActionDelegateImpl;", "Lcom/ifriend/presentation/features/profile/actions/ChatProfileActionDelegate;", "botHaveUpdateUseCase", "Lcom/ifriend/domain/useCases/bot/BotHaveUpdateUseCase;", "chatScreenAnalyticsUseCase", "Lcom/ifriend/analytics/usecase/chat/ChatScreenAnalyticsUseCase;", "(Lcom/ifriend/domain/useCases/bot/BotHaveUpdateUseCase;Lcom/ifriend/analytics/usecase/chat/ChatScreenAnalyticsUseCase;)V", "chatAvatarClick", "", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;)V", "chatNameClick", "navigateToBotProfile", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatProfileActionDelegateImpl implements ChatProfileActionDelegate {
    public static final int $stable = 8;
    private final BotHaveUpdateUseCase botHaveUpdateUseCase;
    private final ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase;

    @Inject
    public ChatProfileActionDelegateImpl(BotHaveUpdateUseCase botHaveUpdateUseCase, ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase) {
        Intrinsics.checkNotNullParameter(botHaveUpdateUseCase, "botHaveUpdateUseCase");
        Intrinsics.checkNotNullParameter(chatScreenAnalyticsUseCase, "chatScreenAnalyticsUseCase");
        this.botHaveUpdateUseCase = botHaveUpdateUseCase;
        this.chatScreenAnalyticsUseCase = chatScreenAnalyticsUseCase;
    }

    @Override // com.ifriend.presentation.features.profile.actions.ChatProfileActionDelegate
    public void chatAvatarClick(ChatViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatProfileActionDelegateImpl$chatAvatarClick$1(context_receiver_0, this, null), 3, null);
    }

    @Override // com.ifriend.presentation.features.profile.actions.ChatProfileActionDelegate
    public void chatNameClick(ChatViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatProfileActionDelegateImpl$chatNameClick$1(context_receiver_0, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToBotProfile(ChatViewModel chatViewModel) {
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(chatViewModel), null, null, new ChatProfileActionDelegateImpl$navigateToBotProfile$1(this, chatViewModel, null), 3, null);
    }
}
