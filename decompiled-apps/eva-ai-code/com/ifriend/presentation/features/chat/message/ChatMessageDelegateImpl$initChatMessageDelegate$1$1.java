package com.ifriend.presentation.features.chat.message;

import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatMessageDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "uiState", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatMessageDelegateImpl$initChatMessageDelegate$1$1 extends Lambda implements Function1<ChatViewModel.UiState, ChatViewModel.UiState> {
    final /* synthetic */ ChatMessageAccessUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageDelegateImpl$initChatMessageDelegate$1$1(ChatMessageAccessUiState chatMessageAccessUiState) {
        super(1);
        this.$state = chatMessageAccessUiState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatViewModel.UiState invoke(ChatViewModel.UiState uiState) {
        ChatViewModel.UiState m6924copyfWhpE4E;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        m6924copyfWhpE4E = uiState.m6924copyfWhpE4E((r22 & 1) != 0 ? uiState.isLoading : this.$state.isLoading(), (r22 & 2) != 0 ? uiState.animatedBgState : null, (r22 & 4) != 0 ? uiState.imageBgState : null, (r22 & 8) != 0 ? uiState.gradientColor : 0L, (r22 & 16) != 0 ? uiState.chatName : null, (r22 & 32) != 0 ? uiState.isVerified : false, (r22 & 64) != 0 ? uiState.isShowSubscriptionState : false, (r22 & 128) != 0 ? uiState.subscriptionStateLabel : null, (r22 & 256) != 0 ? uiState.chatInfo : null);
        return m6924copyfWhpE4E;
    }
}
