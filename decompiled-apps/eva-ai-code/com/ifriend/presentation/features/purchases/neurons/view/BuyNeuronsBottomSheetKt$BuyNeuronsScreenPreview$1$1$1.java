package com.ifriend.presentation.features.purchases.neurons.view;

import androidx.compose.runtime.MutableState;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "clicked", "Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetKt$BuyNeuronsScreenPreview$1$1$1 extends Lambda implements Function1<BuyNeuronsProductUiParams, Unit> {
    final /* synthetic */ MutableState<PersistentList<BuyNeuronsProductUiParams>> $items$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetKt$BuyNeuronsScreenPreview$1$1$1(MutableState<PersistentList<BuyNeuronsProductUiParams>> mutableState) {
        super(1);
        this.$items$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BuyNeuronsProductUiParams buyNeuronsProductUiParams) {
        invoke2(buyNeuronsProductUiParams);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BuyNeuronsProductUiParams clicked) {
        PersistentList BuyNeuronsScreenPreview$lambda$13$lambda$10;
        Intrinsics.checkNotNullParameter(clicked, "clicked");
        MutableState<PersistentList<BuyNeuronsProductUiParams>> mutableState = this.$items$delegate;
        BuyNeuronsScreenPreview$lambda$13$lambda$10 = BuyNeuronsBottomSheetKt.BuyNeuronsScreenPreview$lambda$13$lambda$10(mutableState);
        PersistentList<BuyNeuronsProductUiParams> persistentList = BuyNeuronsScreenPreview$lambda$13$lambda$10;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(persistentList, 10));
        for (BuyNeuronsProductUiParams buyNeuronsProductUiParams : persistentList) {
            arrayList.add(BuyNeuronsProductUiParams.copy$default(buyNeuronsProductUiParams, null, 0, null, null, false, Intrinsics.areEqual(buyNeuronsProductUiParams, clicked), 31, null));
        }
        mutableState.setValue(ExtensionsKt.toPersistentList(arrayList));
    }
}
