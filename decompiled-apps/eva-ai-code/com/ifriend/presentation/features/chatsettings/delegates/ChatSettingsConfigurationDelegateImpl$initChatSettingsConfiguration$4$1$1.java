package com.ifriend.presentation.features.chatsettings.delegates;

import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatSettingsConfigurationDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4$1$1 extends Lambda implements Function1<ChatSettingsViewModel.UiState, ChatSettingsViewModel.UiState> {
    final /* synthetic */ boolean $isShowSubscriptionState;
    final /* synthetic */ String $subscriptionStateLabel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSettingsConfigurationDelegateImpl$initChatSettingsConfiguration$4$1$1(String str, boolean z) {
        super(1);
        this.$subscriptionStateLabel = str;
        this.$isShowSubscriptionState = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatSettingsViewModel.UiState invoke(ChatSettingsViewModel.UiState state) {
        ChatSettingsViewModel.UiState copy;
        Intrinsics.checkNotNullParameter(state, "state");
        copy = state.copy((r24 & 1) != 0 ? state.lvlProgress : 0.0f, (r24 & 2) != 0 ? state.lvlLabel : null, (r24 & 4) != 0 ? state.isVisibleLvlProgress : false, (r24 & 8) != 0 ? state.name : null, (r24 & 16) != 0 ? state.avatarUrl : null, (r24 & 32) != 0 ? state.description : null, (r24 & 64) != 0 ? state.isVerified : false, (r24 & 128) != 0 ? state.interests : null, (r24 & 256) != 0 ? state.actionTags : null, (r24 & 512) != 0 ? state.subscriptionStateLabel : this.$subscriptionStateLabel, (r24 & 1024) != 0 ? state.isShowSubscriptionState : this.$isShowSubscriptionState);
        return copy;
    }
}
