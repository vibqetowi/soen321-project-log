package com.ifriend.presentation.features.chat.actions;

import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionState;
import com.ifriend.presentation.features.chat.actions.ChatPaidActionsDelegateImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatPaidActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/actions/ChatPaidActionsDelegateImpl$PaidActionsUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatPaidActionsDelegateImpl$initChatPaidActions$4$1$1 extends Lambda implements Function1<ChatPaidActionsDelegateImpl.PaidActionsUiState, ChatPaidActionsDelegateImpl.PaidActionsUiState> {
    final /* synthetic */ ChatSubscriptionState $subscriptionState;
    final /* synthetic */ ChatPaidActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPaidActionsDelegateImpl$initChatPaidActions$4$1$1(ChatPaidActionsDelegateImpl chatPaidActionsDelegateImpl, ChatSubscriptionState chatSubscriptionState) {
        super(1);
        this.this$0 = chatPaidActionsDelegateImpl;
        this.$subscriptionState = chatSubscriptionState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatPaidActionsDelegateImpl.PaidActionsUiState invoke(ChatPaidActionsDelegateImpl.PaidActionsUiState state) {
        boolean isAvailableChatting;
        Intrinsics.checkNotNullParameter(state, "state");
        isAvailableChatting = this.this$0.isAvailableChatting(this.$subscriptionState);
        return ChatPaidActionsDelegateImpl.PaidActionsUiState.copy$default(state, null, isAvailableChatting, 1, null);
    }
}
