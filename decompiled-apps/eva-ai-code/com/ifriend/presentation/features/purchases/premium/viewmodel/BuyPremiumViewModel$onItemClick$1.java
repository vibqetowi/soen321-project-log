package com.ifriend.presentation.features.purchases.premium.viewmodel;

import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiParams;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumViewModel$onItemClick$1 extends Lambda implements Function1<BuyPremiumViewModel.UiState, BuyPremiumViewModel.UiState> {
    final /* synthetic */ BuyPremiumPlanUiParams $item;
    final /* synthetic */ BuyPremiumViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumViewModel$onItemClick$1(BuyPremiumViewModel buyPremiumViewModel, BuyPremiumPlanUiParams buyPremiumPlanUiParams) {
        super(1);
        this.this$0 = buyPremiumViewModel;
        this.$item = buyPremiumPlanUiParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BuyPremiumViewModel.UiState invoke(BuyPremiumViewModel.UiState state) {
        BuyPremiumPlanUiParams copy;
        Intrinsics.checkNotNullParameter(state, "state");
        this.this$0.updateActionLabel(this.$item);
        ImmutableList<BuyPremiumPlanUiParams> items = state.getItems();
        BuyPremiumPlanUiParams buyPremiumPlanUiParams = this.$item;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        for (BuyPremiumPlanUiParams buyPremiumPlanUiParams2 : items) {
            copy = buyPremiumPlanUiParams2.copy((r18 & 1) != 0 ? buyPremiumPlanUiParams2.id : null, (r18 & 2) != 0 ? buyPremiumPlanUiParams2.sku : null, (r18 & 4) != 0 ? buyPremiumPlanUiParams2.durationTitle : null, (r18 & 8) != 0 ? buyPremiumPlanUiParams2.durationSubtitle : null, (r18 & 16) != 0 ? buyPremiumPlanUiParams2.monthPriceLabel : null, (r18 & 32) != 0 ? buyPremiumPlanUiParams2.priceLabel : null, (r18 & 64) != 0 ? buyPremiumPlanUiParams2.saveLabel : null, (r18 & 128) != 0 ? buyPremiumPlanUiParams2.isSelected : Intrinsics.areEqual(buyPremiumPlanUiParams2.getSku(), buyPremiumPlanUiParams.getSku()));
            arrayList.add(copy);
        }
        return BuyPremiumViewModel.UiState.copy$default(state, null, null, null, ExtensionsKt.toImmutableList(arrayList), false, false, null, 119, null);
    }
}
