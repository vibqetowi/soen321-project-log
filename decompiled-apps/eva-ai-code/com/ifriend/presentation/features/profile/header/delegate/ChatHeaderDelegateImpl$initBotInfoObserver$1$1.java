package com.ifriend.presentation.features.profile.header.delegate;

import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatHeaderDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/profile/header/model/ChatHeaderUiState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatHeaderDelegateImpl$initBotInfoObserver$1$1 extends Lambda implements Function1<ChatHeaderUiState, ChatHeaderUiState> {
    final /* synthetic */ boolean $haveUpdate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHeaderDelegateImpl$initBotInfoObserver$1$1(boolean z) {
        super(1);
        this.$haveUpdate = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatHeaderUiState invoke(ChatHeaderUiState it) {
        ChatHeaderUiState copy;
        Intrinsics.checkNotNullParameter(it, "it");
        copy = it.copy((r26 & 1) != 0 ? it.animatedAvatarState : null, (r26 & 2) != 0 ? it.title : null, (r26 & 4) != 0 ? it.unreadMessagesCount : 0, (r26 & 8) != 0 ? it.lvlProgress : 0.0f, (r26 & 16) != 0 ? it.lvlLabel : null, (r26 & 32) != 0 ? it.isVisibleLvlProgress : false, (r26 & 64) != 0 ? it.balanceLabel : null, (r26 & 128) != 0 ? it.isVisibleBackButton : false, (r26 & 256) != 0 ? it.isVisibleMenuButton : false, (r26 & 512) != 0 ? it.isVisibleMenuIndicator : false, (r26 & 1024) != 0 ? it.isVisibleUpdateIndicator : this.$haveUpdate, (r26 & 2048) != 0 ? it.isVisibleVerified : false);
        return copy;
    }
}
