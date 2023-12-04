package com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel;

import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatActiveSubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/activesubscription/viewmodel/ChatActiveSubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatActiveSubscriptionViewModel$1$2$1$emit$2 extends Lambda implements Function1<ChatActiveSubscriptionViewModel.UiState, ChatActiveSubscriptionViewModel.UiState> {
    final /* synthetic */ String $screenTitle;
    final /* synthetic */ String $subscriptionActivated;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActiveSubscriptionViewModel$1$2$1$emit$2(String str, String str2) {
        super(1);
        this.$screenTitle = str;
        this.$subscriptionActivated = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatActiveSubscriptionViewModel.UiState invoke(ChatActiveSubscriptionViewModel.UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return ChatActiveSubscriptionViewModel.UiState.m6953copyjzV_Hc0$default(state, false, null, this.$screenTitle, this.$subscriptionActivated, 0L, null, 51, null);
    }
}
