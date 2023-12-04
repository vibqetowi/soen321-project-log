package com.ifriend.presentation.features.chat.photo.delegate;

import com.ifriend.presentation.features.chat.message.ChatMessageAccessUiState;
import com.ifriend.presentation.features.chat.photo.ui.ChatPhotoUiState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatPhotoDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/photo/ui/ChatPhotoUiState;", "uiState", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatPhotoDelegateImpl$initChatPhotoDelegate$1$1 extends Lambda implements Function1<ChatPhotoUiState, ChatPhotoUiState> {
    final /* synthetic */ ChatMessageAccessUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPhotoDelegateImpl$initChatPhotoDelegate$1$1(ChatMessageAccessUiState chatMessageAccessUiState) {
        super(1);
        this.$state = chatMessageAccessUiState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatPhotoUiState invoke(ChatPhotoUiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        return ChatPhotoUiState.copy$default(uiState, null, false, this.$state.isLoading(), 3, null);
    }
}
