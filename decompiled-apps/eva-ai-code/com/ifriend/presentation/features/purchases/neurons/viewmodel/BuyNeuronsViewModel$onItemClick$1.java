package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsViewModel$onItemClick$1 extends Lambda implements Function1<BuyNeuronsViewModel.UiState, BuyNeuronsViewModel.UiState> {
    final /* synthetic */ BuyNeuronsProductUiParams $item;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsViewModel$onItemClick$1(BuyNeuronsProductUiParams buyNeuronsProductUiParams) {
        super(1);
        this.$item = buyNeuronsProductUiParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final BuyNeuronsViewModel.UiState invoke(BuyNeuronsViewModel.UiState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ImmutableList<BuyNeuronsProductUiParams> products = state.getProducts();
        BuyNeuronsProductUiParams buyNeuronsProductUiParams = this.$item;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(products, 10));
        for (BuyNeuronsProductUiParams buyNeuronsProductUiParams2 : products) {
            arrayList.add(BuyNeuronsProductUiParams.copy$default(buyNeuronsProductUiParams2, null, 0, null, null, false, Intrinsics.areEqual(buyNeuronsProductUiParams2.getProductId(), buyNeuronsProductUiParams.getProductId()), 31, null));
        }
        return BuyNeuronsViewModel.UiState.copy$default(state, ExtensionsKt.toImmutableList(arrayList), false, null, 6, null);
    }
}
