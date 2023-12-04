package com.ifriend.chat.presentation.ui.purchase.neurons;

import androidx.lifecycle.ViewModelProvider;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModelFactory;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetDialogFragment$viewModel$2 extends Lambda implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ BuyNeuronsBottomSheetDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetDialogFragment$viewModel$2(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment) {
        super(0);
        this.this$0 = buyNeuronsBottomSheetDialogFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModelProvider.Factory invoke() {
        PurchaseSource source;
        UUID requestId;
        boolean goToUpgrade;
        PurchaseReason purchaseReason;
        BuyNeuronsViewModelFactory.Factory viewModelFactory = this.this$0.getViewModelFactory();
        source = this.this$0.getSource();
        requestId = this.this$0.getRequestId();
        goToUpgrade = this.this$0.getGoToUpgrade();
        purchaseReason = this.this$0.getPurchaseReason();
        return viewModelFactory.create(requestId, source, goToUpgrade, purchaseReason);
    }
}
