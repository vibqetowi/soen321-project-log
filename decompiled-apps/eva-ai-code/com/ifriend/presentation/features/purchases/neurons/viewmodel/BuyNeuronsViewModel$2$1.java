package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyNeuronsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModel$UiState;", "uiState", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyNeuronsViewModel$2$1 extends Lambda implements Function1<BuyNeuronsViewModel.UiState, BuyNeuronsViewModel.UiState> {
    public static final BuyNeuronsViewModel$2$1 INSTANCE = new BuyNeuronsViewModel$2$1();

    BuyNeuronsViewModel$2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final BuyNeuronsViewModel.UiState invoke(BuyNeuronsViewModel.UiState uiState) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        return BuyNeuronsViewModel.UiState.copy$default(uiState, null, false, null, 5, null);
    }
}
