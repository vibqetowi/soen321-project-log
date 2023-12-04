package com.ifriend.presentation.features.purchases.premium.viewmodel;

import com.ifriend.domain.models.profile.user.User;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$UiState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumViewModel$2$1$emit$2 extends Lambda implements Function1<BuyPremiumViewModel.UiState, BuyPremiumViewModel.UiState> {
    final /* synthetic */ User $user;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumViewModel$2$1$emit$2(User user) {
        super(1);
        this.$user = user;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BuyPremiumViewModel.UiState invoke(BuyPremiumViewModel.UiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = this.$user.getName();
        if (name == null) {
            name = "";
        }
        return BuyPremiumViewModel.UiState.copy$default(it, name, null, null, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }
}
