package com.ifriend.presentation.features.chat.background.delegate;

import com.ifriend.animatedBackground.AnimatedBackgroundView;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatBackgroundDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatBackgroundDelegateImpl$updateChatBackground$2 extends Lambda implements Function1<ChatViewModel.UiState, ChatViewModel.UiState> {
    final /* synthetic */ ChatBackground $background;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundDelegateImpl$updateChatBackground$2(ChatBackground chatBackground) {
        super(1);
        this.$background = chatBackground;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatViewModel.UiState invoke(ChatViewModel.UiState state) {
        ChatViewModel.UiState m6924copyfWhpE4E;
        Intrinsics.checkNotNullParameter(state, "state");
        m6924copyfWhpE4E = state.m6924copyfWhpE4E((r22 & 1) != 0 ? state.isLoading : false, (r22 & 2) != 0 ? state.animatedBgState : new AnimatedBackgroundView.State.Video(this.$background.getUri(), this.$background.getLoop()), (r22 & 4) != 0 ? state.imageBgState : null, (r22 & 8) != 0 ? state.gradientColor : 0L, (r22 & 16) != 0 ? state.chatName : null, (r22 & 32) != 0 ? state.isVerified : false, (r22 & 64) != 0 ? state.isShowSubscriptionState : false, (r22 & 128) != 0 ? state.subscriptionStateLabel : null, (r22 & 256) != 0 ? state.chatInfo : null);
        return m6924copyfWhpE4E;
    }
}
