package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "uiState", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel$buyProductSuccessful$2 extends Lambda implements Function1<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.UiState> {
    public static final ChatBuySubscriptionViewModel$buyProductSuccessful$2 INSTANCE = new ChatBuySubscriptionViewModel$buyProductSuccessful$2();

    ChatBuySubscriptionViewModel$buyProductSuccessful$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatBuySubscriptionViewModel.UiState invoke(ChatBuySubscriptionViewModel.UiState uiState) {
        ChatBuySubscriptionViewModel.UiState m6983copypAZo6Ak;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        m6983copypAZo6Ak = uiState.m6983copypAZo6Ak((r26 & 1) != 0 ? uiState.isLoading : false, (r26 & 2) != 0 ? uiState.isPurchased : false, (r26 & 4) != 0 ? uiState.gradientColor : 0L, (r26 & 8) != 0 ? uiState.gradientDarkerColor : 0L, (r26 & 16) != 0 ? uiState.interestsLabels : null, (r26 & 32) != 0 ? uiState.chatName : null, (r26 & 64) != 0 ? uiState.screenTitleLabel : null, (r26 & 128) != 0 ? uiState.screenDescriptionLabel : null, (r26 & 256) != 0 ? uiState.actionLabel : null, (r26 & 512) != 0 ? uiState.offers : null);
        return m6983copypAZo6Ak;
    }
}
