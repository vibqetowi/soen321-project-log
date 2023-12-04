package com.ifriend.presentation.features.chat.panel.delegate;

import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chat.panel.models.TopicPopupDataUi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatPanelActionsDelegateImpl$showPopup$2 extends Lambda implements Function1<ChatTopicsUiState, ChatTopicsUiState> {
    final /* synthetic */ TopicPopupDataUi $popup;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$showPopup$2(TopicPopupDataUi topicPopupDataUi) {
        super(1);
        this.$popup = topicPopupDataUi;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatTopicsUiState invoke(ChatTopicsUiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return ChatTopicsUiState.copy$default(state, null, false, this.$popup, true, false, false, 35, null);
    }
}
