package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import com.ifriend.presentation.features.purchases.chatsubscription.subscription.models.ChatSubscriptionOfferUi;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel$updateProducts$2 extends Lambda implements Function1<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.UiState> {
    final /* synthetic */ List<ChatSubscriptionOfferUi> $offersUi;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionViewModel$updateProducts$2(List<ChatSubscriptionOfferUi> list) {
        super(1);
        this.$offersUi = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ChatBuySubscriptionViewModel.UiState invoke(ChatBuySubscriptionViewModel.UiState state) {
        ChatBuySubscriptionViewModel.UiState m6983copypAZo6Ak;
        Intrinsics.checkNotNullParameter(state, "state");
        m6983copypAZo6Ak = state.m6983copypAZo6Ak((r26 & 1) != 0 ? state.isLoading : false, (r26 & 2) != 0 ? state.isPurchased : false, (r26 & 4) != 0 ? state.gradientColor : 0L, (r26 & 8) != 0 ? state.gradientDarkerColor : 0L, (r26 & 16) != 0 ? state.interestsLabels : null, (r26 & 32) != 0 ? state.chatName : null, (r26 & 64) != 0 ? state.screenTitleLabel : null, (r26 & 128) != 0 ? state.screenDescriptionLabel : null, (r26 & 256) != 0 ? state.actionLabel : null, (r26 & 512) != 0 ? state.offers : ExtensionsKt.toImmutableList(this.$offersUi));
        return m6983copypAZo6Ak;
    }
}
