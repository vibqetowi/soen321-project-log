package com.ifriend.presentation.features.chat.screen.viewmodel;

import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatViewModel$3$1 extends Lambda implements Function1<ChatViewModel.UiState, ChatViewModel.UiState> {
    final /* synthetic */ ChatInfo $chat;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$3$1(ChatInfo chatInfo) {
        super(1);
        this.$chat = chatInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatViewModel.UiState invoke(ChatViewModel.UiState it) {
        ChatViewModel.UiState m6924copyfWhpE4E;
        Intrinsics.checkNotNullParameter(it, "it");
        m6924copyfWhpE4E = it.m6924copyfWhpE4E((r22 & 1) != 0 ? it.isLoading : false, (r22 & 2) != 0 ? it.animatedBgState : null, (r22 & 4) != 0 ? it.imageBgState : null, (r22 & 8) != 0 ? it.gradientColor : 0L, (r22 & 16) != 0 ? it.chatName : null, (r22 & 32) != 0 ? it.isVerified : false, (r22 & 64) != 0 ? it.isShowSubscriptionState : false, (r22 & 128) != 0 ? it.subscriptionStateLabel : null, (r22 & 256) != 0 ? it.chatInfo : this.$chat);
        return m6924copyfWhpE4E;
    }
}
