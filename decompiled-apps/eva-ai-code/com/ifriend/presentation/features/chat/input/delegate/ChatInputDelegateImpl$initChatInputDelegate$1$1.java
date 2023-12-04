package com.ifriend.presentation.features.chat.input.delegate;

import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatInputDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatInputDelegateImpl$initChatInputDelegate$1$1 extends Lambda implements Function1<ChatInputState, ChatInputState> {
    final /* synthetic */ ChatInfo $chatInfo;
    final /* synthetic */ ChatInputDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputDelegateImpl$initChatInputDelegate$1$1(ChatInputDelegateImpl chatInputDelegateImpl, ChatInfo chatInfo) {
        super(1);
        this.this$0 = chatInputDelegateImpl;
        this.$chatInfo = chatInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatInputState invoke(ChatInputState state) {
        ResourceProvider resourceProvider;
        Intrinsics.checkNotNullParameter(state, "state");
        resourceProvider = this.this$0.resources;
        return ChatInputState.copy$default(state, null, resourceProvider.getString(R.string.chat_input__message_placeholder, this.$chatInfo.getName()), false, false, null, 0.0f, 61, null);
    }
}
