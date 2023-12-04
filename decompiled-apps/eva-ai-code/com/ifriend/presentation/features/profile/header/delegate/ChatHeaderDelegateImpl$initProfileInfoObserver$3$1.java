package com.ifriend.presentation.features.profile.header.delegate;

import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatHeaderDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatHeaderDelegateImpl$initProfileInfoObserver$3$1 extends Lambda implements Function1<ChatHeaderUiState, ChatHeaderUiState> {
    final /* synthetic */ boolean $isEmailConfirmNeeded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHeaderDelegateImpl$initProfileInfoObserver$3$1(boolean z) {
        super(1);
        this.$isEmailConfirmNeeded = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatHeaderUiState invoke(ChatHeaderUiState state) {
        ChatHeaderUiState copy;
        Intrinsics.checkNotNullParameter(state, "state");
        copy = state.copy((r26 & 1) != 0 ? state.animatedAvatarState : null, (r26 & 2) != 0 ? state.title : null, (r26 & 4) != 0 ? state.unreadMessagesCount : 0, (r26 & 8) != 0 ? state.lvlProgress : 0.0f, (r26 & 16) != 0 ? state.lvlLabel : null, (r26 & 32) != 0 ? state.isVisibleLvlProgress : false, (r26 & 64) != 0 ? state.balanceLabel : null, (r26 & 128) != 0 ? state.isVisibleBackButton : false, (r26 & 256) != 0 ? state.isVisibleMenuButton : false, (r26 & 512) != 0 ? state.isVisibleMenuIndicator : this.$isEmailConfirmNeeded, (r26 & 1024) != 0 ? state.isVisibleUpdateIndicator : false, (r26 & 2048) != 0 ? state.isVisibleVerified : false);
        return copy;
    }
}
