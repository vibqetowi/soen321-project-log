package com.ifriend.chat.presentation.ui.purchase.premium;

import androidx.lifecycle.ViewModelProvider;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModelFactory;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumFragment$viewModel$2 extends Lambda implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ BuyPremiumFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumFragment$viewModel$2(BuyPremiumFragment buyPremiumFragment) {
        super(0);
        this.this$0 = buyPremiumFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModelProvider.Factory invoke() {
        PurchaseReason purchaseReason;
        UUID requestId;
        PurchaseSource source;
        boolean goToNeurons;
        purchaseReason = this.this$0.getPurchaseReason();
        BuyPremiumViewModelFactory.Factory factory = this.this$0.getFactory();
        requestId = this.this$0.getRequestId();
        source = this.this$0.getSource();
        goToNeurons = this.this$0.getGoToNeurons();
        return factory.create(requestId, source, goToNeurons, purchaseReason);
    }
}
