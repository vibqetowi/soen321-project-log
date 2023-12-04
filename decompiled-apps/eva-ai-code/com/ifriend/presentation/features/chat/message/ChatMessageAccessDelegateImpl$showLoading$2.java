package com.ifriend.presentation.features.chat.message;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatMessageAccessDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/message/ChatMessageAccessUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatMessageAccessDelegateImpl$showLoading$2 extends Lambda implements Function1<ChatMessageAccessUiState, ChatMessageAccessUiState> {
    public static final ChatMessageAccessDelegateImpl$showLoading$2 INSTANCE = new ChatMessageAccessDelegateImpl$showLoading$2();

    ChatMessageAccessDelegateImpl$showLoading$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatMessageAccessUiState invoke(ChatMessageAccessUiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state.copy(true);
    }
}
